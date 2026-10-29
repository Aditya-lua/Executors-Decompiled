package p305n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: renamed from: n9.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC8978x0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f32647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8923c f32648b;

    public ServiceConnectionC8978x0(AbstractC8923c abstractC8923c, int i10) {
        Objects.requireNonNull(abstractC8923c);
        this.f32648b = abstractC8923c;
        this.f32647a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC8923c abstractC8923c = this.f32648b;
        if (iBinder == null) {
            abstractC8923c.zzf(16);
            return;
        }
        synchronized (abstractC8923c.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC8923c.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8941i)) ? new C8954m0(iBinder) : (InterfaceC8941i) iInterfaceQueryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32648b.zzb(0, null, this.f32647a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC8923c abstractC8923c = this.f32648b;
        synchronized (abstractC8923c.zzh()) {
            abstractC8923c.zzi(null);
        }
        AbstractC8923c abstractC8923c2 = this.f32648b;
        int i10 = this.f32647a;
        Handler handler = abstractC8923c2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
