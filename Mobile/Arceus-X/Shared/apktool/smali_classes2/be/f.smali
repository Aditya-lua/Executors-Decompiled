.class public final Lbe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lbe/g;


# direct methods
.method public synthetic constructor <init>(Lbe/g;Lbe/e;)V
    .locals 0

    iput-object p1, p0, Lbe/f;->a:Lbe/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->f(Lbe/g;)Lbe/q1;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, v1, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lbe/f;->a:Lbe/g;

    new-instance v0, Lbe/c;

    invoke-direct {v0, p0, p2}, Lbe/c;-><init>(Lbe/f;Landroid/os/IBinder;)V

    invoke-virtual {p1}, Lbe/g;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    iget-object v0, p0, Lbe/f;->a:Lbe/g;

    invoke-static {v0}, Lbe/g;->f(Lbe/g;)Lbe/q1;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, v1, p1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lbe/f;->a:Lbe/g;

    new-instance v0, Lbe/d;

    invoke-direct {v0, p0}, Lbe/d;-><init>(Lbe/f;)V

    invoke-virtual {p1}, Lbe/g;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
