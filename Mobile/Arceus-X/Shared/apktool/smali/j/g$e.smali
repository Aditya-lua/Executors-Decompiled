.class public Lj/g$e;
.super Landroidx/core/view/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g;->V0(Lo/b$a;)Lo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/g;


# direct methods
.method public constructor <init>(Lj/g;)V
    .locals 0

    iput-object p1, p0, Lj/g$e;->a:Lj/g;

    invoke-direct {p0}, Landroidx/core/view/a1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iget-object p1, p1, Lj/g;->y:Landroidx/core/view/y0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iput-object v0, p1, Lj/g;->y:Landroidx/core/view/y0;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj/g$e;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    :cond_0
    return-void
.end method
