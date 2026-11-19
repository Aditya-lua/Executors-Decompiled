.class public final Lff/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# static fields
.field public static final c:Lwe/b$b;


# instance fields
.field public final a:Ljavax/crypto/SecretKey;

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/c;->c:Lwe/b$b;

    return-void
.end method

.method public constructor <init>([BLgf/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lff/c;->c:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lte/k;->c([B)Ljavax/crypto/SecretKey;

    move-result-object p1

    iput-object p1, p0, Lff/c;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {p2}, Lgf/a;->d()[B

    move-result-object p1

    iput-object p1, p0, Lff/c;->b:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lse/q;)Lre/a;
    .locals 3

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object v0

    invoke-virtual {v0}, Lse/u;->c()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object v0

    invoke-virtual {v0}, Lse/u;->e()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    new-instance v0, Lff/c;

    invoke-virtual {p0}, Lse/q;->c()Lgf/c;

    move-result-object v1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Lse/q;->d()Lgf/a;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lff/c;-><init>([BLgf/a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected tag Size 16, got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object p0

    invoke-virtual {p0}, Lse/u;->e()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected IV Size 12, got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object p0

    invoke-virtual {p0}, Lse/u;->c()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 9

    if-eqz p1, :cond_3

    const/16 v0, 0xc

    invoke-static {v0}, Lff/u;->a(I)[B

    move-result-object v1

    invoke-static {v1}, Lte/k;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v2

    invoke-static {}, Lte/k;->d()Ljavax/crypto/Cipher;

    move-result-object v3

    const/4 v4, 0x1

    iget-object v5, p0, Lff/c;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v3, v4, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v2, p2

    if-eqz v2, :cond_0

    invoke-virtual {v3, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, p1

    invoke-virtual {v3, p2}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result p2

    iget-object v2, p0, Lff/c;->b:[B

    array-length v4, v2

    const v5, 0x7ffffff3

    sub-int/2addr v5, v4

    if-gt p2, v5, :cond_2

    array-length v4, v2

    add-int/2addr v4, v0

    add-int/2addr v4, p2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    iget-object v2, p0, Lff/c;->b:[B

    array-length v2, v2

    const/4 v4, 0x0

    invoke-static {v1, v4, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v6, p1

    iget-object v1, p0, Lff/c;->b:[B

    array-length v1, v1

    add-int/lit8 v8, v1, 0xc

    const/4 v5, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    if-ne p1, p2, :cond_1

    return-object v7

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

    iget-object v1, p0, Lff/c;->b:[B

    array-length v2, v1

    add-int/lit8 v2, v2, 0x1c

    if-lt v0, v2, :cond_2

    invoke-static {v1, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/c;->b:[B

    array-length v0, v0

    const/16 v1, 0xc

    invoke-static {p1, v0, v1}, Lte/k;->b([BII)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    invoke-static {}, Lte/k;->d()Ljavax/crypto/Cipher;

    move-result-object v2

    const/4 v3, 0x2

    iget-object v4, p0, Lff/c;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v2, v3, v4, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v0, p2

    if-eqz v0, :cond_0

    invoke-virtual {v2, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    iget-object p2, p0, Lff/c;->b:[B

    array-length v0, p2

    add-int/2addr v0, v1

    array-length v3, p1

    array-length p2, p2

    sub-int/2addr v3, p2

    sub-int/2addr v3, v1

    invoke-virtual {v2, p1, v0, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

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
