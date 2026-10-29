.class public Landroidx/core/view/l1$c;
.super Landroidx/core/view/l1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroidx/core/view/i0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/core/view/l1$b;-><init>(Landroid/view/Window;Landroidx/core/view/i0;)V

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 1

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    const/high16 p1, 0x8000000

    invoke-virtual {p0, p1}, Landroidx/core/view/l1$a;->l(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, Landroidx/core/view/l1$a;->i(I)V

    invoke-virtual {p0, v0}, Landroidx/core/view/l1$a;->h(I)V

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/core/view/l1$a;->k(I)V

    return-void
.end method
