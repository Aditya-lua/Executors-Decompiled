.class public final Lev/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\u000c\u001a0\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0008H\u0081@\u00a2\u0006\u0004\u0008\r\u0010\u000e*\u001c\u0008\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "R",
        "T",
        "Ldv/i;",
        "",
        "Ldv/h;",
        "flows",
        "Lkotlin/Function0;",
        "arrayFactory",
        "Lkotlin/Function3;",
        "Leu/b;",
        "",
        "",
        "transform",
        "a",
        "(Ldv/i;[Ldv/h;Lkotlin/jvm/functions/Function0;Lpu/n;Leu/b;)Ljava/lang/Object;",
        "Lkotlin/collections/IndexedValue;",
        "Update",
        "kotlinx-coroutines-core"
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
.method public static final a(Ldv/i;[Ldv/h;Lkotlin/jvm/functions/Function0;Lpu/n;Leu/b;)Ljava/lang/Object;
    .locals 6
    .param p0    # Ldv/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lpu/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/i<",
            "-TR;>;[",
            "Ldv/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function0<",
            "[TT;>;",
            "Lpu/n<",
            "-",
            "Ldv/i<",
            "-TR;>;-[TT;-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lev/l$a;

    const/4 v5, 0x0

    move-object v4, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lev/l$a;-><init>([Ldv/h;Lkotlin/jvm/functions/Function0;Lpu/n;Ldv/i;Leu/b;)V

    invoke-static {v0, p4}, Lev/o;->a(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
