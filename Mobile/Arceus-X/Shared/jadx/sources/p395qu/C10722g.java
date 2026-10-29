package p395qu;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p229jt.C7328a;
import p256ku.C7898n0;
import p256ku.InterfaceC7893m0;

/* JADX INFO: renamed from: qu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10722g {
    /* JADX INFO: renamed from: a */
    public static final void m40848a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Iterator<InterfaceC7893m0> it = C10720f.m40838a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (Throwable th3) {
                C10720f.m40839b(C7898n0.m32821b(th2, th3));
            }
        }
        try {
            C7328a.m30429a(th2, new C10724h(coroutineContext));
        } catch (Throwable unused) {
        }
        C10720f.m40839b(th2);
    }
}
