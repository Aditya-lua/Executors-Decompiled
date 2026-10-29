package backtraceio.library.models;

import android.content.Context;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.json.Annotations;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.json.SourceCode;
import backtraceio.library.models.json.SourceCodeData;
import backtraceio.library.models.json.ThreadData;
import backtraceio.library.models.json.ThreadInformation;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceData {
    private static final transient String LOG_TAG = "BacktraceData";

    @SerializedName("agentVersion")
    public String agentVersion;

    @SerializedName("annotations")
    public Map<String, Object> annotations;

    @SerializedName("attributes")
    public Map<String, String> attributes;

    @SerializedName("classifiers")
    public String[] classifiers;

    @SerializedName("langVersion")
    public String langVersion;

    @SerializedName("mainThread")
    public String mainThread;
    public transient BacktraceReport report;

    @SerializedName("sourceCode")
    public Map<String, SourceCode> sourceCode;

    @SerializedName("symbolication")
    public String symbolication;

    @SerializedName("threads")
    Map<String, ThreadInformation> threadInformationMap;

    @SerializedName("timestamp")
    public long timestamp;

    @SerializedName("uuid")
    public String uuid;

    @SerializedName("lang")
    public final String lang = "java";

    @SerializedName("agent")
    public final String agent = "backtrace-android";

    public static class Builder {
        private String agentVersion;
        private Map<String, Object> annotations;
        private Map<String, String> attributes;
        private String[] classifiers;
        private String langVersion;
        private String mainThread;
        private final BacktraceReport report;
        private Map<String, SourceCode> sourceCode;
        private String symbolication = "";
        private Map<String, ThreadInformation> threadInformationMap;
        private long timestamp;
        private String uuid;

        public Builder(BacktraceReport backtraceReport) {
            this.report = backtraceReport;
            setDefaultReportInformation(backtraceReport);
            setDefaultThreadsInformation();
        }

        private Builder setAnnotations(Map<String, Object> map) {
            BacktraceLogger.d(BacktraceData.LOG_TAG, "Setting annotations");
            Map<String, String> map2 = this.attributes;
            this.annotations = Annotations.getAnnotations((map2 == null || !map2.containsKey("error.message")) ? null : this.attributes.get("error.message"), map);
            return this;
        }

        private Builder setDefaultReportInformation(BacktraceReport backtraceReport) {
            this.uuid = backtraceReport.uuid.toString();
            this.timestamp = backtraceReport.timestamp;
            this.classifiers = backtraceReport.exceptionTypeReport.booleanValue() ? new String[]{backtraceReport.classifier} : null;
            this.langVersion = System.getProperty("java.version");
            this.agentVersion = BacktraceBase.version;
            return this;
        }

        private Builder setDefaultThreadsInformation() {
            BacktraceLogger.d(BacktraceData.LOG_TAG, "Setting threads information");
            ThreadData threadData = new ThreadData(this.report.diagnosticStack);
            SourceCodeData sourceCodeData = new SourceCodeData(this.report.diagnosticStack);
            this.mainThread = threadData.getMainThread();
            this.threadInformationMap = threadData.threadInformation;
            this.sourceCode = sourceCodeData.data.isEmpty() ? null : sourceCodeData.data;
            return this;
        }

        public BacktraceData build() {
            return new BacktraceData(this.uuid, this.symbolication, this.timestamp, this.langVersion, this.agentVersion, this.attributes, this.mainThread, this.classifiers, this.report, this.annotations, this.sourceCode, this.threadInformationMap);
        }

        public Builder setAttributes(Context context, Map<String, Object> map) {
            BacktraceLogger.d(BacktraceData.LOG_TAG, "Setting attributes");
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(context, this.report, map);
            this.attributes = backtraceAttributes.attributes;
            setAnnotations(backtraceAttributes.getComplexAttributes());
            return this;
        }

        public Builder setSymbolication(String str) {
            this.symbolication = str;
            return this;
        }
    }

    @Deprecated
    public BacktraceData(Context context, BacktraceReport backtraceReport, Map<String, Object> map) {
        BacktraceData backtraceDataBuild = new Builder(backtraceReport).setAttributes(context, map).setSymbolication("").build();
        this.uuid = backtraceDataBuild.uuid;
        this.symbolication = backtraceDataBuild.symbolication;
        this.timestamp = backtraceDataBuild.timestamp;
        this.langVersion = backtraceDataBuild.langVersion;
        this.agentVersion = backtraceDataBuild.agentVersion;
        this.attributes = backtraceDataBuild.attributes;
        this.mainThread = backtraceDataBuild.mainThread;
        this.report = backtraceDataBuild.report;
        this.classifiers = backtraceDataBuild.classifiers;
        this.annotations = backtraceDataBuild.annotations;
        this.sourceCode = backtraceDataBuild.sourceCode;
        this.threadInformationMap = backtraceDataBuild.threadInformationMap;
    }

    public String getAgent() {
        return "backtrace-android";
    }

    public String getAgentVersion() {
        return this.agentVersion;
    }

    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public List<String> getAttachmentPaths() {
        return this.report.attachmentPaths;
    }

    @Deprecated
    public List<String> getAttachments() {
        return getAttachmentPaths();
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public String[] getClassifiers() {
        return this.classifiers;
    }

    public String getLang() {
        return "java";
    }

    public String getLangVersion() {
        return this.langVersion;
    }

    public String getMainThread() {
        return this.mainThread;
    }

    public BacktraceReport getReport() {
        return this.report;
    }

    public Map<String, SourceCode> getSourceCode() {
        return this.sourceCode;
    }

    public String getSymbolication() {
        return this.symbolication;
    }

    public Map<String, ThreadInformation> getThreadInformationMap() {
        return this.threadInformationMap;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getUuid() {
        return this.uuid;
    }

    public BacktraceData(String str, String str2, long j10, String str3, String str4, Map<String, String> map, String str5, String[] strArr, BacktraceReport backtraceReport, Map<String, Object> map2, Map<String, SourceCode> map3, Map<String, ThreadInformation> map4) {
        this.uuid = str;
        this.symbolication = str2;
        this.timestamp = j10;
        this.langVersion = str3;
        this.agentVersion = str4;
        this.attributes = map;
        this.mainThread = str5;
        this.report = backtraceReport;
        this.classifiers = strArr;
        this.annotations = map2;
        this.sourceCode = map3;
        this.threadInformationMap = map4;
    }
}
