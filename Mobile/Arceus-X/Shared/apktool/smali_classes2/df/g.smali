.class public final Ldf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# static fields
.field public static final g:Lue/b$b;

.field public static final h:[B

.field public static final i:[B

.field public static final j:[B


# instance fields
.field public final a:Ljava/security/interfaces/ECPrivateKey;

.field public final b:Ljava/lang/String;

.field public final c:Ldf/k$c;

.field public final d:[B

.field public final e:[B

.field public final f:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Ldf/g;->g:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Ldf/g;->h:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Ldf/g;->i:[B

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Ldf/g;->j:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;Ldf/o;Ldf/k$c;[B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ldf/g;->g:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ldf/g;->a:Ljava/security/interfaces/ECPrivateKey;

    invoke-static {p2}, Ldf/z;->f(Ldf/o;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ldf/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ldf/g;->c:Ldf/k$c;

    iput-object p4, p0, Ldf/g;->d:[B

    iput-object p5, p0, Ldf/g;->e:[B

    invoke-static {}, Lwe/c;->a()Ljava/security/Provider;

    move-result-object p1

    iput-object p1, p0, Ldf/g;->f:Ljava/security/Provider;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lbf/b;)Lpe/z;
    .locals 7

    sget-object v0, Ldf/h;->j:Lwe/h;

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a;->d()Lbf/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ldf/o;

    sget-object v0, Ldf/h;->k:Lwe/h;

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a;->e()Lbf/a$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ldf/k$c;

    sget-object v0, Ldf/h;->l:Lwe/h;

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a;->c()Lbf/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ldf/k$b;

    invoke-virtual {p0}, Lbf/b;->f()Lef/b;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    invoke-static {v0, v1}, Ldf/k;->h(Ldf/k$b;[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v2

    new-instance v1, Ldf/g;

    invoke-virtual {p0}, Lbf/b1;->b()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v5

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a;->f()Lbf/a$f;

    move-result-object v0

    sget-object v6, Lbf/a$f;->d:Lbf/a$f;

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ldf/g;->i:[B

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    sget-object v0, Ldf/g;->h:[B

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v6}, Ldf/g;-><init>(Ljava/security/interfaces/ECPrivateKey;Ldf/o;Ldf/k$c;[B[B)V

    invoke-virtual {p0}, Lbf/b;->g()Lbf/c;

    move-result-object p0

    invoke-static {p0}, Ldf/h;->b(Lbf/c;)Lpe/a0;

    move-result-object p0

    :try_start_0
    sget-object v0, Ldf/g;->j:[B

    invoke-interface {v1, v0}, Lpe/z;->a([B)[B

    move-result-object v2

    invoke-interface {p0, v2, v0}, Lpe/a0;->a([B[B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted."

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    iget-object v0, p0, Ldf/g;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ldf/g;->c(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    iget-object v1, p0, Ldf/g;->a:Ljava/security/interfaces/ECPrivateKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    iget-object p1, p0, Ldf/g;->e:[B

    array-length v1, p1

    if-lez v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    :cond_0
    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object p1

    iget-object v0, p0, Ldf/g;->c:Ldf/k$c;

    sget-object v1, Ldf/k$c;->a:Ldf/k$c;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ldf/g;->a:Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Ldf/k;->e(Ljava/security/spec/EllipticCurve;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Ldf/k;->b([BI)[B

    move-result-object p1

    :cond_1
    iget-object v0, p0, Ldf/g;->d:[B

    array-length v1, v0

    if-nez v1, :cond_2

    return-object p1

    :cond_2
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;)Ljava/security/Signature;
    .locals 1

    iget-object v0, p0, Ldf/g;->f:Ljava/security/Provider;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ldf/m;->d:Ldf/m;

    invoke-virtual {v0, p1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/Signature;

    return-object p1
.end method
