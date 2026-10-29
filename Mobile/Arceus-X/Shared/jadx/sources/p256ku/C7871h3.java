package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.h3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lku/h3;", "Lku/l0;", "<init>", "()V", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lku/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "H", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7871h3 extends AbstractC7888l0 {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C7871h3 f29735c = new C7871h3();

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: H */
    public boolean mo6245H(@NotNull CoroutineContext context) {
        return false;
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Unconfined";
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C7891l3 c7891l3 = (C7891l3) context.get(C7891l3.INSTANCE);
        if (c7891l3 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c7891l3.dispatcherWasUnconfined = true;
    }
}
