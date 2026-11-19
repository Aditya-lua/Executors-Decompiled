.class public Landroidx/core/view/l1$b;
.super Landroidx/core/view/l1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroidx/core/view/i0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/core/view/l1$a;-><init>(Landroid/view/Window;Landroidx/core/view/i0;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1$a;->a:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Z)V
    .locals 1

    const/16 v0, 0x2000

    if-eqz p1, :cond_0

    const/high16 p1, 0x4000000

    invoke-virtual {p0, p1}, Landroidx/core/view/l1$a;->l(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, Landroidx/core/view/l1$a;->i(I)V

    invoke-virtual {p0, v0}, Landroidx/core/view/l1$a;->h(I)V

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/core/view/l1$a;->k(I)V

    return-void
.end method
