package sg;

import android.content.res.Configuration;
import android.view.Window;
import androidx.core.view.C0590c1;
import androidx.core.view.C0619l1;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sg.c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lsg/c2;", "", "<init>", "()V", "Landroid/view/Window;", "window", "", "b", "(Landroid/view/Window;)V", "c", "Landroid/content/res/Configuration;", "config", "a", "(Landroid/view/Window;Landroid/content/res/Configuration;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11304c2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11304c2 f39677a = new C11304c2();

    /* JADX INFO: renamed from: a */
    public static final void m42491a(@NotNull Window window, @NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.orientation == 2) {
            m42492b(window);
        } else {
            m42493c(window);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m42492b(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        C0619l1 c0619l1M2820a = C0590c1.m2820a(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(c0619l1M2820a, "getInsetsController(...)");
        c0619l1M2820a.m2947a(WindowInsetsCompat.Type.systemBars());
        c0619l1M2820a.m2947a(WindowInsetsCompat.Type.displayCutout());
        c0619l1M2820a.m2951e(2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m42493c(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        C0619l1 c0619l1M2820a = C0590c1.m2820a(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(c0619l1M2820a, "getInsetsController(...)");
        c0619l1M2820a.m2952f(WindowInsetsCompat.Type.systemBars());
        c0619l1M2820a.m2952f(WindowInsetsCompat.Type.displayCutout());
    }
}
