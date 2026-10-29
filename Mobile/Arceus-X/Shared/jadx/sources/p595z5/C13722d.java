package p595z5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p536x5.InterfaceC12707j0;
import p567y5.C13098y;
import p567y5.InterfaceC13036b1;

/* JADX INFO: renamed from: z5.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lz5/d;", "", "Lx5/j0;", "runnableScheduler", "Ly5/b1;", "launcher", "", "timeoutMs", "<init>", "(Lx5/j0;Ly5/b1;J)V", "Ly5/y;", "token", "", "c", "(Ly5/y;)V", "b", "a", "Lx5/j0;", "Ly5/b1;", "J", "d", "Ljava/lang/Object;", "lock", "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13722d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12707j0 runnableScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13036b1 launcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long timeoutMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<C13098y, Runnable> tracked;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13722d(@NotNull InterfaceC12707j0 runnableScheduler, @NotNull InterfaceC13036b1 launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
    }

    /* JADX INFO: renamed from: d */
    public static final void m50120d(C13722d c13722d, C13098y c13098y) {
        c13722d.launcher.mo48551b(c13098y, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m50121b(@NotNull C13098y token) {
        Runnable runnableRemove;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.mo47381a(runnableRemove);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50122c(@NotNull final C13098y token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Runnable runnable = new Runnable() { // from class: z5.c
            @Override // java.lang.Runnable
            public final void run() {
                C13722d.m50120d(this.f48265a, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.mo47382b(this.timeoutMs, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13722d(@NotNull InterfaceC12707j0 runnableScheduler, @NotNull InterfaceC13036b1 launcher, long j10) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.runnableScheduler = runnableScheduler;
        this.launcher = launcher;
        this.timeoutMs = j10;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r1v0 x5.j0)
      (r2v0 y5.b1)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap long:0x0008: INVOKE 
      (wrap java.util.concurrent.TimeUnit:0x0004: SGET  A[WRAPPED] (LINE:8) java.util.concurrent.TimeUnit.MINUTES java.util.concurrent.TimeUnit)
      (90 long)
     VIRTUAL call: java.util.concurrent.TimeUnit.toMillis(long):long A[MD:(long):long (c), WRAPPED] (LINE:8)) : (r3v0 long))
     A[MD:(x5.j0, y5.b1, long):void (m)] (LINE:9) call: z5.d.<init>(x5.j0, y5.b1, long):void type: THIS */
    public /* synthetic */ C13722d(InterfaceC12707j0 interfaceC12707j0, InterfaceC13036b1 interfaceC13036b1, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12707j0, interfaceC13036b1, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
