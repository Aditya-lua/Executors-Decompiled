package p190i8;

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
import p028b8.AbstractC1267o;
import p122f8.C5488a;
import p212j8.InterfaceC7044d;
import p289m8.C8469a;

/* JADX INFO: renamed from: i8.d */
/* JADX INFO: loaded from: classes.dex */
public class C6663d implements InterfaceC6683x {

    /* JADX INFO: renamed from: a */
    public final Context f25699a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7044d f25700b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6665f f25701c;

    public C6663d(Context context, InterfaceC7044d interfaceC7044d, AbstractC6665f abstractC6665f) {
        this.f25699a = context;
        this.f25700b = interfaceC7044d;
        this.f25701c = abstractC6665f;
    }

    @Override // p190i8.InterfaceC6683x
    /* JADX INFO: renamed from: a */
    public void mo28736a(AbstractC1267o abstractC1267o, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f25699a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f25699a.getSystemService("jobscheduler");
        int iM28738c = m28738c(abstractC1267o);
        if (!z10 && m28739d(jobScheduler, iM28738c, i10)) {
            C5488a.m25128a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC1267o);
            return;
        }
        long jMo29759v0 = this.f25700b.mo29759v0(abstractC1267o);
        JobInfo.Builder builderM28745c = this.f25701c.m28745c(new JobInfo.Builder(iM28738c, componentName), abstractC1267o.mo7009d(), jMo29759v0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC1267o.mo7007b());
        persistableBundle.putInt("priority", C8469a.m34255a(abstractC1267o.mo7009d()));
        if (abstractC1267o.mo7008c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC1267o.mo7008c(), 0));
        }
        builderM28745c.setExtras(persistableBundle);
        C5488a.m25129b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC1267o, Integer.valueOf(iM28738c), Long.valueOf(this.f25701c.m28746g(abstractC1267o.mo7009d(), jMo29759v0, i10)), Long.valueOf(jMo29759v0), Integer.valueOf(i10));
        jobScheduler.schedule(builderM28745c.build());
    }

    @Override // p190i8.InterfaceC6683x
    /* JADX INFO: renamed from: b */
    public void mo28737b(AbstractC1267o abstractC1267o, int i10) {
        mo28736a(abstractC1267o, i10, false);
    }

    /* JADX INFO: renamed from: c */
    public int m28738c(AbstractC1267o abstractC1267o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f25699a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC1267o.mo7007b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C8469a.m34255a(abstractC1267o.mo7009d())).array());
        if (abstractC1267o.mo7008c() != null) {
            adler32.update(abstractC1267o.mo7008c());
        }
        return (int) adler32.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28739d(JobScheduler jobScheduler, int i10, int i11) {
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
