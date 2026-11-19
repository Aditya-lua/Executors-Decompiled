.class public final synthetic Lcom/google/mlkit/common/internal/zzh;
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
    .locals 3

    new-instance v0, Lcom/google/mlkit/common/model/RemoteModelManager$RemoteModelManagerRegistration;

    const-class v1, Lcom/google/mlkit/common/model/CustomRemoteModel;

    const-class v2, Lcom/google/mlkit/common/internal/model/zzg;

    invoke-interface {p1, v2}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/common/model/RemoteModelManager$RemoteModelManagerRegistration;-><init>(Ljava/lang/Class;Lag/b;)V

    return-object v0
.end method
