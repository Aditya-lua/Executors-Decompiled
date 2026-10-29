package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p028b8.AbstractC1267o;
import p028b8.C1272t;
import p289m8.C8469a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C1272t.m7051f(getApplicationContext());
        AbstractC1267o.a aVarMo7013d = AbstractC1267o.m7040a().mo7011b(string).mo7013d(C8469a.m34256b(i10));
        if (string2 != null) {
            aVarMo7013d.mo7012c(Base64.decode(string2, 0));
        }
        C1272t.m7049c().m7053e().m28764m(aVarMo7013d.mo7010a(), i11, new Runnable() { // from class: i8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f25702a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
