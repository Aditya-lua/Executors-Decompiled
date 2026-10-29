.class public final Lcom/withpersona/sdk2/camera/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/camera/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;",
        "a",
        "(Lcom/withpersona/sdk2/camera/CameraProperties;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;",
        "camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/withpersona/sdk2/camera/CameraProperties;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;
    .locals 11
    .param p0    # Lcom/withpersona/sdk2/camera/CameraProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->f()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/camera/c$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "Unspecified"

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    const-string v0, "Back"

    goto :goto_0

    :cond_2
    const-string v0, "Front"

    goto :goto_0

    :goto_1
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->i()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->k()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->k()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->g()I

    move-result v0

    int-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/CameraProperties;->a()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;Ljava/lang/Double;Ljava/lang/Double;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
