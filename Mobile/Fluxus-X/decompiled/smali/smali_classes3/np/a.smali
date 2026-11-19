.class public final Lnp/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnp/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\u000c\u001a\u00020\u0005*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0000H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "",
        "Lar/f;",
        "Lds/a;",
        "d",
        "(Ljava/util/List;)Lds/a;",
        "Lds/g;",
        "h",
        "(Lar/f;)Lds/g;",
        "Lpo/d;",
        "e",
        "(Lpo/d;)Lds/g;",
        "Ldp/d;",
        "f",
        "(Ldp/d;)Lds/g;",
        "Lvo/r;",
        "Lds/b;",
        "a",
        "(Ljava/util/List;)Lds/b;",
        "Lvo/n;",
        "Lds/e;",
        "b",
        "(Lvo/n;)Lds/e;",
        "Lqq/b;",
        "g",
        "(Lqq/b;)Lds/g;",
        "Lmq/b0;",
        "Lds/f;",
        "c",
        "(Lmq/b0;)Lds/f;",
        "Lgs/d;",
        "i",
        "(Lgs/d;)Lds/g;",
        "inquiry-internal_release"
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
.method public static final a(Ljava/util/List;)Lds/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvo/r;",
            ">;)",
            "Lds/b;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvo/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lvo/r;->a()Ljava/util/Date;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lvo/r;->f()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance p0, Lds/b;

    invoke-virtual {v0}, Lvo/r;->a()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0}, Lvo/r;->f()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lds/b;-><init>(Ljava/util/Date;Ljava/util/Date;)V

    return-object p0

    :cond_2
    new-instance p0, Lds/b;

    invoke-direct {p0, v1, v1}, Lds/b;-><init>(Ljava/util/Date;Ljava/util/Date;)V

    return-object p0
.end method

.method public static final b(Lvo/n;)Lds/e;
    .locals 7

    invoke-interface {p0}, Lvo/n;->q2()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lvo/n;->y1()Lvo/n$d;

    move-result-object v1

    sget-object v2, Lnp/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    sget-object v1, Lds/e$d;->c:Lds/e$d;

    goto :goto_0

    :cond_0
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Lds/e$d;->b:Lds/e$d;

    goto :goto_0

    :cond_2
    sget-object v1, Lds/e$d;->a:Lds/e$d;

    :goto_0
    invoke-interface {p0}, Lvo/n;->e3()Lvo/n$a;

    move-result-object v5

    sget-object v6, Lnp/a$a;->b:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    if-eq v5, v4, :cond_5

    if-eq v5, v3, :cond_4

    if-ne v5, v2, :cond_3

    sget-object v2, Lds/e$a;->c:Lds/e$a;

    goto :goto_1

    :cond_3
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_4
    sget-object v2, Lds/e$a;->a:Lds/e$a;

    goto :goto_1

    :cond_5
    sget-object v2, Lds/e$a;->b:Lds/e$a;

    :goto_1
    invoke-interface {p0}, Lvo/n;->j3()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvo/m;

    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Lvo/m;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_7

    new-instance v6, Lds/e$c;

    invoke-virtual {v4}, Lvo/m;->f()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v5, v4}, Lds/e$c;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    new-instance p0, Lds/e;

    invoke-direct {p0, v0, v1, v2, v3}, Lds/e;-><init>(Ljava/lang/String;Lds/e$d;Lds/e$a;Ljava/util/List;)V

    return-object p0
.end method

.method public static final c(Lmq/b0;)Lds/f;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lmq/b0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lds/f;

    invoke-virtual {p0}, Lmq/b0;->f()Lmq/b0$a;

    move-result-object v1

    sget-object v2, Lnp/a$a;->c:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    sget-object v1, Lds/f$a;->a:Lds/f$a;

    goto :goto_0

    :cond_0
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Lds/f$a;->b:Lds/f$a;

    :goto_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lmq/b0;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lds/f;-><init>(Lds/f$a;Ljava/io/File;)V

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(Ljava/util/List;)Lds/a;
    .locals 2
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lar/f;",
            ">;)",
            "Lds/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lar/f;

    invoke-static {v1}, Lnp/a;->h(Lar/f;)Lds/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Lds/a;

    invoke-direct {p0, v0}, Lds/a;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static final e(Lpo/d;)Lds/g;
    .locals 5

    invoke-virtual {p0}, Lpo/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpo/d;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/e;

    instance-of v3, v2, Lno/e$a;

    if-eqz v3, :cond_1

    new-instance v3, Lds/c;

    new-instance v4, Ljava/io/File;

    check-cast v2, Lno/e$a;

    invoke-virtual {v2}, Lno/e$a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lds/c;-><init>(Ljava/io/File;)V

    goto :goto_1

    :cond_1
    instance-of v3, v2, Lno/e$b;

    if-eqz v3, :cond_3

    check-cast v2, Lno/e$b;

    invoke-virtual {v2}, Lno/e$b;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Lds/c;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lds/c;-><init>(Ljava/io/File;)V

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Lds/g$a;

    invoke-direct {p0, v0, v1}, Lds/g$a;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final f(Ldp/d;)Lds/g;
    .locals 6

    invoke-virtual {p0}, Ldp/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ldp/d;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvo/n;

    invoke-static {v4}, Lnp/a;->b(Lvo/n;)Lds/e;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldp/d;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lvo/n$b;

    if-eqz v5, :cond_1

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lvo/n$b;

    invoke-virtual {v5}, Lvo/n$b;->g()Lvo/r;

    move-result-object v5

    invoke-interface {p0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {p0}, Lnp/a;->a(Ljava/util/List;)Lds/b;

    move-result-object p0

    new-instance v1, Lds/g$b;

    invoke-direct {v1, v0, v2, p0}, Lds/g$b;-><init>(Ljava/lang/String;Ljava/util/List;Lds/b;)V

    return-object v1
.end method

.method public static final g(Lqq/b;)Lds/g;
    .locals 5

    new-instance v0, Lds/g$c;

    invoke-virtual {p0}, Lqq/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lqq/b;->a()Lmq/b0;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, Lnp/a;->c(Lmq/b0;)Lds/f;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {p0}, Lqq/b;->a()Lmq/b0;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v4}, Lnp/a;->c(Lmq/b0;)Lds/f;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-virtual {p0}, Lqq/b;->a()Lmq/b0;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lnp/a;->c(Lmq/b0;)Lds/f;

    move-result-object v3

    :cond_2
    invoke-direct {v0, v1, v2, v4, v3}, Lds/g$c;-><init>(Ljava/lang/String;Lds/f;Lds/f;Lds/f;)V

    return-object v0
.end method

.method public static final h(Lar/f;)Lds/g;
    .locals 1
    .param p0    # Lar/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lgs/d;

    if-eqz v0, :cond_0

    check-cast p0, Lgs/d;

    invoke-static {p0}, Lnp/a;->i(Lgs/d;)Lds/g;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lqq/b;

    if-eqz v0, :cond_1

    check-cast p0, Lqq/b;

    invoke-static {p0}, Lnp/a;->g(Lqq/b;)Lds/g;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Ldp/d;

    if-eqz v0, :cond_2

    check-cast p0, Ldp/d;

    invoke-static {p0}, Lnp/a;->f(Ldp/d;)Lds/g;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Lpo/d;

    if-eqz v0, :cond_3

    check-cast p0, Lpo/d;

    invoke-static {p0}, Lnp/a;->e(Lpo/d;)Lds/g;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final i(Lgs/d;)Lds/g;
    .locals 5
    .param p0    # Lgs/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const-string v1, "obtain(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lgs/d;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;

    :try_start_0
    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/ui/network/a;->a(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-instance v0, Lds/g$d;

    invoke-virtual {p0}, Lgs/d;->f()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Lds/g$d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
