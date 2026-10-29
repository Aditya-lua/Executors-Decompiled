.class public final Ldf/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lze/a;


# static fields
.field public static final d:Lue/b$b;

.field public static final e:Ljava/lang/ThreadLocal;
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

.field public b:[B

.field public c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    sput-object v0, Ldf/r;->d:Lue/b$b;

    new-instance v0, Ldf/r$a;

    invoke-direct {v0}, Ldf/r$a;-><init>()V

    sput-object v0, Ldf/r;->e:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    invoke-static {v0}, Ldf/a0;->a(I)V

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Ldf/r;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {p0}, Ldf/r;->c()V

    return-void
.end method

.method public static b(I)I
    .locals 1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    sub-int/2addr p0, v0

    div-int/lit8 p0, p0, 0x10

    add-int/2addr p0, v0

    return p0
.end method

.method public static d()Ljavax/crypto/Cipher;
    .locals 2

    sget-object v0, Ldf/r;->d:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ldf/r;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e([B[BI[B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    aget-byte v1, p0, v0

    add-int v2, v0, p2

    aget-byte v2, p1, v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a([BI)[B
    .locals 11

    const/16 v0, 0x10

    if-gt p2, v0, :cond_5

    invoke-static {}, Ldf/r;->d()Ljavax/crypto/Cipher;

    move-result-object v1

    iget-object v2, p0, Ldf/r;->a:Ljavax/crypto/SecretKey;

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    array-length v2, p1

    invoke-static {v2}, Ldf/r;->b(I)I

    move-result v2

    mul-int/lit8 v4, v2, 0x10

    array-length v5, p1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    add-int/lit8 v4, v2, -0x1

    mul-int/2addr v4, v0

    iget-object v5, p0, Ldf/r;->b:[B

    invoke-static {p1, v4, v5, v6, v0}, Ldf/e;->d([BI[BII)[B

    move-result-object v4

    goto :goto_0

    :cond_0
    add-int/lit8 v4, v2, -0x1

    mul-int/2addr v4, v0

    array-length v5, p1

    invoke-static {p1, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    invoke-static {v4}, Lye/f;->a([B)[B

    move-result-object v4

    iget-object v5, p0, Ldf/r;->c:[B

    invoke-static {v4, v5}, Ldf/e;->e([B[B)[B

    move-result-object v4

    :goto_0
    new-array v5, v0, [B

    new-array v7, v0, [B

    move v8, v6

    :goto_1
    add-int/lit8 v9, v2, -0x1

    const-string v10, "Cipher didn\'t write full block"

    if-ge v8, v9, :cond_2

    mul-int/lit8 v9, v8, 0x10

    invoke-static {v5, p1, v9, v7}, Ldf/r;->e([B[BI[B)V

    invoke-virtual {v1, v7, v6, v0, v5}, Ljavax/crypto/Cipher;->doFinal([BII[B)I

    move-result v9

    if-ne v9, v0, :cond_1

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v5, v4, v6, v7}, Ldf/r;->e([B[BI[B)V

    invoke-virtual {v1, v7, v6, v0, v5}, Ljavax/crypto/Cipher;->doFinal([BII[B)I

    move-result p1

    if-ne p1, v0, :cond_4

    if-ne v0, p2, :cond_3

    return-object v5

    :cond_3
    invoke-static {v5, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "outputLength too large, max is 16 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()V
    .locals 3

    invoke-static {}, Ldf/r;->d()Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Ldf/r;->a:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/16 v1, 0x10

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Lye/f;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Ldf/r;->b:[B

    invoke-static {v0}, Lye/f;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Ldf/r;->c:[B

    return-void
.end method
