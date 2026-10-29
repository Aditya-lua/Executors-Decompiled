.class public abstract Lga/f;
.super Lfb/q;
.source "SourceFile"

# interfaces
.implements Lga/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesClient"

    invoke-direct {p0, v0}, Lfb/q;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/16 p2, 0x3e9

    if-ne p1, p2, :cond_0

    invoke-interface {p0}, Lga/g;->zzb()Lcom/google/android/gms/internal/games_v2/zzaf;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    sget p2, Lfb/k0;->a:I

    const/4 p2, 0x1

    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p1, p3, p2}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
