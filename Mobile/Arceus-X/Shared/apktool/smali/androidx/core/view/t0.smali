.class public final Landroidx/core/view/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/t0$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/view/WindowInsets;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/core/view/WindowInsetsCompat;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->toWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    sput-object v0, Landroidx/core/view/t0;->a:Landroid/view/WindowInsets;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/core/view/t0;->b:Z

    return-void
.end method

.method public static synthetic a([Landroid/view/WindowInsets;Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p3}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    :goto_0
    const/4 p2, 0x0

    aput-object p1, p0, p2

    sget-object p0, Landroidx/core/view/t0;->a:Landroid/view/WindowInsets;

    return-object p0
.end method

.method public static b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    sget v0, Lj2/e;->M:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget v1, Lj2/e;->U:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v0, Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/view/View$OnApplyWindowInsetsListener;

    goto :goto_0

    :cond_0
    instance-of v0, v1, Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Landroid/view/View$OnApplyWindowInsetsListener;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroidx/core/view/t0;->a:Landroid/view/WindowInsets;

    filled-new-array {v1}, [Landroid/view/WindowInsets;

    move-result-object v1

    new-instance v2, Landroidx/core/view/s0;

    invoke-direct {v2, v1, v0}, Landroidx/core/view/s0;-><init>([Landroid/view/WindowInsets;Landroid/view/View$OnApplyWindowInsetsListener;)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    sget p1, Lj2/e;->L:I

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v2, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/view/View$OnApplyWindowInsetsListener;

    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    const/4 p1, 0x0

    aget-object v0, v1, p1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    if-nez v0, :cond_3

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v2, p1

    :goto_1
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    aget-object v4, v1, p1

    invoke-static {v3, v4}, Landroidx/core/view/t0;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    aget-object p0, v1, p1

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Landroidx/core/view/t0;->a:Landroid/view/WindowInsets;

    return-object p0
.end method

.method public static c(Landroid/view/ViewGroup;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/t0$a;->a(Landroid/view/ViewGroup;)Z

    move-result p0

    return p0
.end method
