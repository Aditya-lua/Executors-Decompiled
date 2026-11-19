.class public final Lkq/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkq/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lkq/f;",
        "",
        "<init>",
        "()V",
        "Lkq/c;",
        "flags",
        "Lmv/a0;",
        "b",
        "(Lkq/c;)Lmv/a0;",
        "a",
        "sandbox_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lkq/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkq/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkq/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkq/f;->a:Lkq/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkq/c;Lmv/a0$a;)Lmv/h0;
    .locals 0

    invoke-static {p0, p1}, Lkq/f;->c(Lkq/c;Lmv/a0$a;)Lmv/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkq/c;Lmv/a0$a;)Lmv/h0;
    .locals 7

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->a()Lmv/g0;

    move-result-object v1

    invoke-virtual {v0}, Lmv/f0;->m()Lmv/z;

    move-result-object v2

    invoke-virtual {v2}, Lmv/z;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "transition"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lmv/f0;->m()Lmv/z;

    move-result-object v2

    invoke-virtual {v2}, Lmv/z;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "government-id-classification"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_0
    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lkq/c;->d()Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lkq/c;->e:Lkq/c$a;

    invoke-virtual {p0}, Lkq/c;->a()Lkq/c$b;

    move-result-object p0

    invoke-virtual {v2, p0}, Lkq/c$a;->a(Lkq/c$b;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Lmv/g0;->b()Lmv/b0;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lmv/b0;->h()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    const-string v4, "form-data"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    check-cast v1, Lmv/c0;

    new-instance v2, Lmv/c0$a;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lmv/c0$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lmv/c0;->k()Lmv/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lmv/c0$a;->e(Lmv/b0;)Lmv/c0$a;

    move-result-object v2

    invoke-virtual {v1}, Lmv/c0;->j()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmv/c0$c;

    invoke-virtual {v2, v3}, Lmv/c0$a;->c(Lmv/c0$c;)Lmv/c0$a;

    goto :goto_1

    :cond_2
    const-string v1, "meta[workflowInitialVariables][debugForcedStatus]"

    invoke-virtual {v2, v1, p0}, Lmv/c0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/c0$a;->d()Lmv/c0;

    move-result-object p0

    invoke-virtual {v0}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v1

    invoke-virtual {v0}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p0}, Lmv/f0$a;->o(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p0

    invoke-interface {p1, p0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v3, "json"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lew/e;

    invoke-direct {v2}, Lew/e;-><init>()V

    invoke-virtual {v1, v2}, Lmv/g0;->h(Lew/f;)V

    new-instance v3, Lorg/json/JSONObject;

    invoke-virtual {v2}, Lew/e;->V2()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "meta"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_4

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :cond_4
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-string v6, "debugForcedStatus"

    invoke-virtual {v5, v6, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v5, "workflowInitialVariables"

    invoke-virtual {v4, v5, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p0, Lmv/g0;->a:Lmv/g0$a;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lmv/g0;->b()Lmv/b0;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lmv/g0$a;->c(Ljava/lang/String;Lmv/b0;)Lmv/g0;

    move-result-object p0

    invoke-virtual {v0}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v1

    invoke-virtual {v0}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p0}, Lmv/f0$a;->o(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p0

    invoke-interface {p1, p0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkq/f;->a:Lkq/f$a;

    invoke-virtual {v0}, Lkq/f$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b(Lkq/c;)Lmv/a0;
    .locals 1
    .param p1    # Lkq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "flags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkq/e;

    invoke-direct {v0, p1}, Lkq/e;-><init>(Lkq/c;)V

    return-object v0
.end method
