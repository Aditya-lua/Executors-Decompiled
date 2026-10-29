.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeh;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

.field final synthetic zzb:F

.field final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

.field final synthetic zzd:F

.field final synthetic zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;F)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzb:F

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzd:F

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb()Ln9/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to set zoom to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzd:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AutoZoom"

    invoke-virtual {v0, v2, v1, p1}, Ln9/g;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;F)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzb:F

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

    invoke-static {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
