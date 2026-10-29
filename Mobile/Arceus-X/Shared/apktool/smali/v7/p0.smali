.class public final Lv7/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Lv7/d;

.field public final b:Lcom/google/android/gms/internal/play_billing/z;

.field public final c:Lcom/google/android/gms/internal/play_billing/z;

.field public final d:I

.field public final synthetic e:Lcom/android/billingclient/api/b;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lv7/d;ILv7/s0;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/c0;

    move-result-object p4

    invoke-static {p4}, Lcom/google/android/gms/internal/play_billing/z;->c(Lcom/google/android/gms/internal/play_billing/c0;)Lcom/google/android/gms/internal/play_billing/z;

    move-result-object p4

    iput-object p4, p0, Lv7/p0;->b:Lcom/google/android/gms/internal/play_billing/z;

    invoke-static {p1}, Lcom/android/billingclient/api/b;->J0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/c0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/z;->c(Lcom/google/android/gms/internal/play_billing/c0;)Lcom/google/android/gms/internal/play_billing/z;

    move-result-object p1

    iput-object p1, p0, Lv7/p0;->c:Lcom/google/android/gms/internal/play_billing/z;

    iput-object p2, p0, Lv7/p0;->a:Lv7/d;

    iput p3, p0, Lv7/p0;->d:I

    return-void
.end method

.method public static synthetic a(Lv7/p0;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    iget-object v0, v1, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v3

    const/4 v7, 0x0

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    monitor-exit v2

    :goto_0
    move-object/from16 v16, v7

    goto/16 :goto_17

    :catchall_0
    move-exception v0

    goto/16 :goto_18

    :cond_0
    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v6, :cond_1

    move v8, v6

    goto :goto_1

    :cond_1
    move v8, v5

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "accountName"

    invoke-virtual {v2, v3, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/billingclient/api/b;->l(Lcom/android/billingclient/api/b;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lcom/android/billingclient/api/b;->m(Lcom/android/billingclient/api/b;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0}, Lcom/android/billingclient/api/b;->L0(Lcom/android/billingclient/api/b;)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-static {v2, v3, v9, v10, v11}, Lcom/google/android/gms/internal/play_billing/m0;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    goto :goto_2

    :cond_2
    move-object v2, v7

    :goto_2
    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    :try_start_1
    invoke-static {v0}, Lcom/android/billingclient/api/b;->I0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/f;

    move-result-object v10

    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v10, :cond_3

    iget-object v0, v1, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0, v5}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    iget v2, v1, Lv7/p0;->d:I

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->d1:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v4, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-static {v0, v3, v4, v2}, Lcom/android/billingclient/api/b;->M(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    invoke-virtual {v1, v4}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    goto :goto_0

    :cond_3
    iget-object v0, v1, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :try_start_2
    const-string v9, "inapp"

    const/16 v11, 0x19

    invoke-interface {v10, v11, v0, v9}, Lcom/google/android/gms/internal/play_billing/f;->T(ILjava/lang/String;Ljava/lang/String;)I

    move-result v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_a

    if-nez v9, :cond_8

    move-object v2, v1

    iget-object v1, v2, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lv7/f2;->b(Landroid/content/Context;)J

    move-result-wide v12

    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lv7/f2;->c(Landroid/content/Context;)J

    move-result-wide v3

    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lv7/f2;->a(Landroid/content/Context;)D

    move-result-wide v14

    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v16, v7

    move/from16 v17, v8

    invoke-static {v0}, Lv7/f2;->d(Landroid/content/Context;)J

    move-result-wide v7

    move-wide/from16 v18, v12

    move-object/from16 v0, v16

    :goto_3
    int-to-long v11, v5

    cmp-long v11, v11, v18

    if-gtz v11, :cond_7

    move-wide v12, v3

    :try_start_3
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v4, "callingPackage"

    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v4, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/android/billingclient/api/b;->l(Lcom/android/billingclient/api/b;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Lcom/android/billingclient/api/b;->m(Lcom/android/billingclient/api/b;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1}, Lcom/android/billingclient/api/b;->L0(Lcom/android/billingclient/api/b;)Ljava/lang/Long;

    move-result-object v20
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    move-wide/from16 v21, v7

    :try_start_4
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v0, v4, v9, v6, v7}, Lcom/google/android/gms/internal/play_billing/m0;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)Landroid/os/Bundle;

    invoke-static {v1}, Lcom/android/billingclient/api/b;->H0(Lcom/android/billingclient/api/b;)Lv7/i;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v1}, Lcom/android/billingclient/api/b;->H0(Lcom/android/billingclient/api/b;)Lv7/i;

    move-result-object v4

    invoke-virtual {v4}, Lv7/i;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "enablePendingPurchases"

    const/4 v6, 0x1

    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_6

    :catch_0
    move-exception v0

    move v4, v5

    const/4 v6, 0x1

    :goto_4
    const/16 v9, 0x19

    goto :goto_9

    :catch_1
    move-exception v0

    move v4, v5

    :goto_5
    move/from16 v7, v17

    goto/16 :goto_b

    :cond_4
    :goto_6
    invoke-static {v1}, Lcom/android/billingclient/api/b;->H0(Lcom/android/billingclient/api/b;)Lv7/i;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    if-eqz v4, :cond_5

    :try_start_5
    invoke-static {v1}, Lcom/android/billingclient/api/b;->H0(Lcom/android/billingclient/api/b;)Lv7/i;

    move-result-object v4

    invoke-virtual {v4}, Lv7/i;->b()Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "enablePendingPurchaseForSubscriptions"
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const/4 v6, 0x1

    :try_start_6
    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_8

    :catch_2
    move-exception v0

    :goto_7
    move v4, v5

    goto :goto_4

    :catch_3
    move-exception v0

    const/4 v6, 0x1

    goto :goto_7

    :cond_5
    const/4 v6, 0x1

    :goto_8
    invoke-static {v1}, Lcom/android/billingclient/api/b;->v0(Lcom/android/billingclient/api/b;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    move-object v4, v0

    new-instance v0, Lv7/q0;
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move-object v8, v4

    move v4, v5

    const/4 v5, 0x0

    :try_start_7
    invoke-direct/range {v0 .. v5}, Lv7/q0;-><init>(Lcom/android/billingclient/api/b;Lv7/p0;Ljava/lang/Boolean;ILv7/s0;)V
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    const/16 v9, 0x19

    :try_start_8
    invoke-interface {v10, v9, v7, v8, v0}, Lcom/google/android/gms/internal/play_billing/f;->D1(ILjava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/play_billing/c;)V
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto/16 :goto_17

    :catch_4
    move-exception v0

    goto :goto_9

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v0

    goto :goto_4

    :catch_7
    move-exception v0

    move v4, v5

    move-wide/from16 v21, v7

    goto :goto_4

    :goto_9
    if-eqz v11, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Transient error during initialize(), retrying in "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, "ms"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "BillingClient"

    invoke-static {v5, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :try_start_9
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_8

    long-to-double v7, v12

    mul-double/2addr v7, v14

    move-object v13, v10

    move-wide/from16 v11, v21

    long-to-double v9, v11

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(DD)D

    move-result-wide v7

    double-to-long v7, v7

    add-int/lit8 v5, v4, 0x1

    move-wide v3, v7

    move-wide v7, v11

    move-object v10, v13

    goto/16 :goto_3

    :catch_8
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    move/from16 v7, v17

    invoke-virtual {v2, v0, v7, v4}, Lv7/p0;->l(Ljava/lang/Exception;ZI)V

    goto/16 :goto_17

    :cond_6
    :goto_a
    move/from16 v7, v17

    goto :goto_c

    :goto_b
    invoke-virtual {v2, v0, v7, v4}, Lv7/p0;->l(Ljava/lang/Exception;ZI)V

    goto/16 :goto_17

    :cond_7
    move v4, v5

    goto :goto_a

    :goto_c
    invoke-virtual {v2, v0, v7, v4}, Lv7/p0;->l(Ljava/lang/Exception;ZI)V

    goto/16 :goto_17

    :cond_8
    move-object v13, v2

    move-object v2, v1

    move-object v1, v13

    move-object/from16 v16, v7

    move v7, v8

    move-object v13, v10

    const/16 v8, 0x1c

    move v10, v4

    move v9, v8

    :goto_d
    if-lt v9, v4, :cond_b

    :try_start_a
    const-string v10, "BillingClient"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "trying subs apiVersion: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_9

    const-string v10, "subs"

    invoke-interface {v13, v9, v0, v10}, Lcom/google/android/gms/internal/play_billing/f;->T(ILjava/lang/String;Ljava/lang/String;)I

    move-result v10

    goto :goto_e

    :catch_9
    move-exception v0

    move v5, v7

    goto/16 :goto_16

    :cond_9
    const-string v10, "subs"

    invoke-interface {v13, v9, v0, v10, v1}, Lcom/google/android/gms/internal/play_billing/f;->W1(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result v10

    :goto_e
    if-nez v10, :cond_a

    const-string v11, "BillingClient"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "highestLevelSupportedForSubs: "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_f

    :cond_a
    add-int/lit8 v9, v9, -0x1

    goto :goto_d

    :cond_b
    move v9, v5

    :goto_f
    iget-object v11, v2, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    const/4 v12, 0x5

    if-lt v9, v12, :cond_c

    move v12, v6

    goto :goto_10

    :cond_c
    move v12, v5

    :goto_10
    invoke-static {v11, v12}, Lcom/android/billingclient/api/b;->H(Lcom/android/billingclient/api/b;Z)V

    if-lt v9, v4, :cond_d

    goto :goto_11

    :cond_d
    move v6, v5

    :goto_11
    invoke-static {v11, v6}, Lcom/android/billingclient/api/b;->I(Lcom/android/billingclient/api/b;Z)V

    if-ge v9, v4, :cond_e

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->j:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v6, "BillingClient"

    const-string v9, "In-app billing API does not support subscription on this device."

    invoke-static {v6, v9}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    :goto_12
    if-lt v8, v4, :cond_11

    const-string v6, "BillingClient"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "trying inapp apiVersion: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_f

    const-string v6, "inapp"

    invoke-interface {v13, v8, v0, v6}, Lcom/google/android/gms/internal/play_billing/f;->T(ILjava/lang/String;Ljava/lang/String;)I

    move-result v6

    :goto_13
    move v10, v6

    goto :goto_14

    :cond_f
    const-string v6, "inapp"

    invoke-interface {v13, v8, v0, v6, v1}, Lcom/google/android/gms/internal/play_billing/f;->W1(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result v6

    goto :goto_13

    :goto_14
    if-nez v10, :cond_10

    invoke-static {v11, v8}, Lcom/android/billingclient/api/b;->F(Lcom/android/billingclient/api/b;I)V

    const-string v0, "BillingClient"

    invoke-static {v11}, Lcom/android/billingclient/api/b;->Z(Lcom/android/billingclient/api/b;)I

    move-result v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "mHighestLevelSupportedForInApp: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_15

    :cond_10
    add-int/lit8 v8, v8, -0x1

    goto :goto_12

    :cond_11
    :goto_15
    invoke-static {v11}, Lcom/android/billingclient/api/b;->Z(Lcom/android/billingclient/api/b;)I

    move-result v0

    invoke-static {v11, v0}, Lcom/android/billingclient/api/b;->N(Lcom/android/billingclient/api/b;I)V

    invoke-static {v11}, Lcom/android/billingclient/api/b;->Z(Lcom/android/billingclient/api/b;)I

    move-result v0

    if-ge v0, v4, :cond_12

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->K:Lcom/google/android/gms/internal/play_billing/s7;

    const-string v0, "BillingClient"

    const-string v1, "In-app billing API version 3 is not supported on this device."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    invoke-static {v11, v10}, Lcom/android/billingclient/api/b;->P(Lcom/android/billingclient/api/b;I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    if-nez v10, :cond_13

    invoke-virtual {v2, v7, v5}, Lv7/p0;->j(ZI)V

    sget-object v0, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    invoke-virtual {v2, v0}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    goto :goto_17

    :cond_13
    sget-object v2, Lcom/android/billingclient/api/h;->b:Lcom/android/billingclient/api/d;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move v5, v7

    invoke-virtual/range {v1 .. v6}, Lv7/p0;->i(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V

    move-object v0, v2

    move-object v2, v1

    invoke-virtual {v2, v0}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    goto :goto_17

    :goto_16
    invoke-virtual {v2, v0, v5}, Lv7/p0;->m(Ljava/lang/Exception;Z)V

    goto :goto_17

    :catch_a
    move-exception v0

    move-object v2, v1

    move-object/from16 v16, v7

    move v5, v8

    invoke-virtual {v2, v0, v5}, Lv7/p0;->m(Ljava/lang/Exception;Z)V

    :goto_17
    return-object v16

    :catchall_1
    move-exception v0

    :try_start_b
    monitor-exit v9
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    throw v0

    :goto_18
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    throw v0
.end method

.method public static synthetic b(Lv7/p0;)V
    .locals 4

    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->y:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v2, Lcom/android/billingclient/api/h;->k:Lcom/android/billingclient/api/d;

    iget v3, p0, Lv7/p0;->d:I

    invoke-static {v0, v1, v2, v3}, Lcom/android/billingclient/api/b;->M(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    invoke-virtual {p0, v2}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public static bridge synthetic c(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lv7/p0;->i(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V

    return-void
.end method

.method public static bridge synthetic d(Lv7/p0;ZI)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv7/p0;->j(ZI)V

    return-void
.end method

.method public static bridge synthetic e(Lv7/p0;Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv7/p0;->b:Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->d()Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->e()Lcom/google/android/gms/internal/play_billing/z;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()Z
    .locals 1

    iget v0, p0, Lv7/p0;->d:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h(Z)Ljava/lang/Long;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {p1}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lv7/p0;->b:Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->f()Lcom/google/android/gms/internal/play_billing/z;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/z;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    monitor-exit p1

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit p1

    return-object v0

    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {p1}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lv7/p0;->c:Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/z;->f()Lcom/google/android/gms/internal/play_billing/z;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/z;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    monitor-exit p1

    return-object v1

    :catchall_2
    move-exception v1

    goto :goto_1

    :cond_2
    monitor-exit p1

    goto :goto_3

    :goto_1
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    const-string v1, "BillingClient"

    const-string v2, "Exception getting connection establishment duration."

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-object v0
.end method

.method public final i(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/q7;->t(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/q7;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/q7;->s(Lcom/google/android/gms/internal/play_billing/s7;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/play_billing/q7;->q(I)Lcom/google/android/gms/internal/play_billing/q7;

    if-eqz p3, :cond_0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/play_billing/q7;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p0, p4}, Lv7/p0;->h(Z)Ljava/lang/Long;

    move-result-object p1

    if-eqz p4, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object p2

    iget p3, p0, Lv7/p0;->d:I

    if-lez p3, :cond_1

    const/4 p4, 0x1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {p2, p5}, Lcom/google/android/gms/internal/play_billing/n9;->r(I)Lcom/google/android/gms/internal/play_billing/n9;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/n9;->q(J)Lcom/google/android/gms/internal/play_billing/n9;

    :cond_2
    iget-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l7;->E()Lcom/google/android/gms/internal/play_billing/j7;

    move-result-object p3

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/play_billing/j7;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/j7;

    const/4 p4, 0x6

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/play_billing/j7;->t(I)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/play_billing/j7;->s(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/l7;

    invoke-static {p1, p2}, Lcom/android/billingclient/api/b;->K(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/l7;)V

    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i9;->B()Lcom/google/android/gms/internal/play_billing/f9;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/f9;->o(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/f9;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/f9;->p(J)Lcom/google/android/gms/internal/play_billing/f9;

    :cond_4
    iget-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {p1}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/i9;

    invoke-interface {p1, p2}, Lv7/i1;->i(Lcom/google/android/gms/internal/play_billing/i9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final j(ZI)V
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1}, Lv7/p0;->h(Z)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p7;->C()Lcom/google/android/gms/internal/play_billing/n7;

    move-result-object p1

    const/4 v2, 0x6

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/play_billing/n7;->s(I)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object v2

    iget v3, p0, Lv7/p0;->d:I

    if-lez v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/play_billing/n9;->r(I)Lcom/google/android/gms/internal/play_billing/n9;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/play_billing/n9;->q(J)Lcom/google/android/gms/internal/play_billing/n9;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p2, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/play_billing/n7;->r(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p7;

    invoke-static {p2, p1}, Lcom/android/billingclient/api/b;->L(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/p7;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i9;->B()Lcom/google/android/gms/internal/play_billing/f9;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/q7;->t(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/play_billing/q7;->q(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/play_billing/f9;->o(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/f9;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/f9;->p(J)Lcom/google/android/gms/internal/play_billing/f9;

    :cond_3
    iget-object p2, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {p2}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/i9;

    invoke-interface {p2, p1}, Lv7/i1;->i(Lcom/google/android/gms/internal/play_billing/i9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    const-string p2, "BillingClient"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final k(Lcom/android/billingclient/api/d;)V
    .locals 3

    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lv7/p0;->a:Lv7/d;

    invoke-interface {v0, p1}, Lv7/d;->a(Lcom/android/billingclient/api/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Exception while calling onBillingSetupFinished."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final l(Ljava/lang/Exception;ZI)V
    .locals 7

    const-string v0, "BillingClient"

    const-string v1, "Exception while invoking initialize AIDL method"

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of v0, p1, Landroid/os/DeadObjectException;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->C1:Lcom/google/android/gms/internal/play_billing/s7;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroid/os/RemoteException;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->E1:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/SecurityException;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->D1:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->B1:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :goto_1
    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->F0(Ljava/lang/Exception;)Lcom/android/billingclient/api/d;

    move-result-object v2

    move-object v1, p0

    move v5, p2

    move v6, p3

    invoke-virtual/range {v1 .. v6}, Lv7/p0;->i(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->F0(Ljava/lang/Exception;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public final m(Ljava/lang/Exception;Z)V
    .locals 7

    const-string v0, "BillingClient"

    const-string v1, "Exception while checking if billing is supported; try to reconnect"

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of v0, p1, Landroid/os/DeadObjectException;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->N0:Lcom/google/android/gms/internal/play_billing/s7;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroid/os/RemoteException;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->M0:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/SecurityException;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->O0:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->Q:Lcom/google/android/gms/internal/play_billing/s7;

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->Q:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lv7/h1;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v4, v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->F0(Ljava/lang/Exception;)Lcom/android/billingclient/api/d;

    move-result-object v2

    const/4 v6, 0x0

    move-object v1, p0

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Lv7/p0;->i(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->F0(Ljava/lang/Exception;)Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 5

    const-string p1, "BillingClient"

    const-string v0, "Billing service died."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l7;->E()Lcom/google/android/gms/internal/play_billing/j7;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->t(I)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->g1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/q7;->s(Lcom/google/android/gms/internal/play_billing/s7;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object v2

    iget v3, p0, Lv7/p0;->d:I

    if-lez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, p1

    :goto_0
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->s(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/l7;

    invoke-interface {v0, v1}, Lv7/i1;->j(Lcom/google/android/gms/internal/play_billing/l7;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x7;->C()Lcom/google/android/gms/internal/play_billing/x7;

    move-result-object v1

    invoke-interface {v0, v1}, Lv7/i1;->m(Lcom/google/android/gms/internal/play_billing/x7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    const-string v1, "BillingClient"

    const-string v2, "Unable to log."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_1
    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {v0, p1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    invoke-static {v0}, Lcom/android/billingclient/api/b;->Q(Lcom/android/billingclient/api/b;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object p1, p0, Lv7/p0;->a:Lv7/d;

    invoke-interface {p1}, Lv7/d;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Exception while calling onBillingServiceDisconnected."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_3
    :try_start_3
    monitor-exit v1

    :goto_4
    return-void

    :goto_5
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 8

    const-string p1, "BillingClient"

    const-string v0, "Billing service connected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {p1}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/e;->u2(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/f;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/b;->G(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/f;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v2, Lv7/n0;

    invoke-direct {v2, p0}, Lv7/n0;-><init>(Lv7/p0;)V

    new-instance v5, Lv7/o0;

    invoke-direct {v5, p0}, Lv7/o0;-><init>(Lv7/p0;)V

    invoke-static {p1}, Lcom/android/billingclient/api/b;->y0(Lcom/android/billingclient/api/b;)Landroid/os/Handler;

    move-result-object v6

    invoke-virtual {p1}, Lcom/android/billingclient/api/b;->n()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const-wide/16 v3, 0x7530

    invoke-static/range {v2 .. v7}, Lcom/android/billingclient/api/b;->o(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p2

    if-nez p2, :cond_1

    iget p2, p0, Lv7/p0;->d:I

    invoke-static {p1}, Lcom/android/billingclient/api/b;->E0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/d;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->z:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-static {p1, v1, v0, p2}, Lcom/android/billingclient/api/b;->M(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s7;Lcom/android/billingclient/api/d;I)V

    invoke-virtual {p0, v0}, Lv7/p0;->k(Lcom/android/billingclient/api/d;)V

    :cond_1
    return-void

    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    const-string p1, "BillingClient"

    const-string v0, "Billing service disconnected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l7;->E()Lcom/google/android/gms/internal/play_billing/j7;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->t(I)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s7;->f1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/q7;->s(Lcom/google/android/gms/internal/play_billing/s7;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/p9;->B()Lcom/google/android/gms/internal/play_billing/n9;

    move-result-object v2

    iget v3, p0, Lv7/p0;->d:I

    if-lez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, p1

    :goto_0
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/play_billing/n9;->o(Z)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/n9;->p(I)Lcom/google/android/gms/internal/play_billing/n9;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j7;->s(Lcom/google/android/gms/internal/play_billing/n9;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/l7;

    invoke-interface {v0, v1}, Lv7/i1;->j(Lcom/google/android/gms/internal/play_billing/l7;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/android/billingclient/api/b;->C0(Lcom/android/billingclient/api/b;)Lv7/i1;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m9;->C()Lcom/google/android/gms/internal/play_billing/m9;

    move-result-object v1

    invoke-interface {v0, v1}, Lv7/i1;->a(Lcom/google/android/gms/internal/play_billing/m9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    const-string v1, "BillingClient"

    const-string v2, "Unable to log."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    iget-object v0, p0, Lv7/p0;->e:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_1
    iget-object v2, p0, Lv7/p0;->c:Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/z;->d()Lcom/google/android/gms/internal/play_billing/z;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/z;->e()Lcom/google/android/gms/internal/play_billing/z;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    monitor-exit v1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_2
    invoke-static {v0, p1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p1, p0, Lv7/p0;->a:Lv7/d;

    invoke-interface {p1}, Lv7/d;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Exception while calling onBillingServiceDisconnected."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
