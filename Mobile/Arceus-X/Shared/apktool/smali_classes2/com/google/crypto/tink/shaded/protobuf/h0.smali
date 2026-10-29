.class public final Lcom/google/crypto/tink/shaded/protobuf/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/g0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Object;J)Lcom/google/crypto/tink/shaded/protobuf/a0$i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/q1;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;J)V
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/h0;->d(Ljava/lang/Object;J)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->j()V

    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation

    invoke-static {p1, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/h0;->d(Ljava/lang/Object;J)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    invoke-static {p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/h0;->d(Ljava/lang/Object;J)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object p2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_1

    if-lez v2, :cond_1

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->n()Z

    move-result v3

    if-nez v3, :cond_0

    add-int/2addr v2, v1

    invoke-interface {v0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-lez v1, :cond_2

    move-object p2, v0

    :cond_2
    invoke-static {p1, p3, p4, p2}, Lcom/google/crypto/tink/shaded/protobuf/q1;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Object;J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/h0;->d(Ljava/lang/Object;J)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->n()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/google/crypto/tink/shaded/protobuf/q1;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    return-object v0
.end method
