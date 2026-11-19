.class public final Lob/n8;
.super Lob/h5;
.source "SourceFile"


# instance fields
.field public final a:Lob/ve;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lob/ve;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lob/h5;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/n8;->a:Lob/ve;

    const/4 p1, 0x0

    iput-object p1, p0, Lob/n8;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final A2(Lob/i0;Lob/hf;)V
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    invoke-virtual {v0, p1, p2}, Lob/ve;->k(Lob/i0;Lob/hf;)V

    return-void
.end method

.method public final B2(Lob/hf;Z)V
    .locals 1

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lob/n8;->C2(Ljava/lang/String;Z)V

    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->N0()Lob/ff;

    move-result-object p2

    iget-object p1, p1, Lob/hf;->g:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lob/ff;->o(Ljava/lang/String;)Z

    return-void
.end method

.method public final C2(Ljava/lang/String;Z)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_3

    :try_start_0
    iget-object p2, p0, Lob/n8;->b:Ljava/lang/Boolean;

    if-nez p2, :cond_2

    const-string p2, "com.google.android.gms"

    iget-object v0, p0, Lob/n8;->c:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {v1, v2}, Lv9/p;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p2}, Lob/ve;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lk9/k;->a(Landroid/content/Context;)Lk9/k;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {p2, v1}, Lk9/k;->c(I)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lob/n8;->b:Ljava/lang/Boolean;

    :cond_2
    iget-object p2, p0, Lob/n8;->b:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    :cond_3
    iget-object p2, p0, Lob/n8;->c:Ljava/lang/String;

    if-nez p2, :cond_4

    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {p2, v0, p1}, Lk9/j;->j(Landroid/content/Context;ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iput-object p1, p0, Lob/n8;->c:Ljava/lang/String;

    :cond_4
    iget-object p2, p0, Lob/n8;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    const-string v0, "Unknown calling package name \'%s\'."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Measurement Service called with invalid calling package. appId"

    invoke-virtual {v0, v1, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p2

    :cond_7
    iget-object p1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p1}, Lob/ve;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->o()Lob/z5;

    move-result-object p1

    const-string p2, "Measurement Service called without app package"

    invoke-virtual {p1, p2}, Lob/z5;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/SecurityException;

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final D2(Lob/i0;Lob/hf;)V
    .locals 6

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->D0()Lob/c7;

    move-result-object v1

    iget-object v2, p2, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lob/c7;->j:Lw1/i;

    invoke-virtual {v1, v2}, Lw1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/d1;

    :goto_0
    if-eqz v1, :cond_5

    :try_start_0
    invoke-virtual {v0}, Lob/ve;->K0()Lob/af;

    move-result-object v0

    iget-object v2, p1, Lob/i0;->g:Lob/g0;

    invoke-virtual {v2}, Lob/g0;->D3()Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lob/af;->Z(Landroid/os/Bundle;Z)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p1, Lob/i0;->f:Ljava/lang/String;

    invoke-static {v2}, Lob/w8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v2, v3

    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/measurement/b;

    iget-wide v4, p1, Lob/i0;->i:J

    invoke-direct {v3, v2, v4, v5, v0}, Lcom/google/android/gms/internal/measurement/b;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d1;->b(Lcom/google/android/gms/internal/measurement/b;)Z

    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/d2; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d1;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    iget-object p1, p1, Lob/i0;->f:Ljava/lang/String;

    const-string v3, "EES edited event"

    invoke-virtual {v2, v3, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lob/ve;->K0()Lob/af;

    move-result-object p1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d1;->e()Lcom/google/android/gms/internal/measurement/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c;->c()Lcom/google/android/gms/internal/measurement/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lob/af;->m(Lcom/google/android/gms/internal/measurement/b;)Lob/i0;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lob/n8;->A2(Lob/i0;Lob/hf;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lob/n8;->A2(Lob/i0;Lob/hf;)V

    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d1;->d()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d1;->e()Lcom/google/android/gms/internal/measurement/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    iget-object v1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "EES logging created event"

    invoke-virtual {v2, v4, v3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lob/ve;->K0()Lob/af;

    move-result-object v1

    invoke-virtual {v1, v0}, Lob/af;->m(Lcom/google/android/gms/internal/measurement/b;)Lob/i0;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lob/n8;->A2(Lob/i0;Lob/hf;)V

    goto :goto_2

    :cond_4
    return-void

    :catch_0
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    iget-object v1, p2, Lob/hf;->g:Ljava/lang/String;

    iget-object v2, p1, Lob/i0;->f:Ljava/lang/String;

    const-string v3, "EES error. appId, eventName"

    invoke-virtual {v0, v3, v1, v2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    iget-object v1, p1, Lob/i0;->f:Ljava/lang/String;

    const-string v2, "EES was not applied to event"

    invoke-virtual {v0, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lob/n8;->A2(Lob/i0;Lob/hf;)V

    return-void

    :cond_5
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    iget-object v1, p2, Lob/hf;->f:Ljava/lang/String;

    const-string v2, "EES not loaded for"

    invoke-virtual {v0, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lob/n8;->A2(Lob/i0;Lob/hf;)V

    return-void
.end method

.method public final E2(Lob/i0;Lob/hf;)Lob/i0;
    .locals 6

    const-string p2, "_cmp"

    iget-object v0, p1, Lob/i0;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object v2, p1, Lob/i0;->g:Lob/g0;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lob/g0;->zze()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "_cis"

    invoke-virtual {v2, p2}, Lob/g0;->C3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "referrer broadcast"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "referrer API"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->u()Lob/z5;

    move-result-object p2

    invoke-virtual {p1}, Lob/i0;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Event has been filtered "

    invoke-virtual {p2, v1, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lob/i0;

    iget-object v3, p1, Lob/i0;->h:Ljava/lang/String;

    iget-wide v4, p1, Lob/i0;->i:J

    const-string v1, "_cmpx"

    invoke-direct/range {v0 .. v5}, Lob/i0;-><init>(Ljava/lang/String;Lob/g0;Ljava/lang/String;J)V

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final F1(Lob/i;Lob/hf;)V
    .locals 1

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lob/i;->h:Lob/bf;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/i;

    invoke-direct {v0, p1}, Lob/i;-><init>(Lob/i;)V

    iget-object p1, p2, Lob/hf;->f:Ljava/lang/String;

    iput-object p1, v0, Lob/i;->f:Ljava/lang/String;

    new-instance p1, Lob/q7;

    invoke-direct {p1, p0, v0, p2}, Lob/q7;-><init>(Lob/n8;Lob/i;Lob/hf;)V

    invoke-virtual {p0, p1}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final F2(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/h7;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G(Lob/bf;Lob/hf;)V
    .locals 1

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/d8;

    invoke-direct {v0, p0, p1, p2}, Lob/d8;-><init>(Lob/n8;Lob/bf;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final H(Lob/hf;Landroid/os/Bundle;Lob/l5;)V
    .locals 7

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/h8;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lob/h8;-><init>(Lob/n8;Lob/hf;Landroid/os/Bundle;Lob/l5;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final H0(Lob/hf;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/w7;

    invoke-direct {v0, p0, p1}, Lob/w7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final I0(Lob/hf;)V
    .locals 1

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lob/hf;->x:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lob/g8;

    invoke-direct {v0, p0, p1}, Lob/g8;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lob/n8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/v7;

    invoke-direct {v1, p0, p1, p2, p3}, Lob/v7;-><init>(Lob/n8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties as"

    invoke-virtual {p2, p3, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final L1(Landroid/os/Bundle;Lob/hf;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p2, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lob/l8;

    invoke-direct {v1, p0, p1, v0, p2}, Lob/l8;-><init>(Lob/n8;Landroid/os/Bundle;Ljava/lang/String;Lob/hf;)V

    invoke-virtual {p0, v1}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final O(Lob/hf;)V
    .locals 1

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lob/hf;->x:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lob/y7;

    invoke-direct {v0, p0, p1}, Lob/y7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final R(Lob/hf;Landroid/os/Bundle;)Ljava/util/List;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->B0()Lob/m;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Lob/e5;->Z0:Lob/d5;

    invoke-virtual {v1, v2, v3}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v1

    const-string v2, "Failed to get trigger URIs. appId"

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/e8;

    invoke-direct {v1, p0, p1, p2}, Lob/e8;-><init>(Lob/n8;Lob/hf;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lob/h7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x2710

    invoke-interface {p2, v3, v4, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_0

    :catch_2
    move-exception p2

    :goto_0
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/f8;

    invoke-direct {v1, p0, p1, p2}, Lob/f8;-><init>(Lob/n8;Lob/hf;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_1
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3

    return-object p2

    :catch_3
    move-exception p2

    goto :goto_1

    :catch_4
    move-exception p2

    :goto_1
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final V1(Lob/i0;Ljava/lang/String;)[B
    .locals 9

    invoke-static {p2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lob/n8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->v()Lob/z5;

    move-result-object v1

    invoke-virtual {v0}, Lob/ve;->M0()Lob/u5;

    move-result-object v2

    iget-object v3, p1, Lob/i0;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Log and bundle. event"

    invoke-virtual {v1, v4, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v1

    invoke-interface {v1}, Lv9/e;->c()J

    move-result-wide v1

    const-wide/32 v4, 0xf4240

    div-long/2addr v1, v4

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v6

    new-instance v7, Lob/c8;

    invoke-direct {v7, p0, p1, p2}, Lob/c8;-><init>(Lob/n8;Lob/i0;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lob/h7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v6

    :try_start_0
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [B

    if-nez v6, :cond_0

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->o()Lob/z5;

    move-result-object v6

    const-string v7, "Log and bundle returned null. appId"

    invoke-static {p2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v6, 0x0

    new-array v6, v6, [B

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v7

    invoke-interface {v7}, Lv9/e;->c()J

    move-result-wide v7

    div-long/2addr v7, v4

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->v()Lob/z5;

    move-result-object v4

    const-string v5, "Log and bundle processed. event, size, time_ms"

    invoke-virtual {v0}, Lob/ve;->M0()Lob/u5;

    move-result-object v0

    invoke-virtual {v0, v3}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    array-length v3, v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-long/2addr v7, v1

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v5, v0, v3, v1}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :goto_1
    iget-object v1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    invoke-static {p2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1}, Lob/ve;->M0()Lob/u5;

    move-result-object v1

    iget-object p1, p1, Lob/i0;->f:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Failed to log and bundle. appId, event, error"

    invoke-virtual {v2, v1, p2, p1, v0}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final X0(Lob/i0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p3}, Lob/n8;->C2(Ljava/lang/String;Z)V

    new-instance p3, Lob/b8;

    invoke-direct {p3, p0, p1, p2}, Lob/b8;-><init>(Lob/n8;Lob/i0;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final Y(Lob/hf;)Lob/p;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/z7;

    invoke-direct {v1, p0, p1}, Lob/z7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {v0, v1}, Lob/h7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2710

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/p;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    iget-object v1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get consent. appId"

    invoke-virtual {v1, v2, p1, v0}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lob/p;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lob/p;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final Y0(Lob/hf;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0, p1}, Lob/ve;->p0(Lob/hf;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a0(Lob/i;)V
    .locals 2

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lob/i;->h:Lob/bf;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lob/i;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lob/i;->f:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lob/n8;->C2(Ljava/lang/String;Z)V

    new-instance v0, Lob/i;

    invoke-direct {v0, p1}, Lob/i;-><init>(Lob/i;)V

    new-instance p1, Lob/r7;

    invoke-direct {p1, p0, v0}, Lob/r7;-><init>(Lob/n8;Lob/i;)V

    invoke-virtual {p0, p1}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d0(Lob/hf;Lob/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/k8;

    invoke-direct {v0, p0, p1, p2}, Lob/k8;-><init>(Lob/n8;Lob/hf;Lob/g;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d1(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    new-instance v0, Lob/p7;

    move-object v1, p0

    move-wide v5, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v6}, Lob/p7;-><init>(Lob/n8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i0(Lob/hf;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/n7;

    invoke-direct {v0, p0, p1}, Lob/n7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l1(Ljava/lang/String;Ljava/lang/String;Lob/hf;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object p3, p3, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/u7;

    invoke-direct {v1, p0, p3, p1, p2}, Lob/u7;-><init>(Lob/n8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties"

    invoke-virtual {p2, p3, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lob/n8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/t7;

    invoke-direct {v1, p0, p1, p2, p3}, Lob/t7;-><init>(Lob/n8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/df;

    if-nez p4, :cond_1

    iget-object v1, v0, Lob/df;->c:Ljava/lang/String;

    invoke-static {v1}, Lob/ff;->N(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v1, Lob/bf;

    invoke-direct {v1, v0}, Lob/bf;-><init>(Lob/df;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p3

    :goto_2
    iget-object p3, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p3}, Lob/ve;->a()Lob/b6;

    move-result-object p3

    invoke-virtual {p3}, Lob/b6;->o()Lob/z5;

    move-result-object p3

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Failed to get user properties as. appId"

    invoke-virtual {p3, p4, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final p2(Lob/hf;Z)Ljava/util/List;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    new-instance v2, Lob/m7;

    invoke-direct {v2, p0, v0}, Lob/m7;-><init>(Lob/n8;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob/df;

    if-nez p2, :cond_1

    iget-object v3, v2, Lob/df;->c:Ljava/lang/String;

    invoke-static {v3}, Lob/ff;->N(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v3, Lob/bf;

    invoke-direct {v3, v2}, Lob/bf;-><init>(Lob/df;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :goto_2
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Failed to get user properties. appId"

    invoke-virtual {v0, v1, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(Lob/hf;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/o7;

    invoke-direct {v0, p0, p1}, Lob/o7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s2(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/h7;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lob/h7;->v(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t0(Lob/hf;)V
    .locals 1

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lob/hf;->x:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lob/m8;

    invoke-direct {v0, p0, p1}, Lob/m8;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic t2(Lob/hf;)V
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    invoke-virtual {v0, p1}, Lob/ve;->P0(Lob/hf;)V

    return-void
.end method

.method public final synthetic u2(Lob/hf;)V
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    invoke-virtual {v0, p1}, Lob/ve;->Q0(Lob/hf;)V

    return-void
.end method

.method public final v(Lob/hf;)V
    .locals 2

    iget-object v0, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lob/n8;->C2(Ljava/lang/String;Z)V

    new-instance v0, Lob/x7;

    invoke-direct {v0, p0, p1}, Lob/x7;-><init>(Lob/n8;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic v2(Lob/hf;Landroid/os/Bundle;Lob/l5;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    invoke-virtual {v0, p1, p2}, Lob/ve;->q0(Lob/hf;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p1

    :try_start_0
    invoke-interface {p3, p1}, Lob/l5;->D0(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    const-string p3, "Failed to return trigger URIs for app"

    invoke-virtual {p2, p3, p4, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic w2(Ljava/lang/String;Lob/ce;Lob/o5;)V
    .locals 10

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/ve;->O0()V

    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v1

    sget-object v2, Lob/e5;->B:Lob/d5;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, p1, p2, v2}, Lob/w;->o(Ljava/lang/String;Lob/ce;I)Ljava/util/List;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob/ye;

    invoke-virtual {v2}, Lob/ye;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, p1, v4}, Lob/ve;->t(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->w()Lob/z5;

    move-result-object v4

    invoke-virtual {v2}, Lob/ye;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lob/ye;->e()Ljava/lang/String;

    move-result-object v2

    const-string v6, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    invoke-virtual {v4, v6, p1, v5, v2}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lob/ye;->i()I

    move-result v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    sget-object v5, Lob/e5;->z:Lob/d5;

    invoke-virtual {v5, v3}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v4, v5, :cond_2

    goto/16 :goto_3

    :cond_2
    sget-object v5, Lob/e5;->x:Lob/d5;

    invoke-virtual {v5, v3}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-int/lit8 v4, v4, -0x1

    const-wide/16 v7, 0x1

    shl-long/2addr v7, v4

    mul-long/2addr v5, v7

    sget-object v4, Lob/e5;->y:Lob/d5;

    invoke-virtual {v4, v3}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v6

    invoke-interface {v6}, Lv9/e;->a()J

    move-result-wide v6

    invoke-virtual {v2}, Lob/ye;->h()J

    move-result-wide v8

    add-long/2addr v8, v4

    cmp-long v4, v6, v8

    if-ltz v4, :cond_5

    :goto_1
    invoke-virtual {v2}, Lob/ye;->b()Lob/ae;

    move-result-object v2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c7;->M()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v4

    iget-object v5, v2, Lob/ae;->g:[B

    invoke-static {v4, v5}, Lob/af;->W(Lcom/google/android/gms/internal/measurement/rc;[B)Lcom/google/android/gms/internal/measurement/rc;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/z6;

    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->B()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/z6;->C(I)Lcom/google/android/gms/internal/measurement/e7;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/kb;->q()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v7

    invoke-interface {v7}, Lv9/e;->a()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->r1(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/z6;->D(ILcom/google/android/gms/internal/measurement/d7;)Lcom/google/android/gms/internal/measurement/z6;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/c7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/v9;->d()[B

    move-result-object v5

    iput-object v5, v2, Lob/ae;->g:[B

    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v5

    invoke-virtual {v5}, Lob/b6;->z()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lob/ve;->K0()Lob/af;

    move-result-object v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/c7;

    invoke-virtual {v5, v4}, Lob/af;->K(Lcom/google/android/gms/internal/measurement/c7;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lob/ae;->l:Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/wb; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :catch_0
    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->r()Lob/z5;

    move-result-object v2

    const-string v4, "Failed to parse queued batch. appId"

    invoke-virtual {v2, v4, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lob/ve;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->w()Lob/z5;

    move-result-object v4

    invoke-virtual {v2}, Lob/ye;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lob/ye;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    invoke-virtual {v4, v6, p1, v5, v2}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_6
    new-instance p2, Lob/ee;

    invoke-direct {p2, v1}, Lob/ee;-><init>(Ljava/util/List;)V

    :try_start_1
    invoke-interface {p3, p2}, Lob/o5;->H1(Lob/ee;)V

    iget-object p3, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p3}, Lob/ve;->a()Lob/b6;

    move-result-object p3

    invoke-virtual {p3}, Lob/b6;->w()Lob/z5;

    move-result-object p3

    const-string v0, "[sgtm] Sending queued upload batches to client. appId, count"

    iget-object p2, p2, Lob/ee;->f:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, v0, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p2

    iget-object p3, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p3}, Lob/ve;->a()Lob/b6;

    move-result-object p3

    invoke-virtual {p3}, Lob/b6;->o()Lob/z5;

    move-result-object p3

    const-string v0, "[sgtm] Failed to return upload batches for app"

    invoke-virtual {p3, v0, p1, p2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final x1(Ljava/lang/String;Ljava/lang/String;ZLob/hf;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object v0, p4, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    new-instance v2, Lob/s7;

    invoke-direct {v2, p0, v0, p1, p2}, Lob/s7;-><init>(Lob/n8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lob/h7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/df;

    if-nez p3, :cond_1

    iget-object v1, v0, Lob/df;->c:Ljava/lang/String;

    invoke-static {v1}, Lob/ff;->N(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v1, Lob/bf;

    invoke-direct {v1, v0}, Lob/bf;-><init>(Lob/df;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p2

    :goto_2
    iget-object p2, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {p2}, Lob/ve;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    iget-object p3, p4, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p3}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Failed to query user properties. appId"

    invoke-virtual {p2, p4, p3, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final synthetic x2(Lob/hf;Lob/g;)V
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->E()V

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lob/ve;->r0(Ljava/lang/String;Lob/g;)V

    return-void
.end method

.method public final y(Lob/hf;Lob/ce;Lob/o5;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/n8;->B2(Lob/hf;Z)V

    iget-object p1, p1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/i8;

    invoke-direct {v1, p0, p1, p2, p3}, Lob/i8;-><init>(Lob/n8;Ljava/lang/String;Lob/ce;Lob/o5;)V

    invoke-virtual {v0, v1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final y1(Lob/i0;Lob/hf;)V
    .locals 1

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lob/n8;->B2(Lob/hf;Z)V

    new-instance v0, Lob/a8;

    invoke-direct {v0, p0, p1, p2}, Lob/a8;-><init>(Lob/n8;Lob/i0;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/n8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic y2(Landroid/os/Bundle;Ljava/lang/String;Lob/hf;)V
    .locals 13

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->B0()Lob/m;

    move-result-object v1

    sget-object v2, Lob/e5;->W0:Lob/d5;

    const/4 v11, 0x0

    invoke-virtual {v1, v11, v2}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v1

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v1}, Lob/ge;->j()V

    :try_start_0
    invoke-virtual {v1}, Lob/w;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v2, "delete from default_event_params where app_id=?"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Error clearing default event params"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v12

    invoke-virtual {v12}, Lob/o8;->h()V

    invoke-virtual {v12}, Lob/ge;->j()V

    iget-object v2, v12, Lob/o8;->a:Lob/l7;

    new-instance v1, Lob/d0;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-string v3, ""

    const-string v5, "dep"

    move-object v10, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v10}, Lob/d0;-><init>(Lob/l7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object v0, v12, Lob/zd;->b:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->K0()Lob/af;

    move-result-object v0

    invoke-virtual {v0, v1}, Lob/af;->J(Lob/d0;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v9;->d()[B

    move-result-object v0

    iget-object v1, v12, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    array-length v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "Saving default event parameters, appId, data size"

    invoke-virtual {v2, v5, p2, v3}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "parameters"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_1
    invoke-virtual {v12}, Lob/w;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v3, "default_event_params"

    const/4 v5, 0x5

    invoke-virtual {v0, v3, v11, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v5, -0x1

    cmp-long v0, v2, v5

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Failed to insert default event parameters (got -1). appId"

    invoke-static {p2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, v12, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    invoke-static {p2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error storing default event parameters. appId"

    invoke-virtual {v1, v3, v2, v0}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v1

    move-object/from16 v2, p3

    iget-wide v2, v2, Lob/hf;->I:J

    invoke-virtual {v1, p2, v2, v3}, Lob/w;->H(Ljava/lang/String;J)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p2, v1, v11, p1}, Lob/w;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public final synthetic z2()Lob/ve;
    .locals 1

    iget-object v0, p0, Lob/n8;->a:Lob/ve;

    return-object v0
.end method
