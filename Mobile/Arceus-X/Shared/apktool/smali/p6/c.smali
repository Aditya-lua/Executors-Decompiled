.class public final Lp6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lk6/n;",
        "image",
        "Lx6/p;",
        "options",
        "",
        "Lc7/c;",
        "transformations",
        "Le7/u;",
        "logger",
        "Landroid/graphics/Bitmap;",
        "a",
        "(Lk6/n;Lx6/p;Ljava/util/List;Le7/u;)Landroid/graphics/Bitmap;",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lk6/n;Lx6/p;Ljava/util/List;Le7/u;)Landroid/graphics/Bitmap;
    .locals 11
    .param p0    # Lk6/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Le7/u;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk6/n;",
            "Lx6/p;",
            "Ljava/util/List<",
            "+",
            "Lc7/c;",
            ">;",
            "Le7/u;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lk6/a;

    const/4 v1, 0x0

    const/16 v2, 0x2e

    const-string v3, " to apply transformations: "

    const-string v4, "EngineInterceptor"

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lk6/a;

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Le7/b;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;

    move-result-object v5

    invoke-static {}, Le7/i0;->f()[Landroid/graphics/Bitmap$Config;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/collections/m;->G([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    return-object v0

    :cond_0
    if-eqz p3, :cond_2

    sget-object v0, Le7/u$a;->c:Le7/u$a;

    invoke-interface {p3}, Le7/u;->a()Le7/u$a;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-gtz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Converting bitmap with config "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, v4, v0, p2, v1}, Le7/u;->b(Ljava/lang/String;Le7/u$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    sget-object v0, Le7/u$a;->c:Le7/u$a;

    invoke-interface {p3}, Le7/u;->a()Le7/u$a;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gtz v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Converting image of type "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v6

    invoke-interface {v6}, Lhu/c;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, v4, v0, p2, v1}, Le7/u;->b(Ljava/lang/String;Le7/u$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    sget-object v5, Le7/i;->a:Le7/i;

    invoke-virtual {p1}, Lx6/p;->c()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-static {p0, p2}, Lk6/v;->a(Lk6/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-static {p1}, Lx6/j;->j(Lx6/p;)Landroid/graphics/Bitmap$Config;

    move-result-object v7

    invoke-virtual {p1}, Lx6/p;->k()Ly6/g;

    move-result-object v8

    invoke-virtual {p1}, Lx6/p;->j()Ly6/f;

    move-result-object v9

    invoke-virtual {p1}, Lx6/p;->i()Ly6/c;

    move-result-object p0

    sget-object p1, Ly6/c;->b:Ly6/c;

    if-ne p0, p1, :cond_3

    const/4 p0, 0x1

    :goto_1
    move v10, p0

    goto :goto_2

    :cond_3
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual/range {v5 .. v10}, Le7/i;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ly6/g;Ly6/f;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
