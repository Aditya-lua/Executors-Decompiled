.class public Lj/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public a:Lo/b$a;

.field public final synthetic b:Lj/g;


# direct methods
.method public constructor <init>(Lj/g;Lo/b$a;)V
    .locals 0

    iput-object p1, p0, Lj/g$g;->b:Lj/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj/g$g;->a:Lo/b$a;

    return-void
.end method


# virtual methods
.method public a(Lo/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lj/g$g;->a:Lo/b$a;

    invoke-interface {v0, p1, p2}, Lo/b$a;->a(Lo/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lo/b;)V
    .locals 2

    iget-object v0, p0, Lj/g$g;->a:Lo/b$a;

    invoke-interface {v0, p1}, Lo/b$a;->b(Lo/b;)V

    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, p1, Lj/g;->w:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lj/g;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, v0, Lj/g;->x:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj/g;->g0()V

    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/core/view/o0;->e(Landroid/view/View;)Landroidx/core/view/y0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/y0;->b(F)Landroidx/core/view/y0;

    move-result-object v0

    iput-object v0, p1, Lj/g;->y:Landroidx/core/view/y0;

    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    iget-object p1, p1, Lj/g;->y:Landroidx/core/view/y0;

    new-instance v0, Lj/g$g$a;

    invoke-direct {v0, p0}, Lj/g$g$a;-><init>(Lj/g$g;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    :cond_1
    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, p1, Lj/g;->n:Lj/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lj/g;->u:Lo/b;

    invoke-interface {v0, p1}, Lj/c;->M(Lo/b;)V

    :cond_2
    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    const/4 v0, 0x0

    iput-object v0, p1, Lj/g;->u:Lo/b;

    iget-object p1, p1, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    iget-object p1, p0, Lj/g$g;->b:Lj/g;

    invoke-virtual {p1}, Lj/g;->a1()V

    return-void
.end method

.method public c(Lo/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lj/g$g;->a:Lo/b$a;

    invoke-interface {v0, p1, p2}, Lo/b$a;->c(Lo/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lo/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lj/g$g;->b:Lj/g;

    iget-object v0, v0, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    iget-object v0, p0, Lj/g$g;->a:Lo/b$a;

    invoke-interface {v0, p1, p2}, Lo/b$a;->d(Lo/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
