.class public final Lv7/s;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Z

.field public final synthetic c:Lv7/t;


# direct methods
.method public constructor <init>(Lv7/t;Z)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/s;->c:Lv7/t;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-boolean p2, p0, Lv7/s;->b:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lv7/s;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    if-lt v0, v1, :cond_2

    iget-boolean v0, p0, Lv7/s;->b:Z

    if-eq v2, v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p1, p0, p2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_1
    iput-boolean v2, p0, Lv7/s;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized b(Landroid/content/Context;Landroid/content/IntentFilter;Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-boolean p3, p0, Lv7/s;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p3, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v3, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    const/16 v0, 0x21

    const/4 v6, 0x1

    if-lt p3, v0, :cond_2

    iget-boolean p3, p0, Lv7/s;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eq v6, p3, :cond_1

    const/4 p3, 0x4

    :goto_0
    move v5, p3

    goto :goto_1

    :cond_1
    const/4 p3, 0x2

    goto :goto_0

    :goto_1
    const/4 v4, 0x0

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    :try_start_2
    invoke-virtual/range {v0 .. v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v1, p0

    goto :goto_2

    :cond_2
    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    const/4 p1, 0x0

    invoke-virtual {v0, p0, v2, v3, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    :goto_3
    iput-boolean v6, v1, Lv7/s;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final c(Landroid/os/Bundle;Lcom/android/billingclient/api/d;ILcom/google/android/gms/internal/play_billing/z7;JZ)V
    .locals 2

    const-string v0, "FAILURE_LOGGING_PAYLOAD"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p2, p0, Lv7/s;->c:Lv7/t;

    invoke-static {p2}, Lv7/t;->b(Lv7/t;)Lv7/i1;

    move-result-object p2

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/l7;->G([B)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-interface {p2, p1, p5, p6, p7}, Lv7/i1;->l(Lcom/google/android/gms/internal/play_billing/l7;JZ)V

    return-void

    :cond_0
    iget-object p1, p0, Lv7/s;->c:Lv7/t;

    invoke-static {p1}, Lv7/t;->b(Lv7/t;)Lv7/i1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->x:Lcom/google/android/gms/internal/play_billing/s7;

    const/4 v1, 0x0

    invoke-static {v0, p3, p2, v1, p4}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p2

    invoke-interface {p1, p2, p5, p6, p7}, Lv7/i1;->l(Lcom/google/android/gms/internal/play_billing/l7;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "BillingBroadcastManager"

    const-string p2, "Failed parsing Api failure."

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x58756162

    if-eq v0, v1, :cond_2

    const v1, -0x141f9074

    if-eq v0, v1, :cond_1

    const v1, 0x14937179

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->e:Lcom/google/android/gms/internal/play_billing/z7;

    :goto_0
    move-object v4, p1

    goto :goto_2

    :cond_1
    const-string v0, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->d:Lcom/google/android/gms/internal/play_billing/z7;

    goto :goto_0

    :cond_2
    const-string v0, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->c:Lcom/google/android/gms/internal/play_billing/z7;

    goto :goto_0

    :cond_3
    :goto_1
    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    goto :goto_0

    :goto_2
    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->d:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_4

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->e:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v0, v1

    move v3, v0

    goto :goto_4

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->c:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x20

    :goto_3
    move v3, v0

    move v0, v1

    goto :goto_4

    :cond_6
    const/4 v0, 0x1

    goto :goto_3

    :goto_4
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const/4 v8, 0x0

    const-string v9, "BillingBroadcastManager"

    if-nez v1, :cond_8

    const-string p1, "Bundle is null."

    invoke-static {v9, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lv7/s;->c:Lv7/t;

    invoke-static {p1}, Lv7/t;->b(Lv7/t;)Lv7/i1;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->l:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v1, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    invoke-static {v0, v3, v1, v8, v4}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object v0

    invoke-interface {p2, v0}, Lv7/i1;->j(Lcom/google/android/gms/internal/play_billing/l7;)V

    invoke-static {p1}, Lv7/t;->d(Lv7/t;)Lv7/m;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-static {p1}, Lv7/t;->d(Lv7/t;)Lv7/m;

    move-result-object p1

    invoke-interface {p1, v1, v8}, Lv7/m;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_7
    move-object v0, p0

    goto/16 :goto_8

    :cond_8
    const/4 v2, 0x0

    if-ne v3, v0, :cond_c

    sget v0, Lcom/google/android/gms/internal/play_billing/m0;->a:I

    invoke-static {}, Lcom/android/billingclient/api/d;->d()Lcom/android/billingclient/api/d$a;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v5, v9}, Lcom/google/android/gms/internal/play_billing/m0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/android/billingclient/api/d$a;->d(I)Lcom/android/billingclient/api/d$a;

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_9

    const-string v5, "Unexpected null bundle received!"

    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    move v5, v2

    goto :goto_6

    :cond_9
    const-string v6, "SUB_RESPONSE_CODE"

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_a

    const-string v5, "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK"

    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    instance-of v6, v5, Ljava/lang/Integer;

    if-eqz v6, :cond_b

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_6

    :cond_b
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Unexpected type for bundle sub response code: "

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    invoke-virtual {v0, v5}, Lcom/android/billingclient/api/d$a;->c(I)Lcom/android/billingclient/api/d$a;

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-static {p2, v9}, Lcom/google/android/gms/internal/play_billing/m0;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/billingclient/api/d$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object p2

    goto :goto_7

    :cond_c
    invoke-static {p2, v9}, Lcom/google/android/gms/internal/play_billing/m0;->h(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p2

    :goto_7
    const-string v0, "billingClientTransactionId"

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v0, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    const-string v0, "wasServiceAutoReconnected"

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->c:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_d
    move-object v0, p0

    move-object v2, p2

    goto :goto_9

    :cond_e
    sget-object p1, Lcom/google/android/gms/internal/play_billing/z7;->e:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_f

    move-object v0, p0

    move-object v2, p2

    invoke-virtual/range {v0 .. v7}, Lv7/s;->c(Landroid/os/Bundle;Lcom/android/billingclient/api/d;ILcom/google/android/gms/internal/play_billing/z7;JZ)V

    iget-object p1, v0, Lv7/s;->c:Lv7/t;

    invoke-static {p1}, Lv7/t;->d(Lv7/t;)Lv7/m;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Lv7/m;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_f
    move-object v0, p0

    iget-object p1, v0, Lv7/s;->c:Lv7/t;

    invoke-static {p1}, Lv7/t;->a(Lv7/t;)Lv7/c0;

    invoke-static {p1}, Lv7/t;->f(Lv7/t;)Lv7/q;

    invoke-static {p1}, Lv7/t;->c(Lv7/t;)Lv7/h;

    const-string p2, "No valid alternative billing listener is registered."

    invoke-static {v9, p2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lv7/t;->b(Lv7/t;)Lv7/i1;

    move-result-object p2

    sget-object v1, Lcom/google/android/gms/internal/play_billing/s7;->L1:Lcom/google/android/gms/internal/play_billing/s7;

    sget-object v2, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    invoke-static {v1, v3, v2, v8, v4}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object v1

    invoke-interface {p2, v1, v5, v6, v7}, Lv7/i1;->l(Lcom/google/android/gms/internal/play_billing/l7;JZ)V

    invoke-static {p1}, Lv7/t;->d(Lv7/t;)Lv7/m;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Lv7/m;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    :goto_8
    return-void

    :goto_9
    iget-object p1, v0, Lv7/s;->c:Lv7/t;

    invoke-static {p1}, Lv7/t;->g(Lv7/t;)Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/play_billing/m0;->k(Landroid/os/Bundle;Ljava/util/Set;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v2}, Lcom/android/billingclient/api/d;->c()I

    move-result v8

    if-nez v8, :cond_10

    invoke-static {p1}, Lv7/t;->b(Lv7/t;)Lv7/i1;

    move-result-object v1

    invoke-static {v3, v4}, Lv7/h1;->c(ILcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/p7;

    move-result-object v3

    invoke-interface {v1, v3, v5, v6, v7}, Lv7/i1;->g(Lcom/google/android/gms/internal/play_billing/p7;JZ)V

    goto :goto_a

    :cond_10
    invoke-virtual/range {v0 .. v7}, Lv7/s;->c(Landroid/os/Bundle;Lcom/android/billingclient/api/d;ILcom/google/android/gms/internal/play_billing/z7;JZ)V

    :goto_a
    invoke-static {p1}, Lv7/t;->d(Lv7/t;)Lv7/m;

    move-result-object p1

    invoke-interface {p1, v2, p2}, Lv7/m;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method
