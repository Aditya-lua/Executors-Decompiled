package j9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21166a = false;
    public final BlockingQueue b = new LinkedBlockingQueue();

    @NonNull
    public IBinder a(long j10, @NonNull TimeUnit timeUnit) throws TimeoutException {
        n9.m.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f21166a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f21166a = true;
        IBinder iBinder = (IBinder) this.b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
