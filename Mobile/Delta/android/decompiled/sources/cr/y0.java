package cr;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y0 {
    @NotNull
    public static final LinearLayout c(@NotNull final InputFileUploadComponent inputFileUploadComponent, @NotNull y4 uiComponentHelper, @NotNull final InputFileUpload config) {
        String label;
        Intrinsics.checkNotNullParameter(inputFileUploadComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.k kVarC = gr.k.c(uiComponentHelper.getLayoutInflater());
        InputFileUpload.Attributes attributes = config.getAttributes();
        if (attributes != null && (label = attributes.getLabel()) != null) {
            TextView labelText = kVarC.f18435e;
            Intrinsics.checkNotNullExpressionValue(labelText, "labelText");
            er.h.e(labelText, label);
            kVarC.f18435e.setVisibility(0);
        }
        kVarC.b.setOnClickListener(new View.OnClickListener() { // from class: cr.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.d(inputFileUploadComponent, view);
            }
        });
        uiComponentHelper.d(new Function0() { // from class: cr.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y0.e(config, kVarC);
            }
        });
        kVarC.getRoot().setTag(kVarC);
        LinearLayout root = kVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void d(InputFileUploadComponent inputFileUploadComponent, View view) {
        inputFileUploadComponent.getFileUploadController().b();
    }

    public static final Unit e(InputFileUpload inputFileUpload, gr.k kVar) {
        ButtonCancelComponentStyle chooseFileButtonStyle;
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle errorTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        TextBasedComponentStyle placeholderTextBasedStyle;
        InputTextBasedComponentStyle inputTextStyle3;
        TextBasedComponentStyle labelTextBasedStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        InputFileUpload.InputFileUploadComponentStyle styles = inputFileUpload.getStyles();
        if (styles != null && (margin = styles.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
            LinearLayout root = kVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            mr.d.c(root, base2);
        }
        InputFileUpload.InputFileUploadComponentStyle styles2 = inputFileUpload.getStyles();
        if (styles2 != null && (inputTextStyle3 = styles2.getInputTextStyle()) != null && (labelTextBasedStyle = inputTextStyle3.getLabelTextBasedStyle()) != null) {
            TextView labelText = kVar.f18435e;
            Intrinsics.checkNotNullExpressionValue(labelText, "labelText");
            jr.h0.l(labelText, labelTextBasedStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles3 = inputFileUpload.getStyles();
        if (styles3 != null && (inputTextStyle2 = styles3.getInputTextStyle()) != null && (placeholderTextBasedStyle = inputTextStyle2.getPlaceholderTextBasedStyle()) != null) {
            TextView chosenFilesList = kVar.f18433c;
            Intrinsics.checkNotNullExpressionValue(chosenFilesList, "chosenFilesList");
            jr.h0.l(chosenFilesList, placeholderTextBasedStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles4 = inputFileUpload.getStyles();
        if (styles4 != null && (inputTextStyle = styles4.getInputTextStyle()) != null && (errorTextStyle = inputTextStyle.getErrorTextStyle()) != null) {
            TextView errorText = kVar.f18434d;
            Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
            jr.h0.l(errorText, errorTextStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles5 = inputFileUpload.getStyles();
        if (styles5 != null && (chooseFileButtonStyle = styles5.getChooseFileButtonStyle()) != null) {
            PersonaMaterialButton chooseFileButton = kVar.b;
            Intrinsics.checkNotNullExpressionValue(chooseFileButton, "chooseFileButton");
            jr.e.h(chooseFileButton, chooseFileButtonStyle, false, false, false, 14, null);
        }
        return Unit.f22483a;
    }
}
