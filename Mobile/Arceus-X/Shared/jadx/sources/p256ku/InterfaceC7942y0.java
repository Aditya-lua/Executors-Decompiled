package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ku.y0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lku/y0;", "", "", "timeMillis", "Lku/n;", "", "continuation", "o", "(JLku/n;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC7942y0 {

    /* JADX INFO: renamed from: ku.y0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static InterfaceC7874i1 m32932a(@NotNull InterfaceC7942y0 interfaceC7942y0, long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return C7930v0.m32922a().mo32840f(j10, runnable, coroutineContext);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC7874i1 mo32840f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context);

    /* JADX INFO: renamed from: o */
    void mo32841o(long timeMillis, @NotNull InterfaceC7897n<? super Unit> continuation);
}
