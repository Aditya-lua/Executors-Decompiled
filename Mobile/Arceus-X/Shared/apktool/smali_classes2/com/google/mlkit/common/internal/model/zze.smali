.class public final synthetic Lcom/google/mlkit/common/internal/model/zze;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/common/internal/model/zzg;

.field public final synthetic zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/internal/model/zzg;Lcom/google/mlkit/common/model/CustomRemoteModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/internal/model/zze;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    iput-object p2, p0, Lcom/google/mlkit/common/internal/model/zze;->zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/mlkit/common/internal/model/zze;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    iget-object v1, p0, Lcom/google/mlkit/common/internal/model/zze;->zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/internal/model/zzg;->zza(Lcom/google/mlkit/common/model/CustomRemoteModel;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
