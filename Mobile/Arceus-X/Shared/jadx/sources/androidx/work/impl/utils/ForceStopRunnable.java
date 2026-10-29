package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p007a6.C0078f;
import p120f6.C5390j0;
import p120f6.InterfaceC5372d0;
import p120f6.InterfaceC5393k0;
import p146g6.C6032l;
import p146g6.C6043w;
import p146g6.C6044x;
import p456u2.C11787p;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12732w;
import p536x5.C12717o0;
import p567y5.C13048f1;
import p567y5.C13056i0;
import p567y5.C13096x;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f4622e = AbstractC12732w.m47443i("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f4623f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a */
    public final Context f4624a;

    /* JADX INFO: renamed from: b */
    public final C13048f1 f4625b;

    /* JADX INFO: renamed from: c */
    public final C6043w f4626c;

    /* JADX INFO: renamed from: d */
    public int f4627d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public static final String f4628a = AbstractC12732w.m47443i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC12732w.m47441e().mo47450j(f4628a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.m6425g(context);
        }
    }

    public ForceStopRunnable(Context context, C13048f1 c13048f1) {
        this.f4624a = context.getApplicationContext();
        this.f4625b = c13048f1;
        this.f4626c = c13048f1.m48585q();
    }

    /* JADX INFO: renamed from: c */
    public static Intent m6423c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static PendingIntent m6424d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, m6423c(context), i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m6425g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentM6424d = m6424d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4623f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM6424d);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m6426a() {
        boolean zM192i = C0078f.m192i(this.f4624a, this.f4625b.m48589u());
        WorkDatabase workDatabaseM48589u = this.f4625b.m48589u();
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabaseM48589u.mo6350c0();
        InterfaceC5372d0 interfaceC5372d0Mo6349b0 = workDatabaseM48589u.mo6349b0();
        workDatabaseM48589u.m47272i();
        try {
            List<C5390j0> listMo24799w = interfaceC5393k0Mo6350c0.mo24799w();
            boolean z10 = (listMo24799w == null || listMo24799w.isEmpty()) ? false : true;
            if (z10) {
                for (C5390j0 c5390j0 : listMo24799w) {
                    interfaceC5393k0Mo6350c0.mo24779c(C12717o0.c.ENQUEUED, c5390j0.id);
                    interfaceC5393k0Mo6350c0.mo24781e(c5390j0.id, -512);
                    interfaceC5393k0Mo6350c0.mo24793q(c5390j0.id, -1L);
                }
            }
            interfaceC5372d0Mo6349b0.mo24725c();
            workDatabaseM48589u.m47267V();
            workDatabaseM48589u.m47275p();
            return z10 || zM192i;
        } catch (Throwable th2) {
            workDatabaseM48589u.m47275p();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6427b() {
        boolean zM6426a = m6426a();
        if (m6430h()) {
            AbstractC12732w.m47441e().mo47444a(f4622e, "Rescheduling Workers.");
            this.f4625b.m48592x();
            this.f4625b.m48585q().m26864e(false);
        } else if (m6428e()) {
            AbstractC12732w.m47441e().mo47444a(f4622e, "Application was force-stopped, rescheduling.");
            this.f4625b.m48592x();
            this.f4626c.m26863d(this.f4625b.m48584n().getClock().mo47323a());
        } else if (zM6426a) {
            AbstractC12732w.m47441e().mo47444a(f4622e, "Found unfinished work, scheduling it.");
            C13096x.m48689f(this.f4625b.m48584n(), this.f4625b.m48589u(), this.f4625b.m48587s());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m6428e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentM6424d = m6424d(this.f4624a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentM6424d != null) {
                    pendingIntentM6424d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4624a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jM26861a = this.f4626c.m26861a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoM26834a = C6032l.m26834a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoM26834a.getReason() == 10 && applicationExitInfoM26834a.getTimestamp() >= jM26861a) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentM6424d == null) {
                m6425g(this.f4624a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            AbstractC12732w.m47441e().mo47452l(f4622e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            AbstractC12732w.m47441e().mo47452l(f4622e, "Ignoring exception", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m6429f() {
        C1115a c1115aM48584n = this.f4625b.m48584n();
        if (TextUtils.isEmpty(c1115aM48584n.getDefaultProcessName())) {
            AbstractC12732w.m47441e().mo47444a(f4622e, "The default process name was not specified.");
            return true;
        }
        boolean zM26866b = C6044x.m26866b(this.f4624a, c1115aM48584n);
        AbstractC12732w.m47441e().mo47444a(f4622e, "Is default app process = " + zM26866b);
        return zM26866b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m6430h() {
        return this.f4625b.m48585q().m26862b();
    }

    /* JADX INFO: renamed from: i */
    public void m6431i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (m6429f()) {
                while (true) {
                    try {
                        C13056i0.m48597c(this.f4624a);
                        AbstractC12732w.m47441e().mo47444a(f4622e, "Performing cleanup operations.");
                        try {
                            m6427b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f4627d + 1;
                            this.f4627d = i10;
                            if (i10 >= 3) {
                                String str = C11787p.m44085a(this.f4624a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                AbstractC12732w abstractC12732wM47441e = AbstractC12732w.m47441e();
                                String str2 = f4622e;
                                abstractC12732wM47441e.mo47447d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                InterfaceC12631a<Throwable> interfaceC12631aM6272e = this.f4625b.m48584n().m6272e();
                                if (interfaceC12631aM6272e == null) {
                                    throw illegalStateException;
                                }
                                AbstractC12732w.m47441e().mo47445b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                interfaceC12631aM6272e.accept(illegalStateException);
                                break;
                            }
                            AbstractC12732w.m47441e().mo47445b(f4622e, "Retrying after " + (((long) i10) * 300), e10);
                            m6431i(((long) this.f4627d) * 300);
                        }
                        AbstractC12732w.m47441e().mo47445b(f4622e, "Retrying after " + (((long) i10) * 300), e10);
                        m6431i(((long) this.f4627d) * 300);
                    } catch (SQLiteException e11) {
                        AbstractC12732w.m47441e().mo47446c(f4622e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        InterfaceC12631a<Throwable> interfaceC12631aM6272e2 = this.f4625b.m48584n().m6272e();
                        if (interfaceC12631aM6272e2 == null) {
                            throw illegalStateException2;
                        }
                        interfaceC12631aM6272e2.accept(illegalStateException2);
                    }
                }
            }
            this.f4625b.m48591w();
        } catch (Throwable th2) {
            this.f4625b.m48591w();
            throw th2;
        }
    }
}
