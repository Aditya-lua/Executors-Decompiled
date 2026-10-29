package backtraceio.library.models.attributes;

import backtraceio.library.common.TypeHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ReportDataBuilder {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ReportDataAttributes getReportAttributes(Map<String, Object> map) {
        return getReportAttributes(map, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
