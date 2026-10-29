.class public final Lo6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo6/e;->a(Ljava/nio/ByteBuffer;)Lxu/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "o6/e$a",
        "Lxu/r0;",
        "",
        "close",
        "()V",
        "Lxu/e;",
        "sink",
        "",
        "byteCount",
        "read",
        "(Lxu/e;J)J",
        "Lxu/s0;",
        "timeout",
        "()Lxu/s0;",
        "Ljava/nio/ByteBuffer;",
        "kotlin.jvm.PlatformType",
        "a",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "",
        "b",
        "I",
        "len",
        "coil-core_release"
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
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lo6/e$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    iput p1, p0, Lo6/e$a;->b:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public read(Lxu/e;J)J
    .locals 2

    iget-object v0, p0, Lo6/e$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget v1, p0, Lo6/e$a;->b:I

    if-ne v0, v1, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    iget-object v0, p0, Lo6/e$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, p2

    long-to-int p2, v0

    iget p3, p0, Lo6/e$a;->b:I

    invoke-static {p2, p3}, Lkotlin/ranges/d;->f(II)I

    move-result p2

    iget-object p3, p0, Lo6/e$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object p2, p0, Lo6/e$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2}, Lxu/e;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method

.method public timeout()Lxu/s0;
    .locals 1

    sget-object v0, Lxu/s0;->NONE:Lxu/s0;

    return-object v0
.end method
