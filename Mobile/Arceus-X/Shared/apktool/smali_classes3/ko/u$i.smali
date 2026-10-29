.class public final Lko/u$i;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko/u;->A(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;J)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1"
    f = "CameraScreenRunner.kt"
    l = {
        0x12d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lko/u;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

.field public final synthetic w:Landroidx/lifecycle/m;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;JLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko/u;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            "Landroidx/lifecycle/m;",
            "J",
            "Lnt/b<",
            "-",
            "Lko/u$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko/u$i;->u:Lko/u;

    iput-object p2, p0, Lko/u$i;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iput-object p3, p0, Lko/u$i;->w:Landroidx/lifecycle/m;

    iput-wide p4, p0, Lko/u$i;->x:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lko/u$i;

    iget-object v1, p0, Lko/u$i;->u:Lko/u;

    iget-object v2, p0, Lko/u$i;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v3, p0, Lko/u$i;->w:Landroidx/lifecycle/m;

    iget-wide v4, p0, Lko/u$i;->x:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lko/u$i;-><init>(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;JLnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lko/u$i;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lko/u$i;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lko/u$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lko/u$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lko/u$i;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lko/u$i;->u:Lko/u;

    invoke-static {p1}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object p1

    iput v2, p0, Lko/u$i;->t:I

    invoke-interface {p1, p0}, Lfn/g;->j(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lko/u$i;->u:Lko/u;

    iget-object v1, p0, Lko/u$i;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v2, p0, Lko/u$i;->w:Landroidx/lifecycle/m;

    iget-wide v3, p0, Lko/u$i;->x:J

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v5, p1

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {v0, v1, v2, v3, v4}, Lko/u;->p(Lko/u;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;J)V

    :cond_3
    invoke-static {v0}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-string v7, "government-id"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStartEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lko/u$i;->u:Lko/u;

    iget-object v1, p0, Lko/u$i;->v:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x14

    const/4 v9, 0x0

    const-string v3, "government-id"

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoErrorEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
