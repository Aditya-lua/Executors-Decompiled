package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;", "b", "Element", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface CoroutineContext {

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface Element extends CoroutineContext {

        /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$Element$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C7714a {
            /* JADX INFO: renamed from: a */
            public static <R> R m31947a(@NotNull Element element, R r8, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r8, element);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.CoroutineContext$Element */
            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* JADX INFO: renamed from: b */
            public static <E extends Element> E m31948b(@NotNull Element element, @NotNull InterfaceC7716b<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.m31980c(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.m31981d(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public static CoroutineContext m31949c(@NotNull Element element, @NotNull InterfaceC7716b<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.m31980c(element.getKey(), key) ? C7721e.f29393a : element;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public static CoroutineContext m31950d(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return C7715a.m31952b(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull InterfaceC7716b<E> key);

        @NotNull
        InterfaceC7716b<?> getKey();
    }

    /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C7715a {
        @NotNull
        /* JADX INFO: renamed from: b */
        public static CoroutineContext m31952b(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == C7721e.f29393a ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2() { // from class: nt.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.C7715a.m31953c((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static CoroutineContext m31953c(CoroutineContext acc, Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
            C7721e c7721e = C7721e.f29393a;
            if (coroutineContextMinusKey == c7721e) {
                return element;
            }
            InterfaceC7720d.Companion bVar = InterfaceC7720d.INSTANCE;
            InterfaceC7720d interfaceC7720d = (InterfaceC7720d) coroutineContextMinusKey.get(bVar);
            if (interfaceC7720d == null) {
                return new C7719c(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(bVar);
            return coroutineContextMinusKey2 == c7721e ? new C7719c(element, interfaceC7720d) : new C7719c(new C7719c(coroutineContextMinusKey2, element), interfaceC7720d);
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC7716b<E extends Element> {
    }

    <R> R fold(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation);

    @Nullable
    <E extends Element> E get(@NotNull InterfaceC7716b<E> key);

    @NotNull
    CoroutineContext minusKey(@NotNull InterfaceC7716b<?> key);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext context);
}
