.class public Lbf/k0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lbf/l0;

.field public b:Lef/b;

.field public c:Lef/b;

.field public d:Lef/b;

.field public e:Lef/b;

.field public f:Lef/b;

.field public g:Lef/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/k0$b;->a:Lbf/l0;

    .line 4
    iput-object v0, p0, Lbf/k0$b;->b:Lef/b;

    .line 5
    iput-object v0, p0, Lbf/k0$b;->c:Lef/b;

    .line 6
    iput-object v0, p0, Lbf/k0$b;->d:Lef/b;

    .line 7
    iput-object v0, p0, Lbf/k0$b;->e:Lef/b;

    .line 8
    iput-object v0, p0, Lbf/k0$b;->f:Lef/b;

    .line 9
    iput-object v0, p0, Lbf/k0$b;->g:Lef/b;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/k0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/k0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbf/k0;
    .locals 11

    iget-object v0, p0, Lbf/k0$b;->a:Lbf/l0;

    if-eqz v0, :cond_b

    iget-object v1, p0, Lbf/k0$b;->c:Lef/b;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lbf/k0$b;->d:Lef/b;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lbf/k0$b;->b:Lef/b;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lbf/k0$b;->e:Lef/b;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lbf/k0$b;->f:Lef/b;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lbf/k0$b;->g:Lef/b;

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v0

    invoke-virtual {v0}, Lbf/j0;->e()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lbf/k0$b;->a:Lbf/l0;

    invoke-virtual {v1}, Lbf/l0;->d()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lbf/k0$b;->c:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v2

    iget-object v3, p0, Lbf/k0$b;->d:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lbf/k0$b;->b:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lbf/k0$b;->e:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v6

    invoke-virtual {v5, v6}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v5

    iget-object v6, p0, Lbf/k0$b;->f:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v6

    iget-object v7, p0, Lbf/k0$b;->g:Lef/b;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v7

    const/16 v8, 0xa

    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v3, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v3, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3, v7}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lbf/k0;

    iget-object v2, p0, Lbf/k0$b;->a:Lbf/l0;

    iget-object v3, p0, Lbf/k0$b;->c:Lef/b;

    iget-object v4, p0, Lbf/k0$b;->d:Lef/b;

    iget-object v5, p0, Lbf/k0$b;->b:Lef/b;

    iget-object v6, p0, Lbf/k0$b;->e:Lef/b;

    iget-object v7, p0, Lbf/k0$b;->f:Lef/b;

    iget-object v8, p0, Lbf/k0$b;->g:Lef/b;

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lbf/k0;-><init>(Lbf/l0;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lbf/k0$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "qInv is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dQ is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dP is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "D is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Prime p times prime q is not equal to the public key\'s modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "q is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "p is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without CRT coefficient"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime exponents"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without private exponent"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime factors"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without a RSA SSA PKCS1 public key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lef/b;)Lbf/k0$b;
    .locals 0

    iput-object p1, p0, Lbf/k0$b;->g:Lef/b;

    return-object p0
.end method

.method public c(Lef/b;Lef/b;)Lbf/k0$b;
    .locals 0

    iput-object p1, p0, Lbf/k0$b;->e:Lef/b;

    iput-object p2, p0, Lbf/k0$b;->f:Lef/b;

    return-object p0
.end method

.method public d(Lef/b;Lef/b;)Lbf/k0$b;
    .locals 0

    iput-object p1, p0, Lbf/k0$b;->c:Lef/b;

    iput-object p2, p0, Lbf/k0$b;->d:Lef/b;

    return-object p0
.end method

.method public e(Lef/b;)Lbf/k0$b;
    .locals 0

    iput-object p1, p0, Lbf/k0$b;->b:Lef/b;

    return-object p0
.end method

.method public f(Lbf/l0;)Lbf/k0$b;
    .locals 0

    iput-object p1, p0, Lbf/k0$b;->a:Lbf/l0;

    return-object p0
.end method
