.class public final Lge/j0;
.super Lge/a;
.source "SourceFile"

# interfaces
.implements Lge/l0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-direct {p0, p1, v0}, Lge/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c0(Landroid/os/Bundle;Lge/n0;)V
    .locals 1

    invoke-virtual {p0}, Lge/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lge/f0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lge/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final p0(Landroid/os/Bundle;Lge/n0;)V
    .locals 1

    invoke-virtual {p0}, Lge/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lge/f0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lge/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
