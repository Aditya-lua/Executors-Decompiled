.class public Ldf/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ldf/c;

.field public b:Lgf/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Ldf/b$b;->a:Ldf/c;

    .line 4
    iput-object v0, p0, Ldf/b$b;->b:Lgf/b;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf/b$b;-><init>()V

    return-void
.end method

.method public static d(Ljava/math/BigInteger;Ljava/security/spec/ECPoint;Ldf/a$c;)V
    .locals 3

    invoke-virtual {p2}, Ldf/a$c;->a()Ljava/security/spec/ECParameterSpec;

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

    invoke-virtual {p2}, Ldf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object p2

    invoke-static {p0, p2}, Lye/g;->k(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;

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
.method public a()Ldf/b;
    .locals 4

    iget-object v0, p0, Ldf/b$b;->a:Ldf/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldf/b$b;->b:Lgf/b;

    if-eqz v0, :cond_0

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Ldf/b$b;->a:Ldf/c;

    invoke-virtual {v1}, Ldf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v1

    iget-object v2, p0, Ldf/b$b;->a:Ldf/c;

    invoke-virtual {v2}, Ldf/c;->d()Ldf/a;

    move-result-object v2

    invoke-virtual {v2}, Ldf/a;->c()Ldf/a$c;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ldf/b$b;->d(Ljava/math/BigInteger;Ljava/security/spec/ECPoint;Ldf/a$c;)V

    new-instance v0, Ldf/b;

    iget-object v1, p0, Ldf/b$b;->a:Ldf/c;

    iget-object v2, p0, Ldf/b$b;->b:Lgf/b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ldf/b;-><init>(Ldf/c;Lgf/b;Ldf/b$a;)V

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

.method public b(Lgf/b;)Ldf/b$b;
    .locals 0

    iput-object p1, p0, Ldf/b$b;->b:Lgf/b;

    return-object p0
.end method

.method public c(Ldf/c;)Ldf/b$b;
    .locals 0

    iput-object p1, p0, Ldf/b$b;->a:Ldf/c;

    return-object p0
.end method
