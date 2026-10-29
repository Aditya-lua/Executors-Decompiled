.class public final Lcom/google/crypto/tink/shaded/protobuf/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/g1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/crypto/tink/shaded/protobuf/g1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/s0;

.field public final b:Lcom/google/crypto/tink/shaded/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final d:Lcom/google/crypto/tink/shaded/protobuf/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->c:Z

    iput-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    iput-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    return-void
.end method

.method private k(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;TT;)I"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->i(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private l(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/f1;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            "ET::",
            "Lcom/google/crypto/tink/shaded/protobuf/u$b<",
            "TET;>;>(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "TET;>;TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/f1;",
            "Lcom/google/crypto/tink/shaded/protobuf/p;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/n1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object v5

    :goto_0
    :try_start_0
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/f1;->A()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    move-object v1, p0

    move-object v6, p1

    move-object v4, p2

    move-object v2, p4

    move-object v3, p5

    :try_start_1
    invoke-virtual/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/w0;->n(Lcom/google/crypto/tink/shaded/protobuf/f1;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    move-object p4, v2

    move-object p5, v3

    move-object p2, v4

    move-object p1, v6

    goto :goto_0

    :cond_1
    invoke-virtual {v6, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v6, p1

    goto :goto_1

    :goto_2
    invoke-virtual {v6, p3, v7}, Lcom/google/crypto/tink/shaded/protobuf/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    throw p1
.end method

.method public static m(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/w0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/w0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i1;->G(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i1;->E(Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->o()Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-direct {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w0;->k(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->j()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    instance-of v1, v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->P()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->e()Lcom/google/crypto/tink/shaded/protobuf/s0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0$a;->d()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/u;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/u;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/e$b;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/y;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->k()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/y;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_0
    move-object v6, v1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y$c;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$c;->Z()Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    if-ge p3, p4, :cond_b

    invoke-static {p2, p3, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    sget p3, Lcom/google/crypto/tink/shaded/protobuf/s1;->a:I

    const/4 v3, 0x2

    if-eq v2, p3, :cond_3

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result p3

    if-ne p3, v3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    iget-object v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->d:Lcom/google/crypto/tink/shaded/protobuf/p;

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v5

    invoke-virtual {p3, v1, v3, v5}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/s0;I)Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/y$e;

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c1;->a()Lcom/google/crypto/tink/shaded/protobuf/c1;

    move-result-object p3

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/google/crypto/tink/shaded/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/g1;

    move-result-object p3

    invoke-static {p3, p2, v4, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/e;->q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p3

    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    iget-object v3, p5, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v3, p2

    move v5, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->H(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p3

    goto :goto_0

    :cond_2
    move v5, p4

    move-object v7, p5

    invoke-static {v2, p2, v4, v5, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->Q(I[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p3

    goto :goto_0

    :cond_3
    move v5, p4

    move-object v7, p5

    const/4 p3, 0x0

    move-object p4, v0

    :goto_1
    if-ge v4, v5, :cond_9

    invoke-static {p2, v4, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result p5

    iget v2, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v4

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result v8

    if-eq v4, v3, :cond_6

    const/4 v9, 0x3

    if-eq v4, v9, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c1;->a()Lcom/google/crypto/tink/shaded/protobuf/c1;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/crypto/tink/shaded/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/g1;

    move-result-object v2

    invoke-static {v2, p2, p5, v5, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->q(Lcom/google/crypto/tink/shaded/protobuf/g1;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    iget-object p5, v1, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    iget-object v2, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    invoke-virtual {p1, p5, v2}, Lcom/google/crypto/tink/shaded/protobuf/u;->x(Lcom/google/crypto/tink/shaded/protobuf/u$b;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    if-ne v8, v3, :cond_7

    invoke-static {p2, p5, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->c([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    iget-object p4, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->c:Ljava/lang/Object;

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_1

    :cond_6
    if-nez v8, :cond_7

    invoke-static {p2, p5, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->J([BILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    iget p3, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->a:I

    iget-object p5, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    iget-object v1, v7, Lcom/google/crypto/tink/shaded/protobuf/e$b;->d:Lcom/google/crypto/tink/shaded/protobuf/p;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {p5, v1, v2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/s0;I)Ljava/lang/Object;

    move-result-object p5

    move-object v1, p5

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/y$e;

    goto :goto_1

    :cond_7
    :goto_2
    sget v4, Lcom/google/crypto/tink/shaded/protobuf/s1;->b:I

    if-ne v2, v4, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {v2, p2, p5, v5, v7}, Lcom/google/crypto/tink/shaded/protobuf/e;->Q(I[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)I

    move-result v4

    goto :goto_1

    :cond_9
    move p5, v4

    :goto_3
    if-eqz p4, :cond_a

    invoke-static {p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/s1;->c(II)I

    move-result p3

    invoke-virtual {v6, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/o1;->n(ILjava/lang/Object;)V

    :cond_a
    move p3, p5

    move p4, v5

    move-object p5, v7

    goto/16 :goto_0

    :cond_b
    move v5, p4

    if-ne p3, v5, :cond_c

    return-void

    :cond_c
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->h()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    throw p1
.end method

.method public i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/f1;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/f1;",
            "Lcom/google/crypto/tink/shaded/protobuf/p;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/w0;->l(Lcom/google/crypto/tink/shaded/protobuf/n1;Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/f1;Lcom/google/crypto/tink/shaded/protobuf/p;)V

    return-void
.end method

.method public j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/t1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/u;->s()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/u$b;

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/u$b;->k()Lcom/google/crypto/tink/shaded/protobuf/s1$c;

    move-result-object v3

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/s1$c;->j:Lcom/google/crypto/tink/shaded/protobuf/s1$c;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/u$b;->f()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/u$b;->m()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v1, Lcom/google/crypto/tink/shaded/protobuf/d0$b;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/u$b;->getNumber()I

    move-result v2

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/d0$b;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/d0$b;->a()Lcom/google/crypto/tink/shaded/protobuf/d0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->e()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->b(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/u$b;->getNumber()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->b(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w0;->o(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    return-void
.end method

.method public final n(Lcom/google/crypto/tink/shaded/protobuf/f1;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            "ET::",
            "Lcom/google/crypto/tink/shaded/protobuf/u$b<",
            "TET;>;>(",
            "Lcom/google/crypto/tink/shaded/protobuf/f1;",
            "Lcom/google/crypto/tink/shaded/protobuf/p;",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "TET;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/u<",
            "TET;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;TUB;)Z"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->a()I

    move-result v0

    sget v1, Lcom/google/crypto/tink/shaded/protobuf/s1;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v0

    invoke-virtual {p3, p2, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/s0;I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->h(Lcom/google/crypto/tink/shaded/protobuf/f1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/u;)V

    return v3

    :cond_0
    invoke-virtual {p5, p6, p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->m(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/f1;I)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->D()Z

    move-result p1

    return p1

    :cond_2
    const/4 v0, 0x0

    move-object v1, v0

    :cond_3
    :goto_0
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->A()I

    move-result v4

    const v5, 0x7fffffff

    if-ne v4, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->a()I

    move-result v4

    sget v5, Lcom/google/crypto/tink/shaded/protobuf/s1;->c:I

    if-ne v4, v5, :cond_5

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->h()I

    move-result v2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w0;->a:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {p3, p2, v0, v2}, Lcom/google/crypto/tink/shaded/protobuf/q;->b(Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/s0;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_5
    sget v5, Lcom/google/crypto/tink/shaded/protobuf/s1;->d:I

    if-ne v4, v5, :cond_7

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->h(Lcom/google/crypto/tink/shaded/protobuf/f1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/u;)V

    goto :goto_0

    :cond_6
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->o()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    goto :goto_0

    :cond_7
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->D()Z

    move-result v4

    if-nez v4, :cond_3

    :goto_1
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/f1;->a()I

    move-result p1

    sget v4, Lcom/google/crypto/tink/shaded/protobuf/s1;->b:I

    if-ne p1, v4, :cond_a

    if-eqz v1, :cond_9

    if-eqz v0, :cond_8

    invoke-virtual {p3, v1, v0, p2, p4}, Lcom/google/crypto/tink/shaded/protobuf/q;->i(Lcom/google/crypto/tink/shaded/protobuf/h;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/u;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p5, p6, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->d(Ljava/lang/Object;ILcom/google/crypto/tink/shaded/protobuf/h;)V

    :cond_9
    :goto_2
    return v3

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    throw p1
.end method

.method public final o(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/t1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/n1;->s(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    return-void
.end method
