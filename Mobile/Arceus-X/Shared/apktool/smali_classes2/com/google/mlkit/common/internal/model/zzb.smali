.class public final synthetic Lcom/google/mlkit/common/internal/model/zzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/common/internal/model/zzg;

.field public final synthetic zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;

.field public final synthetic zzc:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/internal/model/zzg;Lcom/google/mlkit/common/model/CustomRemoteModel;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/internal/model/zzb;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    iput-object p2, p0, Lcom/google/mlkit/common/internal/model/zzb;->zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;

    iput-object p3, p0, Lcom/google/mlkit/common/internal/model/zzb;->zzc:Lsb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/common/internal/model/zzb;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    iget-object v1, p0, Lcom/google/mlkit/common/internal/model/zzb;->zzb:Lcom/google/mlkit/common/model/CustomRemoteModel;

    iget-object v2, p0, Lcom/google/mlkit/common/internal/model/zzb;->zzc:Lsb/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/mlkit/common/internal/model/zzg;->zzb(Lcom/google/mlkit/common/model/CustomRemoteModel;Lsb/k;)V

    return-void
.end method
