package cr;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputFileUploadComponent;
import er.C5199h;
import gr.C6223k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p227jr.C7297e;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.y0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4348y0 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final LinearLayout m21990c(@NotNull final InputFileUploadComponent inputFileUploadComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputFileUpload config) {
        String label;
        Intrinsics.checkNotNullParameter(inputFileUploadComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6223k c6223kM27381c = C6223k.m27381c(uiComponentHelper.getLayoutInflater());
        InputFileUpload.Attributes attributes = config.getAttributes();
        if (attributes != null && (label = attributes.getLabel()) != null) {
            TextView labelText = c6223kM27381c.f23704e;
            Intrinsics.checkNotNullExpressionValue(labelText, "labelText");
            C5199h.m24129e(labelText, label);
            c6223kM27381c.f23704e.setVisibility(0);
        }
        c6223kM27381c.f23701b.setOnClickListener(new View.OnClickListener() { // from class: cr.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4348y0.m21991d(inputFileUploadComponent, view);
            }
        });
        uiComponentHelper.m22002d(new Function0() { // from class: cr.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4348y0.m21992e(config, c6223kM27381c);
            }
        });
        c6223kM27381c.getRoot().setTag(c6223kM27381c);
        LinearLayout root = c6223kM27381c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: d */
    public static final void m21991d(InputFileUploadComponent inputFileUploadComponent, View view) {
        inputFileUploadComponent.getFileUploadController().m21919b();
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m21992e(InputFileUpload inputFileUpload, C6223k c6223k) {
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
            LinearLayout root = c6223k.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C8652d.m34730c(root, base2);
        }
        InputFileUpload.InputFileUploadComponentStyle styles2 = inputFileUpload.getStyles();
        if (styles2 != null && (inputTextStyle3 = styles2.getInputTextStyle()) != null && (labelTextBasedStyle = inputTextStyle3.getLabelTextBasedStyle()) != null) {
            TextView labelText = c6223k.f23704e;
            Intrinsics.checkNotNullExpressionValue(labelText, "labelText");
            C7304h0.m30392l(labelText, labelTextBasedStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles3 = inputFileUpload.getStyles();
        if (styles3 != null && (inputTextStyle2 = styles3.getInputTextStyle()) != null && (placeholderTextBasedStyle = inputTextStyle2.getPlaceholderTextBasedStyle()) != null) {
            TextView chosenFilesList = c6223k.f23702c;
            Intrinsics.checkNotNullExpressionValue(chosenFilesList, "chosenFilesList");
            C7304h0.m30392l(chosenFilesList, placeholderTextBasedStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles4 = inputFileUpload.getStyles();
        if (styles4 != null && (inputTextStyle = styles4.getInputTextStyle()) != null && (errorTextStyle = inputTextStyle.getErrorTextStyle()) != null) {
            TextView errorText = c6223k.f23703d;
            Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
            C7304h0.m30392l(errorText, errorTextStyle, null, 2, null);
        }
        InputFileUpload.InputFileUploadComponentStyle styles5 = inputFileUpload.getStyles();
        if (styles5 != null && (chooseFileButtonStyle = styles5.getChooseFileButtonStyle()) != null) {
            PersonaMaterialButton chooseFileButton = c6223k.f23701b;
            Intrinsics.checkNotNullExpressionValue(chooseFileButton, "chooseFileButton");
            C7297e.m30364h(chooseFileButton, chooseFileButtonStyle, false, false, false, 14, null);
        }
        return Unit.f29331a;
    }
}
