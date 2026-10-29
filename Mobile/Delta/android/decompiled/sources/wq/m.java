package wq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lwq/m;", "", "screen", "Lwq/l;", "transition", "<init>", "(Ljava/lang/Object;Lwq/l;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lwq/l;", "()Lwq/l;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object screen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l transition;

    public m(@NotNull Object screen, @NotNull l transition) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.screen = screen;
        this.transition = transition;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getScreen() {
        return this.screen;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getTransition() {
        return this.transition;
    }
}
