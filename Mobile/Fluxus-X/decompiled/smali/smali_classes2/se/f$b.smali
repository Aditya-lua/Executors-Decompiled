.class public Lse/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lse/k;

.field public b:Lgf/c;

.field public c:Lgf/c;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lse/f$b;->a:Lse/k;

    .line 4
    iput-object v0, p0, Lse/f$b;->b:Lgf/c;

    .line 5
    iput-object v0, p0, Lse/f$b;->c:Lgf/c;

    .line 6
    iput-object v0, p0, Lse/f$b;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lse/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lse/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lse/f;
    .locals 9

    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lse/f$b;->b:Lgf/c;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lse/f$b;->c:Lgf/c;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lse/k;->c()I

    move-result v0

    iget-object v1, p0, Lse/f$b;->b:Lgf/c;

    invoke-virtual {v1}, Lgf/c;->c()I

    move-result v1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->e()I

    move-result v0

    iget-object v1, p0, Lse/f$b;->c:Lgf/c;

    invoke-virtual {v1}, Lgf/c;->c()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lse/f$b;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lse/f$b;->d:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lse/f$b;->b()Lgf/a;

    move-result-object v6

    new-instance v2, Lse/f;

    iget-object v3, p0, Lse/f$b;->a:Lse/k;

    iget-object v4, p0, Lse/f$b;->b:Lgf/c;

    iget-object v5, p0, Lse/f$b;->c:Lgf/c;

    iget-object v7, p0, Lse/f$b;->d:Ljava/lang/Integer;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lse/f;-><init>(Lse/k;Lgf/c;Lgf/c;Lgf/a;Ljava/lang/Integer;Lse/f$a;)V

    return-object v2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HMAC key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lgf/a;
    .locals 3

    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->h()Lse/k$d;

    move-result-object v0

    sget-object v1, Lse/k$d;->d:Lse/k$d;

    if-ne v0, v1, :cond_0

    sget-object v0, Lye/e0;->a:Lgf/a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->h()Lse/k$d;

    move-result-object v0

    sget-object v1, Lse/k$d;->c:Lse/k$d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lse/f$b;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lye/e0;->a(I)Lgf/a;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v0}, Lse/k;->h()Lse/k$d;

    move-result-object v0

    sget-object v1, Lse/k$d;->b:Lse/k$d;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lse/f$b;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lye/e0;->b(I)Lgf/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lse/f$b;->a:Lse/k;

    invoke-virtual {v2}, Lse/k;->h()Lse/k$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lgf/c;)Lse/f$b;
    .locals 0

    iput-object p1, p0, Lse/f$b;->b:Lgf/c;

    return-object p0
.end method

.method public d(Lgf/c;)Lse/f$b;
    .locals 0

    iput-object p1, p0, Lse/f$b;->c:Lgf/c;

    return-object p0
.end method

.method public e(Ljava/lang/Integer;)Lse/f$b;
    .locals 0

    iput-object p1, p0, Lse/f$b;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public f(Lse/k;)Lse/f$b;
    .locals 0

    iput-object p1, p0, Lse/f$b;->a:Lse/k;

    return-object p0
.end method
