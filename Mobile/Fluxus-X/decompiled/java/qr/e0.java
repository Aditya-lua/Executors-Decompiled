package qr;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e0 {
    @NotNull
    public static final LinearLayout c(@NotNull GovernmentIdNfcScanComponent governmentIdNfcScanComponent, @NotNull z5 uiComponentHelper, @NotNull final GovernmentIdNfcScan config) {
        String launchButtonText;
        String errorModalTroubleshootingTipsButtonText;
        ButtonSubmitComponentStyle secondaryButtonStyle;
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        Boolean hidePrefilledInputs;
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getContext());
        linearLayout.setOrientation(1);
        GovernmentIdNfcScan.Attributes attributes = config.getAttributes();
        View viewA = null;
        buttonSubmitComponentStyle = null;
        ButtonSubmitComponentStyle buttonSubmitComponentStyle = null;
        viewA = null;
        String cardAccessNumberLabel = attributes != null ? attributes.getCardAccessNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes2 = config.getAttributes();
        String prefillCardAccessNumber = attributes2 != null ? attributes2.getPrefillCardAccessNumber() : null;
        InputText.InputType inputType = InputText.InputType.TEXT;
        GovernmentIdNfcScan.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes4 = config.getAttributes();
        InputText.Attributes attributes5 = new InputText.Attributes(prefillCardAccessNumber, cardAccessNumberLabel, null, inputType, null, attributes4 != null ? attributes4.getHidden() : null, disabled);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = config.getStyles();
        InputText inputText = new InputText("can_access_code", attributes5, styles != null ? styles.getDocumentNumberStyle() : null);
        final TextInputLayout textInputLayoutB = o2.b(new InputTextComponent(inputText), uiComponentHelper, inputText, governmentIdNfcScanComponent.getCardAccessNumberController());
        textInputLayoutB.setId(or.f.f28426h0);
        linearLayout.addView(textInputLayoutB);
        GovernmentIdNfcScan.Attributes attributes6 = config.getAttributes();
        String documentNumberLabel = attributes6 != null ? attributes6.getDocumentNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes7 = config.getAttributes();
        String prefillDocumentNumber = attributes7 != null ? attributes7.getPrefillDocumentNumber() : null;
        GovernmentIdNfcScan.Attributes attributes8 = config.getAttributes();
        JsonLogicBoolean disabled2 = attributes8 != null ? attributes8.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes9 = config.getAttributes();
        InputText.Attributes attributes10 = new InputText.Attributes(prefillDocumentNumber, documentNumberLabel, null, inputType, null, attributes9 != null ? attributes9.getHidden() : null, disabled2);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles2 = config.getStyles();
        InputText inputText2 = new InputText("doc_number", attributes10, styles2 != null ? styles2.getDocumentNumberStyle() : null);
        final TextInputLayout textInputLayoutB2 = o2.b(new InputTextComponent(inputText2), uiComponentHelper, inputText2, governmentIdNfcScanComponent.getDocumentNumberController());
        textInputLayoutB2.setId(or.f.f28430j0);
        linearLayout.addView(textInputLayoutB2);
        GovernmentIdNfcScan.Attributes attributes11 = config.getAttributes();
        String dateOfBirthLabel = attributes11 != null ? attributes11.getDateOfBirthLabel() : null;
        GovernmentIdNfcScan.Attributes attributes12 = config.getAttributes();
        String prefillDateOfBirth = attributes12 != null ? attributes12.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        List<String> listGenerateTextMonths = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes13 = config.getAttributes();
        JsonLogicBoolean disabled3 = attributes13 != null ? attributes13.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes14 = config.getAttributes();
        InputDate.Attributes attributes15 = new InputDate.Attributes(prefillDateOfBirth, dateOfBirthLabel, null, null, null, listGenerateTextMonths, attributes14 != null ? attributes14.getHidden() : null, disabled3, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles3 = config.getStyles();
        InputDate inputDate = new InputDate("dob", styles3 != null ? styles3.getDateStyle() : null, attributes15);
        final ConstraintLayout constraintLayoutB = h1.b(new InputDateComponent(inputDate), uiComponentHelper, governmentIdNfcScanComponent.getDateOfBirthController(), inputDate);
        constraintLayoutB.setId(or.f.f28428i0);
        linearLayout.addView(constraintLayoutB);
        GovernmentIdNfcScan.Attributes attributes16 = config.getAttributes();
        String expirationDateLabel = attributes16 != null ? attributes16.getExpirationDateLabel() : null;
        GovernmentIdNfcScan.Attributes attributes17 = config.getAttributes();
        String prefillExpirationDate = attributes17 != null ? attributes17.getPrefillExpirationDate() : null;
        List<String> listGenerateTextMonths2 = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes18 = config.getAttributes();
        JsonLogicBoolean disabled4 = attributes18 != null ? attributes18.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes19 = config.getAttributes();
        InputDate.Attributes attributes20 = new InputDate.Attributes(prefillExpirationDate, expirationDateLabel, null, null, null, listGenerateTextMonths2, attributes19 != null ? attributes19.getHidden() : null, disabled4, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles4 = config.getStyles();
        InputDate inputDate2 = new InputDate(GovernmentIdNfcScan.expirationDateName, styles4 != null ? styles4.getDateStyle() : null, attributes20);
        final ConstraintLayout constraintLayoutB2 = h1.b(new InputDateComponent(inputDate2), uiComponentHelper, governmentIdNfcScanComponent.getExpirationDateController(), inputDate2);
        constraintLayoutB2.setId(or.f.f28434l0);
        linearLayout.addView(constraintLayoutB2);
        GovernmentIdNfcScan.Attributes attributes21 = config.getAttributes();
        if (attributes21 == null || (launchButtonText = attributes21.getLaunchButtonText()) == null) {
            launchButtonText = BuildConfig.FLAVOR;
        }
        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(launchButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = config.getStyles();
        SubmitButton submitButton = new SubmitButton(GovernmentIdNfcScan.launchButtonName, basicButtonAttributes, styles5 != null ? styles5.getLaunchButtonStyle() : null);
        ButtonWithLoadingIndicator buttonWithLoadingIndicatorA = q5.a(new SubmitButtonComponent(submitButton), uiComponentHelper, submitButton);
        buttonWithLoadingIndicatorA.setId(or.f.f28436m0);
        linearLayout.addView(buttonWithLoadingIndicatorA);
        GovernmentIdNfcScan.Attributes attributes22 = config.getAttributes();
        String prefillCardAccessNumber2 = attributes22 != null ? attributes22.getPrefillCardAccessNumber() : null;
        if (prefillCardAccessNumber2 == null || StringsKt.p0(prefillCardAccessNumber2)) {
            textInputLayoutB.setVisibility(8);
        }
        GovernmentIdNfcScan.Attributes attributes23 = config.getAttributes();
        if (attributes23 != null && (hidePrefilledInputs = attributes23.getHidePrefilledInputs()) != null && hidePrefilledInputs.booleanValue()) {
            uiComponentHelper.d(new Function0() { // from class: qr.c0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e0.d(textInputLayoutB, textInputLayoutB2, constraintLayoutB, constraintLayoutB2);
                }
            });
        }
        GovernmentIdNfcScan.Attributes attributes24 = config.getAttributes();
        if (((attributes24 == null || (scanHints = attributes24.getScanHints()) == null || !(scanHints.isEmpty() ^ true)) ? false : true) && governmentIdNfcScanComponent.p() == GovernmentIdNfcScan.TipsButtonLocation.OnScreen) {
            GovernmentIdNfcScan.Attributes attributes25 = config.getAttributes();
            if (attributes25 == null || (errorModalTroubleshootingTipsButtonText = attributes25.getErrorModalTroubleshootingTipsButtonText()) == null) {
                errorModalTroubleshootingTipsButtonText = "Troubleshooting tips";
            }
            BasicButtonAttributes basicButtonAttributes2 = new BasicButtonAttributes(errorModalTroubleshootingTipsButtonText, Button.ButtonType.SECONDARY, null, null, null, null, 60, null);
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = config.getStyles();
            if (styles6 != null && (secondaryButtonStyle = styles6.getSecondaryButtonStyle()) != null) {
                buttonSubmitComponentStyle = new ButtonSubmitComponentStyle(secondaryButtonStyle.getPadding(), null, secondaryButtonStyle.getJustify(), secondaryButtonStyle.getFontFamily(), secondaryButtonStyle.getFontSize(), secondaryButtonStyle.getFontWeight(), secondaryButtonStyle.getLetterSpacing(), secondaryButtonStyle.getLineHeight(), secondaryButtonStyle.getTextColor(), secondaryButtonStyle.getHeight(), secondaryButtonStyle.getWidth(), secondaryButtonStyle.getBackgroundColor(), secondaryButtonStyle.getBorderColor(), secondaryButtonStyle.getBorderRadius(), secondaryButtonStyle.getBorderWidth());
            }
            SubmitButton submitButton2 = new SubmitButton("nfc_tips_button", basicButtonAttributes2, buttonSubmitComponentStyle);
            viewA = q5.a(new SubmitButtonComponent(submitButton2), uiComponentHelper, submitButton2);
            viewA.setId(or.f.f28438n0);
            linearLayout.addView(viewA);
            ViewGroup.LayoutParams layoutParams = viewA.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = (int) xq.j.a(8.0d);
            viewA.setLayoutParams(layoutParams2);
        }
        View view = viewA;
        final TextView textView = new TextView(linearLayout.getContext());
        textView.setId(or.f.f28432k0);
        uiComponentHelper.d(new Function0() { // from class: qr.d0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.e(textView, config);
            }
        });
        linearLayout.addView(textView);
        Object tag = constraintLayoutB.getTag();
        Intrinsics.d(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        ur.f fVar = (ur.f) tag;
        Object tag2 = constraintLayoutB2.getTag();
        Intrinsics.d(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        linearLayout.setTag(new f0(textInputLayoutB, textInputLayoutB2, fVar, (ur.f) tag2, buttonWithLoadingIndicatorA, view, textView));
        return linearLayout;
    }

    public static final Unit d(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        textInputLayout.setVisibility(8);
        textInputLayout2.setVisibility(8);
        constraintLayout.setVisibility(8);
        constraintLayout2.setVisibility(8);
        return Unit.f21506a;
    }

    public static final Unit e(TextView textView, GovernmentIdNfcScan governmentIdNfcScan) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = governmentIdNfcScan.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            yr.h0.l(textView, errorLabelStyle, null, 2, null);
        }
        return Unit.f21506a;
    }
}
