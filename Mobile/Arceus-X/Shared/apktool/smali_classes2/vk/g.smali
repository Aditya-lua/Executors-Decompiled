.class public Lvk/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Lvk/b;

.field public static c:Lokhttp3/OkHttpClient;

.field public static d:Lwk/f;

.field public static e:Lvk/f;

.field public static f:Lvk/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvk/a;

    invoke-direct {v0}, Lvk/a;-><init>()V

    sput-object v0, Lvk/g;->e:Lvk/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;
    .locals 2

    new-instance v0, Lvk/i;

    invoke-direct {v0}, Lvk/i;-><init>()V

    invoke-static {p0}, Lel/a;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Lvk/i;->m(I)Lvk/i;

    move-result-object v0

    invoke-static {p0}, Lel/a;->j(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvk/i;->o(Landroid/graphics/Point;)Lvk/i;

    move-result-object v0

    invoke-static {p0}, Lel/a;->g(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvk/i;->g(Landroid/graphics/Point;)Lvk/i;

    move-result-object v0

    invoke-static {p0}, Lel/a;->f(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvk/i;->f(Landroid/graphics/Point;)Lvk/i;

    move-result-object p0

    invoke-static {p5}, Lel/a;->b(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvk/i;->d(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lvk/i;->a(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p2}, Lvk/i;->q(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Lvk/i;->p(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p3}, Lvk/i;->e(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p4}, Lvk/i;->b(Ljava/lang/String;)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p5}, Lvk/i;->l(Z)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p6}, Lvk/i;->j(Z)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p7}, Lvk/i;->i(Z)Lvk/i;

    move-result-object p0

    invoke-virtual {p0, p8}, Lvk/i;->k(Z)Lvk/i;

    move-result-object p0

    invoke-virtual {p0}, Lvk/i;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lokhttp3/OkHttpClient;
    .locals 2

    sget-object v0, Lvk/g;->c:Lokhttp3/OkHttpClient;

    if-nez v0, :cond_2

    const-class v0, Lvk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvk/g;->c:Lokhttp3/OkHttpClient;

    if-nez v1, :cond_1

    sget-object v1, Lvk/g;->d:Lwk/f;

    if-nez v1, :cond_0

    new-instance v1, Lwk/c;

    invoke-direct {v1}, Lwk/c;-><init>()V

    sput-object v1, Lvk/g;->d:Lwk/f;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lvk/g;->d:Lwk/f;

    invoke-interface {v1}, Lwk/f;->a()Lokhttp3/OkHttpClient;

    move-result-object v1

    sput-object v1, Lvk/g;->c:Lokhttp3/OkHttpClient;

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
    sget-object v0, Lvk/g;->c:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public static c()Lvk/b;
    .locals 1

    sget-object v0, Lvk/g;->b:Lvk/b;

    return-object v0
.end method

.method public static d()Lvk/d;
    .locals 2

    sget-object v0, Lvk/g;->f:Lvk/d;

    if-nez v0, :cond_1

    const-class v0, Lvk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvk/g;->f:Lvk/d;

    if-nez v1, :cond_0

    sget-object v1, Lvk/g;->e:Lvk/f;

    invoke-interface {v1}, Lvk/f;->a()Lvk/d;

    move-result-object v1

    sput-object v1, Lvk/g;->f:Lvk/d;

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
    sget-object v0, Lvk/g;->f:Lvk/d;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lvk/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Lwk/a;)V
    .locals 0

    invoke-static {p0}, Lwk/k;->b(Lwk/a;)V

    return-void
.end method

.method public static g(Lvk/b;)V
    .locals 0

    sput-object p0, Lvk/g;->b:Lvk/b;

    return-void
.end method

.method public static h(Lwk/f;)V
    .locals 0

    sput-object p0, Lvk/g;->d:Lwk/f;

    return-void
.end method

.method public static i(Lvk/f;)V
    .locals 1

    sput-object p0, Lvk/g;->e:Lvk/f;

    const-class p0, Lvk/g;

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lvk/g;->f:Lvk/d;

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

    sput-object p0, Lvk/g;->a:Ljava/lang/String;

    return-void
.end method
