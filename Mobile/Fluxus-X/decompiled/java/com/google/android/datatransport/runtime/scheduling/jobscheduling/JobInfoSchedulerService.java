package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c8.o;
import c8.t;
import n8.a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a aVarD = o.a().b(string).d(a.b(i10));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        t.c().e().m(aVarD.a(), i11, new Runnable() { // from class: j8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f20156a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
