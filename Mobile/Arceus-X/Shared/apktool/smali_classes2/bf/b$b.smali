.class public Lbf/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lbf/c;

.field public b:Lef/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/b$b;->a:Lbf/c;

    .line 4
    iput-object v0, p0, Lbf/b$b;->b:Lef/b;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/b$b;-><init>()V

    return-void
.end method

.method public static d(Ljava/math/BigInteger;Ljava/security/spec/ECPoint;Lbf/a$c;)V
    .locals 3

    invoke-virtual {p2}, Lbf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v1

    const-string v2, "Invalid private value"

    if-lez v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gez v0, :cond_1

    invoke-virtual {p2}, Lbf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object p2

    invoke-static {p0, p2}, Lwe/g;->k(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lbf/b;
    .locals 4

    iget-object v0, p0, Lbf/b$b;->a:Lbf/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbf/b$b;->b:Lef/b;

    if-eqz v0, :cond_0

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lbf/b$b;->a:Lbf/c;

    invoke-virtual {v1}, Lbf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v1

    iget-object v2, p0, Lbf/b$b;->a:Lbf/c;

    invoke-virtual {v2}, Lbf/c;->d()Lbf/a;

    move-result-object v2

    invoke-virtual {v2}, Lbf/a;->c()Lbf/a$c;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lbf/b$b;->d(Ljava/math/BigInteger;Ljava/security/spec/ECPoint;Lbf/a$c;)V

    new-instance v0, Lbf/b;

    iget-object v1, p0, Lbf/b$b;->a:Lbf/c;

    iget-object v2, p0, Lbf/b$b;->b:Lef/b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lbf/b;-><init>(Lbf/c;Lef/b;Lbf/b$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without a private value"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without a ecdsa public key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lef/b;)Lbf/b$b;
    .locals 0

    iput-object p1, p0, Lbf/b$b;->b:Lef/b;

    return-object p0
.end method

.method public c(Lbf/c;)Lbf/b$b;
    .locals 0

    iput-object p1, p0, Lbf/b$b;->a:Lbf/c;

    return-object p0
.end method
