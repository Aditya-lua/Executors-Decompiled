.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic zza:Ljava/util/concurrent/Executor;

.field public final synthetic zzb:Lsb/a;

.field public final synthetic zzc:Lsb/b;

.field public final synthetic zzd:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lsb/a;Lsb/b;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zza:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzb:Lsb/a;

    iput-object p3, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzc:Lsb/b;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzd:Lsb/k;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zza:Ljava/util/concurrent/Executor;

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzb:Lsb/a;

    invoke-virtual {v0}, Lsb/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzc:Lsb/b;

    invoke-virtual {v0}, Lsb/b;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzm;->zzd:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->b(Ljava/lang/Exception;)V

    :goto_0
    throw p1
.end method
