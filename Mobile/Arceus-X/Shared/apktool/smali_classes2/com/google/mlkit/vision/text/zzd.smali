.class public final synthetic Lcom/google/mlkit/vision/text/zzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;


# instance fields
.field public final synthetic zza:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Matrix;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/zzd;->zza:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvd;

    new-instance v0, Lcom/google/mlkit/vision/text/Text$Line;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvd;->zzb()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvd;->zza()F

    move-result v2

    iget-object v3, p0, Lcom/google/mlkit/vision/text/zzd;->zza:Landroid/graphics/Matrix;

    invoke-direct {v0, p1, v3, v1, v2}, Lcom/google/mlkit/vision/text/Text$Line;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvd;Landroid/graphics/Matrix;FF)V

    return-object v0
.end method
