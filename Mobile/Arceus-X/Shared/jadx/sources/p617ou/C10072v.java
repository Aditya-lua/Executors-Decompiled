package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7791r;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p256ku.C7865g2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: ou.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010)\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m31665d2 = {"Lou/v;", "T", "Lnu/i;", "Lpt/d;", "Lpt/e;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "()V", "value", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lnt/b;", "uCont", "t", "(Lnt/b;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "r", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lou/m;", "exception", "u", "(Lou/m;Ljava/lang/Object;)V", "Lnu/i;", "Lkotlin/coroutines/CoroutineContext;", "", "v", "I", "collectContextSize", "w", "lastEmissionContext", "x", "Lnt/b;", "completion_", "getCallerFrame", "()Lpt/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10072v<T> extends AbstractC10342d implements InterfaceC9577i<T>, InterfaceC10343e {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9577i<T> collector;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext collectContext;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int collectContextSize;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public CoroutineContext lastEmissionContext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public InterfaceC9557b<? super Unit> completion_;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.i<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10072v(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull CoroutineContext coroutineContext) {
        super(C10068r.f36263a, C7721e.f29393a);
        this.collector = interfaceC9577i;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2() { // from class: ou.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C10072v.m38837s(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: s */
    public static final int m38837s(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    @Override // nu.InterfaceC9577i
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        try {
            Object objM38839t = m38839t(interfaceC9557b, t8);
            if (objM38839t == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM38839t == C10047c.m38805e() ? objM38839t : Unit.f29331a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new C10063m(th2, interfaceC9557b.getContext());
            throw th2;
        }
    }

    @Override // pt.AbstractC10339a, pt.InterfaceC10343e
    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<? super Unit> interfaceC9557b = this.completion_;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // pt.AbstractC10342d, p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? C7721e.f29393a : coroutineContext;
    }

    @Override // pt.AbstractC10339a
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // pt.AbstractC10339a
    @NotNull
    public Object invokeSuspend(@NotNull Object result) {
        Throwable thM30463e = C7347n.m30463e(result);
        if (thM30463e != null) {
            this.lastEmissionContext = new C10063m(thM30463e, getContext());
        }
        InterfaceC9557b<? super Unit> interfaceC9557b = this.completion_;
        if (interfaceC9557b != null) {
            interfaceC9557b.resumeWith(result);
        }
        return C10047c.m38805e();
    }

    /* JADX INFO: renamed from: r */
    public final void m38838r(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof C10063m) {
            m38840u((C10063m) previousContext, value);
        }
        C10075y.m38844b(this, currentContext);
    }

    @Override // pt.AbstractC10342d, pt.AbstractC10339a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    /* JADX DEBUG: Class process forced to load method for inline: ou.w.a():zt.n */
    /* JADX INFO: renamed from: t */
    public final Object m38839t(InterfaceC9557b<? super Unit> uCont, T value) {
        CoroutineContext context = uCont.getContext();
        C7865g2.m32652f(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            m38838r(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        InterfaceC14057n interfaceC14057n = Function3.f36274a;
        InterfaceC9577i<T> interfaceC9577i = this.collector;
        Intrinsics.m31981d(interfaceC9577i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.m31981d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = interfaceC14057n.invoke(interfaceC9577i, value, this);
        if (!Intrinsics.m31980c(objInvoke, C10047c.m38805e())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: u */
    public final void m38840u(C10063m exception, Object value) {
        throw new IllegalStateException(C7791r.m32285n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
