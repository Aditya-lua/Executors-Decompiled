.class public Lj/g$d$a;
.super Landroidx/core/view/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/g$d;


# direct methods
.method public constructor <init>(Lj/g$d;)V
    .locals 0

    iput-object p1, p0, Lj/g$d$a;->a:Lj/g$d;

    invoke-direct {p0}, Landroidx/core/view/a1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/g$d$a;->a:Lj/g$d;

    iget-object p1, p1, Lj/g$d;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lj/g$d$a;->a:Lj/g$d;

    iget-object p1, p1, Lj/g$d;->a:Lj/g;

    iget-object p1, p1, Lj/g;->y:Landroidx/core/view/y0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(Landroidx/core/view/z0;)Landroidx/core/view/y0;

    iget-object p1, p0, Lj/g$d$a;->a:Lj/g$d;

    iget-object p1, p1, Lj/g$d;->a:Lj/g;

    iput-object v0, p1, Lj/g;->y:Landroidx/core/view/y0;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/g$d$a;->a:Lj/g$d;

    iget-object p1, p1, Lj/g$d;->a:Lj/g;

    iget-object p1, p1, Lj/g;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
