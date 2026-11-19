package qr;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", BuildConfig.FLAVOR, "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q0 {
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
        inputAddressComponent.O(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.P(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.M(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.R(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.N(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    @NotNull
    public static final ConstraintLayout g(@NotNull final InputAddressComponent inputAddressComponent, @NotNull z5 uiComponentHelper, @NotNull final InputAddress config) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.d dVarC = ur.d.c(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            nn.s sVarL = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = dVarC.f33864d.getEditText();
            Intrinsics.checkNotNull(editText);
            nn.t.b(sVarL, editText);
            nn.s sVarL2 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = dVarC.f33866f.getEditText();
            Intrinsics.checkNotNull(editText2);
            nn.t.b(sVarL2, editText2);
            nn.s sVarN = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = dVarC.f33874n.getEditText();
            Intrinsics.checkNotNull(editText3);
            nn.t.b(sVarN, editText3);
            nn.s sVarA = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = dVarC.b.getEditText();
            Intrinsics.checkNotNull(editText4);
            nn.t.b(sVarA, editText4);
            nn.s sVarG = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = dVarC.f33873m.getEditText();
            Intrinsics.checkNotNull(editText5);
            nn.t.b(sVarG, editText5);
            nn.s sVarF = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = dVarC.f33872l.getEditText();
            Intrinsics.checkNotNull(editText6);
            nn.t.b(sVarF, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                dVarC.f33864d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                dVarC.f33866f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                dVarC.f33874n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                dVarC.b.setHint(placeholderAddressCity);
            }
            boolean zC = Intrinsics.c(attributes.getSelectedCountryCode(), "US");
            dVarC.f33873m.setHint(zC ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            dVarC.f33872l.setHint(zC ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                dVarC.f33871k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                dVarC.f33863c.setText(editAddressManuallyPrompt);
            }
        }
        dVarC.getRoot().setTag(dVarC);
        uiComponentHelper.d(new Function0() { // from class: qr.o0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q0.i(config, dVarC);
            }
        });
        dVarC.f33863c.setOnClickListener(new View.OnClickListener() { // from class: qr.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.h(inputAddressComponent, view);
            }
        });
        dVarC.getRoot().setTag(dVarC);
        ConstraintLayout constraintLayoutB = dVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public static final void h(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.J(Boolean.FALSE);
        sr.q qVarR = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolH = inputAddressComponent.getIsAddressComponentsCollapsed();
        qVarR.c(boolH != null ? boolH.booleanValue() : false);
    }

    public static final Unit i(InputAddress inputAddress, ur.d dVar) {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = dVar.f33863c;
            Intrinsics.checkNotNullExpressionValue(addressExpandComponentsButton, "addressExpandComponentsButton");
            yr.h0.l(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = dVar.f33871k;
            Intrinsics.checkNotNullExpressionValue(addressLabel, "addressLabel");
            yr.h0.l(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = dVar.f33864d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            yr.d0.k(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f33866f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            yr.d0.k(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = dVar.f33874n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            yr.d0.k(addressSuite, inputTextStyle);
            TextInputLayout addressCity = dVar.b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            yr.d0.k(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = dVar.f33873m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            yr.d0.k(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = dVar.f33872l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            yr.d0.k(addressPostalCode, inputTextStyle);
        }
        return Unit.f21506a;
    }
}
