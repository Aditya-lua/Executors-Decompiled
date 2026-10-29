package p9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import bb.f;
import com.google.android.gms.common.Feature;
import l9.n;
import n9.r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n9.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f28388e;

    public e(Context context, Looper looper, n9.d dVar, r rVar, l9.e eVar, n nVar) {
        super(context, looper, 270, dVar, eVar, nVar);
        this.f28388e = rVar;
    }

    @Override // n9.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // n9.c
    public final Feature[] getApiFeatures() {
        return f.b;
    }

    @Override // n9.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f28388e.b();
    }

    @Override // n9.c, k9.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // n9.c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // n9.c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // n9.c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
