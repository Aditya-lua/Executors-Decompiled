.class public final enum Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/mlkit/common/sdkinternal/model/BaseModel;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ENTITY_EXTRACTION:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum IMAGE_CAPTIONING:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum TOXICITY_DETECTION:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum TRANSLATE:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum zza:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum zzb:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private static final synthetic zzc:[Lcom/google/mlkit/common/sdkinternal/model/BaseModel;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v1, "FACE_DETECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->zza:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    new-instance v1, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v2, "SMART_REPLY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->zzb:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    new-instance v2, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v3, "TRANSLATE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->TRANSLATE:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v4, "ENTITY_EXTRACTION"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->ENTITY_EXTRACTION:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    new-instance v4, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v5, "TOXICITY_DETECTION"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->TOXICITY_DETECTION:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    new-instance v5, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    const-string v6, "IMAGE_CAPTIONING"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->IMAGE_CAPTIONING:Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    filled-new-array/range {v0 .. v5}, [Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->zzc:[Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/mlkit/common/sdkinternal/model/BaseModel;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->zzc:[Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    invoke-virtual {v0}, [Lcom/google/mlkit/common/sdkinternal/model/BaseModel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/mlkit/common/sdkinternal/model/BaseModel;

    return-object v0
.end method
