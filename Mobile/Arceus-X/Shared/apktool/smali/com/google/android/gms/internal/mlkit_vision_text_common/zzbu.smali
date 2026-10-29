.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;
    .locals 1

    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbr;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbr;-><init>(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbt;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbt;-><init>(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)V

    return-object v0
.end method
