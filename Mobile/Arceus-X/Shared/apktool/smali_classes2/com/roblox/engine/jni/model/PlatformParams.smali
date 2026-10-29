.class public Lcom/roblox/engine/jni/model/PlatformParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public assetFolderPath:Ljava/lang/String;

.field public dpiScale:F

.field public isKeyboardDevice:Z

.field public isMouseDevice:Z

.field public isTouchDevice:Z

.field public viewportHeightMm:I

.field public viewportWidthMm:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    iget v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    iput v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    iget v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iput v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iget v0, p1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    iput v0, p0, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    iget-object p1, p1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    iput-object p1, p0, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    :cond_0
    return-void
.end method
