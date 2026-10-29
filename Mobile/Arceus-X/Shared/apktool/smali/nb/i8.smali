.class public final Lnb/i8;
.super Lnb/c5;
.source "SourceFile"


# instance fields
.field public final a:Lnb/me;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnb/me;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lnb/c5;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/i8;->a:Lnb/me;

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/i8;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final A0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0, p1}, Lnb/me;->p0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    invoke-virtual {v0, p1, p2}, Lnb/me;->k(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method

.method public final B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V
    .locals 1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->N0()Lnb/ve;

    move-result-object p2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lnb/ve;->o(Ljava/lang/String;)Z

    return-void
.end method

.method public final C1(Lcom/google/android/gms/measurement/internal/zzr;)Lcom/google/android/gms/measurement/internal/zzao;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/u7;

    invoke-direct {v1, p0, p1}, Lnb/u7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0, v1}, Lnb/c7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2710

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/zzao;
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
    iget-object v1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get consent. appId"

    invoke-virtual {v1, v2, p1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzao;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final C2(Ljava/lang/String;Z)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p2, :cond_3

    :try_start_0
    iget-object p2, p0, Lnb/i8;->b:Ljava/lang/Boolean;

    if-nez p2, :cond_2

    const-string p2, "com.google.android.gms"

    iget-object v0, p0, Lnb/i8;->c:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {v1, v2}, Lu9/p;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p2}, Lnb/me;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lj9/i;->a(Landroid/content/Context;)Lj9/i;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {p2, v1}, Lj9/i;->c(I)Z

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

    iput-object p2, p0, Lnb/i8;->b:Ljava/lang/Boolean;

    :cond_2
    iget-object p2, p0, Lnb/i8;->b:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    :cond_3
    iget-object p2, p0, Lnb/i8;->c:Ljava/lang/String;

    if-nez p2, :cond_4

    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->d()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {p2, v0, p1}, Lj9/h;->j(Landroid/content/Context;ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iput-object p1, p0, Lnb/i8;->c:Ljava/lang/String;

    :cond_4
    iget-object p2, p0, Lnb/i8;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Measurement Service called with invalid calling package. appId"

    invoke-virtual {v0, v1, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p2

    :cond_7
    iget-object p1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p1}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Measurement Service called without app package"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/SecurityException;

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final D2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 6

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lnb/x6;->j:Lw1/i;

    invoke-virtual {v1, v2}, Lw1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/d1;

    :goto_0
    if-eqz v1, :cond_5

    :try_start_0
    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzbe;->y3()Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lnb/re;->Z(Landroid/os/Bundle;Z)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-static {v2}, Lnb/r8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v2, v3

    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/measurement/b;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

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

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v3, "EES edited event"

    invoke-virtual {v2, v3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object p1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d1;->e()Lcom/google/android/gms/internal/measurement/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c;->c()Lcom/google/android/gms/internal/measurement/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnb/re;->m(Lcom/google/android/gms/internal/measurement/b;)Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnb/i8;->A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lnb/i8;->A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

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

    iget-object v1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/b;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "EES logging created event"

    invoke-virtual {v2, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnb/re;->m(Lcom/google/android/gms/internal/measurement/b;)Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lnb/i8;->A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_2

    :cond_4
    return-void

    :catch_0
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v3, "EES error. appId, eventName"

    invoke-virtual {v0, v3, v1, v2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v2, "EES was not applied to event"

    invoke-virtual {v0, v2, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lnb/i8;->A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_5
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    const-string v2, "EES not loaded for"

    invoke-virtual {v0, v2, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lnb/i8;->A2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method

.method public final E1(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnb/g8;

    invoke-direct {v1, p0, p1, v0, p2}, Lnb/g8;-><init>(Lnb/i8;Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v1}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E2(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)Lcom/google/android/gms/measurement/internal/zzbg;
    .locals 6

    const-string p2, "_cmp"

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzbe;->zze()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "_cis"

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzbe;->x3(Ljava/lang/String;)Ljava/lang/String;

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
    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->u()Lnb/u5;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzbg;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Event has been filtered "

    invoke-virtual {p2, v1, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    const-string v1, "_cmpx"

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final F2(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G0(Lcom/google/android/gms/measurement/internal/zzr;Z)Ljava/util/List;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    new-instance v2, Lnb/h7;

    invoke-direct {v2, p0, v0}, Lnb/h7;-><init>(Lnb/i8;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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

    check-cast v2, Lnb/te;

    if-nez p2, :cond_1

    iget-object v3, v2, Lnb/te;->c:Ljava/lang/String;

    invoke-static {v3}, Lnb/ve;->N(Ljava/lang/String;)Z

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
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-direct {v3, v2}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Lnb/te;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :goto_2
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Failed to get user properties. appId"

    invoke-virtual {v0, v1, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final H(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/d8;

    invoke-direct {v1, p0, p1, p2, p3}, Lnb/d8;-><init>(Lnb/i8;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/q7;

    invoke-direct {v1, p0, p1, p2, p3}, Lnb/q7;-><init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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
    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties as"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final K1(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/i7;

    invoke-direct {v0, p0, p1}, Lnb/i7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final P(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/h8;

    invoke-direct {v0, p0, p1}, Lnb/h8;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final Q0(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p3}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    new-instance p3, Lnb/w7;

    invoke-direct {p3, p0, p1, p2}, Lnb/w7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final S(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)Ljava/util/List;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Lnb/z4;->Z0:Lnb/y4;

    invoke-virtual {v1, v2, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    const-string v2, "Failed to get trigger URIs. appId"

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/z7;

    invoke-direct {v1, p0, p1, p2}, Lnb/z7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lnb/c7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/a8;

    invoke-direct {v1, p0, p1, p2}, Lnb/a8;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final S1(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/j7;

    invoke-direct {v0, p0, p1}, Lnb/j7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final V(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/v7;

    invoke-direct {v0, p0, p1, p2}, Lnb/v7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final V0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    new-instance v0, Lnb/k7;

    move-object v1, p0

    move-wide v5, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v6}, Lnb/k7;-><init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final W(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/r7;

    invoke-direct {v0, p0, p1}, Lnb/r7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final W0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    new-instance v0, Lnb/s7;

    invoke-direct {v0, p0, p1}, Lnb/s7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final Y1(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p4, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    new-instance v2, Lnb/n7;

    invoke-direct {v2, p0, v0, p1, p2}, Lnb/n7;-><init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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

    check-cast v0, Lnb/te;

    if-nez p3, :cond_1

    iget-object v1, v0, Lnb/te;->c:Ljava/lang/String;

    invoke-static {v1}, Lnb/ve;->N(Ljava/lang/String;)Z

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
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Lnb/te;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p2

    :goto_2
    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    iget-object p3, p4, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Failed to query user properties. appId"

    invoke-virtual {p2, p4, p3, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final c0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/b8;

    invoke-direct {v0, p0, p1}, Lnb/b8;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e0(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)[B
    .locals 9

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    invoke-virtual {v0}, Lnb/me;->M0()Lnb/p5;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Log and bundle. event"

    invoke-virtual {v1, v4, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->nanoTime()J

    move-result-wide v1

    const-wide/32 v4, 0xf4240

    div-long/2addr v1, v4

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v6

    new-instance v7, Lnb/x7;

    invoke-direct {v7, p0, p1, p2}, Lnb/x7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lnb/c7;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v6

    :try_start_0
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [B

    if-nez v6, :cond_0

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->o()Lnb/u5;

    move-result-object v6

    const-string v7, "Log and bundle returned null. appId"

    invoke-static {p2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

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
    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v7

    invoke-interface {v7}, Lu9/e;->nanoTime()J

    move-result-wide v7

    div-long/2addr v7, v4

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->v()Lnb/u5;

    move-result-object v4

    const-string v5, "Log and bundle processed. event, size, time_ms"

    invoke-virtual {v0}, Lnb/me;->M0()Lnb/p5;

    move-result-object v0

    invoke-virtual {v0, v3}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    array-length v3, v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-long/2addr v7, v1

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v5, v0, v3, v1}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :goto_1
    iget-object v1, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    invoke-static {p2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1}, Lnb/me;->M0()Lnb/p5;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Failed to log and bundle. appId, event, error"

    invoke-virtual {v2, v1, p2, p1, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final e2(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/p7;

    invoke-direct {v1, p0, p3, p1, p2}, Lnb/p7;-><init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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
    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final f0(Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 2

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzah;)V

    new-instance p1, Lnb/m7;

    invoke-direct {p1, p0, v0}, Lnb/m7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzah;)V

    invoke-virtual {p0, p1}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g1(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;)V
    .locals 7

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/c8;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lnb/c8;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/y7;

    invoke-direct {v0, p0, p1, p2}, Lnb/y7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lnb/i8;->C2(Ljava/lang/String;Z)V

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/o7;

    invoke-direct {v1, p0, p1, p2, p3}, Lnb/o7;-><init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

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

    check-cast v0, Lnb/te;

    if-nez p4, :cond_1

    iget-object v1, v0, Lnb/te;->c:Ljava/lang/String;

    invoke-static {v1}, Lnb/ve;->N(Ljava/lang/String;)Z

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
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Lnb/te;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p3

    :goto_2
    iget-object p3, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p3}, Lnb/me;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->o()Lnb/u5;

    move-result-object p3

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Failed to get user properties as. appId"

    invoke-virtual {p3, p4, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final p2(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/t7;

    invoke-direct {v0, p0, p1}, Lnb/t7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/i8;->s2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzah;)V

    iget-object p1, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    new-instance p1, Lnb/l7;

    invoke-direct {p1, p0, v0, p2}, Lnb/l7;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, p1}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s2(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/c7;->v(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic t2(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    invoke-virtual {v0, p1}, Lnb/me;->P0(Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method

.method public final u1(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnb/i8;->B2(Lcom/google/android/gms/measurement/internal/zzr;Z)V

    new-instance v0, Lnb/f8;

    invoke-direct {v0, p0, p1, p2}, Lnb/f8;-><init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    invoke-virtual {p0, v0}, Lnb/i8;->F2(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic u2(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    invoke-virtual {v0, p1}, Lnb/me;->Q0(Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method

.method public final synthetic v2(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    invoke-virtual {v0, p1, p2}, Lnb/me;->q0(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p1

    :try_start_0
    invoke-interface {p3, p1}, Lnb/g5;->x0(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p2}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string p3, "Failed to return trigger URIs for app"

    invoke-virtual {p2, p3, p4, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic w2(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V
    .locals 10

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/me;->O0()V

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    sget-object v2, Lnb/z4;->B:Lnb/y4;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, p1, p2, v2}, Lnb/t;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;I)Ljava/util/List;

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

    check-cast v2, Lnb/pe;

    invoke-virtual {v2}, Lnb/pe;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, p1, v4}, Lnb/me;->t(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    invoke-virtual {v2}, Lnb/pe;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lnb/pe;->e()Ljava/lang/String;

    move-result-object v2

    const-string v6, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    invoke-virtual {v4, v6, p1, v5, v2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lnb/pe;->i()I

    move-result v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    sget-object v5, Lnb/z4;->z:Lnb/y4;

    invoke-virtual {v5, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v4, v5, :cond_2

    goto/16 :goto_3

    :cond_2
    sget-object v5, Lnb/z4;->x:Lnb/y4;

    invoke-virtual {v5, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-int/lit8 v4, v4, -0x1

    const-wide/16 v7, 0x1

    shl-long/2addr v7, v4

    mul-long/2addr v5, v7

    sget-object v4, Lnb/z4;->y:Lnb/y4;

    invoke-virtual {v4, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v6

    invoke-virtual {v2}, Lnb/pe;->h()J

    move-result-wide v8

    add-long/2addr v8, v4

    cmp-long v4, v6, v8

    if-ltz v4, :cond_5

    :goto_1
    invoke-virtual {v2}, Lnb/pe;->b()Lcom/google/android/gms/measurement/internal/zzom;

    move-result-object v2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/y6;->O()Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v4

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzom;->g:[B

    invoke-static {v4, v5}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/v6;

    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/v6;->z()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/v6;->A(I)Lcom/google/android/gms/internal/measurement/a7;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v7

    invoke-interface {v7}, Lu9/e;->a()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->n1(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/v6;->C(ILcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v5

    iput-object v5, v2, Lcom/google/android/gms/measurement/internal/zzom;->g:[B

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v5, v4}, Lnb/re;->K(Lcom/google/android/gms/internal/measurement/y6;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/google/android/gms/measurement/internal/zzom;->l:Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/sb; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :catch_0
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v4, "Failed to parse queued batch. appId"

    invoke-virtual {v2, v4, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    invoke-virtual {v2}, Lnb/pe;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lnb/pe;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    invoke-virtual {v4, v6, p1, v5, v2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_6
    new-instance p2, Lcom/google/android/gms/measurement/internal/zzoq;

    invoke-direct {p2, v1}, Lcom/google/android/gms/measurement/internal/zzoq;-><init>(Ljava/util/List;)V

    :try_start_1
    invoke-interface {p3, p2}, Lnb/j5;->M1(Lcom/google/android/gms/measurement/internal/zzoq;)V

    iget-object p3, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p3}, Lnb/me;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->w()Lnb/u5;

    move-result-object p3

    const-string v0, "[sgtm] Sending queued upload batches to client. appId, count"

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzoq;->f:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, v0, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p2

    iget-object p3, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {p3}, Lnb/me;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->o()Lnb/u5;

    move-result-object p3

    const-string v0, "[sgtm] Failed to return upload batches for app"

    invoke-virtual {p3, v0, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic x2(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->E()V

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lnb/me;->r0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzaf;)V

    return-void
.end method

.method public final synthetic y2(Landroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 13

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->W0:Lnb/y4;

    const/4 v11, 0x0

    invoke-virtual {v1, v11, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/xd;->j()V

    :try_start_0
    invoke-virtual {v1}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

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

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Error clearing default event params"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v12

    invoke-virtual {v12}, Lnb/j8;->h()V

    invoke-virtual {v12}, Lnb/xd;->j()V

    iget-object v2, v12, Lnb/j8;->a:Lnb/g7;

    new-instance v1, Lnb/a0;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-string v3, ""

    const-string v5, "dep"

    move-object v10, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v10}, Lnb/a0;-><init>(Lnb/g7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object v0, v12, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnb/re;->J(Lnb/a0;)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v0

    iget-object v1, v12, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    array-length v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "Saving default event parameters, appId, data size"

    invoke-virtual {v2, v5, p2, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "parameters"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_1
    invoke-virtual {v12}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v3, "default_event_params"

    const/4 v5, 0x5

    invoke-virtual {v0, v3, v11, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v5, -0x1

    cmp-long v0, v2, v5

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Failed to insert default event parameters (got -1). appId"

    invoke-static {p2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, v12, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-static {p2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error storing default event parameters. appId"

    invoke-virtual {v1, v3, v2, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    move-object/from16 v2, p3

    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->I:J

    invoke-virtual {v1, p2, v2, v3}, Lnb/t;->H(Ljava/lang/String;J)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p2, v1, v11, p1}, Lnb/t;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public final synthetic z2()Lnb/me;
    .locals 1

    iget-object v0, p0, Lnb/i8;->a:Lnb/me;

    return-object v0
.end method
