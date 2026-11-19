package cv;

import av.d2;
import av.j0;
import av.p0;
import av.r0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0093\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcv/v;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "block", "a", "(Lcv/v;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;", "E", "Lav/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "capacity", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "Lcv/x;", "c", "(Lav/p0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lcv/x;", "Lcv/a;", "onBufferOverflow", "Lav/r0;", "start", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "b", "(Lav/p0;Lkotlin/coroutines/CoroutineContext;ILcv/a;Lav/r0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcv/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11600t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11601u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11602v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11603w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11602v = obj;
            this.f11603w |= Integer.MIN_VALUE;
            return t.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<Unit> f11604a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(av.n<? super Unit> nVar) {
            this.f11604a = nVar;
        }

        public final void a(Throwable th2) {
            av.n<Unit> nVar = this.f11604a;
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(Unit.f21506a));
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull v<?> vVar, @NotNull Function0<Unit> function0, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f11603w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f11603w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f11602v;
        Object objE = fu.c.e();
        int i11 = aVar.f11603w;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                if (aVar.getContext().get(d2.INSTANCE) != vVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar.f11600t = vVar;
                aVar.f11601u = function0;
                aVar.f11603w = 1;
                av.p pVar = new av.p(fu.b.c(aVar), 1);
                pVar.G();
                vVar.q(new b(pVar));
                Object objY = pVar.y();
                if (objY == fu.c.e()) {
                    gu.h.c(aVar);
                }
                if (objY == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) aVar.f11601u;
                zt.o.b(obj);
            }
            function0.invoke();
            return Unit.f21506a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @NotNull
    public static final <E> x<E> b(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull cv.a aVar, @NotNull r0 r0Var, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super v<? super E>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        u uVar = new u(j0.j(p0Var, coroutineContext), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            uVar.o(function1);
        }
        uVar.W0(r0Var, uVar, function2);
        return uVar;
    }

    @NotNull
    public static final <E> x<E> c(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull Function2<? super v<? super E>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return b(p0Var, coroutineContext, i10, cv.a.SUSPEND, r0.DEFAULT, null, function2);
    }

    public static /* synthetic */ x d(p0 p0Var, CoroutineContext coroutineContext, int i10, cv.a aVar, r0 r0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = cv.a.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            r0Var = r0.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        return b(p0Var, coroutineContext, i10, aVar, r0Var, function3, function2);
    }

    public static /* synthetic */ x e(p0 p0Var, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(p0Var, coroutineContext, i10, function2);
    }
}
