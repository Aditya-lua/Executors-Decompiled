.class public final enum Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_face/zzcs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

.field private static final synthetic zzd:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;


# instance fields
.field private final zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    const-string v1, "UNKNOWN_PERFORMANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    const-string v2, "FAST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    const-string v3, "ACCURATE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    filled-new-array {v0, v1, v2}, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zze:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;->zze:I

    return v0
.end method
