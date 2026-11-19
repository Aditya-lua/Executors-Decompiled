package q9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import m9.n;
import o9.f;
import o9.i;
import o9.z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f29948e;

    public e(Context context, Looper looper, f fVar, z zVar, m9.e eVar, n nVar) {
        super(context, looper, 270, fVar, eVar, nVar);
        this.f29948e = zVar;
    }

    @Override // o9.d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // o9.d
    public final k9.d[] getApiFeatures() {
        return cb.f.b;
    }

    @Override // o9.d
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f29948e.b();
    }

    @Override // o9.d, l9.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // o9.d
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // o9.d
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // o9.d
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
