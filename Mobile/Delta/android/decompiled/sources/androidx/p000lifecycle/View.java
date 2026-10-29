package androidx.p000lifecycle;

import c3.b;
import j4.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.d1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/s;", "lifecycleOwner", "", "b", "(Landroid/view/View;Landroidx/lifecycle/s;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class View {
    @Nullable
    public static final s a(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.f21091a);
            s sVar = tag instanceof s ? (s) tag : null;
            if (sVar != null) {
                return sVar;
            }
            Object objA = b.a(view);
            view = objA instanceof android.view.View ? (android.view.View) objA : null;
        }
        return null;
    }

    public static final void b(@NotNull android.view.View view, @Nullable s sVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(a.f21091a, sVar);
    }
}
