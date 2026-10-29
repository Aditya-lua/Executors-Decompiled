.class public Ldf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/w;


# static fields
.field public static final e:[B


# instance fields
.field public final a:Lze/a;

.field public final b:I

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Ldf/t;->e:[B

    return-void
.end method

.method public constructor <init>(Lxe/a;)V
    .locals 3

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ldf/r;

    invoke-virtual {p1}, Lxe/a;->c()Lef/c;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ldf/r;-><init>([B)V

    iput-object v0, p0, Ldf/t;->a:Lze/a;

    .line 10
    invoke-virtual {p1}, Lxe/a;->e()Lxe/f;

    move-result-object v0

    invoke-virtual {v0}, Lxe/f;->c()I

    move-result v0

    iput v0, p0, Ldf/t;->b:I

    .line 11
    invoke-virtual {p1}, Lxe/a;->d()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v0

    iput-object v0, p0, Ldf/t;->c:[B

    .line 12
    invoke-virtual {p1}, Lxe/a;->e()Lxe/f;

    move-result-object p1

    invoke-virtual {p1}, Lxe/f;->f()Lxe/f$c;

    move-result-object p1

    sget-object v0, Lxe/f$c;->d:Lxe/f$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    sget-object p1, Ldf/t;->e:[B

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ldf/t;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 14
    new-array p1, p1, [B

    iput-object p1, p0, Ldf/t;->d:[B

    return-void
.end method

.method public constructor <init>(Lxe/i;)V
    .locals 6

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ldf/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HMAC"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {p1}, Lxe/i;->e()Lxe/o;

    move-result-object v3

    invoke-virtual {v3}, Lxe/o;->d()Lxe/o$c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    .line 18
    invoke-virtual {p1}, Lxe/i;->c()Lef/c;

    move-result-object v4

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v0, v1, v3}, Ldf/s;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    iput-object v0, p0, Ldf/t;->a:Lze/a;

    .line 19
    invoke-virtual {p1}, Lxe/i;->e()Lxe/o;

    move-result-object v0

    invoke-virtual {v0}, Lxe/o;->c()I

    move-result v0

    iput v0, p0, Ldf/t;->b:I

    .line 20
    invoke-virtual {p1}, Lxe/i;->d()Lef/a;

    move-result-object v0

    invoke-virtual {v0}, Lef/a;->d()[B

    move-result-object v0

    iput-object v0, p0, Ldf/t;->c:[B

    .line 21
    invoke-virtual {p1}, Lxe/i;->e()Lxe/o;

    move-result-object p1

    invoke-virtual {p1}, Lxe/o;->g()Lxe/o$d;

    move-result-object p1

    sget-object v0, Lxe/o$d;->d:Lxe/o$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 22
    sget-object p1, Ldf/t;->e:[B

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ldf/t;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 23
    new-array p1, p1, [B

    iput-object p1, p0, Ldf/t;->d:[B

    return-void
.end method

.method public constructor <init>(Lze/a;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldf/t;->a:Lze/a;

    .line 3
    iput p2, p0, Ldf/t;->b:I

    const/4 v0, 0x0

    .line 4
    new-array v1, v0, [B

    iput-object v1, p0, Ldf/t;->c:[B

    .line 5
    new-array v1, v0, [B

    iput-object v1, p0, Ldf/t;->d:[B

    const/16 v1, 0xa

    if-lt p2, v1, :cond_0

    .line 6
    new-array v0, v0, [B

    invoke-interface {p1, v0, p2}, Lze/a;->a([BI)[B

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "tag size too small, need at least 10 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lxe/a;)Lpe/w;
    .locals 1

    new-instance v0, Ldf/t;

    invoke-direct {v0, p0}, Ldf/t;-><init>(Lxe/a;)V

    return-object v0
.end method

.method public static d(Lxe/i;)Lpe/w;
    .locals 1

    new-instance v0, Ldf/t;

    invoke-direct {v0, p0}, Ldf/t;-><init>(Lxe/i;)V

    return-object v0
.end method


# virtual methods
.method public a([B[B)V
    .locals 0

    invoke-virtual {p0, p2}, Ldf/t;->b([B)[B

    move-result-object p2

    invoke-static {p2, p1}, Ldf/e;->b([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B)[B
    .locals 3

    iget-object v0, p0, Ldf/t;->d:[B

    array-length v1, v0

    if-lez v1, :cond_0

    iget-object v1, p0, Ldf/t;->c:[B

    iget-object v2, p0, Ldf/t;->a:Lze/a;

    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    iget v0, p0, Ldf/t;->b:I

    invoke-interface {v2, p1, v0}, Lze/a;->a([BI)[B

    move-result-object p1

    filled-new-array {v1, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ldf/t;->c:[B

    iget-object v1, p0, Ldf/t;->a:Lze/a;

    iget v2, p0, Ldf/t;->b:I

    invoke-interface {v1, p1, v2}, Lze/a;->a([BI)[B

    move-result-object p1

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
