package y5;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly5/d1;", "Ly5/b1;", "Ly5/s;", "processor", "Lh6/b;", "workTaskExecutor", "<init>", "(Ly5/s;Lh6/b;)V", "Ly5/y;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "", "e", "(Ly5/y;Landroidx/work/WorkerParameters$a;)V", "", "reason", "b", "(Ly5/y;I)V", "a", "Ly5/s;", "getProcessor", "()Ly5/s;", "Lh6/b;", "getWorkTaskExecutor", "()Lh6/b;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h6.b workTaskExecutor;

    public d1(@NotNull s processor, @NotNull h6.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    public static final void g(d1 d1Var, y yVar, WorkerParameters.a aVar) throws Throwable {
        d1Var.processor.o(yVar, aVar);
    }

    @Override // y5.b1
    public void b(@NotNull y workSpecId, int reason) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workTaskExecutor.d(new g6.z(this.processor, workSpecId, false, reason));
    }

    @Override // y5.b1
    public void e(@NotNull final y workSpecId, @Nullable final WorkerParameters.a runtimeExtras) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workTaskExecutor.d(new Runnable() { // from class: y5.c1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                d1.g(this.f35590a, workSpecId, runtimeExtras);
            }
        });
    }
}
