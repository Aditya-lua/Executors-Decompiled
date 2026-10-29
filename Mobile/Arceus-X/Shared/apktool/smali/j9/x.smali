.class public abstract Lj9/x;
.super Ln9/l1;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ln9/l1;-><init>()V

    array-length v0, p1

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ln9/m;->a(Z)V

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([B)I

    move-result p1

    iput p1, p0, Lj9/x;->a:I

    return-void
.end method

.method public static u2(Ljava/lang/String;)[B
    .locals 1

    :try_start_0
    const-string v0, "ISO-8859-1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ln9/m1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    check-cast p1, Ln9/m1;

    invoke-interface {p1}, Ln9/m1;->zze()I

    move-result v0

    iget v2, p0, Lj9/x;->a:I

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, Ln9/m1;->zzd()Ly9/a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Ly9/b;->t2(Ly9/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {p0}, Lj9/x;->t2()[B

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    return v1

    :goto_0
    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to get Google certificates from remote"

    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lj9/x;->a:I

    return v0
.end method

.method public abstract t2()[B
.end method

.method public final zzd()Ly9/a;
    .locals 1

    invoke-virtual {p0}, Lj9/x;->t2()[B

    move-result-object v0

    invoke-static {v0}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v0

    return-object v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lj9/x;->a:I

    return v0
.end method
