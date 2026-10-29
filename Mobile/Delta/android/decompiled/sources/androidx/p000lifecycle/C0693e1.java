package androidx.p000lifecycle;

import android.view.View;
import k4.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.e1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/c1;", "viewModelStoreOwner", "", "a", "(Landroid/view/View;Landroidx/lifecycle/c1;)V", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0693e1 {
    public static final void a(@NotNull View view, @Nullable c1 c1Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(c.f22170a, c1Var);
    }
}
