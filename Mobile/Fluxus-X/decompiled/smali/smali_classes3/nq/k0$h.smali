.class public final Lnq/k0$h;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq/k0;->X(Lnq/k0;Lmq/q5$d$a;Lsn/i;Lmq/q5$d$a$a;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1"
    f = "CameraScreenRunner.kt"
    l = {
        0x158,
        0x15d
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

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lnq/k0;

.field public final synthetic x:Lmq/q5$d$a;

.field public final synthetic y:Lsn/i;

.field public final synthetic z:Lmq/q5$d$a$a;


# direct methods
.method public constructor <init>(Lnq/k0;Lmq/q5$d$a;Lsn/i;Lmq/q5$d$a$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq/k0;",
            "Lmq/q5$d$a;",
            "Lsn/i;",
            "Lmq/q5$d$a$a;",
            "Leu/b<",
            "-",
            "Lnq/k0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnq/k0$h;->w:Lnq/k0;

    iput-object p2, p0, Lnq/k0$h;->x:Lmq/q5$d$a;

    iput-object p3, p0, Lnq/k0$h;->y:Lsn/i;

    iput-object p4, p0, Lnq/k0$h;->z:Lmq/q5$d$a$a;

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

    new-instance v0, Lnq/k0$h;

    iget-object v1, p0, Lnq/k0$h;->w:Lnq/k0;

    iget-object v2, p0, Lnq/k0$h;->x:Lmq/q5$d$a;

    iget-object v3, p0, Lnq/k0$h;->y:Lsn/i;

    iget-object v4, p0, Lnq/k0$h;->z:Lmq/q5$d$a$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnq/k0$h;-><init>(Lnq/k0;Lmq/q5$d$a;Lsn/i;Lmq/q5$d$a$a;Leu/b;)V

    iput-object p1, v0, Lnq/k0$h;->v:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lnq/k0$h;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnq/k0$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnq/k0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnq/k0$h;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lnq/k0$h;->v:Ljava/lang/Object;

    check-cast v0, Lav/p0;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lnq/k0$h;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget v1, p0, Lnq/k0$h;->t:I

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lnq/k0$h;->t:I

    :try_start_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lnq/k0$h;->w:Lnq/k0;

    invoke-static {p1, v5}, Lnq/k0;->A(Lnq/k0;Z)V

    iget-object p1, p0, Lnq/k0$h;->x:Lmq/q5$d$a;

    invoke-virtual {p1}, Lmq/q5$d$a;->L()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lnq/k0$h;->x:Lmq/q5$d$a;

    invoke-virtual {p1}, Lmq/q5$d$a;->J()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lnq/k0$h;->x:Lmq/q5$d$a;

    invoke-virtual {p1}, Lmq/q5$d$a;->K()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v4

    goto :goto_1

    :cond_4
    :goto_0
    move v2, v5

    :goto_1
    if-eqz v2, :cond_5

    iget-object p1, p0, Lnq/k0$h;->w:Lnq/k0;

    invoke-static {p1, v5}, Lnq/k0;->y(Lnq/k0;Z)V

    iput-object v0, p0, Lnq/k0$h;->v:Ljava/lang/Object;

    iput v2, p0, Lnq/k0$h;->t:I

    iput v5, p0, Lnq/k0$h;->u:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {v0}, Lav/q0;->h(Lav/p0;)V

    iget-object p1, p0, Lnq/k0$h;->y:Lsn/i;

    iput-object v0, p0, Lnq/k0$h;->v:Ljava/lang/Object;

    iput v2, p0, Lnq/k0$h;->t:I

    iput v3, p0, Lnq/k0$h;->u:I

    invoke-interface {p1, p0}, Lsn/i;->g(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move v1, v2

    :goto_4
    invoke-static {v0}, Lav/q0;->h(Lav/p0;)V

    iget-object v0, p0, Lnq/k0$h;->z:Lmq/q5$d$a$a;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object v2, p1

    check-cast v2, Ljava/io/File;

    check-cast v0, Lmq/q5$d$a$a$e;

    invoke-virtual {v0}, Lmq/q5$d$a$a$e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getAbsolutePath(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v0, p0, Lnq/k0$h;->z:Lmq/q5$d$a$a;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v2, p1, Lun/o0;

    if-eqz v2, :cond_8

    goto :goto_5

    :cond_8
    check-cast v0, Lmq/q5$d$a$a$e;

    invoke-virtual {v0}, Lmq/q5$d$a$a$e;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_5
    if-eqz v1, :cond_a

    iget-object p1, p0, Lnq/k0$h;->w:Lnq/k0;

    invoke-static {p1, v4}, Lnq/k0;->y(Lnq/k0;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_a
    iget-object p1, p0, Lnq/k0$h;->w:Lnq/k0;

    invoke-static {p1, v4}, Lnq/k0;->A(Lnq/k0;Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_6
    iget-object v0, p0, Lnq/k0$h;->w:Lnq/k0;

    invoke-static {v0, v4}, Lnq/k0;->A(Lnq/k0;Z)V

    throw p1
.end method
