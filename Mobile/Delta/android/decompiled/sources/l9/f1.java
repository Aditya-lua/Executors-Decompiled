package l9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends qb.c implements k9.f.a, k9.f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k9.a.AbstractC0392a f23020h = pb.e.f28399c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23021a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.a.AbstractC0392a f23022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f23023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n9.d f23024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pb.f f23025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1 f23026g;

    public f1(Context context, Handler handler, @NonNull n9.d dVar) {
        k9.a.AbstractC0392a abstractC0392a = f23020h;
        this.f23021a = context;
        this.b = handler;
        this.f23024e = (n9.d) n9.m.m(dVar, "ClientSettings must not be null");
        this.f23023d = dVar.h();
        this.f23022c = abstractC0392a;
    }

    public static /* bridge */ /* synthetic */ void t2(f1 f1Var, zak zakVar) {
        ConnectionResult connectionResultV3 = zakVar.v3();
        if (connectionResultV3.A3()) {
            zav zavVar = (zav) n9.m.l(zakVar.w3());
            ConnectionResult connectionResultV4 = zavVar.v3();
            if (!connectionResultV4.A3()) {
                String strValueOf = String.valueOf(connectionResultV4);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                f1Var.f23026g.c(connectionResultV4);
                f1Var.f23025f.disconnect();
                return;
            }
            f1Var.f23026g.b(zavVar.w3(), f1Var.f23023d);
        } else {
            f1Var.f23026g.c(connectionResultV3);
        }
        f1Var.f23025f.disconnect();
    }

    @Override // qb.e
    public final void F(zak zakVar) {
        this.b.post(new d1(this, zakVar));
    }

    @Override // l9.e
    public final void onConnected(Bundle bundle) {
        this.f23025f.c(this);
    }

    @Override // l9.n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f23026g.c(connectionResult);
    }

    @Override // l9.e
    public final void onConnectionSuspended(int i10) {
        this.f23026g.d(i10);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k9.a$f, pb.f] */
    public final void u2(e1 e1Var) {
        pb.f fVar = this.f23025f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f23024e.m(Integer.valueOf(System.identityHashCode(this)));
        k9.a.AbstractC0392a abstractC0392a = this.f23022c;
        Context context = this.f23021a;
        Handler handler = this.b;
        n9.d dVar = this.f23024e;
        this.f23025f = abstractC0392a.a(context, handler.getLooper(), dVar, dVar.j(), this, this);
        this.f23026g = e1Var;
        Set set = this.f23023d;
        if (set == null || set.isEmpty()) {
            this.b.post(new c1(this));
        } else {
            this.f23025f.a();
        }
    }

    public final void v2() {
        pb.f fVar = this.f23025f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }
}
