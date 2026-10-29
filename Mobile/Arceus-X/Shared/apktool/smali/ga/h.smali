.class public final Lga/h;
.super Lfb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesService"

    invoke-direct {p0, p1, v0}, Lfb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lga/g;J)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lfb/k0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2, p3}, Landroid/os/Parcel;->writeLong(J)V

    const/16 p1, 0x3c8d

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u2(J)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    const/16 p1, 0x1389

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2(Lga/e;)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lfb/k0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x138a

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w2(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v0, p2}, Lfb/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x138d

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final x2()V
    .locals 2

    const/16 v0, 0x138e

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final y2(Lga/e;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lfb/k0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v0, p4}, Lfb/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x13a0

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final z2(Lga/e;Z)V
    .locals 1

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lfb/k0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p1, 0x1771

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
