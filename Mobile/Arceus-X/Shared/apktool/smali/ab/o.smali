.class public abstract Lab/o;
.super Lab/d;
.source "SourceFile"

# interfaces
.implements Lab/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback"

    invoke-direct {p0, v0}, Lab/d;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lab/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    invoke-virtual {p0, p2}, Lab/d;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lab/p;->v(Lcom/google/android/gms/common/api/Status;I)V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
