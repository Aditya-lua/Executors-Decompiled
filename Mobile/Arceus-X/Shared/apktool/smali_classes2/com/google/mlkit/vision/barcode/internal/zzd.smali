.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/zzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lmf/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/zzg;

    const-class v1, Lcom/google/mlkit/vision/barcode/internal/zzi;

    invoke-interface {p1, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/barcode/internal/zzi;

    const-class v2, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-interface {p1, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    const-class v3, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-interface {p1, v3}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/mlkit/vision/barcode/internal/zzg;-><init>(Lcom/google/mlkit/vision/barcode/internal/zzi;Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    return-object v0
.end method
