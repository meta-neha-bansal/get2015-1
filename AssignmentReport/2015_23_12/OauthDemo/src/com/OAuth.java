package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**************************************************************************
 * Description : Servlet implementation class OAuth extending HttpServlet, it
 * manages google authentication for email verification
 ***************************************************************************/
@WebServlet("/OAuth")
public class OAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OAuth() {
		super();

	}

	/**************************************************************************
	 * This method will get code generated from google on allow or deny.if code
	 * will null then redirect to index page otherwise redirect to either home
	 * page or profile page
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 ***************************************************************************/
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			// get code
			String code = request.getParameter("code");
			// if code generated from google is null then redirect the user to index jsp page
			if (code == null) {

				request.setAttribute("message",
						"Please click allow so that we can verify your email.");
				request.getRequestDispatcher("index.jsp").forward(request,
						response);
				;
			}
			// format url parameters to post
			String urlParameters = "code="
					+ code
					+ "&client_id=932394253997-rnl28nuvo1prju48i0fnj1003edgo37k.apps.googleusercontent.com"
					+ "&client_secret=AHNq3xBBHx1YtKjDKj24xINb"
					+ "&redirect_uri=http://localhost:8080/OauthDemo/OAuth"
					+ "&grant_type=authorization_code";
			// post parameters
			URL url = new URL("https://accounts.google.com/o/oauth2/token");
			URLConnection urlConn = url.openConnection();
			urlConn.setDoOutput(true);
			System.out.println("in oauth");
			OutputStreamWriter writer = new OutputStreamWriter(
					urlConn.getOutputStream());
			writer.write(urlParameters);
			writer.flush();
			String line, outputString = "";
			// get output in outputString
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					urlConn.getInputStream()));
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}
			
			System.out.println("Output String"+ outputString);
			
			
			// converting output string to JSON object
			JsonObject json = (JsonObject) new JsonParser().parse(outputString);
			// get Access Token from JSON object
			String access_token = json.get("access_token").getAsString();
			// get User Info from google
			System.out.println("Access token value" + access_token);
			
			url = new URL(
					"https://www.googleapis.com/oauth2/v1/userinfo?access_token="
							+ access_token);
			urlConn = url.openConnection();
			outputString = "";
			// converting User Info retrieved from google to JSON object
			reader = new BufferedReader(new InputStreamReader(
					urlConn.getInputStream()));
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}
			
			System.out.println("values stored in access token " + outputString);
			
			
		} catch (MalformedURLException e) {
			System.out.println(e);
			request.setAttribute("message", "Authentication error");
			request.getRequestDispatcher("./exception/error.jsp").forward(request, response);
		} catch (ProtocolException e) {
			System.out.println(e);
			request.setAttribute("message", "Authentication error");
			request.getRequestDispatcher("./exception/error.jsp").forward(request, response);
		} catch (IOException e) {
			System.out.println(e);
			request.setAttribute("message", "Authentication error");
			request.getRequestDispatcher("./exception/error.jsp").forward(request, response);
		}
		
		}
}