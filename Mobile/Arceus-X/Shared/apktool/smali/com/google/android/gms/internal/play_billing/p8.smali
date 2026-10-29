.class public final Lcom/google/android/gms/internal/play_billing/p8;
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

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/t8;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u8;->B()Lcom/google/android/gms/internal/play_billing/u8;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/p4;-><init>(Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method


# virtual methods
.method public final o(Z)Lcom/google/android/gms/internal/play_billing/p8;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/u8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/u8;->D(Lcom/google/android/gms/internal/play_billing/u8;Z)V

    return-object p0
.end method
