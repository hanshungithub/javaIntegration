package cn.hassan.site.common.exception;

public class BaseException extends Exception {

	private String message;

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
