package p072d9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import p242k9.AbstractC7496f;
import p305n9.AbstractC8929e;
import p305n9.C8926d;
import p572ya.C13161r;

/* JADX INFO: renamed from: d9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4480h extends AbstractC8929e {

    /* JADX INFO: renamed from: e */
    public final GoogleSignInOptions f18521e;

    public C4480h(Context context, Looper looper, C8926d c8926d, GoogleSignInOptions googleSignInOptions, AbstractC7496f.a aVar, AbstractC7496f.b bVar) {
        super(context, looper, 91, c8926d, aVar, bVar);
        GoogleSignInOptions.C1885a c1885a = googleSignInOptions != null ? new GoogleSignInOptions.C1885a(googleSignInOptions) : new GoogleSignInOptions.C1885a();
        c1885a.m9102e(C13161r.m48764a());
        if (!c8926d.m35960d().isEmpty()) {
            Iterator<Scope> it = c8926d.m35960d().iterator();
            while (it.hasNext()) {
                c1885a.m9101d(it.next(), new Scope[0]);
            }
        }
        this.f18521e = c1885a.m9098a();
    }

    @Override // p305n9.AbstractC8923c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C4492t ? (C4492t) iInterfaceQueryLocalInterface : new C4492t(iBinder);
    }

    /* JADX INFO: renamed from: g */
    public final GoogleSignInOptions m22438g() {
        return this.f18521e;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // p305n9.AbstractC8923c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p305n9.AbstractC8923c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
