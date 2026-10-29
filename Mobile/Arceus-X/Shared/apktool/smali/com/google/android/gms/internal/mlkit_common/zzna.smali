.class public final enum Lcom/google/android/gms/internal/mlkit_common/zzna;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_common/zzba;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_common/zzna;

.field private static final synthetic zzn:[Lcom/google/android/gms/internal/mlkit_common/zzna;


# instance fields
.field private final zzo:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v1, "UNKNOWN_STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zza:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v2, "EXPLICITLY_REQUESTED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v3, "IMPLICITLY_REQUESTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v4, "MODEL_INFO_RETRIEVAL_SUCCEEDED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v5, "MODEL_INFO_RETRIEVAL_FAILED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_common/zzna;->zze:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v6, "SCHEDULED"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v7, "DOWNLOADING"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzg:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v8, "SUCCEEDED"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v9, "FAILED"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v9, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v10, "LIVE"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzj:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v11, "UPDATE_AVAILABLE"

    const/16 v12, 0xa

    invoke-direct {v10, v11, v12, v12}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzk:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v11, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v12, "DOWNLOADED"

    const/16 v13, 0xb

    invoke-direct {v11, v12, v13, v13}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzl:Lcom/google/android/gms/internal/mlkit_common/zzna;

    new-instance v12, Lcom/google/android/gms/internal/mlkit_common/zzna;

    const-string v13, "STARTED"

    const/16 v14, 0xc

    invoke-direct {v12, v13, v14, v14}, Lcom/google/android/gms/internal/mlkit_common/zzna;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzm:Lcom/google/android/gms/internal/mlkit_common/zzna;

    filled-new-array/range {v0 .. v12}, [Lcom/google/android/gms/internal/mlkit_common/zzna;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzn:[Lcom/google/android/gms/internal/mlkit_common/zzna;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzo:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_common/zzna;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzn:[Lcom/google/android/gms/internal/mlkit_common/zzna;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_common/zzna;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_common/zzna;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzo:I

    return v0
.end method
