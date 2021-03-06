package com.dmac.analytics.hbase;

/**
*
*  HBASE Table Creation - Exception
* 
* @author <a href="mailto:aravindh.chinnasamy@gmail.com">Aravindh Chinnasamy</a>
* @version %I%, %G%
* @since 1.0
*/
public class HBaseTableCreationException extends RuntimeException 
{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @param messageKey
     */
    public HBaseTableCreationException (String messageKey) {

        super (messageKey);

    }

    /**
     * @param messageKey
     * @param cause
     */
    public HBaseTableCreationException (String    messageKey,
                                        Throwable cause) {

        super (messageKey, cause);

    }
}
