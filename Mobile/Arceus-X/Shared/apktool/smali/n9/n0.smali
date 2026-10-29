.class public final Ln9/n0;
.super Ldb/a;
.source "SourceFile"

# interfaces
.implements Ln9/p0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-direct {p0, p1, v0}, Ldb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final H1(Lcom/google/android/gms/common/zzp;)Lcom/google/android/gms/common/zzr;
    .locals 1

    invoke-virtual {p0}, Ldb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ldb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Ldb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/common/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Ldb/o;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/zzr;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final L(Lcom/google/android/gms/common/zzt;Ly9/a;)Z
    .locals 1

    invoke-virtual {p0}, Ldb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ldb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Ldb/o;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Ldb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, Ldb/o;->a(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final c()Z
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p0}, Ldb/a;->s2()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ldb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, Ldb/o;->a(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final d2(Lcom/google/android/gms/common/zzp;)Lcom/google/android/gms/common/zzr;
    .locals 1

    invoke-virtual {p0}, Ldb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ldb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Ldb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/common/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Ldb/o;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/zzr;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method
