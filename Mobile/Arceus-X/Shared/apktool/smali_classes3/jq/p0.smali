.class public final Ljq/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroid/view/Window;",
        "",
        "backgroundColor",
        "",
        "a",
        "(Landroid/view/Window;I)V",
        "shared_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/view/Window;I)V
    .locals 5
    .param p0    # Landroid/view/Window;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-static {v0, v1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    const/4 v0, -0x1

    invoke-static {v0, p1}, Landroidx/core/graphics/c;->d(II)D

    move-result-wide v0

    const/high16 v2, -0x1000000

    invoke-static {v2, p1}, Landroidx/core/graphics/c;->d(II)D

    move-result-wide v2

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const-string v4, "getDecorView(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroidx/core/view/l1;

    invoke-direct {v4, p0, p1}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    cmpg-double p0, v0, v2

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-gez p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    invoke-virtual {v4, v1}, Landroidx/core/view/l1;->d(Z)V

    if-gez p0, :cond_1

    move p1, v0

    :cond_1
    invoke-virtual {v4, p1}, Landroidx/core/view/l1;->c(Z)V

    return-void
.end method
