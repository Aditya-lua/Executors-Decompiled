.class public final Lfw/j;
.super Lew/n;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0013\u00a8\u0006\u0018"
    }
    d2 = {
        "Lfw/j;",
        "Lew/n;",
        "Lew/l0;",
        "delegate",
        "",
        "size",
        "",
        "truncate",
        "<init>",
        "(Lew/l0;JZ)V",
        "Lew/e;",
        "sink",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "newSize",
        "",
        "b",
        "(Lew/e;J)V",
        "J",
        "c",
        "Z",
        "d",
        "bytesReceived",
        "okio"
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
.field public final b:J

.field public final c:Z

.field public d:J


# direct methods
.method public constructor <init>(Lew/l0;JZ)V
    .locals 1
    .param p1    # Lew/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lew/n;-><init>(Lew/l0;)V

    iput-wide p2, p0, Lfw/j;->b:J

    iput-boolean p4, p0, Lfw/j;->c:Z

    return-void
.end method


# virtual methods
.method public final b(Lew/e;J)V
    .locals 1

    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-virtual {v0, p1}, Lew/e;->h3(Lew/l0;)J

    invoke-virtual {p1, v0, p2, p3}, Lew/e;->R2(Lew/e;J)V

    invoke-virtual {v0}, Lew/e;->a()V

    return-void
.end method

.method public f3(Lew/e;J)J
    .locals 9
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lfw/j;->d:J

    iget-wide v2, p0, Lfw/j;->b:J

    cmp-long v4, v0, v2

    const-wide/16 v5, -0x1

    const-wide/16 v7, 0x0

    if-lez v4, :cond_0

    move-wide p2, v7

    goto :goto_0

    :cond_0
    iget-boolean v4, p0, Lfw/j;->c:Z

    if-eqz v4, :cond_2

    sub-long/2addr v2, v0

    cmp-long v0, v2, v7

    if-nez v0, :cond_1

    return-wide v5

    :cond_1
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    :cond_2
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lew/n;->f3(Lew/e;J)J

    move-result-wide p2

    cmp-long v0, p2, v5

    if-eqz v0, :cond_3

    iget-wide v1, p0, Lfw/j;->d:J

    add-long/2addr v1, p2

    iput-wide v1, p0, Lfw/j;->d:J

    :cond_3
    iget-wide v1, p0, Lfw/j;->d:J

    iget-wide v3, p0, Lfw/j;->b:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_4

    if-eqz v0, :cond_5

    :cond_4
    cmp-long v0, v1, v3

    if-lez v0, :cond_7

    :cond_5
    cmp-long p2, p2, v7

    if-lez p2, :cond_6

    cmp-long p2, v1, v3

    if-lez p2, :cond_6

    invoke-virtual {p1}, Lew/e;->size()J

    move-result-wide p2

    iget-wide v0, p0, Lfw/j;->d:J

    iget-wide v2, p0, Lfw/j;->b:J

    sub-long/2addr v0, v2

    sub-long/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3}, Lfw/j;->b(Lew/e;J)V

    :cond_6
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lfw/j;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but got "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lfw/j;->d:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-wide p2
.end method
