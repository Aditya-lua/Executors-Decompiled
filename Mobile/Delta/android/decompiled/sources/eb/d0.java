package eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final Appendable a(Appendable appendable, Iterator it, e0 e0Var, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(e0.d(entry.getKey()));
            appendable.append(" : ");
            appendable.append(e0.d(entry.getValue()));
            while (it.hasNext()) {
                appendable.append(e0Var.f15263a);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(e0.d(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(e0.d(entry2.getValue()));
            }
        }
        return appendable;
    }
}
