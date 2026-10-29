.class public final Lre/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# instance fields
.field public final a:[B

.field public final b:I

.field public final c:Lze/a;


# direct methods
.method public constructor <init>([BLef/a;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldf/r;

    invoke-direct {v0, p1}, Ldf/r;-><init>([B)V

    iput-object v0, p0, Lre/l0;->c:Lze/a;

    invoke-virtual {p2}, Lef/a;->d()[B

    move-result-object p1

    iput-object p1, p0, Lre/l0;->a:[B

    iput p3, p0, Lre/l0;->b:I

    return-void
.end method

.method public static c(Lqe/k1;)Lpe/a;
    .locals 3

    invoke-virtual {p0}, Lqe/k1;->f()Lqe/o1;

    move-result-object v0

    invoke-virtual {v0}, Lqe/o1;->c()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lqe/k1;->f()Lqe/o1;

    move-result-object v0

    invoke-virtual {v0}, Lqe/o1;->c()I

    move-result v0

    const/16 v1, 0xc

    if-gt v0, v1, :cond_0

    new-instance v0, Lre/l0;

    invoke-virtual {p0}, Lqe/k1;->c()Lef/c;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Lqe/k1;->d()Lef/a;

    move-result-object v2

    invoke-virtual {p0}, Lqe/k1;->f()Lqe/o1;

    move-result-object p0

    invoke-virtual {p0}, Lqe/o1;->c()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lre/l0;-><init>([BLef/a;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid salt size"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 5

    if-eqz p1, :cond_0

    iget v0, p0, Lre/l0;->b:I

    add-int/lit8 v0, v0, 0xc

    invoke-static {v0}, Ldf/u;->a(I)[B

    move-result-object v0

    iget v1, p0, Lre/l0;->b:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iget v2, p0, Lre/l0;->b:I

    add-int/lit8 v3, v2, 0xc

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    new-instance v3, Lre/c0;

    invoke-virtual {p0, v1}, Lre/l0;->d([B)[B

    move-result-object v1

    invoke-direct {v3, v1}, Lre/c0;-><init>([B)V

    iget-object v1, p0, Lre/l0;->a:[B

    array-length v1, v1

    iget v4, p0, Lre/l0;->b:I

    add-int/2addr v1, v4

    array-length v4, v2

    add-int/2addr v1, v4

    invoke-virtual {v3, v2, p1, v1, p2}, Lre/c0;->b([B[BI[B)[B

    move-result-object p1

    iget-object p2, p0, Lre/l0;->a:[B

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p2, p0, Lre/l0;->a:[B

    array-length p2, p2

    array-length v1, v0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "plaintext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B[B)[B
    .locals 4

    if-eqz p1, :cond_2

    array-length v0, p1

    iget-object v1, p0, Lre/l0;->a:[B

    array-length v2, v1

    iget v3, p0, Lre/l0;->b:I

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x1c

    if-lt v0, v2, :cond_1

    invoke-static {v1, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lre/l0;->a:[B

    array-length v0, v0

    iget v1, p0, Lre/l0;->b:I

    add-int/2addr v0, v1

    new-instance v1, Lre/c0;

    iget-object v2, p0, Lre/l0;->a:[B

    array-length v2, v2

    invoke-static {p1, v2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-virtual {p0, v2}, Lre/l0;->d([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Lre/c0;-><init>([B)V

    add-int/lit8 v2, v0, 0xc

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    invoke-virtual {v1, v0, p1, v2, p2}, Lre/c0;->a([B[BI[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ciphertext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d([B)[B
    .locals 6

    const/16 v0, 0x10

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    array-length v3, p1

    const/16 v4, 0xc

    if-gt v3, v4, :cond_0

    array-length v3, p1

    const/16 v4, 0x8

    if-lt v3, v4, :cond_0

    array-length v3, p1

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-static {p1, v4, v1, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, p1

    invoke-static {p1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 p1, 0x20

    new-array p1, p1, [B

    iget-object v3, p0, Lre/l0;->c:Lze/a;

    invoke-interface {v3, v1, v0}, Lze/a;->a([BI)[B

    move-result-object v1

    invoke-static {v1, v4, p1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lre/l0;->c:Lze/a;

    invoke-interface {v1, v2, v0}, Lze/a;->a([BI)[B

    move-result-object v1

    invoke-static {v1, v4, p1, v0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid salt size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x58t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x2t
        0x58t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method
