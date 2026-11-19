package e9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f13252d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13253a;
    public GoogleSignInAccount b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GoogleSignInOptions f13254c;

    public p(Context context) {
        c cVarB = c.b(context);
        this.f13253a = cVarB;
        this.b = cVarB.c();
        this.f13254c = cVarB.d();
    }

    public static synchronized p a(@NonNull Context context) {
        return d(context.getApplicationContext());
    }

    public static synchronized p d(Context context) {
        p pVar = f13252d;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(context);
        f13252d = pVar2;
        return pVar2;
    }

    public final synchronized void b() {
        this.f13253a.a();
        this.b = null;
        this.f13254c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f13253a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.f13254c = googleSignInOptions;
    }
}
