package e9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13255a;

    public v(Context context) {
        this.f13255a = context;
    }

    @Override // e9.r
    public final void F() {
        s2();
        c cVarB = c.b(this.f13255a);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f6071q;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        d9.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f13255a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.P();
        } else {
            bVarA.s();
        }
    }

    public final void s2() {
        if (v9.p.a(this.f13255a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // e9.r
    public final void u() {
        s2();
        p.a(this.f13255a).b();
    }
}
