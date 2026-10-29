.class public final Lv7/q0;
.super Lcom/google/android/gms/internal/play_billing/b;
.source "SourceFile"


# instance fields
.field public final a:Lv7/p0;

.field public final b:Ljava/lang/Boolean;

.field public final c:I

.field public final synthetic d:Lcom/android/billingclient/api/b;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lv7/p0;Ljava/lang/Boolean;ILv7/s0;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/q0;->d:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/b;-><init>()V

    iput-object p2, p0, Lv7/q0;->a:Lv7/p0;

    iput-object p3, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iput p4, p0, Lv7/q0;->c:I

    return-void
.end method


# virtual methods
.method public final N1(Landroid/os/Bundle;)V
    .locals 10

    if-nez p1, :cond_0

    const-string v0, "BillingClient"

    const-string v2, "Response bundle is null."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lv7/q0;->a:Lv7/p0;

    iget-object v0, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iget v7, p0, Lv7/q0;->c:I

    sget-object v3, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->s1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lv7/q0;->u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V

    return-void

    :cond_0
    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "BillingClient"

    const-string v2, "Response bundle doesn\'t contain a response code"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lv7/q0;->a:Lv7/p0;

    iget-object v0, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iget v7, p0, Lv7/q0;->c:I

    sget-object v3, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->z1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lv7/q0;->u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V

    return-void

    :cond_1
    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv7/q0;->a:Lv7/p0;

    const-string v3, "RESPONSE_CODE"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "DEBUG_MESSAGE"

    const-string v5, ""

    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3

    iget-object v4, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    const-string v5, "RESPONSE_CODE"

    move-object v6, v4

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->A1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Response code from Phonesky: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v7, p0, Lv7/q0;->c:I

    move-object v1, p0

    move v5, v6

    move-object v6, v2

    move-object v2, v0

    invoke-virtual/range {v1 .. v7}, Lv7/q0;->u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V

    return-void

    :cond_2
    const-string v0, "BILLING_API_VERSION_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "BillingClient"

    const-string v2, "Billing API version not found in response bundle."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lv7/q0;->a:Lv7/p0;

    iget-object v0, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iget v7, p0, Lv7/q0;->c:I

    sget-object v3, Lcom/android/billingclient/api/h;->h:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->y1:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lv7/q0;->u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V

    return-void

    :cond_3
    const-string v0, "BILLING_API_VERSION_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lv7/q0;->d:Lcom/android/billingclient/api/b;

    invoke-static {v3, v0}, Lcom/android/billingclient/api/b;->N(Lcom/android/billingclient/api/b;I)V

    const/4 v4, 0x5

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lt v0, v4, :cond_4

    move v4, v5

    goto :goto_0

    :cond_4
    move v4, v6

    :goto_0
    invoke-static {v3, v4}, Lcom/android/billingclient/api/b;->H(Lcom/android/billingclient/api/b;Z)V

    const/4 v4, 0x3

    if-lt v0, v4, :cond_5

    goto :goto_1

    :cond_5
    move v5, v6

    :goto_1
    invoke-static {v3, v5}, Lcom/android/billingclient/api/b;->I(Lcom/android/billingclient/api/b;Z)V

    const-string v0, "EXPERIMENT_VALUES_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_6

    :try_start_0
    const-string v0, "DELEGATION_API_ENABLED_KEY"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lv7/l1;->g(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Error reading EnableDelegationApi experiment flag: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "BillingClient"

    invoke-static {v7, v5, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    :try_start_1
    const-string v0, "AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lv7/l1;->f(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "BillingClient"

    invoke-static {v7, v5, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    :try_start_2
    const-string v0, "AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lv7/l1;->d(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "BillingClient"

    invoke-static {v7, v5, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    :try_start_3
    const-string v0, "AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lv7/l1;->e(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: "

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "BillingClient"

    invoke-static {v5, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :goto_5
    const-string v0, "ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    new-instance v2, Lcom/google/android/gms/internal/play_billing/r0;

    invoke-direct {v2}, Lcom/google/android/gms/internal/play_billing/r0;-><init>()V

    invoke-static {}, Lv7/h2;->values()[Lv7/h2;

    move-result-object v3

    array-length v5, v3

    move v7, v6

    :goto_6
    if-ge v7, v5, :cond_9

    aget-object v8, v3, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/play_billing/r0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/r0;

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_9
    iget-object v0, p0, Lv7/q0;->d:Lcom/android/billingclient/api/b;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/r0;->c()Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/android/billingclient/api/b;->J(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/s0;)V

    invoke-static {v0}, Lcom/android/billingclient/api/b;->z0(Lcom/android/billingclient/api/b;)Lv7/t;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v0}, Lcom/android/billingclient/api/b;->z0(Lcom/android/billingclient/api/b;)Lv7/t;

    move-result-object v2

    invoke-static {v0}, Lcom/android/billingclient/api/b;->K0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object v0

    invoke-virtual {v2, v0}, Lv7/t;->i(Lcom/google/android/gms/internal/play_billing/s0;)V

    :cond_a
    :goto_7
    iget-object v0, p0, Lv7/q0;->d:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->Z(Lcom/android/billingclient/api/b;)I

    move-result v2

    if-ge v2, v4, :cond_b

    const-string v0, "BillingClient"

    const-string v2, "In-app billing API version 3 is not supported on this device."

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lv7/q0;->a:Lv7/p0;

    iget-object v0, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iget v7, p0, Lv7/q0;->c:I

    sget-object v3, Lcom/android/billingclient/api/h;->b:Lcom/android/billingclient/api/d;

    sget-object v4, Lcom/google/android/gms/internal/play_billing/s7;->K:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lv7/q0;->u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V

    return-void

    :cond_b
    iget-object v2, p0, Lv7/q0;->a:Lv7/p0;

    iget-object v3, p0, Lv7/q0;->b:Ljava/lang/Boolean;

    iget v5, p0, Lv7/q0;->c:I

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v0, v6}, Lcom/android/billingclient/api/b;->P(Lcom/android/billingclient/api/b;I)V

    invoke-static {v0}, Lcom/android/billingclient/api/b;->k(Lcom/android/billingclient/api/b;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    :try_start_4
    invoke-static {v0}, Lcom/android/billingclient/api/b;->u(Lcom/android/billingclient/api/b;)I

    move-result v0

    if-ne v0, v4, :cond_c

    monitor-exit v6

    return-void

    :catchall_4
    move-exception v0

    goto :goto_8

    :cond_c
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-static {v2, v3, v5}, Lv7/p0;->d(Lv7/p0;ZI)V

    sget-object v0, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    invoke-static {v2, v0}, Lv7/p0;->e(Lv7/p0;Lcom/android/billingclient/api/d;)V

    return-void

    :goto_8
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0
.end method

.method public final u2(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;ZLjava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lv7/q0;->d:Lcom/android/billingclient/api/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->O(Lcom/android/billingclient/api/b;I)V

    move-object v2, p5

    move p5, p4

    move-object p4, v2

    invoke-static/range {p1 .. p6}, Lv7/p0;->c(Lv7/p0;Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/s7;Ljava/lang/String;ZI)V

    invoke-static {p1, p2}, Lv7/p0;->e(Lv7/p0;Lcom/android/billingclient/api/d;)V

    return-void
.end method
