.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_face/zznx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

.field public final synthetic zzd:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zznr;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zznx;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;Lcom/google/android/gms/internal/mlkit_vision_face/zzkt;Ljava/lang/String;)V

    return-void
.end method
