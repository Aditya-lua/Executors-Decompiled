.class public Le4/q$a;
.super Le4/t;
.source "SourceFile"

# interfaces
.implements Ll2/e;
.implements Ll2/f;
.implements Lk2/o;
.implements Lk2/p;
.implements Landroidx/lifecycle/c1;
.implements Le/r0;
.implements Lg/g;
.implements Ld5/i;
.implements Le4/e0;
.implements Landroidx/core/view/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le4/t<",
        "Le4/q;",
        ">;",
        "Ll2/e;",
        "Ll2/f;",
        "Lk2/o;",
        "Lk2/p;",
        "Landroidx/lifecycle/c1;",
        "Le/r0;",
        "Lg/g;",
        "Ld5/i;",
        "Le4/e0;",
        "Landroidx/core/view/o;"
    }
.end annotation


# instance fields
.field public final synthetic f:Le4/q;


# direct methods
.method public constructor <init>(Le4/q;)V
    .locals 0

    iput-object p1, p0, Le4/q$a;->f:Le4/q;

    invoke-direct {p0, p1}, Le4/t;-><init>(Le4/q;)V

    return-void
.end method


# virtual methods
.method public A()Ld5/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Le/p;->A()Ld5/f;

    move-result-object v0

    return-object v0
.end method

.method public Q()Le/p0;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Le/p;->Q()Le/p0;

    move-result-object v0

    return-object v0
.end method

.method public R(Landroidx/core/view/r;)V
    .locals 1
    .param p1    # Landroidx/core/view/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->R(Landroidx/core/view/r;)V

    return-void
.end method

.method public a()Landroidx/lifecycle/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    iget-object v0, v0, Le4/q;->y:Landroidx/lifecycle/u;

    return-object v0
.end method

.method public b(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/c;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {p1, p2}, Le4/q;->q1(Landroidx/fragment/app/c;)V

    return-void
.end method

.method public d(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public d0(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->d0(Lx2/a;)V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e0(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lk2/h;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->e0(Lx2/a;)V

    return-void
.end method

.method public g0(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->g0(Lx2/a;)V

    return-void
.end method

.method public h0(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lk2/s;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->h0(Lx2/a;)V

    return-void
.end method

.method public j(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->j(Lx2/a;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/PrintWriter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1, p2, p3, p4}, Le4/q;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic l()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le4/q$a;->r()Le4/q;

    move-result-object v0

    return-object v0
.end method

.method public l0(Landroidx/core/view/r;)V
    .locals 1
    .param p1    # Landroidx/core/view/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->l0(Landroidx/core/view/r;)V

    return-void
.end method

.method public m()Landroid/view/LayoutInflater;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 0

    invoke-virtual {p0}, Le4/q$a;->p()V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Le/p;->Y0()V

    return-void
.end method

.method public p0(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Landroid/content/res/Configuration;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->p0(Lx2/a;)V

    return-void
.end method

.method public q()Lg/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Le/p;->q()Lg/f;

    move-result-object v0

    return-object v0
.end method

.method public r()Le4/q;
    .locals 1

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    return-object v0
.end method

.method public w()Landroidx/lifecycle/b1;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0}, Le/p;->w()Landroidx/lifecycle/b1;

    move-result-object v0

    return-object v0
.end method

.method public y(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lk2/h;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->y(Lx2/a;)V

    return-void
.end method

.method public z(Lx2/a;)V
    .locals 1
    .param p1    # Lx2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lk2/s;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le4/q$a;->f:Le4/q;

    invoke-virtual {v0, p1}, Le/p;->z(Lx2/a;)V

    return-void
.end method
