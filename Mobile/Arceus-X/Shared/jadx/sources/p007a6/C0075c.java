package p007a6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: a6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C0075c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f150a;

    static {
        String strM47443i = AbstractC12732w.m47443i("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f150a = strM47443i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m179a(@NotNull Context context, @NotNull WorkDatabase workDatabase, @NotNull C1115a configuration) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? 150 : 100;
        int size = workDatabase.mo6350c0().mo24782f().size();
        String strM0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler jobSchedulerM181c = m181c(context);
            List<JobInfo> listM180b = m180b(jobSchedulerM181c);
            if (listM180b != null) {
                List<JobInfo> listM190g = C0078f.m190g(context, jobSchedulerM181c);
                int size2 = listM190g != null ? listM180b.size() - listM190g.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> listM190g2 = C0078f.m190g(context, (JobScheduler) systemService);
                int size3 = listM190g2 != null ? listM190g2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strM0 = CollectionsKt.m31715m0(C7699p.m31896o(listM180b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listM190g3 = C0078f.m190g(context, m181c(context));
            if (listM190g3 != null) {
                strM0 = listM190g3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + strM0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final List<JobInfo> m180b(@NotNull JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            return C0073a.f148a.m177a(jobScheduler);
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(f150a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JobScheduler m181c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? C0074b.f149a.m178a(jobScheduler) : jobScheduler;
    }
}
