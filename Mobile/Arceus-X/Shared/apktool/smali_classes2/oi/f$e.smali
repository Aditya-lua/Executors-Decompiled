.class public final Loi/f$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/f;->d(JLjava/lang/String;Ljava/lang/String;Loi/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1"
    f = "JobDispatcherBridge.kt"
    l = {
        0x14
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:J

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Loi/f$a;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Loi/f$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Loi/f$a;",
            "Lnt/b<",
            "-",
            "Loi/f$e;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Loi/f$e;->u:J

    iput-object p3, p0, Loi/f$e;->v:Ljava/lang/String;

    iput-object p4, p0, Loi/f$e;->w:Ljava/lang/String;

    iput-object p5, p0, Loi/f$e;->x:Loi/f$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Loi/f$e;

    iget-wide v1, p0, Loi/f$e;->u:J

    iget-object v3, p0, Loi/f$e;->v:Ljava/lang/String;

    iget-object v4, p0, Loi/f$e;->w:Ljava/lang/String;

    iget-object v5, p0, Loi/f$e;->x:Loi/f$a;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Loi/f$e;-><init>(JLjava/lang/String;Ljava/lang/String;Loi/f$a;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Loi/f$e;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Loi/f$e;->t:I

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

    iget-wide v3, p0, Loi/f$e;->u:J

    iget-object p1, p0, Loi/f$e;->v:Ljava/lang/String;

    iget-object v1, p0, Loi/f$e;->w:Ljava/lang/String;

    iput v2, p0, Loi/f$e;->t:I

    invoke-static {v3, v4, p1, v1, p0}, Loi/d;->b(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Loi/f$e;->x:Loi/f$a;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    instance-of v1, p1, Loi/e;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    check-cast p1, Loi/e;

    invoke-virtual {p1}, Loi/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "moderated"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Loi/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Loi/f$a;->a(Ljava/lang/String;Z)V

    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Loi/f$e;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Loi/f$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Loi/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
