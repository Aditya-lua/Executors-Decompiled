.class public Lcom/android/billingclient/api/ProxyBillingActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "PlatformActivityProxy"
.end annotation


# instance fields
.field public a:Landroid/os/ResultReceiver;

.field public b:Z

.field public c:Z

.field public d:I

.field public e:J

.field public f:Z

.field public g:Lcom/android/billingclient/api/j;

.field public h:Lv7/i1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Lcom/google/android/gms/internal/play_billing/s7;
    .locals 0

    if-nez p2, :cond_4

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    if-eqz p1, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->n1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->m1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->l1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->k1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->j1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_4
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_5

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->w:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_5
    const/4 p2, 0x5

    if-ne p1, p2, :cond_6

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->J1:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1

    :cond_6
    sget-object p1, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    return-object p1
.end method

.method public final b(Landroid/os/Bundle;)Z
    .locals 1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "IN_APP_MESSAGE_INTENT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    const-string v0, "in_app_message_result_receiver"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final c(ILandroid/content/Intent;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/billingclient/api/ProxyBillingActivity;->a(ILandroid/content/Intent;)Lcom/google/android/gms/internal/play_billing/s7;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s7;->b:Lcom/google/android/gms/internal/play_billing/s7;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "ALTERNATIVE_BILLING_USER_CHOICE_DATA"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public final f(Lcom/google/android/gms/internal/play_billing/s7;JZ)Landroid/content/Intent;
    .locals 6

    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->g()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "FAILURE_LOGGING_PAYLOAD"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "DEBUG_MESSAGE"

    const-string v5, "RESPONSE_CODE"

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->d()Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {p4}, Lcom/android/billingclient/api/j;->a()Lcom/android/billingclient/api/d;

    move-result-object p4

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {p1}, Lcom/android/billingclient/api/j;->a()Lcom/android/billingclient/api/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p4

    invoke-virtual {v0, v5, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->d()Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {p4}, Lcom/android/billingclient/api/j;->c()Z

    move-result p4

    if-nez p4, :cond_1

    const/4 p1, 0x3

    invoke-virtual {v0, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p4, "Play Store is blocked."

    invoke-virtual {v0, v4, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/android/billingclient/api/d;->d()Lcom/android/billingclient/api/d$a;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/android/billingclient/api/d$a;->d(I)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v4, p4}, Lcom/android/billingclient/api/d$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v4}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object p1

    sget-object p4, Lcom/google/android/gms/internal/play_billing/s7;->M1:Lcom/google/android/gms/internal/play_billing/s7;

    sget v4, Lv7/h1;->a:I

    sget-object v4, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-static {p4, v3, p1, v2, v4}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/c3;->b()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const/4 p4, 0x6

    invoke-virtual {v0, v5, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v5, "An internal error occurred."

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/android/billingclient/api/d;->d()Lcom/android/billingclient/api/d$a;

    move-result-object v4

    invoke-virtual {v4, p4}, Lcom/android/billingclient/api/d$a;->d(I)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v4, v5}, Lcom/android/billingclient/api/d$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;

    invoke-virtual {v4}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object p4

    sget v4, Lv7/h1;->a:I

    sget-object v4, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-static {p1, v3, p4, v2, v4}, Lv7/h1;->b(Lcom/google/android/gms/internal/play_billing/s7;ILcom/android/billingclient/api/d;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/l7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/c3;->b()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    :goto_0
    const-string p1, "INTENT_SOURCE"

    const-string p4, "LAUNCH_BILLING_FLOW"

    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "billingClientTransactionId"

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-boolean p1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->f:Z

    const-string p2, "wasServiceAutoReconnected"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public final g()Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public final declared-synchronized h()V
    .locals 8

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/android/billingclient/api/j;

    iget-object v1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->h:Lv7/i1;

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/j;-><init>(Lv7/i1;)V

    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    const-string v5, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v2, p0

    :try_start_1
    invoke-static/range {v2 .. v7}, Ll2/b;->n(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_0
    move-object v2, p0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_0

    :goto_1
    const/4 v1, 0x0

    :try_start_2
    iput-object v1, v2, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    instance-of v1, v0, Ljava/lang/NoSuchMethodError;

    if-eqz v1, :cond_0

    iget-object v1, v2, Lcom/android/billingclient/api/ProxyBillingActivity;->h:Lv7/i1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e9;->B()Lcom/google/android/gms/internal/play_billing/b9;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/play_billing/b9;->o(I)Lcom/google/android/gms/internal/play_billing/b9;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/play_billing/e9;

    invoke-interface {v1, v3}, Lv7/i1;->d(Lcom/google/android/gms/internal/play_billing/e9;)V

    goto :goto_2

    :cond_0
    iget-object v1, v2, Lcom/android/billingclient/api/ProxyBillingActivity;->h:Lv7/i1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e9;->B()Lcom/google/android/gms/internal/play_billing/b9;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/play_billing/b9;->o(I)Lcom/google/android/gms/internal/play_billing/b9;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/play_billing/e9;

    invoke-interface {v1, v3}, Lv7/i1;->d(Lcom/google/android/gms/internal/play_billing/e9;)V

    :goto_2
    const-string v1, "ProxyBillingActivity"

    const-string v3, "Failed to register receiver."

    invoke-static {v1, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x64

    const/16 v1, 0x6e

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "ProxyBillingActivity"

    if-eq p1, v0, :cond_4

    if-ne p1, v1, :cond_1

    if-nez p3, :cond_0

    :goto_0
    move v0, v2

    goto :goto_2

    :cond_0
    move v0, v3

    goto :goto_2

    :cond_1
    const/16 p2, 0x65

    if-ne p1, p2, :cond_3

    invoke-static {p3, v4}, Lcom/google/android/gms/internal/play_billing/m0;->a(Landroid/content/Intent;Ljava/lang/String;)I

    move-result p1

    iget-object p2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->a:Landroid/os/ResultReceiver;

    if-eqz p2, :cond_d

    if-nez p3, :cond_2

    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    :goto_1
    invoke-virtual {p2, p1, p3}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    goto/16 :goto_7

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Got onActivityResult with wrong requestCode: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; skipping..."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_4
    if-nez p3, :cond_0

    goto :goto_0

    :goto_2
    invoke-static {p3, v4}, Lcom/google/android/gms/internal/play_billing/m0;->h(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/android/billingclient/api/d;->c()I

    move-result v5

    const/4 v6, -0x1

    if-ne p2, v6, :cond_5

    if-eqz v5, :cond_6

    move p2, v6

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Activity finished with resultCode "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " and billing\'s responseCode: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    move v6, p2

    :cond_6
    if-eq v3, v0, :cond_7

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Got null data with resultCode "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "!"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_8

    const-string p2, "Got null bundle!"

    invoke-static {v4, p2}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_3
    invoke-virtual {p0, v6, p3}, Lcom/android/billingclient/api/ProxyBillingActivity;->c(ILandroid/content/Intent;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p0, v6, p3}, Lcom/android/billingclient/api/ProxyBillingActivity;->a(ILandroid/content/Intent;)Lcom/google/android/gms/internal/play_billing/s7;

    move-result-object p2

    iget-wide v4, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    if-nez p3, :cond_9

    move p3, v3

    goto :goto_4

    :cond_9
    move p3, v2

    :goto_4
    invoke-virtual {p0, p2, v4, v5, p3}, Lcom/android/billingclient/api/ProxyBillingActivity;->f(Lcom/google/android/gms/internal/play_billing/s7;JZ)Landroid/content/Intent;

    move-result-object p2

    goto :goto_6

    :cond_a
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const-string v0, "ALTERNATIVE_BILLING_USER_CHOICE_DATA"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "LAUNCH_BILLING_FLOW"

    const-string v4, "INTENT_SOURCE"

    if-eqz p2, :cond_b

    invoke-virtual {p0, p2}, Lcom/android/billingclient/api/ProxyBillingActivity;->e(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_5

    :cond_b
    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->g()Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_5
    iget-wide v4, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    const-string p3, "billingClientTransactionId"

    invoke-virtual {p2, p3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-boolean p3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->f:Z

    const-string v0, "wasServiceAutoReconnected"

    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_6
    if-ne p1, v1, :cond_c

    const-string p1, "IS_FIRST_PARTY_PURCHASE"

    invoke-virtual {p2, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_c
    invoke-virtual {p0, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_d
    :goto_7
    iput-boolean v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->d()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {p1}, Lcom/android/billingclient/api/j;->b()V

    :cond_e
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 13

    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p1}, Lcom/android/billingclient/api/ProxyBillingActivity;->b(Landroid/os/Bundle;)Z

    move-result v0

    const-string v9, "ProxyBillingActivity"

    const/4 v10, 0x0

    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "Failed to get package info for current package."

    invoke-static {v9, v3, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, -0x1

    :goto_0
    iget-object v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->h:Lv7/i1;

    if-nez v3, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h8;->L()Lcom/google/android/gms/internal/play_billing/e8;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/e8;->v(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    const-string v5, "9.0.0"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/play_billing/e8;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->p(I)Lcom/google/android/gms/internal/play_billing/e8;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/e8;->o(I)Lcom/google/android/gms/internal/play_billing/e8;

    const-wide/32 v5, 0x365f4650

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/e8;->t(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/h8;

    new-instance v4, Lv7/m1;

    invoke-direct {v4, v3, v0}, Lv7/m1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/h8;)V

    iput-object v4, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->h:Lv7/i1;

    :cond_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->h()V

    :cond_1
    const/16 v0, 0x64

    const-string v3, "in_app_message_result_receiver"

    const-string v4, "IS_FLOW_FROM_FIRST_PARTY_CLIENT"

    const-string v5, "wasServiceAutoReconnected"

    const-string v6, "billingClientTransactionId"

    if-nez p1, :cond_b

    const-string v2, "Launching Play Store billing flow"

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    iput v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "BUY_INTENT"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v4, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    iput-boolean v12, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->c:Z

    const/16 v2, 0x6e

    iput v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "IN_APP_MESSAGE_INTENT"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/ResultReceiver;

    iput-object v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->a:Landroid/os/ResultReceiver;

    const/16 v2, 0x65

    iput v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    goto :goto_1

    :cond_3
    move-object v0, v11

    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v5, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->f:Z

    :cond_6
    :try_start_1
    iput-boolean v12, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x24

    if-lt v2, v3, :cond_7

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    :goto_2
    move-object v8, v2

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_7
    const/16 v3, 0x22

    if-lt v2, v3, :cond_8

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    goto :goto_2

    :cond_8
    move-object v8, v11

    :goto_3
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    iget v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :goto_4
    const-string v2, "Got exception while trying to start a purchase flow."

    invoke-static {v9, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->a:Landroid/os/ResultReceiver;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v10, v11}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    goto :goto_5

    :cond_9
    sget-object v0, Lcom/google/android/gms/internal/play_billing/s7;->H1:Lcom/google/android/gms/internal/play_billing/s7;

    iget-wide v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    invoke-virtual {p0, v0, v2, v3, v10}, Lcom/android/billingclient/api/ProxyBillingActivity;->f(Lcom/google/android/gms/internal/play_billing/s7;JZ)Landroid/content/Intent;

    move-result-object v0

    iget-boolean v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->c:Z

    if-eqz v2, :cond_a

    const-string v2, "IS_FIRST_PARTY_PURCHASE"

    invoke-virtual {v0, v2, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_a
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :goto_5
    iput-boolean v10, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_b
    const-string v7, "Launching Play Store billing flow from savedInstanceState"

    invoke-static {v9, v7}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "send_cancelled_broadcast_if_finished"

    invoke-virtual {p1, v7, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    iput-boolean v7, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/os/ResultReceiver;

    iput-object v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->a:Landroid/os/ResultReceiver;

    :cond_c
    invoke-virtual {p1, v4, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->c:Z

    const-string v3, "activity_code"

    invoke-virtual {p1, v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    :cond_d
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->f:Z

    :cond_e
    :goto_6
    return-void
.end method

.method public onDestroy()V
    .locals 6

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {v0}, Lcom/android/billingclient/api/j;->a()Lcom/android/billingclient/api/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->g:Lcom/android/billingclient/api/j;

    invoke-virtual {p0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "ProxyBillingActivity"

    const-string v3, "Failed to unregister receiver."

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    iget-boolean v1, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/android/billingclient/api/ProxyBillingActivity;->g()Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "DEBUG_MESSAGE"

    const-string v4, "RESPONSE_CODE"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "Billing dialog closed."

    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->c:Z

    if-eqz v0, :cond_3

    const-string v0, "IS_FIRST_PARTY_PURCHASE"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_3
    iget v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    const/16 v2, 0x6e

    if-eq v0, v2, :cond_4

    const/16 v2, 0x64

    if-ne v0, v2, :cond_5

    :cond_4
    const-string v0, "INTENT_SOURCE"

    const-string v2, "LAUNCH_BILLING_FLOW"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-wide v2, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    const-string v0, "billingClientTransactionId"

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :cond_5
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->a:Landroid/os/ResultReceiver;

    if-eqz v0, :cond_0

    const-string v1, "in_app_message_result_receiver"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->b:Z

    const-string v1, "send_cancelled_broadcast_if_finished"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->c:Z

    const-string v1, "IS_FLOW_FROM_FIRST_PARTY_CLIENT"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->d:I

    const-string v1, "activity_code"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-wide v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->e:J

    const-string v2, "billingClientTransactionId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, p0, Lcom/android/billingclient/api/ProxyBillingActivity;->f:Z

    const-string v1, "wasServiceAutoReconnected"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
