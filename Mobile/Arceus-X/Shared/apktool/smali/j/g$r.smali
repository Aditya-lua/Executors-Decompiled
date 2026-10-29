.class public final Lj/g$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "r"
.end annotation


# instance fields
.field public final synthetic a:Lj/g;


# direct methods
.method public constructor <init>(Lj/g;)V
    .locals 0

    iput-object p1, p0, Lj/g$r;->a:Lj/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 4
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lj/g$r;->a:Lj/g;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Lj/g;->j0(Landroid/view/Menu;)Lj/g$q;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lj/g$r;->a:Lj/g;

    iget v2, p1, Lj/g$q;->a:I

    invoke-virtual {p2, v2, p1, v0}, Lj/g;->V(ILj/g$q;Landroid/view/Menu;)V

    iget-object p2, p0, Lj/g$r;->a:Lj/g;

    invoke-virtual {p2, p1, v1}, Lj/g;->Z(Lj/g$q;Z)V

    return-void

    :cond_2
    iget-object v0, p0, Lj/g$r;->a:Lj/g;

    invoke-virtual {v0, p1, p2}, Lj/g;->Z(Lj/g$q;Z)V

    :cond_3
    return-void
.end method

.method public c(Landroidx/appcompat/view/menu/e;)Z
    .locals 2
    .param p1    # Landroidx/appcompat/view/menu/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lj/g$r;->a:Lj/g;

    iget-boolean v1, v0, Lj/g;->G:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lj/g;->s0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/g$r;->a:Lj/g;

    iget-boolean v1, v1, Lj/g;->R:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
