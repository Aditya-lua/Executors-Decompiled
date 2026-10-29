.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic zza:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator;

    invoke-static {v0}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/common/internal/MultiFlavorDetectorCreator$Registration;

    invoke-static {v1}, Lmf/r;->m(Ljava/lang/Class;)Lmf/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    sget-object v1, Lcom/google/mlkit/vision/common/internal/zzf;->zza:Lcom/google/mlkit/vision/common/internal/zzf;

    invoke-virtual {v0, v1}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzp;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

    move-result-object v0

    return-object v0
.end method
