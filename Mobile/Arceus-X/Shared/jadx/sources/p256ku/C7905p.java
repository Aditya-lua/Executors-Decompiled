package p256ku;

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
import p229jt.C7334d;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p395qu.AbstractC10713b0;
import p395qu.C10719e0;
import p395qu.C10726i;
import p563y1.C12996b;
import p615zt.InterfaceC14057n;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: ku.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010(\u001a\u00020\rH\u0001¢\u0006\u0004\b(\u0010\u000fJ\u0011\u0010:\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020B2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00028\u0001¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bL\u0010;J\u000f\u0010M\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u00108J\u001d\u0010P\u001a\u00020\u00162\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016¢\u0006\u0004\bP\u0010!J-\u0010R\u001a\u00020\u00162\u0006\u0010E\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJC\u0010T\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010Z\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Qj\u0002`YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020BH\u0000¢\u0006\u0004\b\\\u0010]JI\u0010^\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0016H\u0000¢\u0006\u0004\b`\u00108JO\u0010a\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bg\u0010!J\u001b\u0010i\u001a\u00020\u0016*\u00020h2\u0006\u0010E\u001a\u00028\u0000H\u0016¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u0016*\u00020h2\u0006\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020qH\u0014¢\u0006\u0004\bt\u0010sR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010|\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010~\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u001dR\u0015\u0010\u0080\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010sR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010;R\u0016\u0010\u0083\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000fR\u0015\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\r\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u008a\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u008a\u00018\u0002X\u0082\u0004¨\u0006\u008d\u0001"}, m31665d2 = {"Lku/p;", "T", "Lku/d1;", "Lku/n;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lku/k3;", "Lnt/b;", "delegate", "", "resumeMode", "<init>", "(Lnt/b;I)V", "", "M", "()Z", "", "cause", "t", "(Ljava/lang/Throwable;)Z", "Lqu/b0;", "segment", "", "s", "(Lqu/b0;Ljava/lang/Throwable;)V", "Z", "X", "Lku/i1;", "I", "()Lku/i1;", "", "handler", "K", "(Ljava/lang/Object;)V", "state", "N", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "w", "(I)V", "R", "Lku/r2;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "idempotent", "W", "(Lku/r2;Ljava/lang/Object;ILzt/n;Ljava/lang/Object;)Ljava/lang/Object;", "Lqu/e0;", "Y", "(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Lqu/e0;", "", "m", "(Ljava/lang/Object;)Ljava/lang/Void;", "v", "()V", "H", "j", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "p", "P", "(Ljava/lang/Throwable;)V", "Lku/m;", "q", "(Lku/m;Ljava/lang/Throwable;)V", "value", "r", "(Lzt/n;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lku/d2;", "parent", "y", "(Lku/d2;)Ljava/lang/Throwable;", "A", "Q", "Ljt/n;", "result", "resumeWith", "Lkotlin/Function1;", "S", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "k", "(Ljava/lang/Object;Lzt/n;)V", "index", "e", "(Lqu/b0;I)V", "Lkotlinx/coroutines/CompletionHandler;", "n", "(Lkotlin/jvm/functions/Function1;)V", "L", "(Lku/m;)V", "U", "(Ljava/lang/Object;ILzt/n;)V", "u", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Ljava/lang/Object;", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "J", "Lku/l0;", "x", "(Lku/l0;Ljava/lang/Object;)V", "f", "(Lku/l0;Ljava/lang/Throwable;)V", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "O", "d", "Lnt/b;", "c", "()Lnt/b;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "z", "parentHandle", "C", "stateDebugRepresentation", "B", "b", "isActive", "isCompleted", "getCallerFrame", "()Lpt/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C7905p<T> extends AbstractC7849d1<T> implements InterfaceC7897n<T>, InterfaceC10343e, InterfaceC7886k3 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29784f = AtomicIntegerFieldUpdater.newUpdater(C7905p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29785g = AtomicReferenceFieldUpdater.newUpdater(C7905p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29786h = AtomicReferenceFieldUpdater.newUpdater(C7905p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<T> delegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7905p(@NotNull InterfaceC9557b<? super T> interfaceC9557b, int i10) {
        super(i10);
        this.delegate = interfaceC9557b;
        this.context = interfaceC9557b.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C7847d.f29698a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m32854T(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m32855V(C7905p c7905p, Object obj, int i10, InterfaceC14057n interfaceC14057n, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC14057n = null;
        }
        c7905p.m32870U(obj, i10, interfaceC14057n);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m32857A() {
        InterfaceC7850d2 interfaceC7850d2;
        boolean zM32864M = m32864M();
        if (m32874Z()) {
            if (m32883z() == null) {
                m32861I();
            }
            if (zM32864M) {
                m32867Q();
            }
            return C10047c.m38805e();
        }
        if (zM32864M) {
            m32867Q();
        }
        Object objM32858B = m32858B();
        if (objM32858B instanceof C7843c0) {
            throw ((C7843c0) objM32858B).cause;
        }
        if (!C7854e1.m32627b(this.resumeMode) || (interfaceC7850d2 = (InterfaceC7850d2) getContext().get(InterfaceC7850d2.INSTANCE)) == null || interfaceC7850d2.mo32556b()) {
            return mo32593h(objM32858B);
        }
        CancellationException cancellationExceptionMo32600m = interfaceC7850d2.mo32600m();
        mo32590a(objM32858B, cancellationExceptionMo32600m);
        throw cancellationExceptionMo32600m;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m32858B() {
        return f29785g.get(this);
    }

    /* JADX INFO: renamed from: C */
    public final String m32859C() {
        Object objM32858B = m32858B();
        if (objM32858B instanceof InterfaceC7916r2) {
            return "Active";
        }
        return objM32858B instanceof C7917s ? "Cancelled" : "Completed";
    }

    @Override // p256ku.InterfaceC7897n
    @Nullable
    /* JADX INFO: renamed from: G */
    public <R extends T> Object mo32809G(R value, @Nullable Object idempotent, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return m32873Y(value, idempotent, onCancellation);
    }

    /* JADX INFO: renamed from: H */
    public void m32860H() {
        InterfaceC7874i1 interfaceC7874i1M32861I = m32861I();
        if (interfaceC7874i1M32861I != null && mo32812d()) {
            interfaceC7874i1M32861I.mo32664a();
            f29786h.set(this, C7912q2.f29793a);
        }
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC7874i1 m32861I() {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) getContext().get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 == null) {
            return null;
        }
        InterfaceC7874i1 interfaceC7874i1M32674j = C7870h2.m32674j(interfaceC7850d2, false, new C7921t(this), 1, null);
        C12996b.m48310a(f29786h, this, null, interfaceC7874i1M32674j);
        return interfaceC7874i1M32674j;
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: J */
    public void mo32810J(@NotNull Object token) {
        m32882w(this.resumeMode);
    }

    /* JADX DEBUG: Class process forced to load method for inline: ku.b0.b(ku.b0, java.lang.Object, ku.m, zt.n, java.lang.Object, java.lang.Throwable, int, java.lang.Object):ku.b0 */
    /* JADX INFO: renamed from: K */
    public final void m32862K(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29785g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C7847d) {
                if (C12996b.m48310a(f29785g, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof InterfaceC7892m) || (obj instanceof AbstractC10713b0)) {
                m32865N(handler, obj);
            } else {
                if (obj instanceof C7843c0) {
                    C7843c0 c7843c0 = (C7843c0) obj;
                    if (!c7843c0.m32580c()) {
                        m32865N(handler, obj);
                    }
                    if (obj instanceof C7917s) {
                        Throwable th2 = c7843c0.cause;
                        if (handler instanceof InterfaceC7892m) {
                            m32876q((InterfaceC7892m) handler, th2);
                            return;
                        } else {
                            Intrinsics.m31981d(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m32878s((AbstractC10713b0) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        m32865N(handler, obj);
                    }
                    if (handler instanceof AbstractC10713b0) {
                        return;
                    }
                    Intrinsics.m31981d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC7892m interfaceC7892m = (InterfaceC7892m) handler;
                    if (completedContinuation.m32571c()) {
                        m32876q(interfaceC7892m, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (C12996b.m48310a(f29785g, this, obj, CompletedContinuation.m32569b(completedContinuation, null, interfaceC7892m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof AbstractC10713b0) {
                        return;
                    }
                    Intrinsics.m31981d(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (C12996b.m48310a(f29785g, this, obj, new CompletedContinuation(obj, (InterfaceC7892m) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m32863L(@NotNull InterfaceC7892m handler) {
        m32862K(handler);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m32864M() {
        if (!C7854e1.m32628c(this.resumeMode)) {
            return false;
        }
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C10726i) interfaceC9557b).m40862t();
    }

    /* JADX INFO: renamed from: N */
    public final void m32865N(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public String mo32761O() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: P */
    public final void m32866P(@NotNull Throwable cause) {
        if (m32879t(cause)) {
            return;
        }
        mo32817p(cause);
        m32881v();
    }

    /* JADX INFO: renamed from: Q */
    public final void m32867Q() {
        Throwable thM40865w;
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        C10726i c10726i = interfaceC9557b instanceof C10726i ? (C10726i) interfaceC9557b : null;
        if (c10726i == null || (thM40865w = c10726i.m40865w(this)) == null) {
            return;
        }
        m32880u();
        mo32817p(thM40865w);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m32868R() {
        Object obj = f29785g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            m32880u();
            return false;
        }
        f29784f.set(this, 536870911);
        f29785g.set(this, C7847d.f29698a);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m32869S(T value, @Nullable final Function1<? super Throwable, Unit> onCancellation) {
        m32870U(value, this.resumeMode, onCancellation != null ? new InterfaceC14057n() { // from class: ku.o
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C7905p.m32854T(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    /* JADX INFO: renamed from: U */
    public final <R> void m32870U(R proposedUpdate, int resumeMode, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29785g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC7916r2)) {
                R r8 = proposedUpdate;
                InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC14057n = onCancellation;
                if (obj instanceof C7917s) {
                    C7917s c7917s = (C7917s) obj;
                    if (c7917s.m32907e()) {
                        if (interfaceC14057n != null) {
                            m32877r(interfaceC14057n, c7917s.cause, r8);
                            return;
                        }
                        return;
                    }
                }
                m32875m(r8);
                throw new C7334d();
            }
            R r10 = proposedUpdate;
            int i10 = resumeMode;
            InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC14057n2 = onCancellation;
            if (C12996b.m48310a(f29785g, this, obj, m32871W((InterfaceC7916r2) obj, r10, i10, interfaceC14057n2, null))) {
                m32881v();
                m32882w(i10);
                return;
            } else {
                proposedUpdate = r10;
                resumeMode = i10;
                onCancellation = interfaceC14057n2;
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final <R> Object m32871W(InterfaceC7916r2 state, R proposedUpdate, int resumeMode, InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof C7843c0) {
            return proposedUpdate;
        }
        if ((C7854e1.m32627b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC7892m) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof InterfaceC7892m ? (InterfaceC7892m) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m32872X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29784f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f29784f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final <R> C10719e0 m32873Y(R proposedUpdate, Object idempotent, InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29785g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC7916r2)) {
                Object obj2 = idempotent;
                if ((obj instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj).idempotentResume == obj2) {
                    return C7909q.f29790a;
                }
                return null;
            }
            R r8 = proposedUpdate;
            Object obj3 = idempotent;
            InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC14057n = onCancellation;
            if (C12996b.m48310a(f29785g, this, obj, m32871W((InterfaceC7916r2) obj, r8, this.resumeMode, interfaceC14057n, obj3))) {
                m32881v();
                return C7909q.f29790a;
            }
            proposedUpdate = r8;
            onCancellation = interfaceC14057n;
            idempotent = obj3;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m32874Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29784f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f29784f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // p256ku.AbstractC7849d1
    /* JADX INFO: renamed from: a */
    public void mo32590a(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29785g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC7916r2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C7843c0) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.m32571c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = cause;
                th2 = th3;
                if (C12996b.m48310a(f29785g, this, obj, CompletedContinuation.m32569b(completedContinuation, null, null, null, null, th3, 15, null))) {
                    completedContinuation.m32572d(this, th2);
                    return;
                }
            } else {
                th2 = cause;
                if (C12996b.m48310a(f29785g, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            cause = th2;
        }
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: b */
    public boolean mo32811b() {
        return m32858B() instanceof InterfaceC7916r2;
    }

    @Override // p256ku.AbstractC7849d1
    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC9557b<T> mo32591c() {
        return this.delegate;
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: d */
    public boolean mo32812d() {
        return !(m32858B() instanceof InterfaceC7916r2);
    }

    @Override // p256ku.InterfaceC7886k3
    /* JADX INFO: renamed from: e */
    public void mo32790e(@NotNull AbstractC10713b0<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29784f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        m32862K(segment);
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: f */
    public void mo32813f(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull Throwable th2) {
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        C10726i c10726i = interfaceC9557b instanceof C10726i ? (C10726i) interfaceC9557b : null;
        m32855V(this, new C7843c0(th2, false, 2, null), (c10726i != null ? c10726i.dispatcher : null) == abstractC7888l0 ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // p256ku.AbstractC7849d1
    @Nullable
    /* JADX INFO: renamed from: g */
    public Throwable mo32592g(@Nullable Object state) {
        Throwable thMo32592g = super.mo32592g(state);
        if (thMo32592g != null) {
            return thMo32592g;
        }
        return null;
    }

    @Override // pt.InterfaceC10343e
    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p256ku.AbstractC7849d1
    /* JADX INFO: renamed from: h */
    public <T> T mo32593h(@Nullable Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // p256ku.AbstractC7849d1
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo32595j() {
        return m32858B();
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: k */
    public <R extends T> void mo32814k(R value, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        m32870U(value, this.resumeMode, onCancellation);
    }

    /* JADX INFO: renamed from: m */
    public final Void m32875m(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: n */
    public void mo32815n(@NotNull Function1<? super Throwable, Unit> handler) {
        C7913r.m32901c(this, new InterfaceC7892m.a(handler));
    }

    @Override // p256ku.InterfaceC7897n
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object mo32816o(@NotNull Throwable exception) {
        return m32873Y(new C7843c0(exception, false, 2, null), null, null);
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: p */
    public boolean mo32817p(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29785g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC7916r2)) {
                return false;
            }
        } while (!C12996b.m48310a(f29785g, this, obj, new C7917s(this, cause, (obj instanceof InterfaceC7892m) || (obj instanceof AbstractC10713b0))));
        InterfaceC7916r2 interfaceC7916r2 = (InterfaceC7916r2) obj;
        if (interfaceC7916r2 instanceof InterfaceC7892m) {
            m32876q((InterfaceC7892m) obj, cause);
        } else if (interfaceC7916r2 instanceof AbstractC10713b0) {
            m32878s((AbstractC10713b0) obj, cause);
        }
        m32881v();
        m32882w(this.resumeMode);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m32876q(@NotNull InterfaceC7892m handler, @Nullable Throwable cause) {
        try {
            handler.mo32621a(cause);
        } catch (Throwable th2) {
            C7898n0.m32820a(getContext(), new C7848d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final <R> void m32877r(@NotNull InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @NotNull Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (Throwable th2) {
            C7898n0.m32820a(getContext(), new C7848d0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p315nt.InterfaceC9557b
    public void resumeWith(@NotNull Object result) {
        m32855V(this, C7853e0.m32625c(result, this), this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m32878s(AbstractC10713b0<?> segment, Throwable cause) {
        int i10 = f29784f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.mo34951s(i10, cause, getContext());
        } catch (Throwable th2) {
            C7898n0.m32820a(getContext(), new C7848d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m32879t(Throwable cause) {
        if (!m32864M()) {
            return false;
        }
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C10726i) interfaceC9557b).m40863u(cause);
    }

    @NotNull
    public String toString() {
        return mo32761O() + '(' + C7922t0.m32910c(this.delegate) + "){" + m32859C() + "}@" + C7922t0.m32909b(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m32880u() {
        InterfaceC7874i1 interfaceC7874i1M32883z = m32883z();
        if (interfaceC7874i1M32883z == null) {
            return;
        }
        interfaceC7874i1M32883z.mo32664a();
        f29786h.set(this, C7912q2.f29793a);
    }

    /* JADX INFO: renamed from: v */
    public final void m32881v() {
        if (m32864M()) {
            return;
        }
        m32880u();
    }

    /* JADX INFO: renamed from: w */
    public final void m32882w(int mode) {
        if (m32872X()) {
            return;
        }
        C7854e1.m32626a(this, mode);
    }

    @Override // p256ku.InterfaceC7897n
    /* JADX INFO: renamed from: x */
    public void mo32818x(@NotNull AbstractC7888l0 abstractC7888l0, T t8) {
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        C10726i c10726i = interfaceC9557b instanceof C10726i ? (C10726i) interfaceC9557b : null;
        m32855V(this, t8, (c10726i != null ? c10726i.dispatcher : null) == abstractC7888l0 ? 4 : this.resumeMode, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public Throwable mo32762y(@NotNull InterfaceC7850d2 parent) {
        return parent.mo32600m();
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC7874i1 m32883z() {
        return (InterfaceC7874i1) f29786h.get(this);
    }
}
