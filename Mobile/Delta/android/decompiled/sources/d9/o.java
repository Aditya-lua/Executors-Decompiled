package d9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f14480d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14481a;
    public GoogleSignInAccount b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GoogleSignInOptions f14482c;

    public o(Context context) {
        b bVarB = b.b(context);
        this.f14481a = bVarB;
        this.b = bVarB.c();
        this.f14482c = bVarB.d();
    }

    public static synchronized o a(@NonNull Context context) {
        return d(context.getApplicationContext());
    }

    public static synchronized o d(Context context) {
        o oVar = f14480d;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(context);
        f14480d = oVar2;
        return oVar2;
    }

    public final synchronized void b() {
        this.f14481a.a();
        this.b = null;
        this.f14482c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f14481a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.f14482c = googleSignInOptions;
    }
}
