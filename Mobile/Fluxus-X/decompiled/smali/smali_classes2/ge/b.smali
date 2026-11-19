.class public final Lge/b;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lge/e;


# direct methods
.method public constructor <init>(Lge/e;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Lge/b;->b:Landroid/os/IBinder;

    iput-object p1, p0, Lge/b;->c:Lge/e;

    invoke-direct {p0}, Lge/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lge/b;->c:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    invoke-static {v0}, Lge/f;->g(Lge/f;)Lge/a1;

    move-result-object v0

    iget-object v1, p0, Lge/b;->b:Landroid/os/IBinder;

    invoke-interface {v0, v1}, Lge/a1;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IInterface;

    iget-object v1, p0, Lge/b;->c:Lge/e;

    iget-object v1, v1, Lge/e;->a:Lge/f;

    invoke-static {v1, v0}, Lge/f;->n(Lge/f;Landroid/os/IInterface;)V

    iget-object v0, p0, Lge/b;->c:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    invoke-static {v0}, Lge/f;->r(Lge/f;)V

    iget-object v0, p0, Lge/b;->c:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lge/f;->m(Lge/f;Z)V

    iget-object v0, p0, Lge/b;->c:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    invoke-static {v0}, Lge/f;->i(Lge/f;)Ljava/util/List;

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
    iget-object v0, p0, Lge/b;->c:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    invoke-static {v0}, Lge/f;->i(Lge/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
