.class public final Lnb/da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Lnb/ba;


# instance fields
.field public final synthetic a:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/da;->a:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 4

    iget-object v0, p0, Lnb/da;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/jb;->x(Lcom/google/android/gms/internal/measurement/zzdf;)V

    invoke-virtual {v0}, Lnb/g7;->z()Lnb/ld;

    move-result-object p1

    iget-object v0, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v3, Lnb/dd;

    invoke-direct {v3, p1, v1, v2}, Lnb/dd;-><init>(Lnb/ld;J)V

    invoke-virtual {v0, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 1

    iget-object v0, p0, Lnb/da;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/jb;->z(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/da;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnb/jb;->y(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 6

    iget-object v0, p0, Lnb/da;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->b()J

    move-result-wide v3

    invoke-virtual {v2}, Lnb/g7;->b()Lnb/c7;

    move-result-object v2

    new-instance v5, Lnb/cd;

    invoke-direct {v5, v1, v3, v4}, Lnb/cd;-><init>(Lnb/ld;J)V

    invoke-virtual {v2, v5}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/jb;->w(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lnb/da;->a:Lnb/qa;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "onActivityCreated"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzdf;->h:Landroid/content/Intent;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/Uri;->isHierarchical()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, p0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    move-object v2, p0

    goto/16 :goto_a

    :cond_1
    :goto_1
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    const-string v5, "com.android.vending.referral_url"

    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_0

    :cond_2
    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/net/Uri;->isHierarchical()Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    move-object v2, p0

    goto :goto_8

    :cond_4
    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    const-string v0, "android.intent.extra.REFERRER_NAME"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "android-app://com.google.android.googlequicksearchbox/https/www.google.com"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "https://www.google.com"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "android-app://com.google.appcrawler"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    const-string v0, "auto"

    :goto_3
    move-object v5, v0

    goto :goto_5

    :cond_6
    :goto_4
    const-string v0, "gs"

    goto :goto_3

    :goto_5
    const-string v0, "referrer"

    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez p2, :cond_7

    const/4 v0, 0x1

    :goto_6
    move v3, v0

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/ca;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p0

    :try_start_1
    invoke-direct/range {v1 .. v6}, Lnb/ca;-><init>(Lnb/da;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_a

    :goto_8
    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    :goto_9
    invoke-virtual {v0}, Lnb/g7;->I()Lnb/jb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnb/jb;->v(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    return-void

    :goto_a
    :try_start_2
    iget-object v1, v2, Lnb/da;->a:Lnb/qa;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v3, "Throwable caught in onActivityCreated"

    invoke-virtual {v1, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_b
    iget-object v0, v2, Lnb/da;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    goto :goto_9

    :goto_c
    iget-object v1, v2, Lnb/da;->a:Lnb/qa;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->I()Lnb/jb;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lnb/jb;->v(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    throw v0
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnb/da;->e(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnb/da;->b(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnb/da;->a(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnb/da;->d(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnb/da;->c(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
