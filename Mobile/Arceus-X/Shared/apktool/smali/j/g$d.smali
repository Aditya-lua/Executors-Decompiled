.class public Lj/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lj/g$d;->a:Lj/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v1, v0, Lj/g;->w:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    invoke-virtual {v0}, Lj/g;->g0()V

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    invoke-virtual {v0}, Lj/g;->R0()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v0, v0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v2, v0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Landroidx/core/view/o0;->e(Landroid/view/View;)Landroidx/core/view/y0;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/core/view/y0;->b(F)Landroidx/core/view/y0;

    move-result-object v1

    iput-object v1, v0, Lj/g;->y:Landroidx/core/view/y0;

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v0, v0, Lj/g;->y:Landroidx/core/view/y0;

    new-instance v1, Lj/g$d$a;

    invoke-direct {v1, p0}, Lj/g$d$a;-><init>(Lj/g$d;)V

    invoke-virtual {v0, v1}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    return-void

    :cond_0
    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v0, v0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lj/g$d;->a:Lj/g;

    iget-object v0, v0, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
