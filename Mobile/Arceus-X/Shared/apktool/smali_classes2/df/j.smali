.class public final Ldf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# static fields
.field public static final d:Lue/b$b;


# instance fields
.field public final a:Lef/a;

.field public final b:[B

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->a:Lue/b$b;

    sput-object v0, Ldf/j;->d:Lue/b$b;

    return-void
.end method

.method public constructor <init>([B[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ldf/j;->d:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lef/a;->a([B)Lef/a;

    move-result-object p1

    iput-object p1, p0, Ldf/j;->a:Lef/a;

    iput-object p2, p0, Ldf/j;->b:[B

    iput-object p3, p0, Ldf/j;->c:[B

    invoke-static {}, Lwe/e;->l()V

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

.method public static b(Lbf/o;)Lpe/a0;
    .locals 4

    sget-object v0, Ldf/j;->d:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ldf/j;

    invoke-virtual {p0}, Lbf/o;->f()Lef/a;

    move-result-object v1

    invoke-virtual {v1}, Lef/a;->d()[B

    move-result-object v1

    invoke-virtual {p0}, Lbf/o;->b()Lef/a;

    move-result-object v2

    invoke-virtual {v2}, Lef/a;->d()[B

    move-result-object v2

    invoke-virtual {p0}, Lbf/o;->e()Lbf/i;

    move-result-object p0

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

    move-result-object p0

    sget-object v3, Lbf/i$a;->d:Lbf/i$a;

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
    invoke-direct {v0, v1, v2, p0}, Ldf/j;-><init>([B[B[B)V

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

    iget-object v0, p0, Ldf/j;->a:Lef/a;

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v0

    invoke-static {p2, p1, v0}, Lwe/e;->A([B[B[B)Z

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

    iget-object v0, p0, Ldf/j;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    iget-object v1, p0, Ldf/j;->c:[B

    array-length v1, v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Ldf/j;->c([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldf/j;->c:[B

    array-length v1, v0

    if-eqz v1, :cond_1

    filled-new-array {p2, v0}, [[B

    move-result-object p2

    invoke-static {p2}, Ldf/e;->a([[B)[B

    move-result-object p2

    :cond_1
    iget-object v0, p0, Ldf/j;->b:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ldf/j;->c([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
