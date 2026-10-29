.class final Lcom/google/mlkit/vision/face/internal/zza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/face/internal/zzb;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

.field private zzc:Z

.field private zzd:Z

.field private zze:Z

.field private final zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

.field private zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/vision/face/FaceDetectorOptions;Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    iput-object p3, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    return-void
.end method

.method public static zzc(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "com.google.mlkit.dynamite.face"

    invoke-static {p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final zzf()V
    .locals 9

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzc()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v8

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;-><init>(IIIIZF)V

    invoke-direct {p0, v2}, Lcom/google/mlkit/vision/face/internal/zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v0

    if-ne v0, v1, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v2

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v4

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v6

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v7

    const/4 v5, 0x1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;-><init>(IIIIZF)V

    invoke-direct {p0, v1}, Lcom/google/mlkit/vision/face/internal/zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zze()I

    move-result v2

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzd()I

    move-result v3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzb()I

    move-result v4

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v6

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v0}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zza()F

    move-result v7

    const/4 v5, 0x1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;-><init>(IIIIZF)V

    invoke-direct {p0, v1}, Lcom/google/mlkit/vision/face/internal/zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    :cond_3
    return-void
.end method

.method private final zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;
    .locals 3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.mlkit.dynamite.face"

    const-string v2, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator"

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/google/mlkit/vision/face/internal/zza;->zze(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.android.gms.vision.face"

    const-string v2, "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator"

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/google/mlkit/vision/face/internal/zza;->zze(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object p1

    return-object p1
.end method

.method private static zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;
    .locals 7

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getFormat()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;->getInstance()Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/mlkit/vision/common/internal/ImageConvertUtils;->convertToNv21Buffer(Lcom/google/mlkit/vision/common/InputImage;Z)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getRotationDegrees()I

    move-result p1

    const/16 v3, 0x11

    invoke-static {v0, v1, v2, p1, v3}, Lcom/google/mlkit/vision/common/InputImage;->fromByteBuffer(Ljava/nio/ByteBuffer;IIII)Lcom/google/mlkit/vision/common/InputImage;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzoq;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getFormat()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getRotationDegrees()I

    move-result v4

    invoke-static {v4}, Lcom/google/mlkit/vision/common/internal/CommonConvertUtils;->convertToMVRotation(I)I

    move-result v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoq;-><init>(IIIIJ)V

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getInstance()Lcom/google/mlkit/vision/common/internal/ImageUtils;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getImageDataWrapper(Lcom/google/mlkit/vision/common/InputImage;)Ly9/a;

    move-result-object v1

    :try_start_0
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzoq;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;

    new-instance v2, Lcom/google/mlkit/vision/face/Face;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getCoordinatesMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/mlkit/vision/face/Face;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzow;Landroid/graphics/Matrix;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Failed to run face detector."

    const/16 v1, 0xd

    invoke-direct {p1, v0, v1, p0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final zza(Lcom/google/mlkit/vision/common/InputImage;)Landroid/util/Pair;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/vision/face/internal/zza;->zzd()Z

    :cond_0
    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzc:Z

    if-nez v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;->zze()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;->zze()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzc:Z

    goto :goto_2

    :goto_1
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to init face detector."

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0, p1}, Lcom/google/mlkit/vision/face/internal/zza;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzb:Lcom/google/mlkit/vision/face/FaceDetectorOptions;

    invoke-virtual {v2}, Lcom/google/mlkit/vision/face/FaceDetectorOptions;->zzg()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v0}, Lcom/google/mlkit/vision/face/internal/zzh;->zzf(Ljava/util/List;)V

    goto :goto_3

    :cond_4
    move-object v0, v1

    :cond_5
    :goto_3
    iget-object v2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-eqz v2, :cond_6

    invoke-static {v2, p1}, Lcom/google/mlkit/vision/face/internal/zza;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;Lcom/google/mlkit/vision/common/InputImage;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/google/mlkit/vision/face/internal/zzh;->zzf(Ljava/util/List;)V

    :cond_6
    new-instance p1, Landroid/util/Pair;

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final zzb()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;->zzf()V

    iput-object v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;->zzf()V

    iput-object v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v1, "DecoupledFaceDelegate"

    const-string v2, "Failed to release face detector."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzc:Z

    return-void
.end method

.method public final zzd()Z
    .locals 5

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzh:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzg:Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zza:Landroid/content/Context;

    const-string v1, "com.google.mlkit.dynamite.face"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0xd

    if-lez v0, :cond_1

    iput-boolean v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    :try_start_0
    invoke-direct {p0}, Lcom/google/mlkit/vision/face/internal/zza;->zzf()V
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create thick face detector."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to load the bundled face module."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    :try_start_1
    invoke-direct {p0}, Lcom/google/mlkit/vision/face/internal/zza;->zzf()V
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-boolean v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzks;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {v0, v1, v2}, Lcom/google/mlkit/vision/face/internal/zzj;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;ZLcom/google/android/gms/internal/mlkit_vision_face/zzks;)V

    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    return v0

    :catch_2
    move-exception v0

    iget-object v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-boolean v3, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_face/zzks;->zzC:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {v1, v3, v4}, Lcom/google/mlkit/vision/face/internal/zzj;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;ZLcom/google/android/gms/internal/mlkit_vision_face/zzks;)V

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to create thin face detector."

    invoke-direct {v1, v3, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    iget-boolean v2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zze:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zza:Landroid/content/Context;

    const-string v3, "face"

    invoke-static {v2, v3}, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->requestDownload(Landroid/content/Context;Ljava/lang/String;)V

    iput-boolean v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zze:Z

    :cond_2
    iget-object v1, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzf:Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;

    iget-boolean v2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_face/zzks;->zzB:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {v1, v2, v3}, Lcom/google/mlkit/vision/face/internal/zzj;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzoc;ZLcom/google/android/gms/internal/mlkit_vision_face/zzks;)V

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v2, "Waiting for the face module to be downloaded. Please wait."

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_3
    :goto_1
    iget-boolean v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zzd:Z

    return v0
.end method

.method public final zze(Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/face/internal/zza;->zza:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzpa;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;

    move-result-object p1

    iget-object p2, p0, Lcom/google/mlkit/vision/face/internal/zza;->zza:Landroid/content/Context;

    invoke-static {p2}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object p2

    invoke-interface {p1, p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_face/zzou;)Lcom/google/android/gms/internal/mlkit_vision_face/zzoy;

    move-result-object p1

    return-object p1
.end method
