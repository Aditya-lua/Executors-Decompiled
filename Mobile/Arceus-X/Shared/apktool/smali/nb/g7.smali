.class public final Lnb/g7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/l8;


# static fields
.field public static volatile E:Lnb/g7;


# instance fields
.field public A:I

.field public B:I

.field public final C:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final D:J

.field public final a:Landroid/content/Context;

.field public final b:Z

.field public final c:Lnb/f;

.field public final d:Lnb/k;

.field public final e:Lnb/k6;

.field public final f:Lnb/w5;

.field public final g:Lnb/c7;

.field public final h:Lnb/ld;

.field public final i:Lnb/ve;

.field public final j:Lnb/p5;

.field public final k:Lu9/e;

.field public final l:Lnb/jb;

.field public final m:Lnb/qa;

.field public final n:Lnb/y1;

.field public final o:Lnb/va;

.field public final p:Ljava/lang/String;

.field public q:Lnb/n5;

.field public r:Lnb/tc;

.field public s:Lnb/z;

.field public t:Lnb/k5;

.field public u:Lnb/xa;

.field public v:Z

.field public w:Ljava/lang/Boolean;

.field public x:J

.field public volatile y:Ljava/lang/Boolean;

.field public volatile z:Z


# direct methods
.method public constructor <init>(Lnb/x8;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnb/g7;->v:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lnb/g7;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lnb/x8;->a:Landroid/content/Context;

    new-instance v2, Lnb/f;

    invoke-direct {v2, v1}, Lnb/f;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lnb/g7;->c:Lnb/f;

    sput-object v2, Lnb/s4;->a:Lnb/f;

    iput-object v1, p0, Lnb/g7;->a:Landroid/content/Context;

    iget-boolean v2, p1, Lnb/x8;->e:Z

    iput-boolean v2, p0, Lnb/g7;->b:Z

    iget-object v2, p1, Lnb/x8;->b:Ljava/lang/Boolean;

    iput-object v2, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    iget-object v2, p1, Lnb/x8;->g:Ljava/lang/String;

    iput-object v2, p0, Lnb/g7;->p:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lnb/g7;->z:Z

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/l9;->b(Landroid/content/Context;)V

    invoke-static {}, Lu9/h;->c()Lu9/e;

    move-result-object v3

    iput-object v3, p0, Lnb/g7;->k:Lu9/e;

    iget-object v4, p1, Lnb/x8;->f:Ljava/lang/Long;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Lu9/e;->a()J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, Lnb/g7;->D:J

    new-instance v3, Lnb/k;

    invoke-direct {v3, p0}, Lnb/k;-><init>(Lnb/g7;)V

    iput-object v3, p0, Lnb/g7;->d:Lnb/k;

    new-instance v3, Lnb/k6;

    invoke-direct {v3, p0}, Lnb/k6;-><init>(Lnb/g7;)V

    invoke-virtual {v3}, Lnb/k8;->m()V

    iput-object v3, p0, Lnb/g7;->e:Lnb/k6;

    new-instance v3, Lnb/w5;

    invoke-direct {v3, p0}, Lnb/w5;-><init>(Lnb/g7;)V

    invoke-virtual {v3}, Lnb/k8;->m()V

    iput-object v3, p0, Lnb/g7;->f:Lnb/w5;

    new-instance v4, Lnb/ve;

    invoke-direct {v4, p0}, Lnb/ve;-><init>(Lnb/g7;)V

    invoke-virtual {v4}, Lnb/k8;->m()V

    iput-object v4, p0, Lnb/g7;->i:Lnb/ve;

    new-instance v4, Lnb/w8;

    invoke-direct {v4, p1, p0}, Lnb/w8;-><init>(Lnb/x8;Lnb/g7;)V

    new-instance v5, Lnb/p5;

    invoke-direct {v5, v4}, Lnb/p5;-><init>(Lnb/o5;)V

    iput-object v5, p0, Lnb/g7;->j:Lnb/p5;

    new-instance v4, Lnb/y1;

    invoke-direct {v4, p0}, Lnb/y1;-><init>(Lnb/g7;)V

    iput-object v4, p0, Lnb/g7;->n:Lnb/y1;

    new-instance v4, Lnb/jb;

    invoke-direct {v4, p0}, Lnb/jb;-><init>(Lnb/g7;)V

    invoke-virtual {v4}, Lnb/b5;->k()V

    iput-object v4, p0, Lnb/g7;->l:Lnb/jb;

    new-instance v4, Lnb/qa;

    invoke-direct {v4, p0}, Lnb/qa;-><init>(Lnb/g7;)V

    invoke-virtual {v4}, Lnb/b5;->k()V

    iput-object v4, p0, Lnb/g7;->m:Lnb/qa;

    new-instance v5, Lnb/ld;

    invoke-direct {v5, p0}, Lnb/ld;-><init>(Lnb/g7;)V

    invoke-virtual {v5}, Lnb/b5;->k()V

    iput-object v5, p0, Lnb/g7;->h:Lnb/ld;

    new-instance v5, Lnb/va;

    invoke-direct {v5, p0}, Lnb/va;-><init>(Lnb/g7;)V

    invoke-virtual {v5}, Lnb/k8;->m()V

    iput-object v5, p0, Lnb/g7;->o:Lnb/va;

    new-instance v5, Lnb/c7;

    invoke-direct {v5, p0}, Lnb/c7;-><init>(Lnb/g7;)V

    invoke-virtual {v5}, Lnb/k8;->m()V

    iput-object v5, p0, Lnb/g7;->g:Lnb/c7;

    iget-object v6, p1, Lnb/x8;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    if-eqz v6, :cond_1

    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/zzdd;->g:J

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_3

    invoke-static {v4}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v1, v4, Lnb/j8;->a:Lnb/g7;

    iget-object v1, v1, Lnb/g7;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_4

    iget-object v1, v4, Lnb/j8;->a:Lnb/g7;

    iget-object v1, v1, Lnb/g7;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, v4, Lnb/qa;->c:Lnb/da;

    if-nez v2, :cond_2

    new-instance v2, Lnb/da;

    invoke-direct {v2, v4}, Lnb/da;-><init>(Lnb/qa;)V

    iput-object v2, v4, Lnb/qa;->c:Lnb/da;

    :cond_2
    if-eqz v0, :cond_4

    iget-object v0, v4, Lnb/qa;->c:Lnb/da;

    invoke-virtual {v1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v4, Lnb/qa;->c:Lnb/da;

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v4, Lnb/j8;->a:Lnb/g7;

    iget-object v0, v0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v3}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_4
    :goto_2
    new-instance v0, Lnb/e7;

    invoke-direct {v0, p0, p1}, Lnb/e7;-><init>(Lnb/g7;Lnb/x8;)V

    invoke-virtual {v5, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static O(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lnb/g7;
    .locals 8

    if-eqz p1, :cond_0

    iget-object v6, p1, Lcom/google/android/gms/internal/measurement/zzdd;->i:Landroid/os/Bundle;

    iget-boolean v5, p1, Lcom/google/android/gms/internal/measurement/zzdd;->h:Z

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdd;->g:J

    iget-wide v1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->f:J

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdd;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzdd;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lnb/g7;->E:Lnb/g7;

    if-nez v0, :cond_2

    const-class v1, Lnb/g7;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnb/g7;->E:Lnb/g7;

    if-nez v0, :cond_1

    new-instance v0, Lnb/x8;

    invoke-direct {v0, p0, p1, p2}, Lnb/x8;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)V

    new-instance p0, Lnb/g7;

    invoke-direct {p0, v0}, Lnb/g7;-><init>(Lnb/x8;)V

    sput-object p0, Lnb/g7;->E:Lnb/g7;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    if-eqz p1, :cond_3

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->i:Landroid/os/Bundle;

    if-eqz p0, :cond_3

    const-string p1, "dataCollectionDefaultEnabled"

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lnb/g7;->E:Lnb/g7;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lnb/g7;->E:Lnb/g7;

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    iput-object p0, p1, Lnb/g7;->y:Ljava/lang/Boolean;

    :cond_3
    :goto_2
    sget-object p0, Lnb/g7;->E:Lnb/g7;

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lnb/g7;->E:Lnb/g7;

    return-object p0
.end method

.method public static final q()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final r(Lnb/a4;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(Lnb/j8;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final t(Lnb/b5;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lnb/b5;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final u(Lnb/k8;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lnb/k8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()Lnb/c7;
    .locals 1

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    return-object v0
.end method

.method public final B()Lnb/qa;
    .locals 1

    iget-object v0, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    return-object v0
.end method

.method public final C()Lnb/ve;
    .locals 1

    iget-object v0, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    return-object v0
.end method

.method public final D()Lnb/p5;
    .locals 1

    iget-object v0, p0, Lnb/g7;->j:Lnb/p5;

    return-object v0
.end method

.method public final E()Lnb/n5;
    .locals 1

    iget-object v0, p0, Lnb/g7;->q:Lnb/n5;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v0, p0, Lnb/g7;->q:Lnb/n5;

    return-object v0
.end method

.method public final F()Lnb/va;
    .locals 1

    iget-object v0, p0, Lnb/g7;->o:Lnb/va;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    return-object v0
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, Lnb/g7;->b:Z

    return v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/g7;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Lnb/jb;
    .locals 1

    iget-object v0, p0, Lnb/g7;->l:Lnb/jb;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    return-object v0
.end method

.method public final J()Lnb/tc;
    .locals 1

    iget-object v0, p0, Lnb/g7;->r:Lnb/tc;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v0, p0, Lnb/g7;->r:Lnb/tc;

    return-object v0
.end method

.method public final K()Lnb/z;
    .locals 1

    iget-object v0, p0, Lnb/g7;->s:Lnb/z;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    iget-object v0, p0, Lnb/g7;->s:Lnb/z;

    return-object v0
.end method

.method public final L()Lnb/k5;
    .locals 1

    iget-object v0, p0, Lnb/g7;->t:Lnb/k5;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v0, p0, Lnb/g7;->t:Lnb/k5;

    return-object v0
.end method

.method public final M()Lnb/y1;
    .locals 1

    iget-object v0, p0, Lnb/g7;->n:Lnb/y1;

    invoke-static {v0}, Lnb/g7;->r(Lnb/a4;)V

    return-object v0
.end method

.method public final N()Lnb/xa;
    .locals 1

    iget-object v0, p0, Lnb/g7;->u:Lnb/xa;

    invoke-static {v0}, Lnb/g7;->r(Lnb/a4;)V

    iget-object v0, p0, Lnb/g7;->u:Lnb/xa;

    return-object v0
.end method

.method public final P(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    return-void
.end method

.method public final a()Lnb/w5;
    .locals 1

    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    return-object v0
.end method

.method public final b()Lnb/c7;
    .locals 1

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    return-object v0
.end method

.method public final c()Lnb/f;
    .locals 1

    iget-object v0, p0, Lnb/g7;->c:Lnb/f;

    return-object v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnb/g7;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e()Lu9/e;
    .locals 1

    iget-object v0, p0, Lnb/g7;->k:Lu9/e;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, Lnb/g7;->h()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()I
    .locals 3

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v1, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v1}, Lnb/k;->L()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-boolean v0, p0, Lnb/g7;->z:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k6;->t()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x3

    return v0

    :cond_1
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    iget-object v0, v0, Lnb/g7;->c:Lnb/f;

    const-string v0, "firebase_analytics_collection_enabled"

    invoke-virtual {v1, v0}, Lnb/k;->J(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    const/4 v0, 0x4

    return v0

    :cond_3
    iget-object v0, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnb/g7;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    const/4 v0, 0x7

    return v0

    :cond_5
    return v2

    :cond_6
    const/16 v0, 0x8

    return v0

    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public final i(Z)V
    .locals 1

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iput-boolean p1, p0, Lnb/g7;->z:Z

    return-void
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-boolean v0, p0, Lnb/g7;->z:Z

    return v0
.end method

.method public final k()V
    .locals 1

    iget v0, p0, Lnb/g7;->A:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnb/g7;->A:I

    return-void
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, Lnb/g7;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final m()Z
    .locals 5

    iget-boolean v0, p0, Lnb/g7;->v:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/g7;->w:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lnb/g7;->x:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lnb/g7;->k:Lu9/e;

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lnb/g7;->x:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lnb/g7;->k:Lu9/e;

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lnb/g7;->x:J

    iget-object v0, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lnb/ve;->M(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lnb/ve;->M(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnb/g7;->a:Landroid/content/Context;

    invoke-static {v1}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v3

    invoke-virtual {v3}, Lw9/b;->f()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    iget-object v3, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v3}, Lnb/k;->m()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1}, Lnb/ve;->j0(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v2}, Lnb/ve;->E(Landroid/content/Context;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move v2, v4

    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lnb/g7;->w:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/ve;->o(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lnb/g7;->w:Ljava/lang/Boolean;

    :cond_3
    iget-object v0, p0, Lnb/g7;->w:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n()Z
    .locals 13

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/g7;->o:Lnb/va;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v1}, Lnb/k;->M()Z

    move-result v1

    const/4 v10, 0x0

    if-eqz v1, :cond_c

    iget-object v1, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v1, v4}, Lnb/k6;->o(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_b

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/k8;->l()V

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    iget-object v0, v0, Lnb/g7;->a:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v3

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-virtual {v3}, Lnb/b5;->j()V

    invoke-virtual {v3}, Lnb/tc;->y()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    iget-object v3, v3, Lnb/g7;->i:Lnb/ve;

    invoke-static {v3}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v3}, Lnb/ve;->W()I

    move-result v3

    const v5, 0x392d8

    if-lt v3, v5, :cond_8

    :goto_1
    iget-object v3, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {v3}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v5, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-virtual {v5}, Lnb/g7;->J()Lnb/tc;

    move-result-object v3

    invoke-virtual {v3}, Lnb/tc;->l0()Lcom/google/android/gms/measurement/internal/zzao;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/zzao;->f:Landroid/os/Bundle;

    :cond_3
    const/4 v3, 0x1

    if-nez v2, :cond_6

    iget v0, p0, Lnb/g7;->B:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lnb/g7;->B:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    move v10, v3

    :cond_4
    iget-object v2, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v2}, Lnb/g7;->u(Lnb/k8;)V

    if-ge v0, v1, :cond_5

    const-string v0, "Retrying."

    goto :goto_2

    :cond_5
    const-string v0, "Skipping."

    :goto_2
    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x3c

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Failed to retrieve DMA consent from the service, "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retryCount"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lnb/g7;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v10

    :cond_6
    const/16 v5, 0x64

    invoke-static {v2, v5}, Lnb/q8;->e(Landroid/os/Bundle;I)Lnb/q8;

    move-result-object v6

    const-string v7, "&gcs="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lnb/q8;->k()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v5}, Lnb/x;->h(Landroid/os/Bundle;I)Lnb/x;

    move-result-object v5

    const-string v6, "&dma="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lnb/x;->j()Ljava/lang/Boolean;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v3

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lnb/x;->k()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "&dma_cps="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lnb/x;->k()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-static {v2}, Lnb/x;->i(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v3

    const-string v3, "&npa="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v2}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Consent query parameters to Bow"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    iget-object v2, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v2}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v3

    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    iget-object v3, v3, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v3}, Lnb/k;->A()J

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    iget-object v1, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v1}, Lnb/g7;->s(Lnb/j8;)V

    iget-object v1, v1, Lnb/k6;->v:Lnb/h6;

    invoke-virtual {v1}, Lnb/h6;->a()J

    move-result-wide v7

    const-wide/16 v11, -0x1

    add-long/2addr v7, v11

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move-object v5, v4

    const-wide/32 v3, 0x2078d

    invoke-virtual/range {v2 .. v9}, Lnb/ve;->i0(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v3, p0, Lnb/g7;->o:Lnb/va;

    invoke-static {v3}, Lnb/g7;->u(Lnb/k8;)V

    new-instance v8, Lnb/f7;

    invoke-direct {v8, p0}, Lnb/f7;-><init>(Lnb/g7;)V

    invoke-virtual {v3}, Lnb/k8;->l()V

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v3, Lnb/j8;->a:Lnb/g7;

    iget-object v1, v1, Lnb/g7;->g:Lnb/c7;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    new-instance v2, Lnb/ua;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v5

    move-object v5, v0

    invoke-direct/range {v2 .. v8}, Lnb/ua;-><init>(Lnb/va;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lnb/sa;)V

    invoke-virtual {v1, v2}, Lnb/c7;->w(Ljava/lang/Runnable;)V

    :cond_9
    return v10

    :cond_a
    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return v10

    :cond_b
    :goto_3
    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return v10

    :cond_c
    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "ADID collection is disabled from Manifest. Skipping"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return v10
.end method

.method public final synthetic o(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "timestamp"

    const-string v5, "gad_source"

    const-string v6, "gbraid"

    const-string v7, "gclid"

    const-string v8, "deeplink"

    const-string v9, ""

    const/16 v10, 0xc8

    if-eq v0, v10, :cond_1

    const/16 v10, 0xcc

    if-eq v0, v10, :cond_1

    const/16 v10, 0x130

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    move v10, v0

    goto/16 :goto_5

    :cond_1
    move v10, v0

    :goto_0
    if-nez v2, :cond_c

    iget-object v0, v1, Lnb/g7;->e:Lnb/k6;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object v0, v0, Lnb/k6;->u:Lnb/f6;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lnb/f6;->b(Z)V

    if-eqz v3, :cond_b

    array-length v0, v3

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_3

    iget-object v0, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Deferred Deep Link is empty."

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v3, v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v5, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-wide/16 v12, 0x0

    invoke-virtual {v3, v4, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v12

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    iget-object v14, v1, Lnb/g7;->i:Lnb/ve;

    invoke-static {v14}, Lnb/g7;->s(Lnb/j8;)V

    iget-object v15, v14, Lnb/j8;->a:Lnb/g7;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_4

    goto/16 :goto_2

    :cond_4
    iget-object v15, v15, Lnb/g7;->a:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    move-wide/from16 p2, v12

    new-instance v12, Landroid/content/Intent;

    const-string v13, "android.intent.action.VIEW"

    move-object/from16 v16, v14

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/4 v13, 0x0

    invoke-virtual {v2, v12, v13}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3, v6, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v3, v7, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "_cis"

    const-string v5, "ddp"

    invoke-virtual {v3, v2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lnb/g7;->m:Lnb/qa;

    const-string v5, "auto"

    const-string v6, "_cmp"

    invoke-virtual {v2, v5, v6, v3}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static/range {v16 .. v16}, Lnb/g7;->s(Lnb/j8;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    :try_start_1
    const-string v2, "google.analytics.deferred.deeplink.prefs"

    invoke-virtual {v15, v2, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v8, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static/range {p2 .. p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v5

    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_9

    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.google.analytics.action.DEEPLINK_ACTION"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v16

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    iget-object v2, v2, Lnb/g7;->a:Landroid/content/Context;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-ge v3, v4, :cond_8

    invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_8
    invoke-static {}, Landroid/app/BroadcastOptions;->makeBasic()Landroid/app/BroadcastOptions;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/app/BroadcastOptions;->setShareIdentityEnabled(Z)Landroid/app/BroadcastOptions;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/BroadcastOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :catch_1
    move-exception v0

    move-object/from16 v2, v16

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    iget-object v2, v2, Lnb/g7;->f:Lnb/w5;

    invoke-static {v2}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to persist Deferred Deep Link. exception"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    :goto_1
    return-void

    :cond_a
    :goto_2
    iget-object v2, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v2}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v3, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    invoke-virtual {v2, v3, v10, v11, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :goto_3
    iget-object v2, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v2}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to parse the Deferred Deep Link response. exception"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_b
    :goto_4
    iget-object v0, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Deferred Deep Link response empty."

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_c
    :goto_5
    iget-object v0, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v3, "Network Request for Deferred Deep Link failed. response, exception"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic p(Lnb/x8;)V
    .locals 9

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v0}, Lnb/k;->u()Ljava/lang/String;

    new-instance v1, Lnb/z;

    invoke-direct {v1, p0}, Lnb/z;-><init>(Lnb/g7;)V

    invoke-virtual {v1}, Lnb/k8;->m()V

    iput-object v1, p0, Lnb/g7;->s:Lnb/z;

    iget-object v1, p1, Lnb/x8;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    :goto_0
    move-wide v7, v1

    goto :goto_1

    :cond_0
    iget-wide v1, v1, Lcom/google/android/gms/internal/measurement/zzdd;->f:J

    goto :goto_0

    :goto_1
    new-instance v3, Lnb/k5;

    iget-wide v5, p1, Lnb/x8;->c:J

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lnb/k5;-><init>(Lnb/g7;JJ)V

    invoke-virtual {v3}, Lnb/b5;->k()V

    iput-object v3, v4, Lnb/g7;->t:Lnb/k5;

    new-instance p1, Lnb/n5;

    invoke-direct {p1, p0}, Lnb/n5;-><init>(Lnb/g7;)V

    invoke-virtual {p1}, Lnb/b5;->k()V

    iput-object p1, v4, Lnb/g7;->q:Lnb/n5;

    new-instance p1, Lnb/tc;

    invoke-direct {p1, p0}, Lnb/tc;-><init>(Lnb/g7;)V

    invoke-virtual {p1}, Lnb/b5;->k()V

    iput-object p1, v4, Lnb/g7;->r:Lnb/tc;

    iget-object p1, v4, Lnb/g7;->i:Lnb/ve;

    invoke-virtual {p1}, Lnb/k8;->n()V

    iget-object v1, v4, Lnb/g7;->e:Lnb/k6;

    invoke-virtual {v1}, Lnb/k8;->n()V

    iget-object v1, v4, Lnb/g7;->t:Lnb/k5;

    invoke-virtual {v1}, Lnb/b5;->l()V

    new-instance v1, Lnb/xa;

    invoke-direct {v1, p0}, Lnb/xa;-><init>(Lnb/g7;)V

    invoke-virtual {v1}, Lnb/b5;->k()V

    iput-object v1, v4, Lnb/g7;->u:Lnb/xa;

    invoke-virtual {v1}, Lnb/b5;->l()V

    iget-object v1, v4, Lnb/g7;->f:Lnb/w5;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->u()Lnb/u5;

    move-result-object v2

    invoke-virtual {v0}, Lnb/k;->A()J

    const-wide/32 v5, 0x2078d

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "App measurement initialized, version"

    invoke-virtual {v2, v6, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->u()Lnb/u5;

    move-result-object v2

    const-string v5, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v2, v5}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v3}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k;->R()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lnb/ve;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->u()Lnb/u5;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->u()Lnb/u5;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_2
    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    iget p1, v4, Lnb/g7;->A:I

    iget-object v0, v4, Lnb/g7;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-eq p1, v2, :cond_2

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    iget v1, v4, Lnb/g7;->A:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "Not all components initialized"

    invoke-virtual {p1, v2, v1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, v4, Lnb/g7;->v:Z

    return-void
.end method

.method public final v(Lcom/google/android/gms/internal/measurement/zzdd;)V
    .locals 13

    iget-object v0, p0, Lnb/g7;->g:Lnb/c7;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/g7;->N()Lnb/xa;

    move-result-object v0

    invoke-virtual {v0}, Lnb/xa;->q()Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/k7;->c:Lcom/google/android/gms/internal/measurement/k7;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    sget-object v2, Lnb/z4;->R0:Lnb/y4;

    iget-object v3, p0, Lnb/g7;->d:Lnb/k;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v0, v1, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    if-eqz v2, :cond_1

    iget-object v1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v1}, Lnb/ve;->G()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    move v0, v6

    :cond_2
    iget-object v1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v1}, Lnb/j8;->h()V

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v7, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v2, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v7, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    invoke-virtual {v2, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v7, Lnb/bf;

    iget-object v8, v1, Lnb/j8;->a:Lnb/g7;

    invoke-direct {v7, v8}, Lnb/bf;-><init>(Lnb/g7;)V

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    iget-object v8, v1, Lnb/g7;->a:Landroid/content/Context;

    const/4 v9, 0x2

    invoke-static {v8, v7, v2, v9}, Ll2/b;->m(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget-object v1, v1, Lnb/g7;->f:Lnb/w5;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Registered app receiver"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lnb/g7;->N()Lnb/xa;

    move-result-object v0

    sget-object v1, Lnb/z4;->C:Lnb/y4;

    invoke-virtual {v1, v4}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lnb/xa;->o(J)V

    :cond_3
    iget-object v0, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k6;->w()Lnb/q8;

    move-result-object v1

    invoke-virtual {v1}, Lnb/q8;->b()I

    move-result v2

    const-string v7, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v3, v7, v5}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v7

    const-string v8, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v3, v8, v5}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v8

    sget-object v9, Lnb/n8;->b:Lnb/n8;

    const/16 v10, 0x1e

    const/16 v11, -0xa

    if-ne v7, v9, :cond_4

    if-eq v8, v9, :cond_5

    :cond_4
    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0, v11}, Lnb/k6;->v(I)Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-static {v7, v8, v11}, Lnb/q8;->a(Lnb/n8;Lnb/n8;I)Lnb/q8;

    move-result-object v2

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    if-eqz v2, :cond_7

    if-eq v2, v10, :cond_7

    const/16 v7, 0xa

    if-eq v2, v7, :cond_7

    const/16 v7, 0x28

    if-ne v2, v7, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    move-object v2, v4

    goto :goto_3

    :cond_7
    :goto_2
    iget-object v2, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    new-instance v7, Lnb/q8;

    invoke-direct {v7, v4, v4, v11}, Lnb/q8;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    invoke-virtual {v2, v7, v5}, Lnb/qa;->q0(Lnb/q8;Z)V

    goto :goto_1

    :goto_3
    if-eqz v2, :cond_8

    iget-object v1, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {v1}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {v1, v2, v6}, Lnb/qa;->q0(Lnb/q8;Z)V

    move-object v1, v2

    :cond_8
    iget-object v2, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {v2, v1}, Lnb/qa;->o(Lnb/q8;)V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k6;->u()Lnb/x;

    move-result-object v1

    invoke-virtual {v1}, Lnb/x;->b()I

    move-result v1

    const-string v7, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v3, v7, v6}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v7

    if-eq v7, v9, :cond_9

    iget-object v8, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v8}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v8}, Lnb/w5;->w()Lnb/u5;

    move-result-object v8

    const-string v12, "Default ad personalization consent from Manifest"

    invoke-virtual {v8, v12, v7}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    const-string v7, "google_analytics_default_allow_ad_user_data"

    invoke-virtual {v3, v7, v6}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v7

    if-eq v7, v9, :cond_a

    invoke-static {v11, v1}, Lnb/q8;->u(II)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-static {v7, v11}, Lnb/x;->a(Lnb/n8;I)Lnb/x;

    move-result-object p1

    invoke-virtual {v2, p1, v6}, Lnb/qa;->p0(Lnb/x;Z)V

    goto :goto_4

    :cond_a
    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_c

    if-eqz v1, :cond_b

    if-ne v1, v10, :cond_c

    :cond_b
    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    new-instance p1, Lnb/x;

    invoke-direct {p1, v4, v11, v4, v4}, Lnb/x;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v6}, Lnb/qa;->p0(Lnb/x;Z)V

    goto :goto_4

    :cond_c
    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_d

    if-eqz p1, :cond_d

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->i:Landroid/os/Bundle;

    if-eqz p1, :cond_d

    invoke-static {v10, v1}, Lnb/q8;->u(II)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {p1, v10}, Lnb/x;->h(Landroid/os/Bundle;I)Lnb/x;

    move-result-object p1

    invoke-virtual {p1}, Lnb/x;->d()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {v2, p1, v6}, Lnb/qa;->p0(Lnb/x;Z)V

    :cond_d
    :goto_4
    const-string p1, "google_analytics_tcf_data_enabled"

    invoke-virtual {v3, p1}, Lnb/k;->J(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_f

    :cond_e
    iget-object p1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {p1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p1}, Lnb/w5;->v()Lnb/u5;

    move-result-object p1

    const-string v1, "TCF client enabled."

    invoke-virtual {p1, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {v2}, Lnb/qa;->s()V

    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {v2}, Lnb/qa;->r()V

    :cond_f
    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object p1, v0, Lnb/k6;->f:Lnb/h6;

    invoke-virtual {p1}, Lnb/h6;->a()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-nez v1, :cond_10

    iget-object v1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    iget-wide v7, p0, Lnb/g7;->D:J

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v3, "Persisting first open"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v1, v3, v9}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p1, v7, v8}, Lnb/h6;->b(J)V

    :cond_10
    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    iget-object v1, v2, Lnb/qa;->r:Lnb/cf;

    invoke-virtual {v1}, Lnb/cf;->c()V

    invoke-virtual {p0}, Lnb/g7;->m()Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {p0}, Lnb/g7;->g()Z

    move-result p1

    if-eqz p1, :cond_1d

    iget-object p1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Lnb/ve;->M(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_11
    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, Lnb/ve;->M(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_12

    iget-object p1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {p1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_12
    iget-object p1, p0, Lnb/g7;->a:Landroid/content/Context;

    invoke-static {p1}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    invoke-virtual {v0}, Lw9/b;->f()Z

    move-result v0

    if-nez v0, :cond_14

    iget-object v0, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v0}, Lnb/k;->m()Z

    move-result v0

    if-nez v0, :cond_14

    invoke-static {p1}, Lnb/ve;->j0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v0}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_13
    invoke-static {p1, v5}, Lnb/ve;->E(Landroid/content/Context;Z)Z

    move-result p1

    if-nez p1, :cond_14

    iget-object p1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {p1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "AppMeasurementService not registered/enabled"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_14
    iget-object p1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {p1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Uploading is not possible. App measurement disabled"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_15
    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_18

    iget-object v1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {v1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v7, "gmp_app_id"

    invoke-interface {v5, v7, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Lnb/ve;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->u()Lnb/u5;

    move-result-object v1

    const-string v3, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v1, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/k6;->t()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v1, :cond_16

    invoke-virtual {v0, v1}, Lnb/k6;->s(Ljava/lang/Boolean;)V

    :cond_16
    invoke-virtual {p0}, Lnb/g7;->E()Lnb/n5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/n5;->o()V

    iget-object v1, p0, Lnb/g7;->r:Lnb/tc;

    invoke-virtual {v1}, Lnb/tc;->A()V

    iget-object v1, p0, Lnb/g7;->r:Lnb/tc;

    invoke-virtual {v1}, Lnb/tc;->w()V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-wide v8, p0, Lnb/g7;->D:J

    invoke-virtual {p1, v8, v9}, Lnb/h6;->b(J)V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object p1, v0, Lnb/k6;->h:Lnb/j6;

    invoke-virtual {p1, v4}, Lnb/j6;->b(Ljava/lang/String;)V

    :cond_17
    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v7, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_18
    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k6;->w()Lnb/q8;

    move-result-object p1

    sget-object v1, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {p1, v1}, Lnb/q8;->o(Lnb/p8;)Z

    move-result p1

    if-nez p1, :cond_19

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object p1, v0, Lnb/k6;->h:Lnb/j6;

    invoke-virtual {p1, v4}, Lnb/j6;->b(Ljava/lang/String;)V

    :cond_19
    invoke-static {v2}, Lnb/g7;->t(Lnb/b5;)V

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object p1, v0, Lnb/k6;->h:Lnb/j6;

    invoke-virtual {p1}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lnb/qa;->E(Ljava/lang/String;)V

    iget-object p1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    :try_start_0
    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    iget-object p1, p1, Lnb/g7;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v0, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    iget-object p1, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    iget-object v0, p1, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v0}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1a

    iget-object v1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {v1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Remote config removed with active feature rollouts"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0, v4}, Lnb/j6;->b(Ljava/lang/String;)V

    :cond_1a
    :goto_5
    invoke-virtual {p0}, Lnb/g7;->L()Lnb/k5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1d

    invoke-virtual {p0}, Lnb/g7;->g()Z

    move-result p1

    iget-object v0, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {v0}, Lnb/k6;->z()Z

    move-result v1

    if-nez v1, :cond_1b

    iget-object v1, p0, Lnb/g7;->d:Lnb/k;

    invoke-virtual {v1}, Lnb/k;->L()Z

    move-result v1

    if-nez v1, :cond_1b

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lnb/k6;->y(Z)V

    :cond_1b
    if-eqz p1, :cond_1c

    iget-object p1, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {p1}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {p1}, Lnb/qa;->H()V

    :cond_1c
    iget-object p1, p0, Lnb/g7;->h:Lnb/ld;

    invoke-static {p1}, Lnb/g7;->t(Lnb/b5;)V

    iget-object p1, p1, Lnb/ld;->e:Lnb/kd;

    invoke-virtual {p1}, Lnb/kd;->a()V

    invoke-virtual {p0}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, v1}, Lnb/tc;->q(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p0}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    iget-object v0, v0, Lnb/k6;->z:Lnb/g6;

    invoke-virtual {v0}, Lnb/g6;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnb/tc;->v(Landroid/os/Bundle;)V

    :cond_1d
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    iget-object p1, p0, Lnb/g7;->d:Lnb/k;

    sget-object v0, Lnb/z4;->R0:Lnb/y4;

    invoke-virtual {p1, v4, v0}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result p1

    if-eqz p1, :cond_1f

    iget-object p1, p0, Lnb/g7;->i:Lnb/ve;

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    invoke-virtual {p1}, Lnb/ve;->G()Z

    move-result p1

    if-eqz p1, :cond_1f

    sget-object p1, Lnb/z4;->y0:Lnb/y4;

    invoke-virtual {p1, v4}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v0, p1

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x1388

    invoke-virtual {p1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    int-to-long v2, p1

    iget-object p1, p0, Lnb/g7;->k:Lu9/e;

    add-long/2addr v0, v2

    invoke-interface {p1}, Lu9/e;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1e

    iget-object p1, p0, Lnb/g7;->f:Lnb/w5;

    invoke-static {p1}, Lnb/g7;->u(Lnb/k8;)V

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v2, "Waiting to fetch trigger URIs until some time after boot. Delay in millis"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1e
    iget-object p1, p0, Lnb/g7;->m:Lnb/qa;

    invoke-static {p1}, Lnb/g7;->t(Lnb/b5;)V

    invoke-virtual {p1, v0, v1}, Lnb/qa;->s0(J)V

    :cond_1f
    iget-object p1, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {p1}, Lnb/g7;->s(Lnb/j8;)V

    iget-object p1, p1, Lnb/k6;->p:Lnb/f6;

    invoke-virtual {p1, v6}, Lnb/f6;->b(Z)V

    return-void
.end method

.method public final w()Lnb/k;
    .locals 1

    iget-object v0, p0, Lnb/g7;->d:Lnb/k;

    return-object v0
.end method

.method public final x()Lnb/k6;
    .locals 1

    iget-object v0, p0, Lnb/g7;->e:Lnb/k6;

    invoke-static {v0}, Lnb/g7;->s(Lnb/j8;)V

    return-object v0
.end method

.method public final y()Lnb/w5;
    .locals 2

    iget-object v0, p0, Lnb/g7;->f:Lnb/w5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnb/k8;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final z()Lnb/ld;
    .locals 1

    iget-object v0, p0, Lnb/g7;->h:Lnb/ld;

    invoke-static {v0}, Lnb/g7;->t(Lnb/b5;)V

    return-object v0
.end method
