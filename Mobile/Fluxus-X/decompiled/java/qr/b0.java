package qr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import or.ComponentView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqr/a0;", "Lqr/z5;", "uiComponentHelper", BuildConfig.FLAVOR, "Lor/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", BuildConfig.FLAVOR, "minLeftPadding", "minRightPadding", "a", "(Lqr/a0;Lqr/z5;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;II)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {
    @NotNull
    public static final View a(@NotNull FooterComponent footerComponent, @NotNull z5 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull Footer config, int i10, int i11) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        Intrinsics.checkNotNullParameter(footerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        ur.g gVarC = ur.g.c(LayoutInflater.from(uiComponentHelper.getContext()));
        Intrinsics.checkNotNullExpressionValue(gVarC, "inflate(...)");
        Integer backgroundColor = config.getBackgroundColor();
        if (backgroundColor != null) {
            gVarC.b.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = config.getPadding();
        if (padding != null) {
            StyleElements.Size left = padding.getLeft();
            int iC = p001kotlin.ranges.d.c((left == null || (dp6 = left.getDp()) == null) ? 0 : (int) xq.j.a(dp6.doubleValue()), i10);
            StyleElements.Size right = padding.getRight();
            int iC2 = p001kotlin.ranges.d.c((right == null || (dp5 = right.getDp()) == null) ? 0 : (int) xq.j.a(dp5.doubleValue()), i11);
            ConstraintLayout constraintLayout = gVarC.f33891c;
            StyleElements.Size top = padding.getTop();
            int iA = (top == null || (dp4 = top.getDp()) == null) ? 0 : (int) xq.j.a(dp4.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(iC, iA, iC2, (bottom == null || (dp3 = bottom.getDp()) == null) ? 0 : (int) xq.j.a(dp3.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = config.getBorderWidth();
        if (borderWidth != null) {
            View hairline = gVarC.f33892d;
            Intrinsics.checkNotNullExpressionValue(hairline, "hairline");
            ViewGroup.LayoutParams layoutParams = hairline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp2 = top2.getDp()) == null) ? 0 : (int) xq.j.a(dp2.doubleValue());
            hairline.setLayoutParams(layoutParams);
        } else {
            View hairline2 = gVarC.f33892d;
            Intrinsics.checkNotNullExpressionValue(hairline2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = hairline2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) xq.j.a(1.0d);
            hairline2.setLayoutParams(layoutParams2);
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(gVarC.f33891c);
        ConstraintLayout footerContainerInner = gVarC.f33891c;
        Intrinsics.checkNotNullExpressionValue(footerContainerInner, "footerContainerInner");
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            footerContainerInner.addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        n5.b(footerContainerInner, cVar, componentViews, arrayList, StyleElements.PositionType.CENTER, null, 0);
        cVar.c(gVarC.f33891c);
        LinearLayout root = gVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
