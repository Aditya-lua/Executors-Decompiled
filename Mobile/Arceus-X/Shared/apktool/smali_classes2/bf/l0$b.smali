.class public Lbf/l0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lbf/j0;

.field public b:Ljava/math/BigInteger;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    .line 4
    iput-object v0, p0, Lbf/l0$b;->b:Ljava/math/BigInteger;

    .line 5
    iput-object v0, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/l0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/l0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbf/l0;
    .locals 8

    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lbf/l0$b;->b:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iget-object v1, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v1}, Lbf/j0;->d()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lbf/l0$b;->b()Lef/a;

    move-result-object v5

    new-instance v2, Lbf/l0;

    iget-object v3, p0, Lbf/l0$b;->a:Lbf/j0;

    iget-object v4, p0, Lbf/l0$b;->b:Ljava/math/BigInteger;

    iget-object v6, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lbf/l0;-><init>(Lbf/j0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;Lbf/l0$a;)V

    return-object v2

    :cond_4
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got modulus size "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but parameters requires modulus size "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lef/a;
    .locals 3

    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v0

    sget-object v1, Lbf/j0$d;->e:Lbf/j0$d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lwe/e0;->a:Lef/a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v0

    sget-object v1, Lbf/j0$d;->d:Lbf/j0$d;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v0

    sget-object v1, Lbf/j0$d;->c:Lbf/j0$d;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v0

    sget-object v1, Lbf/j0$d;->b:Lbf/j0$d;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->b(I)Lef/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown RsaSsaPkcs1Parameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lbf/l0$b;->a:Lbf/j0;

    invoke-virtual {v2}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->a(I)Lef/a;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Integer;)Lbf/l0$b;
    .locals 0

    iput-object p1, p0, Lbf/l0$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Ljava/math/BigInteger;)Lbf/l0$b;
    .locals 0

    iput-object p1, p0, Lbf/l0$b;->b:Ljava/math/BigInteger;

    return-object p0
.end method

.method public e(Lbf/j0;)Lbf/l0$b;
    .locals 0

    iput-object p1, p0, Lbf/l0$b;->a:Lbf/j0;

    return-object p0
.end method
