package cr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.FooterComponent;
import gr.C6219g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;

/* JADX INFO: renamed from: cr.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcr/y4;", "uiComponentHelper", "", "Lar/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "", "minLeftPadding", "minRightPadding", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Lcr/y4;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;II)Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4311s {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final View m21944a(@NotNull FooterComponent footerComponent, @NotNull C4352y4 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull Footer config, int i10, int i11) {
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
        C6219g c6219gM27365c = C6219g.m27365c(LayoutInflater.from(uiComponentHelper.getContext()));
        Intrinsics.checkNotNullExpressionValue(c6219gM27365c, "inflate(...)");
        Integer backgroundColor = config.getBackgroundColor();
        if (backgroundColor != null) {
            c6219gM27365c.f23687b.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = config.getPadding();
        if (padding != null) {
            StyleElements.Size left = padding.getLeft();
            int iM32078c = C7764d.m32078c((left == null || (dp6 = left.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp6.doubleValue()), i10);
            StyleElements.Size right = padding.getRight();
            int iM32078c2 = C7764d.m32078c((right == null || (dp5 = right.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp5.doubleValue()), i11);
            ConstraintLayout constraintLayout = c6219gM27365c.f23688c;
            StyleElements.Size top = padding.getTop();
            int iM30285a = (top == null || (dp4 = top.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp4.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(iM32078c, iM30285a, iM32078c2, (bottom == null || (dp3 = bottom.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp3.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = config.getBorderWidth();
        if (borderWidth != null) {
            View hairline = c6219gM27365c.f23689d;
            Intrinsics.checkNotNullExpressionValue(hairline, "hairline");
            ViewGroup.LayoutParams layoutParams = hairline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp2 = top2.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp2.doubleValue());
            hairline.setLayoutParams(layoutParams);
        } else {
            View hairline2 = c6219gM27365c.f23689d;
            Intrinsics.checkNotNullExpressionValue(hairline2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = hairline2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) C7265j.m30285a(1.0d);
            hairline2.setLayoutParams(layoutParams2);
        }
        C0518c c0518c = new C0518c();
        c0518c.m2509f(c6219gM27365c.f23688c);
        ConstraintLayout footerContainerInner = c6219gM27365c.f23688c;
        Intrinsics.checkNotNullExpressionValue(footerContainerInner, "footerContainerInner");
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            footerContainerInner.addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        C4310r4.m21943b(footerContainerInner, c0518c, componentViews, arrayList, StyleElements.PositionType.CENTER, null, 0);
        c0518c.m2506c(c6219gM27365c.f23688c);
        LinearLayout root = c6219gM27365c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
