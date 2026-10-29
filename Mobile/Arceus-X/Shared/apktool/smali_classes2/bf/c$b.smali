.class public Lbf/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lbf/a;

.field public b:Ljava/security/spec/ECPoint;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/c$b;->a:Lbf/a;

    .line 4
    iput-object v0, p0, Lbf/c$b;->b:Ljava/security/spec/ECPoint;

    .line 5
    iput-object v0, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbf/c;
    .locals 8

    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lbf/c$b;->b:Ljava/security/spec/ECPoint;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lbf/a;->c()Lbf/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v1, v0}, Lwe/g;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lbf/c$b;->b()Lef/a;

    move-result-object v5

    new-instance v2, Lbf/c;

    iget-object v3, p0, Lbf/c$b;->a:Lbf/a;

    iget-object v4, p0, Lbf/c$b;->b:Ljava/security/spec/ECPoint;

    iget-object v6, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lbf/c;-><init>(Lbf/a;Ljava/security/spec/ECPoint;Lef/a;Ljava/lang/Integer;Lbf/c$a;)V

    return-object v2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without public point"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lef/a;
    .locals 3

    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->f()Lbf/a$f;

    move-result-object v0

    sget-object v1, Lbf/a$f;->e:Lbf/a$f;

    if-ne v0, v1, :cond_0

    sget-object v0, Lwe/e0;->a:Lef/a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->f()Lbf/a$f;

    move-result-object v0

    sget-object v1, Lbf/a$f;->d:Lbf/a$f;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->f()Lbf/a$f;

    move-result-object v0

    sget-object v1, Lbf/a$f;->c:Lbf/a$f;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->f()Lbf/a$f;

    move-result-object v0

    sget-object v1, Lbf/a$f;->b:Lbf/a$f;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->b(I)Lef/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown EcdsaParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lbf/c$b;->a:Lbf/a;

    invoke-virtual {v2}, Lbf/a;->f()Lbf/a$f;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->a(I)Lef/a;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Integer;)Lbf/c$b;
    .locals 0

    iput-object p1, p0, Lbf/c$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Lbf/a;)Lbf/c$b;
    .locals 0

    iput-object p1, p0, Lbf/c$b;->a:Lbf/a;

    return-object p0
.end method

.method public e(Ljava/security/spec/ECPoint;)Lbf/c$b;
    .locals 0

    iput-object p1, p0, Lbf/c$b;->b:Ljava/security/spec/ECPoint;

    return-object p0
.end method
