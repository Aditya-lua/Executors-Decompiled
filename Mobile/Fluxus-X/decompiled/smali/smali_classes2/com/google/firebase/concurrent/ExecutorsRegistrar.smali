.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ThreadPoolCreation"
    }
.end annotation


# static fields
.field public static final a:Lof/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lof/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lof/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lof/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lof/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lof/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lof/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lof/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lof/x;

    new-instance v1, Lpf/q;

    invoke-direct {v1}, Lpf/q;-><init>()V

    invoke-direct {v0, v1}, Lof/x;-><init>(Lag/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lof/x;

    new-instance v0, Lof/x;

    new-instance v1, Lpf/r;

    invoke-direct {v1}, Lpf/r;-><init>()V

    invoke-direct {v0, v1}, Lof/x;-><init>(Lag/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lof/x;

    new-instance v0, Lof/x;

    new-instance v1, Lpf/s;

    invoke-direct {v1}, Lpf/s;-><init>()V

    invoke-direct {v0, v1}, Lof/x;-><init>(Lag/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lof/x;

    new-instance v0, Lof/x;

    new-instance v1, Lpf/t;

    invoke-direct {v1}, Lpf/t;-><init>()V

    invoke-direct {v0, v1}, Lof/x;-><init>(Lag/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lof/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lof/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lof/x;

    invoke-virtual {p0}, Lof/x;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic b()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    const-string v0, "Firebase Scheduler"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 4

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->l()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v2

    const-string v3, "Firebase Lite"

    invoke-static {v3, v1, v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lof/d;)Ljava/util/concurrent/Executor;
    .locals 0

    sget-object p0, Lpf/a0;->a:Lpf/a0;

    return-object p0
.end method

.method public static synthetic e(Lof/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lof/x;

    invoke-virtual {p0}, Lof/x;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic f()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    const/16 v0, 0xa

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->i()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    const-string v2, "Firebase Background"

    invoke-static {v2, v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lof/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lof/x;

    invoke-virtual {p0}, Lof/x;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic h()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    const-string v0, "Firebase Blocking"

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static i()Landroid/os/StrictMode$ThreadPolicy;
    .locals 1

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectResourceMismatches()Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectUnbufferedIo()Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;
    .locals 2

    new-instance v0, Lpf/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lpf/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lpf/b;

    invoke-direct {v0, p0, p1, p2}, Lpf/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static l()Landroid/os/StrictMode$ThreadPolicy;
    .locals 1

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method public static m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    new-instance v0, Lpf/o;

    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lof/x;

    invoke-virtual {v1}, Lof/x;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0, v1}, Lpf/o;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lof/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lmf/a;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v2

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v3}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v4

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v0, v5}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v0

    filled-new-array {v4, v0}, [Lof/e0;

    move-result-object v0

    invoke-static {v2, v0}, Lof/c;->f(Lof/e0;[Lof/e0;)Lof/c$b;

    move-result-object v0

    new-instance v2, Lpf/u;

    invoke-direct {v2}, Lpf/u;-><init>()V

    invoke-virtual {v0, v2}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    const-class v2, Lmf/b;

    invoke-static {v2, v1}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v4

    invoke-static {v2, v3}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v6

    invoke-static {v2, v5}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v2

    filled-new-array {v6, v2}, [Lof/e0;

    move-result-object v2

    invoke-static {v4, v2}, Lof/c;->f(Lof/e0;[Lof/e0;)Lof/c$b;

    move-result-object v2

    new-instance v4, Lpf/v;

    invoke-direct {v4}, Lpf/v;-><init>()V

    invoke-virtual {v2, v4}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lof/c$b;->d()Lof/c;

    move-result-object v2

    const-class v4, Lmf/c;

    invoke-static {v4, v1}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v1

    invoke-static {v4, v3}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v3

    invoke-static {v4, v5}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v4

    filled-new-array {v3, v4}, [Lof/e0;

    move-result-object v3

    invoke-static {v1, v3}, Lof/c;->f(Lof/e0;[Lof/e0;)Lof/c$b;

    move-result-object v1

    new-instance v3, Lpf/w;

    invoke-direct {v3}, Lpf/w;-><init>()V

    invoke-virtual {v1, v3}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lof/c$b;->d()Lof/c;

    move-result-object v1

    const-class v3, Lmf/d;

    invoke-static {v3, v5}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v3

    invoke-static {v3}, Lof/c;->e(Lof/e0;)Lof/c$b;

    move-result-object v3

    new-instance v4, Lpf/x;

    invoke-direct {v4}, Lpf/x;-><init>()V

    invoke-virtual {v3, v4}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lof/c$b;->d()Lof/c;

    move-result-object v3

    filled-new-array {v0, v2, v1, v3}, [Lof/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
