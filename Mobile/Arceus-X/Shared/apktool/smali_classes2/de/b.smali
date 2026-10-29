.class public final Lde/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lde/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)Lde/a;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lae/x0;->a(Landroid/content/Context;)Lae/s0;

    move-result-object v0

    invoke-interface {v0}, Lae/s0;->zzb()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Lde/b;->b(Landroid/content/Context;Ljava/io/File;)Lde/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lsd/a;

    const-string v1, "Local testing directory not found: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lsd/a;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lsd/a;

    const-string v0, "Failed to retrieve local testing directory path"

    invoke-direct {p0, v0}, Lsd/a;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static declared-synchronized b(Landroid/content/Context;Ljava/io/File;)Lde/a;
    .locals 2

    const-class v0, Lde/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lde/b;->a:Lde/a;

    if-nez v1, :cond_0

    invoke-static {p0, p1}, Lde/b;->c(Landroid/content/Context;Ljava/io/File;)Lde/a;

    move-result-object p0

    sput-object p0, Lde/b;->a:Lde/a;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lde/a;->g()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    sget-object p0, Lde/b;->a:Lde/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/RuntimeException;

    sget-object v1, Lde/b;->a:Lde/a;

    invoke-virtual {v1}, Lde/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Different module directories used to initialize FakeSplitInstallManager: \'%s\' and \'%s\'"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static c(Landroid/content/Context;Ljava/io/File;)Lde/a;
    .locals 3

    invoke-static {p0}, Lzd/a;->a(Landroid/content/Context;)Z

    new-instance v0, Lde/a;

    new-instance v1, Lae/v0;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lae/v0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Lde/s;

    invoke-direct {v2, p1}, Lde/s;-><init>(Ljava/io/File;)V

    invoke-direct {v0, p0, p1, v1, v2}, Lde/a;-><init>(Landroid/content/Context;Ljava/io/File;Lae/v0;Lbe/u0;)V

    return-object v0
.end method
