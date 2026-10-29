.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0017R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0019\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000c\u00a8\u0006\""
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;",
        "",
        "",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
        "steps",
        "",
        "sessionToken",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)V",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
        "g",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;",
        "a",
        "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;",
        "Ljava/util/List;",
        "b",
        "Landroidx/lifecycle/l0;",
        "c",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "inquiryId",
        "d",
        "authorization",
        "",
        "value",
        "()I",
        "h",
        "(I)V",
        "currentStepIndex",
        "currentStep",
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
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/l0;",
            ")V"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->b:Landroidx/lifecycle/l0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "toString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Bearer "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v7

    const/16 v10, 0x60

    const/4 v11, 0x0

    const-string v5, "fake_status"

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lgp/a;->I(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;

    if-eqz v1, :cond_1

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lgp/a;->F(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v5

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lgp/a;->H(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v5

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lgp/a;->E(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v7

    const/16 v10, 0x20

    const/4 v11, 0x0

    const-string v5, "fake_status"

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lgp/a;->D(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;

    if-eqz v1, :cond_5

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->d:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x0

    const-string v5, "fake_status"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lgp/a;->G(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v0

    return-object v0

    :cond_5
    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown type for step "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a:Ljava/util/List;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    return-object v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->b:Landroidx/lifecycle/l0;

    const-string v1, "current_fallback_mode_step_index"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/p;->m(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->h(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a:Ljava/util/List;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    return-object v0
.end method

.method public final g()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->h(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a:Ljava/util/List;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    return-object v0
.end method

.method public final h(I)V
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->b:Landroidx/lifecycle/l0;

    const-string v1, "current_fallback_mode_step_index"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/l0;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
