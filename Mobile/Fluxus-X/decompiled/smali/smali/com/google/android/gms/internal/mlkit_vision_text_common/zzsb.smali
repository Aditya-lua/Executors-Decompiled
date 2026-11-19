.class public final enum Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcv;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field private static final synthetic zzj:[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;


# instance fields
.field private final zzk:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v2, "LATIN"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v3, "LATIN_AND_CHINESE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v4, "LATIN_AND_DEVANAGARI"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v5, "LATIN_AND_JAPANESE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v6, "LATIN_AND_KOREAN"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v7, "CREDIT_CARD"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v8, "DOCUMENT"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzh:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const-string v9, "PIXEL_AI"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    filled-new-array/range {v0 .. v8}, [Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzj:[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzk:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzj:[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzk:I

    return v0
.end method
