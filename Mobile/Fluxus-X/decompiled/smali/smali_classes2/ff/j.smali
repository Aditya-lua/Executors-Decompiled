.class public final Lff/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# static fields
.field public static final d:Lwe/b$b;


# instance fields
.field public final a:Lgf/a;

.field public final b:[B

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    sput-object v0, Lff/j;->d:Lwe/b$b;

    return-void
.end method

.method public constructor <init>([B[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lff/j;->d:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lgf/a;->a([B)Lgf/a;

    move-result-object p1

    iput-object p1, p0, Lff/j;->a:Lgf/a;

    iput-object p2, p0, Lff/j;->b:[B

    iput-object p3, p0, Lff/j;->c:[B

    invoke-static {}, Lye/e;->l()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Given public key\'s length is not %s."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/security/GeneralSecurityException;

    const-string p3, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p2, p3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ldf/o;)Lre/a0;
    .locals 4

    sget-object v0, Lff/j;->d:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lff/j;

    invoke-virtual {p0}, Ldf/o;->f()Lgf/a;

    move-result-object v1

    invoke-virtual {v1}, Lgf/a;->d()[B

    move-result-object v1

    invoke-virtual {p0}, Ldf/o;->b()Lgf/a;

    move-result-object v2

    invoke-virtual {v2}, Lgf/a;->d()[B

    move-result-object v2

    invoke-virtual {p0}, Ldf/o;->e()Ldf/i;

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
    invoke-direct {v0, v1, v2, p0}, Lff/j;-><init>([B[B[B)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private c([B[B)V
    .locals 2

    array-length v0, p1

    const/16 v1, 0x40

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lff/j;->a:Lgf/a;

    invoke-virtual {v0}, Lgf/a;->d()[B

    move-result-object v0

    invoke-static {p2, p1, v0}, Lye/e;->A([B[B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Signature check failed."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "The length of the signature is not %s."

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Lff/j;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v1, p0, Lff/j;->c:[B

    array-length v1, v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Lff/j;->c([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lff/j;->c:[B

    array-length v1, v0

    if-eqz v1, :cond_1

    filled-new-array {p2, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Lff/e;->a([[B)[B

    move-result-object p2

    :cond_1
    iget-object v0, p0, Lff/j;->b:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lff/j;->c([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
