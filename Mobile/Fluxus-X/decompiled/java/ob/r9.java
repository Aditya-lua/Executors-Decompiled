package ob;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27764a;
    public final /* synthetic */ va b;

    public r9(va vaVar, long j10) {
        this.f27764a = j10;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.b;
        vaVar.h();
        vaVar.j();
        l7 l7Var = vaVar.f27641a;
        l7Var.a().v().a("Resetting analytics data (FE)");
        l7 l7Var2 = vaVar.f27641a;
        qd qdVarZ = l7Var2.z();
        qdVarZ.h();
        qdVarZ.f27747f.c();
        l7Var2.L().p();
        boolean z10 = !vaVar.f27641a.g();
        p6 p6VarX = l7Var.x();
        p6VarX.f27686f.b(this.f27764a);
        l7 l7Var3 = p6VarX.f27641a;
        if (!TextUtils.isEmpty(l7Var3.x().f27703w.a())) {
            p6VarX.f27703w.b(null);
        }
        p6VarX.f27697q.b(0L);
        p6VarX.f27698r.b(0L);
        if (!l7Var3.w().L()) {
            p6VarX.y(z10);
        }
        p6VarX.f27704x.b(null);
        p6VarX.f27705y.b(0L);
        p6VarX.f27706z.b(null);
        l7Var2.J().p();
        l7Var2.z().f27746e.a();
        vaVar.f27890s = z10;
        l7Var2.J().q(new AtomicReference());
    }
}
