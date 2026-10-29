.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zzf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Ljava/util/concurrent/Callable;

.field public final synthetic zzb:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zzf;->zza:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/zzf;->zzb:Lsb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzf;->zza:Ljava/util/concurrent/Callable;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/zzf;->zzb:Lsb/k;

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1, v0}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v2, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Internal error has occurred when executing ML Kit tasks"

    const/16 v4, 0xd

    invoke-direct {v2, v3, v4, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v1, v0}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
