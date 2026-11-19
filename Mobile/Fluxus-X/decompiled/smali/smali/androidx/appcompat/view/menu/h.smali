.class public Landroidx/appcompat/view/menu/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroidx/appcompat/view/menu/e;

.field public final c:Z

.field public final d:I

.field public final e:I

.field public f:Landroid/view/View;

.field public g:I

.field public h:Z

.field public i:Landroidx/appcompat/view/menu/i$a;

.field public j:Lp/d;

.field public k:Landroid/widget/PopupWindow$OnDismissListener;

.field public final l:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZI)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/view/menu/h;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZII)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    .line 3
    iput v0, p0, Landroidx/appcompat/view/menu/h;->g:I

    .line 4
    new-instance v0, Landroidx/appcompat/view/menu/h$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/view/menu/h$a;-><init>(Landroidx/appcompat/view/menu/h;)V

    iput-object v0, p0, Landroidx/appcompat/view/menu/h;->l:Landroid/widget/PopupWindow$OnDismissListener;

    .line 5
    iput-object p1, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Landroidx/appcompat/view/menu/h;->b:Landroidx/appcompat/view/menu/e;

    .line 7
    iput-object p3, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    .line 8
    iput-boolean p4, p0, Landroidx/appcompat/view/menu/h;->c:Z

    .line 9
    iput p5, p0, Landroidx/appcompat/view/menu/h;->d:I

    .line 10
    iput p6, p0, Landroidx/appcompat/view/menu/h;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lp/d;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Li/d;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_0

    new-instance v2, Landroidx/appcompat/view/menu/b;

    iget-object v3, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    iget-object v4, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    iget v5, p0, Landroidx/appcompat/view/menu/h;->d:I

    iget v6, p0, Landroidx/appcompat/view/menu/h;->e:I

    iget-boolean v7, p0, Landroidx/appcompat/view/menu/h;->c:Z

    invoke-direct/range {v2 .. v7}, Landroidx/appcompat/view/menu/b;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_0
    new-instance v3, Landroidx/appcompat/view/menu/k;

    iget-object v4, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    iget-object v5, p0, Landroidx/appcompat/view/menu/h;->b:Landroidx/appcompat/view/menu/e;

    iget-object v6, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    iget v7, p0, Landroidx/appcompat/view/menu/h;->d:I

    iget v8, p0, Landroidx/appcompat/view/menu/h;->e:I

    iget-boolean v9, p0, Landroidx/appcompat/view/menu/h;->c:Z

    invoke-direct/range {v3 .. v9}, Landroidx/appcompat/view/menu/k;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;IIZ)V

    move-object v2, v3

    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->b:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2, v0}, Lp/d;->j(Landroidx/appcompat/view/menu/e;)V

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->l:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v2, v0}, Lp/d;->t(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    invoke-virtual {v2, v0}, Lp/d;->n(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->i:Landroidx/appcompat/view/menu/i$a;

    invoke-interface {v2, v0}, Landroidx/appcompat/view/menu/i;->d(Landroidx/appcompat/view/menu/i$a;)V

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/h;->h:Z

    invoke-virtual {v2, v0}, Lp/d;->q(Z)V

    iget v0, p0, Landroidx/appcompat/view/menu/h;->g:I

    invoke-virtual {v2, v0}, Lp/d;->r(I)V

    return-object v2
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    invoke-interface {v0}, Lp/f;->dismiss()V

    :cond_0
    return-void
.end method

.method public c()Lp/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->a()Lp/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->k:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public f(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    return-void
.end method

.method public g(Z)V
    .locals 1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/h;->h:Z

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lp/d;->q(Z)V

    :cond_0
    return-void
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/view/menu/h;->g:I

    return-void
.end method

.method public i(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/h;->k:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public j(Landroidx/appcompat/view/menu/i$a;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/view/menu/h;->i:Landroidx/appcompat/view/menu/i$a;

    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->j:Lp/d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroidx/appcompat/view/menu/i;->d(Landroidx/appcompat/view/menu/i$a;)V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(IIZZ)V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->c()Lp/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lp/d;->u(Z)V

    if-eqz p3, :cond_1

    iget p3, p0, Landroidx/appcompat/view/menu/h;->g:I

    iget-object p4, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    invoke-static {p3, p4}, Landroidx/core/view/k;->b(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    iget-object p3, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    :cond_0
    invoke-virtual {v0, p1}, Lp/d;->s(I)V

    invoke-virtual {v0, p2}, Lp/d;->v(I)V

    iget-object p3, p0, Landroidx/appcompat/view/menu/h;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float/2addr p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0, p4}, Lp/d;->p(Landroid/graphics/Rect;)V

    :cond_1
    invoke-interface {v0}, Lp/f;->show()V

    return-void
.end method

.method public m()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0, v2, v2, v2, v2}, Landroidx/appcompat/view/menu/h;->l(IIZZ)V

    return v1
.end method

.method public n(II)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/h;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/h;->f:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0, p1, p2, v1, v1}, Landroidx/appcompat/view/menu/h;->l(IIZZ)V

    return v1
.end method
