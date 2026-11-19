package m4;

import av.h2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm4/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lav/p0;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", BuildConfig.FLAVOR, "close", "()V", "a", "Lkotlin/coroutines/CoroutineContext;", "I", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements AutoCloseable, p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    public b(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // av.p0
    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        h2.d(getCoroutineContext(), null, 1, null);
    }
}
