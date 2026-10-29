package e;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Le/p;", "Le/u0;", "statusBarStyle", "navigationBarStyle", "", "b", "(Le/p;Le/u0;Le/u0;)V", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Le/f0;", "c", "Le/f0;", "Impl", "activity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14963a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static f0 f14964c;

    public static final void a(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        c(pVar, null, null, 3, null);
    }

    public static final void b(@NotNull p pVar, @NotNull u0 statusBarStyle, @NotNull u0 navigationBarStyle) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = pVar.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Function1<Resources, Boolean> function1B = statusBarStyle.b();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        boolean zBooleanValue = function1B.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function1B2 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        boolean zBooleanValue2 = function1B2.invoke(resources2).booleanValue();
        f0 a0Var = f14964c;
        if (a0Var == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                a0Var = new d0();
            } else if (i10 >= 30) {
                a0Var = new c0();
            } else if (i10 >= 29) {
                a0Var = new b0();
            } else {
                a0Var = i10 >= 28 ? new a0() : new y();
            }
            f14964c = a0Var;
        }
        f0 f0Var = a0Var;
        Window window = pVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        f0Var.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = pVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        f0Var.b(window2);
    }

    public static /* synthetic */ void c(p pVar, u0 u0Var, u0 u0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u0Var = u0.Companion.d(u0.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            u0Var2 = u0.Companion.d(u0.INSTANCE, f14963a, b, null, 4, null);
        }
        b(pVar, u0Var, u0Var2);
    }
}
