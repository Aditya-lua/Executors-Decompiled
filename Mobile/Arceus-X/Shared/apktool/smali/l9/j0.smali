.class public final Ll9/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/f$a;
.implements Lk9/f$b;


# instance fields
.field public final a:Ljava/util/Queue;

.field public final b:Lk9/a$f;

.field public final c:Ll9/b;

.field public final d:Ll9/z;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/Map;

.field public final g:I

.field public final h:Ll9/f1;

.field public i:Z

.field public final o:Ljava/util/List;

.field public p:Lcom/google/android/gms/common/ConnectionResult;

.field public q:I

.field public final synthetic r:Ll9/f;


# direct methods
.method public constructor <init>(Ll9/f;Lk9/e;)V
    .locals 3

    iput-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll9/j0;->e:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll9/j0;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll9/j0;->o:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x0

    iput v1, p0, Ll9/j0;->q:I

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p2, v1, p0}, Lk9/e;->L(Landroid/os/Looper;Ll9/j0;)Lk9/a$f;

    move-result-object v1

    iput-object v1, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-virtual {p2}, Lk9/e;->u()Ll9/b;

    move-result-object v2

    iput-object v2, p0, Ll9/j0;->c:Ll9/b;

    new-instance v2, Ll9/z;

    invoke-direct {v2}, Ll9/z;-><init>()V

    iput-object v2, p0, Ll9/j0;->d:Ll9/z;

    invoke-virtual {p2}, Lk9/e;->K()I

    move-result v2

    iput v2, p0, Ll9/j0;->g:I

    invoke-interface {v1}, Lk9/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ll9/f;->n(Ll9/f;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lk9/e;->M(Landroid/content/Context;Landroid/os/Handler;)Ll9/f1;

    move-result-object p1

    iput-object p1, p0, Ll9/j0;->h:Ll9/f1;

    return-void

    :cond_0
    iput-object v0, p0, Ll9/j0;->h:Ll9/f1;

    return-void
.end method

.method public static bridge synthetic A(Ll9/j0;Ll9/l0;)V
    .locals 5

    iget-object v0, p0, Ll9/j0;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-static {p1}, Ll9/l0;->a(Ll9/l0;)Lcom/google/android/gms/common/Feature;

    move-result-object p1

    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll9/o1;

    instance-of v3, v2, Ll9/r0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ll9/r0;

    invoke-virtual {v3, p0}, Ll9/r0;->g(Ll9/j0;)[Lcom/google/android/gms/common/Feature;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, p1}, Lu9/b;->b([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll9/o1;

    iget-object v4, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    new-instance v4, Lk9/p;

    invoke-direct {v4, p1}, Lk9/p;-><init>(Lcom/google/android/gms/common/Feature;)V

    invoke-virtual {v3, v4}, Ll9/o1;->b(Ljava/lang/Exception;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static bridge synthetic L(Ll9/j0;)Z
    .locals 0

    iget-boolean p0, p0, Ll9/j0;->i:Z

    return p0
.end method

.method public static bridge synthetic M(Ll9/j0;Z)Z
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ll9/j0;->o(Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic s(Ll9/j0;)Lk9/a$f;
    .locals 0

    iget-object p0, p0, Ll9/j0;->b:Lk9/a$f;

    return-object p0
.end method

.method public static bridge synthetic u(Ll9/j0;)Ll9/b;
    .locals 0

    iget-object p0, p0, Ll9/j0;->c:Ll9/b;

    return-object p0
.end method

.method public static bridge synthetic w(Ll9/j0;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-virtual {p0, p1}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public static bridge synthetic x(Ll9/j0;)V
    .locals 0

    invoke-virtual {p0}, Ll9/j0;->h()V

    return-void
.end method

.method public static bridge synthetic y(Ll9/j0;I)V
    .locals 0

    invoke-virtual {p0, p1}, Ll9/j0;->i(I)V

    return-void
.end method

.method public static bridge synthetic z(Ll9/j0;Ll9/l0;)V
    .locals 1

    iget-object v0, p0, Ll9/j0;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ll9/j0;->i:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {p1}, Lk9/a$f;->isConnected()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ll9/j0;->C()V

    return-void

    :cond_1
    invoke-virtual {p0}, Ll9/j0;->g()V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final B()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method

.method public final C()V
    .locals 8

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnected()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v0, 0xa

    :try_start_0
    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->w(Ll9/f;)Ln9/d0;

    move-result-object v2

    invoke-static {v1}, Ll9/f;->n(Ll9/f;)Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-virtual {v2, v1, v3}, Ln9/d0;->b(Landroid/content/Context;Lk9/a$f;)I

    move-result v1

    if-eqz v1, :cond_1

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    const-string v1, "GoogleApiManager"

    iget-object v4, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "The service for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " is not available: "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2, v3}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    iget-object v2, p0, Ll9/j0;->b:Lk9/a$f;

    iget-object v3, p0, Ll9/j0;->c:Ll9/b;

    new-instance v4, Ll9/n0;

    invoke-direct {v4, v1, v2, v3}, Ll9/n0;-><init>(Ll9/f;Lk9/a$f;Ll9/b;)V

    invoke-interface {v2}, Lk9/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll9/j0;->h:Ll9/f1;

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/f1;

    invoke-virtual {v1, v4}, Ll9/f1;->u2(Ll9/e1;)V

    :cond_2
    :try_start_1
    iget-object v1, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v1, v4}, Lk9/a$f;->connect(Ln9/c$c;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v1

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, v2, v1}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :goto_0
    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, v2, v1}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final D(Ll9/o1;)V
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ll9/j0;->m(Ll9/o1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll9/j0;->j()V

    return-void

    :cond_0
    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->z3()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Ll9/j0;->C()V

    return-void
.end method

.method public final E()V
    .locals 1

    iget v0, p0, Ll9/j0;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll9/j0;->q:I

    return-void
.end method

.method public final F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V
    .locals 5
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->h:Ll9/f1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll9/f1;->v2()V

    :cond_0
    invoke-virtual {p0}, Ll9/j0;->B()V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->w(Ll9/f;)Ln9/d0;

    move-result-object v0

    invoke-virtual {v0}, Ln9/d0;->c()V

    invoke-virtual {p0, p1}, Ll9/j0;->d(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    instance-of v0, v0, Lp9/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v0

    const/16 v2, 0x18

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0, v1}, Ll9/f;->D(Ll9/f;Z)V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v3, 0x13

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    const-wide/32 v3, 0x493e0

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    invoke-static {}, Ll9/f;->q()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    return-void

    :cond_3
    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->d(Landroid/os/Handler;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p2, p1}, Ll9/j0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void

    :cond_4
    iget-object p2, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p2}, Ll9/f;->d(Ll9/f;)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {p2, p1}, Ll9/f;->r(Ll9/b;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v1}, Ll9/j0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    iget-object p2, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Ll9/j0;->n(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Ll9/j0;->r:Ll9/f;

    iget v0, p0, Ll9/j0;->g:I

    invoke-virtual {p2, p1, v0}, Ll9/f;->f(Lcom/google/android/gms/common/ConnectionResult;I)Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result p2

    const/16 v0, 0x12

    if-ne p2, v0, :cond_6

    iput-boolean v1, p0, Ll9/j0;->i:Z

    :cond_6
    iget-boolean p2, p0, Ll9/j0;->i:Z

    if-eqz p2, :cond_7

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    iget-object p2, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    const/16 v1, 0x9

    invoke-static {p1, v1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_7
    iget-object p2, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {p2, p1}, Ll9/f;->r(Ll9/b;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    :cond_8
    :goto_0
    return-void

    :cond_9
    iget-object p2, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {p2, p1}, Ll9/f;->r(Ll9/b;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final G(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 5
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onSignInFailed for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method

.method public final H(Ll9/p1;)V
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Ll9/j0;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll9/j0;->C()V

    :cond_0
    return-void
.end method

.method public final J()V
    .locals 6

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    sget-object v0, Ll9/f;->u:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Ll9/j0;->d:Ll9/z;

    invoke-virtual {v0}, Ll9/z;->f()V

    iget-object v0, p0, Ll9/j0;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ll9/k$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll9/k$a;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    new-instance v4, Ll9/n1;

    new-instance v5, Lsb/k;

    invoke-direct {v5}, Lsb/k;-><init>()V

    invoke-direct {v4, v3, v5}, Ll9/n1;-><init>(Ll9/k$a;Lsb/k;)V

    invoke-virtual {p0, v4}, Ll9/j0;->D(Ll9/o1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, v0}, Ll9/j0;->d(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    new-instance v1, Ll9/i0;

    invoke-direct {v1, p0}, Ll9/i0;-><init>(Ll9/j0;)V

    invoke-interface {v0, v1}, Lk9/a$f;->onUserSignOut(Ln9/c$e;)V

    :cond_1
    return-void
.end method

.method public final K()V
    .locals 3

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Ll9/j0;->i:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll9/j0;->l()V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->p(Ll9/f;)Lj9/c;

    move-result-object v1

    invoke-static {v0}, Ll9/f;->n(Ll9/f;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj9/c;->g(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x15

    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x16

    const-string v2, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Ll9/j0;->e(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    const-string v1, "Timing out connection while resuming."

    invoke-interface {v0, v1}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final N()Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnected()Z

    move-result v0

    return v0
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->requiresSignIn()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ll9/j0;->o(Z)Z

    move-result v0

    return v0
.end method

.method public final c([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/Feature;
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v1}, Lk9/a$f;->getAvailableFeatures()[Lcom/google/android/gms/common/Feature;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-array v1, v2, [Lcom/google/android/gms/common/Feature;

    :cond_1
    new-instance v3, Lw1/a;

    array-length v4, v1

    invoke-direct {v3, v4}, Lw1/a;-><init>(I)V

    move v4, v2

    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_2

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lcom/google/android/gms/common/Feature;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/common/Feature;->w3()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v4, p1, v2

    invoke-virtual {v4}, Lcom/google/android/gms/common/Feature;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4}, Lcom/google/android/gms/common/Feature;->w3()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-gez v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v4

    :cond_5
    :goto_3
    return-object v0
.end method

.method public final d(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    iget-object v0, p0, Ll9/j0;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/p1;

    sget-object v2, Lcom/google/android/gms/common/ConnectionResult;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {p1, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v2}, Lk9/a$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Ll9/j0;->c:Ll9/b;

    invoke-virtual {v1, v3, p1, v2}, Ll9/p1;->c(Ll9/b;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll9/j0;->e:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final e(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Ll9/j0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 4

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p2, :cond_1

    move v0, v1

    :cond_1
    if-eq v2, v0, :cond_6

    iget-object v0, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/o1;

    if-eqz p3, :cond_3

    iget v2, v1, Ll9/o1;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Ll9/o1;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1, p2}, Ll9/o1;->b(Ljava/lang/Exception;)V

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Status XOR exception should be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll9/o1;

    iget-object v4, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v4}, Lk9/a$f;->isConnected()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v3}, Ll9/j0;->m(Ll9/o1;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Ll9/j0;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final h()V
    .locals 4

    invoke-virtual {p0}, Ll9/j0;->B()V

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->k:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0, v0}, Ll9/j0;->d(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {p0}, Ll9/j0;->l()V

    iget-object v0, p0, Ll9/j0;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/w0;

    iget-object v2, v1, Ll9/w0;->a:Ll9/o;

    invoke-virtual {v2}, Ll9/o;->c()[Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll9/j0;->c([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/Feature;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v1, Ll9/w0;->a:Ll9/o;

    iget-object v2, p0, Ll9/j0;->b:Lk9/a$f;

    new-instance v3, Lsb/k;

    invoke-direct {v3}, Lsb/k;-><init>()V

    invoke-virtual {v1, v2, v3}, Ll9/o;->d(Lk9/a$b;Lsb/k;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_1
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Ll9/j0;->onConnectionSuspended(I)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    const-string v1, "DeadObjectException thrown while calling register listener method."

    invoke-interface {v0, v1}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Ll9/j0;->g()V

    invoke-virtual {p0}, Ll9/j0;->j()V

    return-void
.end method

.method public final i(I)V
    .locals 4

    invoke-virtual {p0}, Ll9/j0;->B()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll9/j0;->i:Z

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->getLastDisconnectMessage()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll9/j0;->d:Ll9/z;

    invoke-virtual {v1, p1, v0}, Ll9/z;->e(ILjava/lang/String;)V

    iget-object p1, p0, Ll9/j0;->c:Ll9/b;

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x9

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v2, 0x1388

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Ll9/j0;->c:Ll9/b;

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0xb

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->w(Ll9/f;)Ln9/d0;

    move-result-object p1

    invoke-virtual {p1}, Ln9/d0;->c()V

    iget-object p1, p0, Ll9/j0;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/w0;

    iget-object v0, v0, Ll9/w0;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, Ll9/j0;->c:Ll9/b;

    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Ll9/j0;->c:Ll9/b;

    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v3

    invoke-static {v1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->m(Ll9/f;)J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final k(Ll9/o1;)V
    .locals 2

    iget-object v0, p0, Ll9/j0;->d:Ll9/z;

    invoke-virtual {p0}, Ll9/j0;->a()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll9/o1;->d(Ll9/z;Z)V

    :try_start_0
    invoke-virtual {p1, p0}, Ll9/o1;->c(Ll9/j0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ll9/j0;->onConnectionSuspended(I)V

    iget-object p1, p0, Ll9/j0;->b:Lk9/a$f;

    const-string v0, "DeadObjectException thrown while running ApiCallRunner."

    invoke-interface {p1, v0}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method

.method public final l()V
    .locals 3

    iget-boolean v0, p0, Ll9/j0;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    iget-object v1, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    iget-object v1, p0, Ll9/j0;->c:Ll9/b;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll9/j0;->i:Z

    :cond_0
    return-void
.end method

.method public final m(Ll9/o1;)Z
    .locals 7

    instance-of v0, p1, Ll9/r0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ll9/j0;->k(Ll9/o1;)V

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Ll9/r0;

    invoke-virtual {v0, p0}, Ll9/r0;->g(Ll9/j0;)[Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll9/j0;->c([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/Feature;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p0, p1}, Ll9/j0;->k(Ll9/o1;)V

    return v1

    :cond_1
    iget-object p1, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Lcom/google/android/gms/common/Feature;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/common/Feature;->w3()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " could not execute call because it requires feature ("

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "GoogleApiManager"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->d(Ll9/f;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, p0}, Ll9/r0;->f(Ll9/j0;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll9/j0;->c:Ll9/b;

    new-instance v0, Ll9/l0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v2, v1}, Ll9/l0;-><init>(Ll9/b;Lcom/google/android/gms/common/Feature;Ll9/k0;)V

    iget-object p1, p0, Ll9/j0;->o:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const-wide/16 v2, 0x1388

    const/16 v4, 0xf

    if-ltz p1, :cond_2

    iget-object v0, p0, Ll9/j0;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/l0;

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v4, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll9/j0;->o:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v5

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-static {p1, v4, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v5, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    const/16 v3, 0x10

    invoke-static {p1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/32 v3, 0x1d4c0

    invoke-virtual {v2, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v0, 0x2

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1}, Ll9/j0;->n(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    iget v1, p0, Ll9/j0;->g:I

    invoke-virtual {v0, p1, v1}, Ll9/f;->f(Lcom/google/android/gms/common/ConnectionResult;I)Z

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    new-instance p1, Lk9/p;

    invoke-direct {p1, v2}, Lk9/p;-><init>(Lcom/google/android/gms/common/Feature;)V

    invoke-virtual {v0, p1}, Ll9/o1;->b(Ljava/lang/Exception;)V

    return v1
.end method

.method public final n(Lcom/google/android/gms/common/ConnectionResult;)Z
    .locals 3
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Ll9/f;->A()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->s(Ll9/f;)Ll9/a0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ll9/f;->C(Ll9/f;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Ll9/j0;->c:Ll9/b;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v1}, Ll9/f;->s(Ll9/f;)Ll9/a0;

    move-result-object v1

    iget v2, p0, Ll9/j0;->g:I

    invoke-virtual {v1, p1, v2}, Ll9/t1;->s(Lcom/google/android/gms/common/ConnectionResult;I)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final o(Z)Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    invoke-interface {v0}, Lk9/a$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll9/j0;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll9/j0;->d:Ll9/z;

    invoke-virtual {v0}, Ll9/z;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll9/j0;->j()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll9/j0;->b:Lk9/a$f;

    const-string v0, "Timing out service connection."

    invoke-interface {p1, v0}, Lk9/a$f;->disconnect(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onConnected(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Ll9/j0;->h()V

    return-void

    :cond_0
    iget-object p1, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {p1}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Ll9/f0;

    invoke-direct {v0, p0}, Ll9/f0;-><init>(Ll9/j0;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll9/j0;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 2

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne v1, v0, :cond_0

    invoke-virtual {p0, p1}, Ll9/j0;->i(I)V

    return-void

    :cond_0
    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll9/g0;

    invoke-direct {v1, p0, p1}, Ll9/g0;-><init>(Ll9/j0;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Ll9/j0;->g:I

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Ll9/j0;->q:I

    return v0
.end method

.method public final r()Lcom/google/android/gms/common/ConnectionResult;
    .locals 1

    iget-object v0, p0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Ll9/j0;->p:Lcom/google/android/gms/common/ConnectionResult;

    return-object v0
.end method

.method public final t()Lk9/a$f;
    .locals 1

    iget-object v0, p0, Ll9/j0;->b:Lk9/a$f;

    return-object v0
.end method

.method public final v()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ll9/j0;->f:Ljava/util/Map;

    return-object v0
.end method
