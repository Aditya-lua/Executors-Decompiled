.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zziv;

.field public final synthetic zzd:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;Lcom/google/android/gms/internal/mlkit_vision_common/zziv;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zziv;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zziv;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;Lcom/google/android/gms/internal/mlkit_vision_common/zziv;Ljava/lang/String;)V

    return-void
.end method
