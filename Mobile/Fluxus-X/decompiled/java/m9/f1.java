package m9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends rb.d implements l9.h.a, l9.h.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f23005h = qb.e.f29959c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23006a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9.a.AbstractC0421a f23007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f23008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o9.f f23009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qb.f f23010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1 f23011g;

    public f1(Context context, Handler handler, @NonNull o9.f fVar) {
        l9.a.AbstractC0421a abstractC0421a = f23005h;
        this.f23006a = context;
        this.b = handler;
        this.f23009e = (o9.f) o9.s.m(fVar, "ClientSettings must not be null");
        this.f23008d = fVar.h();
        this.f23007c = abstractC0421a;
    }

    public static /* bridge */ /* synthetic */ void t2(f1 f1Var, rb.l lVar) {
        k9.b bVarA3 = lVar.A3();
        if (bVarA3.F3()) {
            o9.t0 t0Var = (o9.t0) o9.s.l(lVar.B3());
            k9.b bVarA4 = t0Var.A3();
            if (!bVarA4.F3()) {
                String strValueOf = String.valueOf(bVarA4);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                f1Var.f23011g.a(bVarA4);
                f1Var.f23010f.disconnect();
                return;
            }
            f1Var.f23011g.b(t0Var.B3(), f1Var.f23008d);
        } else {
            f1Var.f23011g.a(bVarA3);
        }
        f1Var.f23010f.disconnect();
    }

    @Override // rb.f
    public final void o0(rb.l lVar) {
        this.b.post(new d1(this, lVar));
    }

    @Override // m9.e
    public final void onConnected(Bundle bundle) {
        this.f23010f.a(this);
    }

    @Override // m9.n
    public final void onConnectionFailed(@NonNull k9.b bVar) {
        this.f23011g.a(bVar);
    }

    @Override // m9.e
    public final void onConnectionSuspended(int i10) {
        this.f23011g.d(i10);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l9.a$f, qb.f] */
    public final void u2(e1 e1Var) {
        qb.f fVar = this.f23010f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f23009e.m(Integer.valueOf(System.identityHashCode(this)));
        l9.a.AbstractC0421a abstractC0421a = this.f23007c;
        Context context = this.f23006a;
        Handler handler = this.b;
        o9.f fVar2 = this.f23009e;
        this.f23010f = abstractC0421a.a(context, handler.getLooper(), fVar2, fVar2.j(), this, this);
        this.f23011g = e1Var;
        Set set = this.f23008d;
        if (set == null || set.isEmpty()) {
            this.b.post(new c1(this));
        } else {
            this.f23010f.b();
        }
    }

    public final void v2() {
        qb.f fVar = this.f23010f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }
}
