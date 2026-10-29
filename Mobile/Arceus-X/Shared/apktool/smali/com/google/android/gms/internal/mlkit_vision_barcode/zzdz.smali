.class public abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;",
        "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet<",
        "TV;>;"
    }
.end annotation


# static fields
.field static final zza:Z

.field static final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;

.field private static final zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

.field private static final zzd:Ljava/lang/Object;


# instance fields
.field private volatile listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

.field private volatile value:Ljava/lang/Object;

.field private volatile waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    :try_start_0
    const-string v0, "guava.concurrent.generate_cancellation_cause"

    const-string v2, "false"

    invoke-static {v0, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zza:Z

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;

    const-class v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;

    const/4 v3, 0x0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzi;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzi;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzed;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v3

    move-object v12, v6

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_1
    move-object v4, v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_1

    :goto_2
    :try_start_2
    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zze;

    const-class v0, Ljava/lang/Thread;

    const-string v6, "thread"

    invoke-static {v1, v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v6

    const-string v0, "next"

    invoke-static {v1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v7

    const-string v0, "waiters"

    invoke-static {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v8

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    const-string v1, "listeners"

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v9

    const-class v0, Ljava/lang/Object;

    const-string v1, "value"

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v10

    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zze;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3

    move-object v6, v3

    move-object v12, v4

    move-object v0, v5

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    :goto_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzg;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzg;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeb;)V

    move-object v6, v0

    move-object v0, v1

    move-object v12, v4

    :goto_4
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    if-eqz v6, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;->zza()Ljava/util/logging/Logger;

    move-result-object v7

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v10, "<clinit>"

    const-string v11, "UnsafeAtomicHelper is broken!"

    const-string v9, "com.google.common.util.concurrent.AbstractFuture"

    move-object v8, v2

    invoke-virtual/range {v7 .. v12}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;->zza()Ljava/util/logging/Logger;

    move-result-object v1

    const-string v4, "<clinit>"

    const-string v5, "SafeAtomicHelper is broken!"

    const-string v3, "com.google.common.util.concurrent.AbstractFuture"

    invoke-virtual/range {v1 .. v6}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzd:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;-><init>()V

    return-void
.end method

.method public static bridge synthetic zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    return-object v0
.end method

.method public static bridge synthetic zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    return-object p0
.end method

.method public static bridge synthetic zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    return-object p0
.end method

.method public static bridge synthetic zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    return-void
.end method

.method public static bridge synthetic zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic zzj(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    return-void
.end method

.method public static bridge synthetic zzk(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V

    return-void
.end method

.method private static zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;
    .locals 7

    const-string v0, "get() did not throw CancellationException, despite reporting isCancelled() == true: "

    instance-of v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzh;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzc:Z

    if-eqz v1, :cond_1

    iget-object p0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzd:Ljava/lang/Throwable;

    if-eqz p0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    invoke-direct {v0, v2, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;-><init>(ZLjava/lang/Throwable;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_2
    instance-of v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzex;->zzg()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    sget-boolean v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zza:Z

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    if-eqz v3, :cond_5

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_5
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzr(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v1, :cond_6

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object v3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v3

    goto :goto_3

    :cond_6
    if-nez v3, :cond_7

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzd:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    return-object p0

    :cond_7
    return-object v3

    :catch_2
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :goto_2
    if-nez v1, :cond_8

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "get() threw CancellationException, despite reporting isCancelled() == false: "

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    :cond_8
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object p0

    :goto_3
    if-eqz v1, :cond_9

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;-><init>(ZLjava/lang/Throwable;)V

    return-object v1

    :cond_9
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method private static zzr(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private final zzs(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzr(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SUCCESS, result=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    const-string v1, "null"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    if-ne v1, p0, :cond_1

    const-string v1, "this future"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v1, "UNKNOWN, cause=["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_2
    const-string v0, "CANCELLED"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :goto_2
    const-string v2, "FAILURE, cause=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final zzt(Ljava/lang/StringBuilder;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const-string v1, "PENDING"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    const-string v3, "]"

    if-eqz v2, :cond_0

    const-string v2, ", setFuture=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzu(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzba;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Exception thrown from implementation: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_1

    const-string v2, ", info=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzs(Ljava/lang/StringBuilder;)V

    :cond_2
    return-void
.end method

.method private final zzu(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    if-ne p2, p0, :cond_0

    :try_start_0
    const-string p2, "this future"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string v0, "Exception thrown from implementation: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V
    .locals 5

    const/4 p1, 0x0

    move-object v0, p1

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->thread:Ljava/lang/Thread;

    if-eqz v2, :cond_0

    iput-object p1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->thread:Ljava/lang/Thread;

    invoke-static {v2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzm()V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    move-result-object p0

    move-object v4, v0

    move-object v0, p0

    move-object p0, v4

    :goto_2
    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    iput-object p0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    move-object p0, v0

    move-object v0, v1

    goto :goto_2

    :cond_2
    :goto_3
    if-eqz p0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->zzb:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    instance-of v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    if-eqz v2, :cond_3

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    iget-object p0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    if-ne v2, v0, :cond_4

    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v3, p0, v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v0, v1

    goto :goto_0

    :cond_3
    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->zzc:Ljava/util/concurrent/Executor;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzw(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_4
    move-object p0, v1

    goto :goto_3

    :cond_5
    return-void
.end method

.method private static zzw(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 6

    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object v5, v0

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzes;->zza()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException while executing runnable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "com.google.common.util.concurrent.AbstractFuture"

    const-string v3, "executeListener"

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final zzx(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->thread:Ljava/lang/Thread;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    if-eq p1, v1, :cond_3

    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->thread:Ljava/lang/Thread;

    if-eqz v3, :cond_0

    move-object v1, p1

    goto :goto_2

    :cond_0
    if-eqz v1, :cond_1

    iput-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    iget-object p1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->thread:Ljava/lang/Thread;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v3, p0, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static final zzy(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzd:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;->zzb:Ljava/lang/Throwable;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzd:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    or-int/2addr v1, v4

    if-eqz v1, :cond_9

    sget-boolean v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zza:Z

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    const-string v5, "Future.cancel() was called."

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;-><init>(ZLjava/lang/Throwable;)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    :goto_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    move-object v4, p0

    move v5, v2

    :cond_3
    :goto_3
    sget-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v6, v4, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-static {v4, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V

    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    if-eqz v4, :cond_7

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzh;

    if-eqz v4, :cond_6

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    iget-object v0, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    if-nez v0, :cond_4

    move v5, v3

    goto :goto_4

    :cond_4
    move v5, v2

    :goto_4
    instance-of v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    or-int/2addr v5, v6

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    return v3

    :cond_6
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_7
    return v3

    :cond_8
    iget-object v0, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    if-nez v6, :cond_3

    return v5

    :cond_9
    return v2
.end method

.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_8

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    instance-of v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    xor-int/2addr v4, v2

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    if-eq v0, v3, :cond_7

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    .line 4
    invoke-direct {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;-><init>()V

    :cond_2
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    .line 5
    invoke-virtual {v4, v3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V

    .line 6
    invoke-virtual {v4, p0, v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 7
    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    if-eqz v0, :cond_4

    move v4, v2

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    instance-of v5, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    xor-int/2addr v5, v2

    and-int/2addr v4, v5

    if-eqz v4, :cond_3

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 11
    :cond_5
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzx(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V

    new-instance v0, Ljava/lang/InterruptedException;

    .line 12
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 13
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    if-ne v0, v4, :cond_2

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    .line 14
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 15
    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    .line 16
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    .line 17
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    .line 18
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v6

    if-nez v6, :cond_16

    .line 19
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    const/4 v8, 0x1

    if-eqz v6, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    instance-of v10, v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    xor-int/2addr v10, v8

    and-int/2addr v9, v10

    if-eqz v9, :cond_1

    .line 20
    invoke-static {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    const-wide/16 v9, 0x0

    cmp-long v6, v4, v9

    if-lez v6, :cond_2

    .line 21
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    add-long/2addr v11, v4

    goto :goto_1

    :cond_2
    move-wide v11, v9

    :goto_1
    const-wide/16 v13, 0x3e8

    cmp-long v6, v4, v13

    if-ltz v6, :cond_a

    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    sget-object v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    if-eq v6, v15, :cond_9

    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    .line 22
    invoke-direct {v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;-><init>()V

    :cond_3
    sget-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    .line 23
    invoke-virtual {v7, v15, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V

    .line 24
    invoke-virtual {v7, v0, v6, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_4
    const-wide v6, 0x1dcd64ffffffffffL    # 3.98785104510193E-165

    .line 25
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 26
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_7

    .line 27
    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    if-eqz v4, :cond_5

    move v5, v8

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    instance-of v6, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    xor-int/2addr v6, v8

    and-int/2addr v5, v6

    if-eqz v5, :cond_6

    .line 28
    invoke-static {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 29
    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    cmp-long v6, v4, v13

    if-gez v6, :cond_4

    .line 30
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzx(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V

    goto :goto_3

    .line 31
    :cond_7
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzx(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;)V

    new-instance v1, Ljava/lang/InterruptedException;

    .line 32
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 33
    :cond_8
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->waiters:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    sget-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzj;

    if-ne v6, v7, :cond_3

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    .line 34
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_a
    :goto_3
    cmp-long v6, v4, v9

    if-lez v6, :cond_e

    .line 35
    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    if-eqz v4, :cond_b

    move v5, v8

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    instance-of v6, v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    xor-int/2addr v6, v8

    and-int/2addr v5, v6

    if-eqz v5, :cond_c

    .line 36
    invoke-static {v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 37
    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_d

    .line 38
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    goto :goto_3

    .line 39
    :cond_d
    new-instance v1, Ljava/lang/InterruptedException;

    .line 40
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 41
    :cond_e
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->toString()Ljava/lang/String;

    move-result-object v6

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Waited "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-long v11, v4, v13

    cmp-long v11, v11, v9

    if-gez v11, :cond_14

    const-string v11, " (plus "

    invoke-virtual {v2, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    neg-long v4, v4

    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 44
    invoke-virtual {v3, v4, v5, v11}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v11

    .line 45
    invoke-virtual {v3, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v16

    sub-long v4, v4, v16

    cmp-long v3, v11, v9

    if-eqz v3, :cond_10

    cmp-long v9, v4, v13

    if-lez v9, :cond_f

    goto :goto_5

    :cond_f
    const/4 v8, 0x0

    :cond_10
    :goto_5
    if-lez v3, :cond_12

    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v8, :cond_11

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_11
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_12
    if-eqz v8, :cond_13

    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " nanoseconds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    const-string v1, "delay)"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    :cond_14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->isDone()Z

    move-result v1

    if-eqz v1, :cond_15

    const-string v1, " but future completed as timeout expired"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    new-instance v2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v2, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 50
    :cond_15
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :cond_16
    new-instance v1, Ljava/lang/InterruptedException;

    .line 52
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    return v0
.end method

.method public final isDone()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v1, v2

    and-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.common.util.concurrent."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzs(Ljava/lang/StringBuilder;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzt(Ljava/lang/StringBuilder;)V

    :goto_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzf()Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remaining delay=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzg()Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;->zzb:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzl(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    const-string v0, "Executor was null."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaz;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    if-eq v0, v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    iput-object v0, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->listeners:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzd;

    if-ne v0, v2, :cond_0

    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzw(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public zzm()V
    .locals 0

    return-void
.end method

.method public final zzn(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final zzo(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v0, p0, v3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzv(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V

    return v2

    :cond_0
    return v1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)V

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {v4, p0, v3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzee;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzee;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;->zzl(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzc;

    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    return v2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    :cond_3
    instance-of v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    if-eqz v2, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzc:Z

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_4
    return v1
.end method

.method public final zzp()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->value:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzb;->zzc:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
