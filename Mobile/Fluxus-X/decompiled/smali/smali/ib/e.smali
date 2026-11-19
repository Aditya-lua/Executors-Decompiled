.class public final Lib/e;
.super Lib/a;
.source "SourceFile"

# interfaces
.implements Lib/f;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-direct {p0, p1, v0}, Lib/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final D1(Lib/a0;)V
    .locals 1

    invoke-virtual {p0}, Lib/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lib/v;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x4b

    invoke-virtual {p0, p1, v0}, Lib/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final k2(Lib/r;)V
    .locals 1

    invoke-virtual {p0}, Lib/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lib/v;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, p1, v0}, Lib/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final q2(Z)V
    .locals 1

    invoke-virtual {p0}, Lib/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lib/v;->a(Landroid/os/Parcel;Z)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lib/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
