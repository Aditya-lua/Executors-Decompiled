.class public Lcom/google/mlkit/common/model/DownloadConditions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/model/DownloadConditions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:Z

.field private zzb:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/google/mlkit/common/model/DownloadConditions;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/mlkit/common/model/DownloadConditions;

    iget-boolean v1, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    iget-boolean v2, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/mlkit/common/model/DownloadConditions;-><init>(ZZLcom/google/mlkit/common/model/zzb;)V

    return-object v0
.end method

.method public requireCharging()Lcom/google/mlkit/common/model/DownloadConditions$Builder;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zza:Z

    return-object p0
.end method

.method public requireWifi()Lcom/google/mlkit/common/model/DownloadConditions$Builder;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions$Builder;->zzb:Z

    return-object p0
.end method
