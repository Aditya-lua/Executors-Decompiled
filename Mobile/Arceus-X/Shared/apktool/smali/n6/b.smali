.class public final Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ln6/a$a;",
        "Ljava/io/File;",
        "directory",
        "a",
        "(Ln6/a$a;Ljava/io/File;)Ln6/a$a;",
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
.method public static final a(Ln6/a$a;Ljava/io/File;)Ln6/a$a;
    .locals 4
    .param p0    # Ln6/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lxu/h0;->b:Lxu/h0$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lxu/h0$a;->d(Lxu/h0$a;Ljava/io/File;ZILjava/lang/Object;)Lxu/h0;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln6/a$a;->b(Lxu/h0;)Ln6/a$a;

    move-result-object p0

    return-object p0
.end method
