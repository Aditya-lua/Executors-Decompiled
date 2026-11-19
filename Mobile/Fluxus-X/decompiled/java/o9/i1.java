package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f26983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f26984h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(d dVar, int i10, IBinder iBinder, Bundle bundle) {
        super(dVar, i10, bundle);
        Objects.requireNonNull(dVar);
        this.f26984h = dVar;
        this.f26983g = iBinder;
    }

    @Override // o9.v0
    public final boolean e() {
        try {
            IBinder iBinder = this.f26983g;
            s.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d dVar = this.f26984h;
            if (!dVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = dVar.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = dVar.createServiceInterface(this.f26983g);
            if (iInterfaceCreateServiceInterface == null || !(dVar.zze(2, 4, iInterfaceCreateServiceInterface) || dVar.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            dVar.zzn(null);
            d.a aVarZzk = dVar.zzk();
            Bundle connectionHint = dVar.getConnectionHint();
            if (aVarZzk == null) {
                return true;
            }
            dVar.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // o9.v0
    public final void f(k9.b bVar) {
        d dVar = this.f26984h;
        if (dVar.zzl() != null) {
            dVar.zzl().onConnectionFailed(bVar);
        }
        dVar.onConnectionFailed(bVar);
    }
}
