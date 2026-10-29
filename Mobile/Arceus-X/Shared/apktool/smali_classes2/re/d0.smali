.class public Lre/d0;
.super Lre/e0;
.source "SourceFile"


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lre/e0;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public b([II)[I
    .locals 3

    array-length v0, p1

    invoke-virtual {p0}, Lre/d0;->e()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    new-array v0, v0, [I

    iget-object v1, p0, Lre/e0;->a:[I

    invoke-static {v0, v1}, Lre/b0;->e([I[I)V

    const/16 v1, 0xc

    aput p2, v0, v1

    const/16 p2, 0xd

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x20

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic c([BLjava/nio/ByteBuffer;)[B
    .locals 0

    invoke-super {p0, p1, p2}, Lre/e0;->c([BLjava/nio/ByteBuffer;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/nio/ByteBuffer;[B[B)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lre/e0;->d(Ljava/nio/ByteBuffer;[B[B)V

    return-void
.end method

.method public e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
