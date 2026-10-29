.class public final Lbf/j;
.super Lbf/b1;
.source "SourceFile"


# instance fields
.field public final a:Lbf/o;

.field public final b:Lef/c;


# direct methods
.method public constructor <init>(Lbf/o;Lef/c;)V
    .locals 0

    invoke-direct {p0}, Lbf/b1;-><init>()V

    iput-object p1, p0, Lbf/j;->a:Lbf/o;

    iput-object p2, p0, Lbf/j;->b:Lef/c;

    return-void
.end method

.method public static d(Lbf/o;Lef/c;)Lbf/j;
    .locals 2

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lef/c;->c()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lbf/o;->f()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v0

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-static {v1}, Lwe/e;->j([B)[B

    move-result-object v1

    invoke-static {v1}, Lwe/e;->v([B)[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lbf/j;

    invoke-direct {v0, p0, p1}, Lbf/j;-><init>(Lbf/o;Lef/c;)V

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

    invoke-virtual {p1}, Lef/c;->c()I

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
.method public bridge synthetic c()Lbf/c1;
    .locals 1

    invoke-virtual {p0}, Lbf/j;->g()Lbf/o;

    move-result-object v0

    return-object v0
.end method

.method public e()Lbf/i;
    .locals 1

    iget-object v0, p0, Lbf/j;->a:Lbf/o;

    invoke-virtual {v0}, Lbf/o;->e()Lbf/i;

    move-result-object v0

    return-object v0
.end method

.method public f()Lef/c;
    .locals 1

    iget-object v0, p0, Lbf/j;->b:Lef/c;

    return-object v0
.end method

.method public g()Lbf/o;
    .locals 1

    iget-object v0, p0, Lbf/j;->a:Lbf/o;

    return-object v0
.end method
