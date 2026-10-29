.class public Lkd/x;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final b:Landroid/widget/TextView;

.field public c:Ljava/lang/CharSequence;

.field public final d:Lcom/google/android/material/internal/CheckableImageButton;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:I

.field public h:Landroid/widget/ImageView$ScaleType;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public i:Landroid/view/View$OnLongClickListener;

.field public j:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lq/a1;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const v2, 0x800003

    const/4 v3, -0x2

    invoke-direct {v0, v3, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lic/h;->f:I

    invoke-virtual {v0, v1, p0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    iput-object p1, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {p1}, Lkd/s;->e(Lcom/google/android/material/internal/CheckableImageButton;)V

    new-instance v0, Lq/b0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lq/b0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lkd/x;->j(Lq/a1;)V

    invoke-virtual {p0, p2}, Lkd/x;->i(Lq/a1;)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public A(Ly2/p;)V
    .locals 1
    .param p1    # Ly2/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ly2/p;->y0(Landroid/view/View;)V

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ly2/p;->L0(Landroid/view/View;)V

    return-void

    :cond_0
    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, v0}, Ly2/p;->L0(Landroid/view/View;)V

    return-void
.end method

.method public B()V
    .locals 6

    iget-object v0, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lkd/x;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result v1

    :goto_0
    iget-object v2, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lic/d;->K:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v0

    invoke-static {v2, v1, v3, v4, v0}, Landroidx/core/view/o0;->B0(Landroid/view/View;IIII)V

    return-void
.end method

.method public final C()V
    .locals 4

    iget-object v0, p0, Lkd/x;->c:Ljava/lang/CharSequence;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkd/x;->j:Z

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_1

    if-nez v0, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->o0()Z

    return-void
.end method

.method public a()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lkd/x;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 3

    invoke-virtual {p0}, Lkd/x;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {v1}, Landroidx/core/view/n;->a(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-static {v2}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public d()Landroid/widget/TextView;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public f()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lkd/x;->g:I

    return v0
.end method

.method public h()Landroid/widget/ImageView$ScaleType;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lkd/x;->h:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public final i(Lq/a1;)V
    .locals 3

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    sget v1, Lic/f;->T:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/core/view/o0;->o0(Landroid/view/View;I)V

    sget v0, Lic/k;->E7:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lq/a1;->n(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lkd/x;->o(I)V

    sget v0, Lic/k;->F7:I

    invoke-virtual {p1, v0}, Lq/a1;->s(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lq/a1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkd/x;->p(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget v0, Lic/k;->D7:I

    invoke-virtual {p1, v0}, Lq/a1;->p(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkd/x;->n(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final j(Lq/a1;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Led/c;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/n;->c(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkd/x;->u(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v0}, Lkd/x;->v(Landroid/view/View$OnLongClickListener;)V

    sget v1, Lic/k;->L7:I

    invoke-virtual {p1, v1}, Lq/a1;->s(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1, v1}, Led/c;->b(Landroid/content/Context;Lq/a1;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    :cond_1
    sget v1, Lic/k;->M7:I

    invoke-virtual {p1, v1}, Lq/a1;->s(I)Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_2

    invoke-virtual {p1, v1, v3}, Lq/a1;->k(II)I

    move-result v1

    invoke-static {v1, v0}, Lad/r;->i(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lkd/x;->f:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    sget v0, Lic/k;->I7:I

    invoke-virtual {p1, v0}, Lq/a1;->s(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lq/a1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkd/x;->s(Landroid/graphics/drawable/Drawable;)V

    sget v0, Lic/k;->H7:I

    invoke-virtual {p1, v0}, Lq/a1;->s(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lq/a1;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkd/x;->r(Ljava/lang/CharSequence;)V

    :cond_3
    sget v0, Lic/k;->G7:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lq/a1;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lkd/x;->q(Z)V

    :cond_4
    sget v0, Lic/k;->J7:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lic/d;->c0:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lq/a1;->f(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lkd/x;->t(I)V

    sget v0, Lic/k;->K7:I

    invoke-virtual {p1, v0}, Lq/a1;->s(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0, v3}, Lq/a1;->k(II)I

    move-result p1

    invoke-static {p1}, Lkd/s;->b(I)Landroid/widget/ImageView$ScaleType;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkd/x;->w(Landroid/widget/ImageView$ScaleType;)V

    :cond_5
    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lkd/x;->j:Z

    invoke-virtual {p0}, Lkd/x;->C()V

    return-void
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2}, Lkd/s;->d(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public n(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lkd/x;->c:Ljava/lang/CharSequence;

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lkd/x;->C()V

    return-void
.end method

.method public o(I)V
    .locals 1

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ld3/i;->s(Landroid/widget/TextView;I)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    invoke-virtual {p0}, Lkd/x;->B()V

    return-void
.end method

.method public p(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lkd/x;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public q(Z)V
    .locals 1

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    return-void
.end method

.method public r(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-virtual {p0}, Lkd/x;->e()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public s(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lkd/x;->f:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0, v1, v2}, Lkd/s;->a(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lkd/x;->z(Z)V

    invoke-virtual {p0}, Lkd/x;->m()V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkd/x;->z(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkd/x;->u(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, p1}, Lkd/x;->v(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p0, p1}, Lkd/x;->r(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public t(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Lkd/x;->g:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lkd/x;->g:I

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lkd/s;->g(Lcom/google/android/material/internal/CheckableImageButton;I)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "startIconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v1, p0, Lkd/x;->i:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1, v1}, Lkd/s;->h(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public v(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iput-object p1, p0, Lkd/x;->i:Landroid/view/View$OnLongClickListener;

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lkd/s;->i(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public w(Landroid/widget/ImageView$ScaleType;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView$ScaleType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lkd/x;->h:Landroid/widget/ImageView$ScaleType;

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, Lkd/s;->j(Lcom/google/android/material/internal/CheckableImageButton;Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public x(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lkd/x;->f:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Lkd/s;->a(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public y(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    iget-object v0, p0, Lkd/x;->f:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lkd/x;->f:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Lkd/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v2, p0, Lkd/x;->e:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, v2, p1}, Lkd/s;->a(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 1

    invoke-virtual {p0}, Lkd/x;->k()Z

    move-result v0

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lkd/x;->d:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lkd/x;->B()V

    invoke-virtual {p0}, Lkd/x;->C()V

    :cond_1
    return-void
.end method
