.class public final enum Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_face/zzcs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;


# instance fields
.field private final zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    const-string v2, "TYPE_THIN"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    const-string v3, "TYPE_THICK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    const-string v4, "TYPE_GMV"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zze:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzf:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zze:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkr;->zzf:I

    return v0
.end method
