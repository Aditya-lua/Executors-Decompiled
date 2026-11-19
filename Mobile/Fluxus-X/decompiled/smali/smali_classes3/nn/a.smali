.class public final Lnn/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u009c\u0001\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2$\u0008\u0002\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0015"
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
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "",
        "Lln/t;",
        "interceptors",
        "Lkotlin/Function2;",
        "Leu/b;",
        "",
        "",
        "onOutput",
        "a",
        "(Lln/q;Lav/p0;Ldv/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;",
        "wf1-core-android"
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
.method public static final a(Lln/q;Lav/p0;Ldv/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;
    .locals 8
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
    .param p3    # Landroidx/lifecycle/l0;
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
            "Landroidx/lifecycle/l0;",
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
            "TRenderingT;>;"
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

    const/4 v0, 0x0

    if-nez p3, :cond_0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    move-object v5, v0

    goto :goto_1

    :cond_0
    const-string v1, "com.squareup.workflow1.ui.renderWorkflowIn-snapshot"

    invoke-virtual {p3, v1}, Landroidx/lifecycle/l0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnn/o;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lnn/o;->a()Lln/m;

    move-result-object v1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    move-object v5, v1

    :goto_1
    invoke-static/range {v2 .. v7}, Lln/f;->a(Lln/q;Lav/p0;Ldv/p0;Lln/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ldv/p0;

    move-result-object p0

    new-instance p1, Lnn/a$b;

    invoke-direct {p1, p3, v0}, Lnn/a$b;-><init>(Landroidx/lifecycle/l0;Leu/b;)V

    invoke-static {p0, p1}, Ldv/j;->E(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    new-instance p2, Lnn/a$a;

    invoke-direct {p2, p1}, Lnn/a$a;-><init>(Ldv/h;)V

    sget-object p1, Ldv/m0;->a:Ldv/m0$a;

    invoke-virtual {p1}, Ldv/m0$a;->a()Ldv/m0;

    move-result-object p1

    invoke-interface {p0}, Ldv/p0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lln/g;

    invoke-virtual {p0}, Lln/g;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p2, v3, p1, p0}, Ldv/j;->M(Ldv/h;Lav/p0;Ldv/m0;Ljava/lang/Object;)Ldv/p0;

    move-result-object p0

    return-object p0
.end method
