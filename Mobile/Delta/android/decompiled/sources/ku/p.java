package ku;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010(\u001a\u00020\rH\u0001¢\u0006\u0004\b(\u0010\u000fJ\u0011\u0010:\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020B2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00028\u0001¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bL\u0010;J\u000f\u0010M\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u00108J\u001d\u0010P\u001a\u00020\u00162\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016¢\u0006\u0004\bP\u0010!J-\u0010R\u001a\u00020\u00162\u0006\u0010E\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJC\u0010T\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010Z\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Qj\u0002`YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020BH\u0000¢\u0006\u0004\b\\\u0010]JI\u0010^\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0016H\u0000¢\u0006\u0004\b`\u00108JO\u0010a\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bg\u0010!J\u001b\u0010i\u001a\u00020\u0016*\u00020h2\u0006\u0010E\u001a\u00028\u0000H\u0016¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u0016*\u00020h2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020qH\u0014¢\u0006\u0004\bt\u0010sR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010|\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010~\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u001dR\u0015\u0010\u0080\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010sR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010;R\u0016\u0010\u0083\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000fR\u0015\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\r\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u008a\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u008a\u00018\u0002X\u0082\u0004¨\u0006\u008d\u0001"}, d2 = {"Lku/p;", "T", "Lku/d1;", "Lku/n;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lku/k3;", "Lnt/b;", "delegate", "", "resumeMode", "<init>", "(Lnt/b;I)V", "", "M", "()Z", "", "cause", "t", "(Ljava/lang/Throwable;)Z", "Lqu/b0;", "segment", "", "s", "(Lqu/b0;Ljava/lang/Throwable;)V", "Z", "X", "Lku/i1;", "I", "()Lku/i1;", "", "handler", "K", "(Ljava/lang/Object;)V", "state", "N", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "w", "(I)V", "R", "Lku/r2;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "idempotent", "W", "(Lku/r2;Ljava/lang/Object;ILzt/n;Ljava/lang/Object;)Ljava/lang/Object;", "Lqu/e0;", "Y", "(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Lqu/e0;", "", "m", "(Ljava/lang/Object;)Ljava/lang/Void;", "v", "()V", "H", "j", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "p", "P", "(Ljava/lang/Throwable;)V", "Lku/m;", "q", "(Lku/m;Ljava/lang/Throwable;)V", "value", "r", "(Lzt/n;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lku/d2;", "parent", "y", "(Lku/d2;)Ljava/lang/Throwable;", "A", "Q", "Ljt/n;", "result", "resumeWith", "Lkotlin/Function1;", "S", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "k", "(Ljava/lang/Object;Lzt/n;)V", "index", "e", "(Lqu/b0;I)V", "Lkotlinx/coroutines/CompletionHandler;", "n", "(Lkotlin/jvm/functions/Function1;)V", "L", "(Lku/m;)V", "U", "(Ljava/lang/Object;ILzt/n;)V", "u", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Ljava/lang/Object;", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "J", "Lku/l0;", "x", "(Lku/l0;Ljava/lang/Object;)V", "f", "(Lku/l0;Ljava/lang/Throwable;)V", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "O", "d", "Lnt/b;", "c", "()Lnt/b;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "z", "parentHandle", "C", "stateDebugRepresentation", "B", "b", "isActive", "isCompleted", "getCallerFrame", "()Lpt/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p<T> extends d1<T> implements n<T>, pt.e, k3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22844f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22845g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22846h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nt.b<T> delegate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull nt.b<? super T> bVar, int i10) {
        super(i10);
        this.delegate = bVar;
        this.context = bVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f22771a;
    }

    public static final Unit T(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f22483a;
    }

    public static /* synthetic */ void V(p pVar, Object obj, int i10, zt.n nVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            nVar = null;
        }
        pVar.U(obj, i10, nVar);
    }

    @Nullable
    public final Object A() {
        d2 d2Var;
        boolean zM = M();
        if (Z()) {
            if (z() == null) {
                I();
            }
            if (zM) {
                Q();
            }
            return ot.c.e();
        }
        if (zM) {
            Q();
        }
        Object objB = B();
        if (objB instanceof c0) {
            throw ((c0) objB).cause;
        }
        if (!e1.b(this.resumeMode) || (d2Var = (d2) getContext().get(d2.INSTANCE)) == null || d2Var.b()) {
            return h(objB);
        }
        CancellationException cancellationExceptionM = d2Var.m();
        a(objB, cancellationExceptionM);
        throw cancellationExceptionM;
    }

    @Nullable
    public final Object B() {
        return f22845g.get(this);
    }

    public final String C() {
        Object objB = B();
        if (objB instanceof r2) {
            return "Active";
        }
        return objB instanceof s ? "Cancelled" : "Completed";
    }

    @Override // ku.n
    @Nullable
    public <R extends T> Object G(R value, @Nullable Object idempotent, @Nullable zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return Y(value, idempotent, onCancellation);
    }

    public void H() {
        i1 i1VarI = I();
        if (i1VarI != null && d()) {
            i1VarI.a();
            f22846h.set(this, q2.f22851a);
        }
    }

    public final i1 I() {
        d2 d2Var = (d2) getContext().get(d2.INSTANCE);
        if (d2Var == null) {
            return null;
        }
        i1 i1VarJ = h2.j(d2Var, false, new t(this), 1, null);
        y1.b.a(f22846h, this, null, i1VarJ);
        return i1VarJ;
    }

    @Override // ku.n
    public void J(@NotNull Object token) {
        w(this.resumeMode);
    }

    public final void K(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22845g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d) {
                if (y1.b.a(f22845g, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof m) || (obj instanceof qu.b0)) {
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
                            q((m) handler, th2);
                            return;
                        } else {
                            Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            s((qu.b0) handler, th2);
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
                    if (handler instanceof qu.b0) {
                        return;
                    }
                    Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m mVar = (m) handler;
                    if (completedContinuation.c()) {
                        q(mVar, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (y1.b.a(f22845g, this, obj, CompletedContinuation.b(completedContinuation, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof qu.b0) {
                        return;
                    }
                    Intrinsics.d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (y1.b.a(f22845g, this, obj, new CompletedContinuation(obj, (m) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void L(@NotNull m handler) {
        K(handler);
    }

    public final boolean M() {
        if (!e1.c(this.resumeMode)) {
            return false;
        }
        nt.b<T> bVar = this.delegate;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((qu.i) bVar).t();
    }

    public final void N(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    public String O() {
        return "CancellableContinuation";
    }

    public final void P(@NotNull Throwable cause) {
        if (t(cause)) {
            return;
        }
        p(cause);
        v();
    }

    public final void Q() {
        Throwable thW;
        nt.b<T> bVar = this.delegate;
        qu.i iVar = bVar instanceof qu.i ? (qu.i) bVar : null;
        if (iVar == null || (thW = iVar.w(this)) == null) {
            return;
        }
        u();
        p(thW);
    }

    public final boolean R() {
        Object obj = f22845g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            u();
            return false;
        }
        f22844f.set(this, 536870911);
        f22845g.set(this, d.f22771a);
        return true;
    }

    public void S(T value, @Nullable final Function1<? super Throwable, Unit> onCancellation) {
        U(value, this.resumeMode, onCancellation != null ? new zt.n() { // from class: ku.o
            @Override // zt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.T(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final <R> void U(R proposedUpdate, int resumeMode, @Nullable zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22845g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                R r8 = proposedUpdate;
                zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar = onCancellation;
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.e()) {
                        if (nVar != null) {
                            r(nVar, sVar.cause, r8);
                            return;
                        }
                        return;
                    }
                }
                m(r8);
                throw new jt.d();
            }
            R r10 = proposedUpdate;
            int i10 = resumeMode;
            zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar2 = onCancellation;
            if (y1.b.a(f22845g, this, obj, W((r2) obj, r10, i10, nVar2, null))) {
                v();
                w(i10);
                return;
            } else {
                proposedUpdate = r10;
                resumeMode = i10;
                onCancellation = nVar2;
            }
        }
    }

    public final <R> Object W(r2 state, R proposedUpdate, int resumeMode, zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
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
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22844f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f22844f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    public final <R> qu.e0 Y(R proposedUpdate, Object idempotent, zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22845g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return q.f22849a;
                }
                return null;
            }
            R r8 = proposedUpdate;
            Object obj3 = idempotent;
            zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar = onCancellation;
            if (y1.b.a(f22845g, this, obj, W((r2) obj, r8, this.resumeMode, nVar, obj3))) {
                v();
                return q.f22849a;
            }
            proposedUpdate = r8;
            onCancellation = nVar;
            idempotent = obj3;
        }
    }

    public final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22844f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f22844f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // ku.d1
    public void a(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22845g;
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
                if (y1.b.a(f22845g, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, th3, 15, null))) {
                    completedContinuation.d(this, th2);
                    return;
                }
            } else {
                th2 = cause;
                if (y1.b.a(f22845g, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            cause = th2;
        }
    }

    @Override // ku.n
    public boolean b() {
        return B() instanceof r2;
    }

    @Override // ku.d1
    @NotNull
    public final nt.b<T> c() {
        return this.delegate;
    }

    @Override // ku.n
    public boolean d() {
        return !(B() instanceof r2);
    }

    @Override // ku.k3
    public void e(@NotNull qu.b0<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22844f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        K(segment);
    }

    @Override // ku.n
    public void f(@NotNull l0 l0Var, @NotNull Throwable th2) {
        nt.b<T> bVar = this.delegate;
        qu.i iVar = bVar instanceof qu.i ? (qu.i) bVar : null;
        V(this, new c0(th2, false, 2, null), (iVar != null ? iVar.dispatcher : null) == l0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // ku.d1
    @Nullable
    public Throwable g(@Nullable Object state) {
        Throwable thG = super.g(state);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // pt.e
    @Nullable
    public pt.e getCallerFrame() {
        nt.b<T> bVar = this.delegate;
        if (bVar instanceof pt.e) {
            return (pt.e) bVar;
        }
        return null;
    }

    @Override // nt.b
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ku.d1
    public <T> T h(@Nullable Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // ku.d1
    @Nullable
    public Object j() {
        return B();
    }

    @Override // ku.n
    public <R extends T> void k(R value, @Nullable zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        U(value, this.resumeMode, onCancellation);
    }

    public final Void m(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // ku.n
    public void n(@NotNull Function1<? super Throwable, Unit> handler) {
        r.c(this, new m.a(handler));
    }

    @Override // ku.n
    @Nullable
    public Object o(@NotNull Throwable exception) {
        return Y(new c0(exception, false, 2, null), null, null);
    }

    @Override // ku.n
    public boolean p(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22845g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof r2)) {
                return false;
            }
        } while (!y1.b.a(f22845g, this, obj, new s(this, cause, (obj instanceof m) || (obj instanceof qu.b0))));
        r2 r2Var = (r2) obj;
        if (r2Var instanceof m) {
            q((m) obj, cause);
        } else if (r2Var instanceof qu.b0) {
            s((qu.b0) obj, cause);
        }
        v();
        w(this.resumeMode);
        return true;
    }

    public final void q(@NotNull m handler, @Nullable Throwable cause) {
        try {
            handler.a(cause);
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void r(@NotNull zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @NotNull Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // nt.b
    public void resumeWith(@NotNull Object result) {
        V(this, e0.c(result, this), this.resumeMode, null, 4, null);
    }

    public final void s(qu.b0<?> segment, Throwable cause) {
        int i10 = f22844f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.s(i10, cause, getContext());
        } catch (Throwable th2) {
            n0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean t(Throwable cause) {
        if (!M()) {
            return false;
        }
        nt.b<T> bVar = this.delegate;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((qu.i) bVar).u(cause);
    }

    @NotNull
    public String toString() {
        return O() + '(' + t0.c(this.delegate) + "){" + C() + "}@" + t0.b(this);
    }

    public final void u() {
        i1 i1VarZ = z();
        if (i1VarZ == null) {
            return;
        }
        i1VarZ.a();
        f22846h.set(this, q2.f22851a);
    }

    public final void v() {
        if (M()) {
            return;
        }
        u();
    }

    public final void w(int mode) {
        if (X()) {
            return;
        }
        e1.a(this, mode);
    }

    @Override // ku.n
    public void x(@NotNull l0 l0Var, T t8) {
        nt.b<T> bVar = this.delegate;
        qu.i iVar = bVar instanceof qu.i ? (qu.i) bVar : null;
        V(this, t8, (iVar != null ? iVar.dispatcher : null) == l0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @NotNull
    public Throwable y(@NotNull d2 parent) {
        return parent.m();
    }

    public final i1 z() {
        return (i1) f22846h.get(this);
    }
}
