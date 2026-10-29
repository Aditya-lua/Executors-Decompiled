.class public Ljj/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lom/k$b;
.implements Lom/k$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj/t$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g()Ljj/t;
    .locals 1

    invoke-static {}, Ljj/t$a;->a()Ljj/t;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;ZZ)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    const-string v1, "AndroidNotifShowRationalePrefKey"

    invoke-virtual {v0, p1, v1}, Ljj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    move v2, p2

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, v1}, Ljj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eq p2, v2, :cond_2

    move v2, v4

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {v0, p1, v1, v4}, Ljj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_3
    if-nez p3, :cond_5

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "sysPromptDismiss"

    invoke-static {p1, v3}, Lsg/t0;->l(Ljava/lang/String;Z)V

    return-void

    :cond_5
    :goto_1
    const-string p2, "sysPrompt"

    invoke-static {p2, p3}, Lsg/t0;->l(Ljava/lang/String;Z)V

    const-string p2, "AndroidNotifUserInteractedPrefKey"

    invoke-virtual {v0, p1, p2, v4}, Ljj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public b(Landroid/content/Context;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->G3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ljj/t;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    invoke-virtual {p0, p1, v0}, Ljj/t;->f(Landroid/content/Context;Ljj/x;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Landroid/content/Context;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->G3()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Ljj/t;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljj/x;

    invoke-direct {v1}, Ljj/x;-><init>()V

    if-eqz p2, :cond_1

    const-string p2, "AndroidNotifShowRationalePrefKey"

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, Ljj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    return v0

    :cond_1
    invoke-virtual {p0, p1, v1}, Ljj/t;->f(Landroid/content/Context;Ljj/x;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public d(Landroid/content/Context;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->G3()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ljj/t;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljj/x;

    invoke-direct {v1}, Ljj/x;-><init>()V

    const-string v2, "AndroidNotifUserInteractedPrefKey"

    invoke-virtual {v1, p1, v2}, Ljj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, p1, v2}, Ljj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final f(Landroid/content/Context;Ljj/x;)Z
    .locals 5

    const-string v0, "AndroidNotifShowRationalePrefKey"

    invoke-virtual {p2, p1, v0}, Ljj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p2, p1, v0}, Ljj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v1, "AndroidNotifUserInteractedPrefKey"

    invoke-virtual {p2, p1, v1}, Ljj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, p1, v1}, Ljj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    if-nez v0, :cond_2

    if-nez p1, :cond_2

    return v3

    :cond_2
    return v2
.end method

.method public h(Landroid/content/Context;)Ljj/s;
    .locals 0

    invoke-virtual {p0, p1}, Ljj/t;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->m()Ljj/s;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {}, Lgk/t;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lug/a;

    invoke-direct {p1}, Lug/a;-><init>()V

    return-object p1

    :cond_1
    new-instance p1, Lcom/roblox/client/fcm/a;

    invoke-direct {p1}, Lcom/roblox/client/fcm/a;-><init>()V

    :cond_2
    return-object p1
.end method

.method public i(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lsg/a1;->r(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method
