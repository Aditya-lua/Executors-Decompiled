.class public final Lnn/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00010\u0000\"\u0006\u0012\u0002\u0008\u00030\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\t*\u00020\u0008*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aM\u0010\u0017\u001a\u00020\u0016\"\u0008\u0008\u0000\u0010\t*\u00020\u0008*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "",
        "Lnn/b0;",
        "bindings",
        "Lnn/d0;",
        "b",
        "([Lnn/b0;)Lnn/d0;",
        "a",
        "()Lnn/d0;",
        "",
        "RenderingT",
        "rendering",
        "e",
        "(Lnn/d0;Ljava/lang/Object;)Lnn/b0;",
        "initialRendering",
        "Lnn/z;",
        "initialViewEnvironment",
        "Landroid/content/Context;",
        "contextForNewView",
        "Landroid/view/ViewGroup;",
        "container",
        "Lnn/g0;",
        "viewStarter",
        "Landroid/view/View;",
        "c",
        "(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;)Landroid/view/View;",
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
.method public static final a()Lnn/d0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lnn/x;

    const/4 v1, 0x0

    new-array v1, v1, [Lnn/b0;

    invoke-direct {v0, v1}, Lnn/x;-><init>([Lnn/b0;)V

    return-object v0
.end method

.method public static final varargs b([Lnn/b0;)Lnn/d0;
    .locals 2
    .param p0    # [Lnn/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnn/b0<",
            "*>;)",
            "Lnn/d0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bindings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnn/x;

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lnn/b0;

    invoke-direct {v0, p0}, Lnn/x;-><init>([Lnn/b0;)V

    return-object v0
.end method

.method public static final c(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;)Landroid/view/View;
    .locals 1
    .param p0    # Lnn/d0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lnn/g0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RenderingT:",
            "Ljava/lang/Object;",
            ">(",
            "Lnn/d0;",
            "TRenderingT;",
            "Lnn/z;",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "Lnn/g0;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextForNewView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lnn/e0;->e(Lnn/d0;Ljava/lang/Object;)Lnn/b0;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, Lnn/b0;->a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Lnn/j0;->d(Landroid/view/View;)Lnn/i0;

    move-result-object p1

    if-eqz p1, :cond_1

    if-nez p5, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Lnn/f0;->e(Landroid/view/View;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lnn/e0$a;

    invoke-direct {p2, p5, p1}, Lnn/e0$a;-><init>(Lnn/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, p2}, Lnn/f0;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "View.bindShowRendering should have been called for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", typically by the "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p0, Lnn/b0;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " that created it."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic d(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;ILjava/lang/Object;)Landroid/view/View;
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p5, v0

    :cond_1
    invoke-static/range {p0 .. p5}, Lnn/e0;->c(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lnn/d0;Ljava/lang/Object;)Lnn/b0;
    .locals 2
    .param p0    # Lnn/d0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RenderingT:",
            "Ljava/lang/Object;",
            ">(",
            "Lnn/d0;",
            "TRenderingT;)",
            "Lnn/b0<",
            "TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-interface {p0, v0}, Lnn/d0;->a(Lxu/c;)Lnn/b0;

    move-result-object p0

    if-nez p0, :cond_6

    instance-of p0, p1, Lnn/b;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    move-object p0, p1

    check-cast p0, Lnn/b;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    move-object p0, v0

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lnn/b;->a()Lnn/b0;

    move-result-object p0

    :goto_1
    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    move-object p0, v0

    :goto_2
    if-nez p0, :cond_6

    instance-of p0, p1, Lnn/m;

    if-eqz p0, :cond_3

    move-object p0, p1

    check-cast p0, Lnn/m;

    goto :goto_3

    :cond_3
    move-object p0, v0

    :goto_3
    if-nez p0, :cond_4

    goto :goto_4

    :cond_4
    sget-object v0, Lnn/n;->b:Lnn/n;

    :goto_4
    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lnn/b0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-interface {v1}, Lxu/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " should have been registered to display "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-interface {v1}, Lxu/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " instances, or that class should implement "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lnn/b;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-interface {v1}, Lxu/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object p1

    invoke-interface {p1}, Lxu/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ">."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return-object p0
.end method
