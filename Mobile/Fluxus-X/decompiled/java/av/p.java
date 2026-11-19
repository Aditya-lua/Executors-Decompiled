package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010(\u001a\u00020\rH\u0001¢\u0006\u0004\b(\u0010\u000fJ\u0011\u0010:\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020B2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00028\u0001¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bL\u0010;J\u000f\u0010M\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u00108J\u001d\u0010P\u001a\u00020\u00162\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016¢\u0006\u0004\bP\u0010!J-\u0010R\u001a\u00020\u00162\u0006\u0010E\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJC\u0010T\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010Z\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Qj\u0002`YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020BH\u0000¢\u0006\u0004\b\\\u0010]JI\u0010^\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0016H\u0000¢\u0006\u0004\b`\u00108JO\u0010a\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bg\u0010!J\u001b\u0010i\u001a\u00020\u0016*\u00020h2\u0006\u0010E\u001a\u00028\u0000H\u0016¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u0016*\u00020h2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020qH\u0014¢\u0006\u0004\bt\u0010sR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010|\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010~\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u001dR\u0015\u0010\u0080\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010sR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010;R\u0016\u0010\u0083\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000fR\u0015\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\r\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u008a\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u008a\u00018\u0002X\u0082\u0004¨\u0006\u008d\u0001"}, d2 = {"Lav/p;", "T", "Lav/d1;", "Lav/n;", "Lgu/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lav/k3;", "Leu/b;", "delegate", BuildConfig.FLAVOR, "resumeMode", "<init>", "(Leu/b;I)V", BuildConfig.FLAVOR, "M", "()Z", BuildConfig.FLAVOR, "cause", "r", "(Ljava/lang/Throwable;)Z", "Lgv/b0;", "segment", BuildConfig.FLAVOR, "q", "(Lgv/b0;Ljava/lang/Throwable;)V", "Z", "X", "Lav/i1;", "H", "()Lav/i1;", BuildConfig.FLAVOR, "handler", "I", "(Ljava/lang/Object;)V", "state", "N", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "v", "(I)V", "R", "Lav/r2;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "idempotent", "W", "(Lav/r2;Ljava/lang/Object;ILpu/n;Ljava/lang/Object;)Ljava/lang/Object;", "Lgv/e0;", "Y", "(Ljava/lang/Object;Ljava/lang/Object;Lpu/n;)Lgv/e0;", BuildConfig.FLAVOR, "n", "(Ljava/lang/Object;)Ljava/lang/Void;", "u", "()V", "G", "k", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "t", "P", "(Ljava/lang/Throwable;)V", "Lav/m;", "o", "(Lav/m;Ljava/lang/Throwable;)V", "value", "p", "(Lpu/n;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lav/d2;", "parent", "w", "(Lav/d2;)Ljava/lang/Throwable;", "y", "Q", "Lzt/n;", "result", "resumeWith", "Lkotlin/Function1;", "S", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "C", "(Ljava/lang/Object;Lpu/n;)V", "index", "c", "(Lgv/b0;I)V", "Lkotlinx/coroutines/CompletionHandler;", "j", "(Lkotlin/jvm/functions/Function1;)V", "K", "(Lav/m;)V", "U", "(Ljava/lang/Object;ILpu/n;)V", "s", "J", "(Ljava/lang/Object;Ljava/lang/Object;Lpu/n;)Ljava/lang/Object;", "exception", "l", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "L", "Lav/l0;", "D", "(Lav/l0;Ljava/lang/Object;)V", "i", "(Lav/l0;Ljava/lang/Throwable;)V", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "O", "d", "Leu/b;", "e", "()Leu/b;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "x", "parentHandle", "A", "stateDebugRepresentation", "z", "b", "isActive", "isCompleted", "getCallerFrame", "()Lgu/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p<T> extends d1<T> implements n<T>, gu.e, k3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3467f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3468g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3469h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eu.b<T> delegate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull eu.b<? super T> bVar, int i10) {
        super(i10);
        this.delegate = bVar;
        this.context = bVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f3388a;
    }

    public static final Unit T(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f21506a;
    }

    public static /* synthetic */ void V(p pVar, Object obj, int i10, pu.n nVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            nVar = null;
        }
        pVar.U(obj, i10, nVar);
    }

    public final String A() {
        Object objZ = z();
        if (objZ instanceof r2) {
            return "Active";
        }
        return objZ instanceof s ? "Cancelled" : "Completed";
    }

    @Override // av.n
    public <R extends T> void C(R value, @Nullable pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        U(value, this.resumeMode, onCancellation);
    }

    @Override // av.n
    public void D(@NotNull l0 l0Var, T t8) {
        eu.b<T> bVar = this.delegate;
        gv.i iVar = bVar instanceof gv.i ? (gv.i) bVar : null;
        V(this, t8, (iVar != null ? iVar.dispatcher : null) == l0Var ? 4 : this.resumeMode, null, 4, null);
    }

    public void G() {
        i1 i1VarH = H();
        if (i1VarH != null && d()) {
            i1VarH.a();
            f3469h.set(this, q2.f3474a);
        }
    }

    public final i1 H() {
        d2 d2Var = (d2) getContext().get(d2.INSTANCE);
        if (d2Var == null) {
            return null;
        }
        i1 i1VarL = h2.l(d2Var, false, new t(this), 1, null);
        y1.b.a(f3469h, this, null, i1VarL);
        return i1VarL;
    }

    public final void I(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d) {
                if (y1.b.a(f3468g, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof m) || (obj instanceof gv.b0)) {
                N(handler, obj);
            } else {
                if (obj instanceof c0) {
                    c0 c0Var = (c0) obj;
                    if (!c0Var.c()) {
                        N(handler, obj);
                    }
                    if (obj instanceof s) {
                        Throwable th2 = c0Var.cause;
                        if (handler instanceof m) {
                            o((m) handler, th2);
                            return;
                        } else {
                            Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((gv.b0) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        N(handler, obj);
                    }
                    if (handler instanceof gv.b0) {
                        return;
                    }
                    Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m mVar = (m) handler;
                    if (completedContinuation.c()) {
                        o(mVar, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (y1.b.a(f3468g, this, obj, CompletedContinuation.b(completedContinuation, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof gv.b0) {
                        return;
                    }
                    Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (y1.b.a(f3468g, this, obj, new CompletedContinuation(obj, (m) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // av.n
    @Nullable
    public <R extends T> Object J(R value, @Nullable Object idempotent, @Nullable pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return Y(value, idempotent, onCancellation);
    }

    public final void K(@NotNull m handler) {
        I(handler);
    }

    @Override // av.n
    public void L(@NotNull Object token) {
        v(this.resumeMode);
    }

    public final boolean M() {
        if (!e1.c(this.resumeMode)) {
            return false;
        }
        eu.b<T> bVar = this.delegate;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((gv.i) bVar).r();
    }

    public final void N(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    public String O() {
        return "CancellableContinuation";
    }

    public final void P(@NotNull Throwable cause) {
        if (r(cause)) {
            return;
        }
        t(cause);
        u();
    }

    public final void Q() {
        Throwable thV;
        eu.b<T> bVar = this.delegate;
        gv.i iVar = bVar instanceof gv.i ? (gv.i) bVar : null;
        if (iVar == null || (thV = iVar.v(this)) == null) {
            return;
        }
        s();
        t(thV);
    }

    public final boolean R() {
        Object obj = f3468g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            s();
            return false;
        }
        f3467f.set(this, 536870911);
        f3468g.set(this, d.f3388a);
        return true;
    }

    public void S(T value, @Nullable final Function1<? super Throwable, Unit> onCancellation) {
        U(value, this.resumeMode, onCancellation != null ? new pu.n() { // from class: av.o
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.T(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final <R> void U(R proposedUpdate, int resumeMode, @Nullable pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                R r10 = proposedUpdate;
                pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar = onCancellation;
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.e()) {
                        if (nVar != null) {
                            p(nVar, sVar.cause, r10);
                            return;
                        }
                        return;
                    }
                }
                n(r10);
                throw new zt.d();
            }
            R r11 = proposedUpdate;
            int i10 = resumeMode;
            pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar2 = onCancellation;
            if (y1.b.a(f3468g, this, obj, W((r2) obj, r11, i10, nVar2, null))) {
                u();
                v(i10);
                return;
            } else {
                proposedUpdate = r11;
                resumeMode = i10;
                onCancellation = nVar2;
            }
        }
    }

    public final <R> Object W(r2 state, R proposedUpdate, int resumeMode, pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof c0) {
            return proposedUpdate;
        }
        if ((e1.b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof m) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof m ? (m) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    public final boolean X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3467f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f3467f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    public final <R> gv.e0 Y(R proposedUpdate, Object idempotent, pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return q.f3472a;
                }
                return null;
            }
            R r10 = proposedUpdate;
            Object obj3 = idempotent;
            pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar = onCancellation;
            if (y1.b.a(f3468g, this, obj, W((r2) obj, r10, this.resumeMode, nVar, obj3))) {
                u();
                return q.f3472a;
            }
            proposedUpdate = r10;
            onCancellation = nVar;
            idempotent = obj3;
        }
    }

    public final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3467f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f3467f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // av.d1
    public void a(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof r2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof c0) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = cause;
                th2 = th3;
                if (y1.b.a(f3468g, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, th3, 15, null))) {
                    completedContinuation.d(this, th2);
                    return;
                }
            } else {
                th2 = cause;
                if (y1.b.a(f3468g, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            cause = th2;
        }
    }

    @Override // av.n
    public boolean b() {
        return z() instanceof r2;
    }

    @Override // av.k3
    public void c(@NotNull gv.b0<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3467f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        I(segment);
    }

    @Override // av.n
    public boolean d() {
        return !(z() instanceof r2);
    }

    @Override // av.d1
    @NotNull
    public final eu.b<T> e() {
        return this.delegate;
    }

    @Override // av.d1
    @Nullable
    public Throwable f(@Nullable Object state) {
        Throwable thF = super.f(state);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // av.d1
    public <T> T g(@Nullable Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // gu.e
    @Nullable
    public gu.e getCallerFrame() {
        eu.b<T> bVar = this.delegate;
        if (bVar instanceof gu.e) {
            return (gu.e) bVar;
        }
        return null;
    }

    @Override // eu.b
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // av.n
    public void i(@NotNull l0 l0Var, @NotNull Throwable th2) {
        eu.b<T> bVar = this.delegate;
        gv.i iVar = bVar instanceof gv.i ? (gv.i) bVar : null;
        V(this, new c0(th2, false, 2, null), (iVar != null ? iVar.dispatcher : null) == l0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // av.n
    public void j(@NotNull Function1<? super Throwable, Unit> handler) {
        r.c(this, new m.a(handler));
    }

    @Override // av.d1
    @Nullable
    public Object k() {
        return z();
    }

    @Override // av.n
    @Nullable
    public Object l(@NotNull Throwable exception) {
        return Y(new c0(exception, false, 2, null), null, null);
    }

    public final Void n(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    public final void o(@NotNull m handler, @Nullable Throwable cause) {
        try {
            handler.d(cause);
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void p(@NotNull pu.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @NotNull Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q(gv.b0<?> segment, Throwable cause) {
        int i10 = f3467f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.s(i10, cause, getContext());
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean r(Throwable cause) {
        if (!M()) {
            return false;
        }
        eu.b<T> bVar = this.delegate;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((gv.i) bVar).s(cause);
    }

    @Override // eu.b
    public void resumeWith(@NotNull Object result) {
        V(this, e0.c(result, this), this.resumeMode, null, 4, null);
    }

    public final void s() {
        i1 i1VarX = x();
        if (i1VarX == null) {
            return;
        }
        i1VarX.a();
        f3469h.set(this, q2.f3474a);
    }

    @Override // av.n
    public boolean t(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3468g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                return false;
            }
        } while (!y1.b.a(f3468g, this, obj, new s(this, cause, (obj instanceof m) || (obj instanceof gv.b0))));
        r2 r2Var = (r2) obj;
        if (r2Var instanceof m) {
            o((m) obj, cause);
        } else if (r2Var instanceof gv.b0) {
            q((gv.b0) obj, cause);
        }
        u();
        v(this.resumeMode);
        return true;
    }

    @NotNull
    public String toString() {
        return O() + '(' + t0.c(this.delegate) + "){" + A() + "}@" + t0.b(this);
    }

    public final void u() {
        if (M()) {
            return;
        }
        s();
    }

    public final void v(int mode) {
        if (X()) {
            return;
        }
        e1.a(this, mode);
    }

    @NotNull
    public Throwable w(@NotNull d2 parent) {
        return parent.k();
    }

    public final i1 x() {
        return (i1) f3469h.get(this);
    }

    @Nullable
    public final Object y() {
        d2 d2Var;
        boolean zM = M();
        if (Z()) {
            if (x() == null) {
                H();
            }
            if (zM) {
                Q();
            }
            return fu.c.e();
        }
        if (zM) {
            Q();
        }
        Object objZ = z();
        if (objZ instanceof c0) {
            throw ((c0) objZ).cause;
        }
        if (!e1.b(this.resumeMode) || (d2Var = (d2) getContext().get(d2.INSTANCE)) == null || d2Var.b()) {
            return g(objZ);
        }
        CancellationException cancellationExceptionK = d2Var.k();
        a(objZ, cancellationExceptionK);
        throw cancellationExceptionK;
    }

    @Nullable
    public final Object z() {
        return f3468g.get(this);
    }
}
