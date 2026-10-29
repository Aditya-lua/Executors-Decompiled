.class public Lbacktraceio/library/common/ApplicationMetadataCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "ApplicationMetadataCache"

.field private static volatile instance:Lbacktraceio/library/common/ApplicationMetadataCache;


# instance fields
.field private applicationName:Ljava/lang/String;

.field private applicationVersion:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private packageName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lbacktraceio/library/common/ApplicationMetadataCache;
    .locals 2

    sget-object v0, Lbacktraceio/library/common/ApplicationMetadataCache;->instance:Lbacktraceio/library/common/ApplicationMetadataCache;

    if-nez v0, :cond_1

    const-class v0, Lbacktraceio/library/common/ApplicationMetadataCache;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lbacktraceio/library/common/ApplicationMetadataCache;->instance:Lbacktraceio/library/common/ApplicationMetadataCache;

    if-nez v1, :cond_0

    new-instance v1, Lbacktraceio/library/common/ApplicationMetadataCache;

    invoke-direct {v1, p0}, Lbacktraceio/library/common/ApplicationMetadataCache;-><init>(Landroid/content/Context;)V

    sput-object v1, Lbacktraceio/library/common/ApplicationMetadataCache;->instance:Lbacktraceio/library/common/ApplicationMetadataCache;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lbacktraceio/library/common/ApplicationMetadataCache;->instance:Lbacktraceio/library/common/ApplicationMetadataCache;

    return-object p0
.end method


# virtual methods
.method public getApplicationName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationName:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationName:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationVersion:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationVersion:Ljava/lang/String;

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->applicationVersion:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    sget-object v1, Lbacktraceio/library/common/ApplicationMetadataCache;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Could not resolve application version"

    invoke-static {v1, v2, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, ""

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->packageName:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/common/ApplicationMetadataCache;->packageName:Ljava/lang/String;

    return-object v0
.end method
