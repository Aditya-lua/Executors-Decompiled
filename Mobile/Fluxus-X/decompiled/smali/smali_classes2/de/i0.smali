.class public final Lde/i0;
.super Lde/g1;
.source "SourceFile"

# interfaces
.implements Lde/k0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService"

    invoke-direct {p0, p1, v0}, Lde/g1;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final V0(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lde/m0;)V
    .locals 1

    invoke-virtual {p0}, Lde/g1;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-static {v0, p3}, Lde/i1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lde/g1;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final l0(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lde/m0;)V
    .locals 1

    invoke-virtual {p0}, Lde/g1;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-static {v0, p3}, Lde/i1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lde/g1;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u1(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lde/m0;)V
    .locals 1

    invoke-virtual {p0}, Lde/g1;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-static {v0, p3}, Lde/i1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Lde/g1;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
