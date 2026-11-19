.class public final Lob/j6;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final a:Lob/ve;

.field public b:Z

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lob/ve;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/j6;->a:Lob/ve;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lob/j6;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->O0()V

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    iget-boolean v1, p0, Lob/j6;->b:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/ve;->d()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual {v0}, Lob/ve;->E0()Lob/g6;

    move-result-object v1

    invoke-virtual {v1}, Lob/g6;->m()Z

    move-result v1

    iput-boolean v1, p0, Lob/j6;->c:Z

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    iget-boolean v1, p0, Lob/j6;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "Registering connectivity change receiver. Network connected"

    invoke-virtual {v0, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lob/j6;->b:Z

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lob/j6;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->O0()V

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    iget-boolean v1, p0, Lob/j6;->b:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Unregistering connectivity change receiver"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lob/j6;->b:Z

    iput-boolean v1, p0, Lob/j6;->c:Z

    invoke-virtual {v0}, Lob/ve;->d()Landroid/content/Context;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lob/j6;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to unregister the network broadcast receiver"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic c()Lob/ve;
    .locals 1

    iget-object v0, p0, Lob/j6;->a:Lob/ve;

    return-object v0
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object p1, p0, Lob/j6;->a:Lob/ve;

    invoke-virtual {p1}, Lob/ve;->O0()V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    const-string v1, "NetworkBroadcastReceiver received action"

    invoke-virtual {v0, v1, p2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lob/ve;->E0()Lob/g6;

    move-result-object p2

    invoke-virtual {p2}, Lob/g6;->m()Z

    move-result p2

    iget-boolean v0, p0, Lob/j6;->c:Z

    if-eq v0, p2, :cond_0

    iput-boolean p2, p0, Lob/j6;->c:Z

    invoke-virtual {p1}, Lob/ve;->b()Lob/h7;

    move-result-object p1

    new-instance v0, Lob/i6;

    invoke-direct {v0, p0, p2}, Lob/i6;-><init>(Lob/j6;Z)V

    invoke-virtual {p1, v0}, Lob/h7;->t(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lob/ve;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->r()Lob/z5;

    move-result-object p1

    const-string v0, "NetworkBroadcastReceiver received unknown action"

    invoke-virtual {p1, v0, p2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
