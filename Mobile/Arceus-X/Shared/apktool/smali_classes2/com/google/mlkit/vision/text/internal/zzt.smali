.class public final synthetic Lcom/google/mlkit/vision/text/internal/zzt;
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
    .locals 3

    new-instance v0, Lcom/google/mlkit/vision/text/internal/zzo;

    const-class v1, Lcom/google/mlkit/vision/text/internal/zzp;

    invoke-interface {p1, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/text/internal/zzp;

    const-class v2, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-interface {p1, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/text/internal/zzo;-><init>(Lcom/google/mlkit/vision/text/internal/zzp;Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;)V

    return-object v0
.end method
