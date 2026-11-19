.class public Lbacktraceio/library/models/json/BacktraceAttributes;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sessionId:Ljava/lang/String;


# instance fields
.field public attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final complexAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/models/json/BacktraceAttributes;->sessionId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, p2, p3, v0}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    .line 6
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 7
    invoke-direct {p0, p2}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertReportAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 8
    invoke-direct {p0, p2}, Lbacktraceio/library/models/json/BacktraceAttributes;->setExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 9
    invoke-direct {p0, p3}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertAttributes(Ljava/util/Map;)V

    :cond_1
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    .line 10
    invoke-static {p2, p3}, Lbacktraceio/library/models/json/BacktraceReport;->concatAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Ljava/util/Map;

    .line 11
    :cond_2
    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->setAppInformation()V

    .line 12
    invoke-direct {p0, p4}, Lbacktraceio/library/models/json/BacktraceAttributes;->setDeviceInformation(Ljava/lang/Boolean;)V

    .line 13
    invoke-direct {p0, p4}, Lbacktraceio/library/models/json/BacktraceAttributes;->setScreenInformation(Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0, p2, v1}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/lang/Boolean;)V

    return-void
.end method

.method private convertAttributes(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lbacktraceio/library/models/attributes/ReportDataBuilder;->getReportAttributes(Ljava/util/Map;)Lbacktraceio/library/models/attributes/ReportDataAttributes;

    move-result-object p1

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-virtual {p1}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->getAttributes()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    invoke-virtual {p1}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->getAnnotations()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private convertReportAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lbacktraceio/library/models/json/BacktraceReport;->concatAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertAttributes(Ljava/util/Map;)V

    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    const-string v1, "Exception properties"

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private getScreenBrightness()I
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private getScreenOrientation()Lbacktraceio/library/enums/ScreenOrientation;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->PORTRAIT:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->LANDSCAPE:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0

    :cond_1
    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->UNDEFINED:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0
.end method

.method private setAppInformation()V
    .locals 4

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-static {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getInstance(Landroid/content/Context;)Lbacktraceio/library/common/ApplicationMetadataCache;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "application.package"

    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "application"

    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getApplicationName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getApplicationVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "application.version"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "version"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "application.session"

    sget-object v2, Lbacktraceio/library/models/json/BacktraceAttributes;->sessionId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "backtrace.agent"

    const-string v2, "backtrace-android"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "backtrace.version"

    sget-object v2, Lbacktraceio/library/base/BacktraceBase;->version:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setDeviceInformation(Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "uname.version"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "culture"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "build.type"

    const-string v2, "Release"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "device.model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "device.brand"

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "device.product"

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device.sdk"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "device.manufacturer"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "os.version"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device.os_version"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lbacktraceio/library/common/DeviceAttributesHelper;

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lbacktraceio/library/common/DeviceAttributesHelper;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-virtual {v0, p1}, Lbacktraceio/library/common/DeviceAttributesHelper;->getDeviceAttributes(Ljava/lang/Boolean;)Ljava/util/HashMap;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method private setExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "error.message"

    if-nez v0, :cond_1

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "classifier"

    iget-object v3, p1, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setScreenInformation(Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "screen.width"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v2, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "screen.height"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "screen.dpi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getScreenOrientation()Lbacktraceio/library/enums/ScreenOrientation;

    move-result-object v0

    invoke-virtual {v0}, Lbacktraceio/library/enums/ScreenOrientation;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "screen.orientation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getScreenBrightness()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "screen.brightness"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getAllAttributes()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getComplexAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    return-object v0
.end method
