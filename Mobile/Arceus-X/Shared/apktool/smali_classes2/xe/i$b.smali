.class public Lxe/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lxe/o;

.field public b:Lef/c;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lxe/i$b;->a:Lxe/o;

    .line 4
    iput-object v0, p0, Lxe/i$b;->b:Lef/c;

    .line 5
    iput-object v0, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lxe/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxe/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lxe/i;
    .locals 8

    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lxe/i$b;->b:Lef/c;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lxe/o;->e()I

    move-result v0

    iget-object v1, p0, Lxe/i$b;->b:Lef/c;

    invoke-virtual {v1}, Lef/c;->c()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lxe/i$b;->b()Lef/a;

    move-result-object v5

    new-instance v2, Lxe/i;

    iget-object v3, p0, Lxe/i$b;->a:Lxe/o;

    iget-object v4, p0, Lxe/i$b;->b:Lef/c;

    iget-object v6, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lxe/i;-><init>(Lxe/o;Lef/c;Lef/a;Ljava/lang/Integer;Lxe/i$a;)V

    return-object v2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lef/a;
    .locals 3

    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->g()Lxe/o$d;

    move-result-object v0

    sget-object v1, Lxe/o$d;->e:Lxe/o$d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lwe/e0;->a:Lef/a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->g()Lxe/o$d;

    move-result-object v0

    sget-object v1, Lxe/o$d;->d:Lxe/o$d;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->g()Lxe/o$d;

    move-result-object v0

    sget-object v1, Lxe/o$d;->c:Lxe/o$d;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v0}, Lxe/o;->g()Lxe/o$d;

    move-result-object v0

    sget-object v1, Lxe/o$d;->b:Lxe/o$d;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->b(I)Lef/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown HmacParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxe/i$b;->a:Lxe/o;

    invoke-virtual {v2}, Lxe/o;->g()Lxe/o$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->a(I)Lef/a;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Integer;)Lxe/i$b;
    .locals 0

    iput-object p1, p0, Lxe/i$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Lef/c;)Lxe/i$b;
    .locals 0

    iput-object p1, p0, Lxe/i$b;->b:Lef/c;

    return-object p0
.end method

.method public e(Lxe/o;)Lxe/i$b;
    .locals 0

    iput-object p1, p0, Lxe/i$b;->a:Lxe/o;

    return-object p0
.end method
