package cr;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SubmitButtonComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.e2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "config", "Landroid/widget/LinearLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4230e2 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final LinearLayout m21760b(@NotNull JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final JpMyNumberNfcScan config) {
        String buttonText;
        Intrinsics.checkNotNullParameter(jpMyNumberNfcScanComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getContext());
        linearLayout.setOrientation(1);
        String str = config.getName() + "_scan_button";
        JpMyNumberNfcScan.Attributes attributes = config.getAttributes();
        if (attributes == null || (buttonText = attributes.getButtonText()) == null) {
            buttonText = "";
        }
        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(buttonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
        JpMyNumberNfcScan.JpMyNumberNfcScanStyles styles = config.getStyles();
        SubmitButton submitButton = new SubmitButton(str, basicButtonAttributes, styles != null ? styles.getScanButtonStyle() : null);
        ButtonWithLoadingIndicator buttonWithLoadingIndicatorM21948a = C4322t4.m21948a(new SubmitButtonComponent(submitButton), uiComponentHelper, submitButton);
        linearLayout.addView(buttonWithLoadingIndicatorM21948a);
        final TextView textView = new TextView(linearLayout.getContext());
        uiComponentHelper.m22002d(new Function0() { // from class: cr.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4230e2.m21761c(textView, config);
            }
        });
        linearLayout.addView(textView);
        linearLayout.setTag(new C4236f2(buttonWithLoadingIndicatorM21948a, textView));
        return linearLayout;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21761c(TextView textView, JpMyNumberNfcScan jpMyNumberNfcScan) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        JpMyNumberNfcScan.JpMyNumberNfcScanStyles styles = jpMyNumberNfcScan.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            C7304h0.m30392l(textView, errorLabelStyle, null, 2, null);
        }
        return Unit.f29331a;
    }
}
