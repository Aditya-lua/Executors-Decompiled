package p227jr;

import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;

/* JADX INFO: renamed from: jr.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "style", "", "applyTopPadding", "applyBottomPadding", "", "a", "(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZ)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7312p {
    /* JADX INFO: renamed from: a */
    public static final void m30409a(@NotNull View view, @Nullable StepStyle stepStyle, boolean z10, boolean z11) {
        StyleElements.SizeSet screenPaddingValue;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (stepStyle == null || (screenPaddingValue = stepStyle.getScreenPaddingValue()) == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        StyleElements.Size left = screenPaddingValue.getLeft();
        marginLayoutParams.setMarginStart((left == null || (dp5 = left.getDp()) == null) ? marginLayoutParams.getMarginStart() : (int) C7265j.m30285a(dp5.doubleValue()));
        StyleElements.Size right = screenPaddingValue.getRight();
        marginLayoutParams.setMarginEnd((right == null || (dp4 = right.getDp()) == null) ? marginLayoutParams.getMarginEnd() : (int) C7265j.m30285a(dp4.doubleValue()));
        if (z10) {
            StyleElements.Size top = screenPaddingValue.getTop();
            marginLayoutParams.topMargin = (top == null || (dp3 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) C7265j.m30285a(dp3.doubleValue());
        }
        if (z11) {
            StyleElements.Size bottom = screenPaddingValue.getBottom();
            marginLayoutParams.bottomMargin = (bottom == null || (dp2 = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) C7265j.m30285a(dp2.doubleValue());
        }
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m30410b(View view, StepStyle stepStyle, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        m30409a(view, stepStyle, z10, z11);
    }
}
