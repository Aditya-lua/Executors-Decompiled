.class public Lcom/google/mlkit/vision/face/internal/FaceRegistrar;
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
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/mlkit/vision/face/internal/zze;

    invoke-static {v0}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-static {v2}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    sget-object v2, Lcom/google/mlkit/vision/face/internal/zzk;->zza:Lcom/google/mlkit/vision/face/internal/zzk;

    invoke-virtual {v1, v2}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lof/c$b;->d()Lof/c;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/vision/face/internal/zzc;

    invoke-static {v2}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v2

    invoke-static {v0}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v2, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-static {v2}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/mlkit/vision/face/internal/zzl;->zza:Lcom/google/mlkit/vision/face/internal/zzl;

    invoke-virtual {v0, v2}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;->zzi(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object v0

    return-object v0
.end method
