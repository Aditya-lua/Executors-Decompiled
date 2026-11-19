.class public Lg7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Z = false

.field public static c:Z = true

.field public static d:Z = true

.field public static e:Lg7/a;

.field public static f:Lq7/f;

.field public static g:Lq7/e;

.field public static volatile h:Lq7/h;

.field public static volatile i:Lq7/g;

.field public static j:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lt7/g;",
            ">;"
        }
    .end annotation
.end field

.field public static k:Lk7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lg7/a;->a:Lg7/a;

    sput-object v0, Lg7/e;->e:Lg7/a;

    new-instance v0, Lk7/c;

    invoke-direct {v0}, Lk7/c;-><init>()V

    sput-object v0, Lg7/e;->k:Lk7/b;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "lottie_network_cache"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lg7/e;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lg7/e;->g()Lt7/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lt7/g;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)F
    .locals 1

    sget-boolean v0, Lg7/e;->b:Z

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {}, Lg7/e;->g()Lt7/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lt7/g;->b(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static d()Lg7/a;
    .locals 1

    sget-object v0, Lg7/e;->e:Lg7/a;

    return-object v0
.end method

.method public static e()Z
    .locals 1

    sget-boolean v0, Lg7/e;->d:Z

    return v0
.end method

.method public static f()Lk7/b;
    .locals 1

    sget-object v0, Lg7/e;->k:Lk7/b;

    return-object v0
.end method

.method public static g()Lt7/g;
    .locals 2

    sget-object v0, Lg7/e;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt7/g;

    if-nez v0, :cond_0

    new-instance v0, Lt7/g;

    invoke-direct {v0}, Lt7/g;-><init>()V

    sget-object v1, Lg7/e;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static h()Z
    .locals 1

    sget-boolean v0, Lg7/e;->b:Z

    return v0
.end method

.method public static i(Landroid/content/Context;)Lq7/g;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-boolean v0, Lg7/e;->c:Z

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Lg7/e;->i:Lq7/g;

    if-nez v0, :cond_3

    const-class v1, Lq7/g;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lg7/e;->i:Lq7/g;

    if-nez v0, :cond_2

    new-instance v0, Lq7/g;

    sget-object v2, Lg7/e;->g:Lq7/e;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lg7/d;

    invoke-direct {v2, p0}, Lg7/d;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-direct {v0, v2}, Lq7/g;-><init>(Lq7/e;)V

    sput-object v0, Lg7/e;->i:Lq7/g;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit v1

    return-object v0

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    return-object v0
.end method

.method public static j(Landroid/content/Context;)Lq7/h;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lg7/e;->h:Lq7/h;

    if-nez v0, :cond_2

    const-class v1, Lq7/h;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lg7/e;->h:Lq7/h;

    if-nez v0, :cond_1

    new-instance v0, Lq7/h;

    invoke-static {p0}, Lg7/e;->i(Landroid/content/Context;)Lq7/g;

    move-result-object p0

    sget-object v2, Lg7/e;->f:Lq7/f;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lq7/b;

    invoke-direct {v2}, Lq7/b;-><init>()V

    :goto_0
    invoke-direct {v0, p0, v2}, Lq7/h;-><init>(Lq7/g;Lq7/f;)V

    sput-object v0, Lg7/e;->h:Lq7/h;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit v1

    return-object v0

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    return-object v0
.end method
