package p193ib;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: renamed from: ib.m */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC6731m implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6733o f25839a;

    public /* synthetic */ ServiceConnectionC6731m(C6733o c6733o, C6732n c6732n) {
        Objects.requireNonNull(c6733o);
        this.f25839a = c6733o;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ib.o.f(ib.o):ib.d */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6733o c6733o = this.f25839a;
        c6733o.f25842b.m28821c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c6733o.m28843c().post(new C6729k(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C6733o c6733o = this.f25839a;
        c6733o.f25842b.m28821c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c6733o.m28843c().post(new C6730l(this));
    }
}
