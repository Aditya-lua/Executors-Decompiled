.class public final Lnb/fc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/d5;

.field public final synthetic b:Lnb/nc;


# direct methods
.method public constructor <init>(Lnb/nc;Lnb/d5;)V
    .locals 0

    iput-object p2, p0, Lnb/fc;->a:Lnb/d5;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/fc;->b:Lnb/nc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/fc;->b:Lnb/nc;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lnb/nc;->d(Z)V

    iget-object v1, v0, Lnb/nc;->c:Lnb/tc;

    invoke-virtual {v1}, Lnb/tc;->W()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Connected to service"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lnb/fc;->a:Lnb/d5;

    invoke-virtual {v1, v2}, Lnb/tc;->z(Lnb/d5;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
