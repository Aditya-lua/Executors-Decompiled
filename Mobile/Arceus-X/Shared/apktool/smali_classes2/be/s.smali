.class public final Lbe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/o;


# direct methods
.method public static c(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 2

    const-string v0, "pathList"

    const-class v1, Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lbe/g0;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lbe/f0;

    move-result-object p0

    invoke-virtual {p0}, Lbe/f0;->a()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;ZLbe/r;Ljava/lang/String;Lbe/q;)Z
    .locals 7

    const-class v0, Ljava/lang/Throwable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lbe/s;->c(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "dexElements"

    const-class v3, Ljava/lang/Object;

    invoke-static {p0, v2, v3}, Lbe/g0;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lbe/e0;

    move-result-object v2

    invoke-virtual {v2}, Lbe/f0;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-class v6, Ljava/io/File;

    invoke-static {v5, p5, v6}, Lbe/g0;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lbe/f0;

    move-result-object v5

    invoke-virtual {v5}, Lbe/f0;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p5

    const/4 v3, 0x1

    if-eqz p5, :cond_1

    return v3

    :cond_1
    const/4 p5, 0x0

    const-string v4, "SplitCompat"

    if-nez p3, :cond_3

    invoke-interface {p6, p0, p2, p1}, Lbe/q;->a(Ljava/lang/Object;Ljava/io/File;Ljava/io/File;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Should be optimized "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return p5

    :cond_3
    :goto_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p4, p0, p3, p1, v1}, Lbe/r;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/io/File;Ljava/util/ArrayList;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Lbe/e0;->d(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    new-instance p1, Lbe/d0;

    const-string p2, "DexPathList.makeDexElement failed"

    invoke-direct {p1, p2}, Lbe/d0;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p3

    :goto_2
    if-ge p5, p3, :cond_4

    invoke-interface {v1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/io/IOException;

    invoke-static {v4, p2, p4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :try_start_0
    const-string p6, "addSuppressed"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, p6, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p6

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p6, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_4
    const-string p2, "dexElementsSuppressedExceptions"

    const-class p3, Ljava/io/IOException;

    invoke-static {p0, p2, p3}, Lbe/g0;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lbe/e0;

    move-result-object p0

    invoke-virtual {p0, v1}, Lbe/e0;->d(Ljava/util/Collection;)V

    throw p1

    :cond_5
    return v3
.end method
