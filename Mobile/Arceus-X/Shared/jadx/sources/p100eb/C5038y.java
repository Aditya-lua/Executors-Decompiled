package p100eb;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* JADX INFO: renamed from: eb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5038y {

    /* JADX INFO: renamed from: a */
    public final String f19840a;

    /* JADX INFO: renamed from: b */
    public final Set f19841b;

    /* JADX INFO: renamed from: c */
    public final boolean f19842c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5038y(String str, Set set, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f19840a = "com.google.android.gms.fido";
        this.f19841b = set;
        this.f19842c = z13;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public final C4990q m23719a(String str, long j10) {
        final Class<Long> cls = Long.class;
        return new C4990q(this.f19840a, str, Long.valueOf(j10), new C4960l(false, false, false, this.f19842c, false, this.f19841b, new InterfaceC5032x() { // from class: eb.v
        }, new InterfaceC5032x(cls) { // from class: eb.w
        }), true);
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public final C4990q m23720b(String str, String str2) {
        final Class<String> cls = String.class;
        return new C4990q(this.f19840a, str, str2, new C4960l(false, false, false, this.f19842c, false, this.f19841b, new InterfaceC5032x() { // from class: eb.t
        }, new InterfaceC5032x(cls) { // from class: eb.u
        }), true);
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public final C4990q m23721c(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        final Class<Boolean> cls = Boolean.class;
        return new C4990q(this.f19840a, str, boolValueOf, new C4960l(false, false, false, this.f19842c, false, this.f19841b, new InterfaceC5032x() { // from class: eb.r
        }, new InterfaceC5032x(cls) { // from class: eb.s
        }), true);
    }

    /* JADX INFO: renamed from: d */
    public final C5038y m23722d() {
        return new C5038y(this.f19840a, this.f19841b, false, false, false, true, false);
    }

    /* JADX INFO: renamed from: e */
    public final C5038y m23723e(Set set) {
        return new C5038y(this.f19840a, set, false, false, false, this.f19842c, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5038y(String str) {
        this("com.google.android.gms.fido", AbstractC4938h1.m23608l(), false, false, false, false, false);
    }
}
