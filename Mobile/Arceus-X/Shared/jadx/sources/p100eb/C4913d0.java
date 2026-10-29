package p100eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: eb.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4913d0 {
    /* JADX INFO: renamed from: a */
    public static final Appendable m23563a(Appendable appendable, Iterator it, C4919e0 c4919e0, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(C4919e0.m23569d(entry.getKey()));
            appendable.append(" : ");
            appendable.append(C4919e0.m23569d(entry.getValue()));
            while (it.hasNext()) {
                appendable.append(c4919e0.f19643a);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(C4919e0.m23569d(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(C4919e0.m23569d(entry2.getValue()));
            }
        }
        return appendable;
    }
}
