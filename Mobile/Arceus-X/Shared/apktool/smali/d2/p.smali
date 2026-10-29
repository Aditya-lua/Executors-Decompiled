.class public abstract Ld2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/p$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lc2/e;

.field public c:Ld2/m;

.field public d:Lc2/e$b;

.field public e:Ld2/g;

.field public f:I

.field public g:Z

.field public h:Ld2/f;

.field public i:Ld2/f;

.field public j:Ld2/p$b;


# direct methods
.method public constructor <init>(Lc2/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld2/g;

    invoke-direct {v0, p0}, Ld2/g;-><init>(Ld2/p;)V

    iput-object v0, p0, Ld2/p;->e:Ld2/g;

    const/4 v0, 0x0

    iput v0, p0, Ld2/p;->f:I

    iput-boolean v0, p0, Ld2/p;->g:Z

    new-instance v0, Ld2/f;

    invoke-direct {v0, p0}, Ld2/f;-><init>(Ld2/p;)V

    iput-object v0, p0, Ld2/p;->h:Ld2/f;

    new-instance v0, Ld2/f;

    invoke-direct {v0, p0}, Ld2/f;-><init>(Ld2/p;)V

    iput-object v0, p0, Ld2/p;->i:Ld2/f;

    sget-object v0, Ld2/p$b;->a:Ld2/p$b;

    iput-object v0, p0, Ld2/p;->j:Ld2/p$b;

    iput-object p1, p0, Ld2/p;->b:Lc2/e;

    return-void
.end method


# virtual methods
.method public a(Ld2/d;)V
    .locals 0

    return-void
.end method

.method public final b(Ld2/f;Ld2/f;I)V
    .locals 1

    iget-object v0, p1, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Ld2/f;->f:I

    iget-object p2, p2, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ld2/f;Ld2/f;ILd2/g;)V
    .locals 2

    iget-object v0, p1, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Ld2/f;->l:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->e:Ld2/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Ld2/f;->h:I

    iput-object p4, p1, Ld2/f;->i:Ld2/g;

    iget-object p2, p2, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, Ld2/p;->b:Lc2/e;

    iget v0, p2, Lc2/e;->A:I

    iget p2, p2, Lc2/e;->z:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    return p2

    :cond_1
    iget-object p2, p0, Ld2/p;->b:Lc2/e;

    iget v0, p2, Lc2/e;->D:I

    iget p2, p2, Lc2/e;->C:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    return p2

    :cond_3
    return p1
.end method

.method public final h(Lc2/d;)Ld2/f;
    .locals 3

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lc2/d;->d:Lc2/e;

    iget-object p1, p1, Lc2/d;->e:Lc2/d$a;

    sget-object v2, Ld2/p$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    return-object v0

    :cond_1
    iget-object p1, v1, Lc2/e;->f:Ld2/n;

    iget-object p1, p1, Ld2/p;->i:Ld2/f;

    return-object p1

    :cond_2
    iget-object p1, v1, Lc2/e;->f:Ld2/n;

    iget-object p1, p1, Ld2/n;->k:Ld2/f;

    return-object p1

    :cond_3
    iget-object p1, v1, Lc2/e;->f:Ld2/n;

    iget-object p1, p1, Ld2/p;->h:Ld2/f;

    return-object p1

    :cond_4
    iget-object p1, v1, Lc2/e;->e:Ld2/l;

    iget-object p1, p1, Ld2/p;->i:Ld2/f;

    return-object p1

    :cond_5
    iget-object p1, v1, Lc2/e;->e:Ld2/l;

    iget-object p1, p1, Ld2/p;->h:Ld2/f;

    return-object p1
.end method

.method public final i(Lc2/d;I)Ld2/f;
    .locals 2

    iget-object p1, p1, Lc2/d;->f:Lc2/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, Lc2/d;->d:Lc2/e;

    if-nez p2, :cond_1

    iget-object p2, v1, Lc2/e;->e:Ld2/l;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Lc2/e;->f:Ld2/n;

    :goto_0
    iget-object p1, p1, Lc2/d;->e:Lc2/d$a;

    sget-object v1, Ld2/p$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    return-object v0

    :cond_2
    iget-object p1, p2, Ld2/p;->i:Ld2/f;

    return-object p1

    :cond_3
    iget-object p1, p2, Ld2/p;->h:Ld2/f;

    return-object p1
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Ld2/p;->e:Ld2/g;

    iget-boolean v1, v0, Ld2/f;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Ld2/f;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Ld2/p;->g:Z

    return v0
.end method

.method public final l(II)V
    .locals 7

    iget v0, p0, Ld2/p;->a:I

    if-eqz v0, :cond_9

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v3, v0, Lc2/e;->e:Ld2/l;

    iget-object v4, v3, Ld2/p;->d:Lc2/e$b;

    sget-object v5, Lc2/e$b;->c:Lc2/e$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, Ld2/p;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Lc2/e;->f:Ld2/n;

    iget-object v6, v4, Ld2/p;->d:Lc2/e$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, Ld2/p;->a:I

    if-ne v4, p2, :cond_1

    goto :goto_3

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, Lc2/e;->f:Ld2/n;

    :cond_2
    iget-object p2, v3, Ld2/p;->e:Ld2/g;

    iget-boolean p2, p2, Ld2/f;->j:Z

    if-eqz p2, :cond_7

    invoke-virtual {v0}, Lc2/e;->v()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, Ld2/p;->e:Ld2/g;

    iget p1, p1, Ld2/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, Ld2/p;->e:Ld2/g;

    iget p1, p1, Ld2/f;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, Ld2/p;->e:Ld2/g;

    invoke-virtual {p2, p1}, Ld2/g;->d(I)V

    return-void

    :cond_4
    iget-object p2, p0, Ld2/p;->b:Lc2/e;

    invoke-virtual {p2}, Lc2/e;->K()Lc2/e;

    move-result-object p2

    if-eqz p2, :cond_7

    if-nez p1, :cond_5

    iget-object p2, p2, Lc2/e;->e:Ld2/l;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Lc2/e;->f:Ld2/n;

    :goto_1
    iget-object p2, p2, Ld2/p;->e:Ld2/g;

    iget-boolean v0, p2, Ld2/f;->j:Z

    if-eqz v0, :cond_7

    if-nez p1, :cond_6

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget v0, v0, Lc2/e;->B:F

    goto :goto_2

    :cond_6
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget v0, v0, Lc2/e;->E:F

    :goto_2
    iget p2, p2, Ld2/f;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    iget-object v0, p0, Ld2/p;->e:Ld2/g;

    invoke-virtual {p0, p2, p1}, Ld2/p;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Ld2/g;->d(I)V

    :cond_7
    :goto_3
    return-void

    :cond_8
    iget-object v0, p0, Ld2/p;->e:Ld2/g;

    iget v0, v0, Ld2/g;->m:I

    invoke-virtual {p0, v0, p1}, Ld2/p;->g(II)I

    move-result p1

    iget-object v0, p0, Ld2/p;->e:Ld2/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, Ld2/g;->d(I)V

    return-void

    :cond_9
    iget-object v0, p0, Ld2/p;->e:Ld2/g;

    invoke-virtual {p0, p2, p1}, Ld2/p;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, Ld2/g;->d(I)V

    return-void
.end method

.method public abstract m()Z
.end method

.method public n(Ld2/d;Lc2/d;Lc2/d;I)V
    .locals 4

    invoke-virtual {p0, p2}, Ld2/p;->h(Lc2/d;)Ld2/f;

    move-result-object p1

    invoke-virtual {p0, p3}, Ld2/p;->h(Lc2/d;)Ld2/f;

    move-result-object v0

    iget-boolean v1, p1, Ld2/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Ld2/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, Ld2/f;->g:I

    invoke-virtual {p2}, Lc2/d;->f()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Ld2/f;->g:I

    invoke-virtual {p3}, Lc2/d;->f()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Ld2/p;->e:Ld2/g;

    iget-boolean v2, v2, Ld2/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Ld2/p;->d:Lc2/e$b;

    sget-object v3, Lc2/e$b;->c:Lc2/e$b;

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, p4, p3}, Ld2/p;->l(II)V

    :cond_1
    iget-object v2, p0, Ld2/p;->e:Ld2/g;

    iget-boolean v3, v2, Ld2/f;->j:Z

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget v2, v2, Ld2/f;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {p1, v1}, Ld2/f;->d(I)V

    iget-object p1, p0, Ld2/p;->i:Ld2/f;

    invoke-virtual {p1, p2}, Ld2/f;->d(I)V

    return-void

    :cond_3
    if-nez p4, :cond_4

    iget-object p3, p0, Ld2/p;->b:Lc2/e;

    invoke-virtual {p3}, Lc2/e;->y()F

    move-result p3

    goto :goto_0

    :cond_4
    iget-object p3, p0, Ld2/p;->b:Lc2/e;

    invoke-virtual {p3}, Lc2/e;->R()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Ld2/f;->g:I

    iget p2, v0, Ld2/f;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Ld2/p;->e:Ld2/g;

    iget p1, p1, Ld2/f;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, Ld2/p;->h:Ld2/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Ld2/f;->d(I)V

    iget-object p1, p0, Ld2/p;->i:Ld2/f;

    iget-object p2, p0, Ld2/p;->h:Ld2/f;

    iget p2, p2, Ld2/f;->g:I

    iget-object p3, p0, Ld2/p;->e:Ld2/g;

    iget p3, p3, Ld2/f;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Ld2/f;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public o(Ld2/d;)V
    .locals 0

    return-void
.end method

.method public p(Ld2/d;)V
    .locals 0

    return-void
.end method
