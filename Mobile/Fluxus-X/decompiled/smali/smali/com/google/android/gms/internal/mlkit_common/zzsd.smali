.class public final synthetic Lcom/google/android/gms/internal/mlkit_common/zzsd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_common/zzsh;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_common/zzry;

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_common/zzmv;

.field public final synthetic zzd:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzsh;Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzry;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzmv;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzry;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzmv;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_common/zzsd;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;Ljava/lang/String;)V

    return-void
.end method
