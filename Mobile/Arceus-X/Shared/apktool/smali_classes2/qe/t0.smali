.class public Lqe/t0;
.super Lqe/b;
.source "SourceFile"


# instance fields
.field public final a:Lqe/u0;

.field public final b:Lef/a;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqe/u0;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lqe/b;-><init>()V

    iput-object p1, p0, Lqe/t0;->a:Lqe/u0;

    iput-object p2, p0, Lqe/t0;->b:Lef/a;

    iput-object p3, p0, Lqe/t0;->c:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;
    .locals 2

    invoke-virtual {p0}, Lqe/u0;->e()Lqe/u0$d;

    move-result-object v0

    sget-object v1, Lqe/u0$d;->c:Lqe/u0$d;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    sget-object v0, Lwe/e0;->a:Lef/a;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lqe/u0;->e()Lqe/u0$d;

    move-result-object v0

    sget-object v1, Lqe/u0$d;->b:Lqe/u0$d;

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lwe/e0;->b(I)Lef/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lqe/t0;

    invoke-direct {v1, p0, v0, p1}, Lqe/t0;-><init>(Lqe/u0;Lef/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant TINK the value of idRequirement must be non-null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqe/u0;->e()Lqe/u0$d;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqe/t0;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/a;
    .locals 1

    iget-object v0, p0, Lqe/t0;->b:Lef/a;

    return-object v0
.end method

.method public d()Lqe/u0;
    .locals 1

    iget-object v0, p0, Lqe/t0;->a:Lqe/u0;

    return-object v0
.end method
