.class public final Ll6/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ll6/h$a;",
        "Ll6/w$a;",
        "options",
        "a",
        "(Ll6/h$a;Ll6/w$a;)Ll6/h$a;",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ll6/h$a;Ll6/w$a;)Ll6/h$a;
    .locals 1
    .param p0    # Ll6/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ll6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Ls6/b;

    invoke-direct {p1}, Ls6/b;-><init>()V

    const-class v0, Ljava/io/File;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll6/h$a;->k(Ls6/c;Lxu/c;)Ll6/h$a;

    move-result-object p0

    new-instance p1, Lp6/m$a;

    invoke-direct {p1}, Lp6/m$a;-><init>()V

    const-class v0, Ll6/h0;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    move-result-object p0

    new-instance p1, Lp6/d$a;

    invoke-direct {p1}, Lp6/d$a;-><init>()V

    const-class v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    move-result-object p0

    return-object p0
.end method
