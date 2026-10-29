.class public abstract Lnb/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile d:Landroid/os/Handler;


# instance fields
.field public final a:Lnb/l8;

.field public final b:Ljava/lang/Runnable;

.field public volatile c:J


# direct methods
.method public constructor <init>(Lnb/l8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/w;->a:Lnb/l8;

    new-instance v0, Lnb/v;

    invoke-direct {v0, p0, p1}, Lnb/v;-><init>(Lnb/w;Lnb/l8;)V

    iput-object v0, p0, Lnb/w;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(J)V
    .locals 3

    invoke-virtual {p0}, Lnb/w;->d()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lnb/w;->a:Lnb/l8;

    invoke-interface {v0}, Lnb/l8;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lnb/w;->c:J

    invoke-virtual {p0}, Lnb/w;->f()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lnb/w;->b:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lnb/l8;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "Failed to schedule delayed post. time"

    invoke-virtual {v0, p2, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 4

    iget-wide v0, p0, Lnb/w;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnb/w;->c:J

    invoke-virtual {p0}, Lnb/w;->f()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lnb/w;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic e(J)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lnb/w;->c:J

    return-void
.end method

.method public final f()Landroid/os/Handler;
    .locals 3

    sget-object v0, Lnb/w;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lnb/w;->d:Landroid/os/Handler;

    return-object v0

    :cond_0
    const-class v0, Lnb/w;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnb/w;->d:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/measurement/q1;

    iget-object v2, p0, Lnb/w;->a:Lnb/l8;

    invoke-interface {v2}, Lnb/l8;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/q1;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lnb/w;->d:Landroid/os/Handler;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lnb/w;->d:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
