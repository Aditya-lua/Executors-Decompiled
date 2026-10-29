package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.p000lifecycle.y;
import com.google.mlkit.vision.barcode.common.Barcode;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends y implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3522e = w.i("SystemFgService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static SystemForegroundService f3523f = null;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.impl.foreground.a f3524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationManager f3525d;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                w.e().l(SystemForegroundService.f3522e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                w.e().l(SystemForegroundService.f3522e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i10, Notification notification) {
        this.f3525d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10) {
        this.b = true;
        w.e().a(f3522e, "Shutting down.");
        stopForeground(true);
        f3523f = null;
        stopSelf(i10);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b.a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            a.a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i10) {
        this.f3525d.cancel(i10);
    }

    public final void g() {
        this.f3525d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3524c = aVar;
        aVar.o(this);
    }

    @Override // androidx.p000lifecycle.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3523f = this;
        g();
    }

    @Override // androidx.p000lifecycle.y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3524c.l();
    }

    @Override // androidx.p000lifecycle.y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.b) {
            w.e().f(f3522e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f3524c.l();
            g();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3524c.m(intent, i11);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f3524c.n(i10, Barcode.FORMAT_PDF417);
    }

    public void onTimeout(int i10, int i11) {
        this.f3524c.n(i10, i11);
    }
}
