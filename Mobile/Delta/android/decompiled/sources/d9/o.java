package d9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f14500d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14501a;
    public GoogleSignInAccount b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GoogleSignInOptions f14502c;

    public o(Context context) {
        b bVarB = b.b(context);
        this.f14501a = bVarB;
        this.b = bVarB.c();
        this.f14502c = bVarB.d();
    }

    public static synchronized o a(@NonNull Context context) {
        return d(context.getApplicationContext());
    }

    public static synchronized o d(Context context) {
        o oVar = f14500d;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(context);
        f14500d = oVar2;
        return oVar2;
    }

    public final synchronized void b() {
        this.f14501a.a();
        this.b = null;
        this.f14502c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f14501a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.f14502c = googleSignInOptions;
    }
}
