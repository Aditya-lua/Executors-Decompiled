.class public final Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Landroid/os/PersistableBundle;

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lka/g;

    invoke-direct {v0}, Lka/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/PersistableBundle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->f:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->g:Landroid/os/PersistableBundle;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->h:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->i:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->f:Ljava/lang/String;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->g:Landroid/os/PersistableBundle;

    invoke-static {p1, v0, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->h:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, v3}, Lo9/b;->e(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    const/4 p2, 0x4

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->i:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, v3}, Lo9/b;->e(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    invoke-static {p1, v1}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->f:Ljava/lang/String;

    return-object v0
.end method
