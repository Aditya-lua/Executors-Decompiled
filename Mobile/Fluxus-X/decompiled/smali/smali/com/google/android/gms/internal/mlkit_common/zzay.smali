.class public final Lcom/google/android/gms/internal/mlkit_common/zzay;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:I

.field private final zzb:Lcom/google/android/gms/internal/mlkit_common/zzbb;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzbb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzbb;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzbb;

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza:I

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzax;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzbb;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzax;-><init>(ILcom/google/android/gms/internal/mlkit_common/zzbb;)V

    return-object v0
.end method
