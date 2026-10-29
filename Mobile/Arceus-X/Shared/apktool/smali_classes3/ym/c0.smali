.class public final synthetic Lym/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"!\u0010\u0008\u001a\u00020\u0002*\u000e\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lhu/m;",
        "type",
        "Lym/s;",
        "b",
        "(Lhu/m;)Lym/s;",
        "Lym/q;",
        "a",
        "(Lym/q;)Lym/s;",
        "identifier",
        "wf1-workflow-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
    xs = "com/squareup/workflow1/Workflows"
.end annotation


# direct methods
.method public static final a(Lym/q;)Lym/s;
    .locals 3
    .param p0    # Lym/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/q<",
            "***>;)",
            "Lym/s;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lym/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lym/c;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p0

    if-nez v0, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lym/c;->c()Lym/s;

    move-result-object v2

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Lym/c0$a;

    invoke-direct {v1, v0}, Lym/c0$a;-><init>(Ljava/lang/Object;)V

    :goto_2
    new-instance v0, Lym/s;

    invoke-direct {v0, p0, v2, v1}, Lym/s;-><init>(Lhu/a;Lym/s;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public static final b(Lhu/m;)Lym/s;
    .locals 7
    .param p0    # Lhu/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lym/s;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lym/s;-><init>(Lhu/a;Lym/s;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
