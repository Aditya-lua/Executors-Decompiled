.class public final Lr4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Lav/w0;",
        "",
        "tag",
        "Lpe/x;",
        "b",
        "(Lav/w0;Ljava/lang/Object;)Lpe/x;",
        "ads-adservices-java_release"
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
.method public static synthetic a(Lav/w0;Ljava/lang/Object;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lr4/b;->d(Lav/w0;Ljava/lang/Object;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lav/w0;Ljava/lang/Object;)Lpe/x;
    .locals 1
    .param p0    # Lav/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lav/w0<",
            "+TT;>;",
            "Ljava/lang/Object;",
            ")",
            "Lpe/x<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr4/a;

    invoke-direct {v0, p0, p1}, Lr4/a;-><init>(Lav/w0;Ljava/lang/Object;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lpe/x;

    move-result-object p0

    const-string p1, "getFuture { completer ->\u2026      }\n        tag\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "Deferred.asListenableFuture"

    :cond_0
    invoke-static {p0, p1}, Lr4/b;->b(Lav/w0;Ljava/lang/Object;)Lpe/x;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lav/w0;Ljava/lang/Object;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this_asListenableFuture"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr4/b$a;

    invoke-direct {v0, p2, p0}, Lr4/b$a;-><init>(Ly1/c$a;Lav/w0;)V

    invoke-interface {p0, v0}, Lav/d2;->o(Lkotlin/jvm/functions/Function1;)Lav/i1;

    return-object p1
.end method
