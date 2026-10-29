.class public final Lxe/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Lxe/o$c;

.field public d:Lxe/o$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lxe/o$b;->a:Ljava/lang/Integer;

    .line 4
    iput-object v0, p0, Lxe/o$b;->b:Ljava/lang/Integer;

    .line 5
    iput-object v0, p0, Lxe/o$b;->c:Lxe/o$c;

    .line 6
    sget-object v0, Lxe/o$d;->e:Lxe/o$d;

    iput-object v0, p0, Lxe/o$b;->d:Lxe/o$d;

    return-void
.end method

.method public synthetic constructor <init>(Lxe/o$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxe/o$b;-><init>()V

    return-void
.end method

.method public static f(ILxe/o$c;)V
    .locals 1

    const/16 v0, 0xa

    if-lt p0, v0, :cond_a

    sget-object v0, Lxe/o$c;->b:Lxe/o$c;

    if-ne p1, v0, :cond_1

    const/16 p1, 0x14

    if-gt p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v0, Lxe/o$c;->c:Lxe/o$c;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x1c

    if-gt p0, p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v0, Lxe/o$c;->d:Lxe/o$c;

    if-ne p1, v0, :cond_5

    const/16 p1, 0x20

    if-gt p0, p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    sget-object v0, Lxe/o$c;->e:Lxe/o$c;

    if-ne p1, v0, :cond_7

    const/16 p1, 0x30

    if-gt p0, p1, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    sget-object v0, Lxe/o$c;->f:Lxe/o$c;

    if-ne p1, v0, :cond_9

    const/16 p1, 0x40

    if-gt p0, p1, :cond_8

    :goto_0
    return-void

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Invalid tag size in bytes %d; must be at least 10 bytes"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lxe/o;
    .locals 8

    iget-object v0, p0, Lxe/o$b;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lxe/o$b;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lxe/o$b;->c:Lxe/o$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lxe/o$b;->d:Lxe/o$d;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lxe/o$b;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lxe/o$b;->c:Lxe/o$c;

    invoke-static {v0, v1}, Lxe/o$b;->f(ILxe/o$c;)V

    new-instance v2, Lxe/o;

    iget-object v0, p0, Lxe/o$b;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lxe/o$b;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lxe/o$b;->d:Lxe/o$d;

    iget-object v6, p0, Lxe/o$b;->c:Lxe/o$c;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lxe/o;-><init>(IILxe/o$d;Lxe/o$c;Lxe/o$a;)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    iget-object v1, p0, Lxe/o$b;->a:Ljava/lang/Integer;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lxe/o$c;)Lxe/o$b;
    .locals 0

    iput-object p1, p0, Lxe/o$b;->c:Lxe/o$c;

    return-object p0
.end method

.method public c(I)Lxe/o$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lxe/o$b;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(I)Lxe/o$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lxe/o$b;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public e(Lxe/o$d;)Lxe/o$b;
    .locals 0

    iput-object p1, p0, Lxe/o$b;->d:Lxe/o$d;

    return-object p0
.end method
