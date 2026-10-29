package ir;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import jq.m0;
import jq.t;
import jr.e0;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0003*\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "back", "cancel", "launchHelp", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/view/View;", "backPressHandler", "Landroid/graphics/Rect;", "navBarPadding", "", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", "d", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "style", "c", "(Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ir/c$a", "", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f20848a;

        public a(Function0<Unit> function0) {
            this.f20848a = function0;
        }
    }

    public static final void c(Pi2NavigationBar pi2NavigationBar, TextBasedComponentStyle textBasedComponentStyle) {
        if (textBasedComponentStyle == null) {
            return;
        }
        ColorStateList textColors = pi2NavigationBar.getNavBarTitleView().getTextColors();
        h0.k(pi2NavigationBar.getNavBarTitleView(), textBasedComponentStyle, q0.g(e0.Margin, e0.Justification));
        pi2NavigationBar.getNavBarTitleView().setTextColor(textColors);
    }

    public static final void d(@NotNull final NavigationState navigationState, @NotNull final Function0<Unit> back, @NotNull final Function0<Unit> cancel, @NotNull Function0<Unit> launchHelp, @NotNull Pi2NavigationBar navigationBar, @NotNull View backPressHandler, @Nullable Rect rect, @Nullable String str, @Nullable TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(launchHelp, "launchHelp");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        Intrinsics.checkNotNullParameter(backPressHandler, "backPressHandler");
        if (rect != null) {
            navigationBar.setPreferredPadding(rect);
        }
        navigationBar.G(navigationState, back, cancel, launchHelp);
        navigationBar.setTitle(str);
        c(navigationBar, textBasedComponentStyle);
        Function0 function0 = new Function0() { // from class: ir.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(navigationState, back, cancel);
            }
        };
        backPressHandler.setTag(t.f21672t, new a(function0));
        if (navigationState.getHandleBackPress()) {
            m0.e(backPressHandler, function0);
        }
    }

    public static /* synthetic */ void e(NavigationState navigationState, Function0 function0, Function0 function1, Function0 function2, Pi2NavigationBar pi2NavigationBar, View view, Rect rect, String str, TextBasedComponentStyle textBasedComponentStyle, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = new Function0() { // from class: ir.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.f();
                }
            };
        }
        d(navigationState, function0, function1, function2, pi2NavigationBar, view, (i10 & 64) != 0 ? null : rect, (i10 & 128) != 0 ? null : str, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : textBasedComponentStyle);
    }

    public static final Unit f() {
        return Unit.f22483a;
    }

    public static final Unit g(NavigationState navigationState, Function0 function0, Function0 function1) {
        if (navigationState.getShowBackButton()) {
            function0.invoke();
        } else {
            function1.invoke();
        }
        return Unit.f22483a;
    }
}
