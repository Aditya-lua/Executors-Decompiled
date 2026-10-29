package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;

/* JADX INFO: renamed from: ku.z */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"T", "Lku/x;", "Ljt/n;", "result", "", "d", "(Lku/x;Ljava/lang/Object;)Z", "Lku/d2;", "parent", "b", "(Lku/d2;)Lku/x;", "value", "a", "(Ljava/lang/Object;)Lku/x;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7945z {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC7937x<T> m32933a(T t8) {
        C7941y c7941y = new C7941y(null);
        c7941y.mo32930s(t8);
        return c7941y;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC7937x<T> m32934b(@Nullable InterfaceC7850d2 interfaceC7850d2) {
        return new C7941y(interfaceC7850d2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC7937x m32935c(InterfaceC7850d2 interfaceC7850d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7850d2 = null;
        }
        return m32934b(interfaceC7850d2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final <T> boolean m32936d(@NotNull InterfaceC7937x<T> interfaceC7937x, @NotNull Object obj) {
        Throwable thM30463e = C7347n.m30463e(obj);
        return thM30463e == null ? interfaceC7937x.mo32930s(obj) : interfaceC7937x.mo32929r(thM30463e);
    }
}
