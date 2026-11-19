.class public final Lln/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "PropsT",
        "OutputT",
        "RenderingT",
        "Lln/q;",
        "workflow",
        "Lav/p0;",
        "scope",
        "Ldv/p0;",
        "props",
        "Lln/m;",
        "initialSnapshot",
        "",
        "Lln/t;",
        "interceptors",
        "Lkotlin/Function2;",
        "Leu/b;",
        "",
        "",
        "onOutput",
        "Lln/g;",
        "a",
        "(Lln/q;Lav/p0;Ldv/p0;Lln/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;",
        "wf1-workflow-runtime"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lln/q;Lav/p0;Ldv/p0;Lln/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;
    .locals 7
    .param p0    # Lln/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ldv/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lln/m;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropsT:",
            "Ljava/lang/Object;",
            "OutputT:",
            "Ljava/lang/Object;",
            "RenderingT:",
            "Ljava/lang/Object;",
            ">(",
            "Lln/q<",
            "-TPropsT;+TOutputT;+TRenderingT;>;",
            "Lav/p0;",
            "Ldv/p0<",
            "+TPropsT;>;",
            "Lln/m;",
            "Ljava/util/List<",
            "+",
            "Lln/t;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-TOutputT;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ldv/p0<",
            "Lln/g<",
            "TRenderingT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "workflow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOutput"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lmn/c;->a(Ljava/util/List;)Lln/t;

    move-result-object v6

    new-instance v1, Lmn/m;

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lmn/m;-><init>(Lav/p0;Lln/q;Ldv/p0;Lln/m;Lln/t;)V

    move-object p0, v2

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {v1}, Lmn/m;->g()Lln/g;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object v0

    new-instance p3, Lln/f$a;

    invoke-direct {p3, v1, v0, p5, p1}, Lln/f$a;-><init>(Lmn/m;Ldv/c0;Lkotlin/jvm/functions/Function2;Leu/b;)V

    const/4 p4, 0x3

    const/4 p5, 0x0

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static/range {p0 .. p5}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-object v0

    :catchall_0
    move-exception v0

    move-object p0, v0

    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_0

    move-object p1, p0

    check-cast p1, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "Workflow runtime failed"

    invoke-static {p1, p0}, Lav/r1;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_1
    invoke-virtual {v1, p1}, Lmn/m;->e(Ljava/util/concurrent/CancellationException;)V

    throw p0
.end method
