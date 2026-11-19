package mo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmo/t;", "Lmo/d;", "Landroid/content/Context;", "context", "Lmo/m;", "phoneCallMonitor", "<init>", "(Landroid/content/Context;Lmo/m;)V", "Lmo/c;", "a", "()Lmo/c;", BuildConfig.FLAVOR, "b", "()J", "Landroid/content/Context;", "Lmo/m;", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m phoneCallMonitor;

    public t(@NotNull Context context, @NotNull m phoneCallMonitor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneCallMonitor, "phoneCallMonitor");
        this.context = context;
        this.phoneCallMonitor = phoneCallMonitor;
    }

    @Override // mo.d
    @NotNull
    public DeviceMetrics a() {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            objB = zt.n.b(Long.valueOf(SystemClock.elapsedRealtime()));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (zt.n.g(objB)) {
            objB = null;
        }
        Long l10 = (Long) objB;
        try {
            objB2 = zt.n.b(Long.valueOf(b()));
        } catch (Throwable th3) {
            zt.n.Companion companion3 = zt.n.INSTANCE;
            objB2 = zt.n.b(zt.o.a(th3));
        }
        if (zt.n.g(objB2)) {
            objB2 = null;
        }
        Long l11 = (Long) objB2;
        try {
            objB3 = zt.n.b(Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        } catch (Throwable th4) {
            zt.n.Companion companion4 = zt.n.INSTANCE;
            objB3 = zt.n.b(zt.o.a(th4));
        }
        Long l12 = (Long) (zt.n.g(objB3) ? null : objB3);
        try {
            objB4 = zt.n.b(this.phoneCallMonitor.n());
        } catch (Throwable th5) {
            zt.n.Companion companion5 = zt.n.INSTANCE;
            objB4 = zt.n.b(zt.o.a(th5));
        }
        n nVar = n.UNAVAILABLE;
        if (zt.n.g(objB4)) {
            objB4 = nVar;
        }
        return new DeviceMetrics(l10, l11, l12, (n) objB4);
    }

    public final long b() {
        Object systemService = this.context.getSystemService("activity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
