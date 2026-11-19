.class public Lq/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/b0$d;,
        Lq/b0$c;,
        Lq/b0$e;
    }
.end annotation


# instance fields
.field public final a:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Lq/z0;

.field public c:Lq/z0;

.field public d:Lq/z0;

.field public e:Lq/z0;

.field public f:Lq/z0;

.field public g:Lq/z0;

.field public h:Lq/z0;

.field public final i:Lq/d0;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lq/b0;->j:I

    const/4 v0, -0x1

    iput v0, p0, Lq/b0;->k:I

    iput-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    new-instance v0, Lq/d0;

    invoke-direct {v0, p1}, Lq/d0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lq/b0;->i:Lq/d0;

    return-void
.end method

.method public static d(Landroid/content/Context;Lq/k;I)Lq/z0;
    .locals 0

    invoke-virtual {p1, p0, p2}, Lq/k;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lq/z0;

    invoke-direct {p1}, Lq/z0;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Lq/z0;->d:Z

    iput-object p0, p1, Lq/z0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A(IF)V
    .locals 1

    sget-boolean v0, Lq/h1;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lq/b0;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lq/b0;->B(IF)V

    :cond_0
    return-void
.end method

.method public final B(IF)V
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0, p1, p2}, Lq/d0;->t(IF)V

    return-void
.end method

.method public final C(Landroid/content/Context;Lq/b1;)V
    .locals 10

    sget v0, Li/j;->X2:I

    iget v1, p0, Lq/b0;->j:I

    invoke-virtual {p2, v0, v1}, Lq/b1;->k(II)I

    move-result v0

    iput v0, p0, Lq/b0;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    sget v4, Li/j;->a3:I

    invoke-virtual {p2, v4, v2}, Lq/b1;->k(II)I

    move-result v4

    iput v4, p0, Lq/b0;->k:I

    if-eq v4, v2, :cond_0

    iget v4, p0, Lq/b0;->j:I

    and-int/2addr v4, v1

    iput v4, p0, Lq/b0;->j:I

    :cond_0
    sget v4, Li/j;->Z2:I

    invoke-virtual {p2, v4}, Lq/b1;->s(I)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_5

    sget v4, Li/j;->b3:I

    invoke-virtual {p2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    sget p1, Li/j;->W2:I

    invoke-virtual {p2, p1}, Lq/b1;->s(I)Z

    move-result p1

    if-eqz p1, :cond_e

    iput-boolean v6, p0, Lq/b0;->m:Z

    sget p1, Li/j;->W2:I

    invoke-virtual {p2, p1, v5}, Lq/b1;->k(II)I

    move-result p1

    if-eq p1, v5, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto/16 :goto_6

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_5
    :goto_0
    const/4 v4, 0x0

    iput-object v4, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    sget v4, Li/j;->b3:I

    invoke-virtual {p2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_6

    sget v4, Li/j;->b3:I

    goto :goto_1

    :cond_6
    sget v4, Li/j;->Z2:I

    :goto_1
    iget v7, p0, Lq/b0;->k:I

    iget v8, p0, Lq/b0;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_b

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lq/b0$a;

    invoke-direct {v9, p0, v7, v8, p1}, Lq/b0$a;-><init>(Lq/b0;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Lq/b0;->j:I

    invoke-virtual {p2, v4, p1, v9}, Lq/b1;->j(IILn2/h$f;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_9

    if-lt v0, v3, :cond_8

    iget v0, p0, Lq/b0;->k:I

    if-eq v0, v2, :cond_8

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Lq/b0;->k:I

    iget v7, p0, Lq/b0;->j:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_7

    move v7, v5

    goto :goto_2

    :cond_7
    move v7, v6

    :goto_2
    invoke-static {p1, v0, v7}, Lq/b0$e;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_8
    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    :cond_9
    :goto_3
    iget-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_a

    move p1, v5

    goto :goto_4

    :cond_a
    move p1, v6

    :goto_4
    iput-boolean p1, p0, Lq/b0;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_b
    iget-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_e

    invoke-virtual {p2, v4}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_d

    iget p2, p0, Lq/b0;->k:I

    if-eq p2, v2, :cond_d

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lq/b0;->k:I

    iget v0, p0, Lq/b0;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_c

    goto :goto_5

    :cond_c
    move v5, v6

    :goto_5
    invoke-static {p1, p2, v5}, Lq/b0$e;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    goto :goto_6

    :cond_d
    iget p2, p0, Lq/b0;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    :cond_e
    :goto_6
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;Lq/z0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Lq/k;->i(Landroid/graphics/drawable/Drawable;Lq/z0;[I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Lq/b0;->b:Lq/z0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/b0;->c:Lq/z0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/b0;->d:Lq/z0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lq/b0;->e:Lq/z0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Lq/b0;->b:Lq/z0;

    invoke-virtual {p0, v3, v4}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Lq/b0;->c:Lq/z0;

    invoke-virtual {p0, v3, v4}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Lq/b0;->d:Lq/z0;

    invoke-virtual {p0, v3, v4}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Lq/b0;->e:Lq/z0;

    invoke-virtual {p0, v0, v3}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    :cond_1
    iget-object v0, p0, Lq/b0;->f:Lq/z0;

    if-nez v0, :cond_3

    iget-object v0, p0, Lq/b0;->g:Lq/z0;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Lq/b0;->f:Lq/z0;

    invoke-virtual {p0, v2, v3}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Lq/b0;->g:Lq/z0;

    invoke-virtual {p0, v0, v1}, Lq/b0;->a(Landroid/graphics/drawable/Drawable;Lq/z0;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->a()V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->f()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->g()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->h()I

    move-result v0

    return v0
.end method

.method public h()[I
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->i()[I

    move-result-object v0

    return-object v0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->j()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq/z0;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public k()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq/z0;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0}, Lq/d0;->n()Z

    move-result v0

    return v0
.end method

.method public m(Landroid/util/AttributeSet;I)V
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lq/k;->b()Lq/k;

    move-result-object v1

    sget-object v2, Li/j;->a0:[I

    const/4 v3, 0x0

    invoke-static {v0, p1, v2, p2, v3}, Lq/b1;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lq/b1;

    move-result-object v2

    iget-object v4, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Li/j;->a0:[I

    invoke-virtual {v2}, Lq/b1;->r()Landroid/content/res/TypedArray;

    move-result-object v8

    const/4 v10, 0x0

    move-object v7, p1

    move v9, p2

    invoke-static/range {v4 .. v10}, Landroidx/core/view/o0;->k0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget p1, Li/j;->b0:I

    const/4 p2, -0x1

    invoke-virtual {v2, p1, p2}, Lq/b1;->n(II)I

    move-result p1

    sget v4, Li/j;->e0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_0

    sget v4, Li/j;->e0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->b:Lq/z0;

    :cond_0
    sget v4, Li/j;->c0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_1

    sget v4, Li/j;->c0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->c:Lq/z0;

    :cond_1
    sget v4, Li/j;->f0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_2

    sget v4, Li/j;->f0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->d:Lq/z0;

    :cond_2
    sget v4, Li/j;->d0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_3

    sget v4, Li/j;->d0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->e:Lq/z0;

    :cond_3
    sget v4, Li/j;->g0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_4

    sget v4, Li/j;->g0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->f:Lq/z0;

    :cond_4
    sget v4, Li/j;->h0:I

    invoke-virtual {v2, v4}, Lq/b1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_5

    sget v4, Li/j;->h0:I

    invoke-virtual {v2, v4, v3}, Lq/b1;->n(II)I

    move-result v4

    invoke-static {v0, v1, v4}, Lq/b0;->d(Landroid/content/Context;Lq/k;I)Lq/z0;

    move-result-object v4

    iput-object v4, p0, Lq/b0;->g:Lq/z0;

    :cond_5
    invoke-virtual {v2}, Lq/b1;->x()V

    iget-object v2, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq p1, p2, :cond_9

    sget-object v6, Li/j;->U2:[I

    invoke-static {v0, p1, v6}, Lq/b1;->t(Landroid/content/Context;I[I)Lq/b1;

    move-result-object p1

    if-nez v2, :cond_6

    sget v6, Li/j;->d3:I

    invoke-virtual {p1, v6}, Lq/b1;->s(I)Z

    move-result v6

    if-eqz v6, :cond_6

    sget v6, Li/j;->d3:I

    invoke-virtual {p1, v6, v3}, Lq/b1;->a(IZ)Z

    move-result v6

    move v8, v4

    goto :goto_0

    :cond_6
    move v6, v3

    move v8, v6

    :goto_0
    invoke-virtual {p0, v0, p1}, Lq/b0;->C(Landroid/content/Context;Lq/b1;)V

    sget v10, Li/j;->e3:I

    invoke-virtual {p1, v10}, Lq/b1;->s(I)Z

    move-result v10

    if-eqz v10, :cond_7

    sget v10, Li/j;->e3:I

    invoke-virtual {p1, v10}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_7
    move-object v10, v5

    :goto_1
    sget v11, Li/j;->c3:I

    invoke-virtual {p1, v11}, Lq/b1;->s(I)Z

    move-result v11

    if-eqz v11, :cond_8

    sget v11, Li/j;->c3:I

    invoke-virtual {p1, v11}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_8
    move-object v11, v5

    :goto_2
    invoke-virtual {p1}, Lq/b1;->x()V

    goto :goto_3

    :cond_9
    move v6, v3

    move v8, v6

    move-object v10, v5

    move-object v11, v10

    :goto_3
    sget-object p1, Li/j;->U2:[I

    invoke-static {v0, v7, p1, v9, v3}, Lq/b1;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lq/b1;

    move-result-object p1

    if-nez v2, :cond_a

    sget v12, Li/j;->d3:I

    invoke-virtual {p1, v12}, Lq/b1;->s(I)Z

    move-result v12

    if-eqz v12, :cond_a

    sget v6, Li/j;->d3:I

    invoke-virtual {p1, v6, v3}, Lq/b1;->a(IZ)Z

    move-result v6

    goto :goto_4

    :cond_a
    move v4, v8

    :goto_4
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    sget v12, Li/j;->e3:I

    invoke-virtual {p1, v12}, Lq/b1;->s(I)Z

    move-result v12

    if-eqz v12, :cond_b

    sget v10, Li/j;->e3:I

    invoke-virtual {p1, v10}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object v10

    :cond_b
    sget v12, Li/j;->c3:I

    invoke-virtual {p1, v12}, Lq/b1;->s(I)Z

    move-result v12

    if-eqz v12, :cond_c

    sget v11, Li/j;->c3:I

    invoke-virtual {p1, v11}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object v11

    :cond_c
    const/16 v12, 0x1c

    if-lt v8, v12, :cond_d

    sget v8, Li/j;->V2:I

    invoke-virtual {p1, v8}, Lq/b1;->s(I)Z

    move-result v8

    if-eqz v8, :cond_d

    sget v8, Li/j;->V2:I

    invoke-virtual {p1, v8, p2}, Lq/b1;->f(II)I

    move-result v8

    if-nez v8, :cond_d

    iget-object v8, p0, Lq/b0;->a:Landroid/widget/TextView;

    const/4 v12, 0x0

    invoke-virtual {v8, v3, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {p0, v0, p1}, Lq/b0;->C(Landroid/content/Context;Lq/b1;)V

    invoke-virtual {p1}, Lq/b1;->x()V

    if-nez v2, :cond_e

    if-eqz v4, :cond_e

    invoke-virtual {p0, v6}, Lq/b0;->s(Z)V

    :cond_e
    iget-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_10

    iget v2, p0, Lq/b0;->k:I

    if-ne v2, p2, :cond_f

    iget-object v2, p0, Lq/b0;->a:Landroid/widget/TextView;

    iget v4, p0, Lq/b0;->j:I

    invoke-virtual {v2, p1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_5

    :cond_f
    iget-object v2, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_5
    if-eqz v11, :cond_11

    iget-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {p1, v11}, Lq/b0$d;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v10, :cond_12

    iget-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v10}, Lq/b0$c;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-static {p1, v2}, Lq/b0$c;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    iget-object p1, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {p1, v7, v9}, Lq/d0;->o(Landroid/util/AttributeSet;I)V

    sget-boolean p1, Lq/h1;->c:Z

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz p1, :cond_14

    iget-object p1, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {p1}, Lq/d0;->j()I

    move-result p1

    if-eqz p1, :cond_14

    iget-object p1, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {p1}, Lq/d0;->i()[I

    move-result-object p1

    array-length v4, p1

    if-lez v4, :cond_14

    iget-object v4, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v4}, Lq/b0$d;->a(Landroid/widget/TextView;)I

    move-result v4

    int-to-float v4, v4

    cmpl-float v4, v4, v2

    if-eqz v4, :cond_13

    iget-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    iget-object v4, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v4}, Lq/d0;->g()I

    move-result v4

    iget-object v6, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v6}, Lq/d0;->f()I

    move-result v6

    iget-object v8, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v8}, Lq/d0;->h()I

    move-result v8

    invoke-static {p1, v4, v6, v8, v3}, Lq/b0$d;->b(Landroid/widget/TextView;IIII)V

    goto :goto_6

    :cond_13
    iget-object v4, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v4, p1, v3}, Lq/b0$d;->c(Landroid/widget/TextView;[II)V

    :cond_14
    :goto_6
    sget-object p1, Li/j;->i0:[I

    invoke-static {v0, v7, p1}, Lq/b1;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lq/b1;

    move-result-object p1

    sget v3, Li/j;->q0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_15

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    move-object v7, v3

    goto :goto_7

    :cond_15
    move-object v7, v5

    :goto_7
    sget v3, Li/j;->v0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_16

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    move-object v8, v3

    goto :goto_8

    :cond_16
    move-object v8, v5

    :goto_8
    sget v3, Li/j;->r0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_17

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    move-object v9, v3

    goto :goto_9

    :cond_17
    move-object v9, v5

    :goto_9
    sget v3, Li/j;->o0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_18

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    move-object v10, v3

    goto :goto_a

    :cond_18
    move-object v10, v5

    :goto_a
    sget v3, Li/j;->s0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_19

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    move-object v11, v3

    goto :goto_b

    :cond_19
    move-object v11, v5

    :goto_b
    sget v3, Li/j;->p0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->n(II)I

    move-result v3

    if-eq v3, p2, :cond_1a

    invoke-virtual {v1, v0, v3}, Lq/k;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v12, v0

    :goto_c
    move-object v6, p0

    goto :goto_d

    :cond_1a
    move-object v12, v5

    goto :goto_c

    :goto_d
    invoke-virtual/range {v6 .. v12}, Lq/b0;->y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sget v0, Li/j;->t0:I

    invoke-virtual {p1, v0}, Lq/b1;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget v0, Li/j;->t0:I

    invoke-virtual {p1, v0}, Lq/b1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v6, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, Ld3/i;->k(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_1b
    sget v0, Li/j;->u0:I

    invoke-virtual {p1, v0}, Lq/b1;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1c

    sget v0, Li/j;->u0:I

    invoke-virtual {p1, v0, p2}, Lq/b1;->k(II)I

    move-result v0

    invoke-static {v0, v5}, Lq/l0;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v1, v6, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, Ld3/i;->l(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :cond_1c
    sget v0, Li/j;->x0:I

    invoke-virtual {p1, v0, p2}, Lq/b1;->f(II)I

    move-result v0

    sget v1, Li/j;->y0:I

    invoke-virtual {p1, v1, p2}, Lq/b1;->f(II)I

    move-result v1

    sget v3, Li/j;->z0:I

    invoke-virtual {p1, v3}, Lq/b1;->s(I)Z

    move-result v3

    if-eqz v3, :cond_1e

    sget v3, Li/j;->z0:I

    invoke-virtual {p1, v3}, Lq/b1;->w(I)Landroid/util/TypedValue;

    move-result-object v3

    if-eqz v3, :cond_1d

    iget v4, v3, Landroid/util/TypedValue;->type:I

    const/4 v5, 0x5

    if-ne v4, v5, :cond_1d

    iget v4, v3, Landroid/util/TypedValue;->data:I

    invoke-static {v4}, Lx2/i;->b(I)I

    move-result v4

    iget v3, v3, Landroid/util/TypedValue;->data:I

    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v3

    goto :goto_e

    :cond_1d
    sget v3, Li/j;->z0:I

    invoke-virtual {p1, v3, p2}, Lq/b1;->f(II)I

    move-result v3

    int-to-float v3, v3

    move v4, p2

    goto :goto_e

    :cond_1e
    move v4, p2

    move v3, v2

    :goto_e
    invoke-virtual {p1}, Lq/b1;->x()V

    if-eq v0, p2, :cond_1f

    iget-object p1, v6, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {p1, v0}, Ld3/i;->n(Landroid/widget/TextView;I)V

    :cond_1f
    if-eq v1, p2, :cond_20

    iget-object p1, v6, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {p1, v1}, Ld3/i;->o(Landroid/widget/TextView;I)V

    :cond_20
    cmpl-float p1, v3, v2

    if-eqz p1, :cond_22

    if-ne v4, p2, :cond_21

    iget-object p1, v6, Lq/b0;->a:Landroid/widget/TextView;

    float-to-int p2, v3

    invoke-static {p1, p2}, Ld3/i;->p(Landroid/widget/TextView;I)V

    return-void

    :cond_21
    iget-object p1, v6, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {p1, v4, v3}, Ld3/i;->q(Landroid/widget/TextView;IF)V

    :cond_22
    return-void
.end method

.method public n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, Lq/b0;->m:Z

    if-eqz v0, :cond_1

    iput-object p2, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lq/b0;->j:I

    new-instance v1, Lq/b0$b;

    invoke-direct {v1, p0, p1, p2, v0}, Lq/b0$b;-><init>(Lq/b0;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    iget v0, p0, Lq/b0;->j:I

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    return-void
.end method

.method public o(ZIIII)V
    .locals 0

    sget-boolean p1, Lq/h1;->c:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lq/b0;->c()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    invoke-virtual {p0}, Lq/b0;->b()V

    return-void
.end method

.method public q(Landroid/content/Context;I)V
    .locals 3

    sget-object v0, Li/j;->U2:[I

    invoke-static {p1, p2, v0}, Lq/b1;->t(Landroid/content/Context;I[I)Lq/b1;

    move-result-object p2

    sget v0, Li/j;->d3:I

    invoke-virtual {p2, v0}, Lq/b1;->s(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, Li/j;->d3:I

    invoke-virtual {p2, v0, v1}, Lq/b1;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lq/b0;->s(Z)V

    :cond_0
    sget v0, Li/j;->V2:I

    invoke-virtual {p2, v0}, Lq/b1;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Li/j;->V2:I

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2}, Lq/b1;->f(II)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, p2}, Lq/b0;->C(Landroid/content/Context;Lq/b1;)V

    sget p1, Li/j;->c3:I

    invoke-virtual {p2, p1}, Lq/b1;->s(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Li/j;->c3:I

    invoke-virtual {p2, p1}, Lq/b1;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-static {v0, p1}, Lq/b0$d;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {p2}, Lq/b1;->x()V

    iget-object p1, p0, Lq/b0;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lq/b0;->a:Landroid/widget/TextView;

    iget v0, p0, Lq/b0;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public r(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p3, p1}, La3/a;->e(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    iget-object v0, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public t(IIII)V
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lq/d0;->p(IIII)V

    return-void
.end method

.method public u([II)V
    .locals 1
    .param p1    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0, p1, p2}, Lq/d0;->q([II)V

    return-void
.end method

.method public v(I)V
    .locals 1

    iget-object v0, p0, Lq/b0;->i:Lq/d0;

    invoke-virtual {v0, p1}, Lq/d0;->r(I)V

    return-void
.end method

.method public w(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    if-nez v0, :cond_0

    new-instance v0, Lq/z0;

    invoke-direct {v0}, Lq/z0;-><init>()V

    iput-object v0, p0, Lq/b0;->h:Lq/z0;

    :cond_0
    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    iput-object p1, v0, Lq/z0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lq/z0;->d:Z

    invoke-virtual {p0}, Lq/b0;->z()V

    return-void
.end method

.method public x(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    if-nez v0, :cond_0

    new-instance v0, Lq/z0;

    invoke-direct {v0}, Lq/z0;-><init>()V

    iput-object v0, p0, Lq/b0;->h:Lq/z0;

    :cond_0
    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    iput-object p1, v0, Lq/z0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lq/z0;->c:Z

    invoke-virtual {p0}, Lq/b0;->z()V

    return-void
.end method

.method public final y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez p5, :cond_b

    if-eqz p6, :cond_0

    goto :goto_8

    :cond_0
    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p5, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    aget-object p6, p5, v2

    if-nez p6, :cond_8

    aget-object v4, p5, v3

    if-eqz v4, :cond_3

    goto :goto_5

    :cond_3
    iget-object p5, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    iget-object p6, p0, Lq/b0;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    aget-object p1, p5, v2

    :goto_1
    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    aget-object p2, p5, v1

    :goto_2
    if-eqz p3, :cond_6

    goto :goto_3

    :cond_6
    aget-object p3, p5, v3

    :goto_3
    if-eqz p4, :cond_7

    goto :goto_4

    :cond_7
    aget-object p4, p5, v0

    :goto_4
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    :goto_5
    if-eqz p2, :cond_9

    goto :goto_6

    :cond_9
    aget-object p2, p5, v1

    :goto_6
    if-eqz p4, :cond_a

    goto :goto_7

    :cond_a
    aget-object p4, p5, v0

    :goto_7
    iget-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    aget-object p3, p5, v3

    invoke-virtual {p1, p6, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_b
    :goto_8
    iget-object p1, p0, Lq/b0;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p5, :cond_c

    goto :goto_9

    :cond_c
    aget-object p5, p1, v2

    :goto_9
    if-eqz p2, :cond_d

    goto :goto_a

    :cond_d
    aget-object p2, p1, v1

    :goto_a
    if-eqz p6, :cond_e

    goto :goto_b

    :cond_e
    aget-object p6, p1, v3

    :goto_b
    iget-object p3, p0, Lq/b0;->a:Landroid/widget/TextView;

    if-eqz p4, :cond_f

    goto :goto_c

    :cond_f
    aget-object p4, p1, v0

    :goto_c
    invoke-virtual {p3, p5, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, Lq/b0;->h:Lq/z0;

    iput-object v0, p0, Lq/b0;->b:Lq/z0;

    iput-object v0, p0, Lq/b0;->c:Lq/z0;

    iput-object v0, p0, Lq/b0;->d:Lq/z0;

    iput-object v0, p0, Lq/b0;->e:Lq/z0;

    iput-object v0, p0, Lq/b0;->f:Lq/z0;

    iput-object v0, p0, Lq/b0;->g:Lq/z0;

    return-void
.end method
