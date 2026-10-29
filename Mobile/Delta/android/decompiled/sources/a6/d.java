package a6;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import f6.j0;
import java.util.Iterator;
import x5.w;
import x5.x;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f110d = w.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f111a;
    public final x5.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113a;

        static {
            int[] iArr = new int[x.values().length];
            f113a = iArr;
            try {
                iArr[x.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113a[x.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113a[x.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113a[x.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113a[x.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(Context context, x5.b bVar, boolean z10) {
        this.b = bVar;
        this.f111a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f112c = z10;
    }

    public static JobInfo.TriggerContentUri b(x5.d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.getUri(), cVar.getIsTriggeredForDescendants() ? 1 : 0);
    }

    public static int c(x xVar) {
        int i10 = a.f113a[xVar.ordinal()];
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
        w.e().a(f110d, "API version too low. Cannot convert network type value " + xVar);
        return 1;
    }

    public static void d(JobInfo.Builder builder, x xVar) {
        if (Build.VERSION.SDK_INT < 30 || xVar != x.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(xVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(j0 j0Var, int i10) {
        String traceTag;
        x5.d dVar = j0Var.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", j0Var.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", j0Var.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", j0Var.o());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f111a).setRequiresCharging(dVar.getRequiresCharging()).setRequiresDeviceIdle(dVar.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = dVar.d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || networkRequestD == null) {
            d(extras, dVar.getRequiredNetworkType());
        } else {
            e.a(extras, networkRequestD);
        }
        if (!dVar.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(j0Var.backoffDelayDuration, j0Var.backoffPolicy == x5.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(j0Var.c() - this.b.a(), 0L);
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!j0Var.expedited && this.f112c) {
            extras.setImportantWhileForeground(true);
        }
        if (dVar.g()) {
            Iterator<x5.d.c> it = dVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(dVar.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(dVar.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(dVar.getRequiresBatteryNotLow());
        extras.setRequiresStorageNotLow(dVar.getRequiresStorageNotLow());
        boolean z10 = j0Var.runAttemptCount > 0;
        boolean z11 = jMax > 0;
        if (i12 >= 31 && j0Var.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (traceTag = j0Var.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
