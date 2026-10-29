.class public final Lbf/o;
.super Lbf/c1;
.source "SourceFile"


# instance fields
.field public final a:Lbf/i;

.field public final b:Lef/a;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lbf/i;Lef/a;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lbf/c1;-><init>()V

    iput-object p1, p0, Lbf/o;->a:Lbf/i;

    iput-object p2, p0, Lbf/o;->b:Lef/a;

    iput-object p3, p0, Lbf/o;->c:Lef/a;

    iput-object p4, p0, Lbf/o;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static c(Lbf/i$a;Lef/a;Ljava/lang/Integer;)Lbf/o;
    .locals 3

    invoke-static {p0}, Lbf/i;->b(Lbf/i$a;)Lbf/i;

    move-result-object v0

    sget-object v1, Lbf/i$a;->e:Lbf/i$a;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "For given Variant "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " the value of idRequirement must be non-null"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lef/a;->c()I

    move-result p0

    const/16 v1, 0x20

    if-ne p0, v1, :cond_4

    new-instance p0, Lbf/o;

    invoke-static {v0, p2}, Lbf/o;->d(Lbf/i;Ljava/lang/Integer;)Lef/a;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1, p2}, Lbf/o;-><init>(Lbf/i;Lef/a;Lef/a;Ljava/lang/Integer;)V

    return-object p0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ed25519 key must be constructed with key of length 32 bytes, not "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lef/a;->c()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lbf/i;Ljava/lang/Integer;)Lef/a;
    .locals 2

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object v0

    sget-object v1, Lbf/i$a;->e:Lbf/i$a;

    if-ne v0, v1, :cond_0

    sget-object p0, Lwe/e0;->a:Lef/a;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object v0

    sget-object v1, Lbf/i$a;->c:Lbf/i$a;

    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object v0

    sget-object v1, Lbf/i$a;->d:Lbf/i$a;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object v0

    sget-object v1, Lbf/i$a;->b:Lbf/i$a;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lwe/e0;->b(I)Lef/a;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lwe/e0;->a(I)Lef/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbf/o;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lef/a;
    .locals 1

    iget-object v0, p0, Lbf/o;->c:Lef/a;

    return-object v0
.end method

.method public e()Lbf/i;
    .locals 1

    iget-object v0, p0, Lbf/o;->a:Lbf/i;

    return-object v0
.end method

.method public f()Lef/a;
    .locals 1

    iget-object v0, p0, Lbf/o;->b:Lef/a;

    return-object v0
.end method
