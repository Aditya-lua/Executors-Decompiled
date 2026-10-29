.class public Lb3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/g$c;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb3/g$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/core/graphics/Insets;

.field public d:Landroidx/core/graphics/Insets;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/g;->c:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/g;->d:Landroidx/core/graphics/Insets;

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput v0, p0, Lb3/g;->e:I

    new-instance v0, Lb3/g$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lb3/g$a;-><init>(Lb3/g;Landroid/content/Context;Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lb3/g;->a:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v1, Lb3/e;

    invoke-direct {v1, p0}, Lb3/e;-><init>(Lb3/g;)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    new-instance v1, Lb3/g$b;

    invoke-direct {v1, p0, v2}, Lb3/g$b;-><init>(Lb3/g;I)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->H0(Landroid/view/View;Landroidx/core/view/d1$b;)V

    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic a(Lb3/g;)V
    .locals 2

    iget-object v0, p0, Lb3/g;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object p0, p0, Lb3/g;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lb3/g;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3

    invoke-virtual {p0, p2}, Lb3/g;->i(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p2}, Lb3/g;->j(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lb3/g;->c:Landroidx/core/graphics/Insets;

    invoke-virtual {p1, v1}, Landroidx/core/graphics/Insets;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb3/g;->d:Landroidx/core/graphics/Insets;

    invoke-virtual {v0, v1}, Landroidx/core/graphics/Insets;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iput-object p1, p0, Lb3/g;->c:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/g;->d:Landroidx/core/graphics/Insets;

    iget-object v1, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    iget-object v2, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/g$c;

    invoke-interface {v2, p1, v0}, Lb3/g$c;->b(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public static synthetic c(Lb3/g;)I
    .locals 0

    iget p0, p0, Lb3/g;->e:I

    return p0
.end method

.method public static synthetic d(Lb3/g;I)I
    .locals 0

    iput p1, p0, Lb3/g;->e:I

    return p1
.end method

.method public static synthetic e(Lb3/g;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic f(Lb3/g;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;
    .locals 0

    invoke-virtual {p0, p1}, Lb3/g;->i(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public g(Lb3/g$c;)V
    .locals 2

    iget-object v0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lb3/g;->c:Landroidx/core/graphics/Insets;

    iget-object v1, p0, Lb3/g;->d:Landroidx/core/graphics/Insets;

    invoke-interface {p1, v0, v1}, Lb3/g$c;->b(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)V

    iget v0, p0, Lb3/g;->e:I

    invoke-interface {p1, v0}, Lb3/g$c;->e(I)V

    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lb3/g;->a:Landroid/view/View;

    new-instance v1, Lb3/f;

    invoke-direct {v1, p0}, Lb3/f;-><init>(Lb3/g;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final i(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;
    .locals 2

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->tappableElement()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/core/graphics/Insets;->min(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;

    move-result-object p1

    return-object p1
.end method

.method public final j(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;
    .locals 2

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->tappableElement()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/core/graphics/Insets;->min(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public l(Lb3/g$c;)V
    .locals 1

    iget-object v0, p0, Lb3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
