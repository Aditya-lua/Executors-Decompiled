package ha;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.PlayerEntity;
import gb.t0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gb.c f18128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PlayerEntity f18130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f18131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18132i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f18133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f18134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ea.x f18135q;

    public c(Context context, Looper looper, o9.f fVar, ea.x xVar, m9.e eVar, m9.n nVar, j jVar) {
        super(context, looper, 1, fVar, eVar, nVar);
        this.f18128e = new s(this);
        this.f18132i = false;
        this.f18129f = fVar.g();
        this.f18134p = (j) o9.s.l(jVar);
        i iVarB = i.b(this, fVar.f());
        this.f18131h = iVarB;
        this.f18133o = hashCode();
        this.f18135q = xVar;
        if (fVar.i() != null || (context instanceof Activity)) {
            iVarB.f(fVar.i());
        }
    }

    public static void k(RemoteException remoteException) {
        t0.e("GamesGmsClientImpl", "service died", remoteException);
    }

    @Override // o9.i, l9.a.f
    public final Set c() {
        return getScopes();
    }

    @Override // o9.d, l9.a.f
    public final void connect(o9.d.c cVar) {
        this.f18130g = null;
        super.connect(cVar);
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o9.d, l9.a.f
    public final void disconnect() {
        this.f18132i = false;
        if (isConnected()) {
            try {
                this.f18128e.a();
                ((h) getService()).u2(this.f18133o);
            } catch (RemoteException unused) {
                t0.d("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(tb.k kVar, boolean z10) {
        try {
            ((h) getService()).z2(new x(kVar), z10);
        } catch (SecurityException e10) {
            ea.h.a(kVar, e10);
        }
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return ea.s.f13287j;
    }

    @Override // o9.d
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        String string = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
        ea.x xVar = this.f18135q;
        boolean z10 = xVar.b;
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", xVar.f13294e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", xVar.f13296g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        bundle.putString("com.google.android.gms.games.key.gameRunToken", xVar.f13303n);
        bundle.putBoolean("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest", false);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f18129f);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", string);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f18131h.d()));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", rb.a.g(d()));
        return bundle;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(tb.k kVar, String str) {
        w wVar = kVar == null ? null : new w(kVar);
        try {
            h hVar = (h) getService();
            i iVar = this.f18131h;
            hVar.y2(wVar, str, iVar.d(), iVar.c());
        } catch (SecurityException e10) {
            ea.h.a(kVar, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            if (this.f18135q.f13304o.b() && this.f18134p.b()) {
                return;
            }
            try {
                ((h) getService()).w2(iBinder, bundle);
                this.f18134p.c();
            } catch (RemoteException e10) {
                k(e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        if (isConnected()) {
            try {
                ((h) getService()).x2();
            } catch (RemoteException e10) {
                k(e10);
            }
        }
    }

    public final void l(o oVar) {
        oVar.c(this.f18131h);
    }

    @Override // o9.d
    public final /* bridge */ /* synthetic */ void onConnectedLocked(@NonNull IInterface iInterface) {
        h hVar = (h) iInterface;
        super.onConnectedLocked(hVar);
        if (this.f18132i) {
            this.f18131h.g();
            this.f18132i = false;
        }
        try {
            hVar.t2(new t(new gb.e(this.f18131h.e())), this.f18133o);
        } catch (RemoteException e10) {
            k(e10);
        }
    }

    @Override // o9.d
    public final void onConnectionFailed(k9.b bVar) {
        super.onConnectionFailed(bVar);
        this.f18132i = false;
    }

    @Override // o9.d
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (i10 == 0) {
            i10 = 0;
            if (bundle != null) {
                bundle.setClassLoader(c.class.getClassLoader());
                this.f18132i = bundle.getBoolean("show_welcome_popup");
                this.f18130g = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            }
        }
        super.onPostInitHandler(i10, iBinder, bundle, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o9.d, l9.a.f
    public final void onUserSignOut(@NonNull o9.d.e eVar) {
        try {
            u uVar = new u(eVar);
            this.f18128e.a();
            try {
                ((h) getService()).v2(new v(uVar));
            } catch (SecurityException unused) {
                uVar.b(ea.f.b(4));
            }
        } catch (RemoteException unused2) {
            eVar.a();
        }
    }

    @Override // o9.d
    public final boolean requiresAccount() {
        return true;
    }

    @Override // o9.d, l9.a.f
    public final boolean requiresSignIn() {
        return !this.f18135q.f13304o.c();
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
