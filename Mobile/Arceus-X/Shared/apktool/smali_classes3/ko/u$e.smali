.class public final Lko/u$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko/u;->s(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1"
    f = "CameraScreenRunner.kt"
    l = {
        0x149,
        0x151
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:J

.field public final synthetic v:Lko/u;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;


# direct methods
.method public constructor <init>(JLko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lko/u;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            "Lnt/b<",
            "-",
            "Lko/u$e;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lko/u$e;->u:J

    iput-object p3, p0, Lko/u$e;->v:Lko/u;

    iput-object p4, p0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lko/u$e;

    iget-wide v1, p0, Lko/u$e;->u:J

    iget-object v3, p0, Lko/u$e;->v:Lko/u;

    iget-object v4, p0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lko/u$e;-><init>(JLko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lko/u$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lko/u$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lko/u$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lko/u$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lko/u$e;->t:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ljt/n;

    invoke-virtual {v1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-wide v6, v0, Lko/u$e;->u:J

    iput v4, v0, Lko/u$e;->t:I

    invoke-static {v6, v7, v0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v2, v0, Lko/u$e;->v:Lko/u;

    invoke-static {v2, v3}, Lko/u;->o(Lko/u;Lku/d2;)V

    iget-object v2, v0, Lko/u$e;->v:Lko/u;

    invoke-static {v2}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object v2

    invoke-interface {v2}, Lfn/g;->b()Lnu/p0;

    move-result-object v2

    invoke-interface {v2}, Lnu/p0;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz v2, :cond_4

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_4
    iget-object v2, v0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v2

    sget-object v4, Lmn/a;->b:Lmn/a;

    if-ne v2, v4, :cond_7

    iget-object v2, v0, Lko/u$e;->v:Lko/u;

    invoke-static {v2}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object v2

    iput v5, v0, Lko/u$e;->t:I

    invoke-interface {v2, v0}, Lfn/g;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    move-object v1, v2

    :goto_2
    iget-object v2, v0, Lko/u$e;->v:Lko/u;

    iget-object v4, v0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-static {v1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object v6, v1

    check-cast v6, Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    invoke-static {v2}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v7

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v15, 0x7c

    const/16 v16, 0x0

    const-string v8, "government-id"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    :cond_6
    iget-object v2, v0, Lko/u$e;->v:Lko/u;

    iget-object v4, v0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-static {v1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v2}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v6

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x14

    const/4 v13, 0x0

    const-string v7, "government-id"

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_7
    iget-object v1, v0, Lko/u$e;->v:Lko/u;

    invoke-static {v1}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    iget-object v2, v0, Lko/u$e;->w:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->l()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v2

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v9

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-static {v1, v6, v2, v5, v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    iget-object v1, v0, Lko/u$e;->v:Lko/u;

    invoke-static {v1}, Lko/u;->i(Lko/u;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lfn/m0;

    invoke-direct {v2}, Lfn/m0;-><init>()V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method
