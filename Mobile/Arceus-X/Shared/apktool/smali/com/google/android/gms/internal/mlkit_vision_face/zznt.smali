.class public abstract Lcom/google/android/gms/internal/mlkit_vision_face/zznt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_face/zzns;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzno;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzno;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzno;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_face/zzns;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzns;->zza(Z)Lcom/google/android/gms/internal/mlkit_vision_face/zzns;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzns;->zzb(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzns;

    return-object v0
.end method


# virtual methods
.method public abstract zza()I
.end method

.method public abstract zzb()Ljava/lang/String;
.end method

.method public abstract zzc()Z
.end method
