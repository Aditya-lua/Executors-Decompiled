.class public Lwh/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/p;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lwh/f$d;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lwh/p;->b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;
    .locals 4

    new-instance v0, Lwh/p;

    invoke-direct {v0, p0}, Lwh/p;-><init>(Landroid/content/Context;)V

    new-instance p0, Lqk/a;

    invoke-virtual {v0}, Lwh/p;->f()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v1

    invoke-direct {p0, v1}, Lqk/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lqk/a;->isLuaHomePageEnabled:Z

    iput-boolean v1, p0, Lqk/a;->isLuaGamesPageEnabled:Z

    iput-boolean v1, p0, Lqk/a;->isLuaChatEnabled:Z

    invoke-static {}, Lsg/a1;->r0()Z

    move-result v1

    iput-boolean v1, p0, Lqk/a;->isTablet:Z

    invoke-virtual {v0}, Lwh/p;->d()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v0

    new-instance v1, Lwh/f$d;

    invoke-direct {v1}, Lwh/f$d;-><init>()V

    iput-object p0, v1, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    iput-object v0, v1, Lwh/f$d;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    const-string p0, "rbxasset://places/Mobile.rbxl"

    iput-object p0, v1, Lwh/f$d;->d:Ljava/lang/String;

    const-string p0, "LuaAppStarterScript"

    iput-object p0, v1, Lwh/f$d;->e:Ljava/lang/String;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->j()J

    move-result-wide v2

    iput-wide v2, v1, Lwh/f$d;->f:J

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->n()Z

    move-result p0

    iput-boolean p0, v1, Lwh/f$d;->g:Z

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lwh/f$d;->h:Ljava/lang/String;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->d()I

    move-result p0

    iput p0, v1, Lwh/f$d;->i:I

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p0

    invoke-virtual {p0}, Lfk/c;->i()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lwh/f$d;->j:Ljava/lang/String;

    iput-object p1, v1, Lwh/f$d;->a:Landroid/app/Activity;

    return-object v1
.end method

.method public static c(Landroid/content/Context;)Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    new-instance v0, Lwh/p;

    invoke-direct {v0, p0}, Lwh/p;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lwh/p;->d()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object p0

    return-object p0
.end method

.method public static e()Lcom/roblox/engine/jni/model/DeviceStaticParams;
    .locals 3

    new-instance v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;

    invoke-direct {v0}, Lcom/roblox/engine/jni/model/DeviceStaticParams;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->osVersion:Ljava/lang/String;

    invoke-static {}, Lsg/v;->b()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->deviceName:Ljava/lang/String;

    invoke-static {}, Lsg/a1;->d1()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->appVersion:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->manufacturer:Ljava/lang/String;

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_0

    invoke-static {}, Lwh/o;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->deviceSku:Ljava/lang/String;

    invoke-static {}, Lk1/a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->socModel:Ljava/lang/String;

    :cond_0
    invoke-static {}, Lgk/h;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->appBuildVariant:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/roblox/engine/jni/model/DeviceStaticParams;->cpu64Bit:Z

    return-object v0
.end method


# virtual methods
.method public d()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 5

    new-instance v0, Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-direct {v0}, Lcom/roblox/engine/jni/model/DeviceParams;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->osVersion:Ljava/lang/String;

    invoke-static {}, Lsg/v;->b()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->deviceName:Ljava/lang/String;

    invoke-static {}, Lsg/a1;->d1()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->appVersion:Ljava/lang/String;

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/b;->e()Ljava/util/Locale;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->country:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->manufacturer:Ljava/lang/String;

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2}, Lel/a;->c(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->deviceTotalMemoryMB:I

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2}, Lel/a;->j(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, v2, Landroid/graphics/Point;->x:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->displayResolution:Ljava/lang/String;

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2}, Lel/a;->h(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Point;->x:I

    iput v3, v0, Lcom/roblox/engine/jni/model/DeviceParams;->displayPhysicalWidthPixels:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    iput v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->displayPhysicalHeightPixels:I

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2}, Lsg/e2;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->networkType:Ljava/lang/String;

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2, v0}, Lsg/e2;->b(Landroid/content/Context;Lcom/roblox/engine/jni/model/DeviceParams;)V

    iget-object v2, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v2, v0}, Lsg/e2;->c(Landroid/content/Context;Lcom/roblox/engine/jni/model/DeviceParams;)V

    invoke-static {}, Lsg/a1;->k0()Z

    move-result v2

    iput-boolean v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->isChrome:Z

    invoke-static {}, Lgk/h;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->appBuildVariant:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, v0, Lcom/roblox/engine/jni/model/DeviceParams;->cpu64Bit:Z

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_2

    invoke-static {}, Lwh/o;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->deviceSku:Ljava/lang/String;

    invoke-static {}, Lk1/a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->socModel:Ljava/lang/String;

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->Y1()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v1}, Lsg/v;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->testDeviceName:Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method public f()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 3

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v0

    invoke-virtual {v0}, Lmk/c;->r()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPlatformParams: assetFolderPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DataModelParamsCreator"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    iput-object v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    iget-object v0, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.touchscreen"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    iget-object v0, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.type.pc"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    iget-object v0, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    iget-object v0, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lel/a;->e(Landroid/content/Context;)F

    move-result v0

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    iget-object v0, p0, Lwh/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lel/a;->i(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v0

    iget v2, v0, Landroid/graphics/Point;->x:I

    iput v2, v1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    return-object v1
.end method
