.class public Lj/t$a;
.super Landroidx/core/view/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/t;


# direct methods
.method public constructor <init>(Lj/t;)V
    .locals 0

    iput-object p1, p0, Lj/t$a;->a:Lj/t;

    invoke-direct {p0}, Landroidx/core/view/a1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    iget-boolean v0, p1, Lj/t;->t:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lj/t;->h:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    iget-object p1, p1, Lj/t;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    iget-object p1, p1, Lj/t;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    iget-object p1, p1, Lj/t;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    const/4 v0, 0x0

    iput-object v0, p1, Lj/t;->y:Lo/h;

    invoke-virtual {p1}, Lj/t;->x()V

    iget-object p1, p0, Lj/t$a;->a:Lj/t;

    iget-object p1, p1, Lj/t;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    :cond_1
    return-void
.end method
