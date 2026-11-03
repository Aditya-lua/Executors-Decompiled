package ga;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.games_v2.zzaf;
import fb.s0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fb.c f18491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PlayerEntity f18493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f18494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18495i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f18496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f18497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final da.o f18498q;

    public c(Context context, Looper looper, n9.d dVar, da.o oVar, l9.e eVar, l9.n nVar, j jVar) {
        super(context, looper, 1, dVar, eVar, nVar);
        this.f18491e = new r(this);
        this.f18495i = false;
        this.f18492f = dVar.g();
        this.f18497p = (j) n9.m.l(jVar);
        i iVarB = i.b(this, dVar.f());
        this.f18494h = iVarB;
        this.f18496o = hashCode();
        this.f18498q = oVar;
        if (dVar.i() != null || (context instanceof Activity)) {
            iVarB.f(dVar.i());
        }
    }

    public static void k(RemoteException remoteException) {
        s0.e("GamesGmsClientImpl", "service died", remoteException);
    }

    @Override // n9.e, k9.a.f
    public final Set b() {
        return getScopes();
    }

    @Override // n9.c, k9.a.f
    public final void connect(n9.c.InterfaceC0461c interfaceC0461c) {
        this.f18493g = null;
        super.connect(interfaceC0461c);
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9.c, k9.a.f
    public final void disconnect() {
        this.f18495i = false;
        if (isConnected()) {
            try {
                this.f18491e.a();
                ((h) getService()).u2(this.f18496o);
            } catch (RemoteException unused) {
                s0.d("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(sb.k kVar, boolean z10) {
        try {
            ((h) getService()).z2(new w(kVar), z10);
        } catch (SecurityException e10) {
            da.f.a(kVar, e10);
        }
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return da.j.f14496j;
    }

    @Override // n9.c
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        String string = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
        da.o oVar = this.f18498q;
        boolean z10 = oVar.b;
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", oVar.f14503e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", oVar.f14505g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        bundle.putString("com.google.android.gms.games.key.gameRunToken", oVar.f14512n);
        bundle.putBoolean("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest", false);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f18492f);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", string);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f18494h.d()));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", qb.a.g(d()));
        return bundle;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(sb.k kVar, String str) {
        v vVar = kVar == null ? null : new v(kVar);
        try {
            h hVar = (h) getService();
            i iVar = this.f18494h;
            hVar.y2(vVar, str, iVar.d(), iVar.c());
        } catch (SecurityException e10) {
            da.f.a(kVar, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            if (this.f18498q.f14513o.b() && this.f18497p.b()) {
                return;
            }
            try {
                ((h) getService()).w2(iBinder, bundle);
                this.f18497p.c();
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
        oVar.c(this.f18494h);
    }

    @Override // n9.c
    public final /* bridge */ /* synthetic */ void onConnectedLocked(@NonNull IInterface iInterface) {
        h hVar = (h) iInterface;
        super.onConnectedLocked(hVar);
        if (this.f18495i) {
            this.f18494h.g();
            this.f18495i = false;
        }
        try {
            hVar.t2(new s(new zzaf(this.f18494h.e())), this.f18496o);
        } catch (RemoteException e10) {
            k(e10);
        }
    }

    @Override // n9.c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f18495i = false;
    }

    @Override // n9.c
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (i10 == 0) {
            i10 = 0;
            if (bundle != null) {
                bundle.setClassLoader(c.class.getClassLoader());
                this.f18495i = bundle.getBoolean("show_welcome_popup");
                this.f18493g = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            }
        }
        super.onPostInitHandler(i10, iBinder, bundle, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9.c, k9.a.f
    public final void onUserSignOut(@NonNull n9.c.e eVar) {
        try {
            t tVar = new t(eVar);
            this.f18491e.a();
            try {
                ((h) getService()).v2(new u(tVar));
            } catch (SecurityException unused) {
                tVar.b(da.d.b(4));
            }
        } catch (RemoteException unused2) {
            eVar.a();
        }
    }

    @Override // n9.c
    public final boolean requiresAccount() {
        return true;
    }

    @Override // n9.c, k9.a.f
    public final boolean requiresSignIn() {
        return !this.f18498q.f14513o.c();
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
