.class public final enum Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/sdkinternal/model/ModelLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ModelLoadingState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum LOCAL_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum NO_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum REMOTE_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private static final synthetic zza:[Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    const-string v1, "NO_MODEL_LOADED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->NO_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    new-instance v1, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    const-string v2, "REMOTE_MODEL_LOADED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->REMOTE_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    new-instance v2, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    const-string v3, "LOCAL_MODEL_LOADED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->LOCAL_MODEL_LOADED:Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    filled-new-array {v0, v1, v2}, [Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->zza:[Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->zza:[Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    invoke-virtual {v0}, [Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/mlkit/common/sdkinternal/model/ModelLoader$ModelLoadingState;

    return-object v0
.end method
