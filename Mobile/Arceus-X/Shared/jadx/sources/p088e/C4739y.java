package p088e;

import android.view.View;
import android.view.Window;
import androidx.core.view.C0590c1;
import androidx.core.view.C0619l1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e.y */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Le/y;", "Le/e0;", "<init>", "()V", "Le/u0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "a", "(Le/u0;Le/u0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C4739y extends AbstractC4701e0 {
    @Override // p088e.InterfaceC4703f0
    /* JADX INFO: renamed from: a */
    public void mo22998a(@NotNull C4733u0 statusBarStyle, @NotNull C4733u0 navigationBarStyle, @NotNull Window window, @NotNull View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        C0590c1.m2821b(window, false);
        window.setStatusBarColor(statusBarStyle.m23090d(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.m23090d(navigationBarIsDark));
        C0619l1 c0619l1 = new C0619l1(window, view);
        c0619l1.m2950d(!statusBarIsDark);
        c0619l1.m2949c(!navigationBarIsDark);
    }
}
