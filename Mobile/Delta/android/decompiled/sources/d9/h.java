package d9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInOptions f14496e;

    public h(Context context, Looper looper, n9.d dVar, GoogleSignInOptions googleSignInOptions, k9.f.a aVar, k9.f.b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(ya.r.a());
        if (!dVar.d().isEmpty()) {
            Iterator<Scope> it = dVar.d().iterator();
            while (it.hasNext()) {
                aVar2.d(it.next(), new Scope[0]);
            }
        }
        this.f14496e = aVar2.a();
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof t ? (t) iInterfaceQueryLocalInterface : new t(iBinder);
    }

    public final GoogleSignInOptions g() {
        return this.f14496e;
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // n9.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // n9.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
