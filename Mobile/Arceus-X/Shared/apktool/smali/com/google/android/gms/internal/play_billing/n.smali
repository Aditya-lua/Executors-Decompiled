.class public abstract Lcom/google/android/gms/internal/play_billing/n;
.super Lcom/google/android/gms/internal/play_billing/h;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/h;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/h;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/play_billing/o;->a(I)V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
