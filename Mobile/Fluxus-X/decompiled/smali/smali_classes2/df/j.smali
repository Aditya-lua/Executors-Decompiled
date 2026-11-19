.class public final Ldf/j;
.super Ldf/b1;
.source "SourceFile"


# instance fields
.field public final a:Ldf/o;

.field public final b:Lgf/c;


# direct methods
.method public constructor <init>(Ldf/o;Lgf/c;)V
    .locals 0

    invoke-direct {p0}, Ldf/b1;-><init>()V

    iput-object p1, p0, Ldf/j;->a:Ldf/o;

    iput-object p2, p0, Ldf/j;->b:Lgf/c;

    return-void
.end method

.method public static d(Ldf/o;Lgf/c;)Ldf/j;
    .locals 2

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lgf/c;->c()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ldf/o;->f()Lgf/a;

    move-result-object v0

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v0

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v1

    invoke-static {v1}, Lye/e;->j([B)[B

    move-result-object v1

    invoke-static {v1}, Lye/e;->v([B)[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ldf/j;

    invoke-direct {v0, p0, p1}, Ldf/j;-><init>(Ldf/o;Lgf/c;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Ed25519 keys mismatch"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ed25519 key must be constructed with key of length 32 bytes, not "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lgf/c;->c()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Ed25519 key cannot be constructed without an Ed25519 public key"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic c()Ldf/c1;
    .locals 1

    invoke-virtual {p0}, Ldf/j;->g()Ldf/o;

    move-result-object v0

    return-object v0
.end method

.method public e()Ldf/i;
    .locals 1

    iget-object v0, p0, Ldf/j;->a:Ldf/o;

    invoke-virtual {v0}, Ldf/o;->e()Ldf/i;

    move-result-object v0

    return-object v0
.end method

.method public f()Lgf/c;
    .locals 1

    iget-object v0, p0, Ldf/j;->b:Lgf/c;

    return-object v0
.end method

.method public g()Ldf/o;
    .locals 1

    iget-object v0, p0, Ldf/j;->a:Ldf/o;

    return-object v0
.end method
