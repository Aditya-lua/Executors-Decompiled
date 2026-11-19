.class public final synthetic Lcom/google/mlkit/vision/text/internal/zzl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;


# instance fields
.field public final synthetic zza:Z

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;


# direct methods
.method public synthetic constructor <init>(ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/mlkit/vision/text/internal/zzl;->zza:Z

    iput-object p2, p0, Lcom/google/mlkit/vision/text/internal/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    iget-boolean v1, p0, Lcom/google/mlkit/vision/text/internal/zzl;->zza:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    :goto_0
    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzru;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzru;-><init>()V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzru;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzru;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzru;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzg(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrw;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object v0

    return-object v0
.end method
