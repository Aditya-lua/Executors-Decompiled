.class public final Lzm/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\u0008\u001a\u00020\u0007\"\u001a\u0008\u0000\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\u0008\u0001\u0010\u0002\"\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0003\u0010\u0004*\u00028\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lym/q;",
        "W",
        "I",
        "O",
        "R",
        "",
        "key",
        "Lzm/k;",
        "a",
        "(Lym/q;Ljava/lang/String;)Lzm/k;",
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
.method public static final a(Lym/q;Ljava/lang/String;)Lzm/k;
    .locals 1
    .param p0    # Lym/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<W::",
            "Lym/q<",
            "-TI;+TO;+TR;>;I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(TW;",
            "Ljava/lang/String;",
            ")",
            "Lzm/k;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzm/k;

    invoke-direct {v0, p0, p1}, Lzm/k;-><init>(Lym/q;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Lym/q;Ljava/lang/String;ILjava/lang/Object;)Lzm/k;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p0, p1}, Lzm/l;->a(Lym/q;Ljava/lang/String;)Lzm/k;

    move-result-object p0

    return-object p0
.end method
