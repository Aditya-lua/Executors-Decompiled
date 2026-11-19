.class public final Lmq/n$g;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/n;->G(Landroidx/lifecycle/m;Lmq/n;Lmq/q5$d$c$b;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$takePhoto$1"
    f = "OldCameraScreenRunner.kt"
    l = {
        0x14d
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

.field public final synthetic u:Lmq/n;

.field public final synthetic v:Lmq/q5$d$c$b;


# direct methods
.method public constructor <init>(Lmq/n;Lmq/q5$d$c$b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/n;",
            "Lmq/q5$d$c$b;",
            "Leu/b<",
            "-",
            "Lmq/n$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/n$g;->u:Lmq/n;

    iput-object p2, p0, Lmq/n$g;->v:Lmq/q5$d$c$b;

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

    new-instance p1, Lmq/n$g;

    iget-object v0, p0, Lmq/n$g;->u:Lmq/n;

    iget-object v1, p0, Lmq/n$g;->v:Lmq/q5$d$c$b;

    invoke-direct {p1, v0, v1, p2}, Lmq/n$g;-><init>(Lmq/n;Lmq/q5$d$c$b;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lmq/n$g;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/n$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/n$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/n$g;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/n$g;->t:I

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

    iget-object p1, p0, Lmq/n$g;->u:Lmq/n;

    invoke-static {p1}, Lmq/n;->l(Lmq/n;)Lsn/i;

    move-result-object p1

    iput v2, p0, Lmq/n$g;->t:I

    invoke-interface {p1, p0}, Lsn/i;->g(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lmq/n$g;->v:Lmq/q5$d$c$b;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, Ljava/io/File;

    check-cast v0, Lmq/q5$d$c$b$d;

    invoke-virtual {v0}, Lmq/q5$d$c$b$d;->d()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getAbsolutePath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lmq/n$g;->v:Lmq/q5$d$c$b;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    instance-of v1, p1, Lun/o0;

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    check-cast v0, Lmq/q5$d$c$b$d;

    invoke-virtual {v0}, Lmq/q5$d$c$b$d;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
