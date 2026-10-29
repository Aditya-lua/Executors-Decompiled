package p376qb;

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
import p072d9.C4474b;
import p242k9.AbstractC7496f;
import p305n9.AbstractC8923c;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p305n9.C8953m;
import p356pb.InterfaceC10192f;

/* JADX INFO: renamed from: qb.a */
/* JADX INFO: loaded from: classes.dex */
public class C10486a extends AbstractC8929e<C10491f> implements InterfaceC10192f {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f37701i = 0;

    /* JADX INFO: renamed from: e */
    public final boolean f37702e;

    /* JADX INFO: renamed from: f */
    public final C8926d f37703f;

    /* JADX INFO: renamed from: g */
    public final Bundle f37704g;

    /* JADX INFO: renamed from: h */
    public final Integer f37705h;

    public C10486a(@NonNull Context context, @NonNull Looper looper, boolean z10, @NonNull C8926d c8926d, @NonNull Bundle bundle, @NonNull AbstractC7496f.a aVar, @NonNull AbstractC7496f.b bVar) {
        super(context, looper, 44, c8926d, aVar, bVar);
        this.f37702e = true;
        this.f37703f = c8926d;
        this.f37704g = bundle;
        this.f37705h = c8926d.m35967k();
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static Bundle m40295g(@NonNull C8926d c8926d) {
        c8926d.m35966j();
        Integer numM35967k = c8926d.m35967k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c8926d.m35957a());
        if (numM35967k != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numM35967k.intValue());
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

    @Override // p356pb.InterfaceC10192f
    /* JADX INFO: renamed from: a */
    public final void mo39205a() {
        connect(new AbstractC8923c.d(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p356pb.InterfaceC10192f
    /* JADX INFO: renamed from: c */
    public final void mo39206c(InterfaceC10490e interfaceC10490e) {
        C8953m.m36048m(interfaceC10490e, "Expecting a valid ISignInCallbacks");
        try {
            Account accountM35959c = this.f37703f.m35959c();
            ((C10491f) getService()).m40296u2(new zai(1, new zat(accountM35959c, ((Integer) C8953m.m36047l(this.f37705h)).intValue(), "<<default account>>".equals(accountM35959c.name) ? C4474b.m22423b(getContext()).m22426c() : null)), interfaceC10490e);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC10490e.mo33166F(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final /* synthetic */ IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C10491f ? (C10491f) iInterfaceQueryLocalInterface : new C10491f(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f37703f.m35963g())) {
            this.f37704g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f37703f.m35963g());
        }
        return this.f37704g;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p305n9.AbstractC8923c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final boolean requiresSignIn() {
        return this.f37702e;
    }
}
