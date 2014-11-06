package graphene.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataFormatConstants {
	public static final String DATE_FORMAT_STRING = "yyyy-MM-dd";
	public static final String ISO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final String MONEY_FORMAT_STRING = "###,###,##0.00";
	public static final String WHOLE_NUMBER_FORMAT_STRING = "###########";
	public static final String DATE_FORMAT_STRING2 = "dd/MM/yyyy"; //an alternative format we've encountered.
	private static Logger logger = LoggerFactory
			.getLogger(DataFormatConstants.class);

	public static String reformatDate(String formatYouThinkItIsIn,
			String toFormat) {
		try {
			return new SimpleDateFormat(DataFormatConstants.DATE_FORMAT_STRING)
					.format(new SimpleDateFormat(formatYouThinkItIsIn)
							.parse(toFormat));
		} catch (ParseException e) {
			logger.error("Could not reformate the date identifier " + toFormat
					+ " with format " + formatYouThinkItIsIn);
			return toFormat;
		}
	}
}
