.class public final Lsn/h0$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsn/h0;->j(Landroidx/camera/core/d;)V
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
    c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4"
    f = "GovernmentIdFeed.kt"
    l = {
        0x70,
        0x72
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public final synthetic x:Landroidx/camera/core/d;

.field public final synthetic y:Lsn/h0;


# direct methods
.method public constructor <init>(Landroidx/camera/core/d;Lsn/h0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/d;",
            "Lsn/h0;",
            "Leu/b<",
            "-",
            "Lsn/h0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsn/h0$b;->x:Landroidx/camera/core/d;

    iput-object p2, p0, Lsn/h0$b;->y:Lsn/h0;

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

    new-instance p1, Lsn/h0$b;

    iget-object v0, p0, Lsn/h0$b;->x:Landroidx/camera/core/d;

    iget-object v1, p0, Lsn/h0$b;->y:Lsn/h0;

    invoke-direct {p1, v0, v1, p2}, Lsn/h0$b;-><init>(Landroidx/camera/core/d;Lsn/h0;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lsn/h0$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lsn/h0$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lsn/h0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lsn/h0$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsn/h0$b;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lsn/h0$b;->u:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/d;

    iget-object v1, p0, Lsn/h0$b;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/AutoCloseable;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lsn/h0$b;->x:Landroidx/camera/core/d;

    iget-object p1, p0, Lsn/h0$b;->y:Lsn/h0;

    :try_start_1
    invoke-static {v1}, Lsn/o0;->f(Landroidx/camera/core/d;)Lsn/l0;

    move-result-object v5

    if-nez v5, :cond_3

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1, v4}, Lnu/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object p1

    :cond_3
    :try_start_2
    iput-object v1, p0, Lsn/h0$b;->t:Ljava/lang/Object;

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lsn/h0$b;->u:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, p0, Lsn/h0$b;->v:I

    iput v3, p0, Lsn/h0$b;->w:I

    invoke-static {p1, v5, p0}, Lsn/h0;->l(Lsn/h0;Lsn/l0;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {v1, v4}, Lnu/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lsn/h0$b;->y:Lsn/h0;

    invoke-static {v1}, Lsn/h0;->m(Lsn/h0;)Ldv/b0;

    move-result-object v1

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v3

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lsn/h0$b;->t:Ljava/lang/Object;

    iput-object v4, p0, Lsn/h0$b;->u:Ljava/lang/Object;

    iput v2, p0, Lsn/h0$b;->w:I

    invoke-interface {v1, v3, p0}, Ldv/b0;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_3
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Lnu/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method
