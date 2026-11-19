.class public final Lx3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\r0\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \u0008\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00080\u00070\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "name",
        "Lv3/b;",
        "Ly3/f;",
        "corruptionHandler",
        "Lkotlin/Function1;",
        "Landroid/content/Context;",
        "",
        "Lu3/g;",
        "produceMigrations",
        "Lav/p0;",
        "scope",
        "Ltu/a;",
        "Lu3/i;",
        "a",
        "(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)Ltu/a;",
        "datastore-preferences_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)Ltu/a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lv3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/b<",
            "Ly3/f;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lu3/g<",
            "Ly3/f;",
            ">;>;>;",
            "Lav/p0;",
            ")",
            "Ltu/a<",
            "Landroid/content/Context;",
            "Lu3/i<",
            "Ly3/f;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx3/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lx3/c;-><init>(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;ILjava/lang/Object;)Ltu/a;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, Lx3/a$a;->i:Lx3/a$a;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {v0, p4, v0}, Lav/z2;->b(Lav/d2;ILjava/lang/Object;)Lav/a0;

    move-result-object p4

    invoke-virtual {p3, p4}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    invoke-static {p3}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lx3/a;->a(Ljava/lang/String;Lv3/b;Lkotlin/jvm/functions/Function1;Lav/p0;)Ltu/a;

    move-result-object p0

    return-object p0
.end method
