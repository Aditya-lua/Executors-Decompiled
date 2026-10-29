.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_face/zzny;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

.field public final synthetic zzc:Ljava/lang/Object;

.field public final synthetic zzd:J

.field public final synthetic zze:Lcom/google/mlkit/vision/face/internal/zzg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Ljava/lang/Object;JLcom/google/mlkit/vision/face/internal/zzg;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzc:Ljava/lang/Object;

    iput-wide p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzd:J

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zze:Lcom/google/mlkit/vision/face/internal/zzg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzc:Ljava/lang/Object;

    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zzd:J

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzny;->zze:Lcom/google/mlkit/vision/face/internal/zzg;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Ljava/lang/Object;JLcom/google/mlkit/vision/face/internal/zzg;)V

    return-void
.end method
