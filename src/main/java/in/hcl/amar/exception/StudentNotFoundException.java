package in.hcl.amar.exception;

public class StudentNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7053837693722612134L;

	public StudentNotFoundException () {
		super();
	}
	public StudentNotFoundException (String msg) {
		super(msg);
	}
}
