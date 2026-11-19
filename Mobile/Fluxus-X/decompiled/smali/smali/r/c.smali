.class public Lr/c;
.super Lr/e;
.source "SourceFile"


# static fields
.field public static volatile c:Lr/c;

.field public static final d:Ljava/util/concurrent/Executor;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final e:Ljava/util/concurrent/Executor;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public a:Lr/e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Lr/e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/a;

    invoke-direct {v0}, Lr/a;-><init>()V

    sput-object v0, Lr/c;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lr/b;

    invoke-direct {v0}, Lr/b;-><init>()V

    sput-object v0, Lr/c;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lr/e;-><init>()V

    new-instance v0, Lr/d;

    invoke-direct {v0}, Lr/d;-><init>()V

    iput-object v0, p0, Lr/c;->b:Lr/e;

    iput-object v0, p0, Lr/c;->a:Lr/e;

    return-void
.end method

.method public static synthetic d(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lr/c;->g()Lr/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr/c;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lr/c;->g()Lr/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static f()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lr/c;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static g()Lr/c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lr/c;->c:Lr/c;

    if-eqz v0, :cond_0

    sget-object v0, Lr/c;->c:Lr/c;

    return-object v0

    :cond_0
    const-class v0, Lr/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lr/c;->c:Lr/c;

    if-nez v1, :cond_1

    new-instance v1, Lr/c;

    invoke-direct {v1}, Lr/c;-><init>()V

    sput-object v1, Lr/c;->c:Lr/c;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lr/c;->c:Lr/c;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lr/c;->a:Lr/e;

    invoke-virtual {v0, p1}, Lr/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lr/c;->a:Lr/e;

    invoke-virtual {v0}, Lr/e;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lr/c;->a:Lr/e;

    invoke-virtual {v0, p1}, Lr/e;->c(Ljava/lang/Runnable;)V

    return-void
.end method
