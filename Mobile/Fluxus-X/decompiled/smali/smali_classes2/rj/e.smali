.class public Lrj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lrj/j;Ljava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1, p3}, Lrj/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Luj/f0;Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0, p1}, Lrj/e;->c(Luj/f0;)Luj/e0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lrj/e;->f(Luj/e0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lrj/e;->e(Luj/e0;)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lrj/e;->d(Ljava/lang/String;)Lrj/j;

    move-result-object v0

    invoke-virtual {p0, p2, v0, p1}, Lrj/e;->a(Landroid/content/Context;Lrj/j;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Luj/f0;)Luj/e0;
    .locals 1

    :try_start_0
    new-instance v0, Luj/e0;

    invoke-direct {v0, p1}, Luj/e0;-><init>(Luj/f0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lrj/j;
    .locals 1

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrj/u;->d(Ljava/lang/String;)Lrj/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Luj/e0;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Luj/e0;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Luj/e0;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Luj/e0;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
