package p306nb;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.a7 */
/* JADX INFO: loaded from: classes.dex */
public final class C8993a7 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f32675a;

    /* JADX INFO: renamed from: b */
    public final boolean f32676b;

    /* JADX INFO: renamed from: c */
    public final String f32677c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9027c7 f32678d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8993a7(C9027c7 c9027c7, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(c9027c7);
        this.f32678d = c9027c7;
        C8953m.m36047l(str);
        long andIncrement = C9027c7.f32796k.getAndIncrement();
        this.f32675a = andIncrement;
        this.f32677c = str;
        this.f32676b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c9027c7.f33067a.mo36321a().m37003o().m36911a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        C8993a7 c8993a7 = (C8993a7) obj;
        boolean z10 = c8993a7.f32676b;
        boolean z11 = this.f32676b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f32675a;
        long j11 = c8993a7.f32675a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f32678d.f33067a.mo36321a().m37004p().m36912b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f32678d.f33067a.mo36321a().m37003o().m36912b(this.f32677c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8993a7(C9027c7 c9027c7, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(c9027c7);
        this.f32678d = c9027c7;
        C8953m.m36047l("Task exception on worker thread");
        long andIncrement = C9027c7.f32796k.getAndIncrement();
        this.f32675a = andIncrement;
        this.f32677c = "Task exception on worker thread";
        this.f32676b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c9027c7.f33067a.mo36321a().m37003o().m36911a("Tasks index overflow");
        }
    }
}
