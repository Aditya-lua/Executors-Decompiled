.class public final Lff/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# instance fields
.field public final a:Lff/q;

.field public final b:Lre/w;

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(Lff/q;Lre/w;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/l;->a:Lff/q;

    iput-object p2, p0, Lff/l;->b:Lre/w;

    iput p3, p0, Lff/l;->c:I

    iput-object p4, p0, Lff/l;->d:[B

    return-void
.end method

.method public static c(Lse/f;)Lre/a;
    .locals 9

    new-instance v0, Lff/l;

    new-instance v1, Lff/a;

    invoke-virtual {p0}, Lse/f;->c()Lgf/c;

    move-result-object v2

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v2

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v3

    invoke-virtual {v3}, Lse/k;->f()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lff/a;-><init>([BI)V

    new-instance v2, Lff/t;

    new-instance v3, Lff/s;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HMAC"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v6

    invoke-virtual {v6}, Lse/k;->d()Lse/k$c;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p0}, Lse/f;->d()Lgf/c;

    move-result-object v7

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v7

    invoke-direct {v6, v7, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v3, v4, v6}, Lff/s;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v4

    invoke-virtual {v4}, Lse/k;->g()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lff/t;-><init>(Lbf/a;I)V

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v3

    invoke-virtual {v3}, Lse/k;->g()I

    move-result v3

    invoke-virtual {p0}, Lse/f;->e()Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lff/l;-><init>(Lff/q;Lre/w;I[B)V

    return-object v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 6

    iget-object v0, p0, Lff/l;->a:Lff/q;

    invoke-interface {v0, p1}, Lff/q;->a([B)[B

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

    iget-object v1, p0, Lff/l;->b:Lre/w;

    filled-new-array {p2, p1, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Lff/e;->a([[B)[B

    move-result-object p2

    invoke-interface {v1, p2}, Lre/w;->b([B)[B

    move-result-object p2

    iget-object v0, p0, Lff/l;->d:[B

    filled-new-array {v0, p1, p2}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 7

    array-length v0, p1

    iget v1, p0, Lff/l;->c:I

    iget-object v2, p0, Lff/l;->d:[B

    array-length v3, v2

    add-int/2addr v1, v3

    if-lt v0, v1, :cond_2

    invoke-static {v2, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/l;->d:[B

    array-length v0, v0

    array-length v1, p1

    iget v2, p0, Lff/l;->c:I

    sub-int/2addr v1, v2

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    array-length v1, p1

    iget v2, p0, Lff/l;->c:I

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

    iget-object v2, p0, Lff/l;->b:Lre/w;

    filled-new-array {p2, v0, v1}, [[B

    move-result-object p2

    invoke-static {p2}, Lff/e;->a([[B)[B

    move-result-object p2

    invoke-interface {v2, p1, p2}, Lre/w;->a([B[B)V

    iget-object p1, p0, Lff/l;->a:Lff/q;

    invoke-interface {p1, v0}, Lff/q;->b([B)[B

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
