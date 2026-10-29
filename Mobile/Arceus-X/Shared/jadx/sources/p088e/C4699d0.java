package p088e;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.C0590c1;
import androidx.core.view.C0619l1;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023b3.C1208a;
import p023b3.C1211d;

/* JADX INFO: renamed from: e.d0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Le/d0;", "Le/c0;", "<init>", "()V", "Le/u0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "a", "(Le/u0;Le/u0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4699d0 extends C4697c0 {
    @Override // p088e.C4695b0, p088e.C4739y, p088e.InterfaceC4703f0
    /* JADX INFO: renamed from: a */
    public void mo22998a(@NotNull C4733u0 statusBarStyle, @NotNull C4733u0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        C0590c1.m2821b(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int iM23091e = statusBarStyle.m23091e(statusBarIsDark);
            int iM23091e2 = navigationBarStyle.m23091e(navigationBarIsDark);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new C1211d(viewGroup.getContext(), C7699p.m31895n(new C1208a(2, iM23091e), new C1208a(1, iM23091e2), new C1208a(4, iM23091e2), new C1208a(8, iM23091e2))));
        }
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode() == 0);
        C0619l1 c0619l1 = new C0619l1(window, view);
        c0619l1.m2950d(!statusBarIsDark);
        c0619l1.m2949c(!navigationBarIsDark);
    }
}
