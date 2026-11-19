.class public final Lob/rc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lk9/b;

.field public final synthetic b:Lob/sc;


# direct methods
.method public constructor <init>(Lob/sc;Lk9/b;)V
    .locals 0

    iput-object p2, p0, Lob/rc;->a:Lk9/b;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/rc;->b:Lob/sc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lob/rc;->b:Lob/sc;

    iget-object v0, v0, Lob/sc;->c:Lob/yc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/yc;->O(Lob/i5;)V

    iget-object v2, p0, Lob/rc;->a:Lk9/b;

    invoke-virtual {v2}, Lk9/b;->B3()I

    move-result v2

    const/16 v3, 0x1e61

    if-ne v2, v3, :cond_1

    invoke-virtual {v0}, Lob/yc;->P()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-virtual {v0, v2}, Lob/yc;->Q(Ljava/util/concurrent/ScheduledExecutorService;)V

    :cond_0
    invoke-virtual {v0}, Lob/yc;->P()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v2, Lob/pc;

    invoke-direct {v2, p0}, Lob/pc;-><init>(Lob/rc;)V

    sget-object v3, Lob/e5;->a0:Lob/d5;

    invoke-virtual {v3, v1}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_1
    invoke-virtual {v0}, Lob/yc;->L()V

    return-void
.end method
