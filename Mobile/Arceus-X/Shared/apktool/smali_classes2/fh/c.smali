.class public final Lfh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroid/app/Activity;",
        "Lfh/i;",
        "c",
        "(Landroid/app/Activity;)Lfh/i;",
        "NativeShell_googleProdRelease"
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
.method public static synthetic a(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lfh/c;->d(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/app/Activity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfh/c;->e(Landroid/app/Activity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/app/Activity;)Lfh/i;
    .locals 8
    .param p0    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfh/f;

    new-instance v3, Lfh/a;

    invoke-direct {v3, p0}, Lfh/a;-><init>(Landroid/app/Activity;)V

    new-instance v5, Lfh/b;

    invoke-direct {v5, p0}, Lfh/b;-><init>(Landroid/app/Activity;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lfh/f;-><init>(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final d(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    sget v0, Lsg/q0;->n:I

    sget v1, Lsg/q0;->E:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Landroid/app/Activity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lgk/a0;->d(Landroid/content/Context;)Z

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
