package backtraceio.library.interfaces;

import backtraceio.library.models.json.BacktraceReport;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Client {
    void addAttribute(String str, Object obj);

    void addAttribute(Map<String, Object> map);

    void enableNativeIntegration();

    void send(BacktraceReport backtraceReport);
}
