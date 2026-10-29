.class public final Lz6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lz6/c$b;",
        "",
        "b",
        "(Lz6/c$b;)F",
        "width",
        "a",
        "height",
        "coil-svg_release"
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
.method public static final a(Lz6/c$b;)F
    .locals 1
    .param p0    # Lz6/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lz6/c$b;->a()F

    move-result v0

    invoke-virtual {p0}, Lz6/c$b;->d()F

    move-result p0

    sub-float/2addr v0, p0

    return v0
.end method

.method public static final b(Lz6/c$b;)F
    .locals 1
    .param p0    # Lz6/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lz6/c$b;->c()F

    move-result v0

    invoke-virtual {p0}, Lz6/c$b;->b()F

    move-result p0

    sub-float/2addr v0, p0

    return v0
.end method
