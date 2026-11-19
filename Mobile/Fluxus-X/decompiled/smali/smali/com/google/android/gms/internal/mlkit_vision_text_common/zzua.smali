.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

.field public final synthetic zzc:Ljava/lang/Object;

.field public final synthetic zzd:J

.field public final synthetic zze:Lcom/google/mlkit/vision/text/internal/zzr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/Object;JLcom/google/mlkit/vision/text/internal/zzr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzc:Ljava/lang/Object;

    iput-wide p4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzd:J

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zze:Lcom/google/mlkit/vision/text/internal/zzr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzc:Ljava/lang/Object;

    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zzd:J

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;->zze:Lcom/google/mlkit/vision/text/internal/zzr;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/Object;JLcom/google/mlkit/vision/text/internal/zzr;)V

    return-void
.end method
