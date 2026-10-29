.class public final Ldf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# static fields
.field public static final f:Lue/b$b;

.field public static final g:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[B

.field public final b:[B

.field public final c:[B

.field public final d:Ljavax/crypto/spec/SecretKeySpec;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    sput-object v0, Ldf/b;->f:Lue/b$b;

    new-instance v0, Ldf/b$a;

    invoke-direct {v0}, Ldf/b$a;-><init>()V

    sput-object v0, Ldf/b;->g:Ljava/lang/ThreadLocal;

    new-instance v0, Ldf/b$b;

    invoke-direct {v0}, Ldf/b$b;-><init>()V

    sput-object v0, Ldf/b;->h:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>([BI[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ldf/b;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0xc

    const/16 v1, 0x10

    if-eq p2, v0, :cond_1

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "IV size should be either 12 or 16 bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p2, p0, Ldf/b;->e:I

    array-length p2, p1

    invoke-static {p2}, Ldf/a0;->a(I)V

    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {p2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object p2, p0, Ldf/b;->d:Ljavax/crypto/spec/SecretKeySpec;

    sget-object p1, Ldf/b;->g:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/crypto/Cipher;

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    new-array p2, v1, [B

    invoke-virtual {p1, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    invoke-static {p1}, Ldf/b;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Ldf/b;->a:[B

    invoke-static {p1}, Ldf/b;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Ldf/b;->b:[B

    iput-object p3, p0, Ldf/b;->c:[B

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-EAX in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lqe/l;)Lpe/a;
    .locals 3

    sget-object v0, Ldf/b;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqe/l;->e()Lqe/p;

    move-result-object v0

    invoke-virtual {v0}, Lqe/p;->e()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    new-instance v0, Ldf/b;

    invoke-virtual {p0}, Lqe/l;->c()Lef/c;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Lqe/l;->e()Lqe/p;

    move-result-object v2

    invoke-virtual {v2}, Lqe/p;->c()I

    move-result v2

    invoke-virtual {p0}, Lqe/l;->d()Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ldf/b;-><init>([BI[B)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AesEaxJce only supports 16 byte tag size, not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqe/l;->e()Lqe/p;

    move-result-object p0

    invoke-virtual {p0}, Lqe/p;->e()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-EAX in FIPS-mode."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d([B)[B
    .locals 6

    const/16 v0, 0x10

    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0xf

    if-ge v2, v3, :cond_0

    aget-byte v3, p0, v2

    shl-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v2, 0x1

    aget-byte v5, p0, v4

    and-int/lit16 v5, v5, 0xff

    ushr-int/lit8 v5, v5, 0x7

    xor-int/2addr v3, v5

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    move v2, v4

    goto :goto_0

    :cond_0
    aget-byte v2, p0, v3

    shl-int/lit8 v2, v2, 0x1

    aget-byte p0, p0, v1

    shr-int/lit8 p0, p0, 0x7

    and-int/lit16 p0, p0, 0x87

    xor-int/2addr p0, v2

    int-to-byte p0, p0

    aput-byte p0, v0, v3

    return-object v0
.end method

.method public static g([B[B)V
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-byte v2, p0, v1

    aget-byte v3, p1, v1

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 14

    move-object v6, p1

    array-length v1, v6

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v3, v2

    const v4, 0x7fffffff

    sub-int/2addr v4, v3

    iget v3, p0, Ldf/b;->e:I

    sub-int/2addr v4, v3

    const/16 v7, 0x10

    sub-int/2addr v4, v7

    if-gt v1, v4, :cond_2

    array-length v1, v2

    add-int/2addr v1, v3

    array-length v3, v6

    add-int/2addr v1, v3

    add-int/2addr v1, v7

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v8

    iget v1, p0, Ldf/b;->e:I

    invoke-static {v1}, Ldf/u;->a(I)[B

    move-result-object v3

    iget-object v1, p0, Ldf/b;->c:[B

    array-length v1, v1

    iget v2, p0, Ldf/b;->e:I

    const/4 v9, 0x0

    invoke-static {v3, v9, v8, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget-object v1, Ldf/b;->g:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Cipher;

    iget-object v2, p0, Ldf/b;->d:Ljavax/crypto/spec/SecretKeySpec;

    const/4 v10, 0x1

    invoke-virtual {v1, v10, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/4 v4, 0x0

    array-length v5, v3

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v11

    if-nez p2, :cond_0

    new-array v0, v9, [B

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    :goto_0
    const/4 v4, 0x0

    array-length v5, v3

    const/4 v2, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v12

    move-object v13, v1

    sget-object v0, Ldf/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    iget-object v1, p0, Ldf/b;->d:Ljavax/crypto/spec/SecretKeySpec;

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, v11}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v10, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    array-length v3, v6

    iget-object v1, p0, Ldf/b;->c:[B

    array-length v1, v1

    iget v2, p0, Ldf/b;->e:I

    add-int v5, v1, v2

    const/4 v2, 0x0

    move-object v1, v6

    move-object v4, v8

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-object v3, v4

    iget-object v0, p0, Ldf/b;->c:[B

    array-length v0, v0

    iget v1, p0, Ldf/b;->e:I

    add-int v4, v0, v1

    array-length v5, v6

    const/4 v2, 0x2

    move-object v0, p0

    move-object v1, v13

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v1

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v2, v2

    array-length v4, v6

    add-int/2addr v2, v4

    iget v4, p0, Ldf/b;->e:I

    add-int/2addr v2, v4

    :goto_1
    if-ge v9, v7, :cond_1

    add-int v4, v2, v9

    aget-byte v5, v12, v9

    aget-byte v6, v11, v9

    xor-int/2addr v5, v6

    aget-byte v6, v1, v9

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    return-object v3

    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "plaintext too long"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b([B[B)[B
    .locals 13

    array-length v1, p1

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v4, v2

    sub-int/2addr v1, v4

    iget v4, p0, Ldf/b;->e:I

    sub-int/2addr v1, v4

    const/16 v6, 0x10

    add-int/lit8 v7, v1, -0x10

    if-ltz v7, :cond_4

    invoke-static {v2, p1}, Lwe/s0;->e([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ldf/b;->g:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Cipher;

    iget-object v2, p0, Ldf/b;->d:Ljavax/crypto/spec/SecretKeySpec;

    const/4 v8, 0x1

    invoke-virtual {v1, v8, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v4, v2

    iget v5, p0, Ldf/b;->e:I

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v9

    const/4 v10, 0x0

    if-nez p2, :cond_0

    new-array v0, v10, [B

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    const/4 v4, 0x0

    array-length v5, v3

    const/4 v2, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v11

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v2, v2

    iget v3, p0, Ldf/b;->e:I

    add-int v4, v2, v3

    const/4 v2, 0x2

    move-object v3, p1

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Ldf/b;->e(Ljavax/crypto/Cipher;I[BII)[B

    move-result-object v1

    array-length v2, p1

    sub-int/2addr v2, v6

    move v4, v10

    :goto_1
    if-ge v10, v6, :cond_1

    add-int v7, v2, v10

    aget-byte v7, p1, v7

    aget-byte v12, v11, v10

    xor-int/2addr v7, v12

    aget-byte v12, v9, v10

    xor-int/2addr v7, v12

    aget-byte v12, v1, v10

    xor-int/2addr v7, v12

    or-int/2addr v4, v7

    int-to-byte v4, v4

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    sget-object v1, Ldf/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Cipher;

    iget-object v2, p0, Ldf/b;->d:Ljavax/crypto/spec/SecretKeySpec;

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v9}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v1, v8, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    iget-object v2, p0, Ldf/b;->c:[B

    array-length v2, v2

    iget v4, p0, Ldf/b;->e:I

    add-int/2addr v2, v4

    invoke-virtual {v1, p1, v2, v5}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v1, Ljavax/crypto/AEADBadTagException;

    const-string v2, "tag mismatch"

    invoke-direct {v1, v2}, Ljavax/crypto/AEADBadTagException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "ciphertext too short"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final e(Ljavax/crypto/Cipher;I[BII)[B
    .locals 8

    const/16 v0, 0x10

    new-array v1, v0, [B

    const/16 v2, 0xf

    int-to-byte p2, p2

    aput-byte p2, v1, v2

    if-nez p5, :cond_0

    iget-object p2, p0, Ldf/b;->a:[B

    invoke-static {v1, p2}, Ldf/b;->g([B[B)V

    invoke-virtual {p1, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-array p2, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0, p2}, Ljavax/crypto/Cipher;->doFinal([BII[B)I

    move-object v3, v1

    move-object v1, p2

    move-object p2, v3

    move v3, v2

    :goto_0
    sub-int v4, p5, v3

    if-le v4, v0, :cond_2

    move v4, v2

    :goto_1
    if-ge v4, v0, :cond_1

    aget-byte v5, v1, v4

    add-int v6, p4, v3

    add-int/2addr v6, v4

    aget-byte v6, p3, v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1, v2, v0, p2}, Ljavax/crypto/Cipher;->doFinal([BII[B)I

    add-int/lit8 v3, v3, 0x10

    move-object v7, v1

    move-object v1, p2

    move-object p2, v7

    goto :goto_0

    :cond_2
    add-int/2addr v3, p4

    add-int/2addr p4, p5

    invoke-virtual {p0, p3, v3, p4}, Ldf/b;->f([BII)[B

    move-result-object p3

    invoke-static {v1, p3}, Ldf/b;->g([B[B)V

    invoke-virtual {p1, v1, v2, v0, p2}, Ljavax/crypto/Cipher;->doFinal([BII[B)I

    return-object p2
.end method

.method public final f([BII)[B
    .locals 2

    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    array-length p2, p1

    const/16 p3, 0x10

    if-ne p2, p3, :cond_0

    iget-object p2, p0, Ldf/b;->a:[B

    invoke-static {p1, p2}, Ldf/b;->g([B[B)V

    return-object p1

    :cond_0
    iget-object p2, p0, Ldf/b;->b:[B

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_1

    aget-byte v0, p2, p3

    aget-byte v1, p1, p3

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    array-length p3, p1

    array-length p1, p1

    aget-byte p1, p2, p1

    xor-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    aput-byte p1, p2, p3

    return-object p2
.end method
