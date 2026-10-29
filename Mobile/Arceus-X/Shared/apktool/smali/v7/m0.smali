.class public final Lv7/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/d;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/play_billing/t9;

.field public final synthetic b:Lcom/android/billingclient/api/b;


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/t9;)V
    .locals 0

    iput-object p2, p0, Lv7/m0;->a:Lcom/google/android/gms/internal/play_billing/t9;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/m0;->b:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;)V
    .locals 3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reconnection finished with result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv7/m0;->a:Lcom/google/android/gms/internal/play_billing/t9;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/t9;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "Exception setting completer."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lv7/m0;->b:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->B0(Lcom/android/billingclient/api/b;)Lv7/d;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lv7/l0;

    invoke-direct {v1, p0, p1}, Lv7/l0;-><init>(Lv7/m0;Lcom/android/billingclient/api/d;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/b;->R(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    const-string v0, "Reconnection attempt failed."

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv7/m0;->a:Lcom/google/android/gms/internal/play_billing/t9;

    sget-object v2, Lcom/android/billingclient/api/h;->j:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/t9;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "Exception setting completer."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lv7/m0;->b:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->B0(Lcom/android/billingclient/api/b;)Lv7/d;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lv7/k0;

    invoke-direct {v1, p0}, Lv7/k0;-><init>(Lv7/m0;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/b;->R(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
