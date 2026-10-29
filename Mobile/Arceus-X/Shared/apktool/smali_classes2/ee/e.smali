.class public final Lee/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lee/f;


# direct methods
.method public synthetic constructor <init>(Lee/f;Lee/d;)V
    .locals 0

    iput-object p1, p0, Lee/e;->a:Lee/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lee/e;->a:Lee/f;

    invoke-static {v0}, Lee/f;->f(Lee/f;)Lee/t0;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, v1, p1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lee/b;

    invoke-direct {p1, p0, p2}, Lee/b;-><init>(Lee/e;Landroid/os/IBinder;)V

    iget-object p2, p0, Lee/e;->a:Lee/f;

    invoke-virtual {p2}, Lee/f;->c()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    iget-object v0, p0, Lee/e;->a:Lee/f;

    invoke-static {v0}, Lee/f;->f(Lee/f;)Lee/t0;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, v1, p1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lee/c;

    invoke-direct {p1, p0}, Lee/c;-><init>(Lee/e;)V

    iget-object v0, p0, Lee/e;->a:Lee/f;

    invoke-virtual {v0}, Lee/f;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
