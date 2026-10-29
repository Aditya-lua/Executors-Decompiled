.class public Lxi/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxi/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;

.field public final synthetic b:Lxi/f;


# direct methods
.method public constructor <init>(Lxi/f;Landroidx/appcompat/widget/SearchView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxi/f$a;->b:Lxi/f;

    iput-object p2, p0, Lxi/f$a;->a:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 3

    iget-object p1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {p1}, Lxi/f;->b(Lxi/f;)Landroid/view/Menu;

    move-result-object v0

    iget-object v1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {v1}, Lxi/f;->e(Lxi/f;)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Lxi/f;->h(Lxi/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    iget-object p1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {p1}, Lxi/f;->c(Lxi/f;)Lxi/f$e;

    move-result-object v0

    invoke-interface {v0}, Lxi/f$e;->d()I

    move-result v0

    const-string v1, "searchClose"

    invoke-static {p1, v0, v1}, Lxi/f;->g(Lxi/f;ILjava/lang/String;)V

    return v2
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 3

    iget-object p1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {p1}, Lxi/f;->d(Lxi/f;)Lcom/roblox/client/components/RobloxToolbar;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxi/f$a;->a:Landroidx/appcompat/widget/SearchView;

    new-instance v0, Lxi/f$a$a;

    invoke-direct {v0, p0}, Lxi/f$a$a;-><init>(Lxi/f$a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {p1}, Lxi/f;->b(Lxi/f;)Landroid/view/Menu;

    move-result-object v0

    iget-object v1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {v1}, Lxi/f;->e(Lxi/f;)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lxi/f;->h(Lxi/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    iget-object p1, p0, Lxi/f$a;->b:Lxi/f;

    invoke-static {p1}, Lxi/f;->c(Lxi/f;)Lxi/f$e;

    move-result-object v0

    invoke-interface {v0}, Lxi/f$e;->d()I

    move-result v0

    const-string v1, "searchOpen"

    invoke-static {p1, v0, v1}, Lxi/f;->g(Lxi/f;ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
