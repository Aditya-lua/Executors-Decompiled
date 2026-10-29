.class public final Lcom/google/android/gms/internal/play_billing/a8;
.super Lcom/google/android/gms/internal/play_billing/p4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/c8;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d8;->C()Lcom/google/android/gms/internal/play_billing/d8;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/p4;-><init>(Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method


# virtual methods
.method public final o(Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/d8;->D(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/z7;)V

    return-object p0
.end method

.method public final p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/u7;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/d8;->E(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/u7;)V

    return-object p0
.end method

.method public final q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast p1, Lcom/google/android/gms/internal/play_billing/d8;

    const-string v0, "ProxyBillingBroadcastReceiver"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/d8;->F(Lcom/google/android/gms/internal/play_billing/d8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final r(Lcom/google/android/gms/internal/play_billing/e9;)Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/d8;->G(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/e9;)V

    return-object p0
.end method

.method public final s(I)Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/d8;->H(Lcom/google/android/gms/internal/play_billing/d8;I)V

    return-object p0
.end method
