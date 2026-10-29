package f4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf4/l;", "Lf4/j;", "Landroidx/fragment/app/c;", "fragment", "expectedParentFragment", "", "containerId", "<init>", "(Landroidx/fragment/app/c;Landroidx/fragment/app/c;I)V", "b", "Landroidx/fragment/app/c;", "getExpectedParentFragment", "()Landroidx/fragment/app/c;", "c", "I", "getContainerId", "()I", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.fragment.app.c expectedParentFragment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int containerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull androidx.fragment.app.c fragment, @NotNull androidx.fragment.app.c expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i10;
    }
}
