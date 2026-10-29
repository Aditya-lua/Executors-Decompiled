.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zze;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/common/sdkinternal/CloseGuard;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_common/zzsh;

.field public final synthetic zzd:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/sdkinternal/CloseGuard;ILcom/google/android/gms/internal/mlkit_common/zzsh;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zza:Lcom/google/mlkit/common/sdkinternal/CloseGuard;

    iput p2, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzb:I

    iput-object p3, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzd:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zza:Lcom/google/mlkit/common/sdkinternal/CloseGuard;

    iget v1, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzb:I

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/zze;->zzd:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/mlkit/common/sdkinternal/CloseGuard;->zza(ILcom/google/android/gms/internal/mlkit_common/zzsh;Ljava/lang/Runnable;)V

    return-void
.end method
