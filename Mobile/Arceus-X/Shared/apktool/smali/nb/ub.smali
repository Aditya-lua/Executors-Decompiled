.class public final Lnb/ub;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bb;

.field public final synthetic b:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lnb/bb;)V
    .locals 0

    iput-object p2, p0, Lnb/ub;->a:Lnb/bb;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ub;->b:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lnb/ub;->b:Lnb/tc;

    invoke-virtual {v0}, Lnb/tc;->N()Lnb/d5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Failed to send current screen to service"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lnb/ub;->a:Lnb/bb;

    if-nez v2, :cond_1

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-interface/range {v1 .. v6}, Lnb/d5;->V0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v4, v2

    iget-wide v2, v4, Lnb/bb;->c:J

    move-object v5, v4

    iget-object v4, v5, Lnb/bb;->a:Ljava/lang/String;

    iget-object v5, v5, Lnb/bb;->b:Ljava/lang/String;

    iget-object v6, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lnb/d5;->V0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lnb/tc;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lnb/ub;->b:Lnb/tc;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to send current screen to the service"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
