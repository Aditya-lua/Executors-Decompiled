.class public Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Registration"
.end annotation


# instance fields
.field private final zza:Ljava/lang/Class;

.field private final zzb:Lyf/b;

.field private final zzc:I
    .annotation build Lcom/google/mlkit/common/sdkinternal/ClientPriority;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lyf/b;)V
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lyf/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DetectorT::",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$MultiFlavorDetector;",
            "OptionsT::",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$DetectorOptions<",
            "TDetectorT;>;>(",
            "Ljava/lang/Class<",
            "+TOptionsT;>;",
            "Lyf/b<",
            "+",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$DetectorCreator<",
            "TDetectorT;TOptionsT;>;>;)V"
        }
    .end annotation

    const/16 v0, 0x64

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;-><init>(Ljava/lang/Class;Lyf/b;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lyf/b;I)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lyf/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lcom/google/mlkit/common/sdkinternal/ClientPriority;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DetectorT::",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$MultiFlavorDetector;",
            "OptionsT::",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$DetectorOptions<",
            "TDetectorT;>;>(",
            "Ljava/lang/Class<",
            "+TOptionsT;>;",
            "Lyf/b<",
            "+",
            "Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$DetectorCreator<",
            "TDetectorT;TOptionsT;>;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zza:Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zzb:Lyf/b;

    iput p3, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zzc:I

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1
    .annotation build Lcom/google/mlkit/common/sdkinternal/ClientPriority;
    .end annotation

    iget v0, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zzc:I

    return v0
.end method

.method public final zzb()Lyf/b;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zzb:Lyf/b;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;->zza:Ljava/lang/Class;

    return-object v0
.end method
