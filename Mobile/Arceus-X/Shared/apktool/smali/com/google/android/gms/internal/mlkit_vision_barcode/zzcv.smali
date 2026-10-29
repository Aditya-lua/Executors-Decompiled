.class public abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcn;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field private transient zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcn;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzds;->zzb(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzds;->zza(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdu;

    move-result-object v0

    return-object v0
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdu;
.end method

.method public final zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    :cond_0
    return-object v0
.end method

.method public zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcn;->toArray()[Ljava/lang/Object;

    move-result-object v0

    sget v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzd:I

    array-length v1, v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzg([Ljava/lang/Object;I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    move-result-object v0

    return-object v0
.end method
