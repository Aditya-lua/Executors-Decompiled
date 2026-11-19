.class public final Lgb/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/concurrent/atomic/AtomicReference;

.field public static f:Z


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lgb/k;

.field public final c:Lha/o;

.field public final d:Lla/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lgb/i0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    sput-boolean v0, Lgb/i0;->f:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lgb/k;Lha/o;Lla/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/i0;->a:Landroid/app/Application;

    iput-object p2, p0, Lgb/i0;->b:Lgb/k;

    iput-object p3, p0, Lgb/i0;->c:Lha/o;

    iput-object p4, p0, Lgb/i0;->d:Lla/e;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lo9/s;->a(Z)V

    sget-object v1, Lgb/i0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    check-cast v2, Landroid/app/Application;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    move-object v2, p0

    check-cast v2, Landroid/app/Application;

    :goto_1
    invoke-static {v2}, Lgb/k;->a(Landroid/app/Application;)Lgb/k;

    move-result-object v3

    invoke-static {v2}, Lha/o;->a(Landroid/app/Application;)Lha/o;

    move-result-object v4

    new-instance v5, Lgb/i0;

    invoke-static {p0}, Lla/e;->b(Landroid/content/Context;)Lla/e;

    move-result-object p0

    invoke-direct {v5, v2, v3, v4, p0}, Lgb/i0;-><init>(Landroid/app/Application;Lgb/k;Lha/o;Lla/e;)V

    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p0, v5, Lgb/i0;->d:Lla/e;

    invoke-virtual {p0}, Lla/e;->a()V

    iget-object p0, v5, Lgb/i0;->b:Lgb/k;

    invoke-virtual {p0}, Lgb/k;->b()V

    iget-object p0, v5, Lgb/i0;->c:Lha/o;

    invoke-virtual {p0}, Lha/o;->b()V

    :cond_2
    monitor-exit v1

    goto :goto_3

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_3
    sput-boolean v0, Lgb/i0;->f:Z

    return-void
.end method

.method public static b()V
    .locals 2

    sget-boolean v0, Lgb/i0;->f:Z

    const-string v1, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called."

    invoke-static {v0, v1}, Lo9/s;->q(ZLjava/lang/Object;)V

    return-void
.end method

.method public static c()Landroid/app/Application;
    .locals 1

    invoke-static {}, Lgb/i0;->b()V

    sget-object v0, Lgb/i0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb/i0;

    iget-object v0, v0, Lgb/i0;->a:Landroid/app/Application;

    return-object v0
.end method
