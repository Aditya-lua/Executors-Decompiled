.class public final Lre/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# static fields
.field public static final c:Lue/b$b;


# instance fields
.field public final a:[B

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    sput-object v0, Lre/r0;->c:Lue/b$b;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lre/r0;->c:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lre/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lre/r0;->a:[B

    iput-object p2, p0, Lre/r0;->b:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "The key length in bytes must be 32."

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "JCE does not support algorithm: ChaCha20-Poly1305"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ChaCha20Poly1305 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lqe/p1;)Lpe/a;
    .locals 3

    new-instance v0, Lre/r0;

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

    invoke-direct {v0, v1, p0}, Lre/r0;-><init>([B[B)V

    return-object v0
.end method

.method public static d([B)[B
    .locals 4

    const/16 v0, 0xc

    new-array v0, v0, [B

    const/4 v1, 0x4

    const/16 v2, 0x8

    const/16 v3, 0x10

    invoke-static {p0, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static e()Z
    .locals 1

    invoke-static {}, Lre/v;->e()Ljavax/crypto/Cipher;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 11

    if-eqz p1, :cond_3

    const/16 v0, 0x18

    invoke-static {v0}, Ldf/u;->a(I)[B

    move-result-object v1

    iget-object v2, p0, Lre/r0;->a:[B

    invoke-static {v2, v1}, Lre/b0;->a([B[B)[B

    move-result-object v2

    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v4, "ChaCha20"

    invoke-direct {v3, v2, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-static {v1}, Lre/r0;->d([B)[B

    move-result-object v4

    invoke-direct {v2, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-static {}, Lre/v;->e()Ljavax/crypto/Cipher;

    move-result-object v5

    const/4 v4, 0x1

    invoke-virtual {v5, v4, v3, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v2, p2

    if-eqz v2, :cond_0

    invoke-virtual {v5, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, p1

    invoke-virtual {v5, p2}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result p2

    iget-object v2, p0, Lre/r0;->b:[B

    array-length v3, v2

    const v4, 0x7fffffe7

    sub-int/2addr v4, v3

    if-gt p2, v4, :cond_2

    array-length v3, v2

    add-int/2addr v3, v0

    add-int/2addr v3, p2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    iget-object v2, p0, Lre/r0;->b:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v9, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, p1

    iget-object v1, p0, Lre/r0;->b:[B

    array-length v1, v1

    add-int/lit8 v10, v1, 0x18

    const/4 v7, 0x0

    move-object v6, p1

    invoke-virtual/range {v5 .. v10}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    if-ne p1, p2, :cond_1

    return-object v9

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "not enough data written"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "plaintext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B[B)[B
    .locals 5

    if-eqz p1, :cond_3

    array-length v0, p1

    iget-object v1, p0, Lre/r0;->b:[B

    array-length v2, v1

    add-int/lit8 v2, v2, 0x28

    if-lt v0, v2, :cond_2

    invoke-static {v1, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x18

    new-array v1, v0, [B

    iget-object v2, p0, Lre/r0;->b:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lre/r0;->a:[B

    invoke-static {v2, v1}, Lre/b0;->a([B[B)[B

    move-result-object v2

    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v4, "ChaCha20"

    invoke-direct {v3, v2, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-static {v1}, Lre/r0;->d([B)[B

    move-result-object v1

    invoke-direct {v2, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-static {}, Lre/v;->e()Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v4, 0x2

    invoke-virtual {v1, v4, v3, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v2, p2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    iget-object p2, p0, Lre/r0;->b:[B

    array-length v2, p2

    add-int/2addr v2, v0

    array-length v3, p1

    array-length p2, p2

    sub-int/2addr v3, p2

    sub-int/2addr v3, v0

    invoke-virtual {v1, p1, v2, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ciphertext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
