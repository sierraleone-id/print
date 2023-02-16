package io.mosip.print.constant;

import io.mosip.print.exception.PlatformConstants;

/**
 *
 * @author M1048399 Horteppa
 * 
 */
public enum PlatformSuccessMessages {

	// RPR_PUM_PACKET_UPLOADER(PlatformConstants.RPR_PACKET_UPLOADER_MODULE + "000",
	// "Packet uploaded to file system"),

	RPR_PUM_PACKET_ARCHIVED(PlatformConstants.PRT_PRINT_PREFIX + "001", "Packet successfully archived"),


	RPR_PRINT_SERVICE_SUCCESS(PlatformConstants.PRT_PRINT_PREFIX + "002", "Pdf generated and sent to print stage");

	/** The success message. */
	private final String successMessage;

	/** The success code. */
	private final String successCode;

	/**
	 * Instantiates a new platform success messages.
	 *
	 * @param errorCode
	 *            the error code
	 * @param errorMsg
	 *            the error msg
	 */
	private PlatformSuccessMessages(String errorCode, String errorMsg) {
		this.successCode = errorCode;
		this.successMessage = errorMsg;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return this.successMessage;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return this.successCode;
	}

}
