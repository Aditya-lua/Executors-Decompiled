.class public Lcom/google/android/material/progressindicator/CircularProgressIndicator;
.super Lcom/google/android/material/progressindicator/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/progressindicator/a<",
        "Ldd/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lic/j;->t:I

    sput v0, Lcom/google/android/material/progressindicator/CircularProgressIndicator;->p:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Lic/b;->f:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    sget v0, Lcom/google/android/material/progressindicator/CircularProgressIndicator;->p:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/material/progressindicator/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;->s()V

    return-void
.end method


# virtual methods
.method public getIndicatorDirection()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v0, Ldd/e;

    iget v0, v0, Ldd/e;->j:I

    return v0
.end method

.method public getIndicatorInset()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v0, Ldd/e;

    iget v0, v0, Ldd/e;->i:I

    return v0
.end method

.method public getIndicatorSize()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v0, Ldd/e;

    iget v0, v0, Ldd/e;->h:I

    return v0
.end method

.method public bridge synthetic i(Landroid/content/Context;Landroid/util/AttributeSet;)Ldd/b;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;->r(Landroid/content/Context;Landroid/util/AttributeSet;)Ldd/e;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroid/content/Context;Landroid/util/AttributeSet;)Ldd/e;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ldd/e;

    invoke-direct {v0, p1, p2}, Ldd/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final s()V
    .locals 3

    new-instance v0, Ldd/c;

    iget-object v1, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v1, Ldd/e;

    invoke-direct {v0, v1}, Ldd/c;-><init>(Ldd/e;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v2, Ldd/e;

    invoke-static {v1, v2, v0}, Ldd/j;->t(Landroid/content/Context;Ldd/e;Ldd/c;)Ldd/j;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/material/progressindicator/a;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v2, Ldd/e;

    invoke-static {v1, v2, v0}, Ldd/f;->v(Landroid/content/Context;Ldd/e;Ldd/c;)Ldd/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/progressindicator/a;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast v0, Ldd/e;

    iput p1, v0, Ldd/e;->j:I

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/a;->invalidate()V

    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    move-object v1, v0

    check-cast v1, Ldd/e;

    iget v1, v1, Ldd/e;->i:I

    if-eq v1, p1, :cond_0

    check-cast v0, Ldd/e;

    iput p1, v0, Ldd/e;->i:I

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/a;->invalidate()V

    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/a;->getTrackThickness()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    move-object v1, v0

    check-cast v1, Ldd/e;

    iget v1, v1, Ldd/e;->h:I

    if-eq v1, p1, :cond_0

    move-object v1, v0

    check-cast v1, Ldd/e;

    iput p1, v1, Ldd/e;->h:I

    check-cast v0, Ldd/e;

    invoke-virtual {v0}, Ldd/b;->e()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/a;->invalidate()V

    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/a;->setTrackThickness(I)V

    iget-object p1, p0, Lcom/google/android/material/progressindicator/a;->a:Ldd/b;

    check-cast p1, Ldd/e;

    invoke-virtual {p1}, Ldd/b;->e()V

    return-void
.end method
