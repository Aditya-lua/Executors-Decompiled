.class public final Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAdapter()Lum/h$e;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    const-string v1, "code"

    invoke-static {v0, v1}, Lvm/b;->b(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError;

    const-string v2, "document-generic-disabled-file-type-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError;

    const-string v2, "document-generic-file-limit-exceeded-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError;

    const-string v2, "document-generic-page-limit-exceeded-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError;

    const-string v2, "document-generic-malformed-file-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError;

    const-string v2, "document-generic-malformed-image-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError;

    const-string v2, "document-generic-malformed-pdf-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;

    const-string v2, "document-government-id-dimension-size-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$FileSizeExceededError;

    const-string v2, "document-generic-file-size-exceeded-error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$UnknownErrorAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$UnknownErrorAdapter;

    invoke-virtual {v0, v1}, Lvm/b;->d(Lum/h;)Lvm/b;

    move-result-object v0

    return-object v0
.end method
