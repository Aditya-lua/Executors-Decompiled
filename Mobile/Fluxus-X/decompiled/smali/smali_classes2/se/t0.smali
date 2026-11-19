.class public Lse/t0;
.super Lse/b;
.source "SourceFile"


# instance fields
.field public final a:Lse/u0;

.field public final b:Lgf/a;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lse/u0;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lse/b;-><init>()V

    iput-object p1, p0, Lse/t0;->a:Lse/u0;

    iput-object p2, p0, Lse/t0;->b:Lgf/a;

    iput-object p3, p0, Lse/t0;->c:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Lse/u0;Ljava/lang/Integer;)Lse/t0;
    .locals 2

    invoke-virtual {p0}, Lse/u0;->e()Lse/u0$d;

    move-result-object v0

    sget-object v1, Lse/u0$d;->c:Lse/u0$d;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    sget-object v0, Lye/e0;->a:Lgf/a;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lse/u0;->e()Lse/u0$d;

    move-result-object v0

    sget-object v1, Lse/u0$d;->b:Lse/u0$d;

    if-ne v0, v1, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lye/e0;->b(I)Lgf/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lse/t0;

    invoke-direct {v1, p0, v0, p1}, Lse/t0;-><init>(Lse/u0;Lgf/a;Ljava/lang/Integer;)V

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

    invoke-virtual {p0}, Lse/u0;->e()Lse/u0$d;

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

    iget-object v0, p0, Lse/t0;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/a;
    .locals 1

    iget-object v0, p0, Lse/t0;->b:Lgf/a;

    return-object v0
.end method

.method public d()Lse/u0;
    .locals 1

    iget-object v0, p0, Lse/t0;->a:Lse/u0;

    return-object v0
.end method
