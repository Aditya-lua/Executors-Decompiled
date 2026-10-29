package m1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public interface r1 extends f1 {

    public interface a {
        r1 a(String str);
    }

    boolean a();

    Range<Integer> b(int i10);

    int c();

    boolean d(int i10, int i11);

    default boolean e(int i10, int i11) {
        if (d(i10, i11)) {
            return true;
        }
        return a() && d(i11, i10);
    }

    int f();

    Range<Integer> g();

    Range<Integer> h(int i10);

    Range<Integer> i();

    Range<Integer> j();
}
