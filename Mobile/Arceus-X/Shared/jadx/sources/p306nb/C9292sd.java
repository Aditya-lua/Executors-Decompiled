package p306nb;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.C2149k1;
import com.google.android.gms.internal.measurement.C2167l1;

/* JADX INFO: renamed from: nb.sd */
/* JADX INFO: loaded from: classes.dex */
public final class C9292sd extends AbstractC9372xd {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f33467d;

    /* JADX INFO: renamed from: e */
    public AbstractC9342w f33468e;

    /* JADX INFO: renamed from: f */
    public Integer f33469f;

    public C9292sd(C9197me c9197me) {
        super(c9197me);
        this.f33467d = (AlarmManager) this.f33067a.mo36324d().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: p */
    private final void m36771p() {
        JobScheduler jobScheduler = (JobScheduler) this.f33067a.mo36324d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m36772q());
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m36772q() {
        if (this.f33469f == null) {
            this.f33469f = Integer.valueOf("measurement".concat(String.valueOf(this.f33067a.mo36324d().getPackageName())).hashCode());
        }
        return this.f33469f.intValue();
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        AlarmManager alarmManager = this.f33467d;
        if (alarmManager != null) {
            alarmManager.cancel(m36776r());
        }
        m36771p();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m36773m(long j10) {
        m37067j();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36323c();
        Context contextMo36324d = c9094g7.mo36324d();
        if (!C9341ve.m36930j0(contextMo36324d)) {
            c9094g7.mo36321a().m37010v().m36911a("Receiver not registered/enabled");
        }
        if (!C9341ve.m36924E(contextMo36324d, false)) {
            c9094g7.mo36321a().m37010v().m36911a("Service not registered/enabled");
        }
        m36774n();
        c9094g7.mo36321a().m37011w().m36912b("Scheduling upload, millis", Long.valueOf(j10));
        c9094g7.mo36325e().mo44176b();
        c9094g7.m36338w();
        if (j10 < Math.max(0L, ((Long) C9395z4.f33729M.m37079b(null)).longValue()) && !m36775o().m36991c()) {
            m36775o().m36990b(j10);
        }
        c9094g7.mo36323c();
        Context contextMo36324d2 = c9094g7.mo36324d();
        ComponentName componentName = new ComponentName(contextMo36324d2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM36772q = m36772q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C2167l1.m10348a(contextMo36324d2, new JobInfo.Builder(iM36772q, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* JADX INFO: renamed from: n */
    public final void m36774n() {
        m37067j();
        this.f33067a.mo36321a().m37011w().m36911a("Unscheduling upload");
        AlarmManager alarmManager = this.f33467d;
        if (alarmManager != null) {
            alarmManager.cancel(m36776r());
        }
        m36775o().m36992d();
        m36771p();
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC9342w m36775o() {
        if (this.f33468e == null) {
            this.f33468e = new C9276rd(this, this.f33516b.m36543g0());
        }
        return this.f33468e;
    }

    /* JADX INFO: renamed from: r */
    public final PendingIntent m36776r() {
        Context contextMo36324d = this.f33067a.mo36324d();
        return PendingIntent.getBroadcast(contextMo36324d, 0, new Intent().setClassName(contextMo36324d, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C2149k1.f8358a);
    }
}
