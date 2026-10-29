.class public final Lcom/google/android/gms/internal/games_v2/zzaf;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/games_v2/zzaf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Landroid/os/Bundle;

.field public final g:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/e;

    invoke-direct {v0}, Lfb/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/games_v2/zzaf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->f:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->g:Landroid/os/IBinder;

    return-void
.end method

.method public constructor <init>(Lfb/d;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    .line 3
    invoke-virtual {p1}, Lfb/d;->a()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->f:Landroid/os/Bundle;

    iget-object p1, p1, Lfb/d;->a:Landroid/os/IBinder;

    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->g:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->f:Landroid/os/Bundle;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lo9/b;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/games_v2/zzaf;->g:Landroid/os/IBinder;

    invoke-static {p1, p2, v1, v2}, Lo9/b;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
