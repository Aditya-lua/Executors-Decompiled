.class public final synthetic Lcom/google/mlkit/vision/text/internal/zzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;


# instance fields
.field public final synthetic zza:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Matrix;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/zzj;->zza:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;

    sget v0, Lcom/google/mlkit/vision/text/internal/zzk;->zzb:I

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    invoke-static {v0}, Lcom/google/mlkit/vision/text/internal/zza;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;)Ljava/util/List;

    move-result-object v4

    new-instance v1, Lcom/google/mlkit/vision/text/Text$Element;

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzd:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzd:Ljava/lang/String;

    goto :goto_0

    :goto_1
    invoke-static {v4}, Lcom/google/mlkit/vision/text/internal/zza;->zza(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzf:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "und"

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzf:Ljava/lang/String;

    goto :goto_2

    :goto_3
    iget-object v6, p0, Lcom/google/mlkit/vision/text/internal/zzj;->zza:Landroid/graphics/Matrix;

    iget v7, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zze:F

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    iget v8, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzh()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lcom/google/mlkit/vision/text/Text$Element;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;FFLjava/util/List;)V

    return-object v1
.end method
