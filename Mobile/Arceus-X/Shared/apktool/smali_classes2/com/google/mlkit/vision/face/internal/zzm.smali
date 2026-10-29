.class final Lcom/google/mlkit/vision/face/internal/zzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/face/internal/zzb;


# instance fields
.field private zza:Z

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

.field private final zzd:I

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/vision/face/FaceDetectorOptions;Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-static {}, Lj9/d;->f()Lj9/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lj9/d;->a(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzd:I

    iput-object p3, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    return-void
.end method

.method public static zzc(I)I
    .locals 3
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/face/FaceDetectorOptions$ClassificationMode;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid classification type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static zze(I)I
    .locals 3
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/face/FaceDetectorOptions$LandmarkMode;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid landmark type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static zzf(I)I
    .locals 3
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/face/FaceDetectorOptions$PerformanceMode;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mode type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private final zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzj;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;
    .locals 12

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzp;

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getRotationDegrees()I

    move-result v3

    invoke-static {v3}, Lcom/google/mlkit/vision/common/internal/CommonConvertUtils;->convertToMVRotation(I)I

    move-result v6

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_face/zzp;-><init>(IIIJI)V

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getFormat()I

    move-result v1

    const/16 v2, 0x23

    const/4 v11, 0x0

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzd:I

    const v2, 0xc02a560

    if-lt v1, v2, :cond_0

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/media/Image$Plane;

    aget-object v2, v1, v11

    invoke-virtual {v2}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {v4}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v4

    const/4 v5, 0x2

    aget-object v6, v1, v5

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-static {v6}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v6

    aget-object v7, v1, v11

    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v7

    aget-object v8, v1, v3

    invoke-virtual {v8}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v8

    aget-object v9, v1, v5

    invoke-virtual {v9}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v9

    aget-object v10, v1, v11

    invoke-virtual {v10}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v10

    aget-object v3, v1, v3

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v3

    aget-object v1, v1, v5

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v1

    move v5, v8

    move v8, v3

    move-object v3, v6

    move v6, v9

    move v9, v1

    move-object v1, v2

    move-object v2, v4

    move v4, v7

    move v7, v10

    move-object v10, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v10}, Lcom/google/android/gms/internal/mlkit_vision_face/zzj;->zzf(Ly9/a;Ly9/a;Ly9/a;IIIIIILcom/google/android/gms/internal/mlkit_vision_face/zzp;)[Lcom/google/android/gms/internal/mlkit_vision_face/zzf;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    move-object v10, v0

    move-object v0, p1

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;->getInstance()Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;

    move-result-object p1

    invoke-virtual {p1, p2, v11}, Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;->convertToNv21Buffer(Lcom/google/mlkit/vision/common/InputImage;Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object p1

    invoke-virtual {v0, p1, v10}, Lcom/google/android/gms/internal/mlkit_vision_face/zzj;->zze(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzp;)[Lcom/google/android/gms/internal/mlkit_vision_face/zzf;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    :goto_1
    if-ge v11, v1, :cond_1

    aget-object v2, p1, v11

    new-instance v3, Lcom/google/mlkit/vision/face/Face;

    invoke-virtual {p2}, Lcom/google/mlkit/vision/common/InputImage;->getCoordinatesMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/mlkit/vision/face/Face;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzf;Landroid/graphics/Matrix;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    return-object v0

    :goto_2
    new-instance p2, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Failed to detect with legacy face detector"

    const/16 v1, 0xd

    invoke-direct {p2, v0, v1, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final zza(Lcom/google/mlkit/vision/common/InputImage;)Landroid/util/Pair;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/vision/face/internal/zzm;->zzd()Z

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v0, :cond_2

    iget-object v1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Waiting for the face detection module to be downloaded. Please wait."

    const/16 v1, 0xe

    invoke-direct {p1, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-direct {p0, v0, p1}, Lcom/google/mlkit/vision/face/internal/zzm;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzj;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v0}, Lcom/google/mlkit/vision/face/internal/zzh;->zzf(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_1
    iget-object v2, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-eqz v2, :cond_5

    invoke-direct {p0, v2, p1}, Lcom/google/mlkit/vision/face/internal/zzm;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzj;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/google/mlkit/vision/face/internal/zzh;->zzf(Ljava/util/List;)V

    :cond_5
    new-instance p1, Landroid/util/Pair;

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final zzb()V
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    const/4 v1, 0x0

    const-string v2, "Failed to release legacy face detector."

    const-string v3, "LegacyFaceDelegate"

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzj;->zzd()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iput-object v1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzj;->zzd()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iput-object v1, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    :cond_1
    return-void
.end method

.method public final zzd()Z
    .locals 13

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/16 v2, 0xd

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzb:Landroid/content/Context;

    sget-object v3, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v4, "com.google.android.gms.vision.dynamite"

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v0

    const-string v3, "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzl;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_face/zzm;

    move-result-object v0

    iget-object v3, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzb:Landroid/content/Context;

    invoke-static {v3}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v3

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzc()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v4, :cond_1

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v12

    const/4 v7, 0x2

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v0, v3, v6}, Lcom/google/android/gms/internal/mlkit_vision_face/zzm;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    move-result-object v4

    iput-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v4

    if-eq v4, v5, :cond_2

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v4

    if-eq v4, v5, :cond_2

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v4

    if-ne v4, v5, :cond_4

    :cond_2
    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v4, :cond_4

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zzf(I)I

    move-result v6

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zze(I)I

    move-result v7

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zzc(I)I

    move-result v8

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v10

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v11

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v0, v3, v5}, Lcom/google/android/gms/internal/mlkit_vision_face/zzm;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v4, :cond_4

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zzf(I)I

    move-result v6

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zze(I)I

    move-result v7

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/face/internal/zzm;->zzc(I)I

    move-result v8

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v10

    iget-object v4, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzc:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v11

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;-><init>(IIIZZF)V

    invoke-interface {v0, v3, v5}, Lcom/google/android/gms/internal/mlkit_vision_face/zzm;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzh;)Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzj;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zza:Z

    if-nez v0, :cond_5

    const-string v0, "LegacyFaceDelegate"

    const-string v3, "Request face optional module download."

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zzb:Landroid/content/Context;

    const-string v3, "barcode"

    invoke-static {v0, v3}, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->requestDownload(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zza:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zzm;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzks;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {v0, v1, v2}, Lcom/google/mlkit/vision/face/internal/zzj;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;ZLcom/google/android/gms/internal/mlkit_vision_face/zzks;)V

    return v1

    :goto_2
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to load deprecated vision dynamite module."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :goto_3
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create legacy face detector."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_6
    :goto_4
    return v1
.end method
