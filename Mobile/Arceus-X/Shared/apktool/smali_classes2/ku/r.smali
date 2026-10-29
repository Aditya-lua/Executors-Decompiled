.class public final Lku/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a)\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\u0008\u00030\u00012\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "T",
        "Lku/n;",
        "Lku/m;",
        "handler",
        "",
        "c",
        "(Lku/n;Lku/m;)V",
        "Lnt/b;",
        "delegate",
        "Lku/p;",
        "b",
        "(Lnt/b;)Lku/p;",
        "Lku/i1;",
        "handle",
        "a",
        "(Lku/n;Lku/i1;)V",
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
.method public static final a(Lku/n;Lku/i1;)V
    .locals 1
    .param p0    # Lku/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lku/i1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/n<",
            "*>;",
            "Lku/i1;",
            ")V"
        }
    .end annotation

    new-instance v0, Lku/j1;

    invoke-direct {v0, p1}, Lku/j1;-><init>(Lku/i1;)V

    invoke-static {p0, v0}, Lku/r;->c(Lku/n;Lku/m;)V

    return-void
.end method

.method public static final b(Lnt/b;)Lku/p;
    .locals 2
    .param p0    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnt/b<",
            "-TT;>;)",
            "Lku/p<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lqu/i;

    if-nez v0, :cond_0

    new-instance v0, Lku/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lku/p;-><init>(Lnt/b;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lqu/i;

    invoke-virtual {v0}, Lqu/i;->m()Lku/p;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lku/p;->R()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Lku/p;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lku/p;-><init>(Lnt/b;I)V

    return-object v0
.end method

.method public static final c(Lku/n;Lku/m;)V
    .locals 1
    .param p0    # Lku/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lku/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lku/n<",
            "-TT;>;",
            "Lku/m;",
            ")V"
        }
    .end annotation

    instance-of v0, p0, Lku/p;

    if-eqz v0, :cond_0

    check-cast p0, Lku/p;

    invoke-virtual {p0, p1}, Lku/p;->L(Lku/m;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "third-party implementation of CancellableContinuation is not supported"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
