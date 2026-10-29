.class public final Lva/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static volatile b:Lva/j;

.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final d:Lva/m;

.field public static final e:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lva/k;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lva/k;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lva/m;

    sget-object v1, Lva/i;->a:Lva/i;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lva/m;-><init>(Lva/i;[B)V

    sput-object v0, Lva/k;->d:Lva/m;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lva/k;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lva/k;->b:Lva/j;

    if-nez v0, :cond_4

    sget-object v0, Lva/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lva/k;->b:Lva/j;

    if-nez v1, :cond_3

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lva/k;->b:Lva/j;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lva/j;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, Lva/g;->a()V

    invoke-static {}, Lva/l;->a()V

    new-instance v1, Lva/h;

    invoke-direct {v1, p0}, Lva/h;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lva/t;->a(Lva/r;)Lva/r;

    move-result-object v1

    new-instance v2, Lva/f;

    invoke-direct {v2, p0, v1}, Lva/f;-><init>(Landroid/content/Context;Lva/r;)V

    sput-object v2, Lva/k;->b:Lva/j;

    sget-object p0, Lva/k;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_2
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_4
    return-void
.end method
