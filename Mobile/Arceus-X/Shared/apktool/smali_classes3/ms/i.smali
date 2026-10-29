.class public interface abstract Lms/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcs/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000f\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ9\u0010\u000c\u001a\u00020\u0007*\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\n\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lms/i;",
        "Lcs/c;",
        "",
        "",
        "values",
        "Lkotlin/Function2;",
        "",
        "",
        "operator",
        "i",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z",
        "",
        "n",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public i(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "operator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lts/a;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-interface {p0, p1, p2}, Lcs/c;->e(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v2, :cond_1

    invoke-interface {p0, p1, p2}, Lms/i;->n(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public n(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Comparable<",
            "*>;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Comparable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lts/c;->b(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v1, p2}, Lcs/c;->e(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z

    move-result v1

    new-array v0, v0, [Ljava/lang/Comparable;

    invoke-static {p1}, Lts/c;->b(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-static {p1}, Lts/c;->c(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v0, v4

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lcs/c;->e(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z

    move-result p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    return v4

    :cond_0
    return v3
.end method
