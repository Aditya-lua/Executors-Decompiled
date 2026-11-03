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
    public static final k9.a.AbstractC0391a f23414h = pb.e.f28618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23415a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.a.AbstractC0391a f23416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f23417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n9.d f23418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pb.f f23419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1 f23420g;

    public f1(Context context, Handler handler, @NonNull n9.d dVar) {
        k9.a.AbstractC0391a abstractC0391a = f23414h;
        this.f23415a = context;
        this.b = handler;
        this.f23418e = (n9.d) n9.m.m(dVar, "ClientSettings must not be null");
        this.f23417d = dVar.h();
        this.f23416c = abstractC0391a;
    }

    public static /* bridge */ /* synthetic */ void t2(f1 f1Var, zak zakVar) {
        ConnectionResult connectionResultV3 = zakVar.v3();
        if (connectionResultV3.A3()) {
            zav zavVar = (zav) n9.m.l(zakVar.w3());
            ConnectionResult connectionResultV4 = zavVar.v3();
            if (!connectionResultV4.A3()) {
                String strValueOf = String.valueOf(connectionResultV4);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                f1Var.f23420g.c(connectionResultV4);
                f1Var.f23419f.disconnect();
                return;
            }
            f1Var.f23420g.b(zavVar.w3(), f1Var.f23417d);
        } else {
            f1Var.f23420g.c(connectionResultV3);
        }
        f1Var.f23419f.disconnect();
    }

    @Override // qb.e
    public final void F(zak zakVar) {
        this.b.post(new d1(this, zakVar));
    }

    @Override // l9.e
    public final void onConnected(Bundle bundle) {
        this.f23419f.c(this);
    }

    @Override // l9.n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f23420g.c(connectionResult);
    }

    @Override // l9.e
    public final void onConnectionSuspended(int i10) {
        this.f23420g.d(i10);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k9.a$f, pb.f] */
    public final void u2(e1 e1Var) {
        pb.f fVar = this.f23419f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f23418e.m(Integer.valueOf(System.identityHashCode(this)));
        k9.a.AbstractC0391a abstractC0391a = this.f23416c;
        Context context = this.f23415a;
        Handler handler = this.b;
        n9.d dVar = this.f23418e;
        this.f23419f = abstractC0391a.a(context, handler.getLooper(), dVar, dVar.j(), this, this);
        this.f23420g = e1Var;
        Set set = this.f23417d;
        if (set == null || set.isEmpty()) {
            this.b.post(new c1(this));
        } else {
            this.f23419f.a();
        }
    }

    public final void v2() {
        pb.f fVar = this.f23419f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }
}
