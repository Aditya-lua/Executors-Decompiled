.class public final Ll4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/lifecycle/x0;",
        "VM",
        "Landroidx/lifecycle/a1$c;",
        "factory",
        "Lhu/c;",
        "modelClass",
        "Lk4/a;",
        "extras",
        "a",
        "(Landroidx/lifecycle/a1$c;Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;",
        "lifecycle-viewmodel"
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
.method public static final a(Landroidx/lifecycle/a1$c;Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;
    .locals 1
    .param p0    # Landroidx/lifecycle/a1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lk4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Landroidx/lifecycle/a1$c;",
            "Lhu/c<",
            "TVM;>;",
            "Lk4/a;",
            ")TVM;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroidx/lifecycle/a1$c;->c(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :try_start_1
    invoke-static {p1}, Lyt/a;->a(Lhu/c;)Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p0, v0, p2}, Landroidx/lifecycle/a1$c;->a(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    invoke-static {p1}, Lyt/a;->a(Lhu/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/lifecycle/a1$c;->b(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p0

    :goto_0
    return-object p0
.end method
