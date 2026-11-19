.class public final Lt9/i;
.super Lcb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"

    invoke-direct {p0, p1, v0}, Lcb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final u2(Lt9/h;Lt9/a;)V
    .locals 1

    invoke-virtual {p0}, Lcb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lcb/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2(Lt9/h;Lt9/a;Lt9/k;)V
    .locals 1

    invoke-virtual {p0}, Lcb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lcb/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w2(Lm9/g;Lt9/k;)V
    .locals 1

    invoke-virtual {p0}, Lcb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lcb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
