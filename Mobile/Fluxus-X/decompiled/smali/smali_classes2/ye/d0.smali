.class public final Lye/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lye/d0;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lye/q0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lye/b0;

    invoke-direct {v0}, Lye/b0;-><init>()V

    invoke-static {v0}, Lye/r0;->a(Lye/r0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/d0;

    sput-object v0, Lye/d0;->b:Lye/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lye/q0$b;

    invoke-direct {v1}, Lye/q0$b;-><init>()V

    invoke-virtual {v1}, Lye/q0$b;->e()Lye/q0;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static synthetic a()Lye/d0;
    .locals 1

    invoke-static {}, Lye/d0;->b()Lye/d0;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lye/d0;
    .locals 4

    new-instance v0, Lye/d0;

    invoke-direct {v0}, Lye/d0;-><init>()V

    new-instance v1, Lye/c0;

    invoke-direct {v1}, Lye/c0;-><init>()V

    const-class v2, Lye/p;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/d0;->k(Lye/n;)V

    return-object v0
.end method

.method public static c()Lye/d0;
    .locals 1

    sget-object v0, Lye/d0;->b:Lye/d0;

    return-object v0
.end method


# virtual methods
.method public d(Lye/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1}, Lye/q0;->e(Lye/p0;)Z

    move-result p1

    return p1
.end method

.method public e(Lye/p0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(TSerializationT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1}, Lye/q0;->f(Lye/p0;)Z

    move-result p1

    return p1
.end method

.method public f(Lye/p0;Lre/d0;)Lre/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(TSerializationT;",
            "Lre/d0;",
            ")",
            "Lre/l;"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1, p2}, Lye/q0;->g(Lye/p0;Lre/d0;)Lre/l;

    move-result-object p1

    return-object p1
.end method

.method public g(Lye/l0;Lre/d0;)Lre/l;
    .locals 1

    invoke-virtual {p0, p1}, Lye/d0;->d(Lye/p0;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lye/p;

    invoke-direct {v0, p1, p2}, Lye/p;-><init>(Lye/l0;Lre/d0;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lye/d0;->f(Lye/p0;Lre/d0;)Lre/l;

    move-result-object p1

    return-object p1
.end method

.method public h(Lye/p0;)Lre/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(TSerializationT;)",
            "Lre/x;"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1}, Lye/q0;->h(Lye/p0;)Lre/x;

    move-result-object p1

    return-object p1
.end method

.method public i(Lye/m0;)Lre/x;
    .locals 1

    invoke-virtual {p0, p1}, Lye/d0;->e(Lye/p0;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lye/q;

    invoke-direct {v0, p1}, Lye/q;-><init>(Lye/m0;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lye/d0;->h(Lye/p0;)Lre/x;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized j(Lye/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/m<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lye/q0$b;

    iget-object v1, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/q0;

    invoke-direct {v0, v1}, Lye/q0$b;-><init>(Lye/q0;)V

    invoke-virtual {v0, p1}, Lye/q0$b;->f(Lye/m;)Lye/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lye/q0$b;->e()Lye/q0;

    move-result-object p1

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public declared-synchronized k(Lye/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lre/l;",
            "SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/n<",
            "TKeyT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lye/q0$b;

    iget-object v1, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/q0;

    invoke-direct {v0, v1}, Lye/q0$b;-><init>(Lye/q0;)V

    invoke-virtual {v0, p1}, Lye/q0$b;->g(Lye/n;)Lye/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lye/q0$b;->e()Lye/q0;

    move-result-object p1

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public declared-synchronized l(Lye/f0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/f0<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lye/q0$b;

    iget-object v1, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/q0;

    invoke-direct {v0, v1}, Lye/q0$b;-><init>(Lye/q0;)V

    invoke-virtual {v0, p1}, Lye/q0$b;->h(Lye/f0;)Lye/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lye/q0$b;->e()Lye/q0;

    move-result-object p1

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public declared-synchronized m(Lye/g0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lre/x;",
            "SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/g0<",
            "TParametersT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lye/q0$b;

    iget-object v1, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/q0;

    invoke-direct {v0, v1}, Lye/q0$b;-><init>(Lye/q0;)V

    invoke-virtual {v0, p1}, Lye/q0$b;->i(Lye/g0;)Lye/q0$b;

    move-result-object p1

    invoke-virtual {p1}, Lye/q0$b;->e()Lye/q0;

    move-result-object p1

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public n(Lre/l;Ljava/lang/Class;Lre/d0;)Lye/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lre/l;",
            "SerializationT::",
            "Lye/p0;",
            ">(TKeyT;",
            "Ljava/lang/Class<",
            "TSerializationT;>;",
            "Lre/d0;",
            ")TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1, p2, p3}, Lye/q0;->i(Lre/l;Ljava/lang/Class;Lre/d0;)Lye/p0;

    move-result-object p1

    return-object p1
.end method

.method public o(Lre/x;Ljava/lang/Class;)Lye/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lre/x;",
            "SerializationT::",
            "Lye/p0;",
            ">(TParametersT;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lye/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lye/q0;

    invoke-virtual {v0, p1, p2}, Lye/q0;->j(Lre/x;Ljava/lang/Class;)Lye/p0;

    move-result-object p1

    return-object p1
.end method
