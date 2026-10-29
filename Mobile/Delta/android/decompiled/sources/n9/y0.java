package n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f25308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f25309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        Objects.requireNonNull(cVar);
        this.f25309h = cVar;
        this.f25308g = iBinder;
    }

    @Override // n9.l0
    public final boolean e() {
        try {
            IBinder iBinder = this.f25308g;
            m.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            c cVar = this.f25309h;
            if (!cVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = cVar.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = cVar.createServiceInterface(this.f25308g);
            if (iInterfaceCreateServiceInterface == null || !(cVar.zze(2, 4, iInterfaceCreateServiceInterface) || cVar.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            cVar.zzn(null);
            c.a aVarZzk = cVar.zzk();
            Bundle connectionHint = cVar.getConnectionHint();
            if (aVarZzk == null) {
                return true;
            }
            cVar.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // n9.l0
    public final void f(ConnectionResult connectionResult) {
        c cVar = this.f25309h;
        if (cVar.zzl() != null) {
            cVar.zzl().onConnectionFailed(connectionResult);
        }
        cVar.onConnectionFailed(connectionResult);
    }
}
