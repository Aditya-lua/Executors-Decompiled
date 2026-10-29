.class public Lak/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lak/l2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static a()Lvk/b;
    .locals 5

    new-instance v0, Lgk/f;

    invoke-direct {v0}, Lgk/f;-><init>()V

    invoke-static {}, Lsg/a1;->H()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lsg/a1;->F()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lvk/b;

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1}, Lgk/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Lgk/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "api"

    :goto_0
    invoke-direct {v3, v4, v1, v0}, Lvk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    sget-object p0, Lak/l2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lvk/g;->j(Ljava/lang/String;)V

    invoke-static {}, Lak/l2;->a()Lvk/b;

    move-result-object p0

    invoke-static {p0}, Lvk/g;->g(Lvk/b;)V

    new-instance p0, Lei/t;

    invoke-direct {p0}, Lei/t;-><init>()V

    invoke-static {p0}, Lvk/g;->f(Lwk/a;)V

    new-instance p0, Lwk/c;

    invoke-direct {p0}, Lwk/c;-><init>()V

    invoke-static {p0}, Lvk/g;->h(Lwk/f;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lgh/d;

    invoke-direct {v0, p0}, Lgh/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p0}, Lgh/d;->a(Landroid/content/Context;)Lgh/c;

    move-result-object v0

    invoke-static {p0, v0}, Lsg/a1;->i0(Landroid/content/Context;Lgh/c;)V

    return-void
.end method
