.class public final synthetic Ldv/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a)\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a9\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u00002\u001e\u0010\u0006\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a]\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00000\u000220\u0008\u0001\u0010\u000f\u001a*\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001aQ\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00000\u00022$\u0008\u0001\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\" \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0016\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "T",
        "",
        "Ldv/h;",
        "b",
        "(Ljava/lang/Iterable;)Ldv/h;",
        "",
        "flows",
        "c",
        "([Ldv/h;)Ldv/h;",
        "R",
        "Lkotlin/Function3;",
        "Ldv/i;",
        "Leu/b;",
        "",
        "",
        "transform",
        "d",
        "(Ldv/h;Lpu/n;)Ldv/h;",
        "Lkotlin/Function2;",
        "a",
        "(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;",
        "",
        "I",
        "getDEFAULT_CONCURRENCY",
        "()I",
        "getDEFAULT_CONCURRENCY$annotations",
        "()V",
        "DEFAULT_CONCURRENCY",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    const v1, 0x7fffffff

    const-string v2, "kotlinx.coroutines.flow.defaultConcurrency"

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1}, Lgv/f0;->b(Ljava/lang/String;III)I

    move-result v0

    sput v0, Ldv/x;->a:I

    return-void
.end method

.method public static final a(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;
    .locals 2
    .param p0    # Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ldv/h<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ldv/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldv/x$a;-><init>(Lkotlin/jvm/functions/Function2;Leu/b;)V

    invoke-static {p0, v0}, Ldv/j;->T(Ldv/h;Lpu/n;)Ldv/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Iterable;)Ldv/h;
    .locals 7
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Ldv/h<",
            "+TT;>;>;)",
            "Ldv/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lev/j;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lev/j;-><init>(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILcv/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final varargs c([Ldv/h;)Ldv/h;
    .locals 0
    .param p0    # [Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ldv/h<",
            "+TT;>;)",
            "Ldv/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/m;->A([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Ldv/j;->B(Ljava/lang/Iterable;)Ldv/h;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ldv/h;Lpu/n;)Ldv/h;
    .locals 8
    .param p0    # Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lpu/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;",
            "Lpu/n<",
            "-",
            "Ldv/i<",
            "-TR;>;-TT;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ldv/h<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lev/i;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lev/i;-><init>(Lpu/n;Ldv/h;Lkotlin/coroutines/CoroutineContext;ILcv/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
