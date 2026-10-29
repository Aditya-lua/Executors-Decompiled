.class public final Lnb/ca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lnb/da;


# direct methods
.method public constructor <init>(Lnb/da;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-boolean p2, p0, Lnb/ca;->a:Z

    iput-object p3, p0, Lnb/ca;->b:Landroid/net/Uri;

    iput-object p4, p0, Lnb/ca;->c:Ljava/lang/String;

    iput-object p5, p0, Lnb/ca;->d:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ca;->e:Lnb/da;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lnb/ca;->e:Lnb/da;

    iget-object v0, v2, Lnb/da;->a:Lnb/qa;

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v3, v1, Lnb/ca;->d:Ljava/lang/String;

    iget-object v4, v1, Lnb/ca;->b:Landroid/net/Uri;

    :try_start_0
    iget-object v5, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->C()Lnb/ve;

    move-result-object v6

    const-string v7, "https://google.com/search?"

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "_cis"

    const-string v10, "Activity created with data \'referrer\' without required params"

    const-string v11, "utm_medium"

    const-string v12, "utm_source"

    const-string v13, "utm_campaign"

    const-string v15, "gclid"

    if-eqz v8, :cond_0

    :goto_0
    const/4 v6, 0x0

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-virtual {v3, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "gbraid"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v3, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v3, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v3, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "utm_id"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "dclid"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "srsltid"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "sfmc_id"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    iget-object v6, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->v()Lnb/u5;

    move-result-object v6

    invoke-virtual {v6, v10}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v6, v7}, Lnb/ve;->s0(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v7, "referrer"

    invoke-virtual {v6, v9, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_1
    iget-object v7, v1, Lnb/ca;->c:Ljava/lang/String;

    iget-boolean v8, v1, Lnb/ca;->a:Z

    const-string v14, "_cmp"

    if-eqz v8, :cond_4

    :try_start_2
    invoke-virtual {v5}, Lnb/g7;->C()Lnb/ve;

    move-result-object v8

    invoke-virtual {v8, v4}, Lnb/ve;->s0(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v8, "intent"

    invoke-virtual {v4, v9, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    if-eqz v6, :cond_3

    invoke-virtual {v6, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "_cer"

    const-string v9, "gclid=%s"

    invoke-virtual {v6, v15}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    filled-new-array/range {v16 .. v16}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v8, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0, v7, v14, v4}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, v0, Lnb/qa;->r:Lnb/cf;

    invoke-virtual {v1, v7, v4}, Lnb/cf;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v4, "Activity created with referrer"

    invoke-virtual {v1, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    sget-object v4, Lnb/z4;->H0:Lnb/y4;

    const/4 v8, 0x0

    invoke-virtual {v1, v8, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v4, 0x1

    const-string v8, "_ldl"

    const-string v9, "auto"

    if-eqz v1, :cond_7

    if-eqz v6, :cond_6

    :try_start_3
    invoke-virtual {v0, v7, v14, v6}, Lnb/qa;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, v0, Lnb/qa;->r:Lnb/cf;

    invoke-virtual {v1, v7, v6}, Lnb/cf;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_2
    const/4 v1, 0x0

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v5, "Referrer does not contain valid parameters"

    invoke-virtual {v1, v5, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :goto_3
    invoke-virtual {v0, v9, v8, v1, v4}, Lnb/qa;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void

    :cond_7
    invoke-virtual {v3, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v3, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v3, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v3, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "utm_term"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "utm_content"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_8
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v0, v9, v8, v3, v4}, Lnb/qa;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_9
    :goto_4
    return-void

    :cond_a
    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :goto_5
    iget-object v1, v2, Lnb/da;->a:Lnb/qa;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
