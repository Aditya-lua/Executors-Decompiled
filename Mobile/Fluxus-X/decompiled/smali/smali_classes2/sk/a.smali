.class public Lsk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 1

    invoke-static {}, Lk9/e;->o()Lk9/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lk9/e;->g(Landroid/content/Context;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
