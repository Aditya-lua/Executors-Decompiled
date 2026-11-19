package ob;

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
public final class yd extends ge {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f28010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f28011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f28012f;

    public yd(ve veVar) {
        super(veVar);
        this.f28010d = (AlarmManager) this.f27641a.d().getSystemService("alarm");
    }

    @TargetApi(24)
    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f27641a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f28012f == null) {
            this.f28012f = Integer.valueOf("measurement".concat(String.valueOf(this.f27641a.d().getPackageName())).hashCode());
        }
        return this.f28012f.intValue();
    }

    @Override // ob.ge
    public final boolean l() {
        AlarmManager alarmManager = this.f28010d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        l7 l7Var = this.f27641a;
        l7Var.c();
        Context contextD = l7Var.d();
        if (!ff.j0(contextD)) {
            l7Var.a().v().a("Receiver not registered/enabled");
        }
        if (!ff.E(contextD, false)) {
            l7Var.a().v().a("Service not registered/enabled");
        }
        n();
        l7Var.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        l7Var.e().b();
        l7Var.w();
        if (j10 < Math.max(0L, ((Long) e5.M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        l7Var.c();
        Context contextD2 = l7Var.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.l1.a(contextD2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f27641a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f28010d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }

    public final z o() {
        if (this.f28011e == null) {
            this.f28011e = new xd(this, this.b.g0());
        }
        return this.f28011e;
    }

    public final PendingIntent r() {
        Context contextD = this.f27641a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.k1.f6571a);
    }
}
