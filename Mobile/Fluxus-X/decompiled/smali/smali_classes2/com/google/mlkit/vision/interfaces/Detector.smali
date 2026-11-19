.class public interface abstract Lcom/google/mlkit/vision/interfaces/Detector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Landroidx/lifecycle/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/interfaces/Detector$DetectorType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DetectionResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;",
        "Landroidx/lifecycle/r;"
    }
.end annotation


# static fields
.field public static final TYPE_BARCODE_SCANNING:I = 0x1

.field public static final TYPE_DOCUMENT_DETECTION:I = 0xa

.field public static final TYPE_FACE_DETECTION:I = 0x2

.field public static final TYPE_IMAGE_CAPTIONING:I = 0x9

.field public static final TYPE_IMAGE_LABELING:I = 0x3

.field public static final TYPE_OBJECT_DETECTION:I = 0x5

.field public static final TYPE_POSE_DETECTION:I = 0x6

.field public static final TYPE_SEGMENTATION:I = 0x7

.field public static final TYPE_SELFIE_FACE_DETECTION:I = 0x8

.field public static final TYPE_SUBJECT_SEGMENTATION:I = 0xb

.field public static final TYPE_TEXT_RECOGNITION:I = 0x4


# virtual methods
.method public abstract getDetectorType()I
    .annotation build Lcom/google/mlkit/vision/interfaces/Detector$DetectorType;
    .end annotation
.end method

.method public abstract process(Landroid/graphics/Bitmap;I)Lcom/google/android/gms/tasks/Task;
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "TDetectionResultT;>;"
        }
    .end annotation
.end method

.method public abstract process(Landroid/media/Image;I)Lcom/google/android/gms/tasks/Task;
    .param p1    # Landroid/media/Image;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "TDetectionResultT;>;"
        }
    .end annotation
.end method

.method public abstract process(Landroid/media/Image;ILandroid/graphics/Matrix;)Lcom/google/android/gms/tasks/Task;
    .param p1    # Landroid/media/Image;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            "I",
            "Landroid/graphics/Matrix;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TDetectionResultT;>;"
        }
    .end annotation
.end method

.method public abstract process(Ljava/nio/ByteBuffer;IIII)Lcom/google/android/gms/tasks/Task;
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "IIII)",
            "Lcom/google/android/gms/tasks/Task<",
            "TDetectionResultT;>;"
        }
    .end annotation
.end method
