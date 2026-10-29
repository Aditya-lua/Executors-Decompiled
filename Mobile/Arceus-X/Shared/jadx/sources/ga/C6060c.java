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
import java.util.Set;
import p073da.C4500d;
import p073da.C4502f;
import p073da.C4506j;
import p073da.C4511o;
import p125fb.AbstractC5504c;
import p125fb.C5560s0;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8923c;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p305n9.C8953m;
import p376qb.C10486a;
import sb.C11264k;

/* JADX INFO: renamed from: ga.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6060c extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final AbstractC5504c f23345e;

    /* JADX INFO: renamed from: f */
    public final String f23346f;

    /* JADX INFO: renamed from: g */
    public PlayerEntity f23347g;

    /* JADX INFO: renamed from: h */
    public final ViewOnAttachStateChangeListenerC6066i f23348h;

    /* JADX INFO: renamed from: i */
    public boolean f23349i;

    /* JADX INFO: renamed from: o */
    public final long f23350o;

    /* JADX INFO: renamed from: p */
    public final C6067j f23351p;

    /* JADX INFO: renamed from: q */
    public final C4511o f23352q;

    public C6060c(Context context, Looper looper, C8926d c8926d, C4511o c4511o, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n, C6067j c6067j) {
        super(context, looper, 1, c8926d, interfaceC8030e, interfaceC8057n);
        this.f23345e = new C6075r(this);
        this.f23349i = false;
        this.f23346f = c8926d.m35963g();
        this.f23351p = (C6067j) C8953m.m36047l(c6067j);
        ViewOnAttachStateChangeListenerC6066i viewOnAttachStateChangeListenerC6066iM26914b = ViewOnAttachStateChangeListenerC6066i.m26914b(this, c8926d.m35962f());
        this.f23348h = viewOnAttachStateChangeListenerC6066iM26914b;
        this.f23350o = hashCode();
        this.f23352q = c4511o;
        if (c8926d.m35965i() != null || (context instanceof Activity)) {
            viewOnAttachStateChangeListenerC6066iM26914b.m26919f(c8926d.m35965i());
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m26900k(RemoteException remoteException) {
        C5560s0.m25224e("GamesGmsClientImpl", "service died", remoteException);
    }

    @Override // p305n9.AbstractC8929e, p242k9.C7491a.f
    /* JADX INFO: renamed from: b */
    public final Set mo26901b() {
        return getScopes();
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final void connect(AbstractC8923c.c cVar) {
        this.f23347g = null;
        super.connect(cVar);
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterfaceQueryLocalInterface instanceof C6065h ? (C6065h) iInterfaceQueryLocalInterface : new C6065h(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final void disconnect() {
        this.f23349i = false;
        if (isConnected()) {
            try {
                this.f23345e.m25168a();
                ((C6065h) getService()).m26908u2(this.f23350o);
            } catch (RemoteException unused) {
                C5560s0.m25223d("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m26902g(C11264k c11264k, boolean z10) {
        try {
            ((C6065h) getService()).m26913z2(new BinderC6080w(c11264k), z10);
        } catch (SecurityException e10) {
            C4502f.m22463a(c11264k, e10);
        }
    }

    @Override // p305n9.AbstractC8923c
    public final Feature[] getApiFeatures() {
        return C4506j.f18545j;
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // p305n9.AbstractC8923c
    public final Bundle getGetServiceRequestExtraArgs() {
        String string = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
        C4511o c4511o = this.f23352q;
        boolean z10 = c4511o.f18551b;
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", c4511o.f18554e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", c4511o.f18556g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        bundle.putString("com.google.android.gms.games.key.gameRunToken", c4511o.f18563n);
        bundle.putBoolean("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest", false);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f23346f);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", string);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f23348h.m26917d()));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", C10486a.m40295g(m35979d()));
        return bundle;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m26903h(C11264k c11264k, String str) {
        BinderC6079v binderC6079v = c11264k == null ? null : new BinderC6079v(c11264k);
        try {
            C6065h c6065h = (C6065h) getService();
            ViewOnAttachStateChangeListenerC6066i viewOnAttachStateChangeListenerC6066i = this.f23348h;
            c6065h.m26912y2(binderC6079v, str, viewOnAttachStateChangeListenerC6066i.m26917d(), viewOnAttachStateChangeListenerC6066i.m26916c());
        } catch (SecurityException e10) {
            C4502f.m22463a(c11264k, e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m26904i(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            if (this.f23352q.f18564o.m26942b() && this.f23351p.m26923b()) {
                return;
            }
            try {
                ((C6065h) getService()).m26910w2(iBinder, bundle);
                this.f23351p.m26924c();
            } catch (RemoteException e10) {
                m26900k(e10);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m26905j() {
        if (isConnected()) {
            try {
                ((C6065h) getService()).m26911x2();
            } catch (RemoteException e10) {
                m26900k(e10);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m26906l(C6072o c6072o) {
        c6072o.m26927c(this.f23348h);
    }

    @Override // p305n9.AbstractC8923c
    public final /* bridge */ /* synthetic */ void onConnectedLocked(@NonNull IInterface iInterface) {
        C6065h c6065h = (C6065h) iInterface;
        super.onConnectedLocked(c6065h);
        if (this.f23349i) {
            this.f23348h.m26920g();
            this.f23349i = false;
        }
        try {
            c6065h.m26907t2(new BinderC6076s(new zzaf(this.f23348h.m26918e())), this.f23350o);
        } catch (RemoteException e10) {
            m26900k(e10);
        }
    }

    @Override // p305n9.AbstractC8923c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f23349i = false;
    }

    @Override // p305n9.AbstractC8923c
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (i10 == 0) {
            i10 = 0;
            if (bundle != null) {
                bundle.setClassLoader(C6060c.class.getClassLoader());
                this.f23349i = bundle.getBoolean("show_welcome_popup");
                this.f23347g = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            }
        }
        super.onPostInitHandler(i10, iBinder, bundle, i11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final void onUserSignOut(@NonNull AbstractC8923c.e eVar) {
        try {
            C6077t c6077t = new C6077t(eVar);
            this.f23345e.m25168a();
            try {
                ((C6065h) getService()).m26909v2(new BinderC6078u(c6077t));
            } catch (SecurityException unused) {
                c6077t.mo9182b(C4500d.m22460b(4));
            }
        } catch (RemoteException unused2) {
            eVar.mo33183a();
        }
    }

    @Override // p305n9.AbstractC8923c
    public final boolean requiresAccount() {
        return true;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final boolean requiresSignIn() {
        return !this.f23352q.f18564o.m26943c();
    }

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
