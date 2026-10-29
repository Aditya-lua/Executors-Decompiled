.class public final Lxd/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lxd/t;


# direct methods
.method public synthetic constructor <init>(Lxd/t;Lxd/s;)V
    .locals 0

    iput-object p1, p0, Lxd/r;->a:Lxd/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->f(Lxd/t;)Lxd/i;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, v1, p1}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lxd/p;

    invoke-direct {p1, p0, p2}, Lxd/p;-><init>(Lxd/r;Landroid/os/IBinder;)V

    iget-object p2, p0, Lxd/r;->a:Lxd/t;

    invoke-virtual {p2}, Lxd/t;->c()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    iget-object v0, p0, Lxd/r;->a:Lxd/t;

    invoke-static {v0}, Lxd/t;->f(Lxd/t;)Lxd/i;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, v1, p1}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lxd/q;

    invoke-direct {p1, p0}, Lxd/q;-><init>(Lxd/r;)V

    iget-object v0, p0, Lxd/r;->a:Lxd/t;

    invoke-virtual {v0}, Lxd/t;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
