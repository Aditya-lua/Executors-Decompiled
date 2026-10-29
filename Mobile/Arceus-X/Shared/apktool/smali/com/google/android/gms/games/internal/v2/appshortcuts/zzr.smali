.class public final Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Landroid/content/ComponentName;

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lka/o;

    invoke-direct {v0}, Lka/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;ILandroid/content/ComponentName;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->f:J

    iput-object p3, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->g:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->h:I

    iput-object p5, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->i:Landroid/content/ComponentName;

    iput-object p6, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->f:J

    invoke-static {p1, v1, v2, v3}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->g:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->h:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->i:Landroid/content/ComponentName;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x5

    iget-object v1, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->j:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->h:I

    return v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->j:Ljava/lang/String;

    return-object v0
.end method
