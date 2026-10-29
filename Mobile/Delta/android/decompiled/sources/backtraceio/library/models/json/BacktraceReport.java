package backtraceio.library.models.json;

import android.content.Context;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.common.CollectionUtils;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceStackFrame;
import backtraceio.library.models.BacktraceStackTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceReport {
    public List<String> attachmentPaths;
    public Map<String, Object> attributes;
    public String classifier;
    public List<BacktraceStackFrame> diagnosticStack;
    public Exception exception;
    public Boolean exceptionTypeReport;
    public String message;
    private final transient Throwable originalException;
    public long timestamp;
    public UUID uuid;

    public BacktraceReport(String str) {
        this((Throwable) null, (Map<String, Object>) null, (List<String>) null);
        this.message = str;
    }

    public static Map<String, Object> concatAttributes(BacktraceReport backtraceReport, Map<String, Object> map) {
        Map<String, Object> map2 = backtraceReport.attributes;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (map == null) {
            return map2;
        }
        map2.putAll(map);
        return map2;
    }

    private String getExceptionClassifier(Throwable th2) {
        return th2.getClass().getCanonicalName();
    }

    private Exception prepareException(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        Exception exc = new Exception(th2.getMessage());
        exc.setStackTrace(th2.getStackTrace());
        return exc;
    }

    private void setDefaultErrorTypeAttribute() {
        if (this.attributes.containsKey(BacktraceAttributeConsts.ErrorType)) {
            return;
        }
        this.attributes.put(BacktraceAttributeConsts.ErrorType, this.exceptionTypeReport.booleanValue() ? BacktraceAttributeConsts.HandledExceptionAttributeType : BacktraceAttributeConsts.MessageAttributeType);
    }

    public Throwable getException() {
        Throwable th2 = this.originalException;
        return th2 != null ? th2 : this.exception;
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map) {
        return toBacktraceData(context, map, false);
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map, boolean z10) {
        return new BacktraceData.Builder(this).setAttributes(context, map).setSymbolication(z10 ? "proguard" : null).build();
    }

    public BacktraceReport(String str, Map<String, Object> map) {
        this((Throwable) null, map, (List<String>) null);
        this.message = str;
    }

    public BacktraceReport(String str, List<String> list) {
        this(str, (Map<String, Object>) null, list);
    }

    public BacktraceReport(String str, Map<String, Object> map, List<String> list) {
        this((Throwable) null, map, list);
        this.message = str;
    }

    public BacktraceReport(Throwable th2) {
        this(th2, (Map<String, Object>) null, (List<String>) null);
    }

    public BacktraceReport(Throwable th2, Map<String, Object> map) {
        this(th2, map, (List<String>) null);
    }

    public BacktraceReport(Exception exc, List<String> list) {
        this(exc, (Map<String, Object>) null, list);
    }

    public BacktraceReport(Throwable th2, Map<String, Object> map, List<String> list) {
        this.uuid = UUID.randomUUID();
        this.timestamp = BacktraceTimeHelper.getTimestampSeconds();
        this.exceptionTypeReport = Boolean.FALSE;
        this.classifier = "";
        this.attributes = new HashMap();
        this.attachmentPaths = new ArrayList();
        this.attributes = CollectionUtils.copyMap(map);
        this.attachmentPaths = CollectionUtils.copyList(list);
        this.originalException = th2;
        if (th2 != null) {
            this.exception = prepareException(th2);
            this.classifier = getExceptionClassifier(th2);
            this.exceptionTypeReport = Boolean.TRUE;
        }
        this.diagnosticStack = new BacktraceStackTrace(this.exception).getStackFrames();
        setDefaultErrorTypeAttribute();
    }

    public BacktraceReport(UUID uuid, long j10, boolean z10, String str, Map<String, Object> map, String str2, Exception exc, List<String> list, List<BacktraceStackFrame> list2) {
        this.uuid = UUID.randomUUID();
        this.timestamp = BacktraceTimeHelper.getTimestampSeconds();
        this.exceptionTypeReport = Boolean.FALSE;
        this.classifier = "";
        this.attributes = new HashMap();
        this.attachmentPaths = new ArrayList();
        this.uuid = uuid;
        this.timestamp = j10;
        this.exceptionTypeReport = Boolean.valueOf(z10);
        this.classifier = str;
        this.attributes = map;
        this.message = str2;
        this.originalException = exc;
        this.exception = exc;
        this.attachmentPaths = list;
        this.diagnosticStack = list2;
    }
}
