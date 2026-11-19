.class public Lj/g$g$a;
.super Landroidx/core/view/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g$g;->b(Lo/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/g$g;


# direct methods
.method public constructor <init>(Lj/g$g;)V
    .locals 0

    iput-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    invoke-direct {p0}, Landroidx/core/view/a1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iget-object v0, p1, Lj/g;->w:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iget-object p1, p1, Lj/g;->y:Landroidx/core/view/y0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    iget-object p1, p0, Lj/g$g$a;->a:Lj/g$g;

    iget-object p1, p1, Lj/g$g;->b:Lj/g;

    iput-object v0, p1, Lj/g;->y:Landroidx/core/view/y0;

    iget-object p1, p1, Lj/g;->B:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    return-void
.end method
