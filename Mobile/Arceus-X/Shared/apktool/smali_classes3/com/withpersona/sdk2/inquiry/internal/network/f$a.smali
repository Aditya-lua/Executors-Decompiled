.class public final Lcom/withpersona/sdk2/inquiry/internal/network/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u00072\u0010\u0010\u0006\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\r\u001a\r\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u000c0\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0019\u0010\u000f\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000e0\u0004H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0010\u00a2\u0006\u0002\u0008\u000c0\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/f$a;",
        "",
        "<init>",
        "()V",
        "",
        "Lan/a0;",
        "viewBindings",
        "Lan/c0;",
        "e",
        "(Ljava/util/Set;)Lan/c0;",
        "d",
        "()Ljava/util/Set;",
        "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;",
        "a",
        "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;",
        "b",
        "Lum/h$e;",
        "c",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->c:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement$Companion;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;->a:Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;

    sget-object v6, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage$Companion;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption$Companion;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType$Companion;

    sget-object v9, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod$Companion;

    sget-object v10, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType$Companion;

    sget-object v11, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod$Companion;

    sget-object v12, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType$Companion;

    sget-object v13, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;

    sget-object v14, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;

    sget-object v15, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItemAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItemAdapter;

    sget-object v16, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType$Companion;

    sget-object v17, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes$Companion;

    sget-object v18, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation$Companion;

    sget-object v19, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;

    sget-object v20, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType$Companion;

    sget-object v21, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize$Companion;

    sget-object v22, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$Companion;

    sget-object v23, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName$Companion;

    sget-object v24, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight$Companion;

    sget-object v25, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle$Companion;

    sget-object v26, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis$Companion;

    sget-object v27, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;

    sget-object v28, Lcom/withpersona/sdk2/inquiry/network/core/NumberAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/NumberAdapter;

    sget-object v29, Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;

    sget-object v30, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;

    filled-new-array/range {v1 .. v30}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;->createAdapter()Lum/h$e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lan/a0;

    sget-object v1, Lcom/squareup/workflow1/ui/backstack/BackStackContainer;->c:Lcom/squareup/workflow1/ui/backstack/BackStackContainer$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer;->c:Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/util/Set;)Lan/c0;
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;)",
            "Lan/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "viewBindings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Lan/a0;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lan/a0;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lan/a0;

    invoke-static {p1}, Lan/d0;->b([Lan/a0;)Lan/c0;

    move-result-object p1

    return-object p1
.end method
