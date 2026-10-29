.class public final Lcom/google/crypto/tink/shaded/protobuf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/e$b;
    }
.end annotation


# static fields
.field public static volatile a:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static A([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-virtual {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static B(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(I)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(I)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static C(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d(J)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d(J)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static D([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p1

    :cond_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, p1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static E(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_5

    const-string v1, ""

    if-nez v0, :cond_0

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, p2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    add-int/2addr p2, v0

    :goto_1
    if-ge p2, p3, :cond_4

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_3

    if-nez v0, :cond_2

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, p2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_4
    :goto_2
    return p2

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static F(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_7

    const-string v1, ""

    if-nez v0, :cond_0

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int v2, p2, v0

    invoke-static {p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/r1;->m([BII)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, p2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    move p2, v2

    :goto_1
    if-ge p2, p3, :cond_5

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_4

    if-nez v0, :cond_2

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    add-int v2, p2, v0

    invoke-static {p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/r1;->m([BII)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, p2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_5
    :goto_2
    return p2

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static G([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/r1;->e([BII)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static H(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 8

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result v0

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->c()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->k()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v6

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v0, v0, 0x4

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    add-int/2addr v2, v1

    iput v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/e;->a(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ne v2, v0, :cond_3

    move p2, v4

    :cond_2
    move v5, p3

    move-object v7, p5

    goto :goto_1

    :cond_3
    move-object v3, p1

    move v5, p3

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->H(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    goto :goto_0

    :goto_1
    iget p1, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    sub-int/2addr p1, v1

    iput p1, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    if-gt p2, v5, :cond_4

    if-ne v2, v0, :cond_4

    invoke-virtual {p4, p0, v6}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->h()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_5
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget p2, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz p2, :cond_8

    array-length p3, v3

    sub-int/2addr p3, p1

    if-gt p2, p3, :cond_7

    if-nez p2, :cond_6

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p4, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h;->f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p3

    invoke-virtual {p4, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    :goto_2
    add-int/2addr p1, p2

    return p1

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_9
    move-object v3, p1

    invoke-static {v3, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-wide p2, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    return p1

    :cond_b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->c()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static I(I[BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return v0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_4

    move p2, v0

    goto :goto_0

    :cond_4
    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return v0
.end method

.method public static J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->I(I[BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0
.end method

.method public static K(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static L(J[BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 7

    const-wide/16 v0, 0x7f

    and-long/2addr p0, v0

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    and-int/lit8 v1, p3, 0x7f

    int-to-long v1, v1

    const/4 v3, 0x7

    shl-long/2addr v1, v3

    or-long/2addr p0, v1

    move v1, v3

    :goto_0
    if-gez p3, :cond_0

    add-int/lit8 p3, v0, 0x1

    aget-byte v0, p2, v0

    add-int/2addr v1, v3

    and-int/lit8 v2, v0, 0x7f

    int-to-long v4, v2

    shl-long/2addr v4, v1

    or-long/2addr p0, v4

    move v6, v0

    move v0, p3

    move p3, v6

    goto :goto_0

    :cond_0
    iput-wide p0, p4, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    return v0
.end method

.method public static M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 5

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    int-to-long v1, p1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-ltz p1, :cond_0

    iput-wide v1, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    return v0

    :cond_0
    invoke-static {v1, v2, p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->L(J[BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0
.end method

.method public static N(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static O(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/v0;

    iget v0, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/e;->a(I)V

    move-object v1, p1

    move-object p1, p0

    move-object p0, v1

    invoke-virtual/range {p0 .. p6}, Lcom/google/crypto/tink/shaded/protobuf/v0;->d0(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget p2, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    iput-object p1, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p0
.end method

.method public static P(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 6

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->I(I[BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget p3, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    iget p4, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    invoke-static {p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->a(I)V

    add-int v4, v3, p3

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/g1;->h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)V

    iget p0, v5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    add-int/lit8 p0, p0, -0x1

    iput p0, v5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->e:I

    iput-object v1, v5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return v4

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static Q(I[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result v0

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p0, 0x5

    if-ne v0, p0, :cond_0

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->c()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_1
    and-int/lit8 p0, p0, -0x8

    or-int/lit8 p0, p0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p4, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ne v0, p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, p1, p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->Q(I[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    goto :goto_0

    :cond_3
    :goto_1
    if-gt p2, p3, :cond_4

    if-ne v0, p0, :cond_4

    return p2

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->h()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {p1, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget p1, p4, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr p0, p1

    return p0

    :cond_6
    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_7
    invoke-static {p1, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->c()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static a(I)V
    .locals 1

    sget v0, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ge p0, v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->i()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static b(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->e(Z)V

    :goto_1
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v5, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v5, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide v5, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    cmp-long v0, v5, v2

    if-eqz v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->e(Z)V

    goto :goto_1

    :cond_3
    :goto_3
    return p2
.end method

.method public static c([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static d(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_7

    array-length v1, p1

    sub-int/2addr v1, p2

    if-gt v0, v1, :cond_6

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    add-int/2addr p2, v0

    :goto_1
    if-ge p2, p3, :cond_5

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-ltz v0, :cond_4

    array-length v1, p1

    sub-int/2addr v1, p2

    if-gt v0, v1, :cond_3

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_5
    :goto_2
    return p2

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static e([BI)D
    .locals 0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static f(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->e([BI)D

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->d(D)V

    add-int/lit8 p2, p2, 0x8

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e;->e([BI)D

    move-result-wide v1

    invoke-virtual {p4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/m;->d(D)V

    add-int/lit8 p2, v0, 0x8

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static g(I[BIILcom/google/crypto/tink/shaded/protobuf/y$c;Lcom/google/crypto/tink/shaded/protobuf/y$e;Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/y$c<",
            "**>;",
            "Lcom/google/crypto/tink/shaded/protobuf/y$e<",
            "**>;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "Lcom/google/crypto/tink/shaded/protobuf/o1;",
            "Lcom/google/crypto/tink/shaded/protobuf/o1;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    iget-object v0, p4, Lcom/google/crypto/tink/shaded/protobuf/y$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/u;

    ushr-int/lit8 v2, p0, 0x3

    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->m()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:[I

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->a()Lcom/google/crypto/tink/shaded/protobuf/s1$b;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p0, p0, p3

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Type cannot be packed: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->g()Lcom/google/crypto/tink/shaded/protobuf/s1$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    new-instance v3, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    invoke-static {p1, p2, v3, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->z([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget-object p1, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b()Lcom/google/crypto/tink/shaded/protobuf/a0$d;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p4

    move-object v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/i1;->z(Ljava/lang/Object;ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/a0$d;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    iget-object p1, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p0

    :pswitch_1
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->y([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_2
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->x([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_3
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/f;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->s([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_4
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->u([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_5
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->v([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_6
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->z([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_7
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->A([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_8
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->w([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :pswitch_9
    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/m;-><init>()V

    invoke-static {p1, p2, p0, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->t([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-object p2, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p1

    :cond_0
    move-object v1, p4

    move-object v6, p6

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->a()Lcom/google/crypto/tink/shaded/protobuf/s1$b;

    move-result-object p0

    sget-object p4, Lcom/google/crypto/tink/shaded/protobuf/s1$b;->p:Lcom/google/crypto/tink/shaded/protobuf/s1$b;

    const/4 p6, 0x0

    if-ne p0, p4, :cond_2

    invoke-static {p1, p2, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b()Lcom/google/crypto/tink/shaded/protobuf/a0$d;

    move-result-object p0

    iget p1, p7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-interface {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a0$d;->a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c;

    move-result-object p0

    if-nez p0, :cond_1

    iget p0, p7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {v1, v2, p0, p6, v6}, Lcom/google/crypto/tink/shaded/protobuf/i1;->J(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    return p2

    :cond_1
    iget p0, p7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    goto/16 :goto_3

    :cond_2
    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/e$a;->a:[I

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->a()Lcom/google/crypto/tink/shaded/protobuf/s1$b;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p0, p0, p4

    packed-switch p0, :pswitch_data_1

    goto/16 :goto_3

    :pswitch_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c1;->a()Lcom/google/crypto/tink/shaded/protobuf/c1;

    move-result-object p0

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p0, p4}, Lcom/google/crypto/tink/shaded/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/g1;

    move-result-object v2

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->d()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {v2, p1, p2, p3, p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget-object p1, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    iget-object p2, p7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/u;->a(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p0

    :cond_3
    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->i(Lcom/google/crypto/tink/shaded/protobuf/u$b;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_4

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object p0

    iget-object p4, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p4, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    :cond_4
    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p7

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->P(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0

    :pswitch_b
    move p4, p2

    move v4, p3

    move-object v6, p7

    move-object p3, p1

    shl-int/lit8 p0, v2, 0x3

    or-int/lit8 p6, p0, 0x4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c1;->a()Lcom/google/crypto/tink/shaded/protobuf/c1;

    move-result-object p0

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/g1;

    move-result-object p2

    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->d()Z

    move-result p0

    if-eqz p0, :cond_5

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v5, p6

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->o(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget-object p1, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    iget-object p2, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/u;->a(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p0

    :cond_5
    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->i(Lcom/google/crypto/tink/shaded/protobuf/u$b;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_6

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    :cond_6
    move-object p1, p0

    move p5, v4

    move-object p7, v6

    invoke-static/range {p1 .. p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->O(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0

    :pswitch_c
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->D([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-object p6, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_d
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->c([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-object p6, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Shouldn\'t reach here."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_f
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide p0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p6

    goto/16 :goto_3

    :pswitch_10
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget p0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    goto/16 :goto_3

    :pswitch_11
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide p0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    const-wide/16 p3, 0x0

    cmp-long p0, p0, p3

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    goto :goto_0

    :cond_7
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p6

    goto :goto_3

    :pswitch_12
    move-object p3, p1

    move p4, p2

    invoke-static {p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    :goto_1
    add-int/lit8 p2, p4, 0x4

    goto :goto_3

    :pswitch_13
    move-object p3, p1

    move p4, p2

    invoke-static {p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p6

    :goto_2
    add-int/lit8 p2, p4, 0x8

    goto :goto_3

    :pswitch_14
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget p0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    goto :goto_3

    :pswitch_15
    move-object p3, p1

    move p4, p2

    move-object v6, p7

    invoke-static {p3, p4, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p2

    iget-wide p0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p6

    goto :goto_3

    :pswitch_16
    move-object p3, p1

    move p4, p2

    invoke-static {p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->m([BI)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p6

    goto :goto_1

    :pswitch_17
    move-object p3, p1

    move p4, p2

    invoke-static {p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/e;->e([BI)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p6

    goto :goto_2

    :goto_3
    invoke-virtual {p5}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->d()Z

    move-result p0

    if-eqz p0, :cond_8

    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p0, p6}, Lcom/google/crypto/tink/shaded/protobuf/u;->a(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p2

    :cond_8
    iget-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0, p0, p6}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    return p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static h(I[BIILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "Lcom/google/crypto/tink/shaded/protobuf/o1;",
            "Lcom/google/crypto/tink/shaded/protobuf/o1;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    ushr-int/lit8 v0, p0, 0x3

    iget-object v1, p7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->d:Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-virtual {v1, p5, v0}, Lcom/google/crypto/tink/shaded/protobuf/p;->a(Lcom/google/crypto/tink/shaded/protobuf/s0;I)Lcom/google/crypto/tink/shaded/protobuf/y$e;

    move-result-object p5

    if-nez p5, :cond_0

    invoke-static {p4}, Lcom/google/crypto/tink/shaded/protobuf/v0;->w(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v4

    move v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v5, p7

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->H(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0

    :cond_0
    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/y$c;

    invoke-virtual {p4}, Lcom/google/crypto/tink/shaded/protobuf/y$c;->Z()Lcom/google/crypto/tink/shaded/protobuf/u;

    invoke-static/range {p0 .. p7}, Lcom/google/crypto/tink/shaded/protobuf/e;->g(I[BIILcom/google/crypto/tink/shaded/protobuf/y$c;Lcom/google/crypto/tink/shaded/protobuf/y$e;Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    return p0
.end method

.method public static i([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static j(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    add-int/lit8 p2, p2, 0x4

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result p2

    invoke-virtual {p4, p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    add-int/lit8 p2, v0, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static k([BI)J
    .locals 7

    aget-byte v0, p0, p1

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p1, 0x1

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x2

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x3

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x4

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x5

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p1, 0x6

    aget-byte v4, p0, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p1, p1, 0x7

    aget-byte p0, p0, p1

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static l(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    add-int/lit8 p2, p2, 0x8

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide v1

    invoke-virtual {p4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    add-int/lit8 p2, v0, 0x8

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static m([BI)F
    .locals 0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static n(I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-static {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/e;->m([BI)F

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->d(F)V

    add-int/lit8 p2, p2, 0x4

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/e;->m([BI)F

    move-result p2

    invoke-virtual {p4, p2}, Lcom/google/crypto/tink/shaded/protobuf/w;->d(F)V

    add-int/lit8 p2, v0, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static o(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 7

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->O(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    invoke-interface {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->b(Ljava/lang/Object;)V

    iput-object v0, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p0
.end method

.method public static p(Lcom/google/crypto/tink/shaded/protobuf/g1;I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            "I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    and-int/lit8 v0, p1, -0x8

    or-int/lit8 v5, v0, 0x4

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->o(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget-object p2, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-interface {p5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p0, v4, :cond_1

    invoke-static {v2, p0, v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v3

    iget p2, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/e;->o(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    iget-object p2, v6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-interface {p5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 6

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/e;->P(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p0

    invoke-interface {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/g1;->b(Ljava/lang/Object;)V

    iput-object v0, v5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    return p0
.end method

.method public static r(Lcom/google/crypto/tink/shaded/protobuf/g1;I[BIILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/g1<",
            "*>;I[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    invoke-static {p0, p2, p3, p4, p6}, Lcom/google/crypto/tink/shaded/protobuf/e;->q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p3

    iget-object v0, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p3, p4, :cond_1

    invoke-static {p2, p3, p6}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v0

    iget v1, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    if-eq p1, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0, p2, v0, p4, p6}, Lcom/google/crypto/tink/shaded/protobuf/e;->q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p3

    iget-object v0, p6, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return p3
.end method

.method public static s([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_1

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/f;->e(Z)V

    goto :goto_0

    :cond_1
    if-ne p1, v0, :cond_2

    return p1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static t([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->e([BI)D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->d(D)V

    add-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static u([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->i([BI)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    add-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static v([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->k([BI)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    add-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static w([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e;->m([BI)F

    move-result v0

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->d(F)V

    add-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static x([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(I)I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static y([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->M([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->b:J

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d(J)J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->e(J)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method

.method public static z([BILcom/google/crypto/tink/shaded/protobuf/a0$i;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")I"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p1

    iget v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->m()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    throw p0
.end method
