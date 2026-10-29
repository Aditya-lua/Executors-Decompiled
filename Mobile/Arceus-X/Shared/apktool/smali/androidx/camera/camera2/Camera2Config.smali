.class public final Landroidx/camera/camera2/Camera2Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/Camera2Config$DefaultProvider;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;)Ln0/j4;
    .locals 1

    new-instance v0, Lz/t2;

    invoke-direct {v0, p0}, Lz/t2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Ln0/m0;
    .locals 1

    :try_start_0
    new-instance v0, Lz/l2;

    invoke-direct {v0, p0, p1, p2}, Lz/l2;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    :try_end_0
    .catch Lg0/x; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lg0/p1;

    invoke-direct {p1, p0}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static c()Lg0/g0;
    .locals 4

    new-instance v0, Lx/a;

    invoke-direct {v0}, Lx/a;-><init>()V

    new-instance v1, Lx/b;

    invoke-direct {v1}, Lx/b;-><init>()V

    new-instance v2, Lx/c;

    invoke-direct {v2}, Lx/c;-><init>()V

    new-instance v3, Lg0/g0$a;

    invoke-direct {v3}, Lg0/g0$a;-><init>()V

    invoke-virtual {v3, v0}, Lg0/g0$a;->c(Ln0/n0$a;)Lg0/g0$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lg0/g0$a;->e(Ln0/m0$a;)Lg0/g0$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lg0/g0$a;->i(Ln0/j4$c;)Lg0/g0$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg0/g0$a;->d(I)Lg0/g0$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lg0/g0$a;->f(Z)Lg0/g0$a;

    move-result-object v0

    invoke-virtual {v0}, Lg0/g0$a;->a()Lg0/g0;

    move-result-object v0

    return-object v0
.end method
