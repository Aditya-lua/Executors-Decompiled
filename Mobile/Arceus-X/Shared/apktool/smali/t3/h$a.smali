.class public final Lt3/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u000c\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008\"\u0004\u0008\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ8\u0010\u000f\u001a\u00020\u000b\"\u0004\u0008\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\tH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lt3/h$a;",
        "",
        "<init>",
        "()V",
        "T",
        "",
        "Lt3/g;",
        "migrations",
        "Lkotlin/Function2;",
        "Lt3/s;",
        "Lnt/b;",
        "",
        "b",
        "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;",
        "api",
        "c",
        "(Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt3/h$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lt3/h$a;Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lt3/h$a;->c(Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lkotlin/jvm/functions/Function2;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lt3/g<",
            "TT;>;>;)",
            "Lkotlin/jvm/functions/Function2<",
            "Lt3/s<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "migrations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt3/h$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lt3/h$a$a;-><init>(Ljava/util/List;Lnt/b;)V

    return-object v0
.end method

.method public final c(Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lt3/g<",
            "TT;>;>;",
            "Lt3/s<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lt3/h$a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lt3/h$a$b;

    iget v1, v0, Lt3/h$a$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt3/h$a$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt3/h$a$b;

    invoke-direct {v0, p0, p3}, Lt3/h$a$b;-><init>(Lt3/h$a;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lt3/h$a$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lt3/h$a$b;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lt3/h$a$b;->u:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lt3/h$a$b;->t:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/c0;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p3

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lt3/h$a$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lt3/h$a$c;

    const/4 v5, 0x0

    invoke-direct {v2, p1, p3, v5}, Lt3/h$a$c;-><init>(Ljava/util/List;Ljava/util/List;Lnt/b;)V

    iput-object p3, v0, Lt3/h$a$b;->t:Ljava/lang/Object;

    iput v4, v0, Lt3/h$a$b;->x:I

    invoke-interface {p2, v2, v0}, Lt3/s;->a(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, p3

    :goto_1
    new-instance p2, Lkotlin/jvm/internal/c0;

    invoke-direct {p2}, Lkotlin/jvm/internal/c0;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lkotlin/jvm/functions/Function1;

    :try_start_1
    iput-object p2, v0, Lt3/h$a$b;->t:Ljava/lang/Object;

    iput-object p1, v0, Lt3/h$a$b;->u:Ljava/lang/Object;

    iput v3, v0, Lt3/h$a$b;->x:I

    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p3, v1, :cond_5

    :goto_3
    return-object v1

    :goto_4
    iget-object v2, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-nez v2, :cond_6

    iput-object p3, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v2, p3}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    iget-object p1, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_8

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_8
    throw p1
.end method
