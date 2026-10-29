package backtraceio.library.services;

import backtraceio.library.models.json.BacktraceReport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class ReportExceptionTransformer {
    public static final String errorIdAttribute = "error.id";
    public static final String errorParentIdAttribute = "error.parent";
    public static final String errorTraceAttribute = "error.trace";
    private boolean sendSuppressedExceptions = false;
    private boolean sendInnerExceptions = false;

    private void extendReportWithNestedExceptionAttributes(BacktraceReport backtraceReport, String str, String str2) {
        backtraceReport.attributes.put(errorTraceAttribute, str);
        backtraceReport.attributes.put(errorIdAttribute, backtraceReport.uuid.toString());
        backtraceReport.attributes.put(errorParentIdAttribute, str2);
    }

    private List<BacktraceReport> getSuppressedReports(Throwable th2, Map<String, Object> map, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (this.sendSuppressedExceptions) {
            for (Throwable th3 : th2.getSuppressed()) {
                BacktraceReport backtraceReport = new BacktraceReport(th3, map);
                extendReportWithNestedExceptionAttributes(backtraceReport, str, str2);
                arrayList.add(backtraceReport);
            }
        }
        return arrayList;
    }

    public void sendInnerExceptions(boolean z10) {
        this.sendInnerExceptions = z10;
    }

    public void sendSuppressedExceptions(boolean z10) {
        this.sendSuppressedExceptions = z10;
    }

    public List<BacktraceReport> transformReportWithInnerExceptions(BacktraceReport backtraceReport) {
        Throwable exception;
        ArrayList arrayList = new ArrayList();
        if (backtraceReport != null) {
            arrayList.add(backtraceReport);
            if (backtraceReport.exceptionTypeReport.booleanValue() && (exception = backtraceReport.getException()) != null) {
                String string = UUID.randomUUID().toString();
                extendReportWithNestedExceptionAttributes(backtraceReport, string, null);
                String string2 = backtraceReport.uuid.toString();
                Map<String, Object> map = backtraceReport.attributes;
                arrayList.addAll(getSuppressedReports(exception, map, string, string2));
                if (this.sendInnerExceptions) {
                    for (Throwable cause = exception.getCause(); cause != null; cause = cause.getCause()) {
                        BacktraceReport backtraceReport2 = new BacktraceReport(cause, map);
                        extendReportWithNestedExceptionAttributes(backtraceReport2, string, string2);
                        arrayList.add(backtraceReport2);
                        string2 = backtraceReport2.uuid.toString();
                        arrayList.addAll(getSuppressedReports(cause, map, string, string2));
                    }
                }
            }
        }
        return arrayList;
    }
}
