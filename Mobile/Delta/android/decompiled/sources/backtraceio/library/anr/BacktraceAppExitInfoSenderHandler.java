package backtraceio.library.anr;

import android.content.Context;
import android.os.Build;
import backtraceio.library.common.ApplicationMetadataCache;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceAppExitInfoSenderHandler extends Thread implements BacktraceANRHandler {
    private static final String ANR_COMPLEX_ATTR_KEY = "ANR annotations";
    private static final String ANR_STACKTRACE_ATTR_KEY = "ANR stacktrace";
    private static final String ANR_STACKTRACE_PARSED_ATTR_KEY = "ANR parsed stacktrace";
    private static final String LOG_TAG = "BacktraceAppExitInfoSenderHandler";
    private static final String THREAD_NAME = "main-anr-appexit";
    private final ProcessExitInfoProvider activityManager;
    private final AnrExitInfoState anrAppExitInfoState;
    private final j6.a backtraceClient;
    private final String packageName;

    public BacktraceAppExitInfoSenderHandler(j6.a aVar, Context context) {
        this(aVar, ApplicationMetadataCache.getInstance(context).getPackageName(), new AnrExitInfoState(context), new ActivityManagerExitInfoProvider(context));
    }

    public static /* synthetic */ void a(BacktraceAppExitInfoSenderHandler backtraceAppExitInfoSenderHandler, ExitInfo exitInfo, BacktraceResult backtraceResult) {
        synchronized (backtraceAppExitInfoSenderHandler.anrAppExitInfoState) {
            try {
                if (backtraceResult.status == BacktraceResultStatus.Ok && backtraceAppExitInfoSenderHandler.shouldUpdateLastTimestamp(exitInfo)) {
                    backtraceAppExitInfoSenderHandler.anrAppExitInfoState.saveTimestamp(exitInfo.getTimestamp());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private BacktraceReport generateBacktraceReport(ExitInfo exitInfo) {
        HashMap<String, Object> aNRAttributes = AppExitInfoDetailsExtractor.getANRAttributes(exitInfo);
        String stackTraceInfo = AppExitInfoDetailsExtractor.getStackTraceInfo(exitInfo);
        if (stackTraceInfo == null || stackTraceInfo.isEmpty()) {
            BacktraceLogger.w(LOG_TAG, "Empty stacktrace for ApplicationExitInfo");
            return null;
        }
        Map<String, Object> attributesFromStacktrace = getAttributesFromStacktrace(stackTraceInfo);
        StackTraceElement[] mainThreadStackTrace = ExitInfoStackTraceParser.parseMainThreadStackTrace(attributesFromStacktrace);
        return new BacktraceReport(new BacktraceANRExitInfoException(exitInfo, mainThreadStackTrace), new HashMap<String, Object>(aNRAttributes, stackTraceInfo, attributesFromStacktrace) { // from class: backtraceio.library.anr.BacktraceAppExitInfoSenderHandler.1
            final /* synthetic */ Map val$anrAttributes;
            final /* synthetic */ Map val$parsedStackTraceAttributes;
            final /* synthetic */ String val$stackTrace;

            {
                this.val$anrAttributes = aNRAttributes;
                this.val$stackTrace = stackTraceInfo;
                this.val$parsedStackTraceAttributes = attributesFromStacktrace;
                put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.AnrAttributeType);
                put(BacktraceAppExitInfoSenderHandler.ANR_COMPLEX_ATTR_KEY, aNRAttributes);
                put(BacktraceAppExitInfoSenderHandler.ANR_STACKTRACE_ATTR_KEY, stackTraceInfo);
                put(BacktraceAppExitInfoSenderHandler.ANR_STACKTRACE_PARSED_ATTR_KEY, attributesFromStacktrace);
            }
        });
    }

    private Map<String, Object> getAttributesFromStacktrace(String str) {
        try {
            return ExitInfoStackTraceParser.parseANRStackTrace(str);
        } catch (Exception e10) {
            BacktraceLogger.e(LOG_TAG, "Error during parsing ExitInfoStackTrace", e10);
            return new HashMap();
        }
    }

    private boolean isSupportedTypeOfApplicationExit(ExitInfo exitInfo) {
        return this.activityManager.getSupportedTypesOfExitInfo().contains(Integer.valueOf(exitInfo.getReason()));
    }

    private void send() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            BacktraceLogger.d(LOG_TAG, "Unsupported Android version " + i10 + " to send ANR based on applicationExitInfoList");
            return;
        }
        List<ExitInfo> historicalExitInfo = this.activityManager.getHistoricalExitInfo(this.packageName, 0, 0);
        Collections.reverse(historicalExitInfo);
        for (ExitInfo exitInfo : historicalExitInfo) {
            synchronized (this.anrAppExitInfoState) {
                try {
                    if (shouldProcessAppExitInfo(exitInfo)) {
                        sendApplicationExitInfoReport(exitInfo);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void sendApplicationExitInfoReport(final ExitInfo exitInfo) {
        BacktraceReport backtraceReportGenerateBacktraceReport = generateBacktraceReport(exitInfo);
        if (backtraceReportGenerateBacktraceReport == null) {
            synchronized (this.anrAppExitInfoState) {
                this.anrAppExitInfoState.saveTimestamp(exitInfo.getTimestamp());
            }
        } else {
            BacktraceLogger.d(LOG_TAG, "Sending ApplicationExitInfo ANR: " + backtraceReportGenerateBacktraceReport.message);
            this.backtraceClient.send(backtraceReportGenerateBacktraceReport, new OnServerResponseEventListener() { // from class: backtraceio.library.anr.a
                @Override // backtraceio.library.events.OnServerResponseEventListener
                public final void onEvent(BacktraceResult backtraceResult) {
                    BacktraceAppExitInfoSenderHandler.a(this.f4076a, exitInfo, backtraceResult);
                }
            });
        }
    }

    private boolean shouldProcessAppExitInfo(ExitInfo exitInfo) {
        if (this.anrAppExitInfoState.getLastTimestamp() >= exitInfo.getTimestamp()) {
            return false;
        }
        return isSupportedTypeOfApplicationExit(exitInfo);
    }

    private boolean shouldUpdateLastTimestamp(ExitInfo exitInfo) {
        return this.anrAppExitInfoState.getLastTimestamp() < exitInfo.getTimestamp();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        send();
    }

    @Override // backtraceio.library.anr.BacktraceANRHandler
    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
    }

    @Override // backtraceio.library.anr.BacktraceANRHandler
    public void stopMonitoringAnr() {
        if (isInterrupted()) {
            return;
        }
        BacktraceLogger.d(LOG_TAG, "ANR thread will be interrupted.");
        interrupt();
    }

    public BacktraceAppExitInfoSenderHandler(j6.a aVar, String str, AnrExitInfoState anrExitInfoState, ProcessExitInfoProvider processExitInfoProvider) {
        super(THREAD_NAME);
        this.backtraceClient = aVar;
        this.packageName = str;
        this.anrAppExitInfoState = anrExitInfoState;
        this.activityManager = processExitInfoProvider;
        start();
    }
}
