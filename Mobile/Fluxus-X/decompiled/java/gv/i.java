package gv;

import av.b1;
import av.c3;
import av.d1;
import av.m1;
import av.t0;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001c\u00107\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b-\u00108R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0013\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0>8\u0002X\u0082\u0004¨\u0006@"}, d2 = {"Lgv/i;", "T", "Lav/d1;", "Lgu/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Leu/b;", "Lav/l0;", "dispatcher", "continuation", "<init>", "(Lav/l0;Leu/b;)V", BuildConfig.FLAVOR, "r", "()Z", BuildConfig.FLAVOR, "m", "()V", "u", "Lav/p;", "n", "()Lav/p;", "Lav/n;", BuildConfig.FLAVOR, "v", "(Lav/n;)Ljava/lang/Throwable;", "cause", "s", "(Ljava/lang/Throwable;)Z", BuildConfig.FLAVOR, "k", "()Ljava/lang/Object;", "Lzt/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "o", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "d", "Lav/l0;", "e", "Leu/b;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getCallerFrame", "()Lgu/e;", "callerFrame", "()Leu/b;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "p", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> extends d1<T> implements gu.e, eu.b<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17954h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eu.b<T> continuation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object _state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull av.l0 l0Var, @NotNull eu.b<? super T> bVar) {
        super(-1);
        this.dispatcher = l0Var;
        this.continuation = bVar;
        this._state = j.f17959a;
        this.countOrElement = l0.g(getContext());
    }

    @Override // av.d1
    @NotNull
    public eu.b<T> e() {
        return this;
    }

    @Override // gu.e
    @Nullable
    public gu.e getCallerFrame() {
        eu.b<T> bVar = this.continuation;
        if (bVar instanceof gu.e) {
            return (gu.e) bVar;
        }
        return null;
    }

    @Override // eu.b
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // av.d1
    @Nullable
    public Object k() {
        Object obj = this._state;
        this._state = j.f17959a;
        return obj;
    }

    public final void m() {
        while (f17954h.get(this) == j.b) {
        }
    }

    @Nullable
    public final av.p<T> n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17954h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f17954h.set(this, j.b);
                return null;
            }
            if (obj instanceof av.p) {
                if (y1.b.a(f17954h, this, obj, j.b)) {
                    return (av.p) obj;
                }
            } else if (obj != j.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void o(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.L(context, this);
    }

    public final av.p<?> p() {
        Object obj = f17954h.get(this);
        if (obj instanceof av.p) {
            return (av.p) obj;
        }
        return null;
    }

    public final boolean r() {
        return f17954h.get(this) != null;
    }

    @Override // eu.b
    public void resumeWith(@NotNull Object result) throws b1 {
        Object objB = av.e0.b(result);
        if (j.d(this.dispatcher, getContext())) {
            this._state = objB;
            this.resumeMode = 0;
            j.c(this.dispatcher, getContext(), this);
            return;
        }
        m1 m1VarB = c3.f3387a.b();
        if (m1VarB.i0()) {
            this._state = objB;
            this.resumeMode = 0;
            m1VarB.d0(this);
            return;
        }
        m1VarB.f0(true);
        try {
            CoroutineContext context = getContext();
            Object objI = l0.i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f21506a;
                l0.f(context, objI);
                while (m1VarB.s0()) {
                }
            } catch (Throwable th2) {
                l0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                h(th3);
            } finally {
                m1VarB.Y(true);
            }
        }
    }

    public final boolean s(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17954h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = j.b;
            if (Intrinsics.c(obj, e0Var)) {
                if (y1.b.a(f17954h, this, e0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (y1.b.a(f17954h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + t0.c(this.continuation) + ']';
    }

    public final void u() {
        m();
        av.p<?> pVarP = p();
        if (pVarP != null) {
            pVarP.s();
        }
    }

    @Nullable
    public final Throwable v(@NotNull av.n<?> continuation) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17954h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = j.b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (y1.b.a(f17954h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!y1.b.a(f17954h, this, e0Var, continuation));
        return null;
    }
}
