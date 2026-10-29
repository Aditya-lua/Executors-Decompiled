package nb;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class sd extends xd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f25952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f25953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f25954f;

    public sd(me meVar) {
        super(meVar);
        this.f25952d = (AlarmManager) this.f25625a.d().getSystemService("alarm");
    }

    @TargetApi(24)
    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f25625a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f25954f == null) {
            this.f25954f = Integer.valueOf("measurement".concat(String.valueOf(this.f25625a.d().getPackageName())).hashCode());
        }
        return this.f25954f.intValue();
    }

    @Override // nb.xd
    public final boolean l() {
        AlarmManager alarmManager = this.f25952d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        g7 g7Var = this.f25625a;
        g7Var.c();
        Context contextD = g7Var.d();
        if (!ve.j0(contextD)) {
            g7Var.a().v().a("Receiver not registered/enabled");
        }
        if (!ve.E(contextD, false)) {
            g7Var.a().v().a("Service not registered/enabled");
        }
        n();
        g7Var.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        g7Var.e().b();
        g7Var.w();
        if (j10 < Math.max(0L, ((Long) z4.M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        g7Var.c();
        Context contextD2 = g7Var.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.l1.a(contextD2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f25625a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f25952d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }

    public final w o() {
        if (this.f25953e == null) {
            this.f25953e = new rd(this, this.b.g0());
        }
        return this.f25953e;
    }

    public final PendingIntent r() {
        Context contextD = this.f25625a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.k1.f6570a);
    }
}
