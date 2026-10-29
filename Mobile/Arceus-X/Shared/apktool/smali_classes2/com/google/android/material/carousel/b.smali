.class public final Lcom/google/android/material/carousel/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/carousel/b$c;,
        Lcom/google/android/material/carousel/b$b;
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(FLjava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b$c;",
            ">;II)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/google/android/material/carousel/b;->a:F

    .line 4
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    .line 5
    iput p3, p0, Lcom/google/android/material/carousel/b;->c:I

    .line 6
    iput p4, p0, Lcom/google/android/material/carousel/b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(FLjava/util/List;IILcom/google/android/material/carousel/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/material/carousel/b;-><init>(FLjava/util/List;II)V

    return-void
.end method

.method public static m(Lcom/google/android/material/carousel/b;Lcom/google/android/material/carousel/b;F)Lcom/google/android/material/carousel/b;
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->f()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v2, v3, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/b$c;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/carousel/b$c;

    invoke-static {v4, v5, p2}, Lcom/google/android/material/carousel/b$c;->a(Lcom/google/android/material/carousel/b$c;Lcom/google/android/material/carousel/b$c;F)Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->b()I

    move-result v1

    invoke-static {v0, v1, p2}, Ljc/a;->c(IIF)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->i()I

    move-result p1

    invoke-static {v1, p1, p2}, Ljc/a;->c(IIF)I

    move-result p1

    new-instance p2, Lcom/google/android/material/carousel/b;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result p0

    invoke-direct {p2, p0, v2, v0, p1}, Lcom/google/android/material/carousel/b;-><init>(FLjava/util/List;II)V

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Keylines being linearly interpolated must have the same number of keylines."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Keylines being linearly interpolated must have the same item size."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Lcom/google/android/material/carousel/b;F)Lcom/google/android/material/carousel/b;
    .locals 10

    new-instance v0, Lcom/google/android/material/carousel/b$b;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/material/carousel/b$b;-><init>(FF)V

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->b:F

    sub-float/2addr p1, v1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v1, v6

    sub-float/2addr p1, v1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v7, 0x1

    sub-int/2addr v1, v7

    move v8, v1

    :goto_0
    if-ltz v8, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/material/carousel/b$c;

    iget v1, v9, Lcom/google/android/material/carousel/b$c;->d:F

    div-float/2addr v1, v6

    add-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v2

    if-lt v8, v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v2

    if-gt v8, v2, :cond_0

    move v4, v7

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    move v4, v2

    :goto_1
    iget v2, v9, Lcom/google/android/material/carousel/b$c;->c:F

    iget v3, v9, Lcom/google/android/material/carousel/b$c;->d:F

    iget-boolean v5, v9, Lcom/google/android/material/carousel/b$c;->e:Z

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/carousel/b$b;->d(FFFZZ)Lcom/google/android/material/carousel/b$b;

    iget v1, v9, Lcom/google/android/material/carousel/b$c;->d:F

    add-float/2addr p1, v1

    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/material/carousel/b$b;->i()Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/material/carousel/b$c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    iget v1, p0, Lcom/google/android/material/carousel/b;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b$c;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/carousel/b;->c:I

    return v0
.end method

.method public c()Lcom/google/android/material/carousel/b$c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b$c;

    return-object v0
.end method

.method public d()Lcom/google/android/material/carousel/b$c;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget-boolean v2, v1, Lcom/google/android/material/carousel/b$c;->e:Z

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    iget v1, p0, Lcom/google/android/material/carousel/b;->c:I

    iget v2, p0, Lcom/google/android/material/carousel/b;->d:I

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/carousel/b;->a:F

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    return-object v0
.end method

.method public h()Lcom/google/android/material/carousel/b$c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    iget v1, p0, Lcom/google/android/material/carousel/b;->d:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b$c;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/carousel/b;->d:I

    return v0
.end method

.method public j()Lcom/google/android/material/carousel/b$c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b$c;

    return-object v0
.end method

.method public k()Lcom/google/android/material/carousel/b$c;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget-boolean v2, v1, Lcom/google/android/material/carousel/b$c;->e:Z

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/carousel/b$c;

    iget-boolean v2, v2, Lcom/google/android/material/carousel/b$c;->e:Z

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/carousel/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    return v0
.end method
