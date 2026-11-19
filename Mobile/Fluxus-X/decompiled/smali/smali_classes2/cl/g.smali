.class public Lcl/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Lcl/b;

.field public static c:Lmv/d0;

.field public static d:Ldl/f;

.field public static e:Lcl/f;

.field public static f:Lcl/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcl/a;

    invoke-direct {v0}, Lcl/a;-><init>()V

    sput-object v0, Lcl/g;->e:Lcl/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 2

    new-instance v0, Lcl/i;

    invoke-direct {v0}, Lcl/i;-><init>()V

    invoke-static {p0}, Lcom/roblox/platform/util/DeviceUtils;->getDeviceTotalMegabytes(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcl/i;->n(I)Lcl/i;

    move-result-object v0

    invoke-static {p0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenSize(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcl/i;->p(Landroid/graphics/Point;)Lcl/i;

    move-result-object v0

    invoke-static {p0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenDpi(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcl/i;->g(Landroid/graphics/Point;)Lcl/i;

    move-result-object v0

    invoke-static {p0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenDpSize(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcl/i;->f(Landroid/graphics/Point;)Lcl/i;

    move-result-object p0

    invoke-static {p5}, Lcom/roblox/platform/util/DeviceUtils;->getDeviceName(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcl/i;->d(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcl/i;->a(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcl/i;->r(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcl/i;->q(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcl/i;->e(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p4}, Lcl/i;->b(Ljava/lang/String;)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p5}, Lcl/i;->m(Z)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p6}, Lcl/i;->j(Z)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p7}, Lcl/i;->i(Z)Lcl/i;

    move-result-object p0

    invoke-virtual {p0, p8}, Lcl/i;->l(Z)Lcl/i;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcl/i;->k(Z)Lcl/i;

    move-result-object p0

    invoke-virtual {p0}, Lcl/i;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lmv/d0;
    .locals 2

    sget-object v0, Lcl/g;->c:Lmv/d0;

    if-nez v0, :cond_2

    const-class v0, Lcl/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcl/g;->c:Lmv/d0;

    if-nez v1, :cond_1

    sget-object v1, Lcl/g;->d:Ldl/f;

    if-nez v1, :cond_0

    new-instance v1, Ldl/c;

    invoke-direct {v1}, Ldl/c;-><init>()V

    sput-object v1, Lcl/g;->d:Ldl/f;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcl/g;->d:Ldl/f;

    invoke-interface {v1}, Ldl/f;->a()Lmv/d0;

    move-result-object v1

    sput-object v1, Lcl/g;->c:Lmv/d0;

    :cond_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_2
    sget-object v0, Lcl/g;->c:Lmv/d0;

    return-object v0
.end method

.method public static c()Lcl/b;
    .locals 1

    sget-object v0, Lcl/g;->b:Lcl/b;

    return-object v0
.end method

.method public static d()Lcl/d;
    .locals 2

    sget-object v0, Lcl/g;->f:Lcl/d;

    if-nez v0, :cond_1

    const-class v0, Lcl/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcl/g;->f:Lcl/d;

    if-nez v1, :cond_0

    sget-object v1, Lcl/g;->e:Lcl/f;

    invoke-interface {v1}, Lcl/f;->a()Lcl/d;

    move-result-object v1

    sput-object v1, Lcl/g;->f:Lcl/d;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcl/g;->f:Lcl/d;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcl/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Ldl/a;)V
    .locals 0

    invoke-static {p0}, Ldl/k;->b(Ldl/a;)V

    return-void
.end method

.method public static g(Lcl/b;)V
    .locals 0

    sput-object p0, Lcl/g;->b:Lcl/b;

    return-void
.end method

.method public static h(Ldl/f;)V
    .locals 0

    sput-object p0, Lcl/g;->d:Ldl/f;

    return-void
.end method

.method public static i(Lcl/f;)V
    .locals 1

    sput-object p0, Lcl/g;->e:Lcl/f;

    const-class p0, Lcl/g;

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lcl/g;->f:Lcl/d;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static j(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcl/g;->a:Ljava/lang/String;

    return-void
.end method
