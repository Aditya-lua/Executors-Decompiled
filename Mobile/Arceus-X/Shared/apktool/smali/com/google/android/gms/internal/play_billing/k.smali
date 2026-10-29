.class public abstract Lcom/google/android/gms/internal/play_billing/k;
.super Lcom/google/android/gms/internal/play_billing/h;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/m;


# direct methods
.method public static u2(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/m;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/m;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/m;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/j;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/j;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
