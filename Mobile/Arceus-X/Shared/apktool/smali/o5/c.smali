.class public Lo5/c;
.super Lo5/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/c$a;
    }
.end annotation


# static fields
.field public static final Q:[Ljava/lang/String;

.field public static final R:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "android:clipBounds:clip"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo5/c;->Q:[Ljava/lang/String;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lo5/c;->R:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo5/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final B0(Lo5/d0;Z)V
    .locals 3

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    if-eqz p2, :cond_1

    sget p2, Lo5/l;->b:I

    invoke-virtual {v0, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Rect;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-nez p2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p2

    :cond_2
    sget-object v2, Lo5/c;->R:Landroid/graphics/Rect;

    if-ne p2, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, p2

    :goto_1
    iget-object p2, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v2, "android:clipBounds:clip"

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v1, :cond_4

    new-instance p2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v2, 0x0

    invoke-direct {p2, v2, v2, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v0, "android:clipBounds:bounds"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    return-void
.end method

.method public V()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lo5/c;->Q:[Ljava/lang/String;

    return-object v0
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Lo5/d0;)V
    .locals 1
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo5/c;->B0(Lo5/d0;Z)V

    return-void
.end method

.method public o(Lo5/d0;)V
    .locals 1
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo5/c;->B0(Lo5/d0;Z)V

    return-void
.end method

.method public s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 5
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    if-eqz p2, :cond_5

    if-eqz p3, :cond_5

    iget-object v0, p2, Lo5/d0;->a:Ljava/util/Map;

    const-string v1, "android:clipBounds:clip"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p3, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget-object v2, p3, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    const-string v2, "android:clipBounds:bounds"

    if-nez v0, :cond_2

    iget-object p2, p2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Rect;

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    if-nez v1, :cond_3

    iget-object v3, p3, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    invoke-virtual {p2, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return-object p1

    :cond_4
    iget-object p1, p3, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    new-instance p1, Lo5/m;

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p1, v3}, Lo5/m;-><init>(Landroid/graphics/Rect;)V

    iget-object v3, p3, Lo5/d0;->b:Landroid/view/View;

    sget-object v4, Lo5/i0;->c:Landroid/util/Property;

    filled-new-array {p2, v2}, [Landroid/graphics/Rect;

    move-result-object p2

    invoke-static {v3, v4, p1, p2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iget-object p2, p3, Lo5/d0;->b:Landroid/view/View;

    new-instance p3, Lo5/c$a;

    invoke-direct {p3, p2, v0, v1}, Lo5/c$a;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    invoke-virtual {p1, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, p3}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    :cond_5
    :goto_2
    return-object p1
.end method
