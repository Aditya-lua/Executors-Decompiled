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
.field public static final a:Lmf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmf/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lmf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmf/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lmf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmf/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lmf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmf/x<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmf/x;

    new-instance v1, Lnf/q;

    invoke-direct {v1}, Lnf/q;-><init>()V

    invoke-direct {v0, v1}, Lmf/x;-><init>(Lyf/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lmf/x;

    new-instance v0, Lmf/x;

    new-instance v1, Lnf/r;

    invoke-direct {v1}, Lnf/r;-><init>()V

    invoke-direct {v0, v1}, Lmf/x;-><init>(Lyf/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lmf/x;

    new-instance v0, Lmf/x;

    new-instance v1, Lnf/s;

    invoke-direct {v1}, Lnf/s;-><init>()V

    invoke-direct {v0, v1}, Lmf/x;-><init>(Lyf/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lmf/x;

    new-instance v0, Lmf/x;

    new-instance v1, Lnf/t;

    invoke-direct {v1}, Lnf/t;-><init>()V

    invoke-direct {v0, v1}, Lmf/x;-><init>(Lyf/b;)V

    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lmf/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmf/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lmf/x;

    invoke-virtual {p0}, Lmf/x;->get()Ljava/lang/Object;

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

.method public static synthetic d(Lmf/d;)Ljava/util/concurrent/Executor;
    .locals 0

    sget-object p0, Lnf/a0;->a:Lnf/a0;

    return-object p0
.end method

.method public static synthetic e(Lmf/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lmf/x;

    invoke-virtual {p0}, Lmf/x;->get()Ljava/lang/Object;

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

.method public static synthetic g(Lmf/d;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lmf/x;

    invoke-virtual {p0}, Lmf/x;->get()Ljava/lang/Object;

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

    new-instance v0, Lnf/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lnf/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lnf/b;

    invoke-direct {v0, p0, p1, p2}, Lnf/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

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

    new-instance v0, Lnf/o;

    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lmf/x;

    invoke-virtual {v1}, Lmf/x;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0, v1}, Lnf/o;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lkf/a;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v2

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v3}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v4

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v0, v5}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v0

    filled-new-array {v4, v0}, [Lmf/e0;

    move-result-object v0

    invoke-static {v2, v0}, Lmf/c;->f(Lmf/e0;[Lmf/e0;)Lmf/c$b;

    move-result-object v0

    new-instance v2, Lnf/u;

    invoke-direct {v2}, Lnf/u;-><init>()V

    invoke-virtual {v0, v2}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    const-class v2, Lkf/b;

    invoke-static {v2, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v4

    invoke-static {v2, v3}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v6

    invoke-static {v2, v5}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v2

    filled-new-array {v6, v2}, [Lmf/e0;

    move-result-object v2

    invoke-static {v4, v2}, Lmf/c;->f(Lmf/e0;[Lmf/e0;)Lmf/c$b;

    move-result-object v2

    new-instance v4, Lnf/v;

    invoke-direct {v4}, Lnf/v;-><init>()V

    invoke-virtual {v2, v4}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lmf/c$b;->d()Lmf/c;

    move-result-object v2

    const-class v4, Lkf/c;

    invoke-static {v4, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v1

    invoke-static {v4, v3}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v3

    invoke-static {v4, v5}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v4

    filled-new-array {v3, v4}, [Lmf/e0;

    move-result-object v3

    invoke-static {v1, v3}, Lmf/c;->f(Lmf/e0;[Lmf/e0;)Lmf/c$b;

    move-result-object v1

    new-instance v3, Lnf/w;

    invoke-direct {v3}, Lnf/w;-><init>()V

    invoke-virtual {v1, v3}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lmf/c$b;->d()Lmf/c;

    move-result-object v1

    const-class v3, Lkf/d;

    invoke-static {v3, v5}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v3

    invoke-static {v3}, Lmf/c;->e(Lmf/e0;)Lmf/c$b;

    move-result-object v3

    new-instance v4, Lnf/x;

    invoke-direct {v4}, Lnf/x;-><init>()V

    invoke-virtual {v3, v4}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lmf/c$b;->d()Lmf/c;

    move-result-object v3

    filled-new-array {v0, v2, v1, v3}, [Lmf/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
