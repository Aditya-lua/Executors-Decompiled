package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p395qu.C10711a0;
import p395qu.C10733l0;
import pt.C10346h;
import ru.C11136a;
import ru.C11137b;

/* JADX INFO: renamed from: ku.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lku/r0;", "start", "Lkotlin/Function2;", "Lnt/b;", "", "", "block", "Lku/d2;", "c", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lku/d2;", "T", "Lku/w0;", "a", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lku/w0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class C7882k {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC7934w0<T> m32777a(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, @NotNull EnumC7914r0 enumC7914r0, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextM32705k = C7878j0.m32705k(interfaceC7906p0, coroutineContext);
        C7938x0 c7890l2 = enumC7914r0.m32904c() ? new C7890l2(coroutineContextM32705k, function2) : new C7938x0(coroutineContextM32705k, true);
        ((AbstractC7832a) c7890l2).m32554W0(enumC7914r0, c7890l2, function2);
        return (InterfaceC7934w0<T>) c7890l2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7934w0 m32778b(InterfaceC7906p0 interfaceC7906p0, CoroutineContext coroutineContext, EnumC7914r0 enumC7914r0, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        if ((i10 & 2) != 0) {
            enumC7914r0 = EnumC7914r0.DEFAULT;
        }
        return C7872i.m32678a(interfaceC7906p0, coroutineContext, enumC7914r0, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC7850d2 m32779c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, @NotNull EnumC7914r0 enumC7914r0, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextM32705k = C7878j0.m32705k(interfaceC7906p0, coroutineContext);
        AbstractC7832a c7895m2 = enumC7914r0.m32904c() ? new C7895m2(coroutineContextM32705k, function2) : new C7936w2(coroutineContextM32705k, true);
        c7895m2.m32554W0(enumC7914r0, c7895m2, function2);
        return c7895m2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC7850d2 m32780d(InterfaceC7906p0 interfaceC7906p0, CoroutineContext coroutineContext, EnumC7914r0 enumC7914r0, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        if ((i10 & 2) != 0) {
            enumC7914r0 = EnumC7914r0.DEFAULT;
        }
        return C7872i.m32680c(interfaceC7906p0, coroutineContext, enumC7914r0, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m32781e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        Object objM32585Y0;
        CoroutineContext context = interfaceC9557b.getContext();
        CoroutineContext coroutineContextM32704j = C7878j0.m32704j(context, coroutineContext);
        C7865g2.m32652f(coroutineContextM32704j);
        if (coroutineContextM32704j == context) {
            C10711a0 c10711a0 = new C10711a0(coroutineContextM32704j, interfaceC9557b);
            objM32585Y0 = C11137b.m41914d(c10711a0, c10711a0, function2);
        } else {
            InterfaceC7720d.Companion bVar = InterfaceC7720d.INSTANCE;
            if (Intrinsics.m31980c(coroutineContextM32704j.get(bVar), context.get(bVar))) {
                C7876i3 c7876i3 = new C7876i3(coroutineContextM32704j, interfaceC9557b);
                CoroutineContext context2 = c7876i3.getContext();
                Object objM40889i = C10733l0.m40889i(context2, null);
                try {
                    Object objM41914d = C11137b.m41914d(c7876i3, c7876i3, function2);
                    C10733l0.m40886f(context2, objM40889i);
                    objM32585Y0 = objM41914d;
                } catch (Throwable th2) {
                    C10733l0.m40886f(context2, objM40889i);
                    throw th2;
                }
            } else {
                C7844c1 c7844c1 = new C7844c1(coroutineContextM32704j, interfaceC9557b);
                C11136a.m41909b(function2, c7844c1, c7844c1);
                objM32585Y0 = c7844c1.m32585Y0();
            }
        }
        if (objM32585Y0 == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32585Y0;
    }
}
