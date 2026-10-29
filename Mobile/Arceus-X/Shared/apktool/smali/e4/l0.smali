.class public final Le4/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aa\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011\u00b2\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002\u00b2\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/x0;",
        "VM",
        "Landroidx/fragment/app/c;",
        "Lhu/c;",
        "viewModelClass",
        "Lkotlin/Function0;",
        "Landroidx/lifecycle/b1;",
        "storeProducer",
        "Lk4/a;",
        "extrasProducer",
        "Landroidx/lifecycle/a1$c;",
        "factoryProducer",
        "Ljt/h;",
        "b",
        "(Landroidx/fragment/app/c;Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljt/h;",
        "Landroidx/lifecycle/c1;",
        "owner",
        "fragment-ktx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljt/h;)Landroidx/lifecycle/c1;
    .locals 0

    invoke-static {p0}, Le4/l0;->c(Ljt/h;)Landroidx/lifecycle/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/fragment/app/c;Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljt/h;
    .locals 0
    .param p0    # Landroidx/fragment/app/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Landroidx/fragment/app/c;",
            "Lhu/c<",
            "TVM;>;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/lifecycle/b1;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lk4/a;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/lifecycle/a1$c;",
            ">;)",
            "Ljt/h<",
            "TVM;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-nez p4, :cond_0

    new-instance p4, Le4/l0$a;

    invoke-direct {p4, p0}, Le4/l0$a;-><init>(Landroidx/fragment/app/c;)V

    :cond_0
    new-instance p0, Landroidx/lifecycle/z0;

    invoke-direct {p0, p1, p2, p4, p3}, Landroidx/lifecycle/z0;-><init>(Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object p0
.end method

.method public static final c(Ljt/h;)Landroidx/lifecycle/c1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt/h<",
            "+",
            "Landroidx/lifecycle/c1;",
            ">;)",
            "Landroidx/lifecycle/c1;"
        }
    .end annotation

    invoke-interface {p0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/c1;

    return-object p0
.end method
