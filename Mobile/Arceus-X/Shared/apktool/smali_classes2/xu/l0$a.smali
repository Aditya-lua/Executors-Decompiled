.class public final Lxu/l0$a;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxu/l0;->s3()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0004J\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "xu/l0$a",
        "Ljava/io/InputStream;",
        "",
        "read",
        "()I",
        "",
        "data",
        "offset",
        "byteCount",
        "([BII)I",
        "available",
        "",
        "close",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ljava/io/OutputStream;",
        "out",
        "",
        "transferTo",
        "(Ljava/io/OutputStream;)J",
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
.field public final synthetic a:Lxu/l0;


# direct methods
.method public constructor <init>(Lxu/l0;)V
    .locals 0

    iput-object p1, p0, Lxu/l0$a;->a:Lxu/l0;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public available()I
    .locals 4

    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-boolean v1, v0, Lxu/l0;->c:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v0

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    invoke-virtual {v0}, Lxu/l0;->close()V

    return-void
.end method

.method public read()I
    .locals 4

    .line 1
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-boolean v1, v0, Lxu/l0;->c:Z

    if-nez v1, :cond_1

    .line 2
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    .line 3
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v1, v0, Lxu/l0;->a:Lxu/r0;

    .line 5
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x2000

    .line 6
    invoke-interface {v1, v0, v2, v3}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    .line 8
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    .line 9
    invoke-virtual {v0}, Lxu/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 10
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public read([BII)I
    .locals 7

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-boolean v0, v0, Lxu/l0;->c:Z

    if-nez v0, :cond_1

    .line 12
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    .line 13
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    .line 14
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    .line 15
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 16
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v1, v0, Lxu/l0;->a:Lxu/r0;

    .line 17
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x2000

    .line 18
    invoke-interface {v1, v0, v2, v3}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 19
    :cond_0
    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    .line 20
    iget-object v0, v0, Lxu/l0;->b:Lxu/e;

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lxu/e;->read([BII)I

    move-result p1

    return p1

    .line 22
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lxu/l0$a;->a:Lxu/l0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transferTo(Ljava/io/OutputStream;)J
    .locals 11

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-boolean v0, v0, Lxu/l0;->c:Z

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :goto_0
    iget-object v4, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v4, v4, Lxu/l0;->b:Lxu/e;

    invoke-virtual {v4}, Lxu/e;->size()J

    move-result-wide v4

    cmp-long v4, v4, v0

    if-nez v4, :cond_1

    iget-object v4, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v5, v4, Lxu/l0;->a:Lxu/r0;

    iget-object v4, v4, Lxu/l0;->b:Lxu/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v5, v4, v6, v7}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    return-wide v2

    :cond_1
    :goto_1
    iget-object v4, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v4, v4, Lxu/l0;->b:Lxu/e;

    invoke-virtual {v4}, Lxu/e;->size()J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-object v4, p0, Lxu/l0$a;->a:Lxu/l0;

    iget-object v5, v4, Lxu/l0;->b:Lxu/e;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object v6, p1

    invoke-static/range {v5 .. v10}, Lxu/e;->F0(Lxu/e;Ljava/io/OutputStream;JILjava/lang/Object;)Lxu/e;

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
