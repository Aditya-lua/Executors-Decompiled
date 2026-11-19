package qr;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import or.ComponentView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqr/i0;", "Lqr/z5;", "uiComponentHelper", BuildConfig.FLAVOR, "Lor/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lqr/i0;Lqr/z5;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k0 {
    @NotNull
    public static final ConstraintLayout b(@NotNull HorizontalStackComponent horizontalStackComponent, @NotNull z5 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull HorizontalStack config) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp2;
        Intrinsics.checkNotNullParameter(horizontalStackComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.h hVarC = ur.h.c(uiComponentHelper.getLayoutInflater());
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(hVarC.getRoot());
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            hVarC.getRoot().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        final HorizontalStack.HorizontalStackComponentStyle styles = config.getStyles();
        int iA = (int) xq.j.a((styles == null || (gapValue = styles.getGapValue()) == null || (dp2 = gapValue.getDp()) == null) ? 16.0d : dp2.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout root = hVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            n5.a(root, cVar, componentViews, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iA);
        } else {
            ConstraintLayout root2 = hVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            n5.b(root2, cVar, componentViews, arrayList, styles != null ? styles.getAlignmentValue() : null, styles != null ? styles.getJustifyValue() : null, iA);
        }
        if (styles != null) {
            uiComponentHelper.d(new Function0() { // from class: qr.j0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.c(hVarC, styles);
                }
            });
        }
        cVar.c(hVarC.getRoot());
        ConstraintLayout root3 = hVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        return root3;
    }

    public static final Unit c(ur.h hVar, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        ConstraintLayout root = hVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        yr.r.c(root, horizontalStackComponentStyle);
        return Unit.f21506a;
    }
}
