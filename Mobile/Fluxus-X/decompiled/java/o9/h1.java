package o9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26980a;
    public final /* synthetic */ d b;

    public h1(d dVar, int i10) {
        Objects.requireNonNull(dVar);
        this.b = dVar;
        this.f26980a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.b;
        if (iBinder == null) {
            dVar.zzf(16);
            return;
        }
        synchronized (dVar.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dVar.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new w0(iBinder) : (n) iInterfaceQueryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.zzb(0, null, this.f26980a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.b;
        synchronized (dVar.zzh()) {
            dVar.zzi(null);
        }
        d dVar2 = this.b;
        int i10 = this.f26980a;
        Handler handler = dVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
