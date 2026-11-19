.class public Lbh/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbh/u$c;,
        Lbh/u$b;
    }
.end annotation


# static fields
.field public static b:Lbh/u;


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbh/u;->a:Z

    return-void
.end method

.method public static bridge synthetic a(Lbh/u;Z)V
    .locals 0

    iput-boolean p1, p0, Lbh/u;->a:Z

    return-void
.end method

.method public static bridge synthetic b(Lbh/u;)Z
    .locals 0

    invoke-virtual {p0}, Lbh/u;->e()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic c(Lbh/u;)Z
    .locals 0

    invoke-virtual {p0}, Lbh/u;->f()Z

    move-result p0

    return p0
.end method

.method public static g()Lbh/u;
    .locals 2

    sget-object v0, Lbh/u;->b:Lbh/u;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lbh/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lbh/u;->b:Lbh/u;

    if-nez v1, :cond_1

    new-instance v1, Lbh/u;

    invoke-direct {v1}, Lbh/u;-><init>()V

    sput-object v1, Lbh/u;->b:Lbh/u;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lbh/u;->b:Lbh/u;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public d(Lbh/u$c;)V
    .locals 2

    new-instance v0, Lbh/u$a;

    invoke-direct {v0, p0, p1}, Lbh/u$a;-><init>(Lbh/u;Lbh/u$c;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public final e()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "test-keys"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 10

    const-string v8, "/data/local/su"

    const-string v9, "/su/bin/su"

    const-string v0, "/system/app/Superuser.apk"

    const-string v1, "/sbin/su"

    const-string v2, "/system/bin/su"

    const-string v3, "/system/xbin/su"

    const-string v4, "/data/local/xbin/su"

    const-string v5, "/data/local/bin/su"

    const-string v6, "/system/sd/xbin/su"

    const-string v7, "/system/bin/failsafe/su"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0xa

    if-ge v2, v3, :cond_1

    aget-object v3, v0, v2

    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lbh/u;->a:Z

    return v0
.end method

.method public i()Lbh/u$b;
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/NativeSettingsInterface;->getRunningArchitecture()I

    move-result v0

    invoke-static {v0}, Lbh/u$b;->b(I)Lbh/u$b;

    move-result-object v0

    return-object v0
.end method
