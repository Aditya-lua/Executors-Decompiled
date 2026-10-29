.class public final Lre/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lue/b$b;


# instance fields
.field public final a:Ljavax/crypto/SecretKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lre/c0;->b:Lue/b$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lre/c0;->b:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lre/k;->c([B)Ljavax/crypto/SecretKey;

    move-result-object p1

    iput-object p1, p0, Lre/c0;->a:Ljavax/crypto/SecretKey;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[BI[B)[B
    .locals 3

    array-length v0, p1

    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    array-length v0, p2

    add-int/lit8 v1, p3, 0x10

    if-lt v0, v1, :cond_1

    invoke-static {p1}, Lre/k;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    invoke-static {}, Lre/k;->d()Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x2

    iget-object v2, p0, Lre/c0;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v1, v2, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p4, :cond_0

    array-length p1, p4

    if-eqz p1, :cond_0

    invoke-virtual {v0, p4}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p1, p2

    sub-int/2addr p1, p3

    invoke-virtual {v0, p2, p3, p1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "iv is wrong size"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B[BI[B)[B
    .locals 6

    array-length v0, p1

    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lre/k;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    invoke-static {}, Lre/k;->d()Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lre/c0;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v1, v2, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p4, :cond_0

    array-length p1, p4

    if-eqz p1, :cond_0

    invoke-virtual {v0, p4}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p1, p2

    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result p1

    const p4, 0x7fffffff

    sub-int/2addr p4, p3

    if-gt p1, p4, :cond_2

    add-int p4, p3, p1

    new-array v4, p4, [B

    const/4 v2, 0x0

    array-length v3, p2

    move-object v1, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p2

    if-ne p2, p1, :cond_1

    return-object v4

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
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "iv is wrong size"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
