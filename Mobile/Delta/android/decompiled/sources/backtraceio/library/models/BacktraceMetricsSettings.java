package backtraceio.library.models;

import backtraceio.library.services.BacktraceMetrics;
import j6.b;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceMetricsSettings {
    private final String baseUrl;
    private final int timeBetweenRetriesMillis;
    private final long timeIntervalMillis;
    private final String token;
    private final String universe;

    public BacktraceMetricsSettings(b bVar) {
        this(bVar, BacktraceMetrics.defaultBaseUrl, BacktraceMetrics.defaultTimeIntervalMs, BacktraceMetrics.defaultTimeBetweenRetriesMs);
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

    public BacktraceMetricsSettings(b bVar, String str) {
        this(bVar, str, BacktraceMetrics.defaultTimeIntervalMs, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(b bVar, long j10) {
        this(bVar, BacktraceMetrics.defaultBaseUrl, j10, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(b bVar, String str, long j10) {
        this(bVar, str, j10, BacktraceMetrics.defaultTimeBetweenRetriesMs);
    }

    public BacktraceMetricsSettings(b bVar, String str, long j10, int i10) {
        this.universe = bVar.g();
        this.token = bVar.e();
        this.baseUrl = str;
        this.timeIntervalMillis = j10;
        this.timeBetweenRetriesMillis = i10;
    }
}
