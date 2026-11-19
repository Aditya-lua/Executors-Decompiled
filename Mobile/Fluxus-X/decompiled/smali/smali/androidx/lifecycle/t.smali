.class public final Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/lifecycle/s;",
        "Landroidx/lifecycle/m;",
        "a",
        "(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;",
        "lifecycleScope",
        "lifecycle-common"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;
    .locals 1
    .param p0    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p0

    invoke-static {p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/m;

    move-result-object p0

    return-object p0
.end method
