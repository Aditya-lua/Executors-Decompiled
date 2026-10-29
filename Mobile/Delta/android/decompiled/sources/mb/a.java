package mb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import n9.m;
import nb.g7;
import nb.qa;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f24045a;
    public final qa b;

    public a(@NonNull g7 g7Var) {
        super(null);
        m.l(g7Var);
        this.f24045a = g7Var;
        this.b = g7Var.B();
    }

    @Override // nb.ra
    public final void a(String str, String str2, Bundle bundle) {
        this.b.p(str, str2, bundle);
    }

    @Override // nb.ra
    public final void b(Bundle bundle) {
        this.b.M(bundle);
    }

    @Override // nb.ra
    public final void c(String str) {
        g7 g7Var = this.f24045a;
        g7Var.M().j(str, g7Var.e().b());
    }

    @Override // nb.ra
    public final String d() {
        return this.b.R();
    }

    @Override // nb.ra
    public final String e() {
        return this.b.D();
    }

    @Override // nb.ra
    public final long f() {
        return this.f24045a.C().p0();
    }

    @Override // nb.ra
    public final String g() {
        return this.b.S();
    }

    @Override // nb.ra
    public final void h(String str) {
        g7 g7Var = this.f24045a;
        g7Var.M().i(str, g7Var.e().b());
    }

    @Override // nb.ra
    public final int i(String str) {
        this.b.L(str);
        return 25;
    }

    @Override // nb.ra
    public final Map j(String str, String str2, boolean z10) {
        return this.b.C(str, str2, z10);
    }

    @Override // nb.ra
    public final void k(String str, String str2, Bundle bundle) {
        this.f24045a.B().O(str, str2, bundle);
    }

    @Override // nb.ra
    public final List l(String str, String str2) {
        return this.b.P(str, str2);
    }

    @Override // nb.ra
    public final String zzh() {
        return this.b.Q();
    }
}
