.class public Lv2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv2/g$b;,
        Lv2/g$a;,
        Lv2/g$c;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/os/CancellationSignal;[Lv2/g$b;)Landroid/graphics/Typeface;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Landroidx/core/graphics/k;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lv2/g$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;Lv2/e;)Lv2/g$a;
    .locals 0

    invoke-static {p2}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lv2/d;->e(Landroid/content/Context;Ljava/util/List;Landroid/os/CancellationSignal;)Lv2/g$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/util/List;IZILandroid/os/Handler;Lv2/g$c;)Landroid/graphics/Typeface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lv2/e;",
            ">;IZI",
            "Landroid/os/Handler;",
            "Lv2/g$c;",
            ")",
            "Landroid/graphics/Typeface;"
        }
    .end annotation

    new-instance v0, Lv2/a;

    invoke-static {p5}, Lv2/h;->b(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p5

    invoke-direct {v0, p6, p5}, Lv2/a;-><init>(Lv2/g$c;Ljava/util/concurrent/Executor;)V

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    const/4 p5, 0x1

    if-gt p3, p5, :cond_0

    const/4 p3, 0x0

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv2/e;

    invoke-static {p0, p1, v0, p2, p4}, Lv2/f;->e(Landroid/content/Context;Lv2/e;Lv2/a;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lv2/f;->d(Landroid/content/Context;Ljava/util/List;ILjava/util/concurrent/Executor;Lv2/a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
