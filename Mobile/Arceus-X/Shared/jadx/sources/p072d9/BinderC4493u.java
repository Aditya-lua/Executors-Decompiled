package p072d9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C1886a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p045c9.C1569b;
import p462u9.C11825p;

/* JADX INFO: renamed from: d9.u */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4493u extends AbstractBinderC4488p {

    /* JADX INFO: renamed from: a */
    public final Context f18529a;

    public BinderC4493u(Context context) {
        this.f18529a = context;
    }

    @Override // p072d9.InterfaceC4489q
    /* JADX INFO: renamed from: E */
    public final void mo22447E() {
        m22451s2();
        C4474b c4474bM22423b = C4474b.m22423b(this.f18529a);
        GoogleSignInAccount googleSignInAccountM22426c = c4474bM22423b.m22426c();
        GoogleSignInOptions googleSignInOptionsM22427d = GoogleSignInOptions.f7302q;
        if (googleSignInAccountM22426c != null) {
            googleSignInOptionsM22427d = c4474bM22423b.m22427d();
        }
        C1569b c1569bM9104a = C1886a.m9104a(this.f18529a, googleSignInOptionsM22427d);
        if (googleSignInAccountM22426c != null) {
            c1569bM9104a.m8179P();
        } else {
            c1569bM9104a.m8181r();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final void m22451s2() {
        if (C11825p.m44208a(this.f18529a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // p072d9.InterfaceC4489q
    /* JADX INFO: renamed from: t */
    public final void mo22448t() {
        m22451s2();
        C4487o.m22442a(this.f18529a).m22444b();
    }
}
