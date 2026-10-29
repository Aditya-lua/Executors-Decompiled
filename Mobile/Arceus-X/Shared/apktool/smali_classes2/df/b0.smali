.class public final Ldf/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# instance fields
.field public final a:Lre/i0;

.field public final b:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lre/i0;

    invoke-direct {v0, p1}, Lre/i0;-><init>([B)V

    iput-object v0, p0, Ldf/b0;->a:Lre/i0;

    iput-object p2, p0, Ldf/b0;->b:[B

    return-void
.end method

.method public static c(Lqe/p1;)Lpe/a;
    .locals 3

    new-instance v0, Ldf/b0;

    invoke-virtual {p0}, Lqe/p1;->c()Lef/c;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Lqe/p1;->d()Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ldf/b0;-><init>([B[B)V

    return-object v0
.end method

.method private d([B[B)[B
    .locals 3

    array-length v0, p1

    const/16 v1, 0x28

    if-lt v0, v1, :cond_0

    const/16 v0, 0x18

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v2, p1

    sub-int/2addr v2, v0

    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Ldf/b0;->a:Lre/i0;

    invoke-virtual {v0, p1, v1, p2}, Lre/i0;->a(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e([B[B)[B
    .locals 3

    array-length v0, p1

    add-int/lit8 v0, v0, 0x28

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x18

    invoke-static {v1}, Ldf/u;->a(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Ldf/b0;->a:Lre/i0;

    invoke-virtual {v2, v0, v1, p1, p2}, Lre/i0;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 1

    invoke-direct {p0, p1, p2}, Ldf/b0;->e([B[B)[B

    move-result-object p1

    iget-object p2, p0, Ldf/b0;->b:[B

    array-length v0, p2

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    filled-new-array {p2, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 2

    iget-object v0, p0, Ldf/b0;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Ldf/b0;->d([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldf/b0;->b:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ldf/b0;->d([B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
