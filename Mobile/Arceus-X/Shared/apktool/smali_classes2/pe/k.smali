.class public final Lpe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/r;


# static fields
.field public static final c:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Ljava/io/InputStream;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lpe/k;->c:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpe/k;->b:Z

    iput-object p1, p0, Lpe/k;->a:Ljava/io/InputStream;

    return-void
.end method

.method public static c(Lkg/l;)I
    .locals 4

    invoke-virtual {p0}, Lkg/l;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkg/l;->h()Lkg/r;

    move-result-object v0

    invoke-virtual {v0}, Lkg/r;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkg/l;->h()Lkg/r;

    move-result-object p0

    invoke-virtual {p0}, Lkg/r;->k()Ljava/lang/Number;

    move-result-object p0

    :try_start_0
    invoke-static {p0}, Lwe/k;->a(Ljava/lang/Number;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide v2, 0xffffffffL

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    const-wide/32 v2, -0x80000000

    cmp-long p0, v0, v2

    if-ltz p0, :cond_0

    long-to-int p0, v0

    return p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "invalid key id"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "invalid key id: not a JSON number"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "invalid key id: not a JSON primitive"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Ljava/lang/String;)Laf/f0$c;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ASYMMETRIC_PUBLIC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "ASYMMETRIC_PRIVATE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "SYMMETRIC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "REMOTE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkg/p;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown key material type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Laf/f0$c;->e:Laf/f0$c;

    return-object p0

    :pswitch_1
    sget-object p0, Laf/f0$c;->d:Laf/f0$c;

    return-object p0

    :pswitch_2
    sget-object p0, Laf/f0$c;->c:Laf/f0$c;

    return-object p0

    :pswitch_3
    sget-object p0, Laf/f0$c;->f:Laf/f0$c;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x702213ba -> :sswitch_3
        -0x5feeace9 -> :sswitch_2
        0xedb0e1a -> :sswitch_1
        0x5b7856d2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Ljava/lang/String;)Laf/p0;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "CRUNCHY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "TINK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "RAW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "LEGACY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkg/p;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown output prefix type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Laf/p0;->f:Laf/p0;

    return-object p0

    :pswitch_1
    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :pswitch_2
    sget-object p0, Laf/p0;->e:Laf/p0;

    return-object p0

    :pswitch_3
    sget-object p0, Laf/p0;->d:Laf/p0;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a621837 -> :sswitch_3
        0x13c08 -> :sswitch_2
        0x274af2 -> :sswitch_1
        0x69012c4c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Ljava/lang/String;)Laf/g0;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "DISABLED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "DESTROYED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "ENABLED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkg/p;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Laf/g0;->d:Laf/g0;

    return-object p0

    :pswitch_1
    sget-object p0, Laf/g0;->e:Laf/g0;

    return-object p0

    :pswitch_2
    sget-object p0, Laf/g0;->c:Laf/g0;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3524e8df -> :sswitch_2
        0x1c83a5f9 -> :sswitch_1
        0x3ecc2a7c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static i(Lkg/o;)Laf/k0$c;
    .locals 2

    invoke-static {}, Laf/k0$c;->e0()Laf/k0$c$a;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {p0, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-virtual {v1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lpe/k;->f(Ljava/lang/String;)Laf/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->E(Laf/g0;)Laf/k0$c$a;

    move-result-object v0

    const-string v1, "keyId"

    invoke-virtual {p0, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-static {v1}, Lpe/k;->c(Lkg/l;)I

    move-result v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->C(I)Laf/k0$c$a;

    move-result-object v0

    const-string v1, "outputPrefixType"

    invoke-virtual {p0, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-virtual {v1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lpe/k;->e(Ljava/lang/String;)Laf/p0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/k0$c$a;->D(Laf/p0;)Laf/k0$c$a;

    move-result-object v0

    const-string v1, "typeUrl"

    invoke-virtual {p0, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object p0

    invoke-virtual {p0}, Lkg/l;->l()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/k0$c$a;->G(Ljava/lang/String;)Laf/k0$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/k0$c;

    return-object p0
.end method

.method public static k(Lkg/o;)Laf/k0;
    .locals 3

    invoke-static {}, Laf/k0;->e0()Laf/k0$b;

    move-result-object v0

    const-string v1, "primaryKeyId"

    invoke-virtual {p0, v1}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-static {v1}, Lpe/k;->c(Lkg/l;)I

    move-result v1

    invoke-virtual {v0, v1}, Laf/k0$b;->D(I)Laf/k0$b;

    :cond_0
    const-string v1, "keyInfo"

    invoke-virtual {p0, v1}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Lkg/o;->F(Ljava/lang/String;)Lkg/i;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lkg/i;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lkg/i;->A(I)Lkg/l;

    move-result-object v2

    invoke-virtual {v2}, Lkg/l;->g()Lkg/o;

    move-result-object v2

    invoke-static {v2}, Lpe/k;->i(Lkg/o;)Laf/k0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Laf/k0$b;->C(Laf/k0$c;)Laf/k0$b;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/k0;

    return-object p0
.end method

.method public static l(Lkg/o;)V
    .locals 1

    const-string v0, "encryptedKeyset"

    invoke-virtual {p0, v0}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lkg/p;

    const-string v0, "invalid encrypted keyset"

    invoke-direct {p0, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m(Ljava/lang/String;)Lpe/k;
    .locals 3

    new-instance v0, Lpe/k;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    sget-object v2, Lpe/k;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Lpe/k;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method


# virtual methods
.method public a()Laf/a0;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    invoke-static {v1}, Lpe/i0;->c(Ljava/io/InputStream;)[B

    move-result-object v1

    sget-object v2, Lpe/k;->c:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v0}, Lwe/k;->c(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->g()Lkg/o;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpe/k;->b(Lkg/o;)Laf/a0;

    move-result-object v0
    :try_end_0
    .catch Lkg/p; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_1
    throw v0
.end method

.method public final b(Lkg/o;)Laf/a0;
    .locals 3

    invoke-static {p1}, Lpe/k;->l(Lkg/o;)V

    iget-boolean v0, p0, Lpe/k;->b:Z

    const-string v1, "encryptedKeyset"

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldf/d;->e(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldf/d;->a(Ljava/lang/String;)[B

    move-result-object v0

    :goto_0
    const-string v1, "keysetInfo"

    invoke-virtual {p1, v1}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Laf/a0;->f0()Laf/a0$b;

    move-result-object v2

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v2, v0}, Laf/a0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/a0$b;

    move-result-object v0

    invoke-virtual {p1, v1}, Lkg/o;->G(Ljava/lang/String;)Lkg/o;

    move-result-object p1

    invoke-static {p1}, Lpe/k;->k(Lkg/o;)Laf/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/a0$b;->E(Laf/k0;)Laf/a0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/a0;

    return-object p1

    :cond_1
    invoke-static {}, Laf/a0;->f0()Laf/a0$b;

    move-result-object p1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p1, v0}, Laf/a0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/a0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/a0;

    return-object p1
.end method

.method public final g(Lkg/o;)Laf/f0;
    .locals 4

    const-string v0, "typeUrl"

    invoke-virtual {p1, v0}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "value"

    invoke-virtual {p1, v1}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "keyMaterialType"

    invoke-virtual {p1, v2}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lpe/k;->b:Z

    if-eqz v3, :cond_0

    invoke-virtual {p1, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-virtual {v1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldf/d;->e(Ljava/lang/String;)[B

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-virtual {v1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldf/d;->a(Ljava/lang/String;)[B

    move-result-object v1

    :goto_0
    invoke-static {}, Laf/f0;->h0()Laf/f0$b;

    move-result-object v3

    invoke-virtual {p1, v0}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Laf/f0$b;->D(Ljava/lang/String;)Laf/f0$b;

    move-result-object v0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/f0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0$b;

    move-result-object v0

    invoke-virtual {p1, v2}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object p1

    invoke-virtual {p1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lpe/k;->d(Ljava/lang/String;)Laf/f0$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/f0$b;->C(Laf/f0$c;)Laf/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/f0;

    return-object p1

    :cond_1
    new-instance p1, Lkg/p;

    const-string v0, "invalid keyData"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lkg/o;)Laf/j0$c;
    .locals 5

    const-string v0, "keyData"

    invoke-virtual {p1, v0}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "status"

    invoke-virtual {p1, v1}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "keyId"

    invoke-virtual {p1, v2}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "outputPrefixType"

    invoke-virtual {p1, v3}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v0}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->t()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {}, Laf/j0$c;->j0()Laf/j0$c$a;

    move-result-object v4

    invoke-virtual {p1, v1}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v1

    invoke-virtual {v1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lpe/k;->f(Ljava/lang/String;)Laf/g0;

    move-result-object v1

    invoke-virtual {v4, v1}, Laf/j0$c$a;->J(Laf/g0;)Laf/j0$c$a;

    move-result-object v1

    invoke-virtual {p1, v2}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v2

    invoke-static {v2}, Lpe/k;->c(Lkg/l;)I

    move-result v2

    invoke-virtual {v1, v2}, Laf/j0$c$a;->E(I)Laf/j0$c$a;

    move-result-object v1

    invoke-virtual {p1, v3}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object p1

    invoke-virtual {p1}, Lkg/l;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lpe/k;->e(Ljava/lang/String;)Laf/p0;

    move-result-object p1

    invoke-virtual {v1, p1}, Laf/j0$c$a;->G(Laf/p0;)Laf/j0$c$a;

    move-result-object p1

    invoke-virtual {v0}, Lkg/l;->g()Lkg/o;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpe/k;->g(Lkg/o;)Laf/f0;

    move-result-object v0

    invoke-virtual {p1, v0}, Laf/j0$c$a;->D(Laf/f0;)Laf/j0$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/j0$c;

    return-object p1

    :cond_0
    new-instance p1, Lkg/p;

    const-string v0, "invalid key: keyData must be an object"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lkg/p;

    const-string v0, "invalid key"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j(Lkg/o;)Laf/j0;
    .locals 4

    const-string v0, "key"

    invoke-virtual {p1, v0}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->m()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lkg/l;->f()Lkg/i;

    move-result-object v0

    invoke-virtual {v0}, Lkg/i;->size()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Laf/j0;->i0()Laf/j0$b;

    move-result-object v1

    const-string v2, "primaryKeyId"

    invoke-virtual {p1, v2}, Lkg/o;->H(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, Lkg/o;->E(Ljava/lang/String;)Lkg/l;

    move-result-object p1

    invoke-static {p1}, Lpe/k;->c(Lkg/l;)I

    move-result p1

    invoke-virtual {v1, p1}, Laf/j0$b;->D(I)Laf/j0$b;

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, Lkg/i;->size()I

    move-result v2

    if-ge p1, v2, :cond_1

    invoke-virtual {v0, p1}, Lkg/i;->A(I)Lkg/l;

    move-result-object v2

    invoke-virtual {v2}, Lkg/l;->g()Lkg/o;

    move-result-object v2

    invoke-virtual {p0, v2}, Lpe/k;->h(Lkg/o;)Laf/j0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/j0$b;->C(Laf/j0$c;)Laf/j0$b;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/j0;

    return-object p1

    :cond_2
    new-instance p1, Lkg/p;

    const-string v0, "invalid keyset: key is empty"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lkg/p;

    const-string v0, "invalid keyset: key must be an array"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lkg/p;

    const-string v0, "invalid keyset: no key"

    invoke-direct {p1, v0}, Lkg/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public read()Laf/j0;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    invoke-static {v1}, Lpe/i0;->c(Ljava/io/InputStream;)[B

    move-result-object v1

    sget-object v2, Lpe/k;->c:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v0}, Lwe/k;->c(Ljava/lang/String;)Lkg/l;

    move-result-object v0

    invoke-virtual {v0}, Lkg/l;->g()Lkg/o;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpe/k;->j(Lkg/o;)Laf/j0;

    move-result-object v0
    :try_end_0
    .catch Lkg/p; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v1, p0, Lpe/k;->a:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_1
    throw v0
.end method
