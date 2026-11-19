.class public final Lhv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u001aQ\u0010\u0008\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\u0008\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\u0008\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "R",
        "T",
        "Lkotlin/Function2;",
        "Leu/b;",
        "",
        "receiver",
        "completion",
        "",
        "c",
        "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)V",
        "fatalCompletion",
        "b",
        "(Leu/b;Leu/b;)V",
        "",
        "e",
        "a",
        "(Leu/b;Ljava/lang/Throwable;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Leu/b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    instance-of v0, p1, Lav/b1;

    if-eqz v0, :cond_0

    check-cast p1, Lav/b1;

    invoke-virtual {p1}, Lav/b1;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Leu/b;Leu/b;)V
    .locals 1
    .param p0    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Leu/b<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p0

    sget-object v0, Lzt/n;->b:Lzt/n$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lgv/j;->b(Leu/b;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lhv/a;->a(Leu/b;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)V
    .locals 0
    .param p0    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Leu/b<",
            "-TT;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lfu/b;->a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p0

    invoke-static {p0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p0

    sget-object p1, Lzt/n;->b:Lzt/n$a;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lgv/j;->b(Leu/b;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lhv/a;->a(Leu/b;Ljava/lang/Throwable;)V

    return-void
.end method
