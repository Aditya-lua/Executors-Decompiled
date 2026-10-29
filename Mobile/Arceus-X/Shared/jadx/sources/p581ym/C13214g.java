package p581ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lym/g;", "RenderingT", "", "rendering", "Lym/m;", "snapshot", "<init>", "(Ljava/lang/Object;Lym/m;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lym/m;", "()Lym/m;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13214g<RenderingT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final RenderingT rendering;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13220m snapshot;

    public C13214g(RenderingT renderingt, @NotNull C13220m snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.rendering = renderingt;
        this.snapshot = snapshot;
    }

    /* JADX INFO: renamed from: a */
    public final RenderingT m48867a() {
        return this.rendering;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C13220m getSnapshot() {
        return this.snapshot;
    }
}
