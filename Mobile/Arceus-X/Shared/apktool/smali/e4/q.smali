.class public Le4/q;
.super Le/p;
.source "SourceFile"

# interfaces
.implements Lk2/b$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/q$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public final x:Le4/s;

.field public final y:Landroidx/lifecycle/u;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le/p;-><init>()V

    new-instance v0, Le4/q$a;

    invoke-direct {v0, p0}, Le4/q$a;-><init>(Le4/q;)V

    invoke-static {v0}, Le4/s;->b(Le4/t;)Le4/s;

    move-result-object v0

    iput-object v0, p0, Le4/q;->x:Le4/s;

    new-instance v0, Landroidx/lifecycle/u;

    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    iput-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/q;->B:Z

    invoke-direct {p0}, Le4/q;->n1()V

    return-void
.end method

.method public static synthetic g1(Le4/q;Landroid/content/Context;)V
    .locals 0

    iget-object p0, p0, Le4/q;->x:Le4/s;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le4/s;->a(Landroidx/fragment/app/c;)V

    return-void
.end method

.method public static synthetic h1(Le4/q;Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {p0}, Le4/s;->m()V

    return-void
.end method

.method public static synthetic i1(Le4/q;)Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Le4/q;->o1()V

    iget-object p0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v0, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    return-object p0
.end method

.method public static synthetic j1(Le4/q;Landroid/content/Intent;)V
    .locals 0

    iget-object p0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {p0}, Le4/s;->m()V

    return-void
.end method

.method private n1()V
    .locals 3

    invoke-virtual {p0}, Le/p;->A()Ld5/f;

    move-result-object v0

    new-instance v1, Le4/m;

    invoke-direct {v1, p0}, Le4/m;-><init>(Le4/q;)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Ld5/f;->c(Ljava/lang/String;Ld5/f$b;)V

    new-instance v0, Le4/n;

    invoke-direct {v0, p0}, Le4/n;-><init>(Le4/q;)V

    invoke-virtual {p0, v0}, Le/p;->g0(Lx2/a;)V

    new-instance v0, Le4/o;

    invoke-direct {v0, p0}, Le4/o;-><init>(Le4/q;)V

    invoke-virtual {p0, v0}, Le/p;->O0(Lx2/a;)V

    new-instance v0, Le4/p;

    invoke-direct {v0, p0}, Le4/p;-><init>(Le4/q;)V

    invoke-virtual {p0, v0}, Le/p;->N0(Lf/b;)V

    return-void
.end method

.method public static p1(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/l$b;)Z
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->z0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/c;->G()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/c;->v()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-static {v2, p1}, Le4/q;->p1(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/l$b;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/c;->W:Le4/k0;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Le4/k0;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v1, Landroidx/fragment/app/c;->W:Le4/k0;

    invoke-virtual {v0, p1}, Le4/k0;->g(Landroidx/lifecycle/l$b;)V

    move v0, v3

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/c;->V:Landroidx/lifecycle/u;

    invoke-virtual {v2}, Landroidx/lifecycle/u;->b()Landroidx/lifecycle/l$b;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/c;->V:Landroidx/lifecycle/u;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->o(Landroidx/lifecycle/l$b;)V

    move v0, v3

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public final P(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/PrintWriter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Lk2/g;->r0([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Le4/q;->z:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Le4/q;->A:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Le4/q;->B:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Lm4/a;->b(Landroidx/lifecycle/s;)Lm4/a;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Lm4/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->l()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentManager;->b0(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final k1(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0, p1, p2, p3, p4}, Le4/s;->n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public l1()Landroidx/fragment/app/FragmentManager;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->l()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public m1()Lm4/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lm4/a;->b(Landroidx/lifecycle/s;)Lm4/a;

    move-result-object v0

    return-object v0
.end method

.method public o1()V
    .locals 2

    :cond_0
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    invoke-static {v0, v1}, Le4/q;->p1(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/l$b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->m()V

    invoke-super {p0, p1, p2, p3}, Le/p;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Le/p;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v0, Landroidx/lifecycle/l$a;->ON_CREATE:Landroidx/lifecycle/l$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    iget-object p1, p0, Le4/q;->x:Le4/s;

    invoke-virtual {p1}, Le4/s;->e()V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Le4/q;->k1(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Le4/q;->k1(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->f()V

    iget-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p2    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Le/p;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Le4/q;->x:Le4/s;

    invoke-virtual {p1, p2}, Le4/s;->d(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Le4/q;->A:Z

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->g()V

    iget-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_PAUSE:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Le4/q;->r1()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->m()V

    invoke-super {p0, p1, p2, p3}, Le/p;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/q;->A:Z

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->k()Z

    return-void
.end method

.method public onStart()V
    .locals 2

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Le4/q;->B:Z

    iget-boolean v0, p0, Le4/q;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/q;->z:Z

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->c()V

    :cond_0
    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->k()Z

    iget-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->i()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->m()V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/q;->B:Z

    invoke-virtual {p0}, Le4/q;->o1()V

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->j()V

    iget-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public q1(Landroidx/fragment/app/c;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public r1()V
    .locals 2

    iget-object v0, p0, Le4/q;->y:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_RESUME:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    iget-object v0, p0, Le4/q;->x:Le4/s;

    invoke-virtual {v0}, Le4/s;->h()V

    return-void
.end method
