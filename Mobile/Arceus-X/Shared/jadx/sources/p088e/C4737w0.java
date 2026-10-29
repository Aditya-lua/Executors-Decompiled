package p088e;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039c3.C1522b;

/* JADX INFO: renamed from: e.w0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroid/view/View;", "Le/r0;", "onBackPressedDispatcherOwner", "", "b", "(Landroid/view/View;Le/r0;)V", "a", "(Landroid/view/View;)Le/r0;", "activity"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4737w0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4727r0 m23108a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C4729s0.f19257b);
            InterfaceC4727r0 interfaceC4727r0 = tag instanceof InterfaceC4727r0 ? (InterfaceC4727r0) tag : null;
            if (interfaceC4727r0 != null) {
                return interfaceC4727r0;
            }
            Object objM7952a = C1522b.m7952a(view);
            view = objM7952a instanceof View ? (View) objM7952a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m23109b(@NotNull View view, @NotNull InterfaceC4727r0 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C4729s0.f19257b, onBackPressedDispatcherOwner);
    }
}
