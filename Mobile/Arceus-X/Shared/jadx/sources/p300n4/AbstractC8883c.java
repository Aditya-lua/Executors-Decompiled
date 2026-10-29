package p300n4;

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

/* JADX INFO: renamed from: n4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8883c<Result> {

    /* JADX INFO: renamed from: e */
    public static Handler f32334e;

    /* JADX INFO: renamed from: b */
    public volatile e f32336b = e.PENDING;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f32337c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f32338d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final FutureTask<Result> f32335a = new b(new a());

    /* JADX INFO: renamed from: n4.c$a */
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
            AbstractC8883c.this.f32338d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC8883c.this.mo35715b();
                Binder.flushPendingCommands();
                AbstractC8883c.this.m35742i(result);
                return result;
            } catch (Throwable th2) {
                try {
                    AbstractC8883c.this.f32337c.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC8883c.this.m35742i(result);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n4.c$b */
    public class b extends FutureTask<Result> {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC8883c.this.m35743j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC8883c.this.m35743j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: n4.c$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f32341a;

        public c(Object obj) {
            this.f32341a = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: n4.c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            AbstractC8883c.this.m35740d(this.f32341a);
        }
    }

    /* JADX INFO: renamed from: n4.c$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32343a;

        static {
            int[] iArr = new int[e.values().length];
            f32343a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32343a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: n4.c$e */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: e */
    public static Handler m35737e() {
        Handler handler;
        synchronized (AbstractC8883c.class) {
            try {
                if (f32334e == null) {
                    f32334e = new Handler(Looper.getMainLooper());
                }
                handler = f32334e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35738a(boolean z10) {
        this.f32337c.set(true);
        return this.f32335a.cancel(z10);
    }

    /* JADX INFO: renamed from: b */
    public abstract Result mo35715b();

    /* JADX INFO: renamed from: c */
    public final void m35739c(@NonNull Executor executor) {
        if (this.f32336b == e.PENDING) {
            this.f32336b = e.RUNNING;
            executor.execute(this.f32335a);
            return;
        }
        int i10 = d.f32343a[this.f32336b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* JADX INFO: renamed from: d */
    public void m35740d(Result result) {
        if (m35741f()) {
            mo35716g(result);
        } else {
            mo35717h(result);
        }
        this.f32336b = e.FINISHED;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m35741f() {
        return this.f32337c.get();
    }

    /* JADX INFO: renamed from: g */
    public void mo35716g(Result result) {
    }

    /* JADX INFO: renamed from: h */
    public void mo35717h(Result result) {
    }

    /* JADX INFO: renamed from: i */
    public void m35742i(Result result) {
        m35737e().post(new c(result));
    }

    /* JADX INFO: renamed from: j */
    public void m35743j(Result result) {
        if (this.f32338d.get()) {
            return;
        }
        m35742i(result);
    }
}
