package p191i9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p046cb.C1618e;
import p488v9.ThreadFactoryC12109b;

/* JADX INFO: renamed from: i9.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6687b0 {

    /* JADX INFO: renamed from: e */
    public static C6687b0 f25776e;

    /* JADX INFO: renamed from: a */
    public final Context f25777a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f25778b;

    /* JADX INFO: renamed from: c */
    public ServiceConnectionC6711v f25779c = new ServiceConnectionC6711v(this, null);

    /* JADX INFO: renamed from: d */
    public int f25780d = 1;

    public C6687b0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f25778b = scheduledExecutorService;
        this.f25777a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C6687b0 m28793b(Context context) {
        try {
            if (f25776e == null) {
                C1618e.m8186a();
                f25776e = new C6687b0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC12109b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25776e;
    }

    /* JADX INFO: renamed from: c */
    public final Task m28795c(int i10, Bundle bundle) {
        return m28798g(new C6713x(m28797f(), i10, bundle));
    }

    /* JADX INFO: renamed from: d */
    public final Task m28796d(int i10, Bundle bundle) {
        return m28798g(new C6685a0(m28797f(), i10, bundle));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized int m28797f() {
        int i10;
        i10 = this.f25780d;
        this.f25780d = i10 + 1;
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Task m28798g(AbstractC6714y abstractC6714y) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(abstractC6714y.toString()));
            }
            if (!this.f25779c.m28807g(abstractC6714y)) {
                ServiceConnectionC6711v serviceConnectionC6711v = new ServiceConnectionC6711v(this, null);
                this.f25779c = serviceConnectionC6711v;
                serviceConnectionC6711v.m28807g(abstractC6714y);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return abstractC6714y.f25822b.m42326a();
    }
}
