package nb;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class xa extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f26111c;

    public xa(g7 g7Var) {
        super(g7Var);
    }

    @Override // nb.b5
    public final boolean m() {
        return true;
    }

    @Override // nb.b5
    @TargetApi(24)
    public final void n() {
        this.f26111c = (JobScheduler) this.f25625a.d().getSystemService("jobscheduler");
    }

    @TargetApi(24)
    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f26111c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f25625a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.k7 k7VarQ = q();
        if (k7VarQ != com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE) {
            this.f25625a.a().w().b("[sgtm] Not eligible for Scion upload", k7VarQ.name());
            return;
        }
        g7 g7Var = this.f25625a;
        g7Var.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        g7Var.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) n9.m.l(this.f26111c)).schedule(new JobInfo.Builder(p(), new ComponentName(g7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int p() {
        return "measurement-client".concat(String.valueOf(this.f25625a.d().getPackageName())).hashCode();
    }

    public final com.google.android.gms.internal.measurement.k7 q() {
        j();
        h();
        if (this.f26111c == null) {
            return com.google.android.gms.internal.measurement.k7.MISSING_JOB_SCHEDULER;
        }
        g7 g7Var = this.f25625a;
        if (!g7Var.w().P()) {
            return com.google.android.gms.internal.measurement.k7.NOT_ENABLED_IN_MANIFEST;
        }
        g7 g7Var2 = this.f25625a;
        if (g7Var2.L().u() < 119000) {
            return com.google.android.gms.internal.measurement.k7.SDK_TOO_OLD;
        }
        if (ve.F(g7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !g7Var2.J().y() ? com.google.android.gms.internal.measurement.k7.NON_PLAY_MODE : com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.k7.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
