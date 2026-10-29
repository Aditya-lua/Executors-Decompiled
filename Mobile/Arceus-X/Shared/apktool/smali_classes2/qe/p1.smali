.class public final Lqe/p1;
.super Lqe/b;
.source "SourceFile"


# instance fields
.field public final a:Lqe/t1;

.field public final b:Lef/c;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqe/t1;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lqe/b;-><init>()V

    iput-object p1, p0, Lqe/p1;->a:Lqe/t1;

    iput-object p2, p0, Lqe/p1;->b:Lef/c;

    iput-object p3, p0, Lqe/p1;->c:Lef/a;

    iput-object p4, p0, Lqe/p1;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Lqe/t1$a;Lef/c;Ljava/lang/Integer;)Lqe/p1;
    .locals 2

    sget-object v0, Lqe/t1$a;->d:Lqe/t1$a;

    if-eq p0, v0, :cond_1

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
    if-ne p0, v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lef/c;->c()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    invoke-static {p0}, Lqe/t1;->b(Lqe/t1$a;)Lqe/t1;

    move-result-object p0

    new-instance v0, Lqe/p1;

    invoke-static {p0, p2}, Lqe/p1;->e(Lqe/t1;Ljava/lang/Integer;)Lef/a;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1, p2}, Lqe/p1;-><init>(Lqe/t1;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lef/c;->c()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lqe/t1;Ljava/lang/Integer;)Lef/a;
    .locals 2

    invoke-virtual {p0}, Lqe/t1;->c()Lqe/t1$a;

    move-result-object v0

    sget-object v1, Lqe/t1$a;->d:Lqe/t1$a;

    if-ne v0, v1, :cond_0

    sget-object p0, Lwe/e0;->a:Lef/a;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lqe/t1;->c()Lqe/t1$a;

    move-result-object v0

    sget-object v1, Lqe/t1$a;->c:Lqe/t1$a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lwe/e0;->a(I)Lef/a;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lqe/t1;->c()Lqe/t1$a;

    move-result-object v0

    sget-object v1, Lqe/t1$a;->b:Lqe/t1$a;

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

    invoke-virtual {p0}, Lqe/t1;->c()Lqe/t1$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqe/p1;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lqe/p1;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/a;
    .locals 1

    iget-object v0, p0, Lqe/p1;->c:Lef/a;

    return-object v0
.end method

.method public f()Lqe/t1;
    .locals 1

    iget-object v0, p0, Lqe/p1;->a:Lqe/t1;

    return-object v0
.end method
