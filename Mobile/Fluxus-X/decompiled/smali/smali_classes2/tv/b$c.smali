.class public final Ltv/b$c;
.super Ltv/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Ltv/b$c;",
        "Ltv/b$a;",
        "Ltv/b;",
        "Lmv/z;",
        "url",
        "<init>",
        "(Ltv/b;Lmv/z;)V",
        "Lew/e;",
        "sink",
        "",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "",
        "close",
        "()V",
        "d",
        "e",
        "J",
        "bytesRemainingInChunk",
        "",
        "f",
        "Z",
        "hasMoreChunks",
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


# instance fields
.field public e:J

.field public f:Z

.field public final synthetic g:Ltv/b;


# direct methods
.method public constructor <init>(Ltv/b;Lmv/z;)V
    .locals 1
    .param p1    # Ltv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/z;",
            ")V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltv/b$c;->g:Ltv/b;

    invoke-direct {p0, p1, p2}, Ltv/b$a;-><init>(Ltv/b;Lmv/z;)V

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ltv/b$c;->e:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltv/b$c;->f:Z

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    invoke-virtual {p0}, Ltv/b$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ltv/b$c;->f:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lnv/q;->i(Lew/l0;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ltv/b$c;->g:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->i()Lsv/d$a;

    move-result-object v0

    invoke-interface {v0}, Lsv/d$a;->d()V

    invoke-static {}, Ltv/b;->o()Lmv/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltv/b$a;->b(Lmv/y;)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ltv/b$a;->c(Z)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-wide v0, p0, Ltv/b$c;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltv/b$c;->g:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->a()Lew/g;

    move-result-object v0

    invoke-interface {v0}, Lew/g;->b1()Ljava/lang/String;

    :cond_0
    :try_start_0
    iget-object v0, p0, Ltv/b$c;->g:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->a()Lew/g;

    move-result-object v0

    invoke-interface {v0}, Lew/g;->t3()J

    move-result-wide v0

    iput-wide v0, p0, Ltv/b$c;->e:J

    iget-object v0, p0, Ltv/b$c;->g:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->a()Lew/g;

    move-result-object v0

    invoke-interface {v0}, Lew/g;->b1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->n1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Ltv/b$c;->e:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-ltz v1, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    const-string v1, ";"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v1, v2, v5, v6}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v0, p0, Ltv/b$c;->e:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_2

    iput-boolean v2, p0, Ltv/b$c;->f:Z

    iget-object v0, p0, Ltv/b$c;->g:Ltv/b;

    invoke-static {v0}, Ltv/b;->m(Ltv/b;)Ltv/a;

    move-result-object v0

    invoke-virtual {v0}, Ltv/a;->a()Lmv/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltv/b$a;->b(Lmv/y;)V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected chunk size and optional extensions but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Ltv/b$c;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    new-instance v1, Ljava/net/ProtocolException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public f3(Lew/e;J)J
    .locals 7
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_5

    invoke-virtual {p0}, Ltv/b$a;->a()Z

    move-result v2

    if-nez v2, :cond_4

    iget-boolean v2, p0, Ltv/b$c;->f:Z

    const-wide/16 v3, -0x1

    if-nez v2, :cond_0

    return-wide v3

    :cond_0
    iget-wide v5, p0, Ltv/b$c;->e:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    cmp-long v0, v5, v3

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Ltv/b$c;->d()V

    iget-boolean v0, p0, Ltv/b$c;->f:Z

    if-nez v0, :cond_2

    return-wide v3

    :cond_2
    iget-wide v0, p0, Ltv/b$c;->e:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ltv/b$a;->f3(Lew/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-eqz p3, :cond_3

    iget-wide v0, p0, Ltv/b$c;->e:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ltv/b$c;->e:J

    return-wide p1

    :cond_3
    iget-object p1, p0, Ltv/b$c;->g:Ltv/b;

    invoke-virtual {p1}, Ltv/b;->i()Lsv/d$a;

    move-result-object p1

    invoke-interface {p1}, Lsv/d$a;->d()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ltv/b;->o()Lmv/y;

    move-result-object p2

    invoke-virtual {p0, p2}, Ltv/b$a;->b(Lmv/y;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
