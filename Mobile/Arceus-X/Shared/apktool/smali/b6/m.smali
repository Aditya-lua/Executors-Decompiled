.class public final Lb6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a)\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016*$\u0008\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lb6/l;",
        "Lf6/j0;",
        "spec",
        "Lku/l0;",
        "dispatcher",
        "Lb6/i;",
        "listener",
        "Lku/d2;",
        "e",
        "(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;",
        "Ld6/n;",
        "trackers",
        "",
        "Lc6/e;",
        "d",
        "(Ld6/n;)Ljava/util/List;",
        "Landroid/content/Context;",
        "context",
        "Lb6/g;",
        "a",
        "(Landroid/content/Context;)Lb6/g;",
        "",
        "Ljava/lang/String;",
        "TAG",
        "Lkotlin/Function1;",
        "Lb6/b;",
        "",
        "OnConstraintState",
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


# static fields
.field public static final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "WorkConstraintsTracker"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lb6/m;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lb6/g;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Landroid/net/ConnectivityManager;

    new-instance v1, Lb6/g;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lb6/g;-><init>(Landroid/net/ConnectivityManager;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final synthetic b(Ld6/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lb6/m;->d(Ld6/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lb6/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static final d(Ld6/n;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/n;",
            ")",
            "Ljava/util/List<",
            "Lc6/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc6/c;

    invoke-virtual {p0}, Ld6/n;->a()Ld6/h;

    move-result-object v1

    invoke-direct {v0, v1}, Lc6/c;-><init>(Ld6/h;)V

    new-instance v1, Lc6/d;

    invoke-virtual {p0}, Ld6/n;->b()Ld6/c;

    move-result-object v2

    invoke-direct {v1, v2}, Lc6/d;-><init>(Ld6/c;)V

    new-instance v2, Lc6/j;

    invoke-virtual {p0}, Ld6/n;->e()Ld6/h;

    move-result-object v3

    invoke-direct {v2, v3}, Lc6/j;-><init>(Ld6/h;)V

    const/4 v3, 0x3

    new-array v4, v3, [Lc6/e;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v2, v4, v1

    invoke-static {v4}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v4, v6, :cond_0

    invoke-virtual {p0}, Ld6/n;->c()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lb6/m;->a(Landroid/content/Context;)Lb6/g;

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2

    :cond_0
    new-instance v4, Lc6/f;

    invoke-virtual {p0}, Ld6/n;->d()Ld6/h;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v4, v6}, Lc6/f;-><init>(Ld6/h;)V

    new-instance v6, Lc6/i;

    invoke-virtual {p0}, Ld6/n;->d()Ld6/h;

    move-result-object v7

    invoke-direct {v6, v7}, Lc6/i;-><init>(Ld6/h;)V

    new-instance v7, Lc6/h;

    invoke-virtual {p0}, Ld6/n;->d()Ld6/h;

    move-result-object v8

    invoke-direct {v7, v8}, Lc6/h;-><init>(Ld6/h;)V

    new-instance v8, Lc6/g;

    invoke-virtual {p0}, Ld6/n;->d()Ld6/h;

    move-result-object p0

    invoke-direct {v8, p0}, Lc6/g;-><init>(Ld6/h;)V

    const/4 p0, 0x4

    new-array p0, p0, [Lc6/b;

    aput-object v4, p0, v5

    aput-object v6, p0, v0

    aput-object v7, p0, v1

    aput-object v8, p0, v3

    invoke-static {p0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v2, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v2
.end method

.method public static final e(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;
    .locals 7
    .param p0    # Lb6/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lf6/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lb6/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v1

    new-instance v4, Lb6/m$a;

    const/4 p2, 0x0

    invoke-direct {v4, p0, p1, p3, p2}, Lb6/m$a;-><init>(Lb6/l;Lf6/j0;Lb6/i;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p0

    return-object p0
.end method
