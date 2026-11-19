package rb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import o9.r0;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public class a extends o9.i<g> implements qb.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f30625i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o9.f f30627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f30628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f30629h;

    public a(@NonNull Context context, @NonNull Looper looper, boolean z10, @NonNull o9.f fVar, @NonNull Bundle bundle, @NonNull l9.h.a aVar, @NonNull l9.h.b bVar) {
        super(context, looper, 44, fVar, aVar, bVar);
        this.f30626e = true;
        this.f30627f = fVar;
        this.f30628g = bundle;
        this.f30629h = fVar.k();
    }

    @NonNull
    public static Bundle g(@NonNull o9.f fVar) {
        fVar.j();
        Integer numK = fVar.k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fVar.a());
        if (numK != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numK.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qb.f
    public final void a(f fVar) {
        s.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f30627f.c();
            ((g) getService()).u2(new j(1, new r0(accountC, ((Integer) s.l(this.f30629h)).intValue(), "<<default account>>".equals(accountC.name) ? e9.c.b(getContext()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.o0(new l(1, new k9.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // qb.f
    public final void b() {
        connect(new o9.d.C0542d(this));
    }

    @Override // o9.d
    @NonNull
    public final /* synthetic */ IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // o9.d
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f30627f.g())) {
            this.f30628g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f30627f.g());
        }
        return this.f30628g;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // o9.d, l9.a.f
    public final boolean requiresSignIn() {
        return this.f30626e;
    }
}
