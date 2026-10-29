package p072d9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: renamed from: d9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4487o {

    /* JADX INFO: renamed from: d */
    public static C4487o f18525d;

    /* JADX INFO: renamed from: a */
    public final C4474b f18526a;

    /* JADX INFO: renamed from: b */
    public GoogleSignInAccount f18527b;

    /* JADX INFO: renamed from: c */
    public GoogleSignInOptions f18528c;

    public C4487o(Context context) {
        C4474b c4474bM22423b = C4474b.m22423b(context);
        this.f18526a = c4474bM22423b;
        this.f18527b = c4474bM22423b.m22426c();
        this.f18528c = c4474bM22423b.m22427d();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C4487o m22442a(@NonNull Context context) {
        return m22443d(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C4487o m22443d(Context context) {
        C4487o c4487o = f18525d;
        if (c4487o != null) {
            return c4487o;
        }
        C4487o c4487o2 = new C4487o(context);
        f18525d = c4487o2;
        return c4487o2;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m22444b() {
        this.f18526a.m22425a();
        this.f18527b = null;
        this.f18528c = null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m22445c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f18526a.m22429f(googleSignInAccount, googleSignInOptions);
        this.f18527b = googleSignInAccount;
        this.f18528c = googleSignInOptions;
    }
}
