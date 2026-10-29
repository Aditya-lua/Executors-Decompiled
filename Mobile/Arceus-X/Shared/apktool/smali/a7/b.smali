.class public final La7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lxu/g;",
        "source",
        "Lz6/c;",
        "a",
        "(Lxu/g;)Lz6/c;",
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
.method public static final a(Lxu/g;)Lz6/c;
    .locals 1
    .param p0    # Lxu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, La7/a;

    invoke-interface {p0}, Lxu/g;->s3()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lw7/g;->l(Ljava/io/InputStream;)Lw7/g;

    move-result-object p0

    invoke-direct {v0, p0}, La7/a;-><init>(Lw7/g;)V

    return-object v0
.end method
