package p263l4;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.C7870h2;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: l4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Ll4/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "close", "()V", "a", "Lkotlin/coroutines/CoroutineContext;", "H", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7991b implements AutoCloseable, InterfaceC7906p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    public C7991b(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // p256ku.InterfaceC7906p0
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        C7870h2.m32668d(getCoroutineContext(), null, 1, null);
    }
}
