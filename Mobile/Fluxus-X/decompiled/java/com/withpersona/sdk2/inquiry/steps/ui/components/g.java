package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.github.luben.zstd.BuildConfig;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.ActionButtonComponent;
import qr.BrandingComponent;
import qr.CancelButtonComponent;
import qr.CombinedStepButtonComponent;
import qr.CompleteButtonComponent;
import qr.FooterComponent;
import qr.HorizontalStackComponent;
import qr.ImagePreviewComponent;
import qr.LinkButtonComponent;
import qr.LocalImageComponent;
import qr.PhoneNumberSnaComponent;
import qr.PrivacyPolicyComponent;
import qr.QRCodeComponent;
import qr.RemoteImageComponent;
import qr.SpacerComponent;
import qr.SubmitButtonComponent;
import qr.TextComponent;
import qr.TitleComponent;
import qr.d6;
import qr.i;
import qr.x5;
import qr.y5;
import qr.z5;
import zp.q;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\n0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r*\b\u0012\u0004\u0012\u00020\n0\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001c\u001a\u00020\u001b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u001e*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0019H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {BuildConfig.FLAVOR, "Lqr/x5;", "old", "new", "m", "(Ljava/util/List;Lqr/x5;Lqr/x5;)Ljava/util/List;", BuildConfig.FLAVOR, "name", "g", "(Ljava/util/List;Ljava/lang/String;)Lqr/x5;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "i", "(Ljava/util/List;)Ljava/util/List;", BuildConfig.FLAVOR, "j", "(Ljava/util/List;)Ljava/util/Map;", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;)Lqr/x5;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lqr/t4;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Lqr/t4;", "Lqr/i;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "config", "Lcom/google/android/material/button/MaterialButton;", "c", "(Lqr/i;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "e", "(Lqr/i;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", BuildConfig.FLAVOR, "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)I", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11367a;

        static {
            int[] iArr = new int[Button.ButtonType.values().length];
            try {
                iArr[Button.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11367a = iArr;
        }
    }

    @NotNull
    public static final MaterialButton c(@NotNull i iVar, @NotNull z5 uiComponentHelper, @NotNull Button config) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            PersonaMaterialButton personaMaterialButton = new PersonaMaterialButton(uiComponentHelper.getContext(), null, h(config));
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                personaMaterialButton.setText(attributes.getText());
            }
            return personaMaterialButton;
        }
        final PersonaMaterialButton personaMaterialButton2 = new PersonaMaterialButton(uiComponentHelper.getContext());
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            personaMaterialButton2.setText(attributes2.getText());
        }
        uiComponentHelper.d(new Function0() { // from class: qr.b6
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.g.d(personaMaterialButton2, styles);
            }
        });
        return personaMaterialButton2;
    }

    public static final Unit d(PersonaMaterialButton personaMaterialButton, BaseButtonComponentStyle baseButtonComponentStyle) {
        yr.e.h(personaMaterialButton, baseButtonComponentStyle, false, false, false, 14, null);
        return Unit.f21506a;
    }

    @NotNull
    public static final ButtonWithLoadingIndicator e(@NotNull i iVar, @NotNull z5 uiComponentHelper, @NotNull Button config) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(uiComponentHelper.getContext(), h(config));
            BaseButtonAttributes attributes = config.getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            return buttonWithLoadingIndicator;
        }
        final ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(uiComponentHelper.getContext(), 0);
        BaseButtonAttributes attributes2 = config.getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        uiComponentHelper.d(new Function0() { // from class: qr.a6
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.g.f(buttonWithLoadingIndicator2, styles);
            }
        });
        return buttonWithLoadingIndicator2;
    }

    public static final Unit f(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
        yr.e.i(buttonWithLoadingIndicator, baseButtonComponentStyle, false, 2, null);
        return Unit.f21506a;
    }

    @Nullable
    public static final x5 g(@NotNull List<? extends x5> list, @NotNull String name) {
        x5 x5VarG;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        for (x5 x5Var : list) {
            if (Intrinsics.c(x5Var.getName(), name)) {
                return x5Var;
            }
            if ((x5Var instanceof y5) && (x5VarG = g(((y5) x5Var).getChildren(), name)) != null) {
                return x5VarG;
            }
        }
        return null;
    }

    public static final int h(Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i10 = buttonType == null ? -1 : a.f11367a[buttonType.ordinal()];
        if (i10 != -1 && i10 != 1) {
            if (i10 == 2) {
                return jq.a.f20826a;
            }
            throw new l();
        }
        return jc.b.f20309x;
    }

    @NotNull
    public static final List<x5> i(@NotNull List<? extends UiComponentConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x5 x5VarL = l((UiComponentConfig) it.next());
            if (x5VarL != null) {
                arrayList.add(x5VarL);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, UiComponentConfig> j(@NotNull List<? extends UiComponentConfig> list) {
        UiComponentConfig uiComponentConfig;
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        while (!linkedList.isEmpty() && (uiComponentConfig = (UiComponentConfig) linkedList.poll()) != null) {
            if (uiComponentConfig instanceof UiComponentContainerConfig) {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
                List<UiComponentConfig> children = ((UiComponentContainerConfig) uiComponentConfig).getChildren();
                if (children == null) {
                    children = p.k();
                }
                linkedList.addAll(children);
            } else {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final RemoteImageComponent k(@NotNull RemoteImage remoteImage) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        return new RemoteImageComponent(remoteImage);
    }

    @Nullable
    public static final x5 l(@NotNull UiComponentConfig uiComponentConfig) {
        Intrinsics.checkNotNullParameter(uiComponentConfig, "<this>");
        if (uiComponentConfig instanceof Branding) {
            return new BrandingComponent((Branding) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Button) {
            Button button = (Button) uiComponentConfig;
            if (button instanceof ActionButton) {
                return new ActionButtonComponent((ActionButton) uiComponentConfig);
            }
            if (button instanceof CancelButton) {
                return new CancelButtonComponent((CancelButton) uiComponentConfig);
            }
            if (button instanceof CombinedStepButton) {
                return new CombinedStepButtonComponent((CombinedStepButton) uiComponentConfig);
            }
            if (button instanceof CompleteButton) {
                return new CompleteButtonComponent((CompleteButton) uiComponentConfig);
            }
            if (button instanceof LinkButton) {
                return new LinkButtonComponent((LinkButton) uiComponentConfig);
            }
            if (button instanceof SubmitButton) {
                return new SubmitButtonComponent((SubmitButton) uiComponentConfig);
            }
            if (button instanceof VerifyPersonaButton) {
                return new d6((VerifyPersonaButton) uiComponentConfig);
            }
            throw new l();
        }
        if (uiComponentConfig instanceof UiComponentContainerConfig) {
            UiComponentContainerConfig uiComponentContainerConfig = (UiComponentContainerConfig) uiComponentConfig;
            if (uiComponentContainerConfig instanceof ClickableStack) {
                return new ClickableStackComponent((ClickableStack) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof Footer) {
                return new FooterComponent((Footer) uiComponentConfig);
            }
            if (uiComponentContainerConfig instanceof HorizontalStack) {
                return new HorizontalStackComponent((HorizontalStack) uiComponentConfig);
            }
            throw new l();
        }
        if (uiComponentConfig instanceof CombinedStepImagePreview) {
            return new ImagePreviewComponent((CombinedStepImagePreview) uiComponentConfig);
        }
        if (uiComponentConfig instanceof ESignature) {
            return new ESignatureComponent((ESignature) uiComponentConfig);
        }
        if (uiComponentConfig instanceof GovernmentIdNfcScan) {
            return new GovernmentIdNfcScanComponent((GovernmentIdNfcScan) uiComponentConfig);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (uiComponentConfig instanceof JpMyNumberNfcScan) {
            if (q.f39405a.b()) {
                return new JpMyNumberNfcScanComponent((JpMyNumberNfcScan) uiComponentConfig);
            }
            return null;
        }
        if (uiComponentConfig instanceof InputAddress) {
            return InputAddressComponent.INSTANCE.a((InputAddress) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCheckbox) {
            return new InputCheckboxComponent((InputCheckbox) uiComponentConfig, false, 2, defaultConstructorMarker);
        }
        if (uiComponentConfig instanceof InputCheckboxGroup) {
            return new InputCheckboxGroupComponent((InputCheckboxGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputConfirmationCode) {
            return new InputConfirmationCodeComponent((InputConfirmationCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputDate) {
            return new InputDateComponent((InputDate) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputFileUpload) {
            return new InputFileUploadComponent((InputFileUpload) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMaskedText) {
            return new InputMaskedTextComponent((InputMaskedText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputMultiSelect) {
            return InputMultiSelectComponent.INSTANCE.a((InputMultiSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputNumber) {
            return new InputNumberComponent((InputNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            return InputPhoneNumberComponent.INSTANCE.a((InputPhoneNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputRadioGroup) {
            return new InputRadioGroupComponent((InputRadioGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputSelect) {
            return InputSelectComponent.INSTANCE.a((InputSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputText) {
            return new InputTextComponent((InputText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputTextArea) {
            return new InputTextAreaComponent((InputTextArea) uiComponentConfig);
        }
        if (uiComponentConfig instanceof LocalImage) {
            return new LocalImageComponent((LocalImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PrivacyPolicy) {
            return new PrivacyPolicyComponent((PrivacyPolicy) uiComponentConfig);
        }
        if (uiComponentConfig instanceof QRCode) {
            return new QRCodeComponent((QRCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof RemoteImage) {
            return k((RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Spacer) {
            return new SpacerComponent((Spacer) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Text) {
            return new TextComponent((Text) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Title) {
            return new TitleComponent((Title) uiComponentConfig);
        }
        if (uiComponentConfig instanceof CreatePersonaSheet) {
            return CreatePersonaSheetComponent.INSTANCE.a((CreatePersonaSheet) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCurrency) {
            return new InputCurrencyComponent((InputCurrency) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputInternationalDb) {
            return InputInternationalDbComponent.INSTANCE.a((InputInternationalDb) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Mdoc) {
            return MdocComponent.INSTANCE.a((Mdoc) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PhoneNumberSna) {
            return new PhoneNumberSnaComponent((PhoneNumberSna) uiComponentConfig);
        }
        if (Intrinsics.c(uiComponentConfig, UnknownComponentConfig.INSTANCE)) {
            return null;
        }
        throw new l();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @NotNull
    public static final List<x5> m(@NotNull List<? extends x5> list, @NotNull x5 old, @NotNull x5 x5Var) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(x5Var, "new");
        List<? extends x5> list2 = list;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list2, 10));
        for (x5 x5VarS1 : list2) {
            if (x5VarS1 instanceof y5) {
                if (Intrinsics.c(x5VarS1, old)) {
                    x5VarS1 = x5Var;
                } else {
                    y5 y5Var = (y5) x5VarS1;
                    x5VarS1 = y5Var.s1(m(y5Var.getChildren(), old, x5Var));
                }
            } else if (Intrinsics.c(x5VarS1, old)) {
                x5VarS1 = x5Var;
            }
            arrayList.add(x5VarS1);
        }
        return arrayList;
    }
}
