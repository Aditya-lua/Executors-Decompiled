.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;",
        "",
        "<init>",
        "()V",
        "Lum/h$e;",
        "createAdapter",
        "()Lum/h$e;",
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
.field static final synthetic $$INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;->$$INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createAdapter()Lum/h$e;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;

    const-string v1, "type"

    invoke-static {v0, v1}, Lvm/b;->b(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UnknownComponentConfig;

    invoke-virtual {v0, v1}, Lvm/b;->c(Ljava/lang/Object;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;

    const-string v2, "text"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;

    const-string v2, "title"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

    const-string v2, "privacy_policy"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;

    const-string v2, "image_local"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    const-string v2, "image_remote"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;

    const-string v2, "button_complete"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;

    const-string v2, "button_submit"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ActionButton;

    const-string v2, "button_action"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton;

    const-string v2, "button_link"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;

    const-string v2, "button_cancel"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepButton;

    const-string v2, "combined_step/button"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;

    const-string v2, "footer"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;

    const-string v2, "persona_branding"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;

    const-string v2, "input_text"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;

    const-string v2, "input_text_area"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;

    const-string v2, "input_date"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;

    const-string v2, "input_select"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;

    const-string v2, "input_multi_select"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;

    const-string v2, "spacer"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;

    const-string v2, "input_masked_text"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;

    const-string v2, "horizontal_stack"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;

    const-string v2, "input_address"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;

    const-string v2, "input_international_db"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

    const-string v2, "input_phone_number"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;

    const-string v2, "input_confirmation_code"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;

    const-string v2, "clickable_stack"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;

    const-string v2, "input_checkbox"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;

    const-string v2, "input_checkbox_group"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

    const-string v2, "input_number"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;

    const-string v2, "input_currency"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;

    const-string v2, "qr_code"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;

    const-string v2, "combined_step/image_preview"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    const-string v2, "input_e_signature"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;

    const-string v2, "government_id_nfc_scan"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;

    const-string v2, "jp_my_number_nfc_scan"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

    const-string v2, "input_radio_group"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;

    const-string v2, "button_create_persona"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;

    const-string v2, "button_verify_with_persona"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;

    const-string v2, "phone_number_silent_network_authentication"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;

    const-string v2, "mdoc"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;

    const-string v2, "input_file_upload"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-string v1, "withSubtype(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
