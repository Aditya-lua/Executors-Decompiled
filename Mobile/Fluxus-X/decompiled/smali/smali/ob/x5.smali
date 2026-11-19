.class public final Lob/x5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lob/x5;


# instance fields
.field public final a:Lob/l7;

.field public final b:Lo9/y;

.field public final c:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lob/l7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, -0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lob/x5;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Lo9/z;->a()Lo9/z$a;

    move-result-object v0

    const-string v1, "measurement:api"

    invoke-virtual {v0, v1}, Lo9/z$a;->b(Ljava/lang/String;)Lo9/z$a;

    move-result-object v0

    invoke-virtual {v0}, Lo9/z$a;->a()Lo9/z;

    move-result-object v0

    invoke-static {p1, v0}, Lo9/x;->b(Landroid/content/Context;Lo9/z;)Lo9/y;

    move-result-object p1

    iput-object p1, p0, Lob/x5;->b:Lo9/y;

    iput-object p2, p0, Lob/x5;->a:Lob/l7;

    return-void
.end method

.method public static a(Lob/l7;)Lob/x5;
    .locals 2

    sget-object v0, Lob/x5;->d:Lob/x5;

    if-nez v0, :cond_0

    new-instance v0, Lob/x5;

    invoke-virtual {p0}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lob/x5;-><init>(Landroid/content/Context;Lob/l7;)V

    sput-object v0, Lob/x5;->d:Lob/x5;

    :cond_0
    sget-object p0, Lob/x5;->d:Lob/x5;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b(IIJJI)V
    .locals 17

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, Lob/x5;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

    move-result-wide v2

    iget-object v0, v1, Lob/x5;->c:Ljava/util/concurrent/atomic/AtomicLong;

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
    iget-object v0, v1, Lob/x5;->b:Lo9/y;

    new-instance v4, Lo9/w;

    new-instance v5, Lo9/p;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v6, 0x8dcd

    const/4 v8, 0x0

    const/4 v13, 0x0

    move/from16 v7, p2

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move/from16 v16, p7

    invoke-direct/range {v5 .. v16}, Lo9/p;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    filled-new-array {v5}, [Lo9/p;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5}, Lo9/w;-><init>(ILjava/util/List;)V

    invoke-interface {v0, v4}, Lo9/y;->g(Lo9/w;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v4, Lob/w5;

    invoke-direct {v4, v1, v2, v3}, Lob/w5;-><init>(Lob/x5;J)V

    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;
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

    iget-object p3, p0, Lob/x5;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
