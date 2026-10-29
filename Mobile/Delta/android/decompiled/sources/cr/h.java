package cr;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcr/y4;", "uiComponentHelper", "", "Lar/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcr/y4;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    @NotNull
    public static final ConstraintLayout b(@NotNull ClickableStackComponent clickableStackComponent, @NotNull y4 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull ClickableStack config) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp2;
        Intrinsics.checkNotNullParameter(clickableStackComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.e eVarC = gr.e.c(uiComponentHelper.getLayoutInflater());
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(eVarC.getRoot());
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            eVarC.getRoot().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        final ClickableStack.ClickableStackComponentStyle styles = config.getStyles();
        int iA = (int) jq.j.a((styles == null || (gapValue = styles.getGapValue()) == null || (dp2 = gapValue.getDp()) == null) ? 16.0d : dp2.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout root = eVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            r4.a(root, cVar, componentViews, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iA);
        } else {
            ConstraintLayout root2 = eVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            r4.b(root2, cVar, componentViews, arrayList, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iA);
        }
        if (styles != null) {
            uiComponentHelper.d(new Function0() { // from class: cr.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.c(eVarC, styles);
                }
            });
        }
        cVar.c(eVarC.getRoot());
        ConstraintLayout root3 = eVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        return root3;
    }

    public static final Unit c(gr.e eVar, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        ConstraintLayout root = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        jr.r.b(root, clickableStackComponentStyle);
        return Unit.f22483a;
    }
}
