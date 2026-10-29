.class public final Lpe/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lpe/i0;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Laf/j0$c;)Laf/k0$c;
    .locals 2

    invoke-static {}, Laf/k0$c;->e0()Laf/k0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->G(Ljava/lang/String;)Laf/k0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->E(Laf/g0;)Laf/k0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0$c;->g0()Laf/p0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->D(Laf/p0;)Laf/k0$c$a;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0$c;->f0()I

    move-result p0

    invoke-virtual {v0, p0}, Laf/k0$c$a;->C(I)Laf/k0$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/k0$c;

    return-object p0
.end method

.method public static b(Laf/j0;)Laf/k0;
    .locals 2

    invoke-static {}, Laf/k0;->e0()Laf/k0$b;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0;->h0()I

    move-result v1

    invoke-virtual {v0, v1}, Laf/k0$b;->D(I)Laf/k0$b;

    move-result-object v0

    invoke-virtual {p0}, Laf/j0;->g0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf/j0$c;

    invoke-static {v1}, Lpe/i0;->a(Laf/j0$c;)Laf/k0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$b;->C(Laf/k0$c;)Laf/k0$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/k0;

    return-object p0
.end method

.method public static c(Ljava/io/InputStream;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static d(Laf/j0$c;)V
    .locals 2

    invoke-virtual {p0}, Laf/j0$c;->i0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Laf/j0$c;->g0()Laf/p0;

    move-result-object v0

    sget-object v1, Laf/p0;->b:Laf/p0;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v0

    sget-object v1, Laf/g0;->b:Laf/g0;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Laf/j0$c;->f0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "key %d has unknown status"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Laf/j0$c;->f0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "key %d has unknown prefix"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Laf/j0$c;->f0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "key %d has no key data"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Laf/j0;)V
    .locals 9

    invoke-virtual {p0}, Laf/j0;->h0()I

    move-result v0

    invoke-virtual {p0}, Laf/j0;->g0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Laf/j0$c;

    invoke-virtual {v6}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v7

    sget-object v8, Laf/g0;->c:Laf/g0;

    if-eq v7, v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v6}, Lpe/i0;->d(Laf/j0$c;)V

    invoke-virtual {v6}, Laf/j0$c;->f0()I

    move-result v7

    if-ne v7, v0, :cond_2

    if-nez v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v6}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v6

    invoke-virtual {v6}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v6

    sget-object v7, Laf/f0$c;->e:Laf/f0$c;

    if-eq v6, v7, :cond_3

    move v5, v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_7

    if-nez v4, :cond_6

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_2
    return-void

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
