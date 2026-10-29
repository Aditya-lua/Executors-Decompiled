package p088e;

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

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Le/p;", "Le/u0;", "statusBarStyle", "navigationBarStyle", "", "b", "(Le/p;Le/u0;Le/u0;)V", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Le/f0;", "c", "Le/f0;", "Impl", "activity"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4738x {

    /* JADX INFO: renamed from: a */
    public static final int f19270a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b */
    public static final int f19271b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static InterfaceC4703f0 f19272c;

    /* JADX INFO: renamed from: a */
    public static final void m23110a(@NotNull ActivityC4722p activityC4722p) {
        Intrinsics.checkNotNullParameter(activityC4722p, "<this>");
        m23112c(activityC4722p, null, null, 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m23111b(@NotNull ActivityC4722p activityC4722p, @NotNull C4733u0 statusBarStyle, @NotNull C4733u0 navigationBarStyle) {
        Intrinsics.checkNotNullParameter(activityC4722p, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = activityC4722p.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Function1<Resources, Boolean> function1M23088b = statusBarStyle.m23088b();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        boolean zBooleanValue = function1M23088b.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function1M23088b2 = navigationBarStyle.m23088b();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        boolean zBooleanValue2 = function1M23088b2.invoke(resources2).booleanValue();
        InterfaceC4703f0 c4693a0 = f19272c;
        if (c4693a0 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                c4693a0 = new C4699d0();
            } else if (i10 >= 30) {
                c4693a0 = new C4697c0();
            } else if (i10 >= 29) {
                c4693a0 = new C4695b0();
            } else {
                c4693a0 = i10 >= 28 ? new C4693a0() : new C4739y();
            }
            f19272c = c4693a0;
        }
        InterfaceC4703f0 interfaceC4703f0 = c4693a0;
        Window window = activityC4722p.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        interfaceC4703f0.mo22998a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = activityC4722p.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        interfaceC4703f0.mo22995b(window2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m23112c(ActivityC4722p activityC4722p, C4733u0 c4733u0, C4733u0 c4733u1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4733u0 = C4733u0.Companion.m23093d(C4733u0.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            c4733u1 = C4733u0.Companion.m23093d(C4733u0.INSTANCE, f19270a, f19271b, null, 4, null);
        }
        m23111b(activityC4722p, c4733u0, c4733u1);
    }
}
