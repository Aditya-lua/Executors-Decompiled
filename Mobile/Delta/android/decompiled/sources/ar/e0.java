package ar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e0 {
    public static final boolean e(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 != null && !StringsKt.p0(prefillAddressStreet1)) {
            return false;
        }
        InputAddress.Attributes attributes2 = inputAddress.getAttributes();
        String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
        if (prefillAddressStreet2 != null && !StringsKt.p0(prefillAddressStreet2)) {
            return false;
        }
        InputAddress.Attributes attributes3 = inputAddress.getAttributes();
        String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
        if (prefillAddressCity != null && !StringsKt.p0(prefillAddressCity)) {
            return false;
        }
        InputAddress.Attributes attributes4 = inputAddress.getAttributes();
        String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
        if (prefillAddressPostalCode != null && !StringsKt.p0(prefillAddressPostalCode)) {
            return false;
        }
        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
        return prefillAddressSubdivision == null || StringsKt.p0(prefillAddressSubdivision);
    }

    public static final InputAddressComponent f(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.L(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.P(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.Q(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.N(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.R(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.O(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    @NotNull
    public static final ConstraintLayout g(@NotNull final InputAddressComponent inputAddressComponent, @NotNull y4 uiComponentHelper, @NotNull final InputAddress config) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.d dVarC = er.d.c(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            ym.r rVarM = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = dVarC.f16293d.getEditText();
            Intrinsics.checkNotNull(editText);
            ym.s.b(rVarM, editText);
            ym.r rVarM2 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = dVarC.f16295f.getEditText();
            Intrinsics.checkNotNull(editText2);
            ym.s.b(rVarM2, editText2);
            ym.r rVarN = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = dVarC.f16303n.getEditText();
            Intrinsics.checkNotNull(editText3);
            ym.s.b(rVarN, editText3);
            ym.r rVarA = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = dVarC.b.getEditText();
            Intrinsics.checkNotNull(editText4);
            ym.s.b(rVarA, editText4);
            ym.r rVarG = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = dVarC.f16302m.getEditText();
            Intrinsics.checkNotNull(editText5);
            ym.s.b(rVarG, editText5);
            ym.r rVarF = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = dVarC.f16301l.getEditText();
            Intrinsics.checkNotNull(editText6);
            ym.s.b(rVarF, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                dVarC.f16293d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                dVarC.f16295f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                dVarC.f16303n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                dVarC.b.setHint(placeholderAddressCity);
            }
            boolean zC = Intrinsics.c(attributes.getSelectedCountryCode(), "US");
            dVarC.f16302m.setHint(zC ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            dVarC.f16301l.setHint(zC ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                dVarC.f16300k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                dVarC.f16292c.setText(editAddressManuallyPrompt);
            }
        }
        dVarC.getRoot().setTag(dVarC);
        uiComponentHelper.d(new Function0() { // from class: ar.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.i(config, dVarC);
            }
        });
        dVarC.f16292c.setOnClickListener(new View.OnClickListener() { // from class: ar.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0.h(inputAddressComponent, view);
            }
        });
        dVarC.getRoot().setTag(dVarC);
        ConstraintLayout constraintLayoutB = dVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public static final void h(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.K(Boolean.FALSE);
        cr.p pVarR = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolJ = inputAddressComponent.getIsAddressComponentsCollapsed();
        pVarR.c(boolJ != null ? boolJ.booleanValue() : false);
    }

    public static final Unit i(InputAddress inputAddress, er.d dVar) {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = dVar.f16292c;
            Intrinsics.checkNotNullExpressionValue(addressExpandComponentsButton, "addressExpandComponentsButton");
            hr.h0.l(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = dVar.f16300k;
            Intrinsics.checkNotNullExpressionValue(addressLabel, "addressLabel");
            hr.h0.l(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = dVar.f16293d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            hr.d0.k(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f16295f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            hr.d0.k(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = dVar.f16303n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            hr.d0.k(addressSuite, inputTextStyle);
            TextInputLayout addressCity = dVar.b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            hr.d0.k(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = dVar.f16302m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            hr.d0.k(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = dVar.f16301l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            hr.d0.k(addressPostalCode, inputTextStyle);
        }
        return Unit.f22938a;
    }
}
