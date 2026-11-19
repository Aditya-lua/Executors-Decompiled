package j9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d0 f20217e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20218a;
    public final ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f20219c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20220d = 1;

    public d0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.f20218a = context.getApplicationContext();
    }

    public static synchronized d0 b(Context context) {
        try {
            if (f20217e == null) {
                db.e.a();
                f20217e = new d0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w9.b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20217e;
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new c0(f(), i10, bundle));
    }

    public final synchronized int f() {
        int i10;
        i10 = this.f20220d;
        this.f20220d = i10 + 1;
        return i10;
    }

    public final synchronized Task g(a0 a0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a0Var.toString()));
            }
            if (!this.f20219c.g(a0Var)) {
                x xVar = new x(this, null);
                this.f20219c = xVar;
                xVar.g(a0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a0Var.b.a();
    }
}
