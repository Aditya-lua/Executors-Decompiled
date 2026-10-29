.class public abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzi(Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxd;-><init>()V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxd;->zzg(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zze(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzf(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzd(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzi(Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzc(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzb(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const-wide/16 v3, 0x5dc

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzk(J)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const-wide/16 v3, 0xbb8

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzh(J)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zza(Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzj(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    const v1, 0x3d4ccccd    # 0.05f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;->zzl(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxl;

    return-object v0
.end method


# virtual methods
.method public abstract zza()F
.end method

.method public abstract zzb()F
.end method

.method public abstract zzc()F
.end method

.method public abstract zzd()F
.end method

.method public abstract zze()F
.end method

.method public abstract zzf()F
.end method

.method public abstract zzg()I
.end method

.method public abstract zzh()I
.end method

.method public abstract zzi()J
.end method

.method public abstract zzj()J
.end method

.method public abstract zzk()Z
.end method

.method public abstract zzl()Z
.end method
