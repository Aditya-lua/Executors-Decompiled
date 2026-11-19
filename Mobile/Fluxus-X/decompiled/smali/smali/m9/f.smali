.class public Lm9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final u:Lcom/google/android/gms/common/api/Status;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final v:Lcom/google/android/gms/common/api/Status;

.field public static final w:Ljava/lang/Object;

.field public static x:Lm9/f;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lo9/w;

.field public d:Lo9/y;

.field public final e:Landroid/content/Context;

.field public final f:Lk9/e;

.field public final g:Lo9/l0;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final o:Ljava/util/Map;

.field public p:Lm9/a0;

.field public final q:Ljava/util/Set;

.field public final r:Ljava/util/Set;

.field public final s:Landroid/os/Handler;

.field public volatile t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lm9/f;->u:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lm9/f;->v:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm9/f;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lk9/e;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lm9/f;->a:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm9/f;->b:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lm9/f;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x5

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v1, p0, Lm9/f;->o:Ljava/util/Map;

    const/4 v1, 0x0

    iput-object v1, p0, Lm9/f;->p:Lm9/a0;

    new-instance v1, Lw1/b;

    invoke-direct {v1}, Lw1/b;-><init>()V

    iput-object v1, p0, Lm9/f;->q:Ljava/util/Set;

    new-instance v1, Lw1/b;

    invoke-direct {v1}, Lw1/b;-><init>()V

    iput-object v1, p0, Lm9/f;->r:Ljava/util/Set;

    iput-boolean v2, p0, Lm9/f;->t:Z

    iput-object p1, p0, Lm9/f;->e:Landroid/content/Context;

    new-instance v1, Lcb/j;

    invoke-direct {v1, p2, p0}, Lcb/j;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lm9/f;->s:Landroid/os/Handler;

    iput-object p3, p0, Lm9/f;->f:Lk9/e;

    new-instance p2, Lo9/l0;

    invoke-direct {p2, p3}, Lo9/l0;-><init>(Lk9/f;)V

    iput-object p2, p0, Lm9/f;->g:Lo9/l0;

    invoke-static {p1}, Lv9/i;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lm9/f;->t:Z

    :cond_0
    const/4 p1, 0x6

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static bridge synthetic A()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public static bridge synthetic B(Lm9/f;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lm9/f;->o:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic C(Lm9/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lm9/f;->q:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic D(Lm9/f;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/f;->b:Z

    return-void
.end method

.method public static a()V
    .locals 3

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm9/f;->x:Lm9/f;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v1, v1, Lm9/f;->s:Landroid/os/Handler;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic d(Lm9/f;)Z
    .locals 0

    iget-boolean p0, p0, Lm9/f;->t:Z

    return p0
.end method

.method public static g(Lm9/b;Lk9/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0}, Lm9/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "API: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not available on this device. Connection failed with: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/api/Status;-><init>(Lk9/b;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic m(Lm9/f;)J
    .locals 2

    iget-wide v0, p0, Lm9/f;->a:J

    return-wide v0
.end method

.method public static bridge synthetic n(Lm9/f;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lm9/f;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic o(Lm9/f;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lm9/f;->s:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic p(Lm9/f;)Lk9/e;
    .locals 0

    iget-object p0, p0, Lm9/f;->f:Lk9/e;

    return-object p0
.end method

.method public static bridge synthetic q()Lcom/google/android/gms/common/api/Status;
    .locals 1

    sget-object v0, Lm9/f;->v:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public static bridge synthetic r(Lm9/b;Lk9/b;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    invoke-static {p0, p1}, Lm9/f;->g(Lm9/b;Lk9/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic s(Lm9/f;)Lm9/a0;
    .locals 0

    iget-object p0, p0, Lm9/f;->p:Lm9/a0;

    return-object p0
.end method

.method public static u()Lm9/f;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm9/f;->x:Lm9/f;

    const-string v2, "Must guarantee manager is non-null before using getInstance"

    invoke-static {v1, v2}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lm9/f;->x:Lm9/f;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static v(Landroid/content/Context;)Lm9/f;
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm9/f;->x:Lm9/f;

    if-nez v1, :cond_0

    invoke-static {}, Lo9/j;->b()Landroid/os/HandlerThread;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lm9/f;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Lk9/e;->o()Lk9/e;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3}, Lm9/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lk9/e;)V

    sput-object v2, Lm9/f;->x:Lm9/f;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lm9/f;->x:Lm9/f;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic w(Lm9/f;)Lo9/l0;
    .locals 0

    iget-object p0, p0, Lm9/f;->g:Lo9/l0;

    return-object p0
.end method


# virtual methods
.method public final E(Ll9/g;ILcom/google/android/gms/common/api/internal/a;)V
    .locals 1
    .param p1    # Ll9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/common/api/internal/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lm9/k1;

    invoke-direct {v0, p2, p3}, Lm9/k1;-><init>(ILcom/google/android/gms/common/api/internal/a;)V

    iget-object p2, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p3, Lm9/v0;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p3, v0, p2, p1}, Lm9/v0;-><init>(Lm9/o1;ILl9/g;)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 p2, 0x4

    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final F(Ll9/g;ILm9/u;Ltb/k;Lm9/s;)V
    .locals 1
    .param p1    # Ll9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lm9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ltb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lm9/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p3}, Lm9/u;->f()I

    move-result v0

    invoke-virtual {p0, p4, v0, p1}, Lm9/f;->k(Ltb/k;ILl9/g;)V

    new-instance v0, Lm9/m1;

    invoke-direct {v0, p2, p3, p4, p5}, Lm9/m1;-><init>(ILm9/u;Ltb/k;Lm9/s;)V

    iget-object p2, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p3, Lm9/v0;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p3, v0, p2, p1}, Lm9/v0;-><init>(Lm9/o1;ILl9/g;)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 p2, 0x4

    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final G(Lo9/p;IJI)V
    .locals 6

    new-instance v0, Lm9/u0;

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lm9/u0;-><init>(Lo9/p;IJI)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/16 p2, 0x12

    invoke-virtual {p1, p2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final H(Lk9/b;I)V
    .locals 3
    .param p1    # Lk9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lm9/f;->f(Lk9/b;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final I()V
    .locals 2

    iget-object v0, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final J(Ll9/g;)V
    .locals 2
    .param p1    # Ll9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final b(Lm9/a0;)V
    .locals 2
    .param p1    # Lm9/a0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm9/f;->p:Lm9/a0;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lm9/f;->p:Lm9/a0;

    iget-object v1, p0, Lm9/f;->q:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lm9/f;->q:Ljava/util/Set;

    invoke-virtual {p1}, Lm9/a0;->t()Lw1/b;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(Lm9/a0;)V
    .locals 2
    .param p1    # Lm9/a0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lm9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm9/f;->p:Lm9/a0;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lm9/f;->p:Lm9/a0;

    iget-object p1, p0, Lm9/f;->q:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final e()Z
    .locals 4

    iget-boolean v0, p0, Lm9/f;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lo9/t;->b()Lo9/t;

    move-result-object v0

    invoke-virtual {v0}, Lo9/t;->a()Lo9/u;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo9/u;->C3()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lm9/f;->g:Lo9/l0;

    iget-object v2, p0, Lm9/f;->e:Landroid/content/Context;

    const v3, 0xc1fa340

    invoke-virtual {v0, v2, v3}, Lo9/l0;->a(Landroid/content/Context;I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final f(Lk9/b;I)Z
    .locals 2
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    iget-object v0, p0, Lm9/f;->f:Lk9/e;

    iget-object v1, p0, Lm9/f;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lk9/e;->y(Landroid/content/Context;Lk9/b;I)Z

    move-result p1

    return p1
.end method

.method public final h(Ll9/g;)Lm9/j0;
    .locals 2
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-virtual {p1}, Ll9/g;->v()Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-nez v0, :cond_0

    new-instance v0, Lm9/j0;

    invoke-direct {v0, p0, p1}, Lm9/j0;-><init>(Lm9/f;Ll9/g;)V

    iget-object p1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Lm9/j0;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm9/f;->r:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v0}, Lm9/j0;->C()V

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 9
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xd

    const-wide/32 v2, 0x493e0

    const-string v4, "GoogleApiManager"

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x11

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown message id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v8

    :pswitch_0
    iput-boolean v8, p0, Lm9/f;->b:Z

    goto/16 :goto_7

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/u0;

    iget-wide v0, p1, Lm9/u0;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Lo9/w;

    iget v1, p1, Lm9/u0;->b:I

    iget-object p1, p1, Lm9/u0;->a:Lo9/p;

    filled-new-array {p1}, [Lo9/p;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lo9/w;-><init>(ILjava/util/List;)V

    invoke-virtual {p0}, Lm9/f;->i()Lo9/y;

    move-result-object p1

    invoke-interface {p1, v0}, Lo9/y;->g(Lo9/w;)Lcom/google/android/gms/tasks/Task;

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lm9/f;->c:Lo9/w;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lo9/w;->B3()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lo9/w;->A3()I

    move-result v0

    iget v2, p1, Lm9/u0;->b:I

    if-ne v0, v2, :cond_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lm9/u0;->d:I

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lm9/f;->c:Lo9/w;

    iget-object v1, p1, Lm9/u0;->a:Lo9/p;

    invoke-virtual {v0, v1}, Lo9/w;->C3(Lo9/p;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lm9/f;->j()V

    :cond_3
    :goto_1
    iget-object v0, p0, Lm9/f;->c:Lo9/w;

    if-nez v0, :cond_11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lm9/u0;->a:Lo9/p;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo9/w;

    iget v2, p1, Lm9/u0;->b:I

    invoke-direct {v1, v2, v0}, Lo9/w;-><init>(ILjava/util/List;)V

    iput-object v1, p0, Lm9/f;->c:Lo9/w;

    iget-object v0, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p1, Lm9/u0;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_7

    :pswitch_2
    invoke-virtual {p0}, Lm9/f;->j()V

    goto/16 :goto_7

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/l0;

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-static {p1}, Lm9/l0;->b(Lm9/l0;)Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-static {p1}, Lm9/l0;->b(Lm9/l0;)Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    invoke-static {v0, p1}, Lm9/j0;->A(Lm9/j0;Lm9/l0;)V

    goto/16 :goto_7

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/l0;

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-static {p1}, Lm9/l0;->b(Lm9/l0;)Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-static {p1}, Lm9/l0;->b(Lm9/l0;)Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    invoke-static {v0, p1}, Lm9/j0;->z(Lm9/j0;Lm9/l0;)V

    goto/16 :goto_7

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/b0;

    invoke-virtual {p1}, Lm9/b0;->a()Lm9/b;

    move-result-object v0

    iget-object v1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lm9/b0;->b()Ltb/k;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ltb/k;->c(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget-object v1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    invoke-static {v0, v8}, Lm9/j0;->M(Lm9/j0;Z)Z

    move-result v0

    invoke-virtual {p1}, Lm9/b0;->b()Ltb/k;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Ltb/k;->c(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_6
    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/j0;

    invoke-virtual {p1}, Lm9/j0;->b()Z

    goto/16 :goto_7

    :pswitch_7
    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/j0;

    invoke-virtual {p1}, Lm9/j0;->K()V

    goto/16 :goto_7

    :pswitch_8
    iget-object p1, p0, Lm9/f;->r:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/b;

    iget-object v1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lm9/j0;->J()V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lm9/f;->r:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_7

    :pswitch_9
    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/j0;

    invoke-virtual {p1}, Lm9/j0;->I()V

    goto/16 :goto_7

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll9/g;

    invoke-virtual {p0, p1}, Lm9/f;->h(Ll9/g;)Lm9/j0;

    goto/16 :goto_7

    :pswitch_b
    iget-object p1, p0, Lm9/f;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lm9/f;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lm9/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lm9/c;->b()Lm9/c;

    move-result-object p1

    new-instance v0, Lm9/e0;

    invoke-direct {v0, p0}, Lm9/e0;-><init>(Lm9/f;)V

    invoke-virtual {p1, v0}, Lm9/c;->a(Lm9/c$a;)V

    invoke-static {}, Lm9/c;->b()Lm9/c;

    move-result-object p1

    invoke-virtual {p1, v6}, Lm9/c;->e(Z)Z

    move-result p1

    if-nez p1, :cond_11

    iput-wide v2, p0, Lm9/f;->a:J

    goto/16 :goto_7

    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lk9/b;

    iget-object v2, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm9/j0;

    invoke-virtual {v3}, Lm9/j0;->p()I

    move-result v8

    if-ne v8, v0, :cond_7

    move-object v5, v3

    :cond_8
    if-eqz v5, :cond_a

    invoke-virtual {p1}, Lk9/b;->B3()I

    move-result v0

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lm9/f;->f:Lk9/e;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lk9/b;->B3()I

    move-result v2

    invoke-virtual {v0, v2}, Lk9/e;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lk9/b;->C3()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v7, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v5, v1}, Lm9/j0;->w(Lm9/j0;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_7

    :cond_9
    invoke-static {v5}, Lm9/j0;->u(Lm9/j0;)Lm9/b;

    move-result-object v0

    invoke-static {v0, p1}, Lm9/f;->g(Lm9/b;Lk9/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {v5, p1}, Lm9/j0;->w(Lm9/j0;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_7

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find API instance "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " while trying to fail enqueued calls."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-static {v4, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_7

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/v0;

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    iget-object v1, p1, Lm9/v0;->c:Ll9/g;

    invoke-virtual {v1}, Ll9/g;->v()Lm9/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-nez v0, :cond_b

    iget-object v0, p1, Lm9/v0;->c:Ll9/g;

    invoke-virtual {p0, v0}, Lm9/f;->h(Ll9/g;)Lm9/j0;

    move-result-object v0

    :cond_b
    invoke-virtual {v0}, Lm9/j0;->a()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Lm9/v0;->b:I

    if-eq v1, v2, :cond_c

    iget-object p1, p1, Lm9/v0;->a:Lm9/o1;

    sget-object v1, Lm9/f;->u:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v1}, Lm9/o1;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0}, Lm9/j0;->J()V

    goto/16 :goto_7

    :cond_c
    iget-object p1, p1, Lm9/v0;->a:Lm9/o1;

    invoke-virtual {v0, p1}, Lm9/j0;->D(Lm9/o1;)V

    goto/16 :goto_7

    :pswitch_e
    iget-object p1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    invoke-virtual {v0}, Lm9/j0;->B()V

    invoke-virtual {v0}, Lm9/j0;->C()V

    goto :goto_3

    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lm9/p1;

    invoke-virtual {p1}, Lm9/p1;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/b;

    iget-object v3, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm9/j0;

    if-nez v3, :cond_d

    new-instance v0, Lk9/b;

    invoke-direct {v0, v1}, Lk9/b;-><init>(I)V

    invoke-virtual {p1, v2, v0, v5}, Lm9/p1;->c(Lm9/b;Lk9/b;Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v3}, Lm9/j0;->N()Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Lk9/b;->k:Lk9/b;

    invoke-virtual {v3}, Lm9/j0;->t()Ll9/a$f;

    move-result-object v3

    invoke-interface {v3}, Ll9/a$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v4, v3}, Lm9/p1;->c(Lm9/b;Lk9/b;Ljava/lang/String;)V

    goto :goto_4

    :cond_e
    invoke-virtual {v3}, Lm9/j0;->r()Lk9/b;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {p1, v2, v4, v5}, Lm9/p1;->c(Lm9/b;Lk9/b;Ljava/lang/String;)V

    goto :goto_4

    :cond_f
    invoke-virtual {v3, p1}, Lm9/j0;->H(Lm9/p1;)V

    invoke-virtual {v3}, Lm9/j0;->C()V

    goto :goto_4

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eq v6, p1, :cond_10

    goto :goto_5

    :cond_10
    const-wide/16 v2, 0x2710

    :goto_5
    iput-wide v2, p0, Lm9/f;->a:J

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/b;

    iget-object v2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-wide v3, p0, Lm9/f;->a:J

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_6

    :cond_11
    :goto_7
    return v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()Lo9/y;
    .locals 1

    iget-object v0, p0, Lm9/f;->d:Lo9/y;

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/f;->e:Landroid/content/Context;

    invoke-static {v0}, Lo9/x;->a(Landroid/content/Context;)Lo9/y;

    move-result-object v0

    iput-object v0, p0, Lm9/f;->d:Lo9/y;

    :cond_0
    iget-object v0, p0, Lm9/f;->d:Lo9/y;

    return-object v0
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Lm9/f;->c:Lo9/w;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo9/w;->A3()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-virtual {p0}, Lm9/f;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lm9/f;->i()Lo9/y;

    move-result-object v1

    invoke-interface {v1, v0}, Lo9/y;->g(Lo9/w;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lm9/f;->c:Lo9/w;

    :cond_2
    return-void
.end method

.method public final k(Ltb/k;ILl9/g;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Ll9/g;->v()Lm9/b;

    move-result-object p3

    invoke-static {p0, p2, p3}, Lm9/t0;->a(Lm9/f;ILm9/b;)Lm9/t0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object p3, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lm9/d0;

    invoke-direct {v0, p3}, Lm9/d0;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Lm9/f;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method public final t(Lm9/b;)Lm9/j0;
    .locals 1

    iget-object v0, p0, Lm9/f;->o:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/j0;

    return-object p1
.end method

.method public final x(Ljava/lang/Iterable;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Ljava/lang/Iterable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lm9/p1;

    invoke-direct {v0, p1}, Lm9/p1;-><init>(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Lm9/p1;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ll9/g;Lm9/o;Lm9/w;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Ll9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lm9/o;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lm9/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ltb/k;

    invoke-direct {v0}, Ltb/k;-><init>()V

    invoke-virtual {p2}, Lm9/o;->e()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Lm9/f;->k(Ltb/k;ILl9/g;)V

    new-instance v1, Lm9/l1;

    new-instance v2, Lm9/w0;

    invoke-direct {v2, p2, p3, p4}, Lm9/w0;-><init>(Lm9/o;Lm9/w;Ljava/lang/Runnable;)V

    invoke-direct {v1, v2, v0}, Lm9/l1;-><init>(Lm9/w0;Ltb/k;)V

    iget-object p2, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p3, Lm9/v0;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p3, v1, p2, p1}, Lm9/v0;-><init>(Lm9/o1;ILl9/g;)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/16 p2, 0x8

    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final z(Ll9/g;Lm9/k$a;I)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Ll9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lm9/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ltb/k;

    invoke-direct {v0}, Ltb/k;-><init>()V

    invoke-virtual {p0, v0, p3, p1}, Lm9/f;->k(Ltb/k;ILl9/g;)V

    new-instance p3, Lm9/n1;

    invoke-direct {p3, p2, v0}, Lm9/n1;-><init>(Lm9/k$a;Ltb/k;)V

    iget-object p2, p0, Lm9/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Lm9/v0;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {v1, p3, p2, p1}, Lm9/v0;-><init>(Lm9/o1;ILl9/g;)V

    iget-object p1, p0, Lm9/f;->s:Landroid/os/Handler;

    const/16 p2, 0xd

    invoke-virtual {p1, p2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lm9/f;->s:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
