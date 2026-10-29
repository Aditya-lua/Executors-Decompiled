.class public interface abstract Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getModelFileDestination()Ljava/io/File;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract moveAllFilesFromPrivateTempToPrivateDestination(Ljava/io/File;)Ljava/io/File;
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
