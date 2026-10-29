.class public final Lhb/e;
.super Lhb/a;
.source "SourceFile"

# interfaces
.implements Lhb/f;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-direct {p0, p1, v0}, Lhb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final U(Lcom/google/android/gms/internal/location/zzl;)V
    .locals 1

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x4b

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final q2(Z)V
    .locals 1

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/t;->a(Landroid/os/Parcel;Z)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/location/zzbc;)V
    .locals 1

    invoke-virtual {p0}, Lhb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lhb/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, p1, v0}, Lhb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
