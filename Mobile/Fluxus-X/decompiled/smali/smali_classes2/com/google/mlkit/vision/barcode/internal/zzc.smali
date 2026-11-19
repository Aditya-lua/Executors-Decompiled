.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/zzc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lof/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/zzi;

    const-class v1, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-interface {p1, v1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/barcode/internal/zzi;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    return-object v0
.end method
