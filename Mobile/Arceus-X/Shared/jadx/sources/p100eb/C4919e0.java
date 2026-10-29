package p100eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: eb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4919e0 {

    /* JADX INFO: renamed from: a */
    public final String f19643a = ",\n  ";

    public C4919e0(String str) {
    }

    /* JADX INFO: renamed from: a */
    public static C4919e0 m23567a(String str) {
        return new C4919e0(",\n  ");
    }

    /* JADX INFO: renamed from: d */
    public static final CharSequence m23569d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: c */
    public final StringBuilder m23570c(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(m23569d(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f19643a);
                    sb2.append(m23569d(it.next()));
                }
            }
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
