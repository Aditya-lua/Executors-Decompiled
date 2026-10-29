.class public Lcom/roblox/client/game/b$a;
.super Landroidx/core/view/d1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/roblox/client/game/b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-direct {p0, p2}, Landroidx/core/view/d1$b;-><init>(I)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/roblox/client/game/b$a;->c:I

    return-void
.end method


# virtual methods
.method public b(Landroidx/core/view/d1;)V
    .locals 2
    .param p1    # Landroidx/core/view/d1;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/core/view/d1$b;->b(Landroidx/core/view/d1;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U4()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/d1;->d()I

    move-result p1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/roblox/client/game/b;->p(Lcom/roblox/client/game/b;Z)V

    iget-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-static {p1}, Lcom/roblox/client/game/b;->m(Lcom/roblox/client/game/b;)Lnk/b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-static {p1}, Lcom/roblox/client/game/b;->m(Lcom/roblox/client/game/b;)Lnk/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-static {v1}, Lcom/roblox/client/game/b;->w(Lcom/roblox/client/game/b;)F

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/roblox/client/game/b;->r(Lcom/roblox/client/game/b;Lnk/b;F)V

    :cond_0
    return-void
.end method

.method public d(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 4
    .param p1    # Landroidx/core/view/WindowInsetsCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/d1;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/view/d1;

    invoke-virtual {v0}, Landroidx/core/view/d1;->d()I

    move-result v1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    iget v1, p0, Lcom/roblox/client/game/b$a;->c:I

    invoke-static {p2}, Lcom/roblox/client/game/b;->l(Lcom/roblox/client/game/b;)I

    move-result v2

    iget v3, p0, Lcom/roblox/client/game/b$a;->c:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0}, Landroidx/core/view/d1;->c()F

    move-result v0

    mul-float/2addr v2, v0

    float-to-int v0, v2

    add-int/2addr v1, v0

    invoke-static {p2, v1}, Lcom/roblox/client/game/b;->o(Lcom/roblox/client/game/b;I)V

    iget-object p2, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-static {p2}, Lcom/roblox/client/game/b;->k(Lcom/roblox/client/game/b;)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/roblox/client/game/b;->x(I)V

    :cond_2
    return-object p1
.end method

.method public e(Landroidx/core/view/d1;Landroidx/core/view/d1$a;)Landroidx/core/view/d1$a;
    .locals 1
    .param p1    # Landroidx/core/view/d1;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/core/view/d1$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U4()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/d1;->d()I

    move-result p1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/roblox/client/game/b;->p(Lcom/roblox/client/game/b;Z)V

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/game/b$a;->d:Lcom/roblox/client/game/b;

    invoke-static {p1}, Lcom/roblox/client/game/b;->k(Lcom/roblox/client/game/b;)I

    move-result p1

    iput p1, p0, Lcom/roblox/client/game/b$a;->c:I

    return-object p2
.end method
