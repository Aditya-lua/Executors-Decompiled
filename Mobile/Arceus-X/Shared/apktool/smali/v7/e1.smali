.class public final Lv7/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lv7/f1;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv7/e1;->a:Lcom/android/billingclient/api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string p1, "BillingClientTesting"

    const-string v0, "Billing Override Service connected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lv7/e1;->a:Lcom/android/billingclient/api/g;

    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/k;->u2(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/m;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/g;->S0(Lcom/android/billingclient/api/g;Lcom/google/android/gms/internal/play_billing/m;)V

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/g;->T0(Lcom/android/billingclient/api/g;I)V

    const/16 p2, 0x1a

    invoke-static {p1, p2}, Lcom/android/billingclient/api/g;->Z0(Lcom/android/billingclient/api/g;I)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClientTesting"

    const-string v0, "Billing Override Service disconnected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/m0;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lv7/e1;->a:Lcom/android/billingclient/api/g;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/g;->S0(Lcom/android/billingclient/api/g;Lcom/google/android/gms/internal/play_billing/m;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/g;->T0(Lcom/android/billingclient/api/g;I)V

    return-void
.end method
