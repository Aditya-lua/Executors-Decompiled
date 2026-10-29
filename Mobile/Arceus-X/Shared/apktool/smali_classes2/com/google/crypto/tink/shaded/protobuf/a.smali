.class public abstract Lcom/google/crypto/tink/shaded/protobuf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/crypto/tink/shaded/protobuf/a<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/crypto/tink/shaded/protobuf/a$a<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lcom/google/crypto/tink/shaded/protobuf/s0;"
    }
.end annotation


# instance fields
.field protected memoizedHashCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    return-void
.end method


# virtual methods
.method public b()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 3

    :try_start_0
    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->l(I)Lcom/google/crypto/tink/shaded/protobuf/h$h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h$h;->b()Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-interface {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->i(Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h$h;->a()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "ByteString"

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public g()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public j(Lcom/google/crypto/tink/shaded/protobuf/g1;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->g()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->d(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->m(I)V

    return p1

    :cond_0
    return v0
.end method

.method public final k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Serializing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " threw an IOException (should never happen)."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Lcom/google/crypto/tink/shaded/protobuf/m1;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/m1;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    return-object v0
.end method

.method public m(I)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public n()[B
    .locals 3

    :try_start_0
    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()I

    move-result v0

    new-array v0, v0, [B

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->f0([B)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-interface {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->i(Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "byte array"

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public o(Ljava/io/OutputStream;)V
    .locals 1

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->I(I)I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->e0(Ljava/io/OutputStream;I)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->i(Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->b0()V

    return-void
.end method
