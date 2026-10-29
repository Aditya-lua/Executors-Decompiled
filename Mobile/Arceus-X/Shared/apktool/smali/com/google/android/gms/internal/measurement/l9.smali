.class public abstract Lcom/google/android/gms/internal/measurement/l9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/lang/Object;

.field public static volatile h:Lcom/google/android/gms/internal/measurement/g9;

.field public static final i:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/f9;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/Object;

.field public volatile d:I

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/l9;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/j9;->a:Lcom/google/android/gms/internal/measurement/j9;

    const-string v1, "BuildInfo must be non-null"

    invoke-static {v0, v1}, Lhe/n;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/l9;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/f9;Ljava/lang/String;Ljava/lang/Object;Z[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x1

    iput p4, p0, Lcom/google/android/gms/internal/measurement/l9;->d:I

    iget-object p4, p1, Lcom/google/android/gms/internal/measurement/f9;->a:Landroid/net/Uri;

    if-eqz p4, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/l9;->a:Lcom/google/android/gms/internal/measurement/f9;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/l9;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/l9;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/l9;->f:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/l9;->h:Lcom/google/android/gms/internal/measurement/g9;

    if-nez v0, :cond_6

    if-nez p0, :cond_0

    goto :goto_4

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/l9;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/l9;->h:Lcom/google/android/gms/internal/measurement/g9;

    if-nez v1, :cond_5

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/l9;->h:Lcom/google/android/gms/internal/measurement/g9;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object p0, v2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->a()Landroid/content/Context;

    move-result-object v2

    if-eq v2, p0, :cond_4

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->f()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/n9;->d()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w8;->e()V

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/measurement/k9;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/k9;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lhe/t;->a(Lhe/s;)Lhe/s;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/l8;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/measurement/l8;-><init>(Landroid/content/Context;Lhe/s;)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/l9;->h:Lcom/google/android/gms/internal/measurement/g9;

    sget-object p0, Lcom/google/android/gms/internal/measurement/l9;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_4
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

    :cond_5
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_6
    :goto_4
    return-void
.end method

.method public static c()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l9;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final d()Ljava/lang/Object;
    .locals 9

    sget-object v0, Lcom/google/android/gms/internal/measurement/l9;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/l9;->d:I

    if-ge v1, v0, :cond_b

    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/measurement/l9;->d:I

    if-ge v1, v0, :cond_a

    sget-object v1, Lcom/google/android/gms/internal/measurement/l9;->h:Lcom/google/android/gms/internal/measurement/g9;

    invoke-static {}, Lhe/k;->a()Lhe/k;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->b()Lhe/s;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->b()Lhe/s;

    move-result-object v2

    invoke-static {v2}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhe/s;

    invoke-interface {v2}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhe/k;

    invoke-virtual {v2}, Lhe/k;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lhe/k;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/r8;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/l9;->a:Lcom/google/android/gms/internal/measurement/f9;

    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/f9;->a:Landroid/net/Uri;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/f9;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/l9;->b:Ljava/lang/String;

    invoke-virtual {v4, v6, v3, v5, v7}, Lcom/google/android/gms/internal/measurement/r8;->a(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v1, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const-string v6, "Must call PhenotypeFlagInitializer.maybeInit() first"

    invoke-static {v5, v6}, Lhe/n;->s(ZLjava/lang/Object;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/l9;->a:Lcom/google/android/gms/internal/measurement/f9;

    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/f9;->a:Landroid/net/Uri;

    if-eqz v6, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->a()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/measurement/z8;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->a()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/measurement/i9;->a:Lcom/google/android/gms/internal/measurement/i9;

    invoke-static {v7, v6, v8}, Lcom/google/android/gms/internal/measurement/p8;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->a()Landroid/content/Context;

    move-result-object v6

    invoke-static {v3}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/measurement/h9;->a:Lcom/google/android/gms/internal/measurement/h9;

    invoke-static {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/n9;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/n9;

    move-result-object v6

    :goto_2
    if-eqz v6, :cond_4

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/l9;->b:Ljava/lang/String;

    invoke-interface {v6, v7}, Lcom/google/android/gms/internal/measurement/t8;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/measurement/l9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_3

    :cond_4
    move-object v6, v3

    :goto_3
    if-eqz v6, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v5, v5, Lcom/google/android/gms/internal/measurement/f9;->d:Z

    if-nez v5, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/g9;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/w8;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/w8;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/l9;->b:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/w8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/l9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_6
    if-nez v3, :cond_7

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/l9;->c:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    move-object v6, v3

    :goto_4
    invoke-virtual {v2}, Lhe/k;->c()Z

    move-result v1

    if-eqz v1, :cond_9

    if-nez v4, :cond_8

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/l9;->c:Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/measurement/l9;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :cond_9
    :goto_5
    iput-object v6, p0, Lcom/google/android/gms/internal/measurement/l9;->e:Ljava/lang/Object;

    iput v0, p0, Lcom/google/android/gms/internal/measurement/l9;->d:I

    :cond_a
    monitor-exit p0

    goto :goto_7

    :goto_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_b
    :goto_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l9;->e:Ljava/lang/Object;

    return-object v0
.end method
