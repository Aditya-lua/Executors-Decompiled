package nb;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class a7 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25327a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c7 f25329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(c7 c7Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(c7Var);
        this.f25329d = c7Var;
        n9.m.l(str);
        long andIncrement = c7.f25412k.getAndIncrement();
        this.f25327a = andIncrement;
        this.f25328c = str;
        this.b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c7Var.f25625a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        a7 a7Var = (a7) obj;
        boolean z10 = a7Var.b;
        boolean z11 = this.b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f25327a;
        long j11 = a7Var.f25327a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f25329d.f25625a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f25329d.f25625a.a().o().b(this.f25328c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(c7 c7Var, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(c7Var);
        this.f25329d = c7Var;
        n9.m.l("Task exception on worker thread");
        long andIncrement = c7.f25412k.getAndIncrement();
        this.f25327a = andIncrement;
        this.f25328c = "Task exception on worker thread";
        this.b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c7Var.f25625a.a().o().a("Tasks index overflow");
        }
    }
}
