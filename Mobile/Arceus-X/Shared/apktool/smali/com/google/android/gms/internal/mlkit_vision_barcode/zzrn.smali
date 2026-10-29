.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field public static final enum zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

.field private static final synthetic zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;


# instance fields
.field private final zzp:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v1, "FORMAT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v2, "FORMAT_CODE_128"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v3, "FORMAT_CODE_39"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v4, "FORMAT_CODE_93"

    const/4 v5, 0x3

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v5, "FORMAT_CODABAR"

    const/16 v7, 0x8

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/4 v6, 0x5

    const/16 v8, 0x10

    const-string v9, "FORMAT_DATA_MATRIX"

    invoke-direct {v5, v9, v6, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/4 v8, 0x6

    const/16 v9, 0x20

    const-string v10, "FORMAT_EAN_13"

    invoke-direct {v6, v10, v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/4 v9, 0x7

    const/16 v10, 0x40

    const-string v11, "FORMAT_EAN_8"

    invoke-direct {v8, v11, v9, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    move-object v9, v8

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const-string v10, "FORMAT_ITF"

    const/16 v11, 0x80

    invoke-direct {v8, v10, v7, v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    move-object v7, v9

    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/16 v10, 0x9

    const/16 v11, 0x100

    const-string v12, "FORMAT_QR_CODE"

    invoke-direct {v9, v12, v10, v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/16 v11, 0xa

    const/16 v12, 0x200

    const-string v13, "FORMAT_UPC_A"

    invoke-direct {v10, v13, v11, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/16 v12, 0xb

    const/16 v13, 0x400

    const-string v14, "FORMAT_UPC_E"

    invoke-direct {v11, v14, v12, v13}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/16 v13, 0xc

    const/16 v14, 0x800

    const-string v15, "FORMAT_PDF417"

    invoke-direct {v12, v15, v13, v14}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    new-instance v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    const/16 v14, 0xd

    const/16 v15, 0x1000

    move-object/from16 v16, v0

    const-string v0, "FORMAT_AZTEC"

    invoke-direct {v13, v0, v14, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    move-object/from16 v0, v16

    filled-new-array/range {v0 .. v13}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzp:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrn;->zzp:I

    return v0
.end method
