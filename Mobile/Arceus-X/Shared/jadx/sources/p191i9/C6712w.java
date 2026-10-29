package p191i9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* JADX INFO: renamed from: i9.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6712w {

    /* JADX INFO: renamed from: a */
    public final Messenger f25819a;

    /* JADX INFO: renamed from: b */
    public final zzd f25820b;

    public C6712w(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f25819a = new Messenger(iBinder);
            this.f25820b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f25820b = new zzd(iBinder);
            this.f25819a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m28808a(Message message) throws RemoteException {
        Messenger messenger = this.f25819a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f25820b;
        if (zzdVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzdVar.m9136f(message);
    }
}
