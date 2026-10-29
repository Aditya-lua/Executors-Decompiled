.class public final Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;",
        "",
        "<init>",
        "()V",
        "",
        "isEnabled",
        "extractTextFromImage",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "idSideConfig",
        "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;",
        "b",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;",
        "a",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "government-id_release"
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
    .locals 8

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;->a:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;-><init>(Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v1, v5

    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v1, v6, v7}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;-><init>(ZJ)V

    const-string v1, "unknown"

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    :goto_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object p3

    :cond_2
    invoke-direct {v0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;-><init>(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V

    return-object v0
.end method
