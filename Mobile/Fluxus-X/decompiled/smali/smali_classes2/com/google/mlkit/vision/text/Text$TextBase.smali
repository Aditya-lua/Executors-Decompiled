.class Lcom/google/mlkit/vision/text/Text$TextBase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/text/Text;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TextBase"
.end annotation


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Landroid/graphics/Rect;

.field private final zzc:[Landroid/graphics/Point;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zza:Ljava/lang/String;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    if-eqz p5, :cond_0

    invoke-static {p1, p5}, Lcom/google/mlkit/vision/common/internal/CommonConvertUtils;->transformRect(Landroid/graphics/Rect;Landroid/graphics/Matrix;)V

    :cond_0
    iput-object p1, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzb:Landroid/graphics/Rect;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Landroid/graphics/Point;

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    new-instance v0, Landroid/graphics/Point;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    if-eqz p5, :cond_2

    invoke-static {p1, p5}, Lcom/google/mlkit/vision/common/internal/CommonConvertUtils;->transformPointArray([Landroid/graphics/Point;Landroid/graphics/Matrix;)V

    :cond_2
    iput-object p1, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzc:[Landroid/graphics/Point;

    iput-object p4, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBoundingBox()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzb:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getCornerPoints()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzc:[Landroid/graphics/Point;

    return-object v0
.end method

.method public getRecognizedLanguage()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/vision/text/Text$TextBase;->zza:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method
