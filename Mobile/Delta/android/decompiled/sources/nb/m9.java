package nb;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25748a;
    public final /* synthetic */ qa b;

    public m9(qa qaVar, long j10) {
        this.f25748a = j10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.j();
        g7 g7Var = qaVar.f25625a;
        g7Var.a().v().a("Resetting analytics data (FE)");
        g7 g7Var2 = qaVar.f25625a;
        ld ldVarZ = g7Var2.z();
        ldVarZ.h();
        ldVarZ.f25735f.c();
        g7Var2.L().p();
        boolean z10 = !qaVar.f25625a.g();
        k6 k6VarX = g7Var.x();
        k6VarX.f25671f.b(this.f25748a);
        g7 g7Var3 = k6VarX.f25625a;
        if (!TextUtils.isEmpty(g7Var3.x().f25688w.a())) {
            k6VarX.f25688w.b(null);
        }
        k6VarX.f25682q.b(0L);
        k6VarX.f25683r.b(0L);
        if (!g7Var3.w().L()) {
            k6VarX.y(z10);
        }
        k6VarX.f25689x.b(null);
        k6VarX.f25690y.b(0L);
        k6VarX.f25691z.b(null);
        g7Var2.J().p();
        g7Var2.z().f25734e.a();
        qaVar.f25907s = z10;
        g7Var2.J().q(new AtomicReference());
    }
}
