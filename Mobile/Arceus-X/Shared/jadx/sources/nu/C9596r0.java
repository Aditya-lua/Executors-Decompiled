package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import p395qu.C10719e0;
import p617ou.C10070t;

/* JADX INFO: renamed from: nu.r0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m31665d2 = {"T", "value", "Lnu/c0;", "a", "(Ljava/lang/Object;)Lnu/c0;", "Lnu/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lnu/h;", "d", "(Lnu/p0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "Lqu/e0;", "Lqu/e0;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9596r0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f34682a = new C10719e0("NONE");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f34683b = new C10719e0("PENDING");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9566c0<T> m37859a(T t8) {
        if (t8 == null) {
            t8 = (T) C10070t.f36266a;
        }
        return new C9594q0(t8);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC9575h<T> m37862d(@NotNull InterfaceC9592p0<? extends T> interfaceC9592p0, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC8666a != EnumC8666a.DROP_OLDEST) ? C9578i0.m37761e(interfaceC9592p0, coroutineContext, i10, enumC8666a) : interfaceC9592p0;
    }
}
