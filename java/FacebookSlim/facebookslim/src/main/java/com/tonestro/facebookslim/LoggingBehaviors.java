package com.tonestro.facebookslim;

/**
 * Specifies different categories of logging messages that can be generated.
 *
 * see FacebookSdk.addLoggingBehavior
 */
public class LoggingBehaviors {

    private LoggingBehaviors() {
        // nothing to do
    }

    /**
     * Indicates that HTTP requests and a summary of responses should be logged.
     */
    public static final String REQUESTS = "REQUESTS";

    /**
     * Indicates that access tokens should be logged as part of the request logging; normally they are
     * not.
     */
    public static final String INCLUDE_ACCESS_TOKENS = "INCLUDE_ACCESS_TOKENS";

    /**
     * Indicates that the entire raw HTTP response for each request should be logged.
     */
    public static final String INCLUDE_RAW_RESPONSES = "INCLUDE_RAW_RESPONSES";

    /**
     * Indicates that cache operations should be logged.
     */
    public static final String CACHE = "CACHE";

    /**
     * Indicates the App Events-related operations should be logged.
     */
    public static final String APP_EVENTS = "APP_EVENTS";

    /**
     * Indicates that likely developer errors should be logged. (This is set by default in
     * LoggingBehavior.)
     */
    public static final String DEVELOPER_ERRORS = "DEVELOPER_ERRORS";

    /**
     * Log debug warnings from API response, e.g. when friends fields requested, but user_friends
     * permission isn't granted.
     */
    public static final String GRAPH_API_DEBUG_WARNING = "GRAPH_API_DEBUG_WARNING";

    /**
     * Log warnings from API response, e.g. when requested feature will be deprecated in next version
     * of API. Info is the lowest level of severity, using it will result in logging all
     * GRAPH_API_DEBUG levels.
     */
    public static final String GRAPH_API_DEBUG_INFO = "GRAPH_API_DEBUG_INFO";
}
