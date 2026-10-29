.class public final Lnb/s5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lnb/s5;


# instance fields
.field public final a:Lnb/g7;

.field public final b:Ln9/q;

.field public final c:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnb/g7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, -0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lnb/s5;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ln9/r;->a()Ln9/r$a;

    move-result-object v0

    const-string v1, "measurement:api"

    invoke-virtual {v0, v1}, Ln9/r$a;->b(Ljava/lang/String;)Ln9/r$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/r$a;->a()Ln9/r;

    move-result-object v0

    invoke-static {p1, v0}, Ln9/p;->b(Landroid/content/Context;Ln9/r;)Ln9/q;

    move-result-object p1

    iput-object p1, p0, Lnb/s5;->b:Ln9/q;

    iput-object p2, p0, Lnb/s5;->a:Lnb/g7;

    return-void
.end method

.method public static a(Lnb/g7;)Lnb/s5;
    .locals 2

    sget-object v0, Lnb/s5;->d:Lnb/s5;

    if-nez v0, :cond_0

    new-instance v0, Lnb/s5;

    invoke-virtual {p0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lnb/s5;-><init>(Landroid/content/Context;Lnb/g7;)V

    sput-object v0, Lnb/s5;->d:Lnb/s5;

    :cond_0
    sget-object p0, Lnb/s5;->d:Lnb/s5;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b(IIJJI)V
    .locals 17

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, Lnb/s5;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v2

    iget-object v0, v1, Lnb/s5;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long v4, v2, v4

    const-wide/32 v6, 0x1b7740

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, v1, Lnb/s5;->b:Ln9/q;

    new-instance v4, Lcom/google/android/gms/common/internal/TelemetryData;

    new-instance v5, Lcom/google/android/gms/common/internal/MethodInvocation;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v6, 0x8dcd

    const/4 v8, 0x0

    const/4 v13, 0x0

    move/from16 v7, p2

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move/from16 v16, p7

    invoke-direct/range {v5 .. v16}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    filled-new-array {v5}, [Lcom/google/android/gms/common/internal/MethodInvocation;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    invoke-interface {v0, v4}, Ln9/q;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v4, Lnb/r5;

    invoke-direct {v4, v1, v2, v3}, Lnb/r5;-><init>(Lnb/s5;J)V

    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final synthetic c(JLjava/lang/Exception;)V
    .locals 0

    iget-object p3, p0, Lnb/s5;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
