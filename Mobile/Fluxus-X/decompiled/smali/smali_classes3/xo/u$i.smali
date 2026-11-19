.class public final Lxo/u$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo/u;->A(Lvo/y3$b;J)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1"
    f = "CameraScreenRunner.kt"
    l = {
        0x12d
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

.field public final synthetic u:Lxo/u;

.field public final synthetic v:Lvo/y3$b;

.field public final synthetic w:Landroidx/lifecycle/m;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(Lxo/u;Lvo/y3$b;Landroidx/lifecycle/m;JLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/u;",
            "Lvo/y3$b;",
            "Landroidx/lifecycle/m;",
            "J",
            "Leu/b<",
            "-",
            "Lxo/u$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxo/u$i;->u:Lxo/u;

    iput-object p2, p0, Lxo/u$i;->v:Lvo/y3$b;

    iput-object p3, p0, Lxo/u$i;->w:Landroidx/lifecycle/m;

    iput-wide p4, p0, Lxo/u$i;->x:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 7
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

    new-instance v0, Lxo/u$i;

    iget-object v1, p0, Lxo/u$i;->u:Lxo/u;

    iget-object v2, p0, Lxo/u$i;->v:Lvo/y3$b;

    iget-object v3, p0, Lxo/u$i;->w:Landroidx/lifecycle/m;

    iget-wide v4, p0, Lxo/u$i;->x:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lxo/u$i;-><init>(Lxo/u;Lvo/y3$b;Landroidx/lifecycle/m;JLeu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lxo/u$i;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lxo/u$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxo/u$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lxo/u$i;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxo/u$i;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lxo/u$i;->u:Lxo/u;

    invoke-static {p1}, Lxo/u;->h(Lxo/u;)Lsn/i;

    move-result-object p1

    iput v2, p0, Lxo/u$i;->t:I

    invoke-interface {p1, p0}, Lsn/i;->i(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lxo/u$i;->u:Lxo/u;

    iget-object v1, p0, Lxo/u$i;->v:Lvo/y3$b;

    iget-object v2, p0, Lxo/u$i;->w:Landroidx/lifecycle/m;

    iget-wide v3, p0, Lxo/u$i;->x:J

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v5, p1

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {v0, v1, v2, v3, v4}, Lxo/u;->p(Lxo/u;Lvo/y3$b;Landroidx/lifecycle/m;J)V

    :cond_3
    invoke-static {v0}, Lxo/u;->l(Lxo/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v6

    invoke-virtual {v1}, Lvo/y3$b;->O()Lzn/a;

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
    iget-object v0, p0, Lxo/u$i;->u:Lxo/u;

    iget-object v1, p0, Lxo/u$i;->v:Lvo/y3$b;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lxo/u;->l(Lxo/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v2

    invoke-virtual {v1}, Lvo/y3$b;->O()Lzn/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Lzt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

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
