.class public final Lu3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Ji\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\u0008\u0000\u0010\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n0\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J[\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\u0008\u0000\u0010\u00042\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00142\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n0\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lu3/j;",
        "",
        "<init>",
        "()V",
        "T",
        "Lu3/a0;",
        "serializer",
        "Lv3/b;",
        "corruptionHandler",
        "",
        "Lu3/g;",
        "migrations",
        "Lav/p0;",
        "scope",
        "Lkotlin/Function0;",
        "Ljava/io/File;",
        "produceFile",
        "Lu3/i;",
        "a",
        "(Lu3/a0;Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;)Lu3/i;",
        "Lu3/e0;",
        "storage",
        "b",
        "(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;",
        "datastore-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lu3/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu3/j;

    invoke-direct {v0}, Lu3/j;-><init>()V

    sput-object v0, Lu3/j;->a:Lu3/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lu3/j;Lu3/a0;Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lu3/i;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p3

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p4

    const/4 p6, 0x1

    invoke-static {v0, p6, v0}, Lav/z2;->b(Lav/d2;ILjava/lang/Object;)Lav/a0;

    move-result-object p6

    invoke-virtual {p4, p6}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p4

    invoke-static {p4}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object p4

    :cond_2
    invoke-virtual/range {p0 .. p5}, Lu3/j;->a(Lu3/a0;Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;)Lu3/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lu3/a0;Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;)Lu3/i;
    .locals 7
    .param p1    # Lu3/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/a0<",
            "TT;>;",
            "Lv3/b<",
            "TT;>;",
            "Ljava/util/List<",
            "+",
            "Lu3/g<",
            "TT;>;>;",
            "Lav/p0;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lu3/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lu3/o;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v4, p5

    invoke-direct/range {v1 .. v6}, Lu3/o;-><init>(Lu3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1, p2, p3, p4}, Lu3/j;->b(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;
    .locals 1
    .param p1    # Lu3/e0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/e0<",
            "TT;>;",
            "Lv3/b<",
            "TT;>;",
            "Ljava/util/List<",
            "+",
            "Lu3/g<",
            "TT;>;>;",
            "Lav/p0;",
            ")",
            "Lu3/i<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lv3/a;

    invoke-direct {p2}, Lv3/a;-><init>()V

    :goto_0
    sget-object v0, Lu3/h;->a:Lu3/h$a;

    invoke-virtual {v0, p3}, Lu3/h$a;->b(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    new-instance v0, Lu3/k;

    invoke-direct {v0, p1, p3, p2, p4}, Lu3/k;-><init>(Lu3/e0;Ljava/util/List;Lu3/e;Lav/p0;)V

    return-object v0
.end method
