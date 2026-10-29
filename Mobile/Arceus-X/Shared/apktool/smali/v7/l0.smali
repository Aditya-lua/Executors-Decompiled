.class public final synthetic Lv7/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv7/m0;

.field public final synthetic b:Lcom/android/billingclient/api/d;


# direct methods
.method public synthetic constructor <init>(Lv7/m0;Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/l0;->a:Lv7/m0;

    iput-object p2, p0, Lv7/l0;->b:Lcom/android/billingclient/api/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/l0;->a:Lv7/m0;

    iget-object v1, p0, Lv7/l0;->b:Lcom/android/billingclient/api/d;

    :try_start_0
    iget-object v0, v0, Lv7/m0;->b:Lcom/android/billingclient/api/b;

    invoke-static {v0}, Lcom/android/billingclient/api/b;->B0(Lcom/android/billingclient/api/b;)Lv7/d;

    move-result-object v0

    invoke-interface {v0, v1}, Lv7/d;->a(Lcom/android/billingclient/api/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "BillingClient"

    const-string v2, "Exception calling onBillingSetupFinished."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
