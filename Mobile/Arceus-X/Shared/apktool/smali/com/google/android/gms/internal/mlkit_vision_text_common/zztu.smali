.class public abstract Lcom/google/android/gms/internal/mlkit_vision_text_common/zztu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzto;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzto;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzto;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;->zza(Z)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;->zzb(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztt;

    return-object v0
.end method


# virtual methods
.method public abstract zza()I
.end method

.method public abstract zzb()Ljava/lang/String;
.end method

.method public abstract zzc()Z
.end method
