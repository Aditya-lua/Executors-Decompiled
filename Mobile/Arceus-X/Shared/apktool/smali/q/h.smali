.class public Lq/h;
.super Landroid/widget/CheckedTextView;
.source "SourceFile"


# instance fields
.field public final a:Lq/i;

.field public final b:Lq/e;

.field public final c:Lq/a0;

.field public d:Lq/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Li/a;->t:I

    invoke-direct {p0, p1, p2, v0}, Lq/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {p1}, Lq/x0;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lq/v0;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    new-instance p1, Lq/a0;

    invoke-direct {p1, p0}, Lq/a0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lq/h;->c:Lq/a0;

    .line 5
    invoke-virtual {p1, p2, p3}, Lq/a0;->m(Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p1}, Lq/a0;->b()V

    .line 7
    new-instance p1, Lq/e;

    invoke-direct {p1, p0}, Lq/e;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lq/h;->b:Lq/e;

    .line 8
    invoke-virtual {p1, p2, p3}, Lq/e;->e(Landroid/util/AttributeSet;I)V

    .line 9
    new-instance p1, Lq/i;

    invoke-direct {p1, p0}, Lq/i;-><init>(Landroid/widget/CheckedTextView;)V

    iput-object p1, p0, Lq/h;->a:Lq/i;

    .line 10
    invoke-virtual {p1, p2, p3}, Lq/i;->d(Landroid/util/AttributeSet;I)V

    .line 11
    invoke-direct {p0}, Lq/h;->getEmojiTextViewHelper()Lq/n;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p2, p3}, Lq/n;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lq/n;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lq/h;->d:Lq/n;

    if-nez v0, :cond_0

    new-instance v0, Lq/n;

    invoke-direct {v0, p0}, Lq/n;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lq/h;->d:Lq/n;

    :cond_0
    iget-object v0, p0, Lq/h;->d:Lq/n;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/a0;->b()V

    :cond_0
    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lq/e;->b()V

    :cond_1
    iget-object v0, p0, Lq/h;->a:Lq/i;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lq/i;->a()V

    :cond_2
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    invoke-static {v0}, Ld3/i;->u(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/e;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/e;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCheckMarkTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lq/h;->a:Lq/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/i;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCheckMarkTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lq/h;->a:Lq/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/i;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {v0}, Lq/a0;->j()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {v0}, Lq/a0;->k()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lq/o;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lq/h;->getEmojiTextViewHelper()Lq/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq/n;->d(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/e;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/e;->g(I)V

    :cond_0
    return-void
.end method

.method public setCheckMarkDrawable(I)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lk/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq/h;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lq/h;->a:Lq/i;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lq/i;->e()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lq/h;->c:Lq/a0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq/a0;->p()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lq/h;->c:Lq/a0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq/a0;->p()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Ld3/i;->v(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lq/h;->getEmojiTextViewHelper()Lq/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq/n;->e(Z)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/e;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lq/h;->b:Lq/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/e;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lq/h;->a:Lq/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/i;->f(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lq/h;->a:Lq/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq/i;->g(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {v0, p1}, Lq/a0;->w(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {p1}, Lq/a0;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {v0, p1}, Lq/a0;->x(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Lq/h;->c:Lq/a0;

    invoke-virtual {p1}, Lq/a0;->b()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lq/h;->c:Lq/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lq/a0;->q(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
