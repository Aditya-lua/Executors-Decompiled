package p226jq;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p093e4.DialogInterfaceOnCancelListenerC4819k;

/* JADX INFO: renamed from: jq.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Le4/k;", "Landroidx/fragment/app/FragmentManager;", "fm", "", "tag", "", "a", "(Le4/k;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7263i {
    /* JADX INFO: renamed from: a */
    public static final void m30283a(@NotNull DialogInterfaceOnCancelListenerC4819k dialogInterfaceOnCancelListenerC4819k, @NotNull FragmentManager fm2, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(dialogInterfaceOnCancelListenerC4819k, "<this>");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            dialogInterfaceOnCancelListenerC4819k.mo23339t2(fm2, tag);
        } catch (IllegalStateException unused) {
        }
    }
}
