package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p072d9.C4487o;
import p072d9.C4496x;
import p093e4.ActivityC4831q;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends ActivityC4831q {

    /* JADX INFO: renamed from: H */
    public static boolean f7338H;

    /* JADX INFO: renamed from: C */
    public boolean f7339C = false;

    /* JADX INFO: renamed from: D */
    public SignInConfiguration f7340D;

    /* JADX INFO: renamed from: E */
    public boolean f7341E;

    /* JADX INFO: renamed from: F */
    public int f7342F;

    /* JADX INFO: renamed from: G */
    public Intent f7343G;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f7339C) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m9103v3() != null) {
                GoogleSignInAccount googleSignInAccountM9103v3 = signInAccount.m9103v3();
                if (googleSignInAccountM9103v3 == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    m9109v1(12500);
                    return;
                }
                C4487o.m22442a(this).m22445c(this.f7340D.m9105v3(), googleSignInAccountM9103v3);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountM9103v3);
                this.f7341E = true;
                this.f7342F = i11;
                this.f7343G = intent;
                m9108u1();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m9109v1(intExtra);
                return;
            }
        }
        m9109v1(8);
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            m9109v1(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            m9109v1(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f7340D = signInConfiguration;
        if (bundle == null) {
            if (f7338H) {
                setResult(0);
                m9109v1(12502);
                return;
            } else {
                f7338H = true;
                m9110w1(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f7341E = z10;
        if (z10) {
            this.f7342F = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f7343G = intent2;
                m9108u1();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // p093e4.ActivityC4831q, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f7338H = false;
    }

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f7341E);
        if (this.f7341E) {
            bundle.putInt("signInResultCode", this.f7342F);
            bundle.putParcelable("signInResultData", this.f7343G);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m9108u1() {
        m23361m1().mo34116c(0, null, new C4496x(this, null));
        f7338H = false;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m9109v1(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f7338H = false;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m9110w1(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f7340D);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f7339C = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m9109v1(17);
        }
    }
}
