package ob;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27318a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h7 f27320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(h7 h7Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(h7Var);
        this.f27320d = h7Var;
        o9.s.l(str);
        long andIncrement = h7.f27394k.getAndIncrement();
        this.f27318a = andIncrement;
        this.f27319c = str;
        this.b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            h7Var.f27641a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        f7 f7Var = (f7) obj;
        boolean z10 = f7Var.b;
        boolean z11 = this.b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f27318a;
        long j11 = f7Var.f27318a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f27320d.f27641a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f27320d.f27641a.a().o().b(this.f27319c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(h7 h7Var, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(h7Var);
        this.f27320d = h7Var;
        o9.s.l("Task exception on worker thread");
        long andIncrement = h7.f27394k.getAndIncrement();
        this.f27318a = andIncrement;
        this.f27319c = "Task exception on worker thread";
        this.b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            h7Var.f27641a.a().o().a("Tasks index overflow");
        }
    }
}
