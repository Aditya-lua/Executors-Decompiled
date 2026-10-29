.class public final synthetic Lcom/google/mlkit/vision/common/internal/zza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

.field public final synthetic zzb:Lcom/google/mlkit/vision/common/InputImage;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/common/internal/MobileVisionBase;Lcom/google/mlkit/vision/common/InputImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/common/internal/zza;->zza:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

    iput-object p2, p0, Lcom/google/mlkit/vision/common/internal/zza;->zzb:Lcom/google/mlkit/vision/common/InputImage;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/zza;->zza:Lcom/google/mlkit/vision/common/internal/MobileVisionBase;

    iget-object v1, p0, Lcom/google/mlkit/vision/common/internal/zza;->zzb:Lcom/google/mlkit/vision/common/InputImage;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->zza(Lcom/google/mlkit/vision/common/InputImage;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
