.class public final Lff/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# static fields
.field public static final g:Lwe/b$b;

.field public static final h:[B

.field public static final i:[B

.field public static final j:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lff/o;",
            "Ldf/a$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lff/k$c;",
            "Ldf/a$e;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lff/k$b;",
            "Ldf/a$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/security/interfaces/ECPublicKey;

.field public final b:Ljava/lang/String;

.field public final c:Lff/k$c;

.field public final d:[B

.field public final e:[B

.field public final f:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/h;->g:Lwe/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lff/h;->h:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lff/h;->i:[B

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->c:Lff/o;

    sget-object v2, Ldf/a$d;->b:Ldf/a$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->d:Lff/o;

    sget-object v2, Ldf/a$d;->c:Ldf/a$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/o;->e:Lff/o;

    sget-object v2, Ldf/a$d;->d:Ldf/a$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lff/h;->j:Lye/h;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/k$c;->a:Lff/k$c;

    sget-object v2, Ldf/a$e;->b:Ldf/a$e;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/k$c;->b:Lff/k$c;

    sget-object v2, Ldf/a$e;->c:Ldf/a$e;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lff/h;->k:Lye/h;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/k$b;->a:Lff/k$b;

    sget-object v2, Ldf/a$c;->c:Ldf/a$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/k$b;->b:Lff/k$b;

    sget-object v2, Ldf/a$c;->d:Ldf/a$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lff/k$b;->c:Lff/k$b;

    sget-object v2, Ldf/a$c;->e:Ldf/a$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lff/h;->l:Lye/h;

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPublicKey;Lff/o;Lff/k$c;[B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lff/h;->g:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lff/k;->a(Ljava/security/interfaces/ECPublicKey;)V

    invoke-static {p2}, Lff/z;->f(Lff/o;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lff/h;->b:Ljava/lang/String;

    iput-object p1, p0, Lff/h;->a:Ljava/security/interfaces/ECPublicKey;

    iput-object p3, p0, Lff/h;->c:Lff/k$c;

    iput-object p4, p0, Lff/h;->d:[B

    iput-object p5, p0, Lff/h;->e:[B

    invoke-static {}, Lye/c;->a()Ljava/security/Provider;

    move-result-object p1

    iput-object p1, p0, Lff/h;->f:Ljava/security/Provider;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ldf/c;)Lre/a0;
    .locals 9

    sget-object v0, Lff/h;->l:Lye/h;

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a;->c()Ldf/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lff/k$b;

    invoke-virtual {p0}, Ldf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p0}, Ldf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    invoke-static {v0, v1, v2}, Lff/k;->i(Lff/k$b;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v4

    new-instance v3, Lff/h;

    sget-object v0, Lff/h;->j:Lye/h;

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a;->d()Ldf/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lff/o;

    sget-object v0, Lff/h;->k:Lye/h;

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a;->e()Ldf/a$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lff/k$c;

    invoke-virtual {p0}, Ldf/c;->b()Lgf/a;

    move-result-object v0

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v7

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object p0

    invoke-virtual {p0}, Ldf/a;->f()Ldf/a$f;

    move-result-object p0

    sget-object v0, Ldf/a$f;->d:Ldf/a$f;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lff/h;->i:[B

    :goto_0
    move-object v8, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lff/h;->h:[B

    goto :goto_0

    :goto_1
    invoke-direct/range {v3 .. v8}, Lff/h;-><init>(Ljava/security/interfaces/ECPublicKey;Lff/o;Lff/k$c;[B[B)V

    return-object v3
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Lff/h;->d:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lff/h;->d([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lff/h;->d:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lff/h;->d([B[B)V

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/String;)Ljava/security/Signature;
    .locals 1

    iget-object v0, p0, Lff/h;->f:Ljava/security/Provider;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lff/m;->d:Lff/m;

    invoke-virtual {v0, p1}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/Signature;

    return-object p1
.end method

.method public final d([B[B)V
    .locals 3

    iget-object v0, p0, Lff/h;->c:Lff/k$c;

    sget-object v1, Lff/k$c;->a:Lff/k$c;

    const-string v2, "Invalid signature"

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lff/h;->a:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    array-length v1, p1

    invoke-static {v0}, Lff/k;->e(Ljava/security/spec/EllipticCurve;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    if-ne v1, v0, :cond_0

    invoke-static {p1}, Lff/k;->c([B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lff/k;->n([B)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lff/h;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lff/h;->c(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    iget-object v1, p0, Lff/h;->a:Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    iget-object p2, p0, Lff/h;->e:[B

    array-length v1, p2

    if-lez v1, :cond_2

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    :cond_2
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
