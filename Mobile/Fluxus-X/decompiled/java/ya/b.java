package ya;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import m9.e;
import m9.n;
import o9.f;
import o9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f37713e;

    public b(Context context, Looper looper, f fVar, z8.c cVar, e eVar, n nVar) {
        super(context, looper, 16, fVar, eVar, nVar);
        this.f37713e = cVar == null ? new Bundle() : cVar.a();
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f37713e;
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // o9.d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // o9.d
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // o9.d, l9.a.f
    public final boolean requiresSignIn() {
        f fVarD = d();
        return (TextUtils.isEmpty(fVarD.b()) || fVarD.e(z8.b.f39171a).isEmpty()) ? false : true;
    }

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
