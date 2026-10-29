package e;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.c1;
import androidx.core.view.l1;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Le/d0;", "Le/c0;", "<init>", "()V", "Le/u0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "a", "(Le/u0;Le/u0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 extends c0 {
    @Override // e.b0, e.y, e.f0
    public void a(@NotNull u0 statusBarStyle, @NotNull u0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        c1.b(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & Barcode.FORMAT_QR_CODE) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int iE = statusBarStyle.e(statusBarIsDark);
            int iE2 = navigationBarStyle.e(navigationBarIsDark);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new b3.d(viewGroup.getContext(), kotlin.collections.p.n(new b3.a(2, iE), new b3.a(1, iE2), new b3.a(4, iE2), new b3.a(8, iE2))));
        }
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode() == 0);
        l1 l1Var = new l1(window, view);
        l1Var.d(!statusBarIsDark);
        l1Var.c(!navigationBarIsDark);
    }
}
