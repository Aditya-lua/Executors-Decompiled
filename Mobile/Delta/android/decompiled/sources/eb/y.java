package eb;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16039a;
    public final Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16040c;

    public y(String str, Set set, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f16039a = "com.google.android.gms.fido";
        this.b = set;
        this.f16040c = z13;
    }

    @SideEffectFree
    public final q a(String str, long j10) {
        final Class<Long> cls = Long.class;
        return new q(this.f16039a, str, Long.valueOf(j10), new l(false, false, false, this.f16040c, false, this.b, new x() { // from class: eb.v
        }, new x(cls) { // from class: eb.w
        }), true);
    }

    @SideEffectFree
    public final q b(String str, String str2) {
        final Class<String> cls = String.class;
        return new q(this.f16039a, str, str2, new l(false, false, false, this.f16040c, false, this.b, new x() { // from class: eb.t
        }, new x(cls) { // from class: eb.u
        }), true);
    }

    @SideEffectFree
    public final q c(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        final Class<Boolean> cls = Boolean.class;
        return new q(this.f16039a, str, boolValueOf, new l(false, false, false, this.f16040c, false, this.b, new x() { // from class: eb.r
        }, new x(cls) { // from class: eb.s
        }), true);
    }

    public final y d() {
        return new y(this.f16039a, this.b, false, false, false, true, false);
    }

    public final y e(Set set) {
        return new y(this.f16039a, set, false, false, false, this.f16040c, false);
    }

    public y(String str) {
        this("com.google.android.gms.fido", h1.l(), false, false, false, false, false);
    }
}
