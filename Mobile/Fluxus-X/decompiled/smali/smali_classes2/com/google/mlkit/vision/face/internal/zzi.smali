.class public final synthetic Lcom/google/mlkit/vision/face/internal/zzi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_face/zzoa;


# instance fields
.field public final synthetic zza:Z

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;


# direct methods
.method public synthetic constructor <init>(ZLcom/google/android/gms/internal/mlkit_vision_face/zzks;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/mlkit/vision/face/internal/zzi;->zza:Z

    iput-object p2, p0, Lcom/google/mlkit/vision/face/internal/zzi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_face/zznr;
    .locals 3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zzi;->zza:Z

    iget-object v1, p0, Lcom/google/mlkit/vision/face/internal/zzi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzku;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzku;-><init>()V

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    :goto_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzku;->zze(Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;)Lcom/google/android/gms/internal/mlkit_vision_face/zzku;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzlm;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzlm;->zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zzks;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzlm;->zzc()Lcom/google/android/gms/internal/mlkit_vision_face/zzlo;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzku;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzlo;)Lcom/google/android/gms/internal/mlkit_vision_face/zzku;

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzof;->zzf(Lcom/google/android/gms/internal/mlkit_vision_face/zzku;)Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    move-result-object v0

    return-object v0
.end method
