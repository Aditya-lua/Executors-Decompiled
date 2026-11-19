.class public Lf4/v$a;
.super Lf4/a0;
.source "SourceFile"

# interfaces
.implements Ll2/e;
.implements Ll2/f;
.implements Lk2/o;
.implements Lk2/p;
.implements Landroidx/lifecycle/c1;
.implements Le/r0;
.implements Lg/h;
.implements Le5/i;
.implements Lf4/o0;
.implements Landroidx/core/view/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf4/a0<",
        "Lf4/v;",
        ">;",
        "Ll2/e;",
        "Ll2/f;",
        "Lk2/o;",
        "Lk2/p;",
        "Landroidx/lifecycle/c1;",
        "Le/r0;",
        "Lg/h;",
        "Le5/i;",
        "Lf4/o0;",
        "Landroidx/core/view/o;"
    }
.end annotation


# instance fields
.field public final synthetic f:Lf4/v;


# direct methods
.method public constructor <init>(Lf4/v;)V
    .locals 0

    iput-object p1, p0, Lf4/v$a;->f:Lf4/v;

    invoke-direct {p0, p1}, Lf4/a0;-><init>(Lf4/v;)V

    return-void
.end method


# virtual methods
.method public A()Le5/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0}, Le/p;->A()Le5/f;

    move-result-object v0

    return-object v0
.end method

.method public P()Le/p0;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0}, Le/p;->P()Le/p0;

    move-result-object v0

    return-object v0
.end method

.method public Q(Landroidx/core/view/r;)V
    .locals 1
    .param p1    # Landroidx/core/view/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->Q(Landroidx/core/view/r;)V

    return-void
.end method

.method public a()Landroidx/lifecycle/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    iget-object v0, v0, Lf4/v;->y:Landroidx/lifecycle/u;

    return-object v0
.end method

.method public b(Lf4/k0;Lf4/q;)V
    .locals 0
    .param p1    # Lf4/k0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lf4/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {p1, p2}, Lf4/v;->q1(Lf4/q;)V

    return-void
.end method

.method public c0(Lx2/a;)V
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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->c0(Lx2/a;)V

    return-void
.end method

.method public d(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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
            "Lk2/h;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->d0(Lx2/a;)V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

.method public f0(Lx2/a;)V
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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->f0(Lx2/a;)V

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf4/v;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic l()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/v$a;->r()Lf4/v;

    move-result-object v0

    return-object v0
.end method

.method public l0(Landroidx/core/view/r;)V
    .locals 1
    .param p1    # Landroidx/core/view/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->l0(Landroidx/core/view/r;)V

    return-void
.end method

.method public m()Landroid/view/LayoutInflater;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 0

    invoke-virtual {p0}, Lf4/v$a;->p()V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->p0(Lx2/a;)V

    return-void
.end method

.method public q()Lg/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0}, Le/p;->q()Lg/g;

    move-result-object v0

    return-object v0
.end method

.method public r()Lf4/v;
    .locals 1

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    return-object v0
.end method

.method public w()Landroidx/lifecycle/b1;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

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

    iget-object v0, p0, Lf4/v$a;->f:Lf4/v;

    invoke-virtual {v0, p1}, Le/p;->z(Lx2/a;)V

    return-void
.end method
