.class public final Lmu/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aE\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0004\u0008\u0000\u0010\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "E",
        "",
        "capacity",
        "Lmu/a;",
        "onBufferOverflow",
        "Lkotlin/Function1;",
        "",
        "onUndeliveredElement",
        "Lmu/g;",
        "a",
        "(ILmu/a;Lkotlin/jvm/functions/Function1;)Lmu/g;",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(ILmu/a;Lkotlin/jvm/functions/Function1;)Lmu/g;
    .locals 2
    .param p1    # Lmu/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I",
            "Lmu/a;",
            "Lkotlin/jvm/functions/Function1<",
            "-TE;",
            "Lkotlin/Unit;",
            ">;)",
            "Lmu/g<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, -0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, -0x1

    if-eq p0, v0, :cond_4

    if-eqz p0, :cond_2

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_1

    sget-object v0, Lmu/a;->a:Lmu/a;

    if-ne p1, v0, :cond_0

    new-instance p1, Lmu/e;

    invoke-direct {p1, p0, p2}, Lmu/e;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-object p1

    :cond_0
    new-instance v0, Lmu/s;

    invoke-direct {v0, p0, p1, p2}, Lmu/s;-><init>(ILmu/a;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :cond_1
    new-instance p0, Lmu/e;

    invoke-direct {p0, v0, p2}, Lmu/e;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_2
    sget-object p0, Lmu/a;->a:Lmu/a;

    if-ne p1, p0, :cond_3

    new-instance p0, Lmu/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lmu/e;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_3
    new-instance p0, Lmu/s;

    invoke-direct {p0, v1, p1, p2}, Lmu/s;-><init>(ILmu/a;Lkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_4
    sget-object p0, Lmu/a;->a:Lmu/a;

    if-ne p1, p0, :cond_5

    new-instance p0, Lmu/s;

    sget-object p1, Lmu/a;->b:Lmu/a;

    invoke-direct {p0, v1, p1, p2}, Lmu/s;-><init>(ILmu/a;Lkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object p0, Lmu/a;->a:Lmu/a;

    if-ne p1, p0, :cond_7

    new-instance p0, Lmu/e;

    sget-object p1, Lmu/g;->No:Lmu/g$b;

    invoke-virtual {p1}, Lmu/g$b;->a()I

    move-result p1

    invoke-direct {p0, p1, p2}, Lmu/e;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-object p0

    :cond_7
    new-instance p0, Lmu/s;

    invoke-direct {p0, v1, p1, p2}, Lmu/s;-><init>(ILmu/a;Lkotlin/jvm/functions/Function1;)V

    return-object p0
.end method

.method public static synthetic b(ILmu/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lmu/g;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    sget-object p1, Lmu/a;->a:Lmu/a;

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, Lmu/j;->a(ILmu/a;Lkotlin/jvm/functions/Function1;)Lmu/g;

    move-result-object p0

    return-object p0
.end method
