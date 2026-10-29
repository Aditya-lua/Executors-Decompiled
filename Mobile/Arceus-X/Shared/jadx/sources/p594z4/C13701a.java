package p594z4;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z4.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lz4/a;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$b;", "key", "Lz4/p;", "connectionWrapper", "<init>", "(Lkotlin/coroutines/CoroutineContext$b;Lz4/p;)V", "a", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "b", "Lz4/p;", "()Lz4/p;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13701a implements CoroutineContext.Element {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext.InterfaceC7716b<C13701a> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13716p connectionWrapper;

    public C13701a(@NotNull CoroutineContext.InterfaceC7716b<C13701a> key, @NotNull C13716p connectionWrapper) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(connectionWrapper, "connectionWrapper");
        this.key = key;
        this.connectionWrapper = connectionWrapper;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C13716p getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.C7714a.m31947a(this, r8, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
        return (E) CoroutineContext.Element.C7714a.m31948b(this, interfaceC7716b);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.InterfaceC7716b<C13701a> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
        return CoroutineContext.Element.C7714a.m31949c(this, interfaceC7716b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.C7714a.m31950d(this, coroutineContext);
    }
}
