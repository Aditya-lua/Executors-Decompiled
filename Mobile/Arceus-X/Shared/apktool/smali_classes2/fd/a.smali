.class public Lfd/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lhd/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/a$b;
    }
.end annotation


# instance fields
.field public a:Lfd/a$b;


# direct methods
.method public constructor <init>(Lfd/a$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    iput-object p1, p0, Lfd/a;->a:Lfd/a$b;

    return-void
.end method

.method public synthetic constructor <init>(Lfd/a$b;Lfd/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lfd/a;-><init>(Lfd/a$b;)V

    return-void
.end method

.method public constructor <init>(Lhd/k;)V
    .locals 2

    .line 2
    new-instance v0, Lfd/a$b;

    new-instance v1, Lhd/g;

    invoke-direct {v1, p1}, Lhd/g;-><init>(Lhd/k;)V

    invoke-direct {v0, v1}, Lfd/a$b;-><init>(Lhd/g;)V

    invoke-direct {p0, v0}, Lfd/a;-><init>(Lfd/a$b;)V

    return-void
.end method


# virtual methods
.method public a()Lfd/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lfd/a$b;

    iget-object v1, p0, Lfd/a;->a:Lfd/a$b;

    invoke-direct {v0, v1}, Lfd/a$b;-><init>(Lfd/a$b;)V

    iput-object v0, p0, Lfd/a;->a:Lfd/a$b;

    return-object p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-boolean v1, v0, Lfd/a$b;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mutate()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lfd/a;->a()Lfd/a;

    move-result-object v0

    return-object v0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 4
    .param p1    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v1, v1, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v0, v2

    :cond_0
    invoke-static {p1}, Lfd/b;->b([I)Z

    move-result p1

    iget-object v1, p0, Lfd/a;->a:Lfd/a$b;

    iget-boolean v3, v1, Lfd/a$b;->b:Z

    if-eq v3, p1, :cond_1

    iput-boolean p1, v1, Lfd/a$b;->b:Z

    return v2

    :cond_1
    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setShapeAppearanceModel(Lhd/k;)V
    .locals 1
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    return-void
.end method

.method public setTint(I)V
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Lfd/a$b;

    iget-object v0, v0, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
