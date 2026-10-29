.class public final Lfb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lfb/k;


# instance fields
.field public a:Z

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/k;

    invoke-direct {v0}, Lfb/k;-><init>()V

    sput-object v0, Lfb/k;->c:Lfb/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Z
    .locals 6

    iget-boolean v0, p0, Lfb/k;->b:Z

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x80

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p1}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Lw9/b;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    :catch_0
    move-object v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    :goto_0
    const/4 v3, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "com.epicgames.unreal.GameActivity.EngineVersion"

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "5."

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Landroid/content/ComponentName;

    const-string v4, "com.epicgames.unreal.GameActivity"

    invoke-direct {v0, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const-string v0, "android.app.lib_name"

    invoke-virtual {p1, v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unreal"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    iput-boolean v3, p0, Lfb/k;->a:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lfb/k;->b:Z

    return v3

    :cond_5
    iget-boolean p1, p0, Lfb/k;->a:Z

    return p1
.end method
