.class public interface abstract Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001%\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-.\u00a8\u0006/\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "Landroid/os/Parcelable;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "",
        "R0",
        "()J",
        "lastValueUpdateTs",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;",
        "ui-step-renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract R0()J
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
