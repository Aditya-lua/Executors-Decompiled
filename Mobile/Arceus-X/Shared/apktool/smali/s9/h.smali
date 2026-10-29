.class public final Ls9/h;
.super Lbb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"

    invoke-direct {p0, p1, v0}, Lbb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final u2(Ls9/g;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V
    .locals 1

    invoke-virtual {p0}, Lbb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lbb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lbb/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lbb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2(Ls9/g;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;Ls9/j;)V
    .locals 1

    invoke-virtual {p0}, Lbb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lbb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lbb/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lbb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lbb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w2(Ll9/g;Ls9/j;)V
    .locals 1

    invoke-virtual {p0}, Lbb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lbb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lbb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lbb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
