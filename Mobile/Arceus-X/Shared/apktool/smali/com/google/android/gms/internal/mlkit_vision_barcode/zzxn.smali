.class public abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzg(Ljava/lang/Iterable;IIF)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;
    .locals 9
    .param p0    # Ljava/lang/Iterable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p3, 0x0

    move v1, p1

    move v2, p2

    move v0, p3

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v4, v3, Landroid/graphics/Point;->y:I

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v4, v3, Landroid/graphics/Point;->x:I

    invoke-static {p3, v4}, Ljava/lang/Math;->max(II)I

    move-result p3

    iget v3, v3, Landroid/graphics/Point;->y:I

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    int-to-float p0, v1

    const/4 v1, 0x0

    add-float/2addr p0, v1

    int-to-float p1, p1

    int-to-float v2, v2

    add-float/2addr v2, v1

    int-to-float p2, p2

    int-to-float p3, p3

    int-to-float v0, v0

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;

    div-float v4, p0, p1

    div-float v5, v2, p2

    add-float/2addr p3, v1

    div-float v6, p3, p1

    add-float/2addr v0, v1

    div-float v7, v0, p2

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;-><init>(FFFFF)V

    return-object v3
.end method


# virtual methods
.method public abstract zza()F
.end method

.method public abstract zzb()F
.end method

.method public abstract zzc()F
.end method

.method public abstract zzd()F
.end method

.method public abstract zze()F
.end method

.method public final zzf()F
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v2

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh()Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
