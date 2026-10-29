package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.UiComponentAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\"\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Landroid/os/Parcelable;", "name", "", "getName", "()Ljava/lang/String;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Companion", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface UiComponentConfig extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            C12232b c12232bM45368e = C12232b.m45364b(UiComponentConfig.class, Payload.TYPE).m45366c(UnknownComponentConfig.INSTANCE).m45368e(Text.class, Text.type).m45368e(Title.class, Title.type).m45368e(PrivacyPolicy.class, PrivacyPolicy.type).m45368e(LocalImage.class, LocalImage.type).m45368e(RemoteImage.class, RemoteImage.type).m45368e(CompleteButton.class, CompleteButton.type).m45368e(SubmitButton.class, SubmitButton.type).m45368e(ActionButton.class, ActionButton.type).m45368e(LinkButton.class, LinkButton.type).m45368e(CancelButton.class, CancelButton.type).m45368e(CombinedStepButton.class, CombinedStepButton.type).m45368e(Footer.class, Footer.type).m45368e(Branding.class, Branding.type).m45368e(InputText.class, InputText.type).m45368e(InputTextArea.class, InputTextArea.type).m45368e(InputDate.class, InputDate.type).m45368e(InputSelect.class, InputSelect.type).m45368e(InputMultiSelect.class, InputMultiSelect.type).m45368e(Spacer.class, Spacer.type).m45368e(InputMaskedText.class, InputMaskedText.type).m45368e(HorizontalStack.class, HorizontalStack.type).m45368e(InputAddress.class, InputAddress.type).m45368e(InputInternationalDb.class, InputInternationalDb.type).m45368e(InputPhoneNumber.class, InputPhoneNumber.type).m45368e(InputConfirmationCode.class, InputConfirmationCode.type).m45368e(ClickableStack.class, ClickableStack.TYPE).m45368e(InputCheckbox.class, InputCheckbox.type).m45368e(InputCheckboxGroup.class, InputCheckboxGroup.type).m45368e(InputNumber.class, InputNumber.type).m45368e(InputCurrency.class, InputCurrency.type).m45368e(QRCode.class, QRCode.type).m45368e(CombinedStepImagePreview.class, CombinedStepImagePreview.type).m45368e(ESignature.class, ESignature.type).m45368e(GovernmentIdNfcScan.class, GovernmentIdNfcScan.type).m45368e(JpMyNumberNfcScan.class, JpMyNumberNfcScan.type).m45368e(InputRadioGroup.class, InputRadioGroup.type).m45368e(CreatePersonaSheet.class, CreatePersonaSheet.type).m45368e(VerifyPersonaButton.class, VerifyPersonaButton.type).m45368e(PhoneNumberSna.class, PhoneNumberSna.type).m45368e(Mdoc.class, Mdoc.type).m45368e(InputFileUpload.class, InputFileUpload.type);
            Intrinsics.checkNotNullExpressionValue(c12232bM45368e, "withSubtype(...)");
            return c12232bM45368e;
        }
    }

    @Nullable
    UiComponentAttributes getAttributes();

    @NotNull
    String getName();
}
