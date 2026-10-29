.class public final Lqe/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


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

.field public final b:Lpe/x;

.field public final c:Lpe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lqe/i0;->d:[B

    invoke-static {}, Lqe/i0;->g()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lqe/i0;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Laf/h0;Lpe/a;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqe/i0;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lqe/i0;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lqe/i0;->e(Laf/h0;)Lpe/x;

    move-result-object p1

    iput-object p1, p0, Lqe/i0;->b:Lpe/x;

    iput-object p2, p0, Lqe/i0;->c:Lpe/a;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported DEK key type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Only Tink AEAD key types are supported."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static d(Lqe/c;Lpe/a;)Lpe/a;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lpe/h0;->b(Lpe/x;)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Laf/h0;->j0([BLcom/google/crypto/tink/shaded/protobuf/p;)Laf/h0;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lqe/i0;

    invoke-direct {v0, p0, p1}, Lqe/i0;-><init>(Laf/h0;Lpe/a;)V

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lqe/i0;->e:Ljava/util/Set;

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

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v0

    iget-object v1, p0, Lqe/i0;->b:Lpe/x;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lwe/w;->c(Lpe/x;Ljava/lang/Integer;)Lpe/l;

    move-result-object v0

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v1

    const-class v2, Lwe/l0;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lwe/d0;->n(Lpe/l;Ljava/lang/Class;Lpe/d0;)Lwe/p0;

    move-result-object v1

    check-cast v1, Lwe/l0;

    invoke-virtual {v1}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v1

    iget-object v2, p0, Lqe/i0;->c:Lpe/a;

    sget-object v3, Lqe/i0;->d:[B

    invoke-interface {v2, v1, v3}, Lpe/a;->a([B[B)[B

    move-result-object v1

    array-length v2, v1

    const/16 v3, 0x1000

    if-gt v2, v3, :cond_0

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v2

    const-class v3, Lpe/a;

    invoke-virtual {v2, v0, v3}, Lwe/a0;->b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->a([B[B)[B

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lqe/i0;->c([B[B)[B

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

    iget-object v0, p0, Lqe/i0;->c:Lpe/a;

    sget-object v2, Lqe/i0;->d:[B

    invoke-interface {v0, p1, v2}, Lpe/a;->b([B[B)[B

    move-result-object p1

    iget-object v0, p0, Lqe/i0;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v2, Laf/f0$c;->c:Laf/f0$c;

    sget-object v3, Laf/p0;->e:Laf/p0;

    const/4 v4, 0x0

    invoke-static {v0, p1, v2, v3, v4}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lwe/d0;->f(Lwe/p0;Lpe/d0;)Lpe/l;

    move-result-object p1

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    const-class v2, Lpe/a;

    invoke-virtual {v0, p1, v2}, Lwe/a0;->b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpe/a;

    invoke-interface {p1, v1, p2}, Lpe/a;->b([B[B)[B

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

.method public final e(Laf/h0;)Lpe/x;
    .locals 1

    invoke-static {p1}, Laf/h0;->i0(Laf/h0;)Laf/h0$b;

    move-result-object p1

    sget-object v0, Laf/p0;->e:Laf/p0;

    invoke-virtual {p1, v0}, Laf/h0$b;->C(Laf/p0;)Laf/h0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/h0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p1

    invoke-static {p1}, Lpe/h0;->a([B)Lpe/x;

    move-result-object p1

    return-object p1
.end method
