.class public final Lxq/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0003\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ls5/a;",
        "T",
        "Landroidx/recyclerview/widget/RecyclerView$g0;",
        "a",
        "(Landroidx/recyclerview/widget/RecyclerView$g0;)Ls5/a;",
        "shared_release"
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
.method public static final a(Landroidx/recyclerview/widget/RecyclerView$g0;)Ls5/a;
    .locals 1
    .param p0    # Landroidx/recyclerview/widget/RecyclerView$g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ls5/a;",
            ">(",
            "Landroidx/recyclerview/widget/RecyclerView$g0;",
            ")TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lxq/j0;

    invoke-virtual {p0}, Lxq/j0;->N()Ls5/a;

    move-result-object p0

    return-object p0
.end method
