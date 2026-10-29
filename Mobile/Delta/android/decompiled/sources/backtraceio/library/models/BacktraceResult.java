package backtraceio.library.models;

import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceResult {
    private BacktraceReport backtraceReport;
    public String message;

    @SerializedName("_rxid")
    public String rxId;
    public BacktraceResultStatus status;

    public BacktraceResult() {
        this.status = BacktraceResultStatus.Ok;
    }

    public static BacktraceResult OnError(BacktraceReport backtraceReport, Exception exc) {
        return new BacktraceResult(backtraceReport, exc.getMessage(), BacktraceResultStatus.ServerError);
    }

    public BacktraceReport getBacktraceReport() {
        return this.backtraceReport;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRxId() {
        return this.rxId;
    }

    public BacktraceResultStatus getStatus() {
        return this.status;
    }

    public void setBacktraceReport(BacktraceReport backtraceReport) {
        this.backtraceReport = backtraceReport;
    }

    public BacktraceResult(BacktraceApiResult backtraceApiResult) {
        this(backtraceApiResult.rxId, backtraceApiResult.getResponse());
    }

    public BacktraceResult(String str, String str2) {
        this(null, str, null, BacktraceResultStatus.enumOf(str2));
    }

    public BacktraceResult(BacktraceReport backtraceReport, String str, BacktraceResultStatus backtraceResultStatus) {
        this(backtraceReport, null, str, backtraceResultStatus);
    }

    public BacktraceResult(BacktraceReport backtraceReport, String str, String str2, BacktraceResultStatus backtraceResultStatus) {
        BacktraceResultStatus backtraceResultStatus2 = BacktraceResultStatus.ServerError;
        this.rxId = str;
        this.message = str2;
        this.status = backtraceResultStatus;
        setBacktraceReport(backtraceReport);
    }
}
