.class public final Lnb/mc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/ConnectionResult;

.field public final synthetic b:Lnb/nc;


# direct methods
.method public constructor <init>(Lnb/nc;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p2, p0, Lnb/mc;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/mc;->b:Lnb/nc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lnb/mc;->b:Lnb/nc;

    iget-object v0, v0, Lnb/nc;->c:Lnb/tc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/tc;->O(Lnb/d5;)V

    iget-object v2, p0, Lnb/mc;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v2}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v2

    const/16 v3, 0x1e61

    if-ne v2, v3, :cond_1

    invoke-virtual {v0}, Lnb/tc;->P()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-virtual {v0, v2}, Lnb/tc;->Q(Ljava/util/concurrent/ScheduledExecutorService;)V

    :cond_0
    invoke-virtual {v0}, Lnb/tc;->P()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v2, Lnb/kc;

    invoke-direct {v2, p0}, Lnb/kc;-><init>(Lnb/mc;)V

    sget-object v3, Lnb/z4;->a0:Lnb/y4;

    invoke-virtual {v3, v1}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_1
    invoke-virtual {v0}, Lnb/tc;->L()V

    return-void
.end method
