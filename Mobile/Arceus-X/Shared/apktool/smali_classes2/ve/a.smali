.class public final Lve/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lve/a$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/lang/String; = "a"


# instance fields
.field public final a:Lpe/s;

.field public final b:Lpe/a;

.field public c:Lpe/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lve/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lve/a$b;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lve/e;

    invoke-static {p1}, Lve/a$b;->a(Lve/a$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lve/a$b;->b(Lve/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lve/a$b;->c(Lve/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lve/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lve/a;->a:Lpe/s;

    .line 4
    invoke-static {p1}, Lve/a$b;->d(Lve/a$b;)Lpe/a;

    move-result-object v0

    iput-object v0, p0, Lve/a;->b:Lpe/a;

    .line 5
    invoke-static {p1}, Lve/a$b;->e(Lve/a$b;)Lpe/q;

    move-result-object p1

    iput-object p1, p0, Lve/a;->c:Lpe/q;

    return-void
.end method

.method public synthetic constructor <init>(Lve/a$b;Lve/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lve/a;-><init>(Lve/a$b;)V

    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lve/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic b()Z
    .locals 1

    invoke-static {}, Lve/a;->f()Z

    move-result v0

    return v0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lve/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic d(Lpe/p;Lpe/s;Lpe/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lve/a;->g(Lpe/p;Lpe/s;Lpe/a;)V

    return-void
.end method

.method public static f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static g(Lpe/p;Lpe/s;Lpe/a;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [B

    invoke-static {p0, p1, p2, v0}, Lpe/v;->c(Lpe/p;Lpe/s;Lpe/a;[B)V

    return-void

    :cond_0
    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lpe/v;->d(Lpe/p;Lpe/s;Lpe/d0;)V
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
.method public declared-synchronized e()Lpe/p;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lve/a;->c:Lpe/q;

    invoke-virtual {v0}, Lpe/q;->a()Lpe/p;

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
