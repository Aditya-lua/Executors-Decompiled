.class public Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/NativeVideoInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VideoDeviceId"
.end annotation


# instance fields
.field public final exifOrientation:I

.field public final guid:Ljava/lang/String;

.field public final isPreferred:Z

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;->isPreferred:Z

    iput-object p2, p0, Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;->name:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;->guid:Ljava/lang/String;

    iput p4, p0, Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;->exifOrientation:I

    return-void
.end method


# virtual methods
.method public getExifOrientation()Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 3

    invoke-static {}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->values()[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    move-result-object v0

    iget v1, p0, Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;->exifOrientation:I

    array-length v2, v0

    if-ge v1, v2, :cond_0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
