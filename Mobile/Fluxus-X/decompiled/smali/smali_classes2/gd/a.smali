.class public Lgd/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lid/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgd/a$b;
    }
.end annotation


# instance fields
.field public a:Lgd/a$b;


# direct methods
.method public constructor <init>(Lgd/a$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    iput-object p1, p0, Lgd/a;->a:Lgd/a$b;

    return-void
.end method

.method public synthetic constructor <init>(Lgd/a$b;Lgd/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lgd/a;-><init>(Lgd/a$b;)V

    return-void
.end method

.method public constructor <init>(Lid/k;)V
    .locals 2

    .line 2
    new-instance v0, Lgd/a$b;

    new-instance v1, Lid/g;

    invoke-direct {v1, p1}, Lid/g;-><init>(Lid/k;)V

    invoke-direct {v0, v1}, Lgd/a$b;-><init>(Lid/g;)V

    invoke-direct {p0, v0}, Lgd/a;-><init>(Lgd/a$b;)V

    return-void
.end method


# virtual methods
.method public a()Lgd/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lgd/a$b;

    iget-object v1, p0, Lgd/a;->a:Lgd/a$b;

    invoke-direct {v0, v1}, Lgd/a$b;-><init>(Lgd/a$b;)V

    iput-object v0, p0, Lgd/a;->a:Lgd/a$b;

    return-object p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-boolean v1, v0, Lgd/a$b;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0}, Lid/g;->getOpacity()I

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

    invoke-virtual {p0}, Lgd/a;->a()Lgd/a;

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

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

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

    iget-object v1, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v1, v1, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v0, v2

    :cond_0
    invoke-static {p1}, Lgd/b;->b([I)Z

    move-result p1

    iget-object v1, p0, Lgd/a;->a:Lgd/a$b;

    iget-boolean v3, v1, Lgd/a$b;->b:Z

    if-eq v3, p1, :cond_1

    iput-boolean p1, v1, Lgd/a$b;->b:Z

    return v2

    :cond_1
    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setShapeAppearanceModel(Lid/k;)V
    .locals 1
    .param p1    # Lid/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setShapeAppearanceModel(Lid/k;)V

    return-void
.end method

.method public setTint(I)V
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Lgd/a$b;

    iget-object v0, v0, Lgd/a$b;->a:Lid/g;

    invoke-virtual {v0, p1}, Lid/g;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
