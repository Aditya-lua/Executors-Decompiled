.class public abstract Lfb/e2;
.super Lfb/q;
.source "SourceFile"

# interfaces
.implements Lfb/f2;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.connect.IGamesConnectCallbacks"

    invoke-direct {p0, v0}, Lfb/q;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lcom/google/android/gms/internal/games_v2/zzs;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lfb/k0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/games_v2/zzs;

    invoke-static {p2}, Lfb/k0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p3}, Lfb/f2;->t0(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/games_v2/zzs;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
