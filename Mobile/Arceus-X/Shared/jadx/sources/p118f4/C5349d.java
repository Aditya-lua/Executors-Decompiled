package p118f4;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0929c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f4.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lf4/d;", "Lf4/j;", "Landroidx/fragment/app/c;", "fragment", "Landroid/view/ViewGroup;", "parentContainer", "<init>", "(Landroidx/fragment/app/c;Landroid/view/ViewGroup;)V", "b", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C5349d extends AbstractC5355j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5349d(@NotNull ComponentCallbacksC0929c fragment, @Nullable ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.parentContainer = viewGroup;
    }
}
