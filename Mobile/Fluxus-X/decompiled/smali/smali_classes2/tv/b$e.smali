.class public final Ltv/b$e;
.super Ltv/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ltv/b$e;",
        "Ltv/b$a;",
        "Ltv/b;",
        "Lmv/z;",
        "url",
        "",
        "bytesRemaining",
        "<init>",
        "(Ltv/b;Lmv/z;J)V",
        "Lew/e;",
        "sink",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "",
        "close",
        "()V",
        "e",
        "J",
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

.field public final synthetic f:Ltv/b;


# direct methods
.method public constructor <init>(Ltv/b;Lmv/z;J)V
    .locals 1
    .param p1    # Ltv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/z;",
            "J)V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltv/b$e;->f:Ltv/b;

    invoke-direct {p0, p1, p2}, Ltv/b$a;-><init>(Ltv/b;Lmv/z;)V

    iput-wide p3, p0, Ltv/b$e;->e:J

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    sget-object p1, Lmv/y;->c:Lmv/y;

    invoke-virtual {p0, p1}, Ltv/b$a;->b(Lmv/y;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    invoke-virtual {p0}, Ltv/b$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Ltv/b$e;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lnv/q;->i(Lew/l0;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ltv/b$e;->f:Ltv/b;

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

    if-ltz v2, :cond_4

    invoke-virtual {p0}, Ltv/b$a;->a()Z

    move-result v2

    if-nez v2, :cond_3

    iget-wide v2, p0, Ltv/b$e;->e:J

    cmp-long v4, v2, v0

    const-wide/16 v5, -0x1

    if-nez v4, :cond_0

    return-wide v5

    :cond_0
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ltv/b$a;->f3(Lew/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_2

    iget-wide v2, p0, Ltv/b$e;->e:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Ltv/b$e;->e:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_1

    sget-object p3, Lmv/y;->c:Lmv/y;

    invoke-virtual {p0, p3}, Ltv/b$a;->b(Lmv/y;)V

    :cond_1
    return-wide p1

    :cond_2
    iget-object p1, p0, Ltv/b$e;->f:Ltv/b;

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

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
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
