package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import vm.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\"\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Landroid/os/Parcelable;", "name", "", "getName", "()Ljava/lang/String;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Companion", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UiComponentConfig extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final h.e createAdapter() {
            b bVarE = b.b(UiComponentConfig.class, Payload.TYPE).c(UnknownComponentConfig.INSTANCE).e(Text.class, Text.type).e(Title.class, Title.type).e(PrivacyPolicy.class, PrivacyPolicy.type).e(LocalImage.class, LocalImage.type).e(RemoteImage.class, RemoteImage.type).e(CompleteButton.class, CompleteButton.type).e(SubmitButton.class, SubmitButton.type).e(ActionButton.class, ActionButton.type).e(LinkButton.class, LinkButton.type).e(CancelButton.class, CancelButton.type).e(CombinedStepButton.class, CombinedStepButton.type).e(Footer.class, Footer.type).e(Branding.class, Branding.type).e(InputText.class, InputText.type).e(InputTextArea.class, InputTextArea.type).e(InputDate.class, InputDate.type).e(InputSelect.class, InputSelect.type).e(InputMultiSelect.class, InputMultiSelect.type).e(Spacer.class, Spacer.type).e(InputMaskedText.class, InputMaskedText.type).e(HorizontalStack.class, HorizontalStack.type).e(InputAddress.class, InputAddress.type).e(InputInternationalDb.class, InputInternationalDb.type).e(InputPhoneNumber.class, InputPhoneNumber.type).e(InputConfirmationCode.class, InputConfirmationCode.type).e(ClickableStack.class, ClickableStack.TYPE).e(InputCheckbox.class, InputCheckbox.type).e(InputCheckboxGroup.class, InputCheckboxGroup.type).e(InputNumber.class, InputNumber.type).e(InputCurrency.class, InputCurrency.type).e(QRCode.class, QRCode.type).e(CombinedStepImagePreview.class, CombinedStepImagePreview.type).e(ESignature.class, ESignature.type).e(GovernmentIdNfcScan.class, GovernmentIdNfcScan.type).e(JpMyNumberNfcScan.class, JpMyNumberNfcScan.type).e(InputRadioGroup.class, InputRadioGroup.type).e(CreatePersonaSheet.class, CreatePersonaSheet.type).e(VerifyPersonaButton.class, VerifyPersonaButton.type).e(PhoneNumberSna.class, PhoneNumberSna.type).e(Mdoc.class, Mdoc.type).e(InputFileUpload.class, InputFileUpload.type);
            Intrinsics.checkNotNullExpressionValue(bVarE, "withSubtype(...)");
            return bVarE;
        }
    }

    @Nullable
    UiComponentAttributes getAttributes();

    @NotNull
    String getName();
}
