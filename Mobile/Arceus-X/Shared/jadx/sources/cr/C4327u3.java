package cr;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.C1149d;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.MdocComponent;
import gr.C6238z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.u3 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "config", "Landroid/widget/LinearLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4327u3 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final LinearLayout m21950b(@NotNull MdocComponent mdocComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final Mdoc config) {
        Intrinsics.checkNotNullParameter(mdocComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getContext());
        linearLayout.setOrientation(1);
        C6238z c6238zM27440c = C6238z.m27440c(LayoutInflater.from(linearLayout.getContext()), linearLayout, false);
        Intrinsics.checkNotNullExpressionValue(c6238zM27440c, "inflate(...)");
        linearLayout.addView(c6238zM27440c.getRoot());
        ConstraintLayout root = c6238zM27440c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        root.setLayoutParams(layoutParams2);
        final TextView textView = new TextView(linearLayout.getContext());
        textView.setId(C1149d.f4831k0);
        uiComponentHelper.m22002d(new Function0() { // from class: cr.t3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4327u3.m21951c(textView, config);
            }
        });
        linearLayout.addView(textView);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = (int) C7265j.m30285a(8.0d);
        layoutParams4.gravity = 17;
        textView.setLayoutParams(layoutParams4);
        ConstraintLayout root2 = c6238zM27440c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        linearLayout.setTag(new C4333v3(root2, textView));
        return linearLayout;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21951c(TextView textView, Mdoc mdoc) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        Mdoc.MdocComponentStyle styles = mdoc.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            C7304h0.m30392l(textView, errorLabelStyle, null, 2, null);
        }
        return Unit.f29331a;
    }
}
