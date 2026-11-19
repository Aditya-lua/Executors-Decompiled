package j8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20154a;
    public final k8.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f20155c;

    public d(Context context, k8.d dVar, f fVar) {
        this.f20154a = context;
        this.b = dVar;
        this.f20155c = fVar;
    }

    @Override // j8.x
    public void a(c8.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f20154a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f20154a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            g8.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jY0 = this.b.y0(oVar);
        JobInfo.Builder builderC = this.f20155c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jY0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", n8.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        g8.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f20155c.g(oVar.d(), jY0, i10)), Long.valueOf(jY0), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // j8.x
    public void b(c8.o oVar, int i10) {
        a(oVar, i10, false);
    }

    public int c(c8.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f20154a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(n8.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
