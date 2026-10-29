.class public final Lse/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# static fields
.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

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
.field public final a:Ljavax/crypto/SecretKey;

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "7a806c"

    invoke-static {v0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lse/a;->c:[B

    const-string v0, "46bb91c3c5"

    invoke-static {v0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lse/a;->d:[B

    const-string v0, "36864200e0eaf5284d884a0e77d31646"

    invoke-static {v0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lse/a;->e:[B

    const-string v0, "bae8e37fc83441b16034566b"

    invoke-static {v0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lse/a;->f:[B

    const-string v0, "af60eb711bd85bc1e4d3e0a462e074eea428a8"

    invoke-static {v0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lse/a;->g:[B

    new-instance v0, Lse/a$a;

    invoke-direct {v0}, Lse/a$a;-><init>()V

    sput-object v0, Lse/a;->h:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lse/a;->b:[B

    array-length p2, p1

    invoke-static {p2}, Ldf/a0;->a(I)V

    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {p2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object p2, p0, Lse/a;->a:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public static synthetic c(Ljavax/crypto/Cipher;)Z
    .locals 0

    invoke-static {p0}, Lse/a;->h(Ljavax/crypto/Cipher;)Z

    move-result p0

    return p0
.end method

.method public static d(Lqe/v;)Lpe/a;
    .locals 3

    new-instance v0, Lse/a;

    invoke-virtual {p0}, Lqe/v;->c()Lef/c;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Lqe/v;->d()Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lse/a;-><init>([B[B)V

    return-object v0
.end method

.method public static f([B)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lse/a;->g([BII)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static g([BII)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v1, 0x80

    invoke-direct {v0, v1, p0, p1, p2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    return-object v0
.end method

.method public static h(Ljavax/crypto/Cipher;)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lse/a;->f:[B

    invoke-static {v1}, Lse/a;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v3, Lse/a;->e:[B

    const-string v4, "AES"

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    sget-object v1, Lse/a;->d:[B

    invoke-virtual {p0, v1}, Ljavax/crypto/Cipher;->updateAAD([B)V

    sget-object v1, Lse/a;->g:[B

    array-length v2, v1

    invoke-virtual {p0, v1, v0, v2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p0

    sget-object v1, Lse/a;->c:[B

    invoke-static {p0, v1}, Ldf/e;->b([B[B)Z

    move-result p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 1

    invoke-virtual {p0, p1, p2}, Lse/a;->j([B[B)[B

    move-result-object p1

    iget-object p2, p0, Lse/a;->b:[B

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

    iget-object v0, p0, Lse/a;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lse/a;->i([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lse/a;->b:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lse/a;->i([B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Ljavax/crypto/Cipher;
    .locals 2

    sget-object v0, Lse/a;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES GCM SIV cipher is not available or is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i([B[B)[B
    .locals 5

    invoke-virtual {p0}, Lse/a;->e()Ljavax/crypto/Cipher;

    move-result-object v0

    array-length v1, p1

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {p1, v1, v2}, Lse/a;->g([BII)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    const/4 v3, 0x2

    iget-object v4, p0, Lse/a;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v3, v4, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v1, p2

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, p1

    sub-int/2addr p2, v2

    invoke-virtual {v0, p1, v2, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j([B[B)[B
    .locals 6

    invoke-virtual {p0}, Lse/a;->e()Ljavax/crypto/Cipher;

    move-result-object v0

    array-length v1, p1

    const v2, 0x7fffffe3

    if-gt v1, v2, :cond_2

    array-length v1, p1

    add-int/lit8 v1, v1, 0x1c

    new-array v4, v1, [B

    const/16 v1, 0xc

    invoke-static {v1}, Ldf/u;->a(I)[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lse/a;->f([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p0, Lse/a;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v2, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v1, p2

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length v3, p1

    const/16 v5, 0xc

    const/4 v2, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    array-length p2, v1

    const/16 v0, 0x10

    add-int/2addr p2, v0

    if-ne p1, p2, :cond_1

    return-object v4

    :cond_1
    array-length p2, v1

    sub-int/2addr p1, p2

    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "encryption failed; GCM tag must be %s bytes, but got only %s bytes"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
