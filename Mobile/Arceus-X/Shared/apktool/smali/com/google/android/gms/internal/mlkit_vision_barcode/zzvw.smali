.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field private static final synthetic zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;


# instance fields
.field private final zzr:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "UNRECOGNIZED"

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "CODE_128"

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "CODE_39"

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "CODE_93"

    const/4 v5, 0x3

    invoke-direct {v4, v0, v5, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "CODABAR"

    const/4 v6, 0x4

    invoke-direct {v5, v0, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "DATA_MATRIX"

    const/4 v7, 0x5

    invoke-direct {v6, v0, v7, v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "EAN_13"

    const/4 v8, 0x6

    invoke-direct {v7, v0, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "EAN_8"

    const/4 v9, 0x7

    invoke-direct {v8, v0, v9, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "ITF"

    const/16 v10, 0x8

    invoke-direct {v9, v0, v10, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "QR_CODE"

    const/16 v11, 0x9

    invoke-direct {v10, v0, v11, v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "UPC_A"

    const/16 v12, 0xa

    invoke-direct {v11, v0, v12, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "UPC_E"

    const/16 v13, 0xb

    invoke-direct {v12, v0, v13, v13}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "PDF417"

    const/16 v14, 0xc

    invoke-direct {v13, v0, v14, v14}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "AZTEC"

    const/16 v15, 0xd

    invoke-direct {v14, v0, v15, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const-string v0, "DATABAR"

    move-object/from16 v16, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    const/16 v1, 0xf

    move-object/from16 v17, v2

    const/16 v2, 0x10

    move-object/from16 v18, v3

    const-string v3, "TEZ_CODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v16, v0

    filled-new-array/range {v1 .. v16}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzr:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzr:I

    return v0
.end method
