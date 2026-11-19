.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzbk;
.super Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_face/zzbk;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;->zzc:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbg;->zzb:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;->zzh([Ljava/lang/Object;I)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object v0

    return-object v0
.end method
