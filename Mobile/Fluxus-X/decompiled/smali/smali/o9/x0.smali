.class public final Lo9/x0;
.super Leb/a;
.source "SourceFile"

# interfaces
.implements Lo9/z0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-direct {p0, p1, v0}, Leb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final N1(Lk9/f0;)Lk9/h0;
    .locals 1

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Leb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lk9/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Leb/o;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lk9/h0;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final Q1(Lk9/j0;Lz9/a;)Z
    .locals 1

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Leb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Leb/o;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, Leb/o;->a(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final c()Z
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, Leb/o;->a(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final l2(Lk9/f0;)Lk9/h0;
    .locals 1

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Leb/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lk9/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Leb/o;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lk9/h0;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method
