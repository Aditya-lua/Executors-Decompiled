.class public Lwe/e$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Lwe/e$d;

.field public final b:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lwe/e$d;

    invoke-direct {v0}, Lwe/e$d;-><init>()V

    const/16 v1, 0xa

    new-array v1, v1, [J

    invoke-direct {p0, v0, v1}, Lwe/e$e;-><init>(Lwe/e$d;[J)V

    return-void
.end method

.method public constructor <init>(Lwe/e$c;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lwe/e$e;-><init>()V

    .line 6
    invoke-static {p0, p1}, Lwe/e$e;->d(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    return-void
.end method

.method public constructor <init>(Lwe/e$d;[J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/e$e;->a:Lwe/e$d;

    .line 4
    iput-object p2, p0, Lwe/e$e;->b:[J

    return-void
.end method

.method public static synthetic a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;
    .locals 0

    invoke-static {p0, p1}, Lwe/e$e;->d(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b([B)Lwe/e$e;
    .locals 0

    invoke-static {p0}, Lwe/e$e;->c([B)Lwe/e$e;

    move-result-object p0

    return-object p0
.end method

.method public static c([B)Lwe/e$e;
    .locals 10

    const/16 v0, 0xa

    new-array v1, v0, [J

    invoke-static {p0}, Lwe/i;->c([B)[J

    move-result-object v2

    new-array v3, v0, [J

    const/4 v4, 0x0

    const-wide/16 v5, 0x1

    aput-wide v5, v3, v4

    new-array v4, v0, [J

    new-array v5, v0, [J

    new-array v6, v0, [J

    new-array v7, v0, [J

    new-array v8, v0, [J

    invoke-static {v5, v2}, Lwe/i;->k([J[J)V

    sget-object v9, Lwe/f;->a:[J

    invoke-static {v6, v5, v9}, Lwe/i;->f([J[J[J)V

    invoke-static {v5, v5, v3}, Lwe/i;->m([J[J[J)V

    invoke-static {v6, v6, v3}, Lwe/i;->o([J[J[J)V

    new-array v0, v0, [J

    invoke-static {v0, v6}, Lwe/i;->k([J[J)V

    invoke-static {v0, v0, v6}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v0}, Lwe/i;->k([J[J)V

    invoke-static {v1, v1, v6}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1, v5}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1}, Lwe/e;->b([J[J)V

    invoke-static {v1, v1, v0}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1, v5}, Lwe/i;->f([J[J[J)V

    invoke-static {v7, v1}, Lwe/i;->k([J[J)V

    invoke-static {v7, v7, v6}, Lwe/i;->f([J[J[J)V

    invoke-static {v8, v7, v5}, Lwe/i;->m([J[J[J)V

    invoke-static {v8}, Lwe/e;->c([J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v8, v7, v5}, Lwe/i;->o([J[J[J)V

    invoke-static {v8}, Lwe/e;->c([J)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lwe/f;->c:[J

    invoke-static {v1, v1, v0}, Lwe/i;->f([J[J[J)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-static {v1}, Lwe/e;->c([J)Z

    move-result v0

    const/16 v5, 0x1f

    if-nez v0, :cond_3

    aget-byte v0, p0, v5

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v0, v0, 0x7

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x\'s least significant bit is not zero"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-static {v1}, Lwe/e;->a([J)I

    move-result v0

    aget-byte p0, p0, v5

    and-int/lit16 p0, p0, 0xff

    shr-int/lit8 p0, p0, 0x7

    if-ne v0, p0, :cond_4

    invoke-static {v1, v1}, Lwe/e;->d([J[J)V

    :cond_4
    invoke-static {v4, v1, v2}, Lwe/i;->f([J[J[J)V

    new-instance p0, Lwe/e$e;

    new-instance v0, Lwe/e$d;

    invoke-direct {v0, v1, v2, v3}, Lwe/e$d;-><init>([J[J[J)V

    invoke-direct {p0, v0, v4}, Lwe/e$e;-><init>(Lwe/e$d;[J)V

    return-object p0
.end method

.method public static d(Lwe/e$e;Lwe/e$c;)Lwe/e$e;
    .locals 3

    iget-object v0, p0, Lwe/e$e;->a:Lwe/e$d;

    iget-object v0, v0, Lwe/e$d;->a:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v2, p1, Lwe/e$c;->b:[J

    invoke-static {v0, v1, v2}, Lwe/i;->f([J[J[J)V

    iget-object v0, p0, Lwe/e$e;->a:Lwe/e$d;

    iget-object v0, v0, Lwe/e$d;->b:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v2, v1, Lwe/e$d;->b:[J

    iget-object v1, v1, Lwe/e$d;->c:[J

    invoke-static {v0, v2, v1}, Lwe/i;->f([J[J[J)V

    iget-object v0, p0, Lwe/e$e;->a:Lwe/e$d;

    iget-object v0, v0, Lwe/e$d;->c:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->c:[J

    iget-object v2, p1, Lwe/e$c;->b:[J

    invoke-static {v0, v1, v2}, Lwe/i;->f([J[J[J)V

    iget-object v0, p0, Lwe/e$e;->b:[J

    iget-object p1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, p1, Lwe/e$d;->a:[J

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {v0, v1, p1}, Lwe/i;->f([J[J[J)V

    return-object p0
.end method
