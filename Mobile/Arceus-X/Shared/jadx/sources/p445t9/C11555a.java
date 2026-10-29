package p445t9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p305n9.C8953m;
import p305n9.InterfaceC8943i1;
import p462u9.C11822m;
import p511w9.C12327c;

/* JADX INFO: renamed from: t9.a */
/* JADX INFO: loaded from: classes.dex */
public class C11555a {

    /* JADX INFO: renamed from: b */
    public static final Object f40916b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C11555a f40917c;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConcurrentHashMap f40918a = new ConcurrentHashMap();

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C11555a m43201b() {
        if (f40917c == null) {
            synchronized (f40916b) {
                try {
                    if (f40917c == null) {
                        f40917c = new C11555a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C11555a c11555a = f40917c;
        C8953m.m36047l(c11555a);
        return c11555a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m43202f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC8943i1);
    }

    /* JADX INFO: renamed from: g */
    public static void m43203g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m43204h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!C11822m.m44202i() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    /* JADX INFO: renamed from: a */
    public boolean m43205a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i10) {
        return m43208e(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* JADX INFO: renamed from: c */
    public void m43206c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (m43202f(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f40918a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    m43203g(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f40918a.remove(serviceConnection);
                }
            }
        }
        m43203g(context, serviceConnection);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43207d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i10, Executor executor) {
        return m43208e(context, str, intent, serviceConnection, 4225, true, executor);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m43208e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C12327c.m46181a(context).m46176c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m43202f(serviceConnection)) {
            return m43204h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f40918a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zM43204h = m43204h(context, intent, serviceConnection, i10, executor);
            if (zM43204h) {
                return zM43204h;
            }
            this.f40918a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            this.f40918a.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }
}
