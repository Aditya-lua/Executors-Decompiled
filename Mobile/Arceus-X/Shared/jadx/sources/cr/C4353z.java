package cr;

import android.view.View;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HorizontalStackComponent;
import gr.C6220h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;
import p227jr.C7314r;

/* JADX INFO: renamed from: cr.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "Lcr/y4;", "uiComponentHelper", "", "Lar/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;Lcr/y4;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4353z {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ConstraintLayout m22004b(@NotNull HorizontalStackComponent horizontalStackComponent, @NotNull C4352y4 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull HorizontalStack config) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp2;
        Intrinsics.checkNotNullParameter(horizontalStackComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6220h c6220hM27369c = C6220h.m27369c(uiComponentHelper.getLayoutInflater());
        C0518c c0518c = new C0518c();
        c0518c.m2509f(c6220hM27369c.getRoot());
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            c6220hM27369c.getRoot().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        final HorizontalStack.HorizontalStackComponentStyle styles = config.getStyles();
        int iM30285a = (int) C7265j.m30285a((styles == null || (gapValue = styles.getGapValue()) == null || (dp2 = gapValue.getDp()) == null) ? 16.0d : dp2.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout root = c6220hM27369c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C4310r4.m21942a(root, c0518c, componentViews, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iM30285a);
        } else {
            ConstraintLayout root2 = c6220hM27369c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            C4310r4.m21943b(root2, c0518c, componentViews, arrayList, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iM30285a);
        }
        if (styles != null) {
            uiComponentHelper.m22002d(new Function0() { // from class: cr.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4353z.m22005c(c6220hM27369c, styles);
                }
            });
        }
        c0518c.m2506c(c6220hM27369c.getRoot());
        ConstraintLayout root3 = c6220hM27369c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        return root3;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m22005c(C6220h c6220h, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        ConstraintLayout root = c6220h.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C7314r.m30414c(root, horizontalStackComponentStyle);
        return Unit.f29331a;
    }
}
