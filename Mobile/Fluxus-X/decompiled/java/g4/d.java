package g4;

import android.view.ViewGroup;
import f4.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg4/d;", "Lg4/j;", "Lf4/q;", "fragment", "Landroid/view/ViewGroup;", "parentContainer", "<init>", "(Lf4/q;Landroid/view/ViewGroup;)V", "b", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull q fragment, @Nullable ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.parentContainer = viewGroup;
    }
}
