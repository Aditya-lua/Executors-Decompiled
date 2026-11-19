.class public Lf4/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/j;
.implements Le5/i;
.implements Landroidx/lifecycle/c1;


# instance fields
.field public final a:Lf4/q;

.field public final b:Landroidx/lifecycle/b1;

.field public final c:Ljava/lang/Runnable;

.field public d:Landroidx/lifecycle/a1$c;

.field public e:Landroidx/lifecycle/u;

.field public f:Le5/h;


# direct methods
.method public constructor <init>(Lf4/q;Landroidx/lifecycle/b1;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lf4/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/b1;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    iput-object v0, p0, Lf4/x0;->f:Le5/h;

    iput-object p1, p0, Lf4/x0;->a:Lf4/q;

    iput-object p2, p0, Lf4/x0;->b:Landroidx/lifecycle/b1;

    iput-object p3, p0, Lf4/x0;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public A()Le5/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lf4/x0;->c()V

    iget-object v0, p0, Lf4/x0;->f:Le5/h;

    invoke-virtual {v0}, Le5/h;->b()Le5/f;

    move-result-object v0

    return-object v0
.end method

.method public W()Landroidx/lifecycle/a1$c;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->W()Landroidx/lifecycle/a1$c;

    move-result-object v0

    iget-object v1, p0, Lf4/x0;->a:Lf4/q;

    iget-object v1, v1, Lf4/q;->Y:Landroidx/lifecycle/a1$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Lf4/x0;->d:Landroidx/lifecycle/a1$c;

    return-object v0

    :cond_0
    iget-object v0, p0, Lf4/x0;->d:Landroidx/lifecycle/a1$c;

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Landroidx/lifecycle/t0;

    iget-object v2, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v2}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Landroidx/lifecycle/t0;-><init>(Landroid/app/Application;Le5/i;Landroid/os/Bundle;)V

    iput-object v1, p0, Lf4/x0;->d:Landroidx/lifecycle/a1$c;

    :cond_3
    iget-object v0, p0, Lf4/x0;->d:Landroidx/lifecycle/a1$c;

    return-object v0
.end method

.method public Y()Ll4/a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Ll4/b;

    invoke-direct {v1}, Ll4/b;-><init>()V

    if-eqz v0, :cond_2

    sget-object v2, Landroidx/lifecycle/a1$a;->h:Ll4/a$c;

    invoke-virtual {v1, v2, v0}, Ll4/b;->c(Ll4/a$c;Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Landroidx/lifecycle/o0;->a:Ll4/a$c;

    iget-object v2, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v1, v0, v2}, Ll4/b;->c(Ll4/a$c;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/o0;->b:Ll4/a$c;

    invoke-virtual {v1, v0, p0}, Ll4/b;->c(Ll4/a$c;Ljava/lang/Object;)V

    iget-object v0, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/lifecycle/o0;->c:Ll4/a$c;

    iget-object v2, p0, Lf4/x0;->a:Lf4/q;

    invoke-virtual {v2}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ll4/b;->c(Ll4/a$c;Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method public a()Landroidx/lifecycle/l;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lf4/x0;->c()V

    iget-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    return-object v0
.end method

.method public b(Landroidx/lifecycle/l$a;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/u;

    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    iput-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    invoke-static {p0}, Le5/h;->a(Le5/i;)Le5/h;

    move-result-object v0

    iput-object v0, p0, Lf4/x0;->f:Le5/h;

    invoke-virtual {v0}, Le5/h;->c()V

    iget-object v0, p0, Lf4/x0;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lf4/x0;->f:Le5/h;

    invoke-virtual {v0, p1}, Le5/h;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/x0;->f:Le5/h;

    invoke-virtual {v0, p1}, Le5/h;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/l$b;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/x0;->e:Landroidx/lifecycle/u;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->o(Landroidx/lifecycle/l$b;)V

    return-void
.end method

.method public w()Landroidx/lifecycle/b1;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lf4/x0;->c()V

    iget-object v0, p0, Lf4/x0;->b:Landroidx/lifecycle/b1;

    return-object v0
.end method
