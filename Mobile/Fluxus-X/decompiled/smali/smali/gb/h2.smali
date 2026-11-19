.class public abstract Lgb/h2;
.super Lgb/r;
.source "SourceFile"

# interfaces
.implements Lgb/i2;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.connect.IGamesConnectCallbacks"

    invoke-direct {p0, v0}, Lgb/r;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lgb/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lgb/f2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lgb/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lgb/f2;

    invoke-static {p2}, Lgb/l0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lgb/i2;->k1(Lcom/google/android/gms/common/api/Status;Lgb/f2;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
