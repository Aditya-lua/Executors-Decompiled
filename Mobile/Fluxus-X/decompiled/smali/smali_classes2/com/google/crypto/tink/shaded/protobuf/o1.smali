.class public final Lcom/google/crypto/tink/shaded/protobuf/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lcom/google/crypto/tink/shaded/protobuf/o1;


# instance fields
.field public a:I

.field public b:[I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    const/4 v1, 0x0

    new-array v2, v1, [I

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/o1;-><init>(I[I[Ljava/lang/Object;Z)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/o1;->f:Lcom/google/crypto/tink/shaded/protobuf/o1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x8

    .line 1
    new-array v1, v0, [I

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v3, v1, v0, v2}, Lcom/google/crypto/tink/shaded/protobuf/o1;-><init>(I[I[Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->d:I

    .line 4
    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    .line 5
    iput-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    .line 6
    iput-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    .line 7
    iput-boolean p4, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    return-void
.end method

.method public static c()Lcom/google/crypto/tink/shaded/protobuf/o1;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/o1;->f:Lcom/google/crypto/tink/shaded/protobuf/o1;

    return-object v0
.end method

.method public static f([II)I
    .locals 3

    const/16 v0, 0x11

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    aget v2, p0, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static g([Ljava/lang/Object;I)I
    .locals 3

    const/16 v0, 0x11

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static j(Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/o1;)Lcom/google/crypto/tink/shaded/protobuf/o1;
    .locals 6

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget v1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iget-object v2, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget v4, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    const/4 v5, 0x0

    invoke-static {v2, v5, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget p0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget p1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    invoke-static {v3, v5, v2, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;-><init>(I[I[Ljava/lang/Object;Z)V

    return-object p0
.end method

.method public static k()Lcom/google/crypto/tink/shaded/protobuf/o1;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;-><init>()V

    return-object v0
.end method

.method public static l([Ljava/lang/Object;[Ljava/lang/Object;I)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p0, v1

    aget-object v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static o([I[II)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget v2, p0, v1

    aget v3, p1, v1

    if-eq v2, v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static q(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V
    .locals 2

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result p0

    if-eqz p0, :cond_5

    const/4 v1, 0x1

    if-eq p0, v1, :cond_4

    const/4 v1, 0x2

    if-eq p0, v1, :cond_3

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v1, 0x5

    if-ne p0, v1, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-interface {p2, v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/t1;->c(II)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->e()Lcom/google/crypto/tink/shaded/protobuf/b0$a;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p0

    :cond_1
    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/t1;->t()Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    move-result-object p0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/t1$a;->a:Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    if-ne p0, v1, :cond_2

    invoke-interface {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/t1;->x(I)V

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->r(Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    invoke-interface {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/t1;->C(I)V

    return-void

    :cond_2
    invoke-interface {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/t1;->C(I)V

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->r(Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    invoke-interface {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/t1;->x(I)V

    return-void

    :cond_3
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-interface {p2, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->M(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void

    :cond_4
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-interface {p2, v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->s(IJ)V

    return-void

    :cond_5
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-interface {p2, v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->u(IJ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    array-length v1, v0

    if-le p1, v1, :cond_2

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    div-int/lit8 v2, v1, 0x2

    add-int/2addr v1, v2

    if-ge v1, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/16 v1, 0x8

    if-ge p1, v1, :cond_1

    move p1, v1

    :cond_1
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public d()I
    .locals 6

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ge v0, v2, :cond_6

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v2, v2, v0

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v3

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->b(I)I

    move-result v2

    if-eqz v2, :cond_5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_4

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    const/4 v5, 0x3

    if-eq v2, v5, :cond_2

    const/4 v4, 0x5

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->m(II)I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->e()Lcom/google/crypto/tink/shaded/protobuf/b0$a;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->U(I)I

    move-result v2

    mul-int/2addr v2, v4

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v3, v3, v0

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->g(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v2

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/k;->o(IJ)I

    move-result v2

    goto :goto_1

    :cond_5
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/k;->X(IJ)I

    move-result v2

    goto :goto_1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->d:I

    return v1
.end method

.method public e()I
    .locals 4

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v2, v2, v0

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v3, v3, v0

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->J(ILcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->d:I

    return v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o1;

    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget v3, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ne v2, v3, :cond_4

    iget-object v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget-object v4, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    invoke-static {v3, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->o([I[II)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    invoke-static {v2, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/o1;->l([Ljava/lang/Object;[Ljava/lang/Object;I)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public h()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->e:Z

    :cond_0
    return-void
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    invoke-static {v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->f([II)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    invoke-static {v0, v2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->g([Ljava/lang/Object;I)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public i(Lcom/google/crypto/tink/shaded/protobuf/o1;)Lcom/google/crypto/tink/shaded/protobuf/o1;
    .locals 6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->a()V

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget v1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->b(I)V

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget v4, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    iget v3, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    iget p1, p1, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    invoke-static {v1, v5, v2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    return-object p0
.end method

.method public final m(Ljava/lang/StringBuilder;I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v1, v1, v0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {p1, p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/u0;->d(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n(ILjava/lang/Object;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->a()V

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/o1;->b(I)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    aput p1, v0, v1

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    return-void
.end method

.method public p(Lcom/google/crypto/tink/shaded/protobuf/t1;)V
    .locals 3

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->t()Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    move-result-object v0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/t1$a;->b:Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v1, v1, v0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-interface {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/t1;->b(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v1, v1, v0

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/s1;->a(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-interface {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/t1;->b(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public r(Lcom/google/crypto/tink/shaded/protobuf/t1;)V
    .locals 3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/t1;->t()Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    move-result-object v0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/t1$a;->a:Lcom/google/crypto/tink/shaded/protobuf/t1$a;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v1, v1, v0

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {v1, v2, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->q(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->a:I

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->b:[I

    aget v1, v1, v0

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/o1;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {v1, v2, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->q(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/t1;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method
