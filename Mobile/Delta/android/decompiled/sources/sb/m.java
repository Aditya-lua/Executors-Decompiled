package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static <TResult> TResult a(@NonNull Task<TResult> task) throws InterruptedException {
        n9.m.j();
        n9.m.h();
        n9.m.m(task, "Task must not be null");
        if (task.m()) {
            return (TResult) i(task);
        }
        p pVar = new p(null);
        j(task, pVar);
        pVar.b();
        return (TResult) i(task);
    }

    public static <TResult> TResult b(@NonNull Task<TResult> task, long j10, @NonNull TimeUnit timeUnit) throws TimeoutException {
        n9.m.j();
        n9.m.h();
        n9.m.m(task, "Task must not be null");
        n9.m.m(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return (TResult) i(task);
        }
        p pVar = new p(null);
        j(task, pVar);
        if (pVar.c(j10, timeUnit)) {
            return (TResult) i(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        n9.m.m(executor, "Executor must not be null");
        n9.m.m(callable, "Callback must not be null");
        n0 n0Var = new n0();
        executor.execute(new o0(n0Var, callable));
        return n0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> d() {
        n0 n0Var = new n0();
        n0Var.r();
        return n0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> e(@NonNull Exception exc) {
        n0 n0Var = new n0();
        n0Var.p(exc);
        return n0Var;
    }

    @NonNull
    public static <TResult> Task<TResult> f(TResult tresult) {
        n0 n0Var = new n0();
        n0Var.q(tresult);
        return n0Var;
    }

    @NonNull
    public static Task<Void> g(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        n0 n0Var = new n0();
        r rVar = new r(collection.size(), n0Var);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            j(it2.next(), rVar);
        }
        return n0Var;
    }

    @NonNull
    public static Task<Void> h(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? f(null) : g(Arrays.asList(taskArr));
    }

    public static Object i(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static void j(Task task, q qVar) {
        Executor executor = l.b;
        task.f(executor, qVar);
        task.d(executor, qVar);
        task.a(executor, qVar);
    }
}
