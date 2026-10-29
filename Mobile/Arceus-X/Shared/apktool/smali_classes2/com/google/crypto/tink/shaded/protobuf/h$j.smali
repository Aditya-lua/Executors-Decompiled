.class public Lcom/google/crypto/tink/shaded/protobuf/h$j;
.super Lcom/google/crypto/tink/shaded/protobuf/h$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public final e:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/h$i;-><init>(Lcom/google/crypto/tink/shaded/protobuf/h$a;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    return-void
.end method


# virtual methods
.method public final C(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/g;->a([BII)V

    return-void
.end method

.method public final D(Lcom/google/crypto/tink/shaded/protobuf/h;II)Z
    .locals 5

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    if-gt p3, v0, :cond_4

    add-int v0, p2, p3

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v1

    if-gt v0, v1, :cond_3

    instance-of v1, p1, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result p3

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result p1

    add-int/2addr p1, p2

    :goto_0
    if-ge p3, v3, :cond_1

    aget-byte p2, v0, p3

    aget-byte v4, v1, p1

    if-eq p2, v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 p3, p3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-virtual {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->u(II)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p0, v2, p3}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->u(II)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ran off end of other: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Length too large: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(I)B
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/crypto/tink/shaded/protobuf/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v1

    move-object v3, p1

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->t()I

    move-result v1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eq v0, v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->D(Lcom/google/crypto/tink/shaded/protobuf/h;II)Z

    move-result p1

    return p1

    :cond_5
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h([BIII)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public i(I)B
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final m()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->k([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    return-object v0
.end method

.method public final p(III)I
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {p1, v0, v1, p3}, Lcom/google/crypto/tink/shaded/protobuf/a0;->h(I[BII)I

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    array-length v0, v0

    return v0
.end method

.method public final u(II)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->d(III)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$e;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$j;->e:[B

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;->E()I

    move-result v2

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/h$e;-><init>([BII)V

    return-object v0
.end method
