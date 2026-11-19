.class public final enum Lcom/google/android/gms/internal/mlkit_common/zzne;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_common/zzba;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field private static final synthetic zzl:[Lcom/google/android/gms/internal/mlkit_common/zzne;


# instance fields
.field private final zzm:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzne;->zza:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v2, "CUSTOM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v3, "AUTOML_IMAGE_LABELING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v4, "BASE_TRANSLATE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v5, "CUSTOM_OBJECT_DETECTION"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_common/zzne;->zze:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v6, "CUSTOM_IMAGE_LABELING"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v7, "BASE_ENTITY_EXTRACTION"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzg:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v8, "BASE_DIGITAL_INK"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v9, "TOXICITY_DETECTION"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v9, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v10, "IMAGE_CAPTIONING"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzj:Lcom/google/android/gms/internal/mlkit_common/zzne;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_common/zzne;

    const-string v11, "DIGITAL_INK_SEGMENTATION"

    const/16 v12, 0xa

    invoke-direct {v10, v11, v12, v12}, Lcom/google/android/gms/internal/mlkit_common/zzne;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzk:Lcom/google/android/gms/internal/mlkit_common/zzne;

    filled-new-array/range {v0 .. v10}, [Lcom/google/android/gms/internal/mlkit_common/zzne;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzl:[Lcom/google/android/gms/internal/mlkit_common/zzne;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzm:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_common/zzne;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzl:[Lcom/google/android/gms/internal/mlkit_common/zzne;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_common/zzne;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_common/zzne;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzne;->zzm:I

    return v0
.end method
