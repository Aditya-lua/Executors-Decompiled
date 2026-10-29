.class public Lkd/h;
.super Lhd/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd/h$b;,
        Lkd/h$c;
    }
.end annotation


# instance fields
.field public z:Lkd/h$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkd/h$b;)V
    .locals 0
    .param p1    # Lkd/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, Lhd/g;-><init>(Lhd/g$c;)V

    .line 3
    iput-object p1, p0, Lkd/h;->z:Lkd/h$b;

    return-void
.end method

.method public synthetic constructor <init>(Lkd/h$b;Lkd/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkd/h;-><init>(Lkd/h$b;)V

    return-void
.end method

.method public static synthetic n0(Lkd/h$b;)Lkd/h;
    .locals 0

    invoke-static {p0}, Lkd/h;->p0(Lkd/h$b;)Lkd/h;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Lhd/k;)Lkd/h;
    .locals 3

    new-instance v0, Lkd/h$b;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lhd/k;

    invoke-direct {p0}, Lhd/k;-><init>()V

    :goto_0
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lkd/h$b;-><init>(Lhd/k;Landroid/graphics/RectF;Lkd/h$a;)V

    invoke-static {v0}, Lkd/h;->p0(Lkd/h$b;)Lkd/h;

    move-result-object p0

    return-object p0
.end method

.method public static p0(Lkd/h$b;)Lkd/h;
    .locals 1
    .param p0    # Lkd/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lkd/h$c;

    invoke-direct {v0, p0}, Lkd/h$c;-><init>(Lkd/h$b;)V

    return-object v0
.end method


# virtual methods
.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lkd/h$b;

    iget-object v1, p0, Lkd/h;->z:Lkd/h$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkd/h$b;-><init>(Lkd/h$b;Lkd/h$a;)V

    iput-object v0, p0, Lkd/h;->z:Lkd/h$b;

    return-object p0
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public r0()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v0}, Lkd/h;->s0(FFFF)V

    return-void
.end method

.method public s0(FFFF)V
    .locals 1

    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v0, p3, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, p4, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lkd/h;->z:Lkd/h$b;

    invoke-static {v0}, Lkd/h$b;->a(Lkd/h$b;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lhd/g;->invalidateSelf()V

    return-void
.end method

.method public t0(Landroid/graphics/RectF;)V
    .locals 3
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, v1, v2, p1}, Lkd/h;->s0(FFFF)V

    return-void
.end method
