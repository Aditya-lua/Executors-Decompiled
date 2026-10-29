.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

.field public final synthetic zzb:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    iput-wide p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;->zzb:J

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;->zzb:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzb(JLjava/lang/Exception;)V

    return-void
.end method
