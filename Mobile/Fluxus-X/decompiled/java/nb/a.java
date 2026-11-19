package nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import o9.s;
import ob.l7;
import ob.va;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f25495a;
    public final va b;

    public a(@NonNull l7 l7Var) {
        super(null);
        s.l(l7Var);
        this.f25495a = l7Var;
        this.b = l7Var.B();
    }

    @Override // ob.wa
    public final void a(String str, String str2, Bundle bundle) {
        this.b.p(str, str2, bundle);
    }

    @Override // ob.wa
    public final void b(Bundle bundle) {
        this.b.M(bundle);
    }

    @Override // ob.wa
    public final void c(String str) {
        l7 l7Var = this.f25495a;
        l7Var.M().j(str, l7Var.e().b());
    }

    @Override // ob.wa
    public final String d() {
        return this.b.R();
    }

    @Override // ob.wa
    public final String e() {
        return this.b.D();
    }

    @Override // ob.wa
    public final long f() {
        return this.f25495a.C().p0();
    }

    @Override // ob.wa
    public final String g() {
        return this.b.S();
    }

    @Override // ob.wa
    public final void h(String str) {
        l7 l7Var = this.f25495a;
        l7Var.M().i(str, l7Var.e().b());
    }

    @Override // ob.wa
    public final int i(String str) {
        this.b.L(str);
        return 25;
    }

    @Override // ob.wa
    public final Map j(String str, String str2, boolean z10) {
        return this.b.C(str, str2, z10);
    }

    @Override // ob.wa
    public final void k(String str, String str2, Bundle bundle) {
        this.f25495a.B().O(str, str2, bundle);
    }

    @Override // ob.wa
    public final List l(String str, String str2) {
        return this.b.P(str, str2);
    }

    @Override // ob.wa
    public final String zzh() {
        return this.b.Q();
    }
}
