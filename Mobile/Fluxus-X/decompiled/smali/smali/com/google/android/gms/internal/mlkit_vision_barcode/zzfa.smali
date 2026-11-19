.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:I

.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zza:I

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzez;-><init>(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;)V

    return-object v0
.end method
