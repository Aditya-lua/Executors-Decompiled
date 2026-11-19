.class public Lc2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lc2/k;->a:[Z

    return-void
.end method

.method public static a(Lc2/f;Lz1/d;Lc2/e;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, Lc2/e;->t:I

    iput v0, p2, Lc2/e;->u:I

    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lc2/e$b;->b:Lc2/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lc2/e;->Z:[Lc2/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lc2/e$b;->d:Lc2/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Lc2/e;->O:Lc2/d;

    iget v0, v0, Lc2/d;->g:I

    invoke-virtual {p0}, Lc2/e;->W()I

    move-result v1

    iget-object v4, p2, Lc2/e;->Q:Lc2/d;

    iget v4, v4, Lc2/d;->g:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Lc2/e;->O:Lc2/d;

    invoke-virtual {p1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    iput-object v5, v4, Lc2/d;->i:Lz1/i;

    iget-object v4, p2, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p1, v4}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    iput-object v5, v4, Lc2/d;->i:Lz1/i;

    iget-object v4, p2, Lc2/e;->O:Lc2/d;

    iget-object v4, v4, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, v4, v0}, Lz1/d;->f(Lz1/i;I)V

    iget-object v4, p2, Lc2/e;->Q:Lc2/d;

    iget-object v4, v4, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, v4, v1}, Lz1/d;->f(Lz1/i;I)V

    iput v3, p2, Lc2/e;->t:I

    invoke-virtual {p2, v0, v1}, Lc2/e;->P0(II)V

    :cond_0
    iget-object v0, p0, Lc2/e;->Z:[Lc2/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lc2/e;->Z:[Lc2/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lc2/e$b;->d:Lc2/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Lc2/e;->P:Lc2/d;

    iget v0, v0, Lc2/d;->g:I

    invoke-virtual {p0}, Lc2/e;->x()I

    move-result p0

    iget-object v1, p2, Lc2/e;->R:Lc2/d;

    iget v1, v1, Lc2/d;->g:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Lc2/e;->P:Lc2/d;

    invoke-virtual {p1, v1}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    iput-object v2, v1, Lc2/d;->i:Lz1/i;

    iget-object v1, p2, Lc2/e;->R:Lc2/d;

    invoke-virtual {p1, v1}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    iput-object v2, v1, Lc2/d;->i:Lz1/i;

    iget-object v1, p2, Lc2/e;->P:Lc2/d;

    iget-object v1, v1, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, v1, v0}, Lz1/d;->f(Lz1/i;I)V

    iget-object v1, p2, Lc2/e;->R:Lc2/d;

    iget-object v1, v1, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, v1, p0}, Lz1/d;->f(Lz1/i;I)V

    iget v1, p2, Lc2/e;->l0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lc2/e;->V()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Lc2/e;->S:Lc2/d;

    invoke-virtual {p1, v1}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v2

    iput-object v2, v1, Lc2/d;->i:Lz1/i;

    iget-object v1, p2, Lc2/e;->S:Lc2/d;

    iget-object v1, v1, Lc2/d;->i:Lz1/i;

    iget v2, p2, Lc2/e;->l0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lz1/d;->f(Lz1/i;I)V

    :cond_2
    iput v3, p2, Lc2/e;->u:I

    invoke-virtual {p2, v0, p0}, Lc2/e;->g1(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
