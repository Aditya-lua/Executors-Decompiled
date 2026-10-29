package nu;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7850d2;
import p617ou.C10058h;
import p617ou.InterfaceC10067q;

/* JADX INFO: renamed from: nu.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\t\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"T", "Lnu/h;", "", "capacity", "Lmu/a;", "onBufferOverflow", "a", "(Lnu/h;ILmu/a;)Lnu/h;", "e", "(Lnu/h;)Lnu/h;", "Lkotlin/coroutines/CoroutineContext;", "context", "f", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;)Lnu/h;", "c", "", "d", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9589o {
    /* JADX DEBUG: Class process forced to load method for inline: ou.q.a.a(ou.q, kotlin.coroutines.CoroutineContext, int, mu.a, int, java.lang.Object):nu.h */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9575h<T> m37834a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, int i10, @NotNull EnumC8666a enumC8666a) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && enumC8666a != EnumC8666a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            enumC8666a = EnumC8666a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        EnumC8666a enumC8666a2 = enumC8666a;
        if (interfaceC9575h instanceof InterfaceC10067q) {
            return InterfaceC10067q.a.m38835a((InterfaceC10067q) interfaceC9575h, null, i11, enumC8666a2, 1, null);
        }
        return new C10058h(interfaceC9575h, null, i11, enumC8666a2, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC9575h m37835b(InterfaceC9575h interfaceC9575h, int i10, EnumC8666a enumC8666a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            enumC8666a = EnumC8666a.SUSPEND;
        }
        return C9579j.m37785b(interfaceC9575h, i10, enumC8666a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC9575h<T> m37836c(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        return interfaceC9575h instanceof InterfaceC9565c ? interfaceC9575h : new C9567d(interfaceC9575h);
    }

    /* JADX INFO: renamed from: d */
    public static final void m37837d(CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC7850d2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37838e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        return m37835b(interfaceC9575h, -1, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC9575h<T> m37839f(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull CoroutineContext coroutineContext) {
        m37837d(coroutineContext);
        if (Intrinsics.m31980c(coroutineContext, C7721e.f29393a)) {
            return interfaceC9575h;
        }
        if (interfaceC9575h instanceof InterfaceC10067q) {
            return InterfaceC10067q.a.m38835a((InterfaceC10067q) interfaceC9575h, coroutineContext, 0, null, 6, null);
        }
        return new C10058h(interfaceC9575h, coroutineContext, 0, null, 12, null);
    }
}
