.class public final Lw3/i$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw3/i;->d()Lzt/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lzt/n<",
        "Lv3/c;",
        "Lx3/f;",
        "Lnt/b<",
        "-",
        "Lx3/f;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lv3/c;",
        "sharedPrefs",
        "Lx3/f;",
        "currentData",
        "<anonymous>",
        "(Lv3/c;Lx3/f;)Lx3/f;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1"
    f = "SharedPreferencesMigration.android.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnt/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lw3/i$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv3/c;

    check-cast p2, Lx3/f;

    check-cast p3, Lnt/b;

    invoke-virtual {p0, p1, p2, p3}, Lw3/i$a;->q(Lv3/c;Lx3/f;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lw3/i$a;->t:I

    if-nez v0, :cond_a

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw3/i$a;->u:Ljava/lang/Object;

    check-cast p1, Lv3/c;

    iget-object v0, p0, Lw3/i$a;->v:Ljava/lang/Object;

    check-cast v0, Lx3/f;

    invoke-virtual {v0}, Lx3/f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx3/f$a;

    invoke-virtual {v3}, Lx3/f$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv3/c;->a()Ljava/util/Map;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lx3/f;->c()Lx3/c;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    invoke-static {v2}, Lx3/i;->a(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_5

    invoke-static {v2}, Lx3/i;->d(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    invoke-static {v2}, Lx3/i;->e(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_7

    invoke-static {v2}, Lx3/i;->f(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-static {v2}, Lx3/i;->g(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    instance-of v3, v1, Ljava/util/Set;

    if-eqz v3, :cond_3

    invoke-static {v2}, Lx3/i;->h(Ljava/lang/String;)Lx3/f$a;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Set;

    invoke-virtual {p1, v2, v1}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p1}, Lx3/f;->d()Lx3/f;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lv3/c;Lx3/f;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lv3/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx3/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/c;",
            "Lx3/f;",
            "Lnt/b<",
            "-",
            "Lx3/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lw3/i$a;

    invoke-direct {v0, p3}, Lw3/i$a;-><init>(Lnt/b;)V

    iput-object p1, v0, Lw3/i$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lw3/i$a;->v:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lw3/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
