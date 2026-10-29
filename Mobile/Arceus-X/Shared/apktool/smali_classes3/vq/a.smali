.class public final Lvq/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lvq/a;",
        "",
        "",
        "controlNavigationBar",
        "controlStatusBar",
        "<init>",
        "(ZZ)V",
        "Landroid/content/Context;",
        "context",
        "",
        "backgroundColor",
        "",
        "a",
        "(Landroid/content/Context;I)V",
        "Landroid/view/Window;",
        "b",
        "(Landroid/view/Window;I)V",
        "Z",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvq/a;->a:Z

    iput-boolean p2, p0, Lvq/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljq/g;->a(Landroid/content/Context;)Lj/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lvq/a;->b(Landroid/view/Window;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Landroid/view/Window;I)V
    .locals 6

    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    invoke-static {v0, v1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    const/4 v0, -0x1

    invoke-static {v0, p2}, Landroidx/core/graphics/c;->d(II)D

    move-result-wide v0

    const/high16 v2, -0x1000000

    invoke-static {v2, p2}, Landroidx/core/graphics/c;->d(II)D

    move-result-wide v2

    new-instance p2, Landroidx/core/view/l1;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    invoke-direct {p2, p1, v4}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    iget-boolean p1, p0, Lvq/a;->a:Z

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p1, :cond_1

    cmpg-double p1, v0, v2

    if-gez p1, :cond_0

    move p1, v5

    goto :goto_0

    :cond_0
    move p1, v4

    :goto_0
    invoke-virtual {p2, p1}, Landroidx/core/view/l1;->c(Z)V

    :cond_1
    iget-boolean p1, p0, Lvq/a;->b:Z

    if-eqz p1, :cond_3

    cmpg-double p1, v0, v2

    if-gez p1, :cond_2

    move v4, v5

    :cond_2
    invoke-virtual {p2, v4}, Landroidx/core/view/l1;->d(Z)V

    :cond_3
    return-void
.end method
