.class public final Lro/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lro/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lro/i;",
        "",
        "Luq/a;",
        "navigationStateManager",
        "<init>",
        "(Luq/a;)V",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "renderProps",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;",
        "renderState",
        "Lvr/f;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "workflowContext",
        "Luo/l;",
        "videoCaptureHelper",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "",
        "onOutput",
        "Lwq/l;",
        "transition",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;",
        "i",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "m",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "a",
        "Luq/a;",
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


# instance fields
.field public final a:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luq/a;)V
    .locals 1
    .param p1    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "navigationStateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/i;->a:Luq/a;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lro/i;->l(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lro/i;->p(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lro/i;->k(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lro/i;->q(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lro/i;->r(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvr/f;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lro/i;->j(Lvr/f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lro/i;->o(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lro/i;->n(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lvr/f;)Lkotlin/Unit;
    .locals 25

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->L()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->L()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->g()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v4, :cond_2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->a()Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    move-object/from16 v16, v3

    goto :goto_1

    :cond_3
    move-object v15, v3

    move-object/from16 v16, v15

    :goto_1
    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->E()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->D()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->C()I

    move-result v9

    invoke-static {v0, v4}, Lqo/e;->e(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->x()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->I()Ljava/util/List;

    move-result-object v12

    new-instance v17, Lcom/withpersona/sdk2/camera/CameraProperties;

    const/16 v23, 0x1f

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/withpersona/sdk2/camera/CameraProperties;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->L()Ljava/util/List;

    move-result-object v14

    move-object/from16 v13, v17

    invoke-direct/range {v5 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final k(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqo/e;->p(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqo/e;->p(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;
    .locals 15

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->f()Ljava/lang/String;

    move-result-object v11

    const/16 v13, 0x5ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final q(Lvr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lkotlin/Unit;
    .locals 15

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->f()Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)Lkotlin/Unit;
    .locals 14

    if-nez p0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v6

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->f()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->N()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x480

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v4, p0

    move-object v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v5, p4

    invoke-static/range {v0 .. v13}, Lqo/e;->s(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;
    .locals 16
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lvr/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luo/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lwq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;",
            "Lvr/f<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;",
            "Luo/l;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "Lkotlin/Unit;",
            ">;",
            "Lwq/l;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "renderProps"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "renderState"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "workflowContext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "videoCaptureHelper"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onOutput"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "transition"

    move-object/from16 v15, p6

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->K()Lio/b;

    move-result-object v4

    sget-object v6, Lro/i$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v4, v8, :cond_1

    if-ne v4, v7, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->c1()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->U()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;->K()Lio/b;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v6, v6, v9

    if-eq v6, v8, :cond_3

    if-ne v6, v7, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->b1()Ljava/lang/String;

    move-result-object v6

    :goto_1
    move-object v7, v6

    goto :goto_2

    :cond_2
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_3
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->T()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    move-object/from16 v6, p0

    iget-object v9, v6, Lro/i;->a:Luq/a;

    invoke-virtual {v9}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v9

    new-instance v10, Lro/f;

    invoke-direct {v10, v1}, Lro/f;-><init>(Lvr/f;)V

    new-instance v11, Lro/g;

    invoke-direct {v11, v1, v0, v2, v3}, Lro/g;-><init>(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V

    new-instance v12, Lro/h;

    invoke-direct {v12, v3}, Lro/h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v0}, Luo/l;->c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result v13

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v14, v1

    move-object v6, v4

    invoke-direct/range {v5 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lwq/l;)V

    return-object v5
.end method

.method public final m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
    .locals 25
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lvr/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luo/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lwq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;",
            "Lvr/f<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;",
            "Luo/l;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "Lkotlin/Unit;",
            ">;",
            "Lwq/l;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v4, p1

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    const-string v0, "renderProps"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workflowContext"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCaptureHelper"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOutput"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transition"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->N()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->L()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->N()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_2
    move-object v8, v1

    :goto_0
    check-cast v8, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->h0()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->N()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v14

    const-string v15, "selectPage"

    invoke-static {v12, v13, v14, v15}, Lro/j;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_5

    :cond_4
    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->V()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_5

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v12

    :cond_5
    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->O()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->O()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move-object v1, v9

    :cond_9
    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    :goto_3
    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->k0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->c1()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v11

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->L()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;

    new-instance v13, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a$a;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->f()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljo/z;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v13, v14, v15, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->J()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->N()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->S()Ljava/lang/String;

    move-result-object v14

    move-object v15, v9

    move-object v9, v8

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;->O()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->j0()Ljava/lang/String;

    move-result-object v16

    if-eqz v1, :cond_b

    const/4 v0, 0x1

    :goto_5
    move/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    iget-object v1, v0, Lro/i;->a:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v19

    move-object/from16 v20, v10

    move-object v10, v14

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v14

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v1

    :cond_c
    move-object/from16 v21, v1

    new-instance v22, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    move-object/from16 v23, v15

    new-instance v15, Lro/a;

    invoke-direct {v15, v3}, Lro/a;-><init>(Lvr/f;)V

    new-instance v1, Lro/b;

    invoke-direct {v1, v3}, Lro/b;-><init>(Lvr/f;)V

    new-instance v0, Lro/c;

    move-object/from16 v24, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v11

    move-object/from16 v11, v24

    invoke-direct/range {v0 .. v5}, Lro/c;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)V

    new-instance v1, Lro/d;

    invoke-direct {v1, v3, v4, v5, v6}, Lro/d;-><init>(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lro/e;

    invoke-direct {v2, v6}, Lro/e;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v5, v12

    move-object v6, v13

    move/from16 v12, v17

    move-object/from16 v4, v18

    move-object/from16 v13, v19

    move-object/from16 v3, v20

    move-object/from16 v20, v21

    move-object/from16 v21, p6

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct/range {v1 .. v21}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lio/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lwq/l;)V

    return-object v1
.end method
