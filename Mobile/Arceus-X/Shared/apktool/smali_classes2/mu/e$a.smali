.class public final Lmu/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;
.implements Lku/k3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmu/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lmu/i<",
        "TE;>;",
        "Lku/k3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\r\u001a\u00020\u000c2\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lmu/e$a;",
        "Lmu/i;",
        "Lku/k3;",
        "<init>",
        "(Lmu/e;)V",
        "",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lqu/b0;",
        "segment",
        "",
        "index",
        "",
        "e",
        "(Lqu/b0;I)V",
        "next",
        "()Ljava/lang/Object;",
        "element",
        "i",
        "(Ljava/lang/Object;)Z",
        "j",
        "()V",
        "g",
        "()Z",
        "Lmu/m;",
        "",
        "r",
        "f",
        "(Lmu/m;IJLnt/b;)Ljava/lang/Object;",
        "h",
        "",
        "Ljava/lang/Object;",
        "receiveResult",
        "Lku/p;",
        "b",
        "Lku/p;",
        "continuation",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Lku/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/p<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final synthetic c:Lmu/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/e<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmu/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmu/e$a;->c:Lmu/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmu/f;->m()Lqu/e0;

    move-result-object p1

    iput-object p1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic b(Lmu/e$a;)V
    .locals 0

    invoke-virtual {p0}, Lmu/e$a;->h()V

    return-void
.end method

.method public static final synthetic c(Lmu/e$a;Lku/p;)V
    .locals 0

    iput-object p1, p0, Lmu/e$a;->b:Lku/p;

    return-void
.end method

.method public static final synthetic d(Lmu/e$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lmu/e$a;->a:Ljava/lang/Object;

    invoke-static {}, Lmu/f;->m()Lqu/e0;

    move-result-object v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lmu/e$a;->a:Ljava/lang/Object;

    invoke-static {}, Lmu/f;->z()Lqu/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    :goto_0
    move-object v4, p0

    goto/16 :goto_2

    :cond_0
    iget-object v3, p0, Lmu/e$a;->c:Lmu/e;

    invoke-static {}, Lmu/e;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmu/m;

    :goto_1
    invoke-virtual {v3}, Lmu/e;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lmu/e$a;->g()Z

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {}, Lmu/e;->o()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v6

    sget v1, Lmu/f;->b:I

    int-to-long v4, v1

    div-long v4, v6, v4

    int-to-long v8, v1

    rem-long v8, v6, v8

    long-to-int v1, v8

    iget-wide v8, v0, Lqu/b0;->c:J

    cmp-long v8, v8, v4

    if-eqz v8, :cond_2

    invoke-static {v3, v4, v5, v0}, Lmu/e;->k(Lmu/e;JLmu/m;)Lmu/m;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_2
    move-object v4, v0

    :cond_3
    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v3 .. v8}, Lmu/e;->M(Lmu/e;Lmu/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lmu/f;->r()Lqu/e0;

    move-result-object v1

    if-eq v0, v1, :cond_7

    invoke-static {}, Lmu/f;->h()Lqu/e0;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-virtual {v3}, Lmu/e;->s0()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-gez v0, :cond_4

    invoke-virtual {v4}, Lqu/c;->c()V

    :cond_4
    move-object v0, v4

    goto :goto_1

    :cond_5
    invoke-static {}, Lmu/f;->s()Lqu/e0;

    move-result-object v1

    if-ne v0, v1, :cond_6

    move-object v9, p1

    move-wide v7, v6

    move v6, v5

    move-object v5, v4

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lmu/e$a;->f(Lmu/m;IJLnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    move-object v5, v4

    move-object v4, p0

    invoke-virtual {v5}, Lqu/c;->c()V

    iput-object v0, v4, Lmu/e$a;->a:Ljava/lang/Object;

    :goto_2
    invoke-static {v2}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_7
    move-object v4, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lqu/b0;I)V
    .locals 1
    .param p1    # Lqu/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqu/b0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lmu/e$a;->b:Lku/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lku/p;->e(Lqu/b0;I)V

    :cond_0
    return-void
.end method

.method public final f(Lmu/m;IJLnt/b;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/m<",
            "TE;>;IJ",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu/e$a;->c:Lmu/e;

    invoke-static {p5}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    invoke-static {v1}, Lku/r;->b(Lnt/b;)Lku/p;

    move-result-object v6

    :try_start_0
    invoke-static {p0, v6}, Lmu/e$a;->c(Lmu/e$a;Lku/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v5, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    :try_start_1
    invoke-static/range {v0 .. v5}, Lmu/e;->M(Lmu/e;Lmu/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lmu/f;->r()Lqu/e0;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-static {v0, p0, v1, v2}, Lmu/e;->B(Lmu/e;Lku/k3;Lmu/m;I)V

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto/16 :goto_7

    :cond_0
    invoke-static {}, Lmu/f;->h()Lqu/e0;

    move-result-object p2

    const/4 p3, 0x1

    const/4 p4, 0x0

    if-ne p1, p2, :cond_9

    invoke-virtual {v0}, Lmu/e;->s0()J

    move-result-wide p1

    cmp-long p1, v3, p1

    if-gez p1, :cond_1

    invoke-virtual {v1}, Lqu/c;->c()V

    :cond_1
    invoke-static {}, Lmu/e;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmu/m;

    :goto_1
    invoke-virtual {v0}, Lmu/e;->h()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p0}, Lmu/e$a;->b(Lmu/e$a;)V

    goto/16 :goto_6

    :cond_2
    invoke-static {}, Lmu/e;->o()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v3

    sget p2, Lmu/f;->b:I

    int-to-long v1, p2

    div-long v1, v3, v1

    int-to-long v7, p2

    rem-long v7, v3, v7

    long-to-int p2, v7

    iget-wide v7, p1, Lqu/b0;->c:J

    cmp-long v7, v7, v1

    if-eqz v7, :cond_4

    invoke-static {v0, v1, v2, p1}, Lmu/e;->k(Lmu/e;JLmu/m;)Lmu/m;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    move v2, p2

    goto :goto_3

    :cond_4
    move-object v1, p1

    goto :goto_2

    :goto_3
    invoke-static/range {v0 .. v5}, Lmu/e;->M(Lmu/e;Lmu/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lmu/f;->r()Lqu/e0;

    move-result-object p2

    if-ne p1, p2, :cond_5

    invoke-static {v0, p0, v1, v2}, Lmu/e;->B(Lmu/e;Lku/k3;Lmu/m;I)V

    goto :goto_6

    :cond_5
    invoke-static {}, Lmu/f;->h()Lqu/e0;

    move-result-object p2

    if-ne p1, p2, :cond_7

    invoke-virtual {v0}, Lmu/e;->s0()J

    move-result-wide p1

    cmp-long p1, v3, p1

    if-gez p1, :cond_6

    invoke-virtual {v1}, Lqu/c;->c()V

    :cond_6
    move-object p1, v1

    goto :goto_1

    :cond_7
    invoke-static {}, Lmu/f;->s()Lqu/e0;

    move-result-object p2

    if-eq p1, p2, :cond_8

    invoke-virtual {v1}, Lqu/c;->c()V

    invoke-static {p0, p1}, Lmu/e$a;->d(Lmu/e$a;Ljava/lang/Object;)V

    invoke-static {p0, p4}, Lmu/e$a;->c(Lmu/e$a;Lku/p;)V

    invoke-static {p3}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object p3, v0, Lmu/e;->b:Lkotlin/jvm/functions/Function1;

    if-eqz p3, :cond_a

    :goto_4
    invoke-static {v0, p3, p1}, Lmu/e;->g(Lmu/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lzt/n;

    move-result-object p4

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-virtual {v1}, Lqu/c;->c()V

    invoke-static {p0, p1}, Lmu/e$a;->d(Lmu/e$a;Ljava/lang/Object;)V

    invoke-static {p0, p4}, Lmu/e$a;->c(Lmu/e$a;Lku/p;)V

    invoke-static {p3}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object p3, v0, Lmu/e;->b:Lkotlin/jvm/functions/Function1;

    if-eqz p3, :cond_a

    goto :goto_4

    :cond_a
    :goto_5
    invoke-virtual {v6, p2, p4}, Lku/p;->k(Ljava/lang/Object;Lzt/n;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    invoke-virtual {v6}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_b

    invoke-static {p5}, Lpt/h;->c(Lnt/b;)V

    :cond_b
    return-object p1

    :catchall_1
    move-exception v0

    move-object v5, p0

    goto/16 :goto_0

    :goto_7
    invoke-virtual {v6}, Lku/p;->Q()V

    throw p1
.end method

.method public final g()Z
    .locals 1

    invoke-static {}, Lmu/f;->z()Lqu/e0;

    move-result-object v0

    iput-object v0, p0, Lmu/e$a;->a:Ljava/lang/Object;

    iget-object v0, p0, Lmu/e$a;->c:Lmu/e;

    invoke-virtual {v0}, Lmu/e;->i0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lqu/d0;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lmu/e$a;->b:Lku/p;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lmu/e$a;->b:Lku/p;

    invoke-static {}, Lmu/f;->z()Lqu/e0;

    move-result-object v1

    iput-object v1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lmu/e$a;->c:Lmu/e;

    invoke-virtual {v1}, Lmu/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    iget-object v0, p0, Lmu/e$a;->b:Lku/p;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lmu/e$a;->b:Lku/p;

    iput-object p1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lmu/e$a;->c:Lmu/e;

    iget-object v4, v3, Lmu/e;->b:Lkotlin/jvm/functions/Function1;

    if-eqz v4, :cond_0

    invoke-static {v3, v4, p1}, Lmu/e;->g(Lmu/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lzt/n;

    move-result-object v1

    :cond_0
    invoke-static {v0, v2, v1}, Lmu/f;->u(Lku/n;Ljava/lang/Object;Lzt/n;)Z

    move-result p1

    return p1
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, Lmu/e$a;->b:Lku/p;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lmu/e$a;->b:Lku/p;

    invoke-static {}, Lmu/f;->z()Lqu/e0;

    move-result-object v1

    iput-object v1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lmu/e$a;->c:Lmu/e;

    invoke-virtual {v1}, Lmu/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lmu/e$a;->a:Ljava/lang/Object;

    invoke-static {}, Lmu/f;->m()Lqu/e0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lmu/f;->m()Lqu/e0;

    move-result-object v1

    iput-object v1, p0, Lmu/e$a;->a:Ljava/lang/Object;

    invoke-static {}, Lmu/f;->z()Lqu/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lmu/e$a;->c:Lmu/e;

    invoke-static {v0}, Lmu/e;->m(Lmu/e;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lqu/d0;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
