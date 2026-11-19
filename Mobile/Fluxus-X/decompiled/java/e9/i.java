package e9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o9.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInOptions f13248e;

    public i(Context context, Looper looper, o9.f fVar, GoogleSignInOptions googleSignInOptions, l9.h.a aVar, l9.h.b bVar) {
        super(context, looper, 91, fVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(za.r.a());
        if (!fVar.d().isEmpty()) {
            Iterator<Scope> it = fVar.d().iterator();
            while (it.hasNext()) {
                aVar2.d(it.next(), new Scope[0]);
            }
        }
        this.f13248e = aVar2.a();
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new u(iBinder);
    }

    public final GoogleSignInOptions g() {
        return this.f13248e;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
