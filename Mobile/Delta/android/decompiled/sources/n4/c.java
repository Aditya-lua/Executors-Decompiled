package n4;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<Result> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Handler f25869e;
    public volatile e b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25871c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25872d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FutureTask<Result> f25870a = new b(new a());

    public class a implements Callable<Result> {
        public a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f25872d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b();
                Binder.flushPendingCommands();
                c.this.i(result);
                return result;
            } catch (Throwable th2) {
                try {
                    c.this.f25871c.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    c.this.i(result);
                    throw th3;
                }
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: n4.c$c, reason: collision with other inner class name */
    public class RunnableC0456c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f25875a;

        public RunnableC0456c(Object obj) {
            this.f25875a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f25875a);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25876a;

        static {
            int[] iArr = new int[e.values().length];
            f25876a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25876a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f25869e == null) {
                    f25869e = new Handler(Looper.getMainLooper());
                }
                handler = f25869e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f25871c.set(true);
        return this.f25870a.cancel(z10);
    }

    public abstract Result b();

    public final void c(@NonNull Executor executor) {
        if (this.b == e.PENDING) {
            this.b = e.RUNNING;
            executor.execute(this.f25870a);
            return;
        }
        int i10 = d.f25876a[this.b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.b = e.FINISHED;
    }

    public final boolean f() {
        return this.f25871c.get();
    }

    public void g(Result result) {
    }

    public void h(Result result) {
    }

    public void i(Result result) {
        e().post(new RunnableC0456c(result));
    }

    public void j(Result result) {
        if (this.f25872d.get()) {
            return;
        }
        i(result);
    }
}
