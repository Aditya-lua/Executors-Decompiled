.class public Lb3/g$b;
.super Landroidx/core/view/d1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb3/g;-><init>(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/core/view/d1;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:Lb3/g;


# direct methods
.method public constructor <init>(Lb3/g;I)V
    .locals 0

    iput-object p1, p0, Lb3/g$b;->d:Lb3/g;

    invoke-direct {p0, p2}, Landroidx/core/view/d1$b;-><init>(I)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb3/g$b;->c:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public b(Landroidx/core/view/d1;)V
    .locals 1

    invoke-virtual {p0, p1}, Lb3/g$b;->f(Landroidx/core/view/d1;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lb3/g$b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {p1}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {v0}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/g$c;

    invoke-interface {v0}, Lb3/g$c;->d()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public c(Landroidx/core/view/d1;)V
    .locals 1

    invoke-virtual {p0, p1}, Lb3/g$b;->f(Landroidx/core/view/d1;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {p1}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {v0}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/g$c;

    invoke-interface {v0}, Lb3/g$c;->c()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public d(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/d1;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ltz v1, :cond_5

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/view/d1;

    iget-object v4, p0, Lb3/g$b;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3}, Landroidx/core/view/d1;->a()F

    move-result v3

    and-int/lit8 v5, v4, 0x1

    if-eqz v5, :cond_0

    iput v3, v0, Landroid/graphics/RectF;->left:F

    :cond_0
    and-int/lit8 v5, v4, 0x2

    if-eqz v5, :cond_1

    iput v3, v0, Landroid/graphics/RectF;->top:F

    :cond_1
    and-int/lit8 v5, v4, 0x4

    if-eqz v5, :cond_2

    iput v3, v0, Landroid/graphics/RectF;->right:F

    :cond_2
    and-int/lit8 v5, v4, 0x8

    if-eqz v5, :cond_3

    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    :cond_3
    or-int/2addr v2, v4

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    iget-object p2, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {p2, p1}, Lb3/g;->f(Lb3/g;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/graphics/Insets;

    move-result-object p2

    iget-object v1, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {v1}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_6

    iget-object v3, p0, Lb3/g$b;->d:Lb3/g;

    invoke-static {v3}, Lb3/g;->e(Lb3/g;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/g$c;

    invoke-interface {v3, v2, p2, v0}, Lb3/g$c;->a(ILandroidx/core/graphics/Insets;Landroid/graphics/RectF;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_6
    return-object p1
.end method

.method public e(Landroidx/core/view/d1;Landroidx/core/view/d1$a;)Landroidx/core/view/d1$a;
    .locals 5

    invoke-virtual {p0, p1}, Lb3/g$b;->f(Landroidx/core/view/d1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroidx/core/view/d1$a;->b()Landroidx/core/graphics/Insets;

    move-result-object v0

    invoke-virtual {p2}, Landroidx/core/view/d1$a;->a()Landroidx/core/graphics/Insets;

    move-result-object v1

    iget v2, v0, Landroidx/core/graphics/Insets;->left:I

    iget v3, v1, Landroidx/core/graphics/Insets;->left:I

    if-eq v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Landroidx/core/graphics/Insets;->top:I

    iget v4, v1, Landroidx/core/graphics/Insets;->top:I

    if-eq v3, v4, :cond_2

    or-int/lit8 v2, v2, 0x2

    :cond_2
    iget v3, v0, Landroidx/core/graphics/Insets;->right:I

    iget v4, v1, Landroidx/core/graphics/Insets;->right:I

    if-eq v3, v4, :cond_3

    or-int/lit8 v2, v2, 0x4

    :cond_3
    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    iget v1, v1, Landroidx/core/graphics/Insets;->bottom:I

    if-eq v0, v1, :cond_4

    or-int/lit8 v2, v2, 0x8

    :cond_4
    iget-object v0, p0, Lb3/g$b;->c:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final f(Landroidx/core/view/d1;)Z
    .locals 1

    invoke-virtual {p1}, Landroidx/core/view/d1;->d()I

    move-result p1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
