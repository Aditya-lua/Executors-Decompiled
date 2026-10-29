.class public final synthetic Lym/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ae\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001ai\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aY\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00120\u0011\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "PropsT",
        "StateT",
        "OutputT",
        "",
        "name",
        "Lkotlin/Function1;",
        "Lym/r$c;",
        "Lym/r;",
        "",
        "apply",
        "a",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;",
        "Lkotlin/Function0;",
        "b",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;",
        "props",
        "state",
        "Lkotlin/Pair;",
        "Lym/v;",
        "d",
        "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;",
        "wf1-workflow-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
    xs = "com/squareup/workflow1/Workflows"
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropsT:",
            "Ljava/lang/Object;",
            "StateT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lym/r<",
            "-TPropsT;TStateT;+TOutputT;>.c;",
            "Lkotlin/Unit;",
            ">;)",
            "Lym/r<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lym/b0$a;

    invoke-direct {v0, p0}, Lym/b0$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Lym/w;->c(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lym/r;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropsT:",
            "Ljava/lang/Object;",
            "StateT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lym/r<",
            "-TPropsT;TStateT;+TOutputT;>.c;",
            "Lkotlin/Unit;",
            ">;)",
            "Lym/r<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lym/b0$b;

    invoke-direct {v0, p1, p0}, Lym/b0$b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p0, ""

    :cond_0
    invoke-static {p0, p1}, Lym/w;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1
    .param p0    # Lym/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropsT:",
            "Ljava/lang/Object;",
            "StateT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            ">(",
            "Lym/r<",
            "-TPropsT;TStateT;+TOutputT;>;TPropsT;TStateT;)",
            "Lkotlin/Pair<",
            "TStateT;",
            "Lym/v<",
            "TOutputT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lym/r$c;

    invoke-direct {v0, p0, p1, p2}, Lym/r$c;-><init>(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lym/r;->a(Lym/r$c;)V

    new-instance p0, Lkotlin/Pair;

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Lym/r$c;->a()Lym/v;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
