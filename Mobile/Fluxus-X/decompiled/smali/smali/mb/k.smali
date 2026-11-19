.class public Lmb/k;
.super Lib/o;
.source "SourceFile"

# interfaces
.implements Lmb/l;


# direct methods
.method public static s2(Landroid/os/IBinder;)Lmb/l;
    .locals 2

    const-string v0, "com.google.android.gms.location.IDeviceOrientationListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lmb/l;

    if-eqz v1, :cond_0

    check-cast v0, Lmb/l;

    return-object v0

    :cond_0
    new-instance v0, Lmb/j;

    invoke-direct {v0, p0}, Lmb/j;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
