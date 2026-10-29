.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;

.field private zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

.field private zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

.field private zzd:Ljava/lang/Integer;

.field private zze:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;)Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    return-object p0
.end method

.method public static bridge synthetic zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;)Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

    return-object p0
.end method

.method public static bridge synthetic zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;)Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;

    return-object p0
.end method

.method public static bridge synthetic zzj(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzd:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic zzk(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zze:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzd:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

    return-object p0
.end method

.method public final zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;

    return-object p0
.end method

.method public final zzh(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;->zze:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zzi()Lcom/google/android/gms/internal/mlkit_vision_face/zzll;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzlj;Lcom/google/android/gms/internal/mlkit_vision_face/zzlk;)V

    return-object v0
.end method
