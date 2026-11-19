.class public interface abstract Lus/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lts/f;
.implements Lat/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ-\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ5\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J=\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lus/e;",
        "Lts/f;",
        "Lat/d;",
        "Lus/c;",
        "data",
        "Lms/l;",
        "evaluator",
        "",
        "f",
        "(Lus/c;Lms/l;)Ljava/lang/Object;",
        "expression",
        "c",
        "(Ljava/lang/Object;Ljava/lang/Object;Lms/l;)Ljava/lang/Object;",
        "",
        "",
        "mappingOperation",
        "",
        "expressionValues",
        "",
        "a",
        "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;",
        "Lts/b;",
        "operationInput",
        "Lkotlin/Function2;",
        "arrayOperation",
        "h",
        "(Lts/b;Lms/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;",
        "m",
        "(Lts/b;)Lus/c;",
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


# direct methods
.method public static synthetic d(Lus/e;Lts/b;Lms/l;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lus/e;->g(Lus/e;Lts/b;Lms/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lus/e;Lts/b;Lms/l;)Ljava/lang/Object;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logicEvaluator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lus/e$a;

    invoke-direct {v0, p0}, Lus/e$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2, v0}, Lus/e;->h(Lts/b;Lms/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p1, "expressionValues"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic a(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Lus/e;->a(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;Lms/l;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lms/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "evaluator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lus/d;

    invoke-direct {v0, p0}, Lus/d;-><init>(Lus/e;)V

    invoke-interface {p0, p1, p2, p3, v0}, Lts/f;->i(Ljava/lang/Object;Ljava/lang/Object;Lms/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Lus/c;Lms/l;)Ljava/lang/Object;
    .param p1    # Lus/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lms/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public h(Lts/b;Lms/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lts/b;",
            "Lms/l;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lus/c;",
            "-",
            "Lms/l;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lus/e;->m(Lts/b;)Lus/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p3, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    return-object p2

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lts/b;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public m(Lts/b;)Lus/c;
    .locals 3

    invoke-virtual {p1}, Lts/b;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lts/b;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lts/b;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lus/c;

    invoke-virtual {p1}, Lts/b;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lts/b;->a()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lts/b;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lus/c;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
