.class public final Lzo/x$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo/x;->E(Z)V
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
    c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1"
    f = "InquiryViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Z

.field public final synthetic v:Lzo/x;


# direct methods
.method public constructor <init>(ZLzo/x;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lzo/x;",
            "Lnt/b<",
            "-",
            "Lzo/x$d;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lzo/x$d;->u:Z

    iput-object p2, p0, Lzo/x$d;->v:Lzo/x;

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

    new-instance p1, Lzo/x$d;

    iget-boolean v0, p0, Lzo/x$d;->u:Z

    iget-object v1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-direct {p1, v0, v1, p2}, Lzo/x$d;-><init>(ZLzo/x;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lzo/x$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzo/x$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lzo/x$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzo/x$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lzo/x$d;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lzo/x$d;->u:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->f()Lzo/s;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lzo/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->r()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->q()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logForegroundEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->f()Lzo/s;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lzo/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->r()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lzo/x$d;->v:Lzo/x;

    invoke-virtual {p1}, Lzo/x;->q()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logBackgroundEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
