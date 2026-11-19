package ob;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class cb extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f27168c;

    public cb(l7 l7Var) {
        super(l7Var);
    }

    @Override // ob.g5
    public final boolean m() {
        return true;
    }

    @Override // ob.g5
    @TargetApi(24)
    public final void n() {
        this.f27168c = (JobScheduler) this.f27641a.d().getSystemService("jobscheduler");
    }

    @TargetApi(24)
    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f27168c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f27641a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.o7 o7VarQ = q();
        if (o7VarQ != com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE) {
            this.f27641a.a().w().b("[sgtm] Not eligible for Scion upload", o7VarQ.name());
            return;
        }
        l7 l7Var = this.f27641a;
        l7Var.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        l7Var.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) o9.s.l(this.f27168c)).schedule(new JobInfo.Builder(p(), new ComponentName(l7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int p() {
        return "measurement-client".concat(String.valueOf(this.f27641a.d().getPackageName())).hashCode();
    }

    public final com.google.android.gms.internal.measurement.o7 q() {
        j();
        h();
        if (this.f27168c == null) {
            return com.google.android.gms.internal.measurement.o7.MISSING_JOB_SCHEDULER;
        }
        l7 l7Var = this.f27641a;
        if (!l7Var.w().P()) {
            return com.google.android.gms.internal.measurement.o7.NOT_ENABLED_IN_MANIFEST;
        }
        l7 l7Var2 = this.f27641a;
        if (l7Var2.L().u() < 119000) {
            return com.google.android.gms.internal.measurement.o7.SDK_TOO_OLD;
        }
        if (ff.F(l7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !l7Var2.J().y() ? com.google.android.gms.internal.measurement.o7.NON_PLAY_MODE : com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.o7.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
