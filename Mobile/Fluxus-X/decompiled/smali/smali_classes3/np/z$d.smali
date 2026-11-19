.class public final Lnp/z$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnp/z;->E(Z)V
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
    c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1"
    f = "InquiryViewModel.kt"
    l = {}
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

.field public final synthetic u:Z

.field public final synthetic v:Lnp/z;


# direct methods
.method public constructor <init>(ZLnp/z;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnp/z;",
            "Leu/b<",
            "-",
            "Lnp/z$d;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lnp/z$d;->u:Z

    iput-object p2, p0, Lnp/z$d;->v:Lnp/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lnp/z$d;

    iget-boolean v0, p0, Lnp/z$d;->u:Z

    iget-object v1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-direct {p1, v0, v1, p2}, Lnp/z$d;-><init>(ZLnp/z;Leu/b;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lnp/z$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnp/z$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnp/z$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnp/z$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lnp/z$d;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lnp/z$d;->u:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->f()Lnp/s;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->r()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->q()Landroidx/lifecycle/d0;

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
    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->f()Lnp/s;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lnp/s;->b()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->r()Landroidx/lifecycle/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lnp/z$d;->v:Lnp/z;

    invoke-virtual {p1}, Lnp/z;->q()Landroidx/lifecycle/d0;

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
