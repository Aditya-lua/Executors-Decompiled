.class public Lri/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 2

    const-string v0, "rbx.strings"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ""

    return-object v0
.end method

.method public static varargs b(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "rbx.strings"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ResourceId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    array-length v0, p2

    if-lez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "IllegalFormatException thrown in getStringFromResources()"

    invoke-static {p0}, Lgk/q;->d(Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    const-string p0, "Resources.NotFoundException thrown in getStringFromResources()"

    invoke-static {p0}, Lgk/q;->d(Ljava/lang/String;)I

    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static varargs c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    invoke-static {}, Lri/a;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Lri/a;->b(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
