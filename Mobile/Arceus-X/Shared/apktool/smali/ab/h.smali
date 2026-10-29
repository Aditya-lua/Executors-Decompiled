.class public final Lab/h;
.super Lab/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService"

    invoke-direct {p0, p1, v0}, Lab/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lab/j;Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;)V
    .locals 1

    invoke-virtual {p0}, Lab/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lab/e;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lab/e;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xd

    invoke-virtual {p0, p1, v0}, Lab/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u2(Lab/l;)V
    .locals 1

    invoke-virtual {p0}, Lab/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lab/e;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lab/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final v2(Lab/n;Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)V
    .locals 1

    invoke-virtual {p0}, Lab/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lab/e;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lab/e;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lab/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w2(Lab/p;Lcom/google/android/gms/auth/blockstore/StoreBytesData;)V
    .locals 1

    invoke-virtual {p0}, Lab/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lab/e;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lab/e;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lab/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
