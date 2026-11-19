.class public final Lse/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# static fields
.field public static final d:[B

.field public static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lre/x;

.field public final c:Lre/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lse/i0;->d:[B

    invoke-static {}, Lse/i0;->g()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lse/i0;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcf/h0;Lre/a;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lse/i0;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lse/i0;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lse/i0;->e(Lcf/h0;)Lre/x;

    move-result-object p1

    iput-object p1, p0, Lse/i0;->b:Lre/x;

    iput-object p2, p0, Lse/i0;->c:Lre/a;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported DEK key type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Only Tink AEAD key types are supported."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static d(Lse/c;Lre/a;)Lre/a;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lre/h0;->b(Lre/x;)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Lcf/h0;->j0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lcf/h0;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lse/i0;

    invoke-direct {v0, p0, p1}, Lse/i0;-><init>(Lcf/h0;Lre/a;)V

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lse/i0;->e:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static g()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v0

    iget-object v1, p0, Lse/i0;->b:Lre/x;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lye/w;->c(Lre/x;Ljava/lang/Integer;)Lre/l;

    move-result-object v0

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v1

    const-class v2, Lye/l0;

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lye/d0;->n(Lre/l;Ljava/lang/Class;Lre/d0;)Lye/p0;

    move-result-object v1

    check-cast v1, Lye/l0;

    invoke-virtual {v1}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v1

    iget-object v2, p0, Lse/i0;->c:Lre/a;

    sget-object v3, Lse/i0;->d:[B

    invoke-interface {v2, v1, v3}, Lre/a;->a([B[B)[B

    move-result-object v1

    array-length v2, v1

    const/16 v3, 0x1000

    if-gt v2, v3, :cond_0

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v2

    const-class v3, Lre/a;

    invoke-virtual {v2, v0, v3}, Lye/a0;->b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/a;

    invoke-interface {v0, p1, p2}, Lre/a;->a([B[B)[B

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lse/i0;->c([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "length of encrypted DEK too large"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B[B)[B
    .locals 5

    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    if-lez v1, :cond_0

    const/16 v2, 0x1000

    if-gt v1, v2, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    if-gt v1, p1, :cond_0

    new-array p1, v1, [B

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lse/i0;->c:Lre/a;

    sget-object v2, Lse/i0;->d:[B

    invoke-interface {v0, p1, v2}, Lre/a;->b([B[B)[B

    move-result-object p1

    iget-object v0, p0, Lse/i0;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v2, Lcf/f0$c;->c:Lcf/f0$c;

    sget-object v3, Lcf/p0;->e:Lcf/p0;

    const/4 v4, 0x0

    invoke-static {v0, p1, v2, v3, v4}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lye/d0;->f(Lye/p0;Lre/d0;)Lre/l;

    move-result-object p1

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    const-class v2, Lre/a;

    invoke-virtual {v0, p1, v2}, Lye/a0;->b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lre/a;

    invoke-interface {p1, v1, p2}, Lre/a;->b([B[B)[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "length of encrypted DEK too large"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p2, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ciphertext"

    invoke-direct {p2, v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final c([B[B)[B
    .locals 2

    array-length v0, p1

    add-int/lit8 v0, v0, 0x4

    array-length v1, p2

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcf/h0;)Lre/x;
    .locals 1

    invoke-static {p1}, Lcf/h0;->i0(Lcf/h0;)Lcf/h0$b;

    move-result-object p1

    sget-object v0, Lcf/p0;->e:Lcf/p0;

    invoke-virtual {p1, v0}, Lcf/h0$b;->D(Lcf/p0;)Lcf/h0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/h0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p1

    invoke-static {p1}, Lre/h0;->a([B)Lre/x;

    move-result-object p1

    return-object p1
.end method
