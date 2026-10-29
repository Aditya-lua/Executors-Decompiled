.class public interface abstract Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CustomModelLoaderHelper"
.end annotation


# virtual methods
.method public abstract logLoad()V
.end method

.method public abstract tryLoad(Lcom/google/mlkit/common/model/LocalModel;)Z
    .param p1    # Lcom/google/mlkit/common/model/LocalModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
