package nb;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26569a;
    public final /* synthetic */ qa b;

    public m9(qa qaVar, long j10) {
        this.f26569a = j10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.j();
        g7 g7Var = qaVar.f26446a;
        g7Var.a().v().a("Resetting analytics data (FE)");
        g7 g7Var2 = qaVar.f26446a;
        ld ldVarZ = g7Var2.z();
        ldVarZ.h();
        ldVarZ.f26556f.c();
        g7Var2.L().p();
        boolean z10 = !qaVar.f26446a.g();
        k6 k6VarX = g7Var.x();
        k6VarX.f26492f.b(this.f26569a);
        g7 g7Var3 = k6VarX.f26446a;
        if (!TextUtils.isEmpty(g7Var3.x().f26509w.a())) {
            k6VarX.f26509w.b(null);
        }
        k6VarX.f26503q.b(0L);
        k6VarX.f26504r.b(0L);
        if (!g7Var3.w().L()) {
            k6VarX.y(z10);
        }
        k6VarX.f26510x.b(null);
        k6VarX.f26511y.b(0L);
        k6VarX.f26512z.b(null);
        g7Var2.J().p();
        g7Var2.z().f26555e.a();
        qaVar.f26728s = z10;
        g7Var2.J().q(new AtomicReference());
    }
}
