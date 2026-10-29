package n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25305a;
    public final /* synthetic */ c b;

    public x0(c cVar, int i10) {
        Objects.requireNonNull(cVar);
        this.b = cVar;
        this.f25305a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.b;
        if (iBinder == null) {
            cVar.zzf(16);
            return;
        }
        synchronized (cVar.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new m0(iBinder) : (i) iInterfaceQueryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.zzb(0, null, this.f25305a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.b;
        synchronized (cVar.zzh()) {
            cVar.zzi(null);
        }
        c cVar2 = this.b;
        int i10 = this.f25305a;
        Handler handler = cVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
