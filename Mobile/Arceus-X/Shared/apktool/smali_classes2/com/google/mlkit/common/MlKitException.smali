.class public Lcom/google/mlkit/common/MlKitException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/MlKitException$ErrorCode;
    }
.end annotation


# static fields
.field public static final ABORTED:I = 0xa

.field public static final ALREADY_EXISTS:I = 0x6

.field public static final CANCELLED:I = 0x1

.field public static final CODE_SCANNER_APP_NAME_UNAVAILABLE:I = 0xcb

.field public static final CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED:I = 0xca

.field public static final CODE_SCANNER_CANCELLED:I = 0xc9

.field public static final CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD:I = 0xcf

.field public static final CODE_SCANNER_PIPELINE_INFERENCE_ERROR:I = 0xce

.field public static final CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR:I = 0xcd

.field public static final CODE_SCANNER_TASK_IN_PROGRESS:I = 0xcc

.field public static final CODE_SCANNER_UNAVAILABLE:I = 0xc8

.field public static final DATA_LOSS:I = 0xf

.field public static final DEADLINE_EXCEEDED:I = 0x4

.field public static final FAILED_PRECONDITION:I = 0x9

.field public static final INTERNAL:I = 0xd

.field public static final INVALID_ARGUMENT:I = 0x3

.field public static final LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE:I = 0x12c

.field public static final LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE:I = 0x12d

.field public static final MODEL_HASH_MISMATCH:I = 0x66

.field public static final MODEL_INCOMPATIBLE_WITH_TFLITE:I = 0x64

.field public static final NETWORK_ISSUE:I = 0x11

.field public static final NOT_ENOUGH_SPACE:I = 0x65

.field public static final NOT_FOUND:I = 0x5

.field public static final OUT_OF_RANGE:I = 0xb

.field public static final PERMISSION_DENIED:I = 0x7

.field public static final RESOURCE_EXHAUSTED:I = 0x8

.field public static final UNAUTHENTICATED:I = 0x10

.field public static final UNAVAILABLE:I = 0xe

.field public static final UNIMPLEMENTED:I = 0xc

.field public static final UNKNOWN:I = 0x2

.field public static final UNSUPPORTED:I = 0x12


# instance fields
.field private final zza:I
    .annotation build Lcom/google/mlkit/common/MlKitException$ErrorCode;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lcom/google/mlkit/common/MlKitException$ErrorCode;
        .end annotation
    .end param

    .line 1
    const-string v0, "Provided message must not be empty."

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput p2, p0, Lcom/google/mlkit/common/MlKitException;->zza:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lcom/google/mlkit/common/MlKitException$ErrorCode;
        .end annotation
    .end param

    .line 2
    const-string v0, "Provided message must not be empty."

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p2, p0, Lcom/google/mlkit/common/MlKitException;->zza:I

    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1
    .annotation build Lcom/google/mlkit/common/MlKitException$ErrorCode;
    .end annotation

    iget v0, p0, Lcom/google/mlkit/common/MlKitException;->zza:I

    return v0
.end method
