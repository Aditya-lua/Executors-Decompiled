.class public final Lnq/k0$f$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq/k0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2"
    f = "CameraScreenRunner.kt"
    l = {
        0xc3,
        0xd8
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lsn/i;

.field public final synthetic v:Lnq/k0;

.field public final synthetic w:Lmq/q5$d$a$a;

.field public final synthetic x:Lmq/q5$d$a;


# direct methods
.method public constructor <init>(Lsn/i;Lnq/k0;Lmq/q5$d$a$a;Lmq/q5$d$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/i;",
            "Lnq/k0;",
            "Lmq/q5$d$a$a;",
            "Lmq/q5$d$a;",
            "Leu/b<",
            "-",
            "Lnq/k0$f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnq/k0$f$b;->u:Lsn/i;

    iput-object p2, p0, Lnq/k0$f$b;->v:Lnq/k0;

    iput-object p3, p0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    iput-object p4, p0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnq/k0$f$b;

    iget-object v1, p0, Lnq/k0$f$b;->u:Lsn/i;

    iget-object v2, p0, Lnq/k0$f$b;->v:Lnq/k0;

    iget-object v3, p0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    iget-object v4, p0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnq/k0$f$b;-><init>(Lsn/i;Lnq/k0;Lmq/q5$d$a$a;Lmq/q5$d$a;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnq/k0$f$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnq/k0$f$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnq/k0$f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnq/k0$f$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnq/k0$f$b;->t:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Lzt/n;

    invoke-virtual {v1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Lzt/n;

    invoke-virtual {v2}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lnq/k0$f$b;->u:Lsn/i;

    iput v5, v0, Lnq/k0$f$b;->t:I

    invoke-interface {v2, v0}, Lsn/i;->k(Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v6, v0, Lnq/k0$f$b;->v:Lnq/k0;

    iget-object v7, v0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    invoke-static {v2}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v8, v2

    check-cast v8, Ljava/io/File;

    invoke-static {v6}, Lnq/k0;->v(Lnq/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v9

    invoke-virtual {v7}, Lmq/q5$d$a;->E()Lzn/a;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    const/16 v17, 0x7c

    const/16 v18, 0x0

    const-string v10, "selfie"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    :cond_4
    iget-object v6, v0, Lnq/k0$f$b;->v:Lnq/k0;

    iget-object v7, v0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    invoke-static {v2}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v6}, Lnq/k0;->v(Lnq/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v8

    invoke-virtual {v7}, Lmq/q5$d$a;->E()Lzn/a;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v2}, Lzt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x14

    const/4 v15, 0x0

    const-string v9, "selfie"

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_5
    iget-object v2, v0, Lnq/k0$f$b;->v:Lnq/k0;

    invoke-static {v2}, Lnq/k0;->v(Lnq/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v2

    iget-object v6, v0, Lnq/k0$f$b;->u:Lsn/i;

    invoke-interface {v6}, Lsn/i;->f()Lsn/v;

    move-result-object v6

    invoke-static {v6}, Lsn/w;->a(Lsn/v;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v2, v6, v7, v4, v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logCameraInfoEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;ZILjava/lang/Object;)V

    iget-object v2, v0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    check-cast v2, Lmq/q5$d$a$a$h;

    invoke-virtual {v2}, Lmq/q5$d$a$a$h;->e()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lnq/k0$f$b;->u:Lsn/i;

    iput v4, v0, Lnq/k0$f$b;->t:I

    invoke-interface {v2, v0}, Lsn/i;->i(Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    move-object v1, v2

    :goto_2
    iget-object v9, v0, Lnq/k0$f$b;->v:Lnq/k0;

    iget-object v10, v0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    iget-object v7, v0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    iget-object v8, v0, Lnq/k0$f$b;->u:Lsn/i;

    invoke-static {v1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v9}, Lnq/k0;->v(Lnq/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v11

    invoke-virtual {v10}, Lmq/q5$d$a;->E()Lzn/a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    const/16 v16, 0xc

    const/16 v17, 0x0

    const-string v12, "selfie"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStartEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    if-eqz v2, :cond_8

    invoke-static {v9}, Lnq/k0;->s(Lnq/k0;)Lav/d2;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2, v3, v5, v3}, Lav/d2$a;->a(Lav/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_7
    invoke-static {v9}, Lnq/k0;->r(Lnq/k0;)Landroidx/lifecycle/m;

    move-result-object v2

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v12

    new-instance v14, Lnq/k0$f$b$a;

    const/4 v11, 0x0

    move-object v6, v14

    invoke-direct/range {v6 .. v11}, Lnq/k0$f$b$a;-><init>(Lmq/q5$d$a$a;Lsn/i;Lnq/k0;Lmq/q5$d$a;Leu/b;)V

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v11, v2

    invoke-static/range {v11 .. v16}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    move-result-object v2

    invoke-static {v9, v2}, Lnq/k0;->z(Lnq/k0;Lav/d2;)V

    :cond_8
    iget-object v2, v0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    iget-object v3, v0, Lnq/k0$f$b;->v:Lnq/k0;

    iget-object v4, v0, Lnq/k0$f$b;->x:Lmq/q5$d$a;

    invoke-static {v1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_9

    check-cast v2, Lmq/q5$d$a$a$h;

    invoke-virtual {v2}, Lmq/q5$d$a$a$h;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lnq/k0;->v(Lnq/k0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v5

    invoke-virtual {v4}, Lmq/q5$d$a;->E()Lzn/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1}, Lzt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x14

    const/4 v12, 0x0

    const-string v6, "selfie"

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_9
    iget-object v1, v0, Lnq/k0$f$b;->w:Lmq/q5$d$a$a;

    check-cast v1, Lmq/q5$d$a$a$h;

    invoke-virtual {v1}, Lmq/q5$d$a$a$h;->d()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, v0, Lnq/k0$f$b;->u:Lsn/i;

    invoke-interface {v2}, Lsn/i;->f()Lsn/v;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method
