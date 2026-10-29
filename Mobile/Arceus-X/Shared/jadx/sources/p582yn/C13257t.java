package p582yn;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: yn.t */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lyn/t;", "Lyn/d;", "Landroid/content/Context;", "context", "Lyn/m;", "phoneCallMonitor", "<init>", "(Landroid/content/Context;Lyn/m;)V", "Lyn/c;", "a", "()Lyn/c;", "", "b", "()J", "Landroid/content/Context;", "Lyn/m;", "device_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13257t implements InterfaceC13240d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13250m phoneCallMonitor;

    public C13257t(@NotNull Context context, @NotNull InterfaceC13250m phoneCallMonitor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneCallMonitor, "phoneCallMonitor");
        this.context = context;
        this.phoneCallMonitor = phoneCallMonitor;
    }

    @Override // p582yn.InterfaceC13240d
    @NotNull
    /* JADX INFO: renamed from: a */
    public DeviceMetrics mo48967a() {
        Object objM30460b;
        Object objM30460b2;
        Object objM30460b3;
        Object objM30460b4;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(Long.valueOf(SystemClock.elapsedRealtime()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        Long l10 = (Long) objM30460b;
        try {
            objM30460b2 = C7347n.m30460b(Long.valueOf(m49014b()));
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b2 = C7347n.m30460b(C7348o.m30469a(th3));
        }
        if (C7347n.m30465g(objM30460b2)) {
            objM30460b2 = null;
        }
        Long l11 = (Long) objM30460b2;
        try {
            objM30460b3 = C7347n.m30460b(Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        } catch (Throwable th4) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            objM30460b3 = C7347n.m30460b(C7348o.m30469a(th4));
        }
        Long l12 = (Long) (C7347n.m30465g(objM30460b3) ? null : objM30460b3);
        try {
            objM30460b4 = C7347n.m30460b(this.phoneCallMonitor.mo48959m());
        } catch (Throwable th5) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            objM30460b4 = C7347n.m30460b(C7348o.m30469a(th5));
        }
        EnumC13251n enumC13251n = EnumC13251n.UNAVAILABLE;
        if (C7347n.m30465g(objM30460b4)) {
            objM30460b4 = enumC13251n;
        }
        return new DeviceMetrics(l10, l11, l12, (EnumC13251n) objM30460b4);
    }

    /* JADX INFO: renamed from: b */
    public final long m49014b() {
        Object systemService = this.context.getSystemService("activity");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
