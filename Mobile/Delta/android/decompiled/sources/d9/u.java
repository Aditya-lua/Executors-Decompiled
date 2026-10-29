package d9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14503a;

    public u(Context context) {
        this.f14503a = context;
    }

    @Override // d9.q
    public final void E() {
        s2();
        b bVarB = b.b(this.f14503a);
        GoogleSignInAccount googleSignInAccountC = bVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f5627q;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = bVarB.d();
        }
        c9.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f14503a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.P();
        } else {
            bVarA.r();
        }
    }

    public final void s2() {
        if (u9.p.a(this.f14503a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // d9.q
    public final void t() {
        s2();
        o.a(this.f14503a).b();
    }
}
