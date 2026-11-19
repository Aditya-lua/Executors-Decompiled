package qr;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "config", "Landroid/widget/LinearLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i4 {
    @NotNull
    public static final LinearLayout b(@NotNull MdocComponent mdocComponent, @NotNull z5 uiComponentHelper, @NotNull final Mdoc config) {
        Intrinsics.checkNotNullParameter(mdocComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getContext());
        linearLayout.setOrientation(1);
        ur.z zVarC = ur.z.c(LayoutInflater.from(linearLayout.getContext()), linearLayout, false);
        Intrinsics.checkNotNullExpressionValue(zVarC, "inflate(...)");
        linearLayout.addView(zVarC.getRoot());
        ConstraintLayout root = zVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        root.setLayoutParams(layoutParams2);
        final TextView textView = new TextView(linearLayout.getContext());
        textView.setId(or.f.f28432k0);
        uiComponentHelper.d(new Function0() { // from class: qr.h4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i4.c(textView, config);
            }
        });
        linearLayout.addView(textView);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = (int) xq.j.a(8.0d);
        layoutParams4.gravity = 17;
        textView.setLayoutParams(layoutParams4);
        ConstraintLayout root2 = zVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        linearLayout.setTag(new j4(root2, textView));
        return linearLayout;
    }

    public static final Unit c(TextView textView, Mdoc mdoc) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        Mdoc.MdocComponentStyle styles = mdoc.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            yr.h0.l(textView, errorLabelStyle, null, 2, null);
        }
        return Unit.f21506a;
    }
}
