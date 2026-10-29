package p268l9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p242k9.AbstractC7496f;
import p242k9.C7491a;
import p305n9.C8926d;
import p305n9.C8953m;
import p356pb.C10191e;
import p356pb.InterfaceC10192f;
import p376qb.BinderC10488c;

/* JADX INFO: renamed from: l9.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8035f1 extends BinderC10488c implements AbstractC7496f.a, AbstractC7496f.b {

    /* JADX INFO: renamed from: h */
    public static final C7491a.a f30010h = C10191e.f36765c;

    /* JADX INFO: renamed from: a */
    public final Context f30011a;

    /* JADX INFO: renamed from: b */
    public final Handler f30012b;

    /* JADX INFO: renamed from: c */
    public final C7491a.a f30013c;

    /* JADX INFO: renamed from: d */
    public final Set f30014d;

    /* JADX INFO: renamed from: e */
    public final C8926d f30015e;

    /* JADX INFO: renamed from: f */
    public InterfaceC10192f f30016f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8032e1 f30017g;

    public BinderC8035f1(Context context, Handler handler, @NonNull C8926d c8926d) {
        C7491a.a aVar = f30010h;
        this.f30011a = context;
        this.f30012b = handler;
        this.f30015e = (C8926d) C8953m.m36048m(c8926d, "ClientSettings must not be null");
        this.f30014d = c8926d.m35964h();
        this.f30013c = aVar;
    }

    /* JADX INFO: renamed from: t2 */
    public static /* bridge */ /* synthetic */ void m33165t2(BinderC8035f1 binderC8035f1, zak zakVar) {
        ConnectionResult connectionResultM11885v3 = zakVar.m11885v3();
        if (connectionResultM11885v3.m9138A3()) {
            zav zavVar = (zav) C8953m.m36047l(zakVar.m11886w3());
            ConnectionResult connectionResultM9220v3 = zavVar.m9220v3();
            if (!connectionResultM9220v3.m9138A3()) {
                String strValueOf = String.valueOf(connectionResultM9220v3);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                binderC8035f1.f30017g.mo33126c(connectionResultM9220v3);
                binderC8035f1.f30016f.disconnect();
                return;
            }
            binderC8035f1.f30017g.mo33125b(zavVar.m9221w3(), binderC8035f1.f30014d);
        } else {
            binderC8035f1.f30017g.mo33126c(connectionResultM11885v3);
        }
        binderC8035f1.f30016f.disconnect();
    }

    @Override // p376qb.InterfaceC10490e
    /* JADX INFO: renamed from: F */
    public final void mo33166F(zak zakVar) {
        this.f30012b.post(new RunnableC8029d1(this, zakVar));
    }

    @Override // p268l9.InterfaceC8030e
    public final void onConnected(Bundle bundle) {
        this.f30016f.mo39206c(this);
    }

    @Override // p268l9.InterfaceC8057n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f30017g.mo33126c(connectionResult);
    }

    @Override // p268l9.InterfaceC8030e
    public final void onConnectionSuspended(int i10) {
        this.f30017g.mo33127d(i10);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k9.a$f, pb.f] */
    /* JADX INFO: renamed from: u2 */
    public final void m33167u2(InterfaceC8032e1 interfaceC8032e1) {
        InterfaceC10192f interfaceC10192f = this.f30016f;
        if (interfaceC10192f != null) {
            interfaceC10192f.disconnect();
        }
        this.f30015e.m35969m(Integer.valueOf(System.identityHashCode(this)));
        C7491a.a aVar = this.f30013c;
        Context context = this.f30011a;
        Handler handler = this.f30012b;
        C8926d c8926d = this.f30015e;
        this.f30016f = aVar.mo23559a(context, handler.getLooper(), c8926d, c8926d.m35966j(), this, this);
        this.f30017g = interfaceC8032e1;
        Set set = this.f30014d;
        if (set == null || set.isEmpty()) {
            this.f30012b.post(new RunnableC8026c1(this));
        } else {
            this.f30016f.mo39205a();
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m33168v2() {
        InterfaceC10192f interfaceC10192f = this.f30016f;
        if (interfaceC10192f != null) {
            interfaceC10192f.disconnect();
        }
    }
}
