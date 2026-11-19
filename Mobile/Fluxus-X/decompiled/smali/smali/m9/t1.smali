.class public abstract Lm9/t1;
.super Lm9/i;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public volatile b:Z

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:Landroid/os/Handler;

.field public final e:Lk9/e;


# direct methods
.method public constructor <init>(Lm9/j;Lk9/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lm9/i;-><init>(Lm9/j;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lcb/j;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Lcb/j;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lm9/t1;->d:Landroid/os/Handler;

    iput-object p2, p0, Lm9/t1;->e:Lk9/e;

    return-void
.end method

.method public static final p(Lm9/q1;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Lm9/q1;->a()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic q(Lm9/t1;Lk9/b;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm9/t1;->l(Lk9/b;I)V

    return-void
.end method

.method public static bridge synthetic r(Lm9/t1;)V
    .locals 0

    invoke-virtual {p0}, Lm9/t1;->o()V

    return-void
.end method


# virtual methods
.method public final e(IILandroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/q1;

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm9/t1;->e:Lk9/e;

    invoke-virtual {p0}, Lm9/i;->b()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk9/e;->g(Landroid/content/Context;)I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lm9/t1;->o()V

    return-void

    :cond_1
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lm9/q1;->b()Lk9/b;

    move-result-object p2

    invoke-virtual {p2}, Lk9/b;->B3()I

    move-result p2

    const/16 p3, 0x12

    if-ne p2, p3, :cond_5

    if-ne p1, p3, :cond_5

    goto :goto_1

    :cond_2
    const/4 p1, -0x1

    if-ne p2, p1, :cond_3

    invoke-virtual {p0}, Lm9/t1;->o()V

    return-void

    :cond_3
    if-nez p2, :cond_5

    if-eqz v0, :cond_6

    const/16 p1, 0xd

    if-eqz p3, :cond_4

    const-string p2, "<<ResolutionFailureErrorDetail>>"

    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    :cond_4
    new-instance p2, Lk9/b;

    invoke-virtual {v0}, Lm9/q1;->b()Lk9/b;

    move-result-object p3

    invoke-virtual {p3}, Lk9/b;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1, p3}, Lk9/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    invoke-static {v0}, Lm9/t1;->p(Lm9/q1;)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lm9/t1;->l(Lk9/b;I)V

    return-void

    :cond_5
    :goto_0
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lm9/q1;->b()Lk9/b;

    move-result-object p1

    invoke-virtual {v0}, Lm9/q1;->a()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lm9/t1;->l(Lk9/b;I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lm9/i;->f(Landroid/os/Bundle;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "resolving_error"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lk9/b;

    const-string v2, "failed_status"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "failed_resolution"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    invoke-direct {v1, v2, v3}, Lk9/b;-><init>(ILandroid/app/PendingIntent;)V

    const-string v2, "failed_client_id"

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    new-instance v2, Lm9/q1;

    invoke-direct {v2, v1, p1}, Lm9/q1;-><init>(Lk9/b;I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lm9/i;->i(Landroid/os/Bundle;)V

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/q1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "resolving_error"

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "failed_client_id"

    invoke-virtual {v0}, Lm9/q1;->a()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0}, Lm9/q1;->b()Lk9/b;

    move-result-object v1

    invoke-virtual {v1}, Lk9/b;->B3()I

    move-result v1

    const-string v2, "failed_status"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0}, Lm9/q1;->b()Lk9/b;

    move-result-object v0

    invoke-virtual {v0}, Lk9/b;->D3()Landroid/app/PendingIntent;

    move-result-object v0

    const-string v1, "failed_resolution"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public j()V
    .locals 1

    invoke-super {p0}, Lm9/i;->j()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm9/t1;->b:Z

    return-void
.end method

.method public k()V
    .locals 1

    invoke-super {p0}, Lm9/i;->k()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm9/t1;->b:Z

    return-void
.end method

.method public final l(Lk9/b;I)V
    .locals 2

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lm9/t1;->m(Lk9/b;I)V

    return-void
.end method

.method public abstract m(Lk9/b;I)V
.end method

.method public abstract n()V
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm9/t1;->n()V

    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    new-instance p1, Lk9/b;

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lk9/b;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/q1;

    invoke-static {v0}, Lm9/t1;->p(Lm9/q1;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lm9/t1;->l(Lk9/b;I)V

    return-void
.end method

.method public final s(Lk9/b;I)V
    .locals 1

    new-instance v0, Lm9/q1;

    invoke-direct {v0, p1, p2}, Lm9/q1;-><init>(Lk9/b;I)V

    :cond_0
    iget-object p1, p0, Lm9/t1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-static {p1, p2, v0}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lm9/t1;->d:Landroid/os/Handler;

    new-instance p2, Lm9/s1;

    invoke-direct {p2, p0, v0}, Lm9/s1;-><init>(Lm9/t1;Lm9/q1;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void
.end method
