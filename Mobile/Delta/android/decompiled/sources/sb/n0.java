package sb;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n0<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31139a = new Object();
    public final i0 b = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f31141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f31142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f31143f;

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> a(@NonNull Executor executor, @NonNull e eVar) {
        this.b.a(new y(executor, eVar));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new a0(l.f31136a, onCompleteListener));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        a0 a0Var = new a0(l.f31136a, onCompleteListener);
        this.b.a(a0Var);
        m0.l(activity).m(a0Var);
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> c(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new a0(executor, onCompleteListener));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> d(@NonNull Executor executor, @NonNull f fVar) {
        this.b.a(new c0(executor, fVar));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> e(@NonNull f fVar) {
        d(l.f31136a, fVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> f(@NonNull Executor executor, @NonNull g<? super TResult> gVar) {
        this.b.a(new e0(executor, gVar));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> g(@NonNull g<? super TResult> gVar) {
        f(l.f31136a, gVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f31139a) {
            exc = this.f31143f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f31139a) {
            try {
                u();
                v();
                Exception exc = this.f31143f;
                if (exc != null) {
                    throw new i(exc);
                }
                tresult = (TResult) this.f31142e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> h(@NonNull Executor executor, @NonNull c<TResult, TContinuationResult> cVar) {
        n0 n0Var = new n0();
        this.b.a(new u(executor, cVar, n0Var));
        x();
        return n0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> i(@NonNull Executor executor, @NonNull c<TResult, Task<TContinuationResult>> cVar) {
        n0 n0Var = new n0();
        this.b.a(new w(executor, cVar, n0Var));
        x();
        return n0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f31139a) {
            try {
                z10 = false;
                if (this.f31140c && !this.f31141d && this.f31143f == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> j(@NonNull c<TResult, Task<TContinuationResult>> cVar) {
        return i(l.f31136a, cVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult k(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f31139a) {
            try {
                u();
                v();
                if (cls.isInstance(this.f31143f)) {
                    throw cls.cast(this.f31143f);
                }
                Exception exc = this.f31143f;
                if (exc != null) {
                    throw new i(exc);
                }
                tresult = (TResult) this.f31142e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f31141d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z10;
        synchronized (this.f31139a) {
            z10 = this.f31140c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> n(Executor executor, j<TResult, TContinuationResult> jVar) {
        n0 n0Var = new n0();
        this.b.a(new g0(executor, jVar, n0Var));
        x();
        return n0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> o(@NonNull j<TResult, TContinuationResult> jVar) {
        Executor executor = l.f31136a;
        n0 n0Var = new n0();
        this.b.a(new g0(executor, jVar, n0Var));
        x();
        return n0Var;
    }

    public final void p(@NonNull Exception exc) {
        n9.m.m(exc, "Exception must not be null");
        synchronized (this.f31139a) {
            w();
            this.f31140c = true;
            this.f31143f = exc;
        }
        this.b.b(this);
    }

    public final void q(Object obj) {
        synchronized (this.f31139a) {
            w();
            this.f31140c = true;
            this.f31142e = obj;
        }
        this.b.b(this);
    }

    public final boolean r() {
        synchronized (this.f31139a) {
            try {
                if (this.f31140c) {
                    return false;
                }
                this.f31140c = true;
                this.f31141d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean s(@NonNull Exception exc) {
        n9.m.m(exc, "Exception must not be null");
        synchronized (this.f31139a) {
            try {
                if (this.f31140c) {
                    return false;
                }
                this.f31140c = true;
                this.f31143f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.f31139a) {
            try {
                if (this.f31140c) {
                    return false;
                }
                this.f31140c = true;
                this.f31142e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        n9.m.q(this.f31140c, "Task is not yet complete");
    }

    public final void v() {
        if (this.f31141d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void w() {
        if (this.f31140c) {
            throw d.a(this);
        }
    }

    public final void x() {
        synchronized (this.f31139a) {
            try {
                if (this.f31140c) {
                    this.b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
