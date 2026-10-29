package qb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class a extends n9.e<f> implements pb.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f29295i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n9.d f29297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f29298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f29299h;

    public a(@NonNull Context context, @NonNull Looper looper, boolean z10, @NonNull n9.d dVar, @NonNull Bundle bundle, @NonNull k9.f.a aVar, @NonNull k9.f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f29296e = true;
        this.f29297f = dVar;
        this.f29298g = bundle;
        this.f29299h = dVar.k();
    }

    @NonNull
    public static Bundle g(@NonNull n9.d dVar) {
        dVar.j();
        Integer numK = dVar.k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
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

    @Override // pb.f
    public final void a() {
        connect(new n9.c.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pb.f
    public final void c(e eVar) {
        m.m(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f29297f.c();
            ((f) getService()).u2(new zai(1, new zat(accountC, ((Integer) m.l(this.f29299h)).intValue(), "<<default account>>".equals(accountC.name) ? d9.b.b(getContext()).c() : null)), eVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.F(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // n9.c
    @NonNull
    public final /* synthetic */ IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder);
    }

    @Override // n9.c
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f29297f.g())) {
            this.f29298g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f29297f.g());
        }
        return this.f29298g;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // n9.c, k9.a.f
    public final boolean requiresSignIn() {
        return this.f29296e;
    }
}
