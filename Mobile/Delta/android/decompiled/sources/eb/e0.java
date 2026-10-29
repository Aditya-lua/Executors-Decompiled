package eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15263a = ",\n  ";

    public e0(String str) {
    }

    public static e0 a(String str) {
        return new e0(",\n  ");
    }

    public static final CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder c(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(d(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f15263a);
                    sb2.append(d(it.next()));
                }
            }
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
