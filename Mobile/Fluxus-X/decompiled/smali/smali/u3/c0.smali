.class public final Lu3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu3/t;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\"\u0010\n\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001bR \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u001f\u001a\u0004\u0008\u0017\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lu3/c0;",
        "Lu3/t;",
        "",
        "filePath",
        "<init>",
        "(Ljava/lang/String;)V",
        "T",
        "Lkotlin/Function1;",
        "Leu/b;",
        "",
        "block",
        "e",
        "(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;",
        "Lkotlin/Function2;",
        "",
        "c",
        "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;",
        "",
        "a",
        "(Leu/b;)Ljava/lang/Object;",
        "d",
        "Ljava/lang/String;",
        "Lkv/a;",
        "b",
        "Lkv/a;",
        "mutex",
        "Lu3/b;",
        "Lu3/b;",
        "version",
        "Ldv/h;",
        "",
        "Ldv/h;",
        "()Ldv/h;",
        "updateNotifications",
        "datastore-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkv/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lu3/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/c0;->a:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lkv/g;->b(ZILjava/lang/Object;)Lkv/a;

    move-result-object v0

    iput-object v0, p0, Lu3/c0;->b:Lkv/a;

    new-instance v0, Lu3/b;

    invoke-direct {v0, p1}, Lu3/b;-><init>(I)V

    iput-object v0, p0, Lu3/c0;->c:Lu3/b;

    new-instance p1, Lu3/c0$c;

    invoke-direct {p1, v1}, Lu3/c0$c;-><init>(Leu/b;)V

    invoke-static {p1}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    iput-object p1, p0, Lu3/c0;->d:Ldv/h;

    return-void
.end method


# virtual methods
.method public a(Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lu3/c0;->c:Lu3/b;

    invoke-virtual {p1}, Lu3/b;->b()I

    move-result p1

    invoke-static {p1}, Lgu/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b()Ldv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lu3/c0;->d:Ldv/h;

    return-object v0
.end method

.method public c(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lu3/c0$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu3/c0$b;

    iget v1, v0, Lu3/c0$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu3/c0$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu3/c0$b;

    invoke-direct {v0, p0, p2}, Lu3/c0$b;-><init>(Lu3/c0;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lu3/c0$b;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu3/c0$b;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, Lu3/c0$b;->u:Z

    iget-object v0, v0, Lu3/c0$b;->t:Ljava/lang/Object;

    check-cast v0, Lkv/a;

    :try_start_0
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lu3/c0;->b:Lkv/a;

    invoke-interface {p2, v4}, Lkv/a;->e(Ljava/lang/Object;)Z

    move-result v2

    :try_start_1
    invoke-static {v2}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object p2, v0, Lu3/c0$b;->t:Ljava/lang/Object;

    iput-boolean v2, v0, Lu3/c0$b;->u:Z

    iput v3, v0, Lu3/c0$b;->x:I

    invoke-interface {p1, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-interface {v0, v4}, Lkv/a;->f(Ljava/lang/Object;)V

    :cond_4
    return-object p2

    :catchall_1
    move-exception p1

    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_2
    if-eqz p1, :cond_5

    invoke-interface {v0, v4}, Lkv/a;->f(Ljava/lang/Object;)V

    :cond_5
    throw p2
.end method

.method public d(Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lu3/c0;->c:Lu3/b;

    invoke-virtual {p1}, Lu3/b;->d()I

    move-result p1

    invoke-static {p1}, Lgu/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public e(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lu3/c0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu3/c0$a;

    iget v1, v0, Lu3/c0$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu3/c0$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu3/c0$a;

    invoke-direct {v0, p0, p2}, Lu3/c0$a;-><init>(Lu3/c0;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lu3/c0$a;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu3/c0$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lu3/c0$a;->t:Ljava/lang/Object;

    check-cast p1, Lkv/a;

    :try_start_0
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lu3/c0$a;->u:Ljava/lang/Object;

    check-cast p1, Lkv/a;

    iget-object v2, v0, Lu3/c0$a;->t:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lu3/c0;->b:Lkv/a;

    iput-object p1, v0, Lu3/c0$a;->t:Ljava/lang/Object;

    iput-object p2, v0, Lu3/c0$a;->u:Ljava/lang/Object;

    iput v4, v0, Lu3/c0$a;->x:I

    invoke-interface {p2, v5, v0}, Lkv/a;->d(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iput-object p2, v0, Lu3/c0$a;->t:Ljava/lang/Object;

    iput-object v5, v0, Lu3/c0$a;->u:Ljava/lang/Object;

    iput v3, v0, Lu3/c0$a;->x:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_3
    invoke-interface {p1, v5}, Lkv/a;->f(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_4
    invoke-interface {p1, v5}, Lkv/a;->f(Ljava/lang/Object;)V

    throw p2
.end method
