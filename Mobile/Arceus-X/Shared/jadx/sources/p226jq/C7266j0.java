package p226jq;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: jq.j0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Ljq/j0;", "Lr5/a;", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "binding", "<init>", "(Lr5/a;)V", "u", "Lr5/a;", "N", "()Lr5/a;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7266j0<T extends InterfaceC10784a> extends RecyclerView.AbstractC1023f0 {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final T binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7266j0(@NotNull T binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final T m30292N() {
        return this.binding;
    }
}
