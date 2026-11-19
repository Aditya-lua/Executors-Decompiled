.class public final Lzd/p;
.super Lzd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lzd/r;


# direct methods
.method public constructor <init>(Lzd/r;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Lzd/p;->b:Landroid/os/IBinder;

    iput-object p1, p0, Lzd/p;->c:Lzd/r;

    invoke-direct {p0}, Lzd/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lzd/p;->b:Landroid/os/IBinder;

    invoke-static {v0}, Lzd/e;->s2(Landroid/os/IBinder;)Lzd/f;

    move-result-object v0

    iget-object v1, p0, Lzd/p;->c:Lzd/r;

    iget-object v1, v1, Lzd/r;->a:Lzd/t;

    invoke-static {v1, v0}, Lzd/t;->m(Lzd/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lzd/p;->c:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    invoke-static {v0}, Lzd/t;->q(Lzd/t;)V

    iget-object v0, p0, Lzd/p;->c:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzd/t;->l(Lzd/t;Z)V

    iget-object v0, p0, Lzd/p;->c:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    invoke-static {v0}, Lzd/t;->h(Lzd/t;)Ljava/util/List;

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
    iget-object v0, p0, Lzd/p;->c:Lzd/r;

    iget-object v0, v0, Lzd/r;->a:Lzd/t;

    invoke-static {v0}, Lzd/t;->h(Lzd/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
