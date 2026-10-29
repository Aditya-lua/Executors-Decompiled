.class public final Lnb/qa;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public c:Lnb/da;

.field public d:Lnb/u8;

.field public final e:Ljava/util/Set;

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:Ljava/lang/Object;

.field public i:Z

.field public j:I

.field public k:Lnb/w;

.field public l:Lnb/w;

.field public m:Ljava/util/PriorityQueue;

.field public n:Z

.field public o:Lnb/q8;

.field public final p:Ljava/util/concurrent/atomic/AtomicLong;

.field public q:J

.field public final r:Lnb/cf;

.field public s:Z

.field public t:Lnb/w;

.field public u:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

.field public v:Lnb/w;

.field public final w:Lnb/ue;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 3

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lnb/qa;->e:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnb/qa;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnb/qa;->i:Z

    const/4 v0, 0x1

    iput v0, p0, Lnb/qa;->j:I

    iput-boolean v0, p0, Lnb/qa;->s:Z

    new-instance v0, Lnb/s9;

    invoke-direct {v0, p0}, Lnb/s9;-><init>(Lnb/qa;)V

    iput-object v0, p0, Lnb/qa;->w:Lnb/ue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lnb/qa;->g:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lnb/q8;->c:Lnb/q8;

    iput-object v0, p0, Lnb/qa;->o:Lnb/q8;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnb/qa;->q:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lnb/qa;->p:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Lnb/cf;

    invoke-direct {v0, p1}, Lnb/cf;-><init>(Lnb/g7;)V

    iput-object v0, p0, Lnb/qa;->r:Lnb/cf;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/j9;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v6, p3

    move-object v5, p5

    invoke-direct/range {v1 .. v7}, Lnb/j9;-><init>(Lnb/qa;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 9

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const-string v0, "allow_personalized_ads"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    instance-of v0, p3, Ljava/lang/String;

    const-string v1, "_npa"

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    const-string v0, "false"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-wide/16 v2, 0x1

    if-eq p3, p2, :cond_0

    const-wide/16 p2, 0x0

    goto :goto_0

    :cond_0
    move-wide p2, v2

    :goto_0
    iget-object v4, p0, Lnb/j8;->a:Lnb/g7;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v4}, Lnb/g7;->x()Lnb/k6;

    move-result-object p2

    iget-object p2, p2, Lnb/k6;->n:Lnb/j6;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v2, v4, v2

    if-nez v2, :cond_1

    const-string v0, "true"

    :cond_1
    invoke-virtual {p2, v0}, Lnb/j6;->b(Ljava/lang/String;)V

    :goto_1
    move-object p2, v1

    goto :goto_2

    :cond_2
    if-nez p3, :cond_3

    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->x()Lnb/k6;

    move-result-object p2

    iget-object p2, p2, Lnb/k6;->n:Lnb/j6;

    const-string v0, "unset"

    invoke-virtual {p2, v0}, Lnb/j6;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_2
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Setting user property(FE)"

    const-string v2, "non_personalized_ads(_npa)"

    invoke-virtual {v0, v1, v2, p3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    move-object v4, p2

    move-object v7, p3

    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->g()Z

    move-result p3

    if-nez p3, :cond_5

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string p2, "User property not set since app measurement is disabled"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-virtual {p2}, Lnb/g7;->m()Z

    move-result p2

    if-nez p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzpl;

    move-object v8, p1

    move-wide v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/tc;->o(Lcom/google/android/gms/measurement/internal/zzpl;)V

    return-void
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 9

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Cannot get user properties from analytics worker thread"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-static {}, Lnb/f;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Cannot get user properties from main thread"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    :cond_1
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v8

    new-instance v1, Lnb/q9;

    const/4 v4, 0x0

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move-object v3, v2

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lnb/q9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v2, v3

    const-wide/16 v3, 0x1388

    const-string v5, "get user properties"

    move-object v6, v1

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string p3, "Timed out waiting for handle get user properties, includeInternal"

    invoke-virtual {p1, p3, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p1

    :cond_2
    new-instance p2, Lw1/a;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    invoke-direct {p2, p3}, Lw1/a;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object p2
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/qa;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final E(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnb/qa;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final F()V
    .locals 6

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->u:Lnb/f6;

    invoke-virtual {v1}, Lnb/f6;->a()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->v:Lnb/h6;

    invoke-virtual {v1}, Lnb/h6;->a()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->v:Lnb/h6;

    const-wide/16 v4, 0x1

    add-long/2addr v4, v1

    invoke-virtual {v3, v4, v5}, Lnb/h6;->b(J)V

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    const-wide/16 v3, 0x5

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    iget-object v0, v0, Lnb/k6;->u:Lnb/f6;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnb/f6;->b(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lnb/qa;->t:Lnb/w;

    if-nez v0, :cond_1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v1, Lnb/l9;

    invoke-direct {v1, p0, v0}, Lnb/l9;-><init>(Lnb/qa;Lnb/l8;)V

    iput-object v1, p0, Lnb/qa;->t:Lnb/w;

    :cond_1
    iget-object v0, p0, Lnb/qa;->t:Lnb/w;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lnb/w;->b(J)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final G(J)V
    .locals 2

    iget-object v0, p0, Lnb/qa;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/m9;

    invoke-direct {v1, p0, p1, p2}, Lnb/m9;-><init>(Lnb/qa;J)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final H()V
    .locals 6

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->m()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->c()Lnb/f;

    const-string v2, "google_analytics_deferred_deep_link_enabled"

    invoke-virtual {v1, v2}, Lnb/k;->J(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Deferred Deep Link feature enabled."

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    new-instance v2, Lnb/na;

    invoke-direct {v2, p0}, Lnb/na;-><init>(Lnb/qa;)V

    invoke-virtual {v1, v2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    :cond_1
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/tc;->s()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lnb/qa;->s:Z

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "previous_os_version"

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->K()Lnb/z;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k8;->l()V

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lnb/g7;->K()Lnb/z;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k8;->l()V

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_po"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "auto"

    const-string v2, "_ou"

    invoke-virtual {p0, v1, v2, v0}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final I(Lnb/u8;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lnb/qa;->d:Lnb/u8;

    if-eq p1, v0, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "EventInterceptor already set."

    invoke-static {v0, v1}, Ln9/m;->q(ZLjava/lang/Object;)V

    :cond_1
    iput-object p1, p0, Lnb/qa;->d:Lnb/u8;

    return-void
.end method

.method public final J(Lnb/v8;)V
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/qa;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->r()Lnb/u5;

    move-result-object p1

    const-string v0, "OnEventListener already registered"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final K(Lnb/v8;)V
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/qa;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->r()Lnb/u5;

    move-result-object p1

    const-string v0, "OnEventListener had not been registered"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final L(Ljava/lang/String;)I
    .locals 0

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->w()Lnb/k;

    const/16 p1, 0x19

    return p1
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lnb/qa;->N(Landroid/os/Bundle;J)V

    return-void
.end method

.method public final N(Landroid/os/Bundle;J)V
    .locals 11

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    const-string p1, "app_id"

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Package name should be null when calling setConditionalUserProperty"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin"

    invoke-static {v0, p1, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "name"

    invoke-static {v0, v3, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v4, Ljava/lang/Object;

    const-string v5, "value"

    invoke-static {v0, v5, v4, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "trigger_event_name"

    invoke-static {v0, v4, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v6, 0x0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "trigger_timeout"

    const-class v8, Ljava/lang/Long;

    invoke-static {v0, v7, v8, v6}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "timed_out_event_name"

    invoke-static {v0, v9, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "timed_out_event_params"

    const-class v10, Landroid/os/Bundle;

    invoke-static {v0, v9, v10, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "triggered_event_name"

    invoke-static {v0, v9, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "triggered_event_params"

    invoke-static {v0, v9, v10, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "time_to_live"

    invoke-static {v0, v9, v8, v6}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "expired_event_name"

    invoke-static {v0, v6, v1, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "expired_event_params"

    invoke-static {v0, v1, v10, v2}, Lnb/m8;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "creation_timestamp"

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p3}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/ve;->y0(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p3}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lnb/ve;->y(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p3}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lnb/ve;->z(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-virtual {p3}, Lnb/g7;->D()Lnb/p5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Unable to normalize conditional user property value"

    invoke-virtual {v0, p3, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {v0, v1}, Lnb/m8;->a(Landroid/os/Bundle;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-wide/16 v3, 0x1

    const-wide v5, 0x39ef8b000L

    if-nez p2, :cond_3

    invoke-virtual {p3}, Lnb/g7;->w()Lnb/k;

    cmp-long p2, v1, v5

    if-gtz p2, :cond_2

    cmp-long p2, v1, v3

    if-gez p2, :cond_3

    :cond_2
    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    invoke-virtual {p3}, Lnb/g7;->D()Lnb/p5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string v0, "Invalid conditional user property timeout"

    invoke-virtual {p2, v0, p1, p3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p3}, Lnb/g7;->w()Lnb/k;

    cmp-long p2, v1, v5

    if-gtz p2, :cond_5

    cmp-long p2, v1, v3

    if-gez p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance p2, Lnb/n9;

    invoke-direct {p2, p0, v0}, Lnb/n9;-><init>(Lnb/qa;Landroid/os/Bundle;)V

    invoke-virtual {p1, p2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_5
    :goto_0
    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    invoke-virtual {p3}, Lnb/g7;->D()Lnb/p5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string v0, "Invalid conditional user property time to live"

    invoke-virtual {p2, v0, p1, p3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_6
    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-virtual {p3}, Lnb/g7;->D()Lnb/p5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Invalid conditional user property value"

    invoke-virtual {v0, p3, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_7
    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    invoke-virtual {p3}, Lnb/g7;->D()Lnb/p5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Invalid conditional user property name"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final O(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "name"

    invoke-virtual {v3, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "creation_timestamp"

    invoke-virtual {v3, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    if-eqz p2, :cond_0

    const-string p1, "expired_event_name"

    invoke-virtual {v3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "expired_event_params"

    invoke-virtual {v3, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance p2, Lnb/o9;

    invoke-direct {p2, p0, v3}, Lnb/o9;-><init>(Lnb/qa;Landroid/os/Bundle;)V

    invoke-virtual {p1, p2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final P(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from analytics worker thread"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-static {}, Lnb/f;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from main thread"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    :cond_1
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    new-instance v3, Lnb/p9;

    const/4 v6, 0x0

    move-object v7, p1

    move-object v8, p2

    move-object v5, v4

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lnb/p9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v5

    const-wide/16 v5, 0x1388

    const-string v7, "get conditional user properties"

    move-object v8, v3

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Timed out waiting for get conditional user properties"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_2
    invoke-static {p1}, Lnb/ve;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0}, Lnb/jb;->u()Lnb/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lnb/bb;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0}, Lnb/jb;->u()Lnb/bb;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lnb/bb;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final S()Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->H()Ljava/lang/String;

    move-result-object v1

    const-string v2, "google_app_id"

    invoke-static {v0, v2, v1}, Lnb/ab;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "getGoogleAppId failed with exception"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic T(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 5

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lnb/z4;->a1:Lnb/y4;

    invoke-virtual {v0, v1, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    const-wide/16 v1, 0x1f4

    const-string v3, "IABTCF_TCString change picked up in listener."

    const-string v4, "IABTCF_TCString"

    if-nez v0, :cond_0

    invoke-static {p2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lnb/qa;->v:Lnb/w;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/w;

    invoke-virtual {p1, v1, v2}, Lnb/w;->b(J)V

    return-void

    :cond_0
    invoke-static {p2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "IABTCF_gdprApplies"

    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "IABTCF_EnableAdvertiserConsentMode"

    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lnb/qa;->v:Lnb/w;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/w;

    invoke-virtual {p1, v1, v2}, Lnb/w;->b(J)V

    return-void
.end method

.method public final synthetic U(Landroid/os/Bundle;)V
    .locals 14

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p1

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v2, Landroid/os/Bundle;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->z:Lnb/g6;

    invoke-virtual {v3}, Lnb/g6;->a()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_3

    instance-of v7, v6, Ljava/lang/String;

    if-nez v7, :cond_3

    instance-of v7, v6, Ljava/lang/Long;

    if-nez v7, :cond_3

    instance-of v7, v6, Ljava/lang/Double;

    if-nez v7, :cond_3

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5, v6}, Lnb/ve;->B0(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v7

    iget-object v8, p0, Lnb/qa;->w:Lnb/ue;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1b

    const/4 v11, 0x0

    invoke-virtual/range {v7 .. v13}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->t()Lnb/u5;

    move-result-object v5

    const-string v7, "Invalid default event parameter type. Name, value"

    invoke-virtual {v5, v7, v4, v6}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {v4}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->t()Lnb/u5;

    move-result-object v5

    const-string v6, "Invalid default event parameter name. Name"

    invoke-virtual {v5, v6, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    if-nez v6, :cond_5

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v7

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v8

    invoke-virtual {v8, v1, v5}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v5

    const-string v8, "param"

    invoke-virtual {v7, v8, v4, v5, v6}, Lnb/ve;->C0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5, v2, v4, v6}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k;->v()I

    move-result v3

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v4

    if-gt v4, v3, :cond_7

    goto :goto_2

    :cond_7
    new-instance v4, Ljava/util/TreeSet;

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    add-int/lit8 v5, v5, 0x1

    if-le v5, v3, :cond_8

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v7

    iget-object v8, p0, Lnb/qa;->w:Lnb/ue;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1a

    const/4 v11, 0x0

    invoke-virtual/range {v7 .. v13}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->t()Lnb/u5;

    move-result-object v0

    const-string v3, "Too many default event parameters set. Discarding beyond event parameter limit"

    invoke-virtual {v0, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->z:Lnb/g6;

    invoke-virtual {v3, v2}, Lnb/g6;->b(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object p1

    sget-object v0, Lnb/z4;->X0:Lnb/y4;

    invoke-virtual {p1, v1, v0}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_3

    :cond_a
    return-void

    :cond_b
    :goto_3
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1, v2}, Lnb/tc;->v(Landroid/os/Bundle;)V

    return-void
.end method

.method public final synthetic V(I)V
    .locals 5

    iget-object v0, p0, Lnb/qa;->k:Lnb/w;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v1, Lnb/c9;

    invoke-direct {v1, p0, v0}, Lnb/c9;-><init>(Lnb/qa;Lnb/l8;)V

    iput-object v1, p0, Lnb/qa;->k:Lnb/w;

    :cond_0
    iget-object v0, p0, Lnb/qa;->k:Lnb/w;

    int-to-long v1, p1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lnb/w;->b(J)V

    return-void
.end method

.method public final synthetic W(Ljava/lang/Boolean;Z)V
    .locals 0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lnb/qa;->f0(Ljava/lang/Boolean;Z)V

    return-void
.end method

.method public final synthetic X(Lnb/q8;JZZ)V
    .locals 6

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k6;->w()Lnb/q8;

    move-result-object v1

    iget-wide v2, p0, Lnb/qa;->q:J

    cmp-long v2, p2, v2

    if-gtz v2, :cond_1

    invoke-virtual {v1}, Lnb/q8;->b()I

    move-result v1

    invoke-virtual {p1}, Lnb/q8;->b()I

    move-result v2

    invoke-static {v1, v2}, Lnb/q8;->u(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->u()Lnb/u5;

    move-result-object p2

    const-string p3, "Dropped out-of-date consent setting, proposed settings"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {p1}, Lnb/q8;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lnb/k6;->v(I)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-virtual {p1}, Lnb/q8;->l()Ljava/lang/String;

    move-result-object v4

    const-string v5, "consent_settings"

    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v4, "consent_source"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Setting storage consent(FE)"

    invoke-virtual {v0, v1, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iput-wide p2, p0, Lnb/qa;->q:J

    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1}, Lnb/tc;->D()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1, p4}, Lnb/tc;->Z(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1, p4}, Lnb/tc;->Y(Z)V

    :goto_1
    if-eqz p5, :cond_3

    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, p2}, Lnb/tc;->q(Ljava/util/concurrent/atomic/AtomicReference;)V

    :cond_3
    return-void

    :cond_4
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->u()Lnb/u5;

    move-result-object p2

    invoke-virtual {p1}, Lnb/q8;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p3, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic Y()V
    .locals 0

    invoke-virtual {p0}, Lnb/qa;->g0()V

    return-void
.end method

.method public final synthetic Z(Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb/qa;->i:Z

    return-void
.end method

.method public final synthetic a0()I
    .locals 1

    iget v0, p0, Lnb/qa;->j:I

    return v0
.end method

.method public final synthetic b0(I)V
    .locals 0

    iput p1, p0, Lnb/qa;->j:I

    return-void
.end method

.method public final synthetic c0()Lnb/w;
    .locals 1

    iget-object v0, p0, Lnb/qa;->t:Lnb/w;

    return-object v0
.end method

.method public final synthetic d0(Ljava/lang/Throwable;)I
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lnb/qa;->n:Z

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p1, Ljava/lang/IllegalStateException;

    if-nez v2, :cond_4

    const-string v2, "garbage collected"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ServiceUnavailableException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Ljava/lang/SecurityException;

    if-eqz p1, :cond_3

    const-string p1, "READ_DEVICE_CONFIG"

    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x3

    return p1

    :cond_3
    return v1

    :cond_4
    :goto_0
    const-string p1, "Background"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_5

    return v0

    :cond_5
    iput-boolean v0, p0, Lnb/qa;->n:Z

    return v0
.end method

.method public final e0(Lcom/google/android/gms/measurement/internal/zzom;)Lnb/ya;
    .locals 10

    :try_start_0
    new-instance v0, Ljava/net/URI;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzom;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v5
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k5;->s()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzom;->f:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzom;->h:Ljava/lang/String;

    iget-object v7, p1, Lcom/google/android/gms/measurement/internal/zzom;->g:[B

    array-length v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "[sgtm] Uploading data from app. row_id, url, uncompressed size"

    invoke-virtual {v2, v8, v3, v6, v7}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzom;->l:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzom;->l:Ljava/lang/String;

    const-string v7, "[sgtm] Uploading data from app. row_id"

    invoke-virtual {v2, v7, v3, v6}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzom;->i:Landroid/os/Bundle;

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lnb/g7;->F()Lnb/va;

    move-result-object v3

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzom;->g:[B

    new-instance v8, Lnb/ea;

    invoke-direct {v8, p0, v1, p1}, Lnb/ea;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzom;)V

    invoke-virtual {v3}, Lnb/k8;->l()V

    invoke-static {v5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance v2, Lnb/ua;

    invoke-direct/range {v2 .. v8}, Lnb/ua;-><init>(Lnb/va;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lnb/sa;)V

    invoke-virtual {p1, v2}, Lnb/c7;->w(Ljava/lang/Runnable;)V

    :try_start_1
    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object p1

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    invoke-virtual {v1, v4, v5}, Ljava/lang/Object;->wait(J)V

    invoke-virtual {p1}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v4

    sub-long v4, v2, v4

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_3
    monitor-exit v1

    goto :goto_3

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->r()Lnb/u5;

    move-result-object p1

    const-string v0, "[sgtm] Interrupted waiting for uploading batch"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p1, Lnb/ya;->b:Lnb/ya;

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/ya;

    :goto_4
    return-object p1

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    :goto_5
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzom;->h:Ljava/lang/String;

    iget-wide v3, p1, Lcom/google/android/gms/measurement/internal/zzom;->f:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v3, "[sgtm] Bad upload url for row_id"

    invoke-virtual {v1, v3, v2, p1, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Lnb/ya;->d:Lnb/ya;

    return-object p1
.end method

.method public final f0(Ljava/lang/Boolean;Z)V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Setting app measurement enabled (FE)"

    invoke-virtual {v1, v2, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/k6;->s(Ljava/lang/Boolean;)V

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object p2

    iget-object v0, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/j8;->h()V

    invoke-virtual {p2}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "measurement_enabled_from_api"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {p2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->j()Z

    move-result p2

    if-nez p2, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lnb/qa;->g0()V

    return-void
.end method

.method public final g0()V
    .locals 14

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->n:Lnb/j6;

    invoke-virtual {v1}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "unset"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v6

    const-string v4, "_npa"

    const/4 v5, 0x0

    const-string v3, "app"

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    goto :goto_1

    :cond_0
    const-string v2, "true"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x1

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v12

    const-string v9, "app"

    const-string v10, "_npa"

    move-object v8, p0

    invoke-virtual/range {v8 .. v13}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    move-object v2, v8

    goto :goto_1

    :cond_2
    move-object v2, p0

    :goto_1
    iget-object v1, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, v2, Lnb/qa;->s:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v3, "Recording app launch after enabling measurement for the first time (FE)"

    invoke-virtual {v1, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lnb/qa;->H()V

    iget-object v1, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v1, v1, Lnb/ld;->e:Lnb/kd;

    invoke-virtual {v1}, Lnb/kd;->a()V

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/e9;

    invoke-direct {v1, p0}, Lnb/e9;-><init>(Lnb/qa;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v1, "Updating Scion state (FE)"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    invoke-virtual {v0}, Lnb/tc;->X()V

    return-void
.end method

.method public final h0()V
    .locals 2

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnb/qa;->c:Lnb/da;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lnb/qa;->c:Lnb/da;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method public final i0()Ljava/lang/Boolean;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/k9;

    invoke-direct {v5, p0, v1}, Lnb/k9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "boolean test flag value"

    invoke-virtual/range {v0 .. v5}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public final j0()Ljava/lang/String;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/t9;

    invoke-direct {v5, p0, v1}, Lnb/t9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "String test flag value"

    invoke-virtual/range {v0 .. v5}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final k0()Ljava/lang/Long;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/u9;

    invoke-direct {v5, p0, v1}, Lnb/u9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "long test flag value"

    invoke-virtual/range {v0 .. v5}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    return-object v0
.end method

.method public final l0()Ljava/lang/Integer;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/v9;

    invoke-direct {v5, p0, v1}, Lnb/v9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "int test flag value"

    invoke-virtual/range {v0 .. v5}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m0()Ljava/lang/Double;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/w9;

    invoke-direct {v5, p0, v1}, Lnb/w9;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "double test flag value"

    invoke-virtual/range {v0 .. v5}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    return-object v0
.end method

.method public final n0(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/x9;

    invoke-direct {v1, p0, p1}, Lnb/x9;-><init>(Lnb/qa;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o(Lnb/q8;)V
    .locals 5

    invoke-virtual {p0}, Lnb/j8;->h()V

    sget-object v0, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {p1, v0}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    sget-object v0, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {p1, v0}, Lnb/q8;->o(Lnb/p8;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move p1, v2

    goto :goto_2

    :cond_1
    :goto_1
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->J()Lnb/tc;

    move-result-object p1

    invoke-virtual {p1}, Lnb/tc;->C()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_2
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->j()Z

    move-result v3

    if-eq p1, v3, :cond_5

    invoke-virtual {v0, p1}, Lnb/g7;->i(Z)V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    iget-object v3, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "measurement_enabled_from_api"

    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lnb/qa;->f0(Ljava/lang/Boolean;Z)V

    :cond_5
    return-void
.end method

.method public final o0(Landroid/os/Bundle;IJ)V
    .locals 8

    invoke-virtual {p0}, Lnb/b5;->j()V

    sget-object v0, Lnb/q8;->c:Lnb/q8;

    sget-object v0, Lnb/o8;->b:Lnb/o8;

    invoke-virtual {v0}, Lnb/o8;->b()[Lnb/p8;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_3

    aget-object v4, v0, v2

    iget-object v4, v4, Lnb/p8;->a:Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v5, "granted"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    const-string v5, "denied"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1
    :goto_1
    if-nez v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->t()Lnb/u5;

    move-result-object v1

    const-string v2, "Ignoring invalid consent setting"

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->t()Lnb/u5;

    move-result-object v0

    const-string v1, "Valid consent values are \'granted\', \'denied\'"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/c7;->p()Z

    move-result v0

    invoke-static {p1, p2}, Lnb/q8;->e(Landroid/os/Bundle;I)Lnb/q8;

    move-result-object v1

    invoke-virtual {v1}, Lnb/q8;->c()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v1, v0}, Lnb/qa;->q0(Lnb/q8;Z)V

    :cond_5
    invoke-static {p1, p2}, Lnb/x;->h(Landroid/os/Bundle;I)Lnb/x;

    move-result-object v1

    invoke-virtual {v1}, Lnb/x;->d()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v1, v0}, Lnb/qa;->p0(Lnb/x;Z)V

    :cond_6
    invoke-static {p1}, Lnb/x;->i(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_9

    const/16 v1, -0x1e

    if-ne p2, v1, :cond_7

    const-string p2, "tcf"

    :goto_3
    move-object v2, p2

    goto :goto_4

    :cond_7
    const-string p2, "app"

    goto :goto_3

    :goto_4
    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v3, "allow_personalized_ads"

    move-object v1, p0

    move-wide v5, p3

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void

    :cond_8
    move-wide v5, p3

    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v3, "allow_personalized_ads"

    move-wide v6, v5

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lnb/qa;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    :cond_9
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 9

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v7

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v8}, Lnb/qa;->q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public final p0(Lnb/x;Z)V
    .locals 1

    new-instance v0, Lnb/y9;

    invoke-direct {v0, p0, p1}, Lnb/y9;-><init>(Lnb/qa;Lnb/x;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_0
    move-object v5, p3

    const-string p3, "screen_view"

    invoke-static {p2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->I()Lnb/jb;

    move-result-object p1

    move-wide/from16 v3, p6

    invoke-virtual {p1, v5, v3, v4}, Lnb/jb;->s(Landroid/os/Bundle;J)V

    return-void

    :cond_1
    move-wide/from16 v3, p6

    const/4 p3, 0x1

    if-eqz p5, :cond_2

    iget-object v0, p0, Lnb/qa;->d:Lnb/u8;

    if-eqz v0, :cond_2

    invoke-static {p2}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_0
    move v7, p3

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    if-nez p1, :cond_4

    const-string p1, "app"

    :cond_4
    move-object v1, p1

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p2

    move v8, p4

    move v6, p5

    invoke-virtual/range {v0 .. v9}, Lnb/qa;->x(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final q0(Lnb/q8;Z)V
    .locals 9

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p1}, Lnb/q8;->b()I

    move-result v0

    const/16 v1, -0xa

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lnb/q8;->p()Lnb/n8;

    move-result-object v2

    sget-object v3, Lnb/n8;->b:Lnb/n8;

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Lnb/q8;->q()Lnb/n8;

    move-result-object v2

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "Ignoring empty consent settings"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    iget-object v2, p0, Lnb/qa;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lnb/qa;->o:Lnb/q8;

    invoke-virtual {v3}, Lnb/q8;->b()I

    move-result v3

    invoke-static {v0, v3}, Lnb/q8;->u(II)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    :try_start_1
    iget-object v3, p0, Lnb/qa;->o:Lnb/q8;

    invoke-virtual {p1, v3}, Lnb/q8;->r(Lnb/q8;)Z

    move-result v3

    sget-object v5, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {p1, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    iget-object v6, p0, Lnb/qa;->o:Lnb/q8;

    invoke-virtual {v6, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v5

    if-nez v5, :cond_2

    move v4, v7

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v4, p0

    goto/16 :goto_6

    :cond_2
    :goto_1
    iget-object v5, p0, Lnb/qa;->o:Lnb/q8;

    invoke-virtual {p1, v5}, Lnb/q8;->t(Lnb/q8;)Lnb/q8;

    move-result-object p1

    iput-object p1, p0, Lnb/qa;->o:Lnb/q8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v8, v4

    move v4, v7

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_3
    move v3, v4

    move v8, v3

    goto :goto_2

    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v4, :cond_4

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->u()Lnb/u5;

    move-result-object p1

    const-string p2, "Ignoring lower-priority consent settings, proposed settings"

    invoke-virtual {p1, p2, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Lnb/qa;->p:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v6

    if-eqz v3, :cond_6

    iget-object p1, p0, Lnb/qa;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance v3, Lnb/z9;

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lnb/z9;-><init>(Lnb/qa;Lnb/q8;JZ)V

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_5
    iget-object p1, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/c7;->v(Ljava/lang/Runnable;)V

    return-void

    :cond_6
    move-object v4, p0

    new-instance v3, Lnb/aa;

    invoke-direct/range {v3 .. v8}, Lnb/aa;-><init>(Lnb/qa;Lnb/q8;JZ)V

    if-eqz p2, :cond_7

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_7
    const/16 p1, 0x1e

    if-eq v0, p1, :cond_9

    if-ne v0, v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object p1, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_9
    :goto_4
    iget-object p1, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1, v3}, Lnb/c7;->v(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception v0

    move-object v4, p0

    :goto_5
    move-object p1, v0

    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :catchall_2
    move-exception v0

    goto :goto_5
.end method

.method public final r()V
    .locals 35

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v2

    const-string v3, "Handle tcf update."

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k6;->q()Landroid/content/SharedPreferences;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sget-object v4, Lnb/z4;->a1:Lnb/y4;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const-string v7, "IABTCF_VendorConsents"

    const-string v8, "IABTCF_PurposeConsents"

    const-string v10, "IABTCF_EnableAdvertiserConsentMode"

    const-string v11, "IABTCF_gdprApplies"

    const-string v12, "IABTCF_PolicyVersion"

    const-string v13, "IABTCF_CmpSdkID"

    const-string v14, ""

    const/16 v16, 0x0

    if-eqz v6, :cond_9

    sget-object v3, Lnb/od;->a:Lie/t;

    sget-object v3, Lcom/google/android/gms/internal/measurement/o9;->c:Lcom/google/android/gms/internal/measurement/o9;

    sget-object v6, Lnb/nd;->a:Lnb/nd;

    invoke-static {v3, v6}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    const/16 v17, 0x2

    sget-object v9, Lcom/google/android/gms/internal/measurement/o9;->d:Lcom/google/android/gms/internal/measurement/o9;

    const/16 v18, 0x1

    sget-object v15, Lnb/nd;->d:Lnb/nd;

    invoke-static {v9, v15}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v9

    sget-object v5, Lcom/google/android/gms/internal/measurement/o9;->e:Lcom/google/android/gms/internal/measurement/o9;

    invoke-static {v5, v6}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v5

    move-object/from16 v19, v1

    sget-object v1, Lcom/google/android/gms/internal/measurement/o9;->f:Lcom/google/android/gms/internal/measurement/o9;

    invoke-static {v1, v6}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    sget-object v6, Lcom/google/android/gms/internal/measurement/o9;->i:Lcom/google/android/gms/internal/measurement/o9;

    invoke-static {v6, v15}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v6

    move-object/from16 v20, v1

    sget-object v1, Lcom/google/android/gms/internal/measurement/o9;->k:Lcom/google/android/gms/internal/measurement/o9;

    invoke-static {v1, v15}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    move-object/from16 v21, v1

    sget-object v1, Lcom/google/android/gms/internal/measurement/o9;->l:Lcom/google/android/gms/internal/measurement/o9;

    invoke-static {v1, v15}, Lnb/pa;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    const/4 v15, 0x7

    new-array v15, v15, [Ljava/util/Map$Entry;

    aput-object v3, v15, v16

    aput-object v9, v15, v18

    aput-object v5, v15, v17

    const/4 v3, 0x3

    aput-object v20, v15, v3

    const/4 v3, 0x4

    aput-object v6, v15, v3

    const/4 v3, 0x5

    aput-object v21, v15, v3

    const/4 v5, 0x6

    aput-object v1, v15, v5

    invoke-static {v15}, Lie/u;->o([Ljava/util/Map$Entry;)Lie/u;

    move-result-object v20

    const-string v1, "CH"

    invoke-static {v1}, Lie/w;->u(Ljava/lang/Object;)Lie/w;

    move-result-object v22

    new-array v1, v3, [C

    const-string v3, "IABTCF_TCString"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v34

    invoke-static {v2, v13}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v24

    invoke-static {v2, v12}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v27

    invoke-static {v2, v11}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v26

    const-string v3, "IABTCF_PurposeOneTreatment"

    invoke-static {v2, v3}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v28

    invoke-static {v2, v10}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v25

    const-string v3, "IABTCF_PublisherCC"

    invoke-static {v2, v3}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    invoke-static {}, Lie/u;->a()Lie/u$a;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Lie/u;->i()Lie/w;

    move-result-object v5

    invoke-virtual {v5}, Lie/w;->g()Lie/y0;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/16 v9, 0x2f3

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/o9;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/o9;->zza()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    new-instance v12, Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1c

    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v11, "IABTCF_PublisherRestrictions"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v11, v9, :cond_0

    goto :goto_2

    :cond_0
    const/16 v9, 0x2f2

    invoke-virtual {v10, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v9, 0xa

    invoke-static {v10, v9}, Ljava/lang/Character;->digit(CI)I

    move-result v9

    if-ltz v9, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/p9;->values()[Lcom/google/android/gms/internal/measurement/p9;

    move-result-object v10

    array-length v10, v10

    if-le v9, v10, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v9, :cond_4

    move/from16 v10, v18

    if-eq v9, v10, :cond_3

    move/from16 v10, v17

    if-eq v9, v10, :cond_2

    sget-object v9, Lcom/google/android/gms/internal/measurement/p9;->e:Lcom/google/android/gms/internal/measurement/p9;

    goto :goto_3

    :cond_2
    sget-object v9, Lcom/google/android/gms/internal/measurement/p9;->d:Lcom/google/android/gms/internal/measurement/p9;

    goto :goto_3

    :cond_3
    sget-object v9, Lcom/google/android/gms/internal/measurement/p9;->c:Lcom/google/android/gms/internal/measurement/p9;

    goto :goto_3

    :cond_4
    :goto_1
    sget-object v9, Lcom/google/android/gms/internal/measurement/p9;->b:Lcom/google/android/gms/internal/measurement/p9;

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v9, Lcom/google/android/gms/internal/measurement/p9;->e:Lcom/google/android/gms/internal/measurement/p9;

    :goto_3
    invoke-virtual {v3, v6, v9}, Lie/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lie/u$a;

    const/16 v17, 0x2

    const/16 v18, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v3}, Lie/u$a;->c()Lie/u;

    move-result-object v21

    invoke-static {v2, v8}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v2, v7}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/16 v6, 0x31

    if-nez v5, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v5, v9, :cond_7

    const/16 v5, 0x2f2

    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v6, :cond_7

    const/16 v32, 0x1

    goto :goto_4

    :cond_7
    move/from16 v32, v16

    :goto_4
    const-string v3, "IABTCF_PurposeLegitimateInterests"

    invoke-static {v2, v3}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v3, "IABTCF_VendorLegitimateInterests"

    invoke-static {v2, v3}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v9, :cond_8

    const/16 v5, 0x2f2

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_8

    const/16 v33, 0x1

    goto :goto_5

    :cond_8
    move/from16 v33, v16

    :goto_5
    const/16 v2, 0x32

    aput-char v2, v1, v16

    new-instance v2, Lnb/md;

    move-object/from16 v23, v1

    invoke-static/range {v20 .. v34}, Lnb/od;->d(Lie/u;Lie/u;Lie/w;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v2, v1}, Lnb/md;-><init>(Ljava/util/Map;)V

    goto :goto_6

    :cond_9
    move-object/from16 v19, v1

    invoke-static {v2, v7}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v9, 0x2f2

    if-le v5, v9, :cond_a

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    const-string v5, "GoogleConsent"

    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-static {v2, v11}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v1

    const/4 v5, -0x1

    if-eq v1, v5, :cond_b

    const-string v6, "gdprApplies"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-static {v2, v10}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v1

    if-eq v1, v5, :cond_c

    const-string v6, "EnableAdvertiserConsentMode"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-static {v2, v12}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v1

    if-eq v1, v5, :cond_d

    const-string v6, "PolicyVersion"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    invoke-static {v2, v8}, Lnb/od;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    const-string v6, "PurposeConsents"

    invoke-interface {v3, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    invoke-static {v2, v13}, Lnb/od;->b(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    move-result v1

    if-eq v1, v5, :cond_f

    const-string v2, "CmpSdkID"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    new-instance v2, Lnb/md;

    invoke-direct {v2, v3}, Lnb/md;-><init>(Ljava/util/Map;)V

    :goto_6
    invoke-virtual/range {v19 .. v19}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v3, "Tcf preferences read"

    invoke-virtual {v1, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    const-string v3, "_tcf"

    const-string v4, "auto"

    const-string v5, "_tcfd"

    const/16 v6, -0x1e

    const-string v7, "Consent generated from Tcf"

    if-eqz v1, :cond_14

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v8, "stored_tcf_param"

    invoke-interface {v1, v8, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_10

    new-instance v1, Lnb/md;

    invoke-direct {v1, v8}, Lnb/md;-><init>(Ljava/util/Map;)V

    goto :goto_9

    :cond_10
    const-string v9, ";"

    invoke-virtual {v1, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v9, v1

    move/from16 v10, v16

    :goto_7
    if-ge v10, v9, :cond_12

    aget-object v11, v1, v10

    const-string v12, "="

    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x2

    if-lt v12, v13, :cond_11

    sget-object v12, Lnb/od;->a:Lie/t;

    aget-object v14, v11, v16

    invoke-virtual {v12, v14}, Lie/t;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    aget-object v12, v11, v16

    const/16 v18, 0x1

    aget-object v11, v11, v18

    invoke-interface {v8, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_11
    const/16 v18, 0x1

    :goto_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_12
    new-instance v1, Lnb/md;

    invoke-direct {v1, v8}, Lnb/md;-><init>(Ljava/util/Map;)V

    :goto_9
    invoke-virtual/range {v19 .. v19}, Lnb/g7;->x()Lnb/k6;

    move-result-object v8

    invoke-virtual {v8, v2}, Lnb/k6;->x(Lnb/md;)Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-virtual {v2}, Lnb/md;->b()Landroid/os/Bundle;

    move-result-object v8

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->a()Lnb/w5;

    move-result-object v9

    invoke-virtual {v9}, Lnb/w5;->w()Lnb/u5;

    move-result-object v9

    invoke-virtual {v9, v7, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    if-eq v8, v7, :cond_13

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->e()Lu9/e;

    move-result-object v7

    invoke-interface {v7}, Lu9/e;->a()J

    move-result-wide v9

    invoke-virtual {v0, v8, v6, v9, v10}, Lnb/qa;->o0(Landroid/os/Bundle;IJ)V

    :cond_13
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v1}, Lnb/md;->d(Lnb/md;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "_tcfm"

    invoke-virtual {v6, v7, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lnb/md;->c()Ljava/lang/String;

    move-result-object v1

    const-string v7, "_tcfd2"

    invoke-virtual {v6, v7, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lnb/md;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v3, v6}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_14
    invoke-virtual/range {v19 .. v19}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnb/k6;->x(Lnb/md;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v2}, Lnb/md;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->w()Lnb/u5;

    move-result-object v8

    invoke-virtual {v8, v7, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    if-eq v1, v7, :cond_15

    invoke-virtual/range {v19 .. v19}, Lnb/g7;->e()Lu9/e;

    move-result-object v7

    invoke-interface {v7}, Lu9/e;->a()J

    move-result-wide v7

    invoke-virtual {v0, v1, v6, v7, v8}, Lnb/qa;->o0(Landroid/os/Bundle;IJ)V

    :cond_15
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2}, Lnb/md;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v3, v1}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_16
    return-void
.end method

.method public final r0(Ljava/lang/Runnable;)V
    .locals 12

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->q()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-static {}, Lnb/f;->a()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "[sgtm] Started client-side batch upload work."

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    if-nez v2, :cond_4

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v5, "[sgtm] Getting upload batches from service (FE)"

    invoke-virtual {v2, v5}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance v7, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v6

    new-instance v11, Lnb/oa;

    invoke-direct {v11, p0, v7}, Lnb/oa;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v8, 0x2710

    const-string v10, "[sgtm] Getting upload batches"

    invoke-virtual/range {v6 .. v11}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/zzoq;

    if-eqz v2, :cond_4

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzoq;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->w()Lnb/u5;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "[sgtm] Retrieved upload batches. count"

    invoke-virtual {v5, v7, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v3, v5

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/measurement/internal/zzom;

    invoke-virtual {p0, v5}, Lnb/qa;->e0(Lcom/google/android/gms/measurement/internal/zzom;)Lnb/ya;

    move-result-object v5

    sget-object v6, Lnb/ya;->c:Lnb/ya;

    if-ne v5, v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    sget-object v6, Lnb/ya;->e:Lnb/ya;

    if-ne v5, v6, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    move v2, v1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "[sgtm] Completed client-side batch upload work. total, success"

    invoke-virtual {v0, v3, v1, v2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_5
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Cannot retrieve and upload batches from main thread"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Cannot retrieve and upload batches from analytics network thread"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_7
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Cannot retrieve and upload batches from analytics worker thread"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final s()V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Register tcfPrefChangeListener."

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lnb/qa;->u:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    if-nez v1, :cond_0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v2, Lnb/h9;

    invoke-direct {v2, p0, v1}, Lnb/h9;-><init>(Lnb/qa;Lnb/l8;)V

    iput-object v2, p0, Lnb/qa;->v:Lnb/w;

    new-instance v1, Lnb/ka;

    invoke-direct {v1, p0}, Lnb/ka;-><init>(Lnb/qa;)V

    iput-object v1, p0, Lnb/qa;->u:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k6;->q()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lnb/qa;->u:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final s0(J)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/qa;->l:Lnb/w;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v1, Lnb/z8;

    invoke-direct {v1, p0, v0}, Lnb/z8;-><init>(Lnb/qa;Lnb/l8;)V

    iput-object v1, p0, Lnb/qa;->l:Lnb/w;

    :cond_0
    iget-object v0, p0, Lnb/qa;->l:Lnb/w;

    invoke-virtual {v0, p1, p2}, Lnb/w;->b(J)V

    return-void
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->u(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    return-void
.end method

.method public final t0()V
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/qa;->l:Lnb/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnb/w;->d()V

    :cond_0
    return-void
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V
    .locals 10

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v1, p0, Lnb/qa;->d:Lnb/u8;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-static {p2}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    move v7, v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v9}, Lnb/qa;->v(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final u0()V
    .locals 9

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Lnb/z4;->R0:Lnb/y4;

    invoke-virtual {v1, v2, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->p()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-static {}, Lnb/f;->a()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Getting trigger URIs (FE)"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v3

    new-instance v8, Lnb/ga;

    invoke-direct {v8, p0, v4}, Lnb/ga;-><init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v5, 0x2710

    const-string v7, "get trigger URIs"

    invoke-virtual/range {v3 .. v8}, Lnb/c7;->u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->q()Lnb/u5;

    move-result-object v0

    const-string v1, "Timed out waiting for get trigger URIs"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v2, Lnb/ha;

    invoke-direct {v2, p0, v1}, Lnb/ha;-><init>(Lnb/qa;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Cannot get trigger URIs from main thread"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Cannot get trigger URIs from analytics worker thread"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p5

    invoke-static {v7}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v9}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/b5;->j()V

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->g()Z

    move-result v2

    if-eqz v2, :cond_26

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->L()Lnb/k5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k5;->w()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Dropping non-safelisted event. event name, origin"

    invoke-virtual {v0, v2, v8, v7}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    iget-boolean v2, v1, Lnb/qa;->f:Z

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v2, :cond_3

    iput-boolean v11, v1, Lnb/qa;->f:Z

    :try_start_0
    invoke-virtual {v0}, Lnb/g7;->G()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v2, "com.google.android.gms.tagmanager.TagManagerService"

    if-nez v0, :cond_2

    :try_start_1
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v2, v11, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    :try_start_2
    const-string v2, "initialize"

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v10, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_3
    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to invoke Tag Manager\'s initialize() method"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    const-string v2, "Tag Manager is not found and thus will not be used"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_3
    :goto_2
    iget-object v12, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    sget-object v2, Lnb/z4;->g1:Lnb/y4;

    invoke-virtual {v0, v10, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "_cmp"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "gclid"

    invoke-virtual {v9, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v12}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v9, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_lgclid"

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :cond_4
    move-object v6, v1

    invoke-virtual {v12}, Lnb/g7;->c()Lnb/f;

    if-eqz p6, :cond_5

    invoke-static {v8}, Lnb/ve;->U(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v12}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->z:Lnb/g6;

    invoke-virtual {v1}, Lnb/g6;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lnb/ve;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    :cond_5
    const/16 v0, 0x28

    const/4 v13, 0x0

    if-nez p8, :cond_a

    invoke-virtual {v12}, Lnb/g7;->c()Lnb/f;

    const-string v1, "_iap"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    const-string v3, "event"

    invoke-virtual {v2, v3, v8}, Lnb/ve;->t0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x2

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    sget-object v4, Lnb/r8;->a:[Ljava/lang/String;

    sget-object v14, Lnb/r8;->b:[Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v14, v8}, Lnb/ve;->v0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    const/16 v5, 0xd

    goto :goto_3

    :cond_7
    iget-object v4, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v2, v3, v0, v8}, Lnb/ve;->w0(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    move v5, v13

    :goto_3
    if-eqz v5, :cond_a

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->q()Lnb/u5;

    move-result-object v2

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v3

    invoke-virtual {v3, v8}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid public event name. Event will not be logged (FE)"

    invoke-virtual {v2, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v2, v8, v0, v11}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v13

    :cond_9
    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    iget-object v2, v6, Lnb/qa;->w:Lnb/ue;

    const/4 v3, 0x0

    const-string v4, "_ev"

    move-object/from16 p6, v0

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p5, v4

    move/from16 p4, v5

    move/from16 p7, v13

    invoke-virtual/range {p1 .. p7}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_a
    invoke-virtual {v12}, Lnb/g7;->c()Lnb/f;

    iget-object v14, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v14}, Lnb/g7;->I()Lnb/jb;

    move-result-object v1

    invoke-virtual {v1, v13}, Lnb/jb;->q(Z)Lnb/bb;

    move-result-object v1

    const-string v2, "_sc"

    if-eqz v1, :cond_b

    invoke-virtual {v9, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_b

    iput-boolean v11, v1, Lnb/bb;->d:Z

    :cond_b
    if-eqz p6, :cond_c

    if-nez p8, :cond_c

    move v3, v11

    goto :goto_4

    :cond_c
    move v3, v13

    :goto_4
    invoke-static {v1, v9, v3}, Lnb/ve;->k0(Lnb/bb;Landroid/os/Bundle;Z)V

    const-string v1, "am"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v8}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result v3

    if-eqz p6, :cond_e

    iget-object v4, v6, Lnb/qa;->d:Lnb/u8;

    if-eqz v4, :cond_e

    if-nez v3, :cond_e

    if-eqz v1, :cond_d

    move v9, v11

    goto :goto_5

    :cond_d
    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v1

    invoke-virtual {v1, v8}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    invoke-virtual {v2, v9}, Lnb/p5;->e(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Passing event to registered event handler (FE)"

    invoke-virtual {v0, v3, v1, v2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v6, Lnb/qa;->d:Lnb/u8;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Lnb/qa;->d:Lnb/u8;

    move-wide/from16 v4, p3

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    invoke-interface/range {v0 .. v5}, Lnb/u8;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void

    :cond_e
    move v9, v1

    :goto_5
    iget-object v15, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v15}, Lnb/g7;->m()Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_13

    :cond_f
    invoke-virtual {v12}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1, v8}, Lnb/ve;->x0(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->q()Lnb/u5;

    move-result-object v2

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v3

    invoke-virtual {v3, v8}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event name. Event will not be logged (FE)"

    invoke-virtual {v2, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v12}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v2, v8, v0, v11}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v8, :cond_10

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v13

    :cond_10
    invoke-virtual {v15}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    iget-object v3, v6, Lnb/qa;->w:Lnb/ue;

    const-string v4, "_ev"

    move-object/from16 p3, p9

    move-object/from16 p6, v0

    move/from16 p4, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move/from16 p7, v13

    invoke-virtual/range {p1 .. p7}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_11
    const-string v0, "_sn"

    const-string v1, "_si"

    const-string v3, "_o"

    filled-new-array {v3, v0, v2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu9/f;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v12}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    move/from16 v5, p8

    move-object/from16 v1, p9

    move-object v2, v8

    move-object/from16 v16, v12

    move-wide/from16 v11, p3

    move-object v8, v3

    move-object/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Lnb/ve;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v0

    move-object v1, v2

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v14}, Lnb/g7;->I()Lnb/jb;

    move-result-object v2

    invoke-virtual {v2, v13}, Lnb/jb;->q(Z)Lnb/bb;

    move-result-object v2

    const-string v3, "_ae"

    if-eqz v2, :cond_12

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {v14}, Lnb/g7;->z()Lnb/ld;

    move-result-object v2

    iget-object v2, v2, Lnb/ld;->f:Lnb/jd;

    const-wide/16 p5, 0x0

    iget-object v4, v2, Lnb/jd;->d:Lnb/ld;

    iget-object v4, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->b()J

    move-result-wide v4

    move/from16 v18, v13

    move-object/from16 v17, v14

    iget-wide v13, v2, Lnb/jd;->b:J

    sub-long v13, v4, v13

    iput-wide v4, v2, Lnb/jd;->b:J

    cmp-long v2, v13, p5

    if-lez v2, :cond_13

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2, v0, v13, v14}, Lnb/ve;->Z(Landroid/os/Bundle;J)V

    goto :goto_6

    :cond_12
    move/from16 v18, v13

    move-object/from16 v17, v14

    const-wide/16 p5, 0x0

    :cond_13
    :goto_6
    const-string v2, "auto"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "_ffr"

    if-nez v2, :cond_17

    const-string v2, "_ssr"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lu9/o;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    move-object v4, v10

    goto :goto_7

    :cond_14
    if-eqz v4, :cond_15

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    :cond_15
    :goto_7
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->x()Lnb/k6;

    move-result-object v5

    iget-object v5, v5, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v5}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v2}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v2, v4}, Lnb/j6;->b(Ljava/lang/String;)V

    goto :goto_8

    :cond_16
    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v1, "Not logging duplicate session_start_with_rollout event"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_17
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v2}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_18

    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    :goto_8
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    sget-object v4, Lnb/z4;->V0:Lnb/y4;

    invoke-virtual {v2, v10, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual/range {v17 .. v17}, Lnb/g7;->z()Lnb/ld;

    move-result-object v2

    invoke-virtual {v2}, Lnb/ld;->p()Z

    move-result v2

    goto :goto_9

    :cond_19
    invoke-virtual/range {v16 .. v16}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->t:Lnb/f6;

    invoke-virtual {v2}, Lnb/f6;->a()Z

    move-result v2

    :goto_9
    invoke-virtual/range {v16 .. v16}, Lnb/g7;->x()Lnb/k6;

    move-result-object v4

    iget-object v4, v4, Lnb/k6;->q:Lnb/h6;

    invoke-virtual {v4}, Lnb/h6;->a()J

    move-result-wide v4

    cmp-long v4, v4, p5

    if-lez v4, :cond_1a

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->x()Lnb/k6;

    move-result-object v4

    invoke-virtual {v4, v11, v12}, Lnb/k6;->A(J)Z

    move-result v4

    if-eqz v4, :cond_1a

    if-eqz v2, :cond_1a

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v4, "Current session is expired, remove the session number, ID, and engagement time"

    invoke-virtual {v2, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->a()J

    move-result-wide v4

    move-object v2, v3

    const-string v3, "_sid"

    move-wide v5, v4

    const/4 v4, 0x0

    move-object v14, v2

    const-string v2, "auto"

    move-object/from16 v1, p0

    move-wide/from16 v10, p5

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v5

    const-string v3, "_sno"

    const-string v2, "auto"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v5

    const-string v3, "_se"

    const-string v2, "auto"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    move-object v6, v1

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->r:Lnb/h6;

    invoke-virtual {v1, v10, v11}, Lnb/h6;->b(J)V

    goto :goto_a

    :cond_1a
    move-wide/from16 v10, p5

    move-object v14, v3

    :goto_a
    const-string v1, "extend_session"

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_1b

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v15}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v1, v1, Lnb/ld;->e:Lnb/kd;

    move-wide/from16 v4, p3

    const/4 v2, 0x1

    invoke-virtual {v1, v4, v5, v2}, Lnb/kd;->b(JZ)V

    goto :goto_b

    :cond_1b
    move-wide/from16 v4, p3

    :goto_b
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v3, v18

    :goto_c
    if-ge v3, v2, :cond_20

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_1f

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->C()Lnb/ve;

    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Landroid/os/Bundle;

    if-eqz v12, :cond_1c

    const/4 v12, 0x1

    new-array v15, v12, [Landroid/os/Bundle;

    check-cast v11, Landroid/os/Bundle;

    aput-object v11, v15, v18

    goto :goto_d

    :cond_1c
    instance-of v12, v11, [Landroid/os/Parcelable;

    if-eqz v12, :cond_1d

    check-cast v11, [Landroid/os/Parcelable;

    array-length v12, v11

    const-class v15, [Landroid/os/Bundle;

    invoke-static {v11, v12, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, [Landroid/os/Bundle;

    goto :goto_d

    :cond_1d
    instance-of v12, v11, Ljava/util/ArrayList;

    if-eqz v12, :cond_1e

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    new-array v12, v12, [Landroid/os/Bundle;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, [Landroid/os/Bundle;

    goto :goto_d

    :cond_1e
    const/4 v15, 0x0

    :goto_d
    if-eqz v15, :cond_1f

    invoke-virtual {v0, v10, v15}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_1f
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_20
    move/from16 v10, v18

    :goto_e
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_24

    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    if-eqz v10, :cond_21

    const-string v1, "_ep"

    goto :goto_f

    :cond_21
    move-object/from16 v1, p2

    :goto_f
    invoke-virtual {v0, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p7, :cond_22

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    const/4 v11, 0x0

    invoke-virtual {v2, v0, v11}, Lnb/ve;->Q(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    :goto_10
    move-object v12, v0

    goto :goto_11

    :cond_22
    const/4 v11, 0x0

    goto :goto_10

    :goto_11
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbg;

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v2, v12}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    invoke-virtual/range {v17 .. v17}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    move-object/from16 v7, p9

    invoke-virtual {v1, v0, v7}, Lnb/tc;->c0(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    if-nez v9, :cond_23

    iget-object v0, v6, Lnb/qa;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_12
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/v8;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3, v12}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v4, p3

    invoke-interface/range {v0 .. v5}, Lnb/v8;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    goto :goto_12

    :cond_23
    move-object/from16 v2, p2

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, p1

    move-wide/from16 v4, p3

    goto :goto_e

    :cond_24
    move-object/from16 v2, p2

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->c()Lnb/f;

    invoke-virtual/range {v17 .. v17}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lnb/jb;->q(Z)Lnb/bb;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual/range {v17 .. v17}, Lnb/g7;->z()Lnb/ld;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    iget-object v0, v0, Lnb/ld;->f:Lnb/jd;

    const/4 v12, 0x1

    invoke-virtual {v0, v12, v12, v1, v2}, Lnb/jd;->d(ZZJ)Z

    :cond_25
    :goto_13
    return-void

    :cond_26
    move-object v6, v1

    iget-object v0, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v1, "Event not sent since app measurement is disabled"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final v0()Z
    .locals 1

    iget-boolean v0, p0, Lnb/qa;->n:Z

    return v0
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Lnb/g7;->q()V

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->e()Lu9/e;

    move-result-object p1

    invoke-interface {p1}, Lu9/e;->a()J

    move-result-wide v3

    const/4 v7, 0x1

    const/4 v8, 0x1

    const-string v1, "auto"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v5, p3

    move-object v9, p4

    invoke-virtual/range {v0 .. v9}, Lnb/qa;->x(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final w0()Ljava/util/PriorityQueue;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    iget-object v0, p0, Lnb/qa;->m:Ljava/util/PriorityQueue;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/PriorityQueue;

    sget-object v1, Lnb/ia;->a:Lnb/ia;

    sget-object v2, Lnb/ja;->a:Lnb/ja;

    invoke-static {v1, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/PriorityQueue;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lnb/qa;->m:Ljava/util/PriorityQueue;

    :cond_0
    iget-object v0, p0, Lnb/qa;->m:Ljava/util/PriorityQueue;

    return-object v0
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 12

    sget-object v0, Lnb/ve;->i:[Ljava/lang/String;

    new-instance v7, Landroid/os/Bundle;

    move-object/from16 v0, p5

    invoke-direct {v7, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v7}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    new-instance v3, Landroid/os/Bundle;

    check-cast v2, Landroid/os/Bundle;

    invoke-direct {v3, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v7, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    instance-of v1, v2, [Landroid/os/Parcelable;

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    check-cast v2, [Landroid/os/Parcelable;

    :goto_1
    array-length v1, v2

    if-ge v3, v1, :cond_0

    aget-object v1, v2, v3

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_2

    new-instance v4, Landroid/os/Bundle;

    check-cast v1, Landroid/os/Bundle;

    invoke-direct {v4, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    aput-object v4, v2, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    instance-of v1, v2, Ljava/util/List;

    if-eqz v1, :cond_0

    check-cast v2, Ljava/util/List;

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_4

    new-instance v4, Landroid/os/Bundle;

    check-cast v1, Landroid/os/Bundle;

    invoke-direct {v4, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-interface {v2, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/i9;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-direct/range {v1 .. v11}, Lnb/i9;-><init>(Lnb/qa;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final x0()V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    invoke-virtual {p0}, Lnb/j8;->h()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnb/qa;->n:Z

    invoke-virtual {p0}, Lnb/qa;->w0()Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lnb/qa;->i:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnb/qa;->w0()Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/measurement/internal/zzoh;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v3

    invoke-virtual {v3}, Lnb/ve;->H()Lr4/a;

    move-result-object v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    iput-boolean v4, p0, Lnb/qa;->i:Z

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzoh;->f:Ljava/lang/String;

    const-string v5, "Registering trigger URI"

    invoke-virtual {v2, v5, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v3, v2}, Lr4/a;->c(Landroid/net/Uri;)Lne/x;

    move-result-object v2

    if-nez v2, :cond_1

    iput-boolean v0, p0, Lnb/qa;->i:Z

    invoke-virtual {p0}, Lnb/qa;->w0()Ljava/util/PriorityQueue;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance v0, Lnb/a9;

    invoke-direct {v0, p0}, Lnb/a9;-><init>(Lnb/qa;)V

    new-instance v3, Lnb/b9;

    invoke-direct {v3, p0, v1}, Lnb/b9;-><init>(Lnb/qa;Lcom/google/android/gms/measurement/internal/zzoh;)V

    invoke-static {v2, v3, v0}, Lne/s;->a(Lne/x;Lne/q;Ljava/util/concurrent/Executor;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 7

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->e()Lu9/e;

    move-result-object p1

    invoke-interface {p1}, Lu9/e;->a()J

    move-result-wide v5

    const-string v2, "_ldl"

    const/4 v4, 0x1

    const-string v1, "auto"

    move-object v0, p0

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Lnb/qa;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-object/from16 v1, p3

    const/4 v3, 0x0

    const/16 v4, 0x18

    if-eqz p4, :cond_0

    iget-object v5, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5, v2}, Lnb/ve;->y0(Ljava/lang/String;)I

    move-result v5

    :goto_0
    move v12, v5

    goto :goto_2

    :cond_0
    iget-object v5, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    const-string v6, "user property"

    invoke-virtual {v5, v6, v2}, Lnb/ve;->t0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x6

    if-nez v7, :cond_1

    :goto_1
    move v12, v8

    goto :goto_2

    :cond_1
    sget-object v7, Lnb/t8;->a:[Ljava/lang/String;

    const/4 v9, 0x0

    invoke-virtual {v5, v6, v7, v9, v2}, Lnb/ve;->v0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    const/16 v5, 0xf

    goto :goto_0

    :cond_2
    iget-object v7, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v5, v6, v4, v2}, Lnb/ve;->w0(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    move v12, v3

    :goto_2
    const/4 v5, 0x1

    if-eqz v12, :cond_5

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v6

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v6, v2, v4, v5}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v14

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    :cond_4
    move v15, v3

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    iget-object v10, v0, Lnb/qa;->w:Lnb/ue;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v9

    const/4 v11, 0x0

    const-string v13, "_ev"

    invoke-virtual/range {v9 .. v15}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_5
    if-nez p1, :cond_6

    const-string v6, "app"

    goto :goto_3

    :cond_6
    move-object/from16 v6, p1

    :goto_3
    if-eqz v1, :cond_b

    iget-object v7, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->C()Lnb/ve;

    move-result-object v8

    invoke-virtual {v8, v2, v1}, Lnb/ve;->y(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v7}, Lnb/g7;->C()Lnb/ve;

    move-result-object v6

    invoke-virtual {v7}, Lnb/g7;->w()Lnb/k;

    invoke-virtual {v6, v2, v4, v5}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v14

    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_8

    instance-of v2, v1, Ljava/lang/CharSequence;

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move v15, v3

    goto :goto_6

    :cond_8
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    goto :goto_4

    :goto_6
    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    iget-object v10, v0, Lnb/qa;->w:Lnb/ue;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v9

    const/4 v11, 0x0

    const-string v13, "_ev"

    invoke-virtual/range {v9 .. v15}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_9
    invoke-virtual {v7}, Lnb/g7;->C()Lnb/ve;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Lnb/ve;->z(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_a

    move-wide/from16 v3, p5

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lnb/qa;->A(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :cond_a
    return-void

    :cond_b
    move-object v1, v6

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Lnb/qa;->A(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    return-void
.end method
