.class public abstract Lob/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile d:Landroid/os/Handler;


# instance fields
.field public final a:Lob/q8;

.field public final b:Ljava/lang/Runnable;

.field public volatile c:J


# direct methods
.method public constructor <init>(Lob/q8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/z;->a:Lob/q8;

    new-instance v0, Lob/y;

    invoke-direct {v0, p0, p1}, Lob/y;-><init>(Lob/z;Lob/q8;)V

    iput-object v0, p0, Lob/z;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(J)V
    .locals 3

    invoke-virtual {p0}, Lob/z;->d()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lob/z;->a:Lob/q8;

    invoke-interface {v0}, Lob/q8;->e()Lv9/e;

    move-result-object v1

    invoke-interface {v1}, Lv9/e;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lob/z;->c:J

    invoke-virtual {p0}, Lob/z;->f()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lob/z;->b:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lob/q8;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "Failed to schedule delayed post. time"

    invoke-virtual {v0, p2, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 4

    iget-wide v0, p0, Lob/z;->c:J

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

    iput-wide v0, p0, Lob/z;->c:J

    invoke-virtual {p0}, Lob/z;->f()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lob/z;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic e(J)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lob/z;->c:J

    return-void
.end method

.method public final f()Landroid/os/Handler;
    .locals 3

    sget-object v0, Lob/z;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lob/z;->d:Landroid/os/Handler;

    return-object v0

    :cond_0
    const-class v0, Lob/z;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lob/z;->d:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/measurement/q1;

    iget-object v2, p0, Lob/z;->a:Lob/q8;

    invoke-interface {v2}, Lob/q8;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/q1;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lob/z;->d:Landroid/os/Handler;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lob/z;->d:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
