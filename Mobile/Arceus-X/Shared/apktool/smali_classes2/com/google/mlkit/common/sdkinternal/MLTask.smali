.class public abstract Lcom/google/mlkit/common/sdkinternal/MLTask;
.super Lcom/google/mlkit/common/sdkinternal/ModelResource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "S::",
        "Lcom/google/mlkit/common/sdkinternal/MLTaskInput;",
        ">",
        "Lcom/google/mlkit/common/sdkinternal/ModelResource;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/ModelResource;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/mlkit/common/sdkinternal/TaskQueue;)V
    .locals 0
    .param p1    # Lcom/google/mlkit/common/sdkinternal/TaskQueue;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, Lcom/google/mlkit/common/sdkinternal/ModelResource;-><init>(Lcom/google/mlkit/common/sdkinternal/TaskQueue;)V

    return-void
.end method


# virtual methods
.method public abstract run(Lcom/google/mlkit/common/sdkinternal/MLTaskInput;)Ljava/lang/Object;
    .param p1    # Lcom/google/mlkit/common/sdkinternal/MLTaskInput;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)TT;"
        }
    .end annotation
.end method
