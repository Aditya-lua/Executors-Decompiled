.class public final Lcom/google/android/gms/internal/games_v2/zzq;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/games_v2/zzq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Lcom/google/android/gms/internal/games_v2/zzx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/c2;

    invoke-direct {v0}, Lfb/c2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/games_v2/zzq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/games_v2/zzx;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    return-void
.end method

.method public static v3(I)Lcom/google/android/gms/internal/games_v2/zzq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzq;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/games_v2/zzq;-><init>(ILcom/google/android/gms/internal/games_v2/zzx;)V

    return-object v0
.end method

.method public static w3(ILcom/google/android/gms/internal/games_v2/zzx;)Lcom/google/android/gms/internal/games_v2/zzq;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/games_v2/zzq;-><init>(ILcom/google/android/gms/internal/games_v2/zzx;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/games_v2/zzq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/games_v2/zzq;

    iget v1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    iget v3, p1, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    iget-object p1, p1, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    const-string v2, "signInType"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "previousStepResolutionResult"

    iget-object v2, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/games_v2/zzq;->f:I

    return v0
.end method

.method public final zzd()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzq;->g:Lcom/google/android/gms/internal/games_v2/zzx;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
