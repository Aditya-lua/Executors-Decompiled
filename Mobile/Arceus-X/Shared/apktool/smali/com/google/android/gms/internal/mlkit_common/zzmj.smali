.class public final Lcom/google/android/gms/internal/mlkit_common/zzmj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field private final zzb:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzmh;Lcom/google/android/gms/internal/mlkit_common/zzmi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzmh;->zzd(Lcom/google/android/gms/internal/mlkit_common/zzmh;)Lcom/google/android/gms/internal/mlkit_common/zzne;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzmj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzne;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzmh;->zze(Lcom/google/android/gms/internal/mlkit_common/zzmh;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmj;->zzb:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_common/zzne;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzmj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzne;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzmj;->zzb:Ljava/lang/Boolean;

    return-object v0
.end method
