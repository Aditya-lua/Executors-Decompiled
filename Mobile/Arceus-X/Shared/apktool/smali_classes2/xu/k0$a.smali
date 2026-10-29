.class public final Lxu/k0$a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxu/k0;->j3()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "xu/k0$a",
        "Ljava/io/OutputStream;",
        "",
        "b",
        "",
        "write",
        "(I)V",
        "",
        "data",
        "offset",
        "byteCount",
        "([BII)V",
        "flush",
        "()V",
        "close",
        "",
        "toString",
        "()Ljava/lang/String;",
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
.field public final synthetic a:Lxu/k0;


# direct methods
.method public constructor <init>(Lxu/k0;)V
    .locals 0

    iput-object p1, p0, Lxu/k0$a;->a:Lxu/k0;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lxu/k0$a;->a:Lxu/k0;

    invoke-virtual {v0}, Lxu/k0;->close()V

    return-void
.end method

.method public flush()V
    .locals 2

    iget-object v0, p0, Lxu/k0$a;->a:Lxu/k0;

    iget-boolean v1, v0, Lxu/k0;->c:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lxu/k0;->flush()V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lxu/k0$a;->a:Lxu/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxu/k0$a;->a:Lxu/k0;

    iget-boolean v1, v0, Lxu/k0;->c:Z

    if-nez v1, :cond_0

    .line 2
    iget-object v0, v0, Lxu/k0;->b:Lxu/e;

    int-to-byte p1, p1

    .line 3
    invoke-virtual {v0, p1}, Lxu/e;->i0(I)Lxu/e;

    .line 4
    iget-object p1, p0, Lxu/k0$a;->a:Lxu/k0;

    invoke-virtual {p1}, Lxu/k0;->j0()Lxu/f;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lxu/k0$a;->a:Lxu/k0;

    iget-boolean v1, v0, Lxu/k0;->c:Z

    if-nez v1, :cond_0

    .line 7
    iget-object v0, v0, Lxu/k0;->b:Lxu/e;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lxu/e;->f0([BII)Lxu/e;

    .line 9
    iget-object p1, p0, Lxu/k0$a;->a:Lxu/k0;

    invoke-virtual {p1}, Lxu/k0;->j0()Lxu/f;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
