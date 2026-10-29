.class public Lq/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/CheckedTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Landroid/content/res/ColorStateList;

.field public c:Landroid/graphics/PorterDuff$Mode;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/widget/CheckedTextView;)V
    .locals 1
    .param p1    # Landroid/widget/CheckedTextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lq/i;->b:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lq/i;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq/i;->d:Z

    iput-boolean v0, p0, Lq/i;->e:Z

    iput-object p1, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-static {v0}, Ld3/c;->a(Landroid/widget/CheckedTextView;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, p0, Lq/i;->d:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lq/i;->e:Z

    if-eqz v1, :cond_4

    :cond_0
    invoke-static {v0}, Lq2/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-boolean v1, p0, Lq/i;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lq/i;->b:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v1, p0, Lq/i;->e:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lq/i;->c:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lq2/a;->p(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    iget-object v1, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v0}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lq/i;->b:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lq/i;->c:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public d(Landroid/util/AttributeSet;I)V
    .locals 10

    iget-object v0, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Li/j;->R0:[I

    const/4 v8, 0x0

    invoke-static {v0, p1, v3, p2, v8}, Lq/a1;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lq/a1;

    move-result-object v9

    iget-object v1, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v9}, Lq/a1;->r()Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v7}, Landroidx/core/view/o0;->k0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :try_start_0
    sget p1, Li/j;->T0:I

    invoke-virtual {v9, p1}, Lq/a1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v9, p1, v8}, Lq/a1;->n(II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    :try_start_1
    iget-object p2, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lk/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_0
    :cond_0
    :try_start_2
    sget p1, Li/j;->S0:I

    invoke-virtual {v9, p1}, Lq/a1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v9, p1, v8}, Lq/a1;->n(II)I

    move-result p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lk/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    sget p1, Li/j;->U0:I

    invoke-virtual {v9, p1}, Lq/a1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    invoke-virtual {v9, p1}, Lq/a1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p2, p1}, Ld3/c;->b(Landroid/widget/CheckedTextView;Landroid/content/res/ColorStateList;)V

    :cond_2
    sget p1, Li/j;->V0:I

    invoke-virtual {v9, p1}, Lq/a1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lq/i;->a:Landroid/widget/CheckedTextView;

    const/4 v0, -0x1

    invoke-virtual {v9, p1, v0}, Lq/a1;->k(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lq/k0;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {p2, p1}, Ld3/c;->c(Landroid/widget/CheckedTextView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {v9}, Lq/a1;->x()V

    return-void

    :goto_1
    invoke-virtual {v9}, Lq/a1;->x()V

    throw p1
.end method

.method public e()V
    .locals 1

    iget-boolean v0, p0, Lq/i;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq/i;->f:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lq/i;->f:Z

    invoke-virtual {p0}, Lq/i;->a()V

    return-void
.end method

.method public f(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lq/i;->b:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq/i;->d:Z

    invoke-virtual {p0}, Lq/i;->a()V

    return-void
.end method

.method public g(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    iput-object p1, p0, Lq/i;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq/i;->e:Z

    invoke-virtual {p0}, Lq/i;->a()V

    return-void
.end method
