.class public final Lva/k0;
.super Ll9/u;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final synthetic d:Lva/l0;


# direct methods
.method public synthetic constructor <init>(Lva/l0;Lva/j0;)V
    .locals 1

    iput-object p1, p0, Lva/k0;->d:Lva/l0;

    const/4 p1, 0x0

    const/16 p2, 0x70e5

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Ll9/u;-><init>([Lcom/google/android/gms/common/Feature;ZI)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lk9/a$b;Lsb/k;)V
    .locals 5

    check-cast p1, Lva/p0;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Llf/d;

    new-instance v0, Lva/i0;

    invoke-direct {v0, p0, p2}, Lva/i0;-><init>(Lva/k0;Lsb/k;)V

    iget-object v1, p0, Lva/k0;->d:Lva/l0;

    invoke-static {v1}, Lva/l0;->c(Lva/l0;)Lcom/google/firebase/appindexing/internal/zzg;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Llf/d;->o0(Ll9/g;Lcom/google/firebase/appindexing/internal/zzg;)Lcom/google/firebase/appindexing/internal/zza;

    move-result-object p1

    const/4 v0, 0x2

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    iget p1, p1, Lcom/google/firebase/appindexing/internal/zza;->f:I

    :goto_0
    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne p1, v1, :cond_4

    const/4 p1, 0x4

    invoke-static {p1}, Lva/q0;->b(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "AppIndex"

    const-string v1, "Queue was full. API call will be retried."

    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p2, v4}, Lsb/k;->e(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lva/k0;->d:Lva/l0;

    iget-object p1, p1, Lva/l0;->c:Lva/m0;

    invoke-static {p1}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lva/k0;->d:Lva/l0;

    iget-object p2, p2, Lva/l0;->c:Lva/m0;

    invoke-static {p2}, Lva/m0;->b(Lva/m0;)I

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p2}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lva/l0;

    iget-object p2, p0, Lva/k0;->d:Lva/l0;

    if-ne v4, p2, :cond_2

    move v2, v3

    :cond_2
    invoke-static {v2}, Ln9/m;->p(Z)V

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_3
    invoke-static {p2, v0}, Lva/m0;->f(Lva/m0;I)V

    :goto_1
    monitor-exit p1

    goto :goto_4

    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_4
    if-eq p1, v3, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "API call failed. Status code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {v0}, Lva/q0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "AppIndex"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {p2, v4}, Lsb/k;->e(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lva/k0;->d:Lva/l0;

    invoke-static {p1}, Lva/l0;->b(Lva/l0;)Lsb/k;

    move-result-object p1

    new-instance p2, Lv8/c;

    const-string v0, "Indexing error."

    invoke-direct {p2, v0}, Lv8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lsb/k;->b(Ljava/lang/Exception;)V

    :cond_6
    iget-object p1, p0, Lva/k0;->d:Lva/l0;

    iget-object p1, p1, Lva/l0;->c:Lva/m0;

    invoke-static {p1}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object p1

    monitor-enter p1

    :try_start_1
    iget-object p2, p0, Lva/k0;->d:Lva/l0;

    iget-object p2, p2, Lva/l0;->c:Lva/m0;

    invoke-static {p2}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lva/l0;

    iget-object v0, p0, Lva/k0;->d:Lva/l0;

    if-ne p2, v0, :cond_7

    goto :goto_3

    :cond_7
    move v3, v2

    :goto_3
    invoke-static {v3}, Ln9/m;->p(Z)V

    iget-object p2, p0, Lva/k0;->d:Lva/l0;

    iget-object p2, p2, Lva/l0;->c:Lva/m0;

    invoke-static {p2}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lva/l0;

    iget-object p2, p0, Lva/k0;->d:Lva/l0;

    iget-object p2, p2, Lva/l0;->c:Lva/m0;

    invoke-static {p2, v2}, Lva/m0;->f(Lva/m0;I)V

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_8
    :goto_4
    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lva/l0;->d()V

    :cond_9
    return-void

    :catchall_1
    move-exception p2

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p2
.end method
