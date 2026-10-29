.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Landroid/graphics/Rect;

.field private final zzc:Ljava/util/List;

.field private final zzd:F

.field private final zze:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;FF)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzb:Landroid/graphics/Rect;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzc:Ljava/util/List;

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzd:F

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zze:F

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zza:Ljava/lang/String;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzb:Landroid/graphics/Rect;

    invoke-static {p1, v0, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzc:Ljava/util/List;

    invoke-static {p1, p2, v0, v3}, Lo9/b;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 p2, 0x4

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzd:F

    invoke-static {p1, p2, v0}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 p2, 0x5

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zze:F

    invoke-static {p1, p2, v0}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    invoke-static {p1, v1}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zze:F

    return v0
.end method

.method public final zzb()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzd:F

    return v0
.end method

.method public final zzc()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzb:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzc:Ljava/util/List;

    return-object v0
.end method
