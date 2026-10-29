.class public final Lnb/k6;
.super Lnb/k8;
.source "SourceFile"


# static fields
.field public static final A:Landroid/util/Pair;


# instance fields
.field public c:Landroid/content/SharedPreferences;

.field public d:Landroid/content/SharedPreferences;

.field public e:Lnb/i6;

.field public final f:Lnb/h6;

.field public final g:Lnb/h6;

.field public final h:Lnb/j6;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:J

.field public final l:Lnb/h6;

.field public final m:Lnb/f6;

.field public final n:Lnb/j6;

.field public final o:Lnb/g6;

.field public final p:Lnb/f6;

.field public final q:Lnb/h6;

.field public final r:Lnb/h6;

.field public s:Z

.field public final t:Lnb/f6;

.field public final u:Lnb/f6;

.field public final v:Lnb/h6;

.field public final w:Lnb/j6;

.field public final x:Lnb/j6;

.field public final y:Lnb/h6;

.field public final z:Lnb/g6;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Pair;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lnb/k6;->A:Landroid/util/Pair;

    return-void
.end method

.method public constructor <init>(Lnb/g7;)V
    .locals 5

    invoke-direct {p0, p1}, Lnb/k8;-><init>(Lnb/g7;)V

    new-instance p1, Lnb/h6;

    const-wide/32 v0, 0x1b7740

    const-string v2, "session_timeout"

    invoke-direct {p1, p0, v2, v0, v1}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->l:Lnb/h6;

    new-instance p1, Lnb/f6;

    const/4 v0, 0x1

    const-string v1, "start_new_session"

    invoke-direct {p1, p0, v1, v0}, Lnb/f6;-><init>(Lnb/k6;Ljava/lang/String;Z)V

    iput-object p1, p0, Lnb/k6;->m:Lnb/f6;

    new-instance p1, Lnb/h6;

    const-string v0, "last_pause_time"

    const-wide/16 v1, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->q:Lnb/h6;

    new-instance p1, Lnb/h6;

    const-string v0, "session_id"

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->r:Lnb/h6;

    new-instance p1, Lnb/j6;

    const-string v0, "non_personalized_ads"

    const/4 v3, 0x0

    invoke-direct {p1, p0, v0, v3}, Lnb/j6;-><init>(Lnb/k6;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/k6;->n:Lnb/j6;

    new-instance p1, Lnb/g6;

    const-string v0, "last_received_uri_timestamps_by_source"

    invoke-direct {p1, p0, v0, v3}, Lnb/g6;-><init>(Lnb/k6;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object p1, p0, Lnb/k6;->o:Lnb/g6;

    new-instance p1, Lnb/f6;

    const-string v0, "allow_remote_dynamite"

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lnb/f6;-><init>(Lnb/k6;Ljava/lang/String;Z)V

    iput-object p1, p0, Lnb/k6;->p:Lnb/f6;

    new-instance p1, Lnb/h6;

    const-string v0, "first_open_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->f:Lnb/h6;

    new-instance p1, Lnb/h6;

    const-string v0, "app_install_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->g:Lnb/h6;

    new-instance p1, Lnb/j6;

    const-string v0, "app_instance_id"

    invoke-direct {p1, p0, v0, v3}, Lnb/j6;-><init>(Lnb/k6;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/k6;->h:Lnb/j6;

    new-instance p1, Lnb/f6;

    const-string v0, "app_backgrounded"

    invoke-direct {p1, p0, v0, v4}, Lnb/f6;-><init>(Lnb/k6;Ljava/lang/String;Z)V

    iput-object p1, p0, Lnb/k6;->t:Lnb/f6;

    new-instance p1, Lnb/f6;

    const-string v0, "deep_link_retrieval_complete"

    invoke-direct {p1, p0, v0, v4}, Lnb/f6;-><init>(Lnb/k6;Ljava/lang/String;Z)V

    iput-object p1, p0, Lnb/k6;->u:Lnb/f6;

    new-instance p1, Lnb/h6;

    const-string v0, "deep_link_retrieval_attempts"

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->v:Lnb/h6;

    new-instance p1, Lnb/j6;

    const-string v0, "firebase_feature_rollouts"

    invoke-direct {p1, p0, v0, v3}, Lnb/j6;-><init>(Lnb/k6;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/k6;->w:Lnb/j6;

    new-instance p1, Lnb/j6;

    const-string v0, "deferred_attribution_cache"

    invoke-direct {p1, p0, v0, v3}, Lnb/j6;-><init>(Lnb/k6;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/k6;->x:Lnb/j6;

    new-instance p1, Lnb/h6;

    const-string v0, "deferred_attribution_cache_timestamp"

    invoke-direct {p1, p0, v0, v1, v2}, Lnb/h6;-><init>(Lnb/k6;Ljava/lang/String;J)V

    iput-object p1, p0, Lnb/k6;->y:Lnb/h6;

    new-instance p1, Lnb/g6;

    const-string v0, "default_event_parameters"

    invoke-direct {p1, p0, v0, v3}, Lnb/g6;-><init>(Lnb/k6;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object p1, p0, Lnb/k6;->z:Lnb/g6;

    return-void
.end method


# virtual methods
.method public final A(J)Z
    .locals 2

    iget-object v0, p0, Lnb/k6;->l:Lnb/h6;

    invoke-virtual {v0}, Lnb/h6;->a()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-object v0, p0, Lnb/k6;->q:Lnb/h6;

    invoke-virtual {v0}, Lnb/h6;->a()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j()V
    .locals 10

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.prefs"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lnb/k6;->c:Landroid/content/SharedPreferences;

    const-string v2, "has_been_opened"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lnb/k6;->s:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lnb/k6;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    new-instance v4, Lnb/i6;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    sget-object v0, Lnb/z4;->d:Lnb/y4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    const-string v6, "health_monitor"

    const/4 v9, 0x0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lnb/i6;-><init>(Lnb/k6;Ljava/lang/String;J[B)V

    iput-object v4, v5, Lnb/k6;->e:Lnb/i6;

    return-void
.end method

.method public final o(Ljava/lang/String;)Landroid/util/Pair;
    .locals 7

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->w()Lnb/q8;

    move-result-object v0

    sget-object v1, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v0, v1}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->b()J

    move-result-wide v2

    iget-object v4, p0, Lnb/k6;->i:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-wide v5, p0, Lnb/k6;->k:J

    cmp-long v5, v2, v5

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/util/Pair;

    iget-boolean v0, p0, Lnb/k6;->j:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v4, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    sget-object v5, Lnb/z4;->b:Lnb/y4;

    invoke-virtual {v4, p1, v5}, Lnb/k;->D(Ljava/lang/String;Lnb/y4;)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lnb/k6;->k:J

    const/4 p1, 0x1

    invoke-static {p1}, Lq8/a;->b(Z)V

    :try_start_0
    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lq8/a;->a(Landroid/content/Context;)Lq8/a$a;

    move-result-object p1

    iput-object v1, p0, Lnb/k6;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lq8/a$a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lnb/k6;->i:Ljava/lang/String;

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lq8/a$a;->b()Z

    move-result p1

    iput-boolean p1, p0, Lnb/k6;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Unable to get advertising id"

    invoke-virtual {v0, v2, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v1, p0, Lnb/k6;->i:Ljava/lang/String;

    :goto_3
    const/4 p1, 0x0

    invoke-static {p1}, Lq8/a;->b(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, p0, Lnb/k6;->i:Ljava/lang/String;

    iget-boolean v1, p0, Lnb/k6;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_3
    new-instance p1, Landroid/util/Pair;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final p()Landroid/content/SharedPreferences;
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k8;->l()V

    iget-object v0, p0, Lnb/k6;->c:Landroid/content/SharedPreferences;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/k6;->c:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final q()Landroid/content/SharedPreferences;
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k8;->l()V

    iget-object v0, p0, Lnb/k6;->d:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "_preferences"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Default prefs file"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lnb/k6;->d:Landroid/content/SharedPreferences;

    :cond_0
    iget-object v0, p0, Lnb/k6;->d:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final r()Landroid/util/SparseArray;
    .locals 7

    iget-object v0, p0, Lnb/k6;->o:Lnb/g6;

    invoke-virtual {v0}, Lnb/g6;->a()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "uriSources"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    const-string v2, "uriTimestamps"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v0

    if-eqz v1, :cond_3

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, v0

    array-length v3, v1

    if-eq v3, v2, :cond_1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Trigger URI source and timestamp array lengths do not match"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0

    :cond_1
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_2

    aget v4, v1, v3

    aget-wide v5, v0, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2

    :cond_3
    :goto_1
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0
.end method

.method public final s(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "measurement_enabled"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final t()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "measurement_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final u()Lnb/x;
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "dma_consent_settings"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnb/x;->g(Ljava/lang/String;)Lnb/x;

    move-result-object v0

    return-object v0
.end method

.method public final v(I)Z
    .locals 3

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_source"

    const/16 v2, 0x64

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {p1, v0}, Lnb/q8;->u(II)Z

    move-result p1

    return p1
.end method

.method public final w()Lnb/q8;
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_settings"

    const-string v2, "G1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "consent_source"

    const/16 v3, 0x64

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lnb/md;)Z
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, ""

    const-string v2, "stored_tcf_param"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnb/md;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y(Z)V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "App measurement setting deferred collection"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, Lnb/k6;->c:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
