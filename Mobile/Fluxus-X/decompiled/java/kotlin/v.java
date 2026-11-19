package kotlin;

import av.g2;
import com.github.luben.zstd.BuildConfig;
import dv.i;
import eu.b;
import fu.c;
import gu.d;
import gu.e;
import gu.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.r;
import zt.n;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lev/v;", "T", "Ldv/i;", "Lgu/d;", "Lgu/e;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Ldv/i;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lzt/n;", BuildConfig.FLAVOR, "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "releaseIntercepted", "()V", "value", "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "Leu/b;", "uCont", "r", "(Leu/b;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "p", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lev/m;", "exception", "s", "(Lev/m;Ljava/lang/Object;)V", "t", "Ldv/i;", "u", "Lkotlin/coroutines/CoroutineContext;", BuildConfig.FLAVOR, "v", "I", "collectContextSize", "w", "lastEmissionContext", "x", "Leu/b;", "completion_", "getCallerFrame", "()Lgu/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v<T> extends d implements i<T>, e {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i<T> collector;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext collectContext;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final int collectContextSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CoroutineContext lastEmissionContext;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b<? super p001kotlin.Unit> completion_;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull i<? super T> iVar, @NotNull CoroutineContext coroutineContext) {
        super(r.f14750a, p001kotlin.coroutines.e.f21548a);
        this.collector = iVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2() { // from class: ev.u
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(v.q(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    public static final int q(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    @Override // dv.i
    @Nullable
    public Object emit(T t8, @NotNull b<? super p001kotlin.Unit> bVar) {
        try {
            Object objR = r(bVar, t8);
            if (objR == c.e()) {
                h.c(bVar);
            }
            return objR == c.e() ? objR : p001kotlin.Unit.f21506a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new m(th2, bVar.getContext());
            throw th2;
        }
    }

    @Override // gu.a, gu.e
    @Nullable
    public e getCallerFrame() {
        b<? super p001kotlin.Unit> bVar = this.completion_;
        if (bVar instanceof e) {
            return (e) bVar;
        }
        return null;
    }

    @Override // gu.d, eu.b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? p001kotlin.coroutines.e.f21548a : coroutineContext;
    }

    @Override // gu.a
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // gu.a
    @NotNull
    public Object invokeSuspend(@NotNull Object result) {
        Throwable thE = n.e(result);
        if (thE != null) {
            this.lastEmissionContext = new m(thE, getContext());
        }
        b<? super p001kotlin.Unit> bVar = this.completion_;
        if (bVar != null) {
            bVar.resumeWith(result);
        }
        return c.e();
    }

    public final void p(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof m) {
            s((m) previousContext, value);
        }
        y.b(this, currentContext);
    }

    public final Object r(b<? super p001kotlin.Unit> uCont, T value) {
        CoroutineContext context = uCont.getContext();
        g2.i(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            p(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        pu.n nVar = Function3.f14759a;
        i<T> iVar = this.collector;
        Intrinsics.d(iVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = nVar.invoke(iVar, value, this);
        if (!Intrinsics.c(objInvoke, c.e())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    @Override // gu.d, gu.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    public final void s(m exception, Object value) {
        throw new IllegalStateException(r.n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
