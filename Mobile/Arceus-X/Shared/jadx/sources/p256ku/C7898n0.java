package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p229jt.C7328a;
import p395qu.C10722g;

/* JADX INFO: renamed from: ku.n0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7898n0 {
    /* JADX INFO: renamed from: a */
    public static final void m32820a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        if (th2 instanceof C7839b1) {
            th2 = ((C7839b1) th2).getCause();
        }
        try {
            InterfaceC7893m0 interfaceC7893m0 = (InterfaceC7893m0) coroutineContext.get(InterfaceC7893m0.INSTANCE);
            if (interfaceC7893m0 != null) {
                interfaceC7893m0.handleException(coroutineContext, th2);
            } else {
                C10722g.m40848a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C10722g.m40848a(coroutineContext, m32821b(th2, th3));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Throwable m32821b(@NotNull Throwable th2, @NotNull Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C7328a.m30429a(runtimeException, th2);
        return runtimeException;
    }
}
