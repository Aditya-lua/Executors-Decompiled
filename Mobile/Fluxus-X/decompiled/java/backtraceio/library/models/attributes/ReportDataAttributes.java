package backtraceio.library.models.attributes;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ReportDataAttributes {
    private final Map<String, String> reportAttributes = new HashMap();
    private final Map<String, Object> reportAnnotations = new HashMap();

    public void addAnnotation(String str, Object obj) {
        this.reportAnnotations.put(str, obj);
    }

    public void addAttribute(String str, String str2) {
        this.reportAttributes.put(str, str2);
    }

    public Map<String, Object> getAnnotations() {
        return this.reportAnnotations;
    }

    public Map<String, String> getAttributes() {
        return this.reportAttributes;
    }
}
