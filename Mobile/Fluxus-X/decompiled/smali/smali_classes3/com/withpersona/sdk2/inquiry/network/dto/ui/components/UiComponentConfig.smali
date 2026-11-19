.class public interface abstract Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\"\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,\u00a8\u0006-\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
        "Landroid/os/Parcelable;",
        "name",
        "",
        "getName",
        "()Ljava/lang/String;",
        "attributes",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;",
        "getAttributes",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;",
        "Companion",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;",
        "network-inquiry_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;->$$INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;

    return-void
.end method


# virtual methods
.method public abstract getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
