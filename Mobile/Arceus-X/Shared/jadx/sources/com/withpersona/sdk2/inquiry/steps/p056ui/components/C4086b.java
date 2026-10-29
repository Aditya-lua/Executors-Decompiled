package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LinkButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import cr.C4352y4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194ic.C6738b;
import p227jr.C7297e;
import p229jt.C7345l;
import p278lp.C8228j;
import p497vp.C12238a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\n0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r*\b\u0012\u0004\u0012\u00020\n0\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001c\u001a\u00020\u001b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u001e*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0019H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "old", "new", "m", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Ljava/util/List;", "", "name", "g", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "i", "(Ljava/util/List;)Ljava/util/List;", "", "j", "(Ljava/util/List;)Ljava/util/Map;", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "config", "Lcom/google/android/material/button/MaterialButton;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)I", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4086b {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17395a;

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
            f17395a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final MaterialButton m20886c(@NotNull ButtonComponent buttonComponent, @NotNull C4352y4 uiComponentHelper, @NotNull Button config) {
        Intrinsics.checkNotNullParameter(buttonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            PersonaMaterialButton personaMaterialButton = new PersonaMaterialButton(uiComponentHelper.getContext(), null, m20891h(config));
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
        uiComponentHelper.m22002d(new Function0() { // from class: cr.a5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4086b.m20887d(personaMaterialButton2, styles);
            }
        });
        return personaMaterialButton2;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m20887d(PersonaMaterialButton personaMaterialButton, BaseButtonComponentStyle baseButtonComponentStyle) {
        C7297e.m30364h(personaMaterialButton, baseButtonComponentStyle, false, false, false, 14, null);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ButtonWithLoadingIndicator m20888e(@NotNull ButtonComponent buttonComponent, @NotNull C4352y4 uiComponentHelper, @NotNull Button config) {
        Intrinsics.checkNotNullParameter(buttonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final BaseButtonComponentStyle styles = config.getStyles();
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(uiComponentHelper.getContext(), m20891h(config));
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
        uiComponentHelper.m22002d(new Function0() { // from class: cr.z4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4086b.m20889f(buttonWithLoadingIndicator2, styles);
            }
        });
        return buttonWithLoadingIndicator2;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m20889f(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
        C7297e.m30365i(buttonWithLoadingIndicator, baseButtonComponentStyle, false, 2, null);
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final UiComponent m20890g(@NotNull List<? extends UiComponent> list, @NotNull String name) {
        UiComponent uiComponentM20890g;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        for (UiComponent uiComponent : list) {
            if (Intrinsics.m31980c(uiComponent.getName(), name)) {
                return uiComponent;
            }
            if ((uiComponent instanceof UiComponentGroup) && (uiComponentM20890g = m20890g(((UiComponentGroup) uiComponent).getChildren(), name)) != null) {
                return uiComponentM20890g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final int m20891h(Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i10 = buttonType == null ? -1 : a.f17395a[buttonType.ordinal()];
        if (i10 != -1 && i10 != 1) {
            if (i10 == 2) {
                return C12238a.f43168a;
            }
            throw new C7345l();
        }
        return C6738b.f25917x;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final List<UiComponent> m20892i(@NotNull List<? extends UiComponentConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponentM20895l = m20895l((UiComponentConfig) it.next());
            if (uiComponentM20895l != null) {
                arrayList.add(uiComponentM20895l);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Map<String, UiComponentConfig> m20893j(@NotNull List<? extends UiComponentConfig> list) {
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
                    children = C7699p.m31892k();
                }
                linkedList.addAll(children);
            } else {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final RemoteImageComponent m20894k(@NotNull RemoteImage remoteImage) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        return new RemoteImageComponent(remoteImage);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final UiComponent m20895l(@NotNull UiComponentConfig uiComponentConfig) {
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
                return new VerifyPersonaButtonComponent((VerifyPersonaButton) uiComponentConfig);
            }
            throw new C7345l();
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
            throw new C7345l();
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
            if (C8228j.f30508a.m33572b()) {
                return new JpMyNumberNfcScanComponent((JpMyNumberNfcScan) uiComponentConfig);
            }
            return null;
        }
        if (uiComponentConfig instanceof InputAddress) {
            return InputAddressComponent.INSTANCE.m20646a((InputAddress) uiComponentConfig);
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
            return InputMultiSelectComponent.INSTANCE.m20748a((InputMultiSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputNumber) {
            return new InputNumberComponent((InputNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            return InputPhoneNumberComponent.INSTANCE.m20769a((InputPhoneNumber) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputRadioGroup) {
            return new InputRadioGroupComponent((InputRadioGroup) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputSelect) {
            return InputSelectComponent.INSTANCE.m20783a((InputSelect) uiComponentConfig);
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
            return m20894k((RemoteImage) uiComponentConfig);
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
            return CreatePersonaSheetComponent.INSTANCE.m20567a((CreatePersonaSheet) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCurrency) {
            return new InputCurrencyComponent((InputCurrency) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputInternationalDb) {
            return InputInternationalDbComponent.INSTANCE.m20727a((InputInternationalDb) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Mdoc) {
            return MdocComponent.INSTANCE.m20824a((Mdoc) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PhoneNumberSna) {
            return new PhoneNumberSnaComponent((PhoneNumberSna) uiComponentConfig);
        }
        if (Intrinsics.m31980c(uiComponentConfig, UnknownComponentConfig.INSTANCE)) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final List<UiComponent> m20896m(@NotNull List<? extends UiComponent> list, @NotNull UiComponent old, @NotNull UiComponent uiComponent) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(uiComponent, "new");
        List<? extends UiComponent> list2 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
        for (UiComponent uiComponentMo20548r1 : list2) {
            if (uiComponentMo20548r1 instanceof UiComponentGroup) {
                if (Intrinsics.m31980c(uiComponentMo20548r1, old)) {
                    uiComponentMo20548r1 = uiComponent;
                } else {
                    UiComponentGroup uiComponentGroup = (UiComponentGroup) uiComponentMo20548r1;
                    uiComponentMo20548r1 = uiComponentGroup.mo20548r1(m20896m(uiComponentGroup.getChildren(), old, uiComponent));
                }
            } else if (Intrinsics.m31980c(uiComponentMo20548r1, old)) {
                uiComponentMo20548r1 = uiComponent;
            }
            arrayList.add(uiComponentMo20548r1);
        }
        return arrayList;
    }
}
