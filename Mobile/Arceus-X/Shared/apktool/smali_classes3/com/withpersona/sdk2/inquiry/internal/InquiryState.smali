.class public abstract Lcom/withpersona/sdk2/inquiry/internal/InquiryState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;,
        Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u00012\u00020\u0002:\r789:;<=>?@ABCB]\u0008\u0004\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u0019R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008*\u0010\u0019R(\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0004\u0008+\u0010,\u0012\u0004\u00081\u00102\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u0014\u00106\u001a\u0002048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u00105\u0082\u0001\rDEFGHIJKLMNOP\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;",
        "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;",
        "Landroid/os/Parcelable;",
        "",
        "sessionToken",
        "trackingEventsUrl",
        "inquiryId",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;",
        "transitionStatus",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;",
        "styles",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;",
        "cancelDialog",
        "fromStep",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;)V",
        "p",
        "(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;",
        "other",
        "",
        "t0",
        "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z",
        "a",
        "Ljava/lang/String;",
        "y",
        "()Ljava/lang/String;",
        "b",
        "i",
        "c",
        "g",
        "d",
        "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;",
        "n",
        "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;",
        "getStyles",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;",
        "f",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;",
        "j",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;",
        "m",
        "h",
        "Z",
        "k",
        "()Z",
        "o",
        "(Z)V",
        "getDidGoBack$annotations",
        "()V",
        "didGoBack",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "inquirySessionConfig",
        "CreateInquiryFromTemplate",
        "ResumeFallbackInquiry",
        "ExchangeOneTimeCode",
        "RedeemRelaySession",
        "CreateInquirySession",
        "ShowLoadingSpinner",
        "LoadFeatureFlagSession",
        "UiStepRunning",
        "GovernmentIdStepRunning",
        "SelfieStepRunning",
        "DocumentStepRunning",
        "IntegrationStepRunning",
        "Complete",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;",
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


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->d:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    .line 7
    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->e:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    .line 8
    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->f:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;

    .line 9
    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p8, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_5

    move-object p6, v1

    :cond_5
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_6

    move-object p7, v1

    :cond_6
    const/4 v0, 0x0

    move-object p8, p7

    move-object p9, v0

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p9}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public g()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->e:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->f:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->h:Z

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->g:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->d:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    return-object v0
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->h:Z

    return-void
.end method

.method public final p(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;
    .locals 45
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    const/16 v11, 0xf7

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v12}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;

    if-eqz v1, :cond_6

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;

    const/16 v17, 0x3ff7

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v18}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    if-eqz v1, :cond_7

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    const/16 v43, 0x3f

    const/16 v44, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, -0x9

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v44}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lio/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    if-eqz v1, :cond_8

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    const/16 v37, 0x1

    const/16 v38, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, -0x9

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v38}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lyp/a;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;

    if-eqz v1, :cond_9

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;

    const/16 v10, 0x7b

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v2 .. v11}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;

    if-eqz v1, :cond_a

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;

    const v24, 0x1ffff7

    const/16 v25, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v25}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;

    move-result-object v1

    return-object v1

    :cond_a
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;

    if-eqz v1, :cond_b

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;

    const v23, 0xffff7

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v2 .. v24}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;->r(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;

    move-result-object v1

    return-object v1

    :cond_b
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1
.end method

.method public t0(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->m()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->m()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public y()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->a:Ljava/lang/String;

    return-object v0
.end method
