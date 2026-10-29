package backtraceio.library.watchdog;

import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.json.BacktraceReport;
import java.util.HashMap;
import p210j6.C7032a;

/* JADX INFO: loaded from: classes.dex */
class BacktraceWatchdogShared {
    public static void sendReportCauseBlockedThread(C7032a c7032a, Thread thread, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, String str) {
        BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException = new BacktraceWatchdogTimeoutException();
        backtraceWatchdogTimeoutException.setStackTrace(thread.getStackTrace());
        BacktraceLogger.m7082e(str, "Blocked thread detected, sending a report", backtraceWatchdogTimeoutException);
        if (onApplicationNotRespondingEvent != null) {
            onApplicationNotRespondingEvent.onEvent(backtraceWatchdogTimeoutException);
        } else if (c7032a != null) {
            c7032a.addBreadcrumb("ANR detected - thread is blocked");
            c7032a.send(new BacktraceReport(backtraceWatchdogTimeoutException, new HashMap<String, Object>() { // from class: backtraceio.library.watchdog.BacktraceWatchdogShared.1
                {
                    put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.AnrAttributeType);
                }
            }));
        }
    }
}
