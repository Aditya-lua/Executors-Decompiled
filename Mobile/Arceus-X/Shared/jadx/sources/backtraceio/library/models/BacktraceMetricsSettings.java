package backtraceio.library.models;

import backtraceio.library.services.BacktraceMetrics;
import p210j6.C7033b;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceMetricsSettings {
    private final String baseUrl;
    private final int timeBetweenRetriesMillis;
    private final long timeIntervalMillis;
    private final String token;
    private final String universe;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceMetricsSettings(C7033b c7033b) {
        this(c7033b, BacktraceMetrics.defaultBaseUrl, BacktraceMetrics.defaultTimeIntervalMs, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getSubmissionUrl(String str) {
        return getBaseUrl() + "/" + str + "/submit?token=" + getToken() + "&universe=" + getUniverseName();
    }

    public int getTimeBetweenRetriesMillis() {
        return this.timeBetweenRetriesMillis;
    }

    public long getTimeIntervalMillis() {
        return this.timeIntervalMillis;
    }

    public String getToken() {
        return this.token;
    }

    public String getUniverseName() {
        return this.universe;
    }

    public boolean isBacktraceServer() {
        return getUniverseName() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceMetricsSettings(C7033b c7033b, String str) {
        this(c7033b, str, BacktraceMetrics.defaultTimeIntervalMs, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(C7033b c7033b, long j10) {
        this(c7033b, BacktraceMetrics.defaultBaseUrl, j10, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(C7033b c7033b, String str, long j10) {
        this(c7033b, str, j10, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(C7033b c7033b, String str, long j10, int i10) {
        this.universe = c7033b.m29732g();
        this.token = c7033b.m29730e();
        this.baseUrl = str;
        this.timeIntervalMillis = j10;
        this.timeBetweenRetriesMillis = i10;
    }
}
