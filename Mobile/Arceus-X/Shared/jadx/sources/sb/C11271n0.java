package sb;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p305n9.C8953m;

/* JADX INFO: renamed from: sb.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11271n0<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f39585a = new Object();

    /* JADX INFO: renamed from: b */
    public final C11261i0 f39586b = new C11261i0();

    /* JADX INFO: renamed from: c */
    public boolean f39587c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f39588d;

    /* JADX INFO: renamed from: e */
    public Object f39589e;

    /* JADX INFO: renamed from: f */
    public Exception f39590f;

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Task<TResult> mo11887a(@NonNull Executor executor, @NonNull InterfaceC11252e interfaceC11252e) {
        this.f39586b.m42323a(new C11283y(executor, interfaceC11252e));
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f39586b.m42323a(new C11245a0(C11266l.f39580a, onCompleteListener));
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: b */
    public final Task<TResult> mo11888b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        C11245a0 c11245a0 = new C11245a0(C11266l.f39580a, onCompleteListener);
        this.f39586b.m42323a(c11245a0);
        C11269m0.m42341l(activity).m42342m(c11245a0);
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: c */
    public final Task<TResult> mo11889c(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f39586b.m42323a(new C11245a0(executor, onCompleteListener));
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: d */
    public final Task<TResult> mo11890d(@NonNull Executor executor, @NonNull InterfaceC11254f interfaceC11254f) {
        this.f39586b.m42323a(new C11249c0(executor, interfaceC11254f));
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: e */
    public final Task<TResult> mo11891e(@NonNull InterfaceC11254f interfaceC11254f) {
        mo11890d(C11266l.f39580a, interfaceC11254f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: f */
    public final Task<TResult> mo11892f(@NonNull Executor executor, @NonNull InterfaceC11256g<? super TResult> interfaceC11256g) {
        this.f39586b.m42323a(new C11253e0(executor, interfaceC11256g));
        m42351x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: g */
    public final Task<TResult> mo11893g(@NonNull InterfaceC11256g<? super TResult> interfaceC11256g) {
        mo11892f(C11266l.f39580a, interfaceC11256g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f39585a) {
            exc = this.f39590f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f39585a) {
            try {
                m42348u();
                m42349v();
                Exception exc = this.f39590f;
                if (exc != null) {
                    throw new C11260i(exc);
                }
                tresult = (TResult) this.f39589e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo11894h(@NonNull Executor executor, @NonNull InterfaceC11248c<TResult, TContinuationResult> interfaceC11248c) {
        C11271n0 c11271n0 = new C11271n0();
        this.f39586b.m42323a(new C11279u(executor, interfaceC11248c, c11271n0));
        m42351x();
        return c11271n0;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo11895i(@NonNull Executor executor, @NonNull InterfaceC11248c<TResult, Task<TContinuationResult>> interfaceC11248c) {
        C11271n0 c11271n0 = new C11271n0();
        this.f39586b.m42323a(new C11281w(executor, interfaceC11248c, c11271n0));
        m42351x();
        return c11271n0;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f39585a) {
            try {
                z10 = false;
                if (this.f39587c && !this.f39588d && this.f39590f == null) {
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
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> Task<TContinuationResult> mo11896j(@NonNull InterfaceC11248c<TResult, Task<TContinuationResult>> interfaceC11248c) {
        return mo11895i(C11266l.f39580a, interfaceC11248c);
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: k */
    public final <X extends Throwable> TResult mo11897k(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f39585a) {
            try {
                m42348u();
                m42349v();
                if (cls.isInstance(this.f39590f)) {
                    throw cls.cast(this.f39590f);
                }
                Exception exc = this.f39590f;
                if (exc != null) {
                    throw new C11260i(exc);
                }
                tresult = (TResult) this.f39589e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: l */
    public final boolean mo11898l() {
        return this.f39588d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: m */
    public final boolean mo11899m() {
        boolean z10;
        synchronized (this.f39585a) {
            z10 = this.f39587c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: n */
    public final <TContinuationResult> Task<TContinuationResult> mo11900n(Executor executor, InterfaceC11262j<TResult, TContinuationResult> interfaceC11262j) {
        C11271n0 c11271n0 = new C11271n0();
        this.f39586b.m42323a(new C11257g0(executor, interfaceC11262j, c11271n0));
        m42351x();
        return c11271n0;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: o */
    public final <TContinuationResult> Task<TContinuationResult> mo11901o(@NonNull InterfaceC11262j<TResult, TContinuationResult> interfaceC11262j) {
        Executor executor = C11266l.f39580a;
        C11271n0 c11271n0 = new C11271n0();
        this.f39586b.m42323a(new C11257g0(executor, interfaceC11262j, c11271n0));
        m42351x();
        return c11271n0;
    }

    /* JADX INFO: renamed from: p */
    public final void m42343p(@NonNull Exception exc) {
        C8953m.m36048m(exc, "Exception must not be null");
        synchronized (this.f39585a) {
            m42350w();
            this.f39587c = true;
            this.f39590f = exc;
        }
        this.f39586b.m42324b(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m42344q(Object obj) {
        synchronized (this.f39585a) {
            m42350w();
            this.f39587c = true;
            this.f39589e = obj;
        }
        this.f39586b.m42324b(this);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m42345r() {
        synchronized (this.f39585a) {
            try {
                if (this.f39587c) {
                    return false;
                }
                this.f39587c = true;
                this.f39588d = true;
                this.f39586b.m42324b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m42346s(@NonNull Exception exc) {
        C8953m.m36048m(exc, "Exception must not be null");
        synchronized (this.f39585a) {
            try {
                if (this.f39587c) {
                    return false;
                }
                this.f39587c = true;
                this.f39590f = exc;
                this.f39586b.m42324b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m42347t(Object obj) {
        synchronized (this.f39585a) {
            try {
                if (this.f39587c) {
                    return false;
                }
                this.f39587c = true;
                this.f39589e = obj;
                this.f39586b.m42324b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m42348u() {
        C8953m.m36052q(this.f39587c, "Task is not yet complete");
    }

    /* JADX INFO: renamed from: v */
    public final void m42349v() {
        if (this.f39588d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m42350w() {
        if (this.f39587c) {
            throw C11250d.m42317a(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m42351x() {
        synchronized (this.f39585a) {
            try {
                if (this.f39587c) {
                    this.f39586b.m42324b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
