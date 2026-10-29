.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:I

.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza:I

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcs;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcs;-><init>(ILcom/google/android/gms/internal/mlkit_vision_text_common/zzcw;)V

    return-object v0
.end method
