.class public abstract Lcom/google/mlkit/vision/common/PointF3D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static from(FFF)Lcom/google/mlkit/vision/common/PointF3D;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/mlkit/vision/common/zza;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/mlkit/vision/common/zza;-><init>(FFF)V

    return-object v0
.end method


# virtual methods
.method public abstract getX()F
.end method

.method public abstract getY()F
.end method

.method public abstract getZ()F
.end method
