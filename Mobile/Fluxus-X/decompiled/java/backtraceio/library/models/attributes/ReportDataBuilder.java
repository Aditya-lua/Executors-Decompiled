package backtraceio.library.models.attributes;

import backtraceio.library.common.TypeHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ReportDataBuilder {
    public static ReportDataAttributes getReportAttributes(Map<String, Object> map) {
        return getReportAttributes(map, false);
    }

    public static ReportDataAttributes getReportAttributes(Map<String, Object> map, boolean z10) {
        ReportDataAttributes reportDataAttributes = new ReportDataAttributes();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    if (!z10) {
                        reportDataAttributes.addAttribute(key, null);
                    }
                } else if (TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(value.getClass())) {
                    reportDataAttributes.addAttribute(key, value.toString());
                } else {
                    reportDataAttributes.addAnnotation(key, value);
                }
            }
        }
        return reportDataAttributes;
    }
}
