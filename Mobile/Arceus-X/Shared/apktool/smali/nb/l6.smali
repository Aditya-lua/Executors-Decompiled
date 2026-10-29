.class public final Lnb/l6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/t0;

.field public final synthetic b:Landroid/content/ServiceConnection;

.field public final synthetic c:Lnb/m6;


# direct methods
.method public constructor <init>(Lnb/m6;Lcom/google/android/gms/internal/measurement/t0;Landroid/content/ServiceConnection;)V
    .locals 0

    iput-object p2, p0, Lnb/l6;->a:Lcom/google/android/gms/internal/measurement/t0;

    iput-object p3, p0, Lnb/l6;->b:Landroid/content/ServiceConnection;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/l6;->c:Lnb/m6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    iget-object v0, p0, Lnb/l6;->c:Lnb/m6;

    iget-object v1, v0, Lnb/m6;->b:Lnb/n6;

    iget-object v2, v1, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->b()Lnb/c7;

    move-result-object v3

    invoke-virtual {v3}, Lnb/j8;->h()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lnb/m6;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "package_name"

    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lnb/l6;->a:Lcom/google/android/gms/internal/measurement/t0;

    const/4 v5, 0x0

    :try_start_0
    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/measurement/t0;->j(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Install Referrer Service returned a null response"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v3, v5

    goto :goto_1

    :catch_0
    move-exception v2

    iget-object v3, v1, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    const-string v4, "Exception occurred while retrieving the Install Referrer"

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v1, v1, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-static {}, Lnb/g7;->q()V

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v2, "install_begin_timestamp_seconds"

    const-wide/16 v6, 0x0

    invoke-virtual {v3, v2, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    cmp-long v2, v8, v6

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v2, "Service response is missing Install Referrer install timestamp"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_2
    const-string v2, "install_referrer"

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    const-string v12, "InstallReferrer API result"

    invoke-virtual {v4, v12, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v4

    const-string v12, "?"

    invoke-virtual {v12, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v4, v2}, Lnb/ve;->s0(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "No campaign params defined in Install Referrer result"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_4
    sget-object v4, Lnb/z4;->h1:Lnb/y4;

    invoke-virtual {v4, v5}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v4, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const-string v4, "referrer_click_timestamp_server_seconds"

    invoke-virtual {v3, v4, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    mul-long/2addr v3, v10

    cmp-long v5, v3, v6

    if-lez v5, :cond_6

    const-string v5, "click_timestamp"

    invoke-virtual {v2, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_6
    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->g:Lnb/h6;

    invoke-virtual {v3}, Lnb/h6;->a()J

    move-result-wide v3

    cmp-long v3, v8, v3

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v3

    const-string v4, "Logging Install Referrer campaign from module while it may have already been logged."

    invoke-virtual {v3, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v1}, Lnb/g7;->g()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->g:Lnb/h6;

    invoke-virtual {v3, v8, v9}, Lnb/h6;->b(J)V

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v3

    const-string v4, "Logging Install Referrer campaign from gmscore with "

    const-string v5, "referrer API v2"

    invoke-virtual {v3, v4, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "_cis"

    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lnb/g7;->B()Lnb/qa;

    move-result-object v3

    const-string v4, "auto"

    const-string v5, "_cmp"

    invoke-virtual {v3, v4, v5, v2, v0}, Lnb/qa;->w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "No referrer defined in Install Referrer response"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_9
    :goto_3
    iget-object v0, p0, Lnb/l6;->b:Landroid/content/ServiceConnection;

    invoke-static {}, Lt9/a;->b()Lt9/a;

    move-result-object v2

    invoke-virtual {v1}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Lt9/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    return-void
.end method
