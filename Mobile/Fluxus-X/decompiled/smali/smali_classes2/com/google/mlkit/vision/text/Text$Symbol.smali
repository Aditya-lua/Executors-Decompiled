.class public Lcom/google/mlkit/vision/text/Text$Symbol;
.super Lcom/google/mlkit/vision/text/Text$TextBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/text/Text;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Symbol"
.end annotation


# instance fields
.field private final zza:F

.field private final zzb:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;Landroid/graphics/Matrix;)V
    .locals 6
    .param p1    # Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzc()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zze()Ljava/util/List;

    move-result-object v3

    const-string v4, ""

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/vision/text/Text$TextBase;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzb()F

    move-result p2

    iput p2, v0, Lcom/google/mlkit/vision/text/Text$Symbol;->zza:F

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zza()F

    move-result p1

    iput p1, v0, Lcom/google/mlkit/vision/text/Text$Symbol;->zzb:F

    return-void
.end method


# virtual methods
.method public getAngle()F
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/text/Text$Symbol;->zzb:F

    return v0
.end method

.method public getConfidence()F
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/text/Text$Symbol;->zza:F

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/Text$TextBase;->zza()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
