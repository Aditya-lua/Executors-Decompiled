.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwr;

.field public final synthetic zzb:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwr;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwq;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwr;

    iput-wide p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwq;->zzb:J

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwq;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwr;

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwq;->zzb:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwr;->zzb(JLjava/lang/Exception;)V

    return-void
.end method
