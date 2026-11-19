.class public abstract Lbb/m;
.super Lbb/d;
.source "SourceFile"

# interfaces
.implements Lbb/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback"

    invoke-direct {p0, v0}, Lbb/d;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p4, 0x2

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbb/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p4, Lf9/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbb/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    check-cast p4, Lf9/e;

    invoke-virtual {p0, p2}, Lbb/d;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lbb/n;->z(Lcom/google/android/gms/common/api/Status;Lf9/e;)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbb/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p4

    invoke-virtual {p0, p2}, Lbb/d;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lbb/n;->u0(Lcom/google/android/gms/common/api/Status;[B)V

    :goto_0
    return p3
.end method
