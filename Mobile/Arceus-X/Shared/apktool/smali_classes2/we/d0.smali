.class public final Lwe/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lwe/d0;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lwe/q0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwe/b0;

    invoke-direct {v0}, Lwe/b0;-><init>()V

    invoke-static {v0}, Lwe/r0;->a(Lwe/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/d0;

    sput-object v0, Lwe/d0;->b:Lwe/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lwe/q0$b;

    invoke-direct {v1}, Lwe/q0$b;-><init>()V

    invoke-virtual {v1}, Lwe/q0$b;->e()Lwe/q0;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static synthetic a()Lwe/d0;
    .locals 1

    invoke-static {}, Lwe/d0;->b()Lwe/d0;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lwe/d0;
    .locals 4

    new-instance v0, Lwe/d0;

    invoke-direct {v0}, Lwe/d0;-><init>()V

    new-instance v1, Lwe/c0;

    invoke-direct {v1}, Lwe/c0;-><init>()V

    const-class v2, Lwe/p;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/d0;->k(Lwe/n;)V

    return-object v0
.end method

.method public static c()Lwe/d0;
    .locals 1

    sget-object v0, Lwe/d0;->b:Lwe/d0;

    return-object v0
.end method


# virtual methods
.method public d(Lwe/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1}, Lwe/q0;->e(Lwe/p0;)Z

    move-result p1

    return p1
.end method

.method public e(Lwe/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1}, Lwe/q0;->f(Lwe/p0;)Z

    move-result p1

    return p1
.end method

.method public f(Lwe/p0;Lpe/d0;)Lpe/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(TSerializationT;",
            "Lpe/d0;",
            ")",
            "Lpe/l;"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1, p2}, Lwe/q0;->g(Lwe/p0;Lpe/d0;)Lpe/l;

    move-result-object p1

    return-object p1
.end method

.method public g(Lwe/l0;Lpe/d0;)Lpe/l;
    .locals 1

    invoke-virtual {p0, p1}, Lwe/d0;->d(Lwe/p0;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lwe/p;

    invoke-direct {v0, p1, p2}, Lwe/p;-><init>(Lwe/l0;Lpe/d0;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lwe/d0;->f(Lwe/p0;Lpe/d0;)Lpe/l;

    move-result-object p1

    return-object p1
.end method

.method public h(Lwe/p0;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(TSerializationT;)",
            "Lpe/x;"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1}, Lwe/q0;->h(Lwe/p0;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public i(Lwe/m0;)Lpe/x;
    .locals 1

    invoke-virtual {p0, p1}, Lwe/d0;->e(Lwe/p0;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lwe/q;

    invoke-direct {v0, p1}, Lwe/q;-><init>(Lwe/m0;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lwe/d0;->h(Lwe/p0;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized j(Lwe/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/m<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lwe/q0$b;

    iget-object v1, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/q0;

    invoke-direct {v0, v1}, Lwe/q0$b;-><init>(Lwe/q0;)V

    invoke-virtual {v0, p1}, Lwe/q0$b;->f(Lwe/m;)Lwe/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lwe/q0$b;->e()Lwe/q0;

    move-result-object p1

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized k(Lwe/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lpe/l;",
            "SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/n<",
            "TKeyT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lwe/q0$b;

    iget-object v1, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/q0;

    invoke-direct {v0, v1}, Lwe/q0$b;-><init>(Lwe/q0;)V

    invoke-virtual {v0, p1}, Lwe/q0$b;->g(Lwe/n;)Lwe/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lwe/q0$b;->e()Lwe/q0;

    move-result-object p1

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized l(Lwe/f0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/f0<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lwe/q0$b;

    iget-object v1, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/q0;

    invoke-direct {v0, v1}, Lwe/q0$b;-><init>(Lwe/q0;)V

    invoke-virtual {v0, p1}, Lwe/q0$b;->h(Lwe/f0;)Lwe/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lwe/q0$b;->e()Lwe/q0;

    move-result-object p1

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized m(Lwe/g0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lpe/x;",
            "SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/g0<",
            "TParametersT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lwe/q0$b;

    iget-object v1, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/q0;

    invoke-direct {v0, v1}, Lwe/q0$b;-><init>(Lwe/q0;)V

    invoke-virtual {v0, p1}, Lwe/q0$b;->i(Lwe/g0;)Lwe/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lwe/q0$b;->e()Lwe/q0;

    move-result-object p1

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public n(Lpe/l;Ljava/lang/Class;Lpe/d0;)Lwe/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lpe/l;",
            "SerializationT::",
            "Lwe/p0;",
            ">(TKeyT;",
            "Ljava/lang/Class<",
            "TSerializationT;>;",
            "Lpe/d0;",
            ")TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1, p2, p3}, Lwe/q0;->i(Lpe/l;Ljava/lang/Class;Lpe/d0;)Lwe/p0;

    move-result-object p1

    return-object p1
.end method

.method public o(Lpe/x;Ljava/lang/Class;)Lwe/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lpe/x;",
            "SerializationT::",
            "Lwe/p0;",
            ">(TParametersT;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lwe/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/q0;

    invoke-virtual {v0, p1, p2}, Lwe/q0;->j(Lpe/x;Ljava/lang/Class;)Lwe/p0;

    move-result-object p1

    return-object p1
.end method
