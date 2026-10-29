package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class C7877j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: a */
    public static final <T> T m32693a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        AbstractC7894m1 abstractC7894m1M32586a;
        CoroutineContext coroutineContextM32705k;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC7720d interfaceC7720d = (InterfaceC7720d) coroutineContext.get(InterfaceC7720d.INSTANCE);
        if (interfaceC7720d == null) {
            abstractC7894m1M32586a = C7846c3.f29696a.m32587b();
            coroutineContextM32705k = C7878j0.m32705k(C7935w1.f29814a, coroutineContext.plus(abstractC7894m1M32586a));
        } else {
            AbstractC7894m1 abstractC7894m1 = interfaceC7720d instanceof AbstractC7894m1 ? (AbstractC7894m1) interfaceC7720d : null;
            if (abstractC7894m1 == null) {
                abstractC7894m1M32586a = C7846c3.f29696a.m32586a();
            } else {
                AbstractC7894m1 abstractC7894m2 = abstractC7894m1.m32807x0() ? abstractC7894m1 : null;
                if (abstractC7894m2 == null) {
                    abstractC7894m1M32586a = C7846c3.f29696a.m32586a();
                } else {
                    abstractC7894m1M32586a = abstractC7894m2;
                }
            }
            coroutineContextM32705k = C7878j0.m32705k(C7935w1.f29814a, coroutineContext);
        }
        C7862g c7862g = new C7862g(coroutineContextM32705k, threadCurrentThread, abstractC7894m1M32586a);
        c7862g.m32554W0(EnumC7914r0.DEFAULT, c7862g, function2);
        return (T) c7862g.m32641X0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m32694b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        return C7872i.m32682e(coroutineContext, function2);
    }
}
