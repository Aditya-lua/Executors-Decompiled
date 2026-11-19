.class public Landroidx/appcompat/widget/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/a$f;->a:Landroidx/appcompat/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    instance-of v0, p1, Landroidx/appcompat/view/menu/l;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/e;->e(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a$f;->a:Landroidx/appcompat/widget/a;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/a;->n()Landroidx/appcompat/view/menu/i$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/menu/i$a;->b(Landroidx/appcompat/view/menu/e;Z)V

    :cond_1
    return-void
.end method

.method public c(Landroidx/appcompat/view/menu/e;)Z
    .locals 3
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/widget/a$f;->a:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->v(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a$f;->a:Landroidx/appcompat/widget/a;

    move-object v2, p1

    check-cast v2, Landroidx/appcompat/view/menu/l;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/l;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, v0, Landroidx/appcompat/widget/a;->D:I

    iget-object v0, p0, Landroidx/appcompat/widget/a$f;->a:Landroidx/appcompat/widget/a;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/a;->n()Landroidx/appcompat/view/menu/i$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroidx/appcompat/view/menu/i$a;->c(Landroidx/appcompat/view/menu/e;)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method
