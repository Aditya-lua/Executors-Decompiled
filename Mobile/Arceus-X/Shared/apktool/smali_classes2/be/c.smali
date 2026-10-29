.class public final Lbe/c;
.super Lbe/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lbe/f;


# direct methods
.method public constructor <init>(Lbe/f;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lbe/c;->c:Lbe/f;

    iput-object p2, p0, Lbe/c;->b:Landroid/os/IBinder;

    invoke-direct {p0}, Lbe/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lbe/c;->c:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    iget-object v1, p0, Lbe/c;->b:Landroid/os/IBinder;

    invoke-static {v1}, Lbe/j0;->s2(Landroid/os/IBinder;)Lbe/k0;

    move-result-object v1

    invoke-static {v0, v1}, Lbe/g;->m(Lbe/g;Landroid/os/IInterface;)V

    iget-object v0, p0, Lbe/c;->c:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->q(Lbe/g;)V

    iget-object v0, p0, Lbe/c;->c:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbe/g;->l(Lbe/g;Z)V

    iget-object v0, p0, Lbe/c;->c:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->h(Lbe/g;)Ljava/util/List;

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
    iget-object v0, p0, Lbe/c;->c:Lbe/f;

    iget-object v0, v0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->h(Lbe/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
