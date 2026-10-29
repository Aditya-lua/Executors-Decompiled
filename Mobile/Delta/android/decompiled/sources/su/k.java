package su;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import ku.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsu/k;", "Lku/l0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "F", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "w", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lku/l0;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f31336c = new k();

    @Override // ku.l0
    public void F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        c.f31322i.Z(block, true, true);
    }

    @Override // ku.l0
    @NotNull
    public l0 P(int parallelism, @Nullable String name) {
        m.a(parallelism);
        return parallelism >= j.f31333d ? m.b(this, name) : super.P(parallelism, name);
    }

    @Override // ku.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // ku.l0
    public void w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        c.f31322i.Z(block, true, false);
    }
}
