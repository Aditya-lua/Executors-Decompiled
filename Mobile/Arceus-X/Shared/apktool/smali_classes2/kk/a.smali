.class public Lkk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 1

    invoke-static {}, Lj9/c;->o()Lj9/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lj9/c;->g(Landroid/content/Context;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
