.class public final synthetic Lcom/google/mlkit/vision/face/internal/zzl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/g;


# static fields
.field public static final synthetic zza:Lcom/google/mlkit/vision/face/internal/zzl;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/face/internal/zzl;

    invoke-direct {v0}, Lcom/google/mlkit/vision/face/internal/zzl;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/face/internal/zzl;->zza:Lcom/google/mlkit/vision/face/internal/zzl;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lmf/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/mlkit/vision/face/internal/zzc;

    const-class v1, Lcom/google/mlkit/vision/face/internal/zze;

    invoke-interface {p1, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/vision/face/internal/zze;

    const-class v2, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-interface {p1, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/face/internal/zzc;-><init>(Lcom/google/mlkit/vision/face/internal/zze;Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;)V

    return-object v0
.end method
