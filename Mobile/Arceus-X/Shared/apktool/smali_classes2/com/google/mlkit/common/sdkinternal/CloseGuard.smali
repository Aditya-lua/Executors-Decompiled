.class public Lcom/google/mlkit/common/sdkinternal/CloseGuard;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/sdkinternal/CloseGuard$Factory;
    }
.end annotation


# static fields
.field public static final API_TRANSLATE:I = 0x1


# instance fields
.field private final zza:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILcom/google/mlkit/common/sdkinternal/Cleaner;Ljava/lang/Runnable;Lcom/google/android/gms/internal/mlkit_common/zzsh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zzb:Ljava/lang/String;

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/zze;

    invoke-direct {v0, p0, p2, p5, p4}, Lcom/google/mlkit/common/sdkinternal/zze;-><init>(Lcom/google/mlkit/common/sdkinternal/CloseGuard;ILcom/google/android/gms/internal/mlkit_common/zzsh;Ljava/lang/Runnable;)V

    invoke-virtual {p3, p1, v0}, Lcom/google/mlkit/common/sdkinternal/Cleaner;->register(Ljava/lang/Object;Ljava/lang/Runnable;)Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zzc:Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zzc:Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;

    invoke-interface {v0}, Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;->clean()V

    return-void
.end method

.method public final synthetic zza(ILcom/google/android/gms/internal/mlkit_common/zzsh;Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zzb:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%s has not been closed"

    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MlKitCloseGuard"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzmw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzmw;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzmn;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzmn;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzb(I)Lcom/google/android/gms/internal/mlkit_common/zzmm;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_common/zzmn;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzmm;)Lcom/google/android/gms/internal/mlkit_common/zzmn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzmn;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzmp;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzmw;->zzh(Lcom/google/android/gms/internal/mlkit_common/zzmp;)Lcom/google/android/gms/internal/mlkit_common/zzmw;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzmw;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmv;->zzbH:Lcom/google/android/gms/internal/mlkit_common/zzmv;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzd(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;)V

    :cond_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void
.end method
