.class public final Lcom/withpersona/sdk2/inquiry/governmentid/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aU\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001aU\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a=\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00022\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00172\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "renderProps",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
        "renderState",
        "Lym/k$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "",
        "context",
        "Luo/l;",
        "videoCaptureHelper",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "",
        "h",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        "autoClassifyWorkerFactory",
        "j",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V",
        "state",
        "",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;",
        "captureFrames",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;",
        "idConfigsForCountry",
        "backState",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;",
        "government-id_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->m(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->i(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->k(Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->l(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->n(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;",
            ">;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;"
        }
    .end annotation

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-static/range {p2 .. p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v2, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->g()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;->a()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    move-object v13, v1

    goto :goto_0

    :cond_1
    move-object v12, v1

    move-object v13, v12

    :goto_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->E()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->D()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->x()Ljava/lang/String;

    move-result-object v8

    new-instance v14, Lcom/withpersona/sdk2/camera/CameraProperties;

    const/16 v20, 0x1f

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/withpersona/sdk2/camera/CameraProperties;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, p1

    move-object/from16 v11, p2

    move-object/from16 v7, p3

    move-object v10, v14

    invoke-direct/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 16
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Luo/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Luo/l;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p4

    const-string v1, "renderProps"

    move-object/from16 v4, p0

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "renderState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "videoCaptureHelper"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "trackingEventsLogger"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;->CONTINUE:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;

    const/4 v6, 0x0

    const/4 v8, 0x2

    invoke-direct {v1, v5, v6, v8, v6}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    invoke-static {v0, v1, v5, v8, v6}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdButtonClickEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;ZILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Lym/k$a;->d()Lym/h;

    move-result-object v0

    new-instance v1, Lio/r2;

    invoke-direct {v1}, Lio/r2;-><init>()V

    const/4 v2, 0x1

    invoke-static {v6, v1, v2, v6}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lym/h;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v5

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v6

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v8

    const/16 v14, 0xf80

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public static final i(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->L(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V
    .locals 11
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Luo/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Luo/l;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
            ")V"
        }
    .end annotation

    const-string v0, "renderProps"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCaptureHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoClassifyWorkerFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->x()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v6

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;

    invoke-direct {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;-><init>()V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->z()J

    move-result-wide v8

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->a()Z

    move-result v10

    move-object v1, p4

    invoke-virtual/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    move-result-object p4

    new-instance v0, Lio/s2;

    invoke-direct {v0, p2, p3, p0, p1}, Lio/s2;-><init>(Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;)V

    const-class p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object p0

    const-string p1, ""

    invoke-static {p2, p4, p0, p1, v0}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final k(Lym/k$a;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lym/r;
    .locals 9

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lio/t2;

    invoke-direct {p2, p4, p0, p1}, Lio/t2;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;)V

    invoke-static {v2, p2, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;

    if-eqz v0, :cond_4

    check-cast p4, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;

    invoke-virtual {p4}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;->a()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    move-result-object v7

    instance-of p4, v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;

    if-eqz p4, :cond_1

    new-instance v3, Lio/u2;

    move-object v4, p0

    move-object v8, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Lio/u2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;)V

    invoke-static {v2, v3, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v5, p2

    move-object v6, p3

    instance-of p0, v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;

    if-eqz p0, :cond_2

    new-instance p0, Lio/v2;

    invoke-direct {p0, v5, v6, v7}, Lio/v2;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V

    invoke-static {v2, p0, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of p0, v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;

    if-eqz p0, :cond_3

    new-instance p0, Lio/w2;

    invoke-direct {p0, v5, v6, v7}, Lio/w2;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V

    invoke-static {v2, p0, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final l(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;Lym/r$c;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p0

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    instance-of v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v2

    :cond_1
    instance-of v2, v2, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InconsistentTransitionError;

    if-eqz v2, :cond_2

    new-instance p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {p1, p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->b0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Luo/l;)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getCode()I

    move-result v1

    const/16 v2, 0x1a6

    if-ne v1, v2, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {p3, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {p1, p3, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->b0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Luo/l;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;Lym/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p5

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->L(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v5

    move-object/from16 v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v8

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->f()Ljava/util/List;

    move-result-object v10

    const/16 v14, 0xc80

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v7, p4

    invoke-static/range {v2 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final n(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;
    .locals 18

    move-object/from16 v0, p3

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v2

    sget-object v3, Lio/d;->b:Lio/d;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v2

    move-object/from16 v3, p2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->x(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->g(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    move-result-object v1

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->E()Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->D()Ljava/util/List;

    move-result-object v5

    move-object v7, v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v6

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->x(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->x()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v1

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v10

    move-object/from16 v1, p2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;->a()Ljava/util/List;

    move-result-object v11

    sget-object v14, Lio/b;->a:Lio/b;

    const/16 v15, 0x600

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v7

    move-object v7, v4

    move-object/from16 v4, v17

    invoke-direct/range {v2 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lym/r$c;)Lkotlin/Unit;
    .locals 18

    move-object/from16 v0, p3

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v2

    sget-object v3, Lio/d;->b:Lio/d;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v2

    move-object/from16 v3, p2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->x(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->g(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    move-result-object v1

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->E()Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->D()Ljava/util/List;

    move-result-object v5

    move-object v7, v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v6

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->x(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->x()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v1

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v10

    move-object/from16 v1, p2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;->a()Ljava/util/List;

    move-result-object v11

    sget-object v14, Lio/b;->b:Lio/b;

    const/16 v15, 0x600

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v7

    move-object v7, v4

    move-object/from16 v4, v17

    invoke-direct/range {v2 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
