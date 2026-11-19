.class public final Lpv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpv/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpv/a;",
        "Lmv/a0;",
        "Lmv/c;",
        "cache",
        "<init>",
        "(Lmv/c;)V",
        "Lmv/a0$a;",
        "chain",
        "Lmv/h0;",
        "intercept",
        "(Lmv/a0$a;)Lmv/h0;",
        "Lpv/c;",
        "cacheRequest",
        "response",
        "a",
        "(Lpv/c;Lmv/h0;)Lmv/h0;",
        "Lmv/c;",
        "getCache$okhttp",
        "()Lmv/c;",
        "b",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lpv/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lmv/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpv/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpv/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpv/a;->b:Lpv/a$a;

    return-void
.end method

.method public constructor <init>(Lmv/c;)V
    .locals 0
    .param p1    # Lmv/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpv/a;->a:Lmv/c;

    return-void
.end method


# virtual methods
.method public final a(Lpv/c;Lmv/h0;)Lmv/h0;
    .locals 4

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-interface {p1}, Lpv/c;->b()Lew/j0;

    move-result-object v0

    invoke-virtual {p2}, Lmv/h0;->b()Lmv/i0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/i0;->l3()Lew/g;

    move-result-object v1

    invoke-static {v0}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v0

    new-instance v2, Lpv/a$b;

    invoke-direct {v2, v1, p1, v0}, Lpv/a$b;-><init>(Lew/g;Lpv/c;Lew/f;)V

    const-string p1, "Content-Type"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lmv/h0;->n(Lmv/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/i0;->e()J

    move-result-wide v0

    invoke-virtual {p2}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object p2

    new-instance v3, Lsv/h;

    invoke-static {v2}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object v2

    invoke-direct {v3, p1, v0, v1, v2}, Lsv/h;-><init>(Ljava/lang/String;JLew/g;)V

    invoke-virtual {p2, v3}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    return-object p1
.end method

.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 8
    .param p1    # Lmv/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lmv/a0$a;->call()Lmv/e;

    move-result-object v0

    iget-object v1, p0, Lpv/a;->a:Lmv/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v3

    invoke-static {v3}, Lpv/b;->a(Lmv/f0;)Lmv/f0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmv/c;->b(Lmv/f0;)Lmv/h0;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Lpv/d$b;

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v6

    invoke-direct {v5, v3, v4, v6, v1}, Lpv/d$b;-><init>(JLmv/f0;Lmv/h0;)V

    invoke-virtual {v5}, Lpv/d$b;->b()Lpv/d;

    move-result-object v3

    invoke-virtual {v3}, Lpv/d;->b()Lmv/f0;

    move-result-object v4

    invoke-virtual {v3}, Lpv/d;->a()Lmv/h0;

    move-result-object v5

    iget-object v6, p0, Lpv/a;->a:Lmv/c;

    if-eqz v6, :cond_1

    invoke-virtual {v6, v3}, Lmv/c;->n(Lpv/d;)V

    :cond_1
    instance-of v3, v0, Lrv/m;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Lrv/m;

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lrv/m;->q()Lmv/s;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    sget-object v3, Lmv/s;->NONE:Lmv/s;

    :cond_4
    if-eqz v1, :cond_5

    if-nez v5, :cond_5

    invoke-virtual {v1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v6

    invoke-static {v6}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_5
    if-nez v4, :cond_6

    if-nez v5, :cond_6

    new-instance v1, Lmv/h0$a;

    invoke-direct {v1}, Lmv/h0$a;-><init>()V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p1

    sget-object v1, Lmv/e0;->d:Lmv/e0;

    invoke-virtual {p1, v1}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p1

    const/16 v1, 0x1f8

    invoke-virtual {p1, v1}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p1

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v1}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p1

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Lmv/h0$a;->r(J)Lmv/h0$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lmv/h0$a;->p(J)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lmv/s;->satisfactionFailure(Lmv/e;Lmv/h0;)V

    return-object p1

    :cond_6
    if-nez v4, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object p1

    invoke-static {v5}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lmv/h0$a;->d(Lmv/h0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lmv/s;->cacheHit(Lmv/e;Lmv/h0;)V

    return-object p1

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v3, v0, v5}, Lmv/s;->cacheConditionalHit(Lmv/e;Lmv/h0;)V

    goto :goto_2

    :cond_8
    iget-object v6, p0, Lpv/a;->a:Lmv/c;

    if-eqz v6, :cond_9

    invoke-virtual {v3, v0}, Lmv/s;->cacheMiss(Lmv/e;)V

    :cond_9
    :goto_2
    :try_start_0
    invoke-interface {p1, v4}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_a

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v1

    invoke-static {v1}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_a
    if-eqz v5, :cond_c

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lmv/h0;->f()I

    move-result v1

    const/16 v6, 0x130

    if-ne v1, v6, :cond_b

    invoke-virtual {v5}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v1

    sget-object v2, Lpv/a;->b:Lpv/a$a;

    invoke-virtual {v5}, Lmv/h0;->o()Lmv/y;

    move-result-object v4

    invoke-virtual {p1}, Lmv/h0;->o()Lmv/y;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lpv/a$a;->a(Lpv/a$a;Lmv/y;Lmv/y;)Lmv/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmv/h0$a;->j(Lmv/y;)Lmv/h0$a;

    move-result-object v1

    invoke-virtual {p1}, Lmv/h0;->A()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Lmv/h0$a;->r(J)Lmv/h0$a;

    move-result-object v1

    invoke-virtual {p1}, Lmv/h0;->y()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Lmv/h0$a;->p(J)Lmv/h0$a;

    move-result-object v1

    invoke-static {v5}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmv/h0$a;->d(Lmv/h0;)Lmv/h0$a;

    move-result-object v1

    invoke-static {p1}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmv/h0$a;->m(Lmv/h0;)Lmv/h0$a;

    move-result-object v1

    invoke-virtual {v1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v1

    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/i0;->close()V

    iget-object p1, p0, Lpv/a;->a:Lmv/c;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lmv/c;->m()V

    iget-object p1, p0, Lpv/a;->a:Lmv/c;

    invoke-virtual {p1, v5, v1}, Lmv/c;->o(Lmv/h0;Lmv/h0;)V

    invoke-virtual {v3, v0, v1}, Lmv/s;->cacheHit(Lmv/e;Lmv/h0;)V

    return-object v1

    :cond_b
    invoke-virtual {v5}, Lmv/h0;->b()Lmv/i0;

    move-result-object v1

    invoke-static {v1}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_c
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v1

    if-eqz v5, :cond_d

    invoke-static {v5}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object v2

    :cond_d
    invoke-virtual {v1, v2}, Lmv/h0$a;->d(Lmv/h0;)Lmv/h0$a;

    move-result-object v1

    invoke-static {p1}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmv/h0$a;->m(Lmv/h0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    iget-object v1, p0, Lpv/a;->a:Lmv/c;

    if-eqz v1, :cond_10

    invoke-static {v4}, Lpv/b;->a(Lmv/f0;)Lmv/f0;

    move-result-object v1

    invoke-static {p1}, Lsv/e;->b(Lmv/h0;)Z

    move-result v2

    if-eqz v2, :cond_f

    sget-object v2, Lpv/d;->c:Lpv/d$a;

    invoke-virtual {v2, p1, v1}, Lpv/d$a;->a(Lmv/h0;Lmv/f0;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, p0, Lpv/a;->a:Lmv/c;

    invoke-virtual {p1}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v4

    invoke-virtual {v4, v1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object v1

    invoke-virtual {v1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lmv/c;->f(Lmv/h0;)Lpv/c;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lpv/a;->a(Lpv/c;Lmv/h0;)Lmv/h0;

    move-result-object p1

    if-eqz v5, :cond_e

    invoke-virtual {v3, v0}, Lmv/s;->cacheMiss(Lmv/e;)V

    :cond_e
    return-object p1

    :cond_f
    invoke-virtual {v4}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsv/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    :try_start_1
    iget-object v0, p0, Lpv/a;->a:Lmv/c;

    invoke-virtual {v0, v4}, Lmv/c;->g(Lmv/f0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_10
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_11
    throw p1
.end method
