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
import p305n9.C8953m;

/* JADX INFO: renamed from: sb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11268m {
    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m42331a(@NonNull Task<TResult> task) throws InterruptedException {
        C8953m.m36045j();
        C8953m.m36043h();
        C8953m.m36048m(task, "Task must not be null");
        if (task.mo11899m()) {
            return (TResult) m42339i(task);
        }
        C11274p c11274p = new C11274p(null);
        m42340j(task, c11274p);
        c11274p.m42352b();
        return (TResult) m42339i(task);
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> TResult m42332b(@NonNull Task<TResult> task, long j10, @NonNull TimeUnit timeUnit) throws TimeoutException {
        C8953m.m36045j();
        C8953m.m36043h();
        C8953m.m36048m(task, "Task must not be null");
        C8953m.m36048m(timeUnit, "TimeUnit must not be null");
        if (task.mo11899m()) {
            return (TResult) m42339i(task);
        }
        C11274p c11274p = new C11274p(null);
        m42340j(task, c11274p);
        if (c11274p.m42353c(j10, timeUnit)) {
            return (TResult) m42339i(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static <TResult> Task<TResult> m42333c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C8953m.m36048m(executor, "Executor must not be null");
        C8953m.m36048m(callable, "Callback must not be null");
        C11271n0 c11271n0 = new C11271n0();
        executor.execute(new RunnableC11273o0(c11271n0, callable));
        return c11271n0;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> Task<TResult> m42334d() {
        C11271n0 c11271n0 = new C11271n0();
        c11271n0.m42345r();
        return c11271n0;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> Task<TResult> m42335e(@NonNull Exception exc) {
        C11271n0 c11271n0 = new C11271n0();
        c11271n0.m42343p(exc);
        return c11271n0;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <TResult> Task<TResult> m42336f(TResult tresult) {
        C11271n0 c11271n0 = new C11271n0();
        c11271n0.m42344q(tresult);
        return c11271n0;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static Task<Void> m42337g(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m42336f(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C11271n0 c11271n0 = new C11271n0();
        C11276r c11276r = new C11276r(collection.size(), c11271n0);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m42340j(it2.next(), c11276r);
        }
        return c11271n0;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static Task<Void> m42338h(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m42336f(null) : m42337g(Arrays.asList(taskArr));
    }

    /* JADX INFO: renamed from: i */
    public static Object m42339i(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.mo11898l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    /* JADX INFO: renamed from: j */
    public static void m42340j(Task task, InterfaceC11275q interfaceC11275q) {
        Executor executor = C11266l.f39581b;
        task.mo11892f(executor, interfaceC11275q);
        task.mo11890d(executor, interfaceC11275q);
        task.mo11887a(executor, interfaceC11275q);
    }
}
