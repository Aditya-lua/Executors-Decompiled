package backtraceio.library.breadcrumbs;

import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.logger.BacktraceLogger;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceBreadcrumbsLogManager {
    private final BacktraceQueueFileHelper backtraceQueueFileHelper;
    private final String LOG_TAG = BacktraceBreadcrumbsLogManager.class.getSimpleName();
    private long breadcrumbId = System.currentTimeMillis();
    private final int maxMessageSizeBytes = 1024;
    private final int maxAttributeSizeBytes = 1024;

    public BacktraceBreadcrumbsLogManager(String str, int i10) {
        this.backtraceQueueFileHelper = new BacktraceQueueFileHelper(str, i10);
    }

    public boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strSubstring = str.substring(0, Math.min(str.length(), 1024));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", jCurrentTimeMillis);
            long j10 = this.breadcrumbId;
            this.breadcrumbId = 1 + j10;
            jSONObject.put("id", j10);
            jSONObject.put("level", backtraceBreadcrumbLevel.toString());
            jSONObject.put(Payload.TYPE, backtraceBreadcrumbType.toString());
            jSONObject.put("message", strSubstring);
            if (map != null) {
                JSONObject jSONObject2 = new JSONObject();
                int length = 0;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    length += entry.getKey().length() + entry.getValue().toString().length();
                    if (length < 1024) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("attributes", jSONObject2);
                }
            }
            return this.backtraceQueueFileHelper.add(("\n" + jSONObject.toString().replace("\\n", "") + "\n").getBytes());
        } catch (Exception unused) {
            BacktraceLogger.m7081e(this.LOG_TAG, "Could not create the breadcrumb JSON");
            return false;
        }
    }

    public boolean clear() {
        boolean zClear = this.backtraceQueueFileHelper.clear();
        if (zClear) {
            this.breadcrumbId = 0L;
        }
        return zClear;
    }

    public long getCurrentBreadcrumbId() {
        return this.breadcrumbId;
    }

    public void setCurrentBreadcrumbId(long j10) {
        this.breadcrumbId = j10;
    }
}
