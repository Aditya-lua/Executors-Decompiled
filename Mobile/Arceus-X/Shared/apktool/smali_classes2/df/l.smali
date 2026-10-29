.class public final Ldf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# instance fields
.field public final a:Ldf/q;

.field public final b:Lpe/w;

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(Ldf/q;Lpe/w;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/l;->a:Ldf/q;

    iput-object p2, p0, Ldf/l;->b:Lpe/w;

    iput p3, p0, Ldf/l;->c:I

    iput-object p4, p0, Ldf/l;->d:[B

    return-void
.end method

.method public static c(Lqe/f;)Lpe/a;
    .locals 9

    new-instance v0, Ldf/l;

    new-instance v1, Ldf/a;

    invoke-virtual {p0}, Lqe/f;->c()Lef/c;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v2

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v3

    invoke-virtual {v3}, Lqe/k;->f()I

    move-result v3

    invoke-direct {v1, v2, v3}, Ldf/a;-><init>([BI)V

    new-instance v2, Ldf/t;

    new-instance v3, Ldf/s;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HMAC"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v6

    invoke-virtual {v6}, Lqe/k;->d()Lqe/k$c;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p0}, Lqe/f;->d()Lef/c;

    move-result-object v7

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v7

    invoke-direct {v6, v7, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v3, v4, v6}, Ldf/s;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v4

    invoke-virtual {v4}, Lqe/k;->g()I

    move-result v4

    invoke-direct {v2, v3, v4}, Ldf/t;-><init>(Lze/a;I)V

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v3

    invoke-virtual {v3}, Lqe/k;->g()I

    move-result v3

    invoke-virtual {p0}, Lqe/f;->e()Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Ldf/l;-><init>(Ldf/q;Lpe/w;I[B)V

    return-object v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 6

    iget-object v0, p0, Ldf/l;->a:Ldf/q;

    invoke-interface {v0, p1}, Ldf/q;->a([B)[B

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    new-array p2, p2, [B

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    array-length v2, p2

    int-to-long v2, v2

    const-wide/16 v4, 0x8

    mul-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Ldf/l;->b:Lpe/w;

    filled-new-array {p2, p1, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Ldf/e;->a([[B)[B

    move-result-object p2

    invoke-interface {v1, p2}, Lpe/w;->b([B)[B

    move-result-object p2

    iget-object v0, p0, Ldf/l;->d:[B

    filled-new-array {v0, p1, p2}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 7

    array-length v0, p1

    iget v1, p0, Ldf/l;->c:I

    iget-object v2, p0, Ldf/l;->d:[B

    array-length v3, v2

    add-int/2addr v1, v3

    if-lt v0, v1, :cond_2

    invoke-static {v2, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldf/l;->d:[B

    array-length v0, v0

    array-length v1, p1

    iget v2, p0, Ldf/l;->c:I

    sub-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    array-length v1, p1

    iget v2, p0, Ldf/l;->c:I

    sub-int/2addr v1, v2

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    new-array p2, p2, [B

    :cond_0
    const/16 v1, 0x8

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v3, p2

    int-to-long v3, v3

    const-wide/16 v5, 0x8

    mul-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iget-object v2, p0, Ldf/l;->b:Lpe/w;

    filled-new-array {p2, v0, v1}, [[B

    move-result-object p2

    invoke-static {p2}, Ldf/e;->a([[B)[B

    move-result-object p2

    invoke-interface {v2, p1, p2}, Lpe/w;->a([B[B)V

    iget-object p1, p0, Ldf/l;->a:Ldf/q;

    invoke-interface {p1, v0}, Ldf/q;->b([B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (ciphertext too short)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
