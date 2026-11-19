.class public final Lff/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/i$a;
    }
.end annotation


# static fields
.field public static final e:Lwe/b$b;


# instance fields
.field public final a:[B

.field public final b:[B

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    sput-object v0, Lff/i;->e:Lwe/b$b;

    return-void
.end method

.method public constructor <init>([B[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lff/i;->e:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lye/e;->j([B)[B

    move-result-object p1

    iput-object p1, p0, Lff/i;->a:[B

    invoke-static {p1}, Lye/e;->v([B)[B

    move-result-object p1

    iput-object p1, p0, Lff/i;->b:[B

    iput-object p2, p0, Lff/i;->c:[B

    iput-object p3, p0, Lff/i;->d:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Given private key\'s length is not %s"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ldf/j;)Lre/z;
    .locals 4

    new-instance v0, Lff/i;

    invoke-virtual {p0}, Ldf/j;->f()Lgf/c;

    move-result-object v1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v1

    invoke-virtual {p0}, Ldf/b1;->b()Lgf/a;

    move-result-object v2

    invoke-virtual {v2}, Lgf/a;->d()[B

    move-result-object v2

    invoke-virtual {p0}, Ldf/j;->e()Ldf/i;

    move-result-object p0

    invoke-virtual {p0}, Ldf/i;->c()Ldf/i$a;

    move-result-object p0

    sget-object v3, Ldf/i$a;->d:Ldf/i$a;

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v3, 0x0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    new-array p0, p0, [B

    aput-byte v3, p0, v3

    goto :goto_0

    :cond_0
    new-array p0, v3, [B

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lff/i;-><init>([B[B[B)V

    return-object v0
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    iget-object v0, p0, Lff/i;->d:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lff/i;->c([B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lff/i;->c([B)[B

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lff/i;->c:[B

    array-length v1, v0

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final c([B)[B
    .locals 2

    iget-object v0, p0, Lff/i;->b:[B

    iget-object v1, p0, Lff/i;->a:[B

    invoke-static {p1, v0, v1}, Lye/e;->x([B[B[B)[B

    move-result-object p1

    return-object p1
.end method
