.class public Lcom/google/mlkit/common/model/CustomRemoteModel$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/model/CustomRemoteModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final zza:Lcom/google/mlkit/common/model/RemoteModelSource;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/mlkit/common/model/RemoteModelSource;)V
    .locals 0
    .param p1    # Lcom/google/mlkit/common/model/RemoteModelSource;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/mlkit/common/model/CustomRemoteModel$Builder;->zza:Lcom/google/mlkit/common/model/RemoteModelSource;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/mlkit/common/model/CustomRemoteModel;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/mlkit/common/model/CustomRemoteModel;

    iget-object v1, p0, Lcom/google/mlkit/common/model/CustomRemoteModel$Builder;->zza:Lcom/google/mlkit/common/model/RemoteModelSource;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/model/CustomRemoteModel;-><init>(Lcom/google/mlkit/common/model/RemoteModelSource;Lcom/google/mlkit/common/model/zza;)V

    return-object v0
.end method
