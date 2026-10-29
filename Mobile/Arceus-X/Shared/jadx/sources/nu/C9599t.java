package nu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nu.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aY\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"T", "Lnu/h;", "e", "(Lnu/h;)Lnu/h;", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "f", "(Lnu/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lnu/h;", "a", "Lkotlin/jvm/functions/Function1;", "defaultKeySelector", "b", "Lkotlin/jvm/functions/Function2;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9599t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f34685a = new Function1() { // from class: nu.r
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C9599t.m37872d(obj);
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, Object, Boolean> f34686b = new Function2() { // from class: nu.s
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C9599t.m37871c(obj, obj2));
        }
    };

    /* JADX INFO: renamed from: c */
    public static final boolean m37871c(Object obj, Object obj2) {
        return Intrinsics.m31980c(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m37872d(Object obj) {
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37873e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        return interfaceC9575h instanceof InterfaceC9592p0 ? interfaceC9575h : m37874f(interfaceC9575h, f34685a, f34686b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC9575h<T> m37874f(InterfaceC9575h<? extends T> interfaceC9575h, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC9575h instanceof C9573g) {
            C9573g c9573g = (C9573g) interfaceC9575h;
            if (c9573g.keySelector == function1 && c9573g.areEquivalent == function2) {
                return interfaceC9575h;
            }
        }
        return new C9573g(interfaceC9575h, function1, function2);
    }
}
