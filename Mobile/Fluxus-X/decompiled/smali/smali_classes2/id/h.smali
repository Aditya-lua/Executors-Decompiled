.class public Lid/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lid/e;

    invoke-direct {p0}, Lid/e;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Lid/j;

    invoke-direct {p0}, Lid/j;-><init>()V

    return-object p0
.end method

.method public static b()Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/j;

    invoke-direct {v0}, Lid/j;-><init>()V

    return-object v0
.end method

.method public static c()Lid/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/f;

    invoke-direct {v0}, Lid/f;-><init>()V

    return-object v0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v0, p0, Lid/g;

    if-eqz v0, :cond_0

    check-cast p0, Lid/g;

    invoke-virtual {p0, p1}, Lid/g;->Z(F)V

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lid/g;

    if-eqz v1, :cond_0

    check-cast v0, Lid/g;

    invoke-static {p0, v0}, Lid/h;->f(Landroid/view/View;Lid/g;)V

    :cond_0
    return-void
.end method

.method public static f(Landroid/view/View;Lid/g;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lid/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lid/g;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lbd/r;->g(Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, Lid/g;->d0(F)V

    :cond_0
    return-void
.end method
