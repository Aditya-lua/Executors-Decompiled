package p305n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: renamed from: n9.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8980y0 extends AbstractC8951l0 {

    /* JADX INFO: renamed from: g */
    public final IBinder f32652g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC8923c f32653h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8980y0(AbstractC8923c abstractC8923c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC8923c, i10, bundle);
        Objects.requireNonNull(abstractC8923c);
        this.f32653h = abstractC8923c;
        this.f32652g = iBinder;
    }

    @Override // p305n9.AbstractC8951l0
    /* JADX INFO: renamed from: e */
    public final boolean mo36033e() {
        try {
            IBinder iBinder = this.f32652g;
            C8953m.m36047l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC8923c abstractC8923c = this.f32653h;
            if (!abstractC8923c.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC8923c.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = abstractC8923c.createServiceInterface(this.f32652g);
            if (iInterfaceCreateServiceInterface == null || !(abstractC8923c.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC8923c.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            abstractC8923c.zzn(null);
            AbstractC8923c.a aVarZzk = abstractC8923c.zzk();
            Bundle connectionHint = abstractC8923c.getConnectionHint();
            if (aVarZzk == null) {
                return true;
            }
            abstractC8923c.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p305n9.AbstractC8951l0
    /* JADX INFO: renamed from: f */
    public final void mo36034f(ConnectionResult connectionResult) {
        AbstractC8923c abstractC8923c = this.f32653h;
        if (abstractC8923c.zzl() != null) {
            abstractC8923c.zzl().onConnectionFailed(connectionResult);
        }
        abstractC8923c.onConnectionFailed(connectionResult);
    }
}
