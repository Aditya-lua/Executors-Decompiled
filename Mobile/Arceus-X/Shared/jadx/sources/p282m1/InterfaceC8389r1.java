package p282m1;

import android.util.Range;

/* JADX INFO: renamed from: m1.r1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8389r1 extends InterfaceC8353f1 {

    /* JADX INFO: renamed from: m1.r1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC8389r1 mo34064a(String str);
    }

    /* JADX INFO: renamed from: a */
    boolean mo34052a();

    /* JADX INFO: renamed from: b */
    Range<Integer> mo34053b(int i10);

    /* JADX INFO: renamed from: c */
    int mo34054c();

    /* JADX INFO: renamed from: d */
    boolean mo34055d(int i10, int i11);

    /* JADX INFO: renamed from: e */
    default boolean m34063e(int i10, int i11) {
        if (mo34055d(i10, i11)) {
            return true;
        }
        return mo34052a() && mo34055d(i11, i10);
    }

    /* JADX INFO: renamed from: f */
    int mo34056f();

    /* JADX INFO: renamed from: g */
    Range<Integer> mo34057g();

    /* JADX INFO: renamed from: h */
    Range<Integer> mo34058h(int i10);

    /* JADX INFO: renamed from: i */
    Range<Integer> mo34059i();

    /* JADX INFO: renamed from: j */
    Range<Integer> mo34060j();
}
