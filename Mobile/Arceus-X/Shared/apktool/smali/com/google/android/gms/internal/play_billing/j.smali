.class public final Lcom/google/android/gms/internal/play_billing/j;
.super Lcom/google/android/gms/internal/play_billing/g;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/m;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/g;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final f1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/o;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/g;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lcom/google/android/gms/internal/play_billing/i;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/g;->t2(ILandroid/os/Parcel;)V

    return-void
.end method
