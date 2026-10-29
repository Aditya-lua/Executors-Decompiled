.class public final Lxd/p;
.super Lxd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lxd/r;


# direct methods
.method public constructor <init>(Lxd/r;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Lxd/p;->b:Landroid/os/IBinder;

    iput-object p1, p0, Lxd/p;->c:Lxd/r;

    invoke-direct {p0}, Lxd/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lxd/p;->b:Landroid/os/IBinder;

    invoke-static {v0}, Lxd/e;->s2(Landroid/os/IBinder;)Lxd/f;

    move-result-object v0

    iget-object v1, p0, Lxd/p;->c:Lxd/r;

    iget-object v1, v1, Lxd/r;->a:Lxd/t;

    invoke-static {v1, v0}, Lxd/t;->m(Lxd/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lxd/p;->c:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->q(Lxd/t;)V

    iget-object v0, p0, Lxd/p;->c:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lxd/t;->l(Lxd/t;Z)V

    iget-object v0, p0, Lxd/p;->c:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->h(Lxd/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxd/p;->c:Lxd/r;

    iget-object v0, v0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->h(Lxd/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
