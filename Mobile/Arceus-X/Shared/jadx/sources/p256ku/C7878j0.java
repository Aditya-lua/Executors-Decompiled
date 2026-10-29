package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: ku.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "k", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "j", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "h", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lnt/b;", "", "oldValue", "Lku/i3;", "m", "(Lnt/b;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lku/i3;", "Lpt/e;", "l", "(Lpt/e;)Lku/i3;", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7878j0 {
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.coroutines.CoroutineContext */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public static final CoroutineContext m32698d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zM32702h = m32702h(coroutineContext);
        boolean zM32702h2 = m32702h(coroutineContext2);
        if (!zM32702h && !zM32702h2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = coroutineContext2;
        C7721e c7721e = C7721e.f29393a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(c7721e, new Function2() { // from class: ku.h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C7878j0.m32699e(c7729c0, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zM32702h2) {
            c7729c0.f29425a = ((CoroutineContext) c7729c0.f29425a).fold(c7721e, new Function2() { // from class: ku.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C7878j0.m32700f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) c7729c0.f29425a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    /* JADX INFO: renamed from: e */
    public static final CoroutineContext m32699e(C7729c0 c7729c0, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof InterfaceC7858f0)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) c7729c0.f29425a).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z10 ? ((InterfaceC7858f0) element).copyForChild() : (InterfaceC7858f0) element);
        }
        c7729c0.f29425a = ((CoroutineContext) c7729c0.f29425a).minusKey(element.getKey());
        return coroutineContext.plus(((InterfaceC7858f0) element).mergeForChild(element2));
    }

    /* JADX INFO: renamed from: f */
    public static final CoroutineContext m32700f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof InterfaceC7858f0 ? coroutineContext.plus(((InterfaceC7858f0) element).copyForChild()) : coroutineContext.plus(element);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final String m32701g(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m32702h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: ku.g0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C7878j0.m32703i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m32703i(boolean z10, CoroutineContext.Element element) {
        return z10 || (element instanceof InterfaceC7858f0);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final CoroutineContext m32704j(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !m32702h(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : m32698d(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final CoroutineContext m32705k(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextM32698d = m32698d(interfaceC7906p0.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextM32698d == C7864g1.m32643a() || coroutineContextM32698d.get(InterfaceC7720d.INSTANCE) != null) ? coroutineContextM32698d : coroutineContextM32698d.plus(C7864g1.m32643a());
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final C7876i3<?> m32706l(@NotNull InterfaceC10343e interfaceC10343e) {
        while (!(interfaceC10343e instanceof C7844c1) && (interfaceC10343e = interfaceC10343e.getCallerFrame()) != null) {
            if (interfaceC10343e instanceof C7876i3) {
                return (C7876i3) interfaceC10343e;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final C7876i3<?> m32707m(@NotNull InterfaceC9557b<?> interfaceC9557b, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(interfaceC9557b instanceof InterfaceC10343e) || coroutineContext.get(C7881j3.f29750a) == null) {
            return null;
        }
        C7876i3<?> c7876i3M32706l = m32706l((InterfaceC10343e) interfaceC9557b);
        if (c7876i3M32706l != null) {
            c7876i3M32706l.m32692a1(coroutineContext, obj);
        }
        return c7876i3M32706l;
    }
}
