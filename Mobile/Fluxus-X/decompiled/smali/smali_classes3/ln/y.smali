.class public final synthetic Lln/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002\"\u0004\u0008\u0003\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0008H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\u0008\u0000\u0010\u0001\"\u0004\u0008\u0001\u0010\u0002\"\u0004\u0008\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "T",
        "PropsT",
        "StateT",
        "OutputT",
        "Ldv/h;",
        "Lln/h;",
        "Lln/r;",
        "actionSink",
        "Lkotlin/Function1;",
        "handler",
        "",
        "a",
        "(Ldv/h;Lln/h;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;",
        "action",
        "b",
        "(Lln/h;Lln/r;Leu/b;)Ljava/lang/Object;",
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
.method public static final a(Ldv/h;Lln/h;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lln/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "PropsT:",
            "Ljava/lang/Object;",
            "StateT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;",
            "Lln/h<",
            "-",
            "Lln/r<",
            "-TPropsT;TStateT;+TOutputT;>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Lln/r<",
            "-TPropsT;TStateT;+TOutputT;>;>;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lln/y$a;

    invoke-direct {v0, p1, p2}, Lln/y$a;-><init>(Lln/h;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0, p3}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lln/h;Lln/r;Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Lln/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lln/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
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
            "Lln/h<",
            "-",
            "Lln/r<",
            "-TPropsT;TStateT;+TOutputT;>;>;",
            "Lln/r<",
            "-TPropsT;TStateT;+TOutputT;>;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    new-instance v1, Lln/y$b;

    invoke-direct {v1, p1, v0}, Lln/y$b;-><init>(Lln/r;Lav/n;)V

    invoke-interface {p0, v1}, Lln/h;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lgu/h;->c(Leu/b;)V

    :cond_0
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
