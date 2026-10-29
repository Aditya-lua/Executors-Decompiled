package p306nb;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC2155k7;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.xa */
/* JADX INFO: loaded from: classes.dex */
public final class C9369xa extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public JobScheduler f33658c;

    public C9369xa(C9094g7 c9094g7) {
        super(c9094g7);
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return true;
    }

    @Override // p306nb.AbstractC9008b5
    @TargetApi(24)
    /* JADX INFO: renamed from: n */
    public final void mo36125n() {
        this.f33658c = (JobScheduler) this.f33067a.mo36324d().getSystemService("jobscheduler");
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: o */
    public final void m37063o(long j10) {
        m36121j();
        mo36088h();
        JobScheduler jobScheduler = this.f33658c;
        if (jobScheduler != null && jobScheduler.getPendingJob(m37064p()) != null) {
            this.f33067a.mo36321a().m37011w().m36911a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC2155k7 enumC2155k7M37065q = m37065q();
        if (enumC2155k7M37065q != EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE) {
            this.f33067a.mo36321a().m37011w().m36912b("[sgtm] Not eligible for Scion upload", enumC2155k7M37065q.name());
            return;
        }
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37011w().m36912b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c9094g7.mo36321a().m37011w().m36912b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) C8953m.m36047l(this.f33658c)).schedule(new JobInfo.Builder(m37064p(), new ComponentName(c9094g7.mo36324d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    /* JADX INFO: renamed from: p */
    public final int m37064p() {
        return "measurement-client".concat(String.valueOf(this.f33067a.mo36324d().getPackageName())).hashCode();
    }

    /* JADX INFO: renamed from: q */
    public final EnumC2155k7 m37065q() {
        m36121j();
        mo36088h();
        if (this.f33658c == null) {
            return EnumC2155k7.MISSING_JOB_SCHEDULER;
        }
        C9094g7 c9094g7 = this.f33067a;
        if (!c9094g7.m36338w().m36414P()) {
            return EnumC2155k7.NOT_ENABLED_IN_MANIFEST;
        }
        C9094g7 c9094g8 = this.f33067a;
        if (c9094g8.m36317L().m36436u() < 119000) {
            return EnumC2155k7.SDK_TOO_OLD;
        }
        if (C9341ve.m36925F(c9094g7.mo36324d(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !c9094g8.m36315J().m36907y() ? EnumC2155k7.NON_PLAY_MODE : EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE;
        }
        return EnumC2155k7.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
