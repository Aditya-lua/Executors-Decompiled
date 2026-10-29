.class public final Lf6/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lf6/j0;",
        "Lf6/w;",
        "a",
        "(Lf6/j0;)Lf6/w;",
        "work-runtime_release"
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
.method public static final a(Lf6/j0;)Lf6/w;
    .locals 2
    .param p0    # Lf6/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/w;

    iget-object v1, p0, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lf6/j0;->g()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lf6/w;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
