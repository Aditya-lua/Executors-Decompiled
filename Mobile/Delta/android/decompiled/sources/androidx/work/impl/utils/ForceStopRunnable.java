package androidx.work.impl.utils;

import a6.f;
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
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import f6.d0;
import f6.j0;
import f6.k0;
import g6.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u2.p;
import x5.o0;
import x5.w;
import y5.f1;
import y5.i0;
import y5.x;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3537e = w.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3538f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3539a;
    public final f1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6.w f3540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3541d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f3542a = w.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            w.e().j(f3542a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, f1 f1Var) {
        this.f3539a = context.getApplicationContext();
        this.b = f1Var;
        this.f3540c = f1Var.q();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3538f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = f.i(this.f3539a, this.b.u());
        WorkDatabase workDatabaseU = this.b.u();
        k0 k0VarC0 = workDatabaseU.c0();
        d0 d0VarB0 = workDatabaseU.b0();
        workDatabaseU.i();
        try {
            List<j0> listW = k0VarC0.w();
            boolean z10 = (listW == null || listW.isEmpty()) ? false : true;
            if (z10) {
                for (j0 j0Var : listW) {
                    k0VarC0.c(o0.c.ENQUEUED, j0Var.id);
                    k0VarC0.e(j0Var.id, -512);
                    k0VarC0.q(j0Var.id, -1L);
                }
            }
            d0VarB0.c();
            workDatabaseU.V();
            workDatabaseU.p();
            return z10 || zI;
        } catch (Throwable th2) {
            workDatabaseU.p();
            throw th2;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            w.e().a(f3537e, "Rescheduling Workers.");
            this.b.x();
            this.b.q().e(false);
        } else if (e()) {
            w.e().a(f3537e, "Application was force-stopped, rescheduling.");
            this.b.x();
            this.f3540c.d(this.b.n().getClock().a());
        } else if (zA) {
            w.e().a(f3537e, "Found unfinished work, scheduling it.");
            x.f(this.b.n(), this.b.u(), this.b.s());
        }
    }

    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f3539a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f3539a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f3540c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoA = l.a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f3539a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            w.e().l(f3537e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            w.e().l(f3537e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarN = this.b.n();
        if (TextUtils.isEmpty(aVarN.getDefaultProcessName())) {
            w.e().a(f3537e, "The default process name was not specified.");
            return true;
        }
        boolean zB = g6.x.b(this.f3539a, aVarN);
        w.e().a(f3537e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.b.q().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        i0.c(this.f3539a);
                        w.e().a(f3537e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f3541d + 1;
                            this.f3541d = i10;
                            if (i10 >= 3) {
                                String str = p.a(this.f3539a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                w wVarE = w.e();
                                String str2 = f3537e;
                                wVarE.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                x2.a<Throwable> aVarE = this.b.n().e();
                                if (aVarE == null) {
                                    throw illegalStateException;
                                }
                                w.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                aVarE.accept(illegalStateException);
                                break;
                            }
                            w.e().b(f3537e, "Retrying after " + (((long) i10) * 300), e10);
                            i(((long) this.f3541d) * 300);
                        }
                        w.e().b(f3537e, "Retrying after " + (((long) i10) * 300), e10);
                        i(((long) this.f3541d) * 300);
                    } catch (SQLiteException e11) {
                        w.e().c(f3537e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        x2.a<Throwable> aVarE2 = this.b.n().e();
                        if (aVarE2 == null) {
                            throw illegalStateException2;
                        }
                        aVarE2.accept(illegalStateException2);
                    }
                }
            }
            this.b.w();
        } catch (Throwable th2) {
            this.b.w();
            throw th2;
        }
    }
}
