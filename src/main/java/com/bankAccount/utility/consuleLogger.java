
package com.bankAccount.utility;

import java.text.SimpleDateFormat;
import java.util.Date;


public class consuleLogger {
    
    private String context;
    
    public consuleLogger(String context)
    {
        this.context = context;
    }
    
    public void LogInfo(String logData)
    {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    
}
