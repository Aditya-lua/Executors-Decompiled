.class public final synthetic Lcom/google/mlkit/vision/common/internal/zzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic zza:Lcom/google/mlkit/vision/common/internal/zzb;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/zzb;

    invoke-direct {v0}, Lcom/google/mlkit/vision/common/internal/zzb;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/common/internal/zzb;->zza:Lcom/google/mlkit/vision/common/internal/zzb;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    sget v0, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->zza:I

    const/4 v0, 0x0

    return-object v0
.end method
