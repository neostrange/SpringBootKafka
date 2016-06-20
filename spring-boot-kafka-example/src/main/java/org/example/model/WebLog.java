package org.example.model;

/**
 * The Class WebLog.
 */
public class WebLog {

	/**
	 * HTTP request header.
	 */
	private String request;

	/**
	 * HTTP response header.
	 */
	private String response;

	/**
	 * Default constructor.
	 */
	public WebLog() {
		super();
	}

	/**
	 * Constructor with fields.
	 * @param request
	 * @param response
     */
	public WebLog(String request, String response) {
		super();
		this.request = request;
		this.response = response;
	}

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
