.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_face/zznz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

.field public final synthetic zzc:Lcom/google/mlkit/vision/face/internal/zzg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Lcom/google/mlkit/vision/face/internal/zzg;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zzc:Lcom/google/mlkit/vision/face/internal/zzg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznz;->zzc:Lcom/google/mlkit/vision/face/internal/zzg;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Lcom/google/mlkit/vision/face/internal/zzg;)V

    return-void
.end method
