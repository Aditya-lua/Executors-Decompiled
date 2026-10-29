package p169he;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: he.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6377g {

    /* JADX INFO: renamed from: a */
    public final String f24256a;

    public C6377g(String str) {
        this.f24256a = (String) C6384n.m27928l(str);
    }

    /* JADX INFO: renamed from: d */
    public static C6377g m27898d(String str) {
        return new C6377g(str);
    }

    /* JADX INFO: renamed from: a */
    public <A extends Appendable> A m27899a(A a10, Iterator<? extends Object> it) throws IOException {
        C6384n.m27928l(a10);
        if (it.hasNext()) {
            a10.append(m27902e(it.next()));
            while (it.hasNext()) {
                a10.append(this.f24256a);
                a10.append(m27902e(it.next()));
            }
        }
        return a10;
    }

    /* JADX INFO: renamed from: b */
    public final StringBuilder m27900b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return m27901c(sb2, iterable.iterator());
    }

    /* JADX INFO: renamed from: c */
    public final StringBuilder m27901c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            m27899a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public CharSequence m27902e(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
