package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7878j0;
import p256ku.C7905p;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: mu.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0093\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lmu/v;", "Lkotlin/Function0;", "", "block", "a", "(Lmu/v;Lkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "E", "Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lnt/b;", "", "Lmu/x;", "b", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lmu/x;", "Lmu/a;", "onBufferOverflow", "Lku/r0;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;ILmu/a;Lku/r0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lmu/x;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8685t {

    /* JADX INFO: renamed from: mu.t$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.channels.ProduceKt", m39664f = "Produce.kt", m39665l = {302}, m39666m = "awaitClose")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31724t;

        /* JADX INFO: renamed from: u */
        public Object f31725u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f31726v;

        /* JADX INFO: renamed from: w */
        public int f31727w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31726v = obj;
            this.f31727w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8685t.m34964a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mu.t$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<Unit> f31728a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC7897n<? super Unit> interfaceC7897n) {
            this.f31728a = interfaceC7897n;
        }

        /* JADX INFO: renamed from: a */
        public final void m34969a(Throwable th2) {
            InterfaceC7897n<Unit> interfaceC7897n = this.f31728a;
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m34969a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m34964a(@NotNull InterfaceC8687v<?> interfaceC8687v, @NotNull Function0<Unit> function0, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f31727w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f31727w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f31726v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f31727w;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                if (aVar.getContext().get(InterfaceC7850d2.INSTANCE) != interfaceC8687v) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar.f31724t = interfaceC8687v;
                aVar.f31725u = function0;
                aVar.f31727w = 1;
                C7905p c7905p = new C7905p(C10046b.m38803c(aVar), 1);
                c7905p.m32860H();
                interfaceC8687v.mo34864t(new b(c7905p));
                Object objM32857A = c7905p.m32857A();
                if (objM32857A == C10047c.m38805e()) {
                    C10346h.m39673c(aVar);
                }
                if (objM32857A == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) aVar.f31725u;
                C7348o.m30470b(obj);
            }
            function0.invoke();
            return Unit.f29331a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <E> InterfaceC8689x<E> m34965b(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, int i10, @NotNull Function2<? super InterfaceC8687v<? super E>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return m34966c(interfaceC7906p0, coroutineContext, i10, EnumC8666a.SUSPEND, EnumC7914r0.DEFAULT, null, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <E> InterfaceC8689x<E> m34966c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a, @NotNull EnumC7914r0 enumC7914r0, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super InterfaceC8687v<? super E>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        C8686u c8686u = new C8686u(C7878j0.m32705k(interfaceC7906p0, coroutineContext), C8675j.m34927b(i10, enumC8666a, null, 4, null));
        if (function1 != null) {
            c8686u.mo32601q(function1);
        }
        c8686u.m32554W0(enumC7914r0, c8686u, function2);
        return c8686u;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC8689x m34967d(InterfaceC7906p0 interfaceC7906p0, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m34965b(interfaceC7906p0, coroutineContext, i10, function2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC8689x m34968e(InterfaceC7906p0 interfaceC7906p0, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, EnumC7914r0 enumC7914r0, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            enumC8666a = EnumC8666a.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            enumC7914r0 = EnumC7914r0.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        return m34966c(interfaceC7906p0, coroutineContext, i10, enumC8666a, enumC7914r0, function3, function2);
    }
}
