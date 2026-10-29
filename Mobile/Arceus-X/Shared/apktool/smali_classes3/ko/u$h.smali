.class public final Lko/u$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko/u;->t(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$8"
    f = "CameraScreenRunner.kt"
    l = {
        0x10f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lko/u;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;


# direct methods
.method public constructor <init>(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko/u;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            "Lnt/b<",
            "-",
            "Lko/u$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko/u$h;->u:Lko/u;

    iput-object p2, p0, Lko/u$h;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance p1, Lko/u$h;

    iget-object v0, p0, Lko/u$h;->u:Lko/u;

    iget-object v1, p0, Lko/u$h;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-direct {p1, v0, v1, p2}, Lko/u$h;-><init>(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lko/u$h;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lko/u$h;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lko/u$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lko/u$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lko/u$h;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ljt/n;

    invoke-virtual {v1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lko/u$h;->u:Lko/u;

    invoke-static {v2}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object v2

    iput v3, v0, Lko/u$h;->t:I

    invoke-interface {v2, v0}, Lfn/g;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, v2

    :goto_0
    iget-object v2, v0, Lko/u$h;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v3, v0, Lko/u$h;->u:Lko/u;

    invoke-static {v1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v4, v1

    check-cast v4, Ljava/io/File;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->F()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v3}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object v6

    invoke-interface {v6}, Lfn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v7

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

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

    :cond_3
    iget-object v2, v0, Lko/u$h;->u:Lko/u;

    iget-object v3, v0, Lko/u$h;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-static {v1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v2}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v4

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0x14

    const/4 v11, 0x0

    const-string v5, "government-id"

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    instance-of v2, v1, Lfn/h0;

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->D()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method
