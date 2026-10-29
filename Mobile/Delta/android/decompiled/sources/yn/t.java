package yn;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyn/t;", "Lyn/d;", "Landroid/content/Context;", "context", "Lyn/m;", "phoneCallMonitor", "<init>", "(Landroid/content/Context;Lyn/m;)V", "Lyn/c;", "a", "()Lyn/c;", "", "b", "()J", "Landroid/content/Context;", "Lyn/m;", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Override // yn.d
    @NotNull
    public DeviceMetrics a() {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            objB = jt.n.b(Long.valueOf(SystemClock.elapsedRealtime()));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        if (jt.n.g(objB)) {
            objB = null;
        }
        Long l10 = (Long) objB;
        try {
            objB2 = jt.n.b(Long.valueOf(b()));
        } catch (Throwable th3) {
            jt.n.Companion companion3 = jt.n.INSTANCE;
            objB2 = jt.n.b(jt.o.a(th3));
        }
        if (jt.n.g(objB2)) {
            objB2 = null;
        }
        Long l11 = (Long) objB2;
        try {
            objB3 = jt.n.b(Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        } catch (Throwable th4) {
            jt.n.Companion companion4 = jt.n.INSTANCE;
            objB3 = jt.n.b(jt.o.a(th4));
        }
        Long l12 = (Long) (jt.n.g(objB3) ? null : objB3);
        try {
            objB4 = jt.n.b(this.phoneCallMonitor.m());
        } catch (Throwable th5) {
            jt.n.Companion companion5 = jt.n.INSTANCE;
            objB4 = jt.n.b(jt.o.a(th5));
        }
        n nVar = n.UNAVAILABLE;
        if (jt.n.g(objB4)) {
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
