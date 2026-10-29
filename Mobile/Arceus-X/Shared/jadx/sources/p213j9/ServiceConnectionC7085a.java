package p213j9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p305n9.C8953m;

/* JADX INFO: renamed from: j9.a */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC7085a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f27681a = false;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f27682b = new LinkedBlockingQueue();

    @NonNull
    /* JADX INFO: renamed from: a */
    public IBinder m29845a(long j10, @NonNull TimeUnit timeUnit) throws TimeoutException {
        C8953m.m36046k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f27681a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f27681a = true;
        IBinder iBinder = (IBinder) this.f27682b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f27682b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
