package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ku.b1;
import ku.c3;
import ku.d1;
import ku.m1;
import ku.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001c\u00107\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0014R\u0013\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0?8\u0002X\u0082\u0004¨\u0006A"}, d2 = {"Lqu/i;", "T", "Lku/d1;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lnt/b;", "Lku/l0;", "dispatcher", "continuation", "<init>", "(Lku/l0;Lnt/b;)V", "", "t", "()Z", "", "l", "()V", "v", "Lku/p;", "m", "()Lku/p;", "Lku/n;", "", "w", "(Lku/n;)Ljava/lang/Throwable;", "cause", "u", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Ljt/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "q", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "Lku/l0;", "e", "Lnt/b;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getCallerFrame", "()Lpt/e;", "callerFrame", "c", "()Lnt/b;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "r", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> extends d1<T> implements pt.e, nt.b<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29645h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nt.b<T> continuation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object _state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull ku.l0 l0Var, @NotNull nt.b<? super T> bVar) {
        super(-1);
        this.dispatcher = l0Var;
        this.continuation = bVar;
        this._state = j.f29650a;
        this.countOrElement = l0.g(getContext());
    }

    @Override // ku.d1
    @NotNull
    public nt.b<T> c() {
        return this;
    }

    @Override // pt.e
    @Nullable
    public pt.e getCallerFrame() {
        nt.b<T> bVar = this.continuation;
        if (bVar instanceof pt.e) {
            return (pt.e) bVar;
        }
        return null;
    }

    @Override // nt.b
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // ku.d1
    @Nullable
    public Object j() {
        Object obj = this._state;
        this._state = j.f29650a;
        return obj;
    }

    public final void l() {
        while (f29645h.get(this) == j.b) {
        }
    }

    @Nullable
    public final ku.p<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29645h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f29645h.set(this, j.b);
                return null;
            }
            if (obj instanceof ku.p) {
                if (y1.b.a(f29645h, this, obj, j.b)) {
                    return (ku.p) obj;
                }
            } else if (obj != j.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void q(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.F(context, this);
    }

    public final ku.p<?> r() {
        Object obj = f29645h.get(this);
        if (obj instanceof ku.p) {
            return (ku.p) obj;
        }
        return null;
    }

    @Override // nt.b
    public void resumeWith(@NotNull Object result) throws b1 {
        Object objB = ku.e0.b(result);
        if (j.d(this.dispatcher, getContext())) {
            this._state = objB;
            this.resumeMode = 0;
            j.c(this.dispatcher, getContext(), this);
            return;
        }
        m1 m1VarB = c3.f22770a.b();
        if (m1VarB.i0()) {
            this._state = objB;
            this.resumeMode = 0;
            m1VarB.a0(this);
            return;
        }
        m1VarB.e0(true);
        try {
            CoroutineContext context = getContext();
            Object objI = l0.i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f22483a;
                l0.f(context, objI);
                while (m1VarB.t0()) {
                }
            } catch (Throwable th2) {
                l0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                i(th3);
            } finally {
                m1VarB.X(true);
            }
        }
    }

    public final boolean t() {
        return f29645h.get(this) != null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + t0.c(this.continuation) + ']';
    }

    public final boolean u(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29645h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = j.b;
            if (Intrinsics.c(obj, e0Var)) {
                if (y1.b.a(f29645h, this, e0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (y1.b.a(f29645h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        l();
        ku.p<?> pVarR = r();
        if (pVarR != null) {
            pVarR.u();
        }
    }

    @Nullable
    public final Throwable w(@NotNull ku.n<?> continuation) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29645h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = j.b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (y1.b.a(f29645h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!y1.b.a(f29645h, this, e0Var, continuation));
        return null;
    }
}
