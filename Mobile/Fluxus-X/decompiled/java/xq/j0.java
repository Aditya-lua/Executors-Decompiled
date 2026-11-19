package xq;

import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import s5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxq/j0;", "Ls5/a;", "T", "Landroidx/recyclerview/widget/RecyclerView$g0;", "binding", "<init>", "(Ls5/a;)V", "u", "Ls5/a;", "N", "()Ls5/a;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0<T extends s5.a> extends RecyclerView.g0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final T binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull T binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @NotNull
    public final T N() {
        return this.binding;
    }
}
