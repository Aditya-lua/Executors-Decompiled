.class public final Lxe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/a$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/lang/String; = "a"


# instance fields
.field public final a:Lre/s;

.field public final b:Lre/a;

.field public c:Lre/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lxe/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxe/a$b;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lxe/e;

    invoke-static {p1}, Lxe/a$b;->a(Lxe/a$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lxe/a$b;->b(Lxe/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lxe/a$b;->c(Lxe/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lxe/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lxe/a;->a:Lre/s;

    .line 4
    invoke-static {p1}, Lxe/a$b;->d(Lxe/a$b;)Lre/a;

    move-result-object v0

    iput-object v0, p0, Lxe/a;->b:Lre/a;

    .line 5
    invoke-static {p1}, Lxe/a$b;->e(Lxe/a$b;)Lre/q;

    move-result-object p1

    iput-object p1, p0, Lxe/a;->c:Lre/q;

    return-void
.end method

.method public synthetic constructor <init>(Lxe/a$b;Lxe/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxe/a;-><init>(Lxe/a$b;)V

    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lxe/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic b()Z
    .locals 1

    invoke-static {}, Lxe/a;->f()Z

    move-result v0

    return v0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic d(Lre/p;Lre/s;Lre/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxe/a;->g(Lre/p;Lre/s;Lre/a;)V

    return-void
.end method

.method public static f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static g(Lre/p;Lre/s;Lre/a;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [B

    invoke-static {p0, p1, p2, v0}, Lre/v;->c(Lre/p;Lre/s;Lre/a;[B)V

    return-void

    :cond_0
    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lre/v;->d(Lre/p;Lre/s;Lre/d0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public declared-synchronized e()Lre/p;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxe/a;->c:Lre/q;

    invoke-virtual {v0}, Lre/q;->a()Lre/p;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
