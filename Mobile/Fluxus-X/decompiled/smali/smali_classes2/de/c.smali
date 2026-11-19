.class public final Lde/c;
.super Lde/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lde/f;


# direct methods
.method public constructor <init>(Lde/f;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lde/c;->c:Lde/f;

    iput-object p2, p0, Lde/c;->b:Landroid/os/IBinder;

    invoke-direct {p0}, Lde/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lde/c;->c:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    iget-object v1, p0, Lde/c;->b:Landroid/os/IBinder;

    invoke-static {v1}, Lde/j0;->s2(Landroid/os/IBinder;)Lde/k0;

    move-result-object v1

    invoke-static {v0, v1}, Lde/g;->m(Lde/g;Landroid/os/IInterface;)V

    iget-object v0, p0, Lde/c;->c:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    invoke-static {v0}, Lde/g;->q(Lde/g;)V

    iget-object v0, p0, Lde/c;->c:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lde/g;->l(Lde/g;Z)V

    iget-object v0, p0, Lde/c;->c:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    invoke-static {v0}, Lde/g;->h(Lde/g;)Ljava/util/List;

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
    iget-object v0, p0, Lde/c;->c:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    invoke-static {v0}, Lde/g;->h(Lde/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
