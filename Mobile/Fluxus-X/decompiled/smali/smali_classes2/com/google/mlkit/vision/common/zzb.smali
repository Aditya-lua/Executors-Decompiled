.class final Lcom/google/mlkit/vision/common/zzb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/media/Image;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public final zza()Landroid/media/Image;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

    return-object v0
.end method

.method public final zzb()[Landroid/media/Image$Plane;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/zzb;->zza:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    return-object v0
.end method
