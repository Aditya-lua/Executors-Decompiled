.class public final Lbf/j0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Ljava/math/BigInteger;

.field public static final f:Ljava/math/BigInteger;


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/math/BigInteger;

.field public c:Lbf/j0$c;

.field public d:Lbf/j0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lbf/j0$b;->e:Ljava/math/BigInteger;

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lbf/j0$b;->f:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/j0$b;->a:Ljava/lang/Integer;

    .line 4
    sget-object v1, Lbf/j0;->e:Ljava/math/BigInteger;

    iput-object v1, p0, Lbf/j0$b;->b:Ljava/math/BigInteger;

    .line 5
    iput-object v0, p0, Lbf/j0$b;->c:Lbf/j0$c;

    .line 6
    sget-object v0, Lbf/j0$d;->e:Lbf/j0$d;

    iput-object v0, p0, Lbf/j0$b;->d:Lbf/j0$d;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/j0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/j0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbf/j0;
    .locals 7

    iget-object v0, p0, Lbf/j0$b;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lbf/j0$b;->b:Ljava/math/BigInteger;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lbf/j0$b;->c:Lbf/j0$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lbf/j0$b;->d:Lbf/j0$d;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x800

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lbf/j0$b;->b:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Lbf/j0$b;->f(Ljava/math/BigInteger;)V

    new-instance v1, Lbf/j0;

    iget-object v0, p0, Lbf/j0$b;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lbf/j0$b;->b:Ljava/math/BigInteger;

    iget-object v4, p0, Lbf/j0$b;->d:Lbf/j0$d;

    iget-object v5, p0, Lbf/j0$b;->c:Lbf/j0$c;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lbf/j0;-><init>(ILjava/math/BigInteger;Lbf/j0$d;Lbf/j0$c;Lbf/j0$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    iget-object v1, p0, Lbf/j0$b;->a:Ljava/lang/Integer;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid key size in bytes %d; must be at least 2048 bits"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "publicExponent is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lbf/j0$c;)Lbf/j0$b;
    .locals 0

    iput-object p1, p0, Lbf/j0$b;->c:Lbf/j0$c;

    return-object p0
.end method

.method public c(I)Lbf/j0$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lbf/j0$b;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Ljava/math/BigInteger;)Lbf/j0$b;
    .locals 0

    iput-object p1, p0, Lbf/j0$b;->b:Ljava/math/BigInteger;

    return-object p0
.end method

.method public e(Lbf/j0$d;)Lbf/j0$b;
    .locals 0

    iput-object p1, p0, Lbf/j0$b;->d:Lbf/j0$d;

    return-object p0
.end method

.method public final f(Ljava/math/BigInteger;)V
    .locals 2

    sget-object v0, Lbf/j0;->e:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ltz v0, :cond_3

    sget-object v0, Lbf/j0$b;->e:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lbf/j0$b;->f:Ljava/math/BigInteger;

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    if-gtz p1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Public exponent cannot be larger than 2^256."

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Invalid public exponent"

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string v0, "Public exponent must be at least 65537."

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
