package p007a6;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p120f6.C5390j0;
import p536x5.AbstractC12732w;
import p536x5.C12694d;
import p536x5.EnumC12688a;
import p536x5.EnumC12734x;
import p536x5.InterfaceC12690b;

/* JADX INFO: renamed from: a6.d */
/* JADX INFO: loaded from: classes.dex */
public class C0076d {

    /* JADX INFO: renamed from: d */
    public static final String f151d = AbstractC12732w.m47443i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f152a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12690b f153b;

    /* JADX INFO: renamed from: c */
    public final boolean f154c;

    /* JADX INFO: renamed from: a6.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155a;

        static {
            int[] iArr = new int[EnumC12734x.values().length];
            f155a = iArr;
            try {
                iArr[EnumC12734x.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155a[EnumC12734x.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155a[EnumC12734x.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155a[EnumC12734x.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155a[EnumC12734x.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C0076d(Context context, InterfaceC12690b interfaceC12690b, boolean z10) {
        this.f153b = interfaceC12690b;
        this.f152a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f154c = z10;
    }

    /* JADX INFO: renamed from: b */
    public static JobInfo.TriggerContentUri m182b(C12694d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.getUri(), cVar.getIsTriggeredForDescendants() ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m183c(EnumC12734x enumC12734x) {
        int i10 = a.f155a[enumC12734x.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        AbstractC12732w.m47441e().mo47444a(f151d, "API version too low. Cannot convert network type value " + enumC12734x);
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static void m184d(JobInfo.Builder builder, EnumC12734x enumC12734x) {
        if (Build.VERSION.SDK_INT < 30 || enumC12734x != EnumC12734x.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m183c(enumC12734x));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* JADX INFO: renamed from: a */
    public JobInfo m185a(C5390j0 c5390j0, int i10) {
        String traceTag;
        C12694d c12694d = c5390j0.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c5390j0.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c5390j0.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c5390j0.m24762o());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f152a).setRequiresCharging(c12694d.getRequiresCharging()).setRequiresDeviceIdle(c12694d.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestM47337d = c12694d.m47337d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || networkRequestM47337d == null) {
            m184d(extras, c12694d.getRequiredNetworkType());
        } else {
            C0077e.m186a(extras, networkRequestM47337d);
        }
        if (!c12694d.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(c5390j0.backoffDelayDuration, c5390j0.backoffPolicy == EnumC12688a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c5390j0.m24751c() - this.f153b.mo47323a(), 0L);
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c5390j0.expedited && this.f154c) {
            extras.setImportantWhileForeground(true);
        }
        if (c12694d.m47340g()) {
            Iterator<C12694d.c> it = c12694d.m47336c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m182b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c12694d.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(c12694d.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c12694d.getRequiresBatteryNotLow());
        extras.setRequiresStorageNotLow(c12694d.getRequiresStorageNotLow());
        boolean z10 = c5390j0.runAttemptCount > 0;
        boolean z11 = jMax > 0;
        if (i12 >= 31 && c5390j0.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (traceTag = c5390j0.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
