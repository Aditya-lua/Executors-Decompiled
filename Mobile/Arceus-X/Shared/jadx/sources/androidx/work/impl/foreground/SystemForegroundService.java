package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.p616lifecycle.ServiceC0992y;
import p536x5.AbstractC12732w;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ServiceC0992y implements C1126a.b {

    /* JADX INFO: renamed from: e */
    public static final String f4604e = AbstractC12732w.m47443i("SystemFgService");

    /* JADX INFO: renamed from: f */
    public static SystemForegroundService f4605f = null;

    /* JADX INFO: renamed from: b */
    public boolean f4606b;

    /* JADX INFO: renamed from: c */
    public C1126a f4607c;

    /* JADX INFO: renamed from: d */
    public NotificationManager f4608d;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public static class C1124a {
        /* JADX INFO: renamed from: a */
        public static void m6407a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public static class C1125b {
        /* JADX INFO: renamed from: a */
        public static void m6408a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC12732w.m47441e().mo47452l(SystemForegroundService.f4604e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                AbstractC12732w.m47441e().mo47452l(SystemForegroundService.f4604e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // androidx.work.impl.foreground.C1126a.b
    /* JADX INFO: renamed from: b */
    public void mo6402b(int i10, Notification notification) {
        this.f4608d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.C1126a.b
    /* JADX INFO: renamed from: c */
    public void mo6403c(int i10) {
        this.f4606b = true;
        AbstractC12732w.m47441e().mo47444a(f4604e, "Shutting down.");
        stopForeground(true);
        f4605f = null;
        stopSelf(i10);
    }

    @Override // androidx.work.impl.foreground.C1126a.b
    /* JADX INFO: renamed from: d */
    public void mo6404d(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            C1125b.m6408a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            C1124a.m6407a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.C1126a.b
    /* JADX INFO: renamed from: e */
    public void mo6405e(int i10) {
        this.f4608d.cancel(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m6406g() {
        this.f4608d = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1126a c1126a = new C1126a(getApplicationContext());
        this.f4607c = c1126a;
        c1126a.m6422o(this);
    }

    @Override // androidx.p616lifecycle.ServiceC0992y, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4605f = this;
        m6406g();
    }

    @Override // androidx.p616lifecycle.ServiceC0992y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4607c.m6419l();
    }

    @Override // androidx.p616lifecycle.ServiceC0992y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4606b) {
            AbstractC12732w.m47441e().mo47448f(f4604e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4607c.m6419l();
            m6406g();
            this.f4606b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4607c.m6420m(intent, i11);
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f4607c.m6421n(i10, 2048);
    }

    public void onTimeout(int i10, int i11) {
        this.f4607c.m6421n(i10, i11);
    }
}
