package jq;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le4/k;", "Landroidx/fragment/app/FragmentManager;", "fm", "", "tag", "", "a", "(Le4/k;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void a(@NotNull e4.k kVar, @NotNull FragmentManager fm2, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            kVar.t2(fm2, tag);
        } catch (IllegalStateException unused) {
        }
    }
}
