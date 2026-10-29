package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039c3.C1522b;
import p208j4.C7030a;

/* JADX INFO: renamed from: androidx.lifecycle.d1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroid/view/View;", "Landroidx/lifecycle/s;", "lifecycleOwner", "", "b", "(Landroid/view/View;Landroidx/lifecycle/s;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "lifecycle-runtime"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class View {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0980s m4901a(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C7030a.f27585a);
            InterfaceC0980s interfaceC0980s = tag instanceof InterfaceC0980s ? (InterfaceC0980s) tag : null;
            if (interfaceC0980s != null) {
                return interfaceC0980s;
            }
            Object objM7952a = C1522b.m7952a(view);
            view = objM7952a instanceof android.view.View ? (android.view.View) objM7952a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m4902b(@NotNull android.view.View view, @Nullable InterfaceC0980s interfaceC0980s) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C7030a.f27585a, interfaceC0980s);
    }
}
