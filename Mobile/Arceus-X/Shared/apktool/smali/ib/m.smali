.class public final Lib/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lib/o;


# direct methods
.method public synthetic constructor <init>(Lib/o;Lib/n;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lib/m;->a:Lib/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lib/m;->a:Lib/o;

    invoke-static {v0}, Lib/o;->f(Lib/o;)Lib/d;

    move-result-object v1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v1, v2, p1}, Lib/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lib/k;

    invoke-direct {p1, p0, p2}, Lib/k;-><init>(Lib/m;Landroid/os/IBinder;)V

    invoke-virtual {v0}, Lib/o;->c()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lib/m;->a:Lib/o;

    invoke-static {v0}, Lib/o;->f(Lib/o;)Lib/d;

    move-result-object v1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v1, v2, p1}, Lib/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lib/l;

    invoke-direct {p1, p0}, Lib/l;-><init>(Lib/m;)V

    invoke-virtual {v0}, Lib/o;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
