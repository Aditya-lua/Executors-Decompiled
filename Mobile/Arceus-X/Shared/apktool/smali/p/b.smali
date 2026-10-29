.class public abstract Lp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lw1/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/j<",
            "Lr2/b;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lw1/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/j<",
            "Lr2/c;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp/b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lr2/b;

    if-eqz v0, :cond_2

    check-cast p1, Lr2/b;

    iget-object v0, p0, Lp/b;->b:Lw1/j;

    if-nez v0, :cond_0

    new-instance v0, Lw1/j;

    invoke-direct {v0}, Lw1/j;-><init>()V

    iput-object v0, p0, Lp/b;->b:Lw1/j;

    :cond_0
    iget-object v0, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, Lp/c;

    iget-object v1, p0, Lp/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lp/c;-><init>(Landroid/content/Context;Lr2/b;)V

    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, Lr2/c;

    if-eqz v0, :cond_2

    check-cast p1, Lr2/c;

    iget-object v0, p0, Lp/b;->c:Lw1/j;

    if-nez v0, :cond_0

    new-instance v0, Lw1/j;

    invoke-direct {v0}, Lw1/j;-><init>()V

    iput-object v0, p0, Lp/b;->c:Lw1/j;

    :cond_0
    iget-object v0, p0, Lp/b;->c:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, Lp/g;

    iget-object v1, p0, Lp/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lp/g;-><init>(Landroid/content/Context;Lr2/c;)V

    iget-object v1, p0, Lp/b;->c:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lp/b;->b:Lw1/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lw1/j;->clear()V

    :cond_0
    iget-object v0, p0, Lp/b;->c:Lw1/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lw1/j;->clear()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, Lp/b;->b:Lw1/j;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1}, Lw1/j;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1, v0}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/b;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1, v0}, Lw1/j;->i(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final g(I)V
    .locals 2

    iget-object v0, p0, Lp/b;->b:Lw1/j;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1}, Lw1/j;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {v1, v0}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/b;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object p1, p0, Lp/b;->b:Lw1/j;

    invoke-virtual {p1, v0}, Lw1/j;->i(I)Ljava/lang/Object;

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
