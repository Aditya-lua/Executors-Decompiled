.class public final Lcom/google/android/gms/internal/play_billing/n2;
.super Lcom/google/android/gms/internal/play_billing/z1;
.source "SourceFile"


# instance fields
.field public h:Lcom/google/android/gms/internal/play_billing/i2;

.field public i:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/i2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/z1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/n2;->h:Lcom/google/android/gms/internal/play_billing/i2;

    return-void
.end method

.method public static bridge synthetic A(Lcom/google/android/gms/internal/play_billing/n2;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    return-object p0
.end method

.method public static bridge synthetic B(Lcom/google/android/gms/internal/play_billing/n2;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static bridge synthetic y(Lcom/google/android/gms/internal/play_billing/n2;)Lcom/google/android/gms/internal/play_billing/i2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/n2;->h:Lcom/google/android/gms/internal/play_billing/i2;

    return-object p0
.end method

.method public static z(Lcom/google/android/gms/internal/play_billing/i2;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/play_billing/i2;
    .locals 2

    new-instance p1, Lcom/google/android/gms/internal/play_billing/n2;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/play_billing/n2;-><init>(Lcom/google/android/gms/internal/play_billing/i2;)V

    new-instance p2, Lcom/google/android/gms/internal/play_billing/k2;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/play_billing/k2;-><init>(Lcom/google/android/gms/internal/play_billing/n2;)V

    const-wide/16 v0, 0x6f54

    invoke-interface {p4, p2, v0, v1, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p3

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    sget-object p3, Lcom/google/android/gms/internal/play_billing/y1;->a:Lcom/google/android/gms/internal/play_billing/y1;

    invoke-interface {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/i2;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method


# virtual methods
.method public final n()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/n2;->h:Lcom/google/android/gms/internal/play_billing/i2;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inputFuture=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", remaining delay=["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final p()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/n2;->h:Lcom/google/android/gms/internal/play_billing/i2;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v1, v1, Lcom/google/android/gms/internal/play_billing/h1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/2addr v1, v4

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v4, v1, Lcom/google/android/gms/internal/play_billing/h1;

    if-eqz v4, :cond_1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/h1;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/play_billing/h1;->a:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_3

    invoke-interface {v0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/n2;->h:Lcom/google/android/gms/internal/play_billing/i2;

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/n2;->i:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
