package cr;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import er.C5207p;
import gr.C6216d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p016an.InterfaceC0389r;
import p227jr.C7296d0;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.e0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4228e0 {
    /* JADX INFO: renamed from: e */
    public static final boolean m21754e(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 != null && !StringsKt.m32182p0(prefillAddressStreet1)) {
            return false;
        }
        InputAddress.Attributes attributes2 = inputAddress.getAttributes();
        String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
        if (prefillAddressStreet2 != null && !StringsKt.m32182p0(prefillAddressStreet2)) {
            return false;
        }
        InputAddress.Attributes attributes3 = inputAddress.getAttributes();
        String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
        if (prefillAddressCity != null && !StringsKt.m32182p0(prefillAddressCity)) {
            return false;
        }
        InputAddress.Attributes attributes4 = inputAddress.getAttributes();
        String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
        if (prefillAddressPostalCode != null && !StringsKt.m32182p0(prefillAddressPostalCode)) {
            return false;
        }
        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
        return prefillAddressSubdivision == null || StringsKt.m32182p0(prefillAddressSubdivision);
    }

    /* JADX INFO: renamed from: f */
    public static final InputAddressComponent m21755f(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.m20619L(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.m20622P(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.m20623Q(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.m20620N(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.m20624R(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.m20621O(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final ConstraintLayout m21756g(@NotNull final InputAddressComponent inputAddressComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputAddress config) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6216d c6216dM27353c = C6216d.m27353c(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            InterfaceC0389r interfaceC0389rMo20634m = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = c6216dM27353c.f23658d.getEditText();
            Intrinsics.checkNotNull(editText);
            C0390s.m1453b(interfaceC0389rMo20634m, editText);
            InterfaceC0389r interfaceC0389rMo20634m2 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = c6216dM27353c.f23660f.getEditText();
            Intrinsics.checkNotNull(editText2);
            C0390s.m1453b(interfaceC0389rMo20634m2, editText2);
            InterfaceC0389r interfaceC0389rMo20635n = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = c6216dM27353c.f23668n.getEditText();
            Intrinsics.checkNotNull(editText3);
            C0390s.m1453b(interfaceC0389rMo20635n, editText3);
            InterfaceC0389r interfaceC0389rMo20629a = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = c6216dM27353c.f23656b.getEditText();
            Intrinsics.checkNotNull(editText4);
            C0390s.m1453b(interfaceC0389rMo20629a, editText4);
            InterfaceC0389r interfaceC0389rMo20631g = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = c6216dM27353c.f23667m.getEditText();
            Intrinsics.checkNotNull(editText5);
            C0390s.m1453b(interfaceC0389rMo20631g, editText5);
            InterfaceC0389r interfaceC0389rMo20630f = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = c6216dM27353c.f23666l.getEditText();
            Intrinsics.checkNotNull(editText6);
            C0390s.m1453b(interfaceC0389rMo20630f, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                c6216dM27353c.f23658d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                c6216dM27353c.f23660f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                c6216dM27353c.f23668n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                c6216dM27353c.f23656b.setHint(placeholderAddressCity);
            }
            boolean zM31980c = Intrinsics.m31980c(attributes.getSelectedCountryCode(), "US");
            c6216dM27353c.f23667m.setHint(zM31980c ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            c6216dM27353c.f23666l.setHint(zM31980c ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                c6216dM27353c.f23665k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                c6216dM27353c.f23657c.setText(editAddressManuallyPrompt);
            }
        }
        c6216dM27353c.getRoot().setTag(c6216dM27353c);
        uiComponentHelper.m22002d(new Function0() { // from class: cr.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4228e0.m21758i(config, c6216dM27353c);
            }
        });
        c6216dM27353c.f23657c.setOnClickListener(new View.OnClickListener() { // from class: cr.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4228e0.m21757h(inputAddressComponent, view);
            }
        });
        c6216dM27353c.getRoot().setTag(c6216dM27353c);
        ConstraintLayout constraintLayoutM27355b = c6216dM27353c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM27355b, "getRoot(...)");
        return constraintLayoutM27355b;
    }

    /* JADX INFO: renamed from: h */
    public static final void m21757h(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.m20618K(Boolean.FALSE);
        C5207p c5207pMo20639r = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolM20617J = inputAddressComponent.getIsAddressComponentsCollapsed();
        c5207pMo20639r.m24156c(boolM20617J != null ? boolM20617J.booleanValue() : false);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21758i(InputAddress inputAddress, C6216d c6216d) {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = c6216d.f23657c;
            Intrinsics.checkNotNullExpressionValue(addressExpandComponentsButton, "addressExpandComponentsButton");
            C7304h0.m30392l(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = c6216d.f23665k;
            Intrinsics.checkNotNullExpressionValue(addressLabel, "addressLabel");
            C7304h0.m30392l(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = c6216d.f23658d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            C7296d0.m30348k(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = c6216d.f23660f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            C7296d0.m30348k(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = c6216d.f23668n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            C7296d0.m30348k(addressSuite, inputTextStyle);
            TextInputLayout addressCity = c6216d.f23656b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            C7296d0.m30348k(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = c6216d.f23667m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            C7296d0.m30348k(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = c6216d.f23666l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            C7296d0.m30348k(addressPostalCode, inputTextStyle);
        }
        return Unit.f29331a;
    }
}
