.class public final Leb/o2;
.super Leb/e2;
.source "SourceFile"


# instance fields
.field public final b:Ljava/security/MessageDigest;

.field public final c:I

.field public d:Z


# direct methods
.method public synthetic constructor <init>(Ljava/security/MessageDigest;ILeb/n2;)V
    .locals 0

    invoke-direct {p0}, Leb/e2;-><init>()V

    iput-object p1, p0, Leb/o2;->b:Ljava/security/MessageDigest;

    iput p2, p0, Leb/o2;->c:I

    return-void
.end method


# virtual methods
.method public final b([BII)V
    .locals 1

    invoke-virtual {p0}, Leb/o2;->c()V

    iget-object p2, p0, Leb/o2;->b:Ljava/security/MessageDigest;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Leb/o2;->d:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot re-use a Hasher after calling hash() on it"

    invoke-static {v0, v1}, Leb/n0;->f(ZLjava/lang/Object;)V

    return-void
.end method

.method public final zzc()Leb/i2;
    .locals 2

    invoke-virtual {p0}, Leb/o2;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/o2;->d:Z

    iget v0, p0, Leb/o2;->c:I

    iget-object v1, p0, Leb/o2;->b:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Leb/o2;->b:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    sget-object v1, Leb/i2;->a:[C

    new-instance v1, Leb/h2;

    invoke-direct {v1, v0}, Leb/h2;-><init>([B)V

    return-object v1

    :cond_0
    iget-object v1, p0, Leb/o2;->b:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    sget-object v1, Leb/i2;->a:[C

    new-instance v1, Leb/h2;

    invoke-direct {v1, v0}, Leb/h2;-><init>([B)V

    return-object v1
.end method
