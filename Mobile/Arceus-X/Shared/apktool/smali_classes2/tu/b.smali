.class public final Ltu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F\u00a2\u0006\u000c\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Ltu/b;",
        "",
        "",
        "timeMillis",
        "<init>",
        "(J)V",
        "Ltu/l;",
        "select",
        "ignoredParam",
        "",
        "d",
        "(Ltu/l;Ljava/lang/Object;)V",
        "a",
        "J",
        "Ltu/f;",
        "c",
        "()Ltu/f;",
        "getSelectClause$annotations",
        "()V",
        "selectClause",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ltu/b;->a:J

    return-void
.end method

.method public static synthetic a(Ltu/l;Ltu/b;)V
    .locals 0

    invoke-static {p0, p1}, Ltu/b;->e(Ltu/l;Ltu/b;)V

    return-void
.end method

.method public static final synthetic b(Ltu/b;Ltu/l;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ltu/b;->d(Ltu/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Ltu/l;Ltu/b;)V
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p0, p1, v0}, Ltu/l;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final c()Ltu/f;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ltu/g;

    sget-object v1, Ltu/b$a;->a:Ltu/b$a;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lzt/n;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ltu/g;-><init>(Ljava/lang/Object;Lzt/n;Lzt/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final d(Ltu/l;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltu/l<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-wide v0, p0, Ltu/b;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-gtz p2, :cond_0

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p1, p2}, Ltu/l;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, Ltu/a;

    invoke-direct {p2, p1, p0}, Ltu/a;-><init>(Ltu/l;Ltu/b;)V

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ltu/k;

    invoke-virtual {p1}, Ltu/k;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/z0;->d(Lkotlin/coroutines/CoroutineContext;)Lku/y0;

    move-result-object v1

    iget-wide v2, p0, Ltu/b;->a:J

    invoke-interface {v1, v2, v3, p2, v0}, Lku/y0;->f(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltu/k;->n(Lku/i1;)V

    return-void
.end method
