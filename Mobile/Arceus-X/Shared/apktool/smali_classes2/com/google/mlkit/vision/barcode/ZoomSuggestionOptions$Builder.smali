.class public Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final zza:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;

.field private zzb:F


# direct methods
.method public constructor <init>(Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;)V
    .locals 0
    .param p1    # Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;->zza:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;->zza:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;

    iget v2, p0, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;->zzb:F

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;-><init>(Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;FLcom/google/mlkit/vision/barcode/zzb;)V

    return-object v0
.end method

.method public setMaxSupportedZoomRatio(F)Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$Builder;->zzb:F

    return-object p0
.end method
