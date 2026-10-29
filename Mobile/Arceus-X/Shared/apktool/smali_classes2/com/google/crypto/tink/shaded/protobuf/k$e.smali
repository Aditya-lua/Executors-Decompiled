.class public final Lcom/google/crypto/tink/shaded/protobuf/k$e;
.super Lcom/google/crypto/tink/shaded/protobuf/k$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final i:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;-><init>(I)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$e;->i:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public C0(ILcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->g1(Lcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    return-void
.end method

.method public D0(ILcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->P0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->e1(ILcom/google/crypto/tink/shaded/protobuf/s0;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    return-void
.end method

.method public E0(ILcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->P0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->l0(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    return-void
.end method

.method public N0(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->h1(Ljava/lang/String;)V

    return-void
.end method

.method public O0(II)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->c(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    return-void
.end method

.method public P0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Y0(I)V

    return-void
.end method

.method public Q0(I)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Y0(I)V

    return-void
.end method

.method public R0(IJ)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Z0(J)V

    return-void
.end method

.method public S0(J)V
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Z0(J)V

    return-void
.end method

.method public a([BII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->c1([BII)V

    return-void
.end method

.method public final a1()V
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$e;->i:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    return-void
.end method

.method public b0()V
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a1()V

    :cond_0
    return-void
.end method

.method public final b1(I)V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a1()V

    :cond_0
    return-void
.end method

.method public c1([BII)V
    .locals 3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    return-void

    :cond_0
    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a1()V

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$e;->i:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    return-void
.end method

.method public d1(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->C(Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-void
.end method

.method public e1(ILcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->f1(Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    return-void
.end method

.method public f1(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    invoke-interface {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->i(Lcom/google/crypto/tink/shaded/protobuf/k;)V

    return-void
.end method

.method public g1(Lcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/a;

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a;->j(Lcom/google/crypto/tink/shaded/protobuf/g1;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-interface {p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    return-void
.end method

.method public h1(Ljava/lang/String;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->W(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    if-le v2, v3, :cond_0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/r1;->f(Ljava/lang/String;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a([BII)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a1()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->W(I)I

    move-result v0

    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/r1$d; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    :try_start_1
    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    iget v4, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/crypto/tink/shaded/protobuf/r1;->f(Ljava/lang/String;[BII)I

    move-result v1

    iput v2, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Y0(I)V

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/r1;->g(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->Y0(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->e:[B

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    invoke-static {p1, v0, v1, v3}, Lcom/google/crypto/tink/shaded/protobuf/r1;->f(Ljava/lang/String;[BII)I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    :goto_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/r1$d; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :goto_1
    :try_start_2
    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/k$d;

    invoke-direct {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$d;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->h:I

    iput v2, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    throw v0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/r1$d; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->c0(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/r1$d;)V

    return-void
.end method

.method public i0(B)V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->g:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/k$b;->f:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->a1()V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->T0(B)V

    return-void
.end method

.method public j0(IZ)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->T0(B)V

    return-void
.end method

.method public l0(ILcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->O0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->d1(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public q0(II)V
    .locals 1

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->U0(I)V

    return-void
.end method

.method public r0(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->U0(I)V

    return-void
.end method

.method public s0(IJ)V
    .locals 1

    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->V0(J)V

    return-void
.end method

.method public t0(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->V0(J)V

    return-void
.end method

.method public y0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->b1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k$b;->W0(I)V

    return-void
.end method

.method public z0(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->Q0(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k$e;->S0(J)V

    return-void
.end method
