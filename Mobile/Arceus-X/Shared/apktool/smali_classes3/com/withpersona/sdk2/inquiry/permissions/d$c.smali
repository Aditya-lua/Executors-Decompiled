.class public final Lcom/withpersona/sdk2/inquiry/permissions/d$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/d;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker$run$1"
    f = "PermissionRequestDialogWorker.kt"
    l = {
        0x2e,
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/permissions/d;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/d;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/d;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/d$c;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/d;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->v:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/d;->g(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p1

    new-instance v5, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/permissions/d;->e(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lrp/i0;

    move-result-object v2

    invoke-static {v2}, Lrp/n1;->c(Lrp/i0;)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "requested"

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v5, v2, v3, v6}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logPermissionEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;ZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/d;->f(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lg/c;

    move-result-object p1

    invoke-virtual {p1}, Lg/c;->a()Lh/a;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/permissions/d;->d(Lcom/withpersona/sdk2/inquiry/permissions/d;)Landroid/content/Context;

    move-result-object v2

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/permissions/d;->e(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lrp/i0;

    move-result-object v5

    invoke-static {v5}, Lrp/n1;->c(Lrp/i0;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v2, v5}, Lh/a;->getSynchronousResult(Landroid/content/Context;Ljava/lang/Object;)Lh/a$a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh/a$a;->a()Ljava/lang/Object;

    move-result-object v6

    :cond_3
    invoke-static {v4}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;->a:Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->v:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->t:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->u:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/d;->f(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lg/c;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->w:Lcom/withpersona/sdk2/inquiry/permissions/d;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/permissions/d;->e(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lrp/i0;

    move-result-object v2

    invoke-static {v2}, Lrp/n1;->c(Lrp/i0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg/c;->b(Ljava/lang/Object;)V

    new-instance p1, Lmp/b0;

    invoke-direct {p1}, Lmp/b0;-><init>()V

    new-instance v2, Lcom/withpersona/sdk2/inquiry/permissions/d$c$a;

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/permissions/d$c$a;-><init>(Lnu/i;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->v:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->t:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->u:I

    invoke-virtual {p1, v2, p0}, Lmp/b0;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    :goto_2
    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/d$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
