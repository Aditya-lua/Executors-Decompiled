.class final Lcom/google/mlkit/vision/text/internal/zzk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

.field public static final synthetic zzb:I

.field private static final zzc:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\n"

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/text/internal/zzk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    new-instance v0, Lcom/google/mlkit/vision/text/internal/zzf;

    invoke-direct {v0}, Lcom/google/mlkit/vision/text/internal/zzf;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/text/internal/zzk;->zzc:Ljava/util/Comparator;

    return-void
.end method

.method public static zza([Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;Landroid/graphics/Matrix;)Lcom/google/mlkit/vision/text/Text;
    .locals 29

    move-object/from16 v0, p0

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    iget v6, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzj:I

    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/SparseArray;

    if-nez v6, :cond_0

    new-instance v6, Landroid/util/SparseArray;

    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    iget v7, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzj:I

    invoke-virtual {v1, v7, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    iget v7, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzk:I

    invoke-virtual {v6, v7, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;-><init>()V

    move v2, v3

    :goto_1
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v2, v4, :cond_6

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/SparseArray;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    invoke-direct {v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;-><init>()V

    move v6, v3

    :goto_2
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v6, v7, :cond_2

    invoke-virtual {v4, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v4

    new-instance v5, Lcom/google/mlkit/vision/text/internal/zzh;

    move-object/from16 v11, p1

    invoke-direct {v5, v11}, Lcom/google/mlkit/vision/text/internal/zzh;-><init>(Landroid/graphics/Matrix;)V

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    iget-object v5, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcp;

    move-result-object v4

    const/high16 v6, -0x80000000

    const v7, 0x7fffffff

    move v8, v7

    move v9, v8

    move v7, v6

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    iget-object v10, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    iget v14, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    neg-int v14, v14

    iget v15, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    neg-int v15, v15

    move/from16 v16, v3

    iget v3, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    move/from16 v17, v14

    float-to-double v13, v3

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    iget v3, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    move-object/from16 v18, v1

    move/from16 v19, v2

    float-to-double v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    move-wide/from16 v20, v1

    const/4 v3, 0x4

    new-array v1, v3, [Landroid/graphics/Point;

    new-instance v2, Landroid/graphics/Point;

    iget v3, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    move-object/from16 v22, v1

    iget v1, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    invoke-direct {v2, v3, v1}, Landroid/graphics/Point;-><init>(II)V

    aput-object v2, v22, v16

    move/from16 v1, v17

    invoke-virtual {v2, v1, v15}, Landroid/graphics/Point;->offset(II)V

    aget-object v1, v22, v16

    iget v2, v1, Landroid/graphics/Point;->x:I

    move-object v15, v4

    int-to-double v3, v2

    mul-double v3, v3, v20

    move-wide/from16 v23, v3

    iget v3, v1, Landroid/graphics/Point;->y:I

    move-wide/from16 v25, v13

    int-to-double v13, v3

    mul-double v13, v13, v25

    neg-int v2, v2

    move-wide/from16 v27, v13

    int-to-double v13, v2

    mul-double v13, v13, v25

    int-to-double v2, v3

    mul-double v2, v2, v20

    move-wide/from16 v20, v2

    add-double v2, v23, v27

    double-to-int v2, v2

    iput v2, v1, Landroid/graphics/Point;->x:I

    add-double v13, v13, v20

    double-to-int v3, v13

    iput v3, v1, Landroid/graphics/Point;->y:I

    new-instance v1, Landroid/graphics/Point;

    iget v4, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzc:I

    add-int/2addr v4, v2

    invoke-direct {v1, v4, v3}, Landroid/graphics/Point;-><init>(II)V

    const/4 v4, 0x1

    aput-object v1, v22, v4

    new-instance v1, Landroid/graphics/Point;

    iget v4, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzc:I

    add-int/2addr v4, v2

    iget v13, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzd:I

    add-int/2addr v13, v3

    invoke-direct {v1, v4, v13}, Landroid/graphics/Point;-><init>(II)V

    const/4 v4, 0x2

    aput-object v1, v22, v4

    new-instance v1, Landroid/graphics/Point;

    iget v4, v10, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzd:I

    add-int/2addr v3, v4

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    const/4 v2, 0x3

    aput-object v1, v22, v2

    move/from16 v1, v16

    :goto_4
    const/4 v3, 0x4

    if-ge v1, v3, :cond_3

    aget-object v2, v22, v1

    iget v3, v2, Landroid/graphics/Point;->x:I

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    iget v3, v2, Landroid/graphics/Point;->x:I

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v3, v2, Landroid/graphics/Point;->y:I

    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    move-result v9

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_3
    move-object v4, v15

    move/from16 v3, v16

    move-object/from16 v1, v18

    move/from16 v2, v19

    goto/16 :goto_3

    :cond_4
    move-object/from16 v18, v1

    move/from16 v19, v2

    move/from16 v16, v3

    iget v1, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    iget v2, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    iget v3, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    iget v5, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    float-to-double v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5, v8, v9}, Landroid/graphics/Point;-><init>(II)V

    new-instance v10, Landroid/graphics/Point;

    invoke-direct {v10, v6, v9}, Landroid/graphics/Point;-><init>(II)V

    new-instance v9, Landroid/graphics/Point;

    invoke-direct {v9, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v8, v7}, Landroid/graphics/Point;-><init>(II)V

    filled-new-array {v5, v10, v9, v6}, [Landroid/graphics/Point;

    move-result-object v5

    move/from16 v6, v16

    :goto_5
    const/4 v7, 0x4

    if-ge v6, v7, :cond_5

    aget-object v8, v5, v6

    iget v9, v8, Landroid/graphics/Point;->x:I

    move-wide/from16 v20, v3

    int-to-double v3, v9

    mul-double/2addr v3, v13

    iget v10, v8, Landroid/graphics/Point;->y:I

    move-object v15, v8

    int-to-double v7, v10

    mul-double v7, v7, v20

    move-wide/from16 v22, v3

    int-to-double v3, v9

    mul-double v3, v3, v20

    int-to-double v9, v10

    mul-double/2addr v9, v13

    sub-double v7, v22, v7

    double-to-int v7, v7

    iput v7, v15, Landroid/graphics/Point;->x:I

    add-double/2addr v3, v9

    double-to-int v3, v3

    iput v3, v15, Landroid/graphics/Point;->y:I

    invoke-virtual {v15, v1, v2}, Landroid/graphics/Point;->offset(II)V

    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v3, v20

    goto :goto_5

    :cond_5
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v6, Lcom/google/mlkit/vision/text/Text$TextBlock;

    sget-object v1, Lcom/google/mlkit/vision/text/internal/zzk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    new-instance v2, Lcom/google/mlkit/vision/text/internal/zzi;

    invoke-direct {v2}, Lcom/google/mlkit/vision/text/internal/zzi;-><init>()V

    invoke-static {v12, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;->zzb(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v9}, Lcom/google/mlkit/vision/text/internal/zza;->zza(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object v8

    invoke-static {v12}, Lcom/google/mlkit/vision/text/internal/zzk;->zzb(Ljava/util/List;)Ljava/lang/String;

    move-result-object v10

    invoke-direct/range {v6 .. v12}, Lcom/google/mlkit/vision/text/Text$TextBlock;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    add-int/lit8 v2, v19, 0x1

    move/from16 v3, v16

    move-object/from16 v1, v18

    goto/16 :goto_1

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/vision/text/Text;

    sget-object v2, Lcom/google/mlkit/vision/text/internal/zzk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    new-instance v3, Lcom/google/mlkit/vision/text/internal/zzg;

    invoke-direct {v3}, Lcom/google/mlkit/vision/text/internal/zzg;-><init>()V

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;->zzb(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/text/Text;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method private static zzb(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/text/Text$Line;

    invoke-virtual {v1}, Lcom/google/mlkit/vision/text/Text$Line;->getRecognizedLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/google/mlkit/vision/text/internal/zzk;->zzc:Ljava/util/Comparator;

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object p0

    :cond_3
    :goto_2
    const-string p0, "und"

    return-object p0
.end method
