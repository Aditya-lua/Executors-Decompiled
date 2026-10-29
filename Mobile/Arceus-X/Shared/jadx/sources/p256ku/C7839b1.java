package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ku.b1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lku/b1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lku/l0;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ljava/lang/Throwable;Lku/l0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7839b1 extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Throwable cause;

    public C7839b1(@NotNull Throwable th2, @NotNull AbstractC7888l0 abstractC7888l0, @NotNull CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + abstractC7888l0 + " threw an exception, context = " + coroutineContext, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }
}
