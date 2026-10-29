.class public final Landroidx/fragment/app/b;
.super Landroidx/fragment/app/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/b$a;,
        Landroidx/fragment/app/b$b;,
        Landroidx/fragment/app/b$c;,
        Landroidx/fragment/app/b$d;,
        Landroidx/fragment/app/b$e;,
        Landroidx/fragment/app/b$f;,
        Landroidx/fragment/app/b$g;,
        Landroidx/fragment/app/b$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001:\u0008%&\'\u000c()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u000b2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u000fJ9\u0010\u0017\u001a\u00020\u000b2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u000b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\"\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008#\u0010$\u00a8\u0006,"
    }
    d2 = {
        "Landroidx/fragment/app/b;",
        "Landroidx/fragment/app/i;",
        "Landroid/view/ViewGroup;",
        "container",
        "<init>",
        "(Landroid/view/ViewGroup;)V",
        "",
        "Landroidx/fragment/app/i$d;",
        "operations",
        "",
        "isPop",
        "",
        "d",
        "(Ljava/util/List;Z)V",
        "K",
        "(Ljava/util/List;)V",
        "Landroidx/fragment/app/b$b;",
        "animationInfos",
        "F",
        "Landroidx/fragment/app/b$h;",
        "transitionInfos",
        "firstOut",
        "lastIn",
        "H",
        "(Ljava/util/List;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)V",
        "Lw1/a;",
        "",
        "Landroid/view/View;",
        "",
        "names",
        "J",
        "(Lw1/a;Ljava/util/Collection;)V",
        "",
        "namedViews",
        "view",
        "I",
        "(Ljava/util/Map;Landroid/view/View;)V",
        "a",
        "b",
        "c",
        "e",
        "f",
        "g",
        "h",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/fragment/app/i;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic E(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/fragment/app/b;->G(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V

    return-void
.end method

.method public static final G(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i;->c(Landroidx/fragment/app/i$d;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/util/List;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "PrereleaseSdkCoreDependency"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/b$b;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/b$b;

    invoke-virtual {v3}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lkotlin/collections/u;->z(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "FragmentManager"

    const/4 v6, 0x2

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/b$b;

    invoke-virtual {p0}, Landroidx/fragment/app/i;->t()Landroid/view/ViewGroup;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v4}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v8

    const-string v9, "context"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Landroidx/fragment/app/b$b;->c(Landroid/content/Context;)Landroidx/fragment/app/d$a;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    iget-object v7, v7, Landroidx/fragment/app/d$a;->b:Landroid/animation/AnimatorSet;

    if-nez v7, :cond_3

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v7

    invoke-virtual {v8}, Landroidx/fragment/app/i$d;->f()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4

    invoke-static {v6}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Ignoring Animator set on "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " as this Fragment was involved in a Transition."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    invoke-virtual {v8}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v3

    sget-object v5, Landroidx/fragment/app/i$d$b;->d:Landroidx/fragment/app/i$d$b;

    if-ne v3, v5, :cond_5

    invoke-virtual {v8, v2}, Landroidx/fragment/app/i$d;->q(Z)V

    :cond_5
    new-instance v3, Landroidx/fragment/app/b$c;

    invoke-direct {v3, v4}, Landroidx/fragment/app/b$c;-><init>(Landroidx/fragment/app/b$b;)V

    invoke-virtual {v8, v3}, Landroidx/fragment/app/i$d;->b(Landroidx/fragment/app/i$b;)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :cond_7
    :goto_2
    if-ge v2, p1, :cond_a

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    check-cast v4, Landroidx/fragment/app/b$b;

    invoke-virtual {v4}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v8

    const-string v9, "Ignoring Animation set on "

    if-nez v1, :cond_8

    invoke-static {v6}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " as Animations cannot run alongside Transitions."

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_8
    if-eqz v3, :cond_9

    invoke-static {v6}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " as Animations cannot run alongside Animators."

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_9
    new-instance v8, Landroidx/fragment/app/b$a;

    invoke-direct {v8, v4}, Landroidx/fragment/app/b$a;-><init>(Landroidx/fragment/app/b$b;)V

    invoke-virtual {v7, v8}, Landroidx/fragment/app/i$d;->b(Landroidx/fragment/app/i$b;)V

    goto :goto_2

    :cond_a
    return-void
.end method

.method public final H(Ljava/util/List;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/b$h;",
            ">;Z",
            "Landroidx/fragment/app/i$d;",
            "Landroidx/fragment/app/i$d;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroidx/fragment/app/b$h;

    invoke-virtual {v6}, Landroidx/fragment/app/b$f;->b()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :cond_2
    :goto_1
    if-ge v6, v5, :cond_3

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    move-object v8, v7

    check-cast v8, Landroidx/fragment/app/b$h;

    invoke-virtual {v8}, Landroidx/fragment/app/b$h;->c()Le4/j0;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v5, 0x0

    move-object v7, v5

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v6, v6, 0x1

    check-cast v8, Landroidx/fragment/app/b$h;

    invoke-virtual {v8}, Landroidx/fragment/app/b$h;->c()Le4/j0;

    move-result-object v9

    if-eqz v5, :cond_5

    if-ne v9, v5, :cond_4

    goto :goto_3

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroidx/fragment/app/b$h;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " which uses a different Transition type than other Fragments."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_3
    move-object v5, v9

    goto :goto_2

    :cond_6
    if-nez v5, :cond_7

    goto/16 :goto_13

    :cond_7
    move-object v2, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Lw1/a;

    invoke-direct {v9}, Lw1/a;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Lw1/a;

    invoke-direct {v12}, Lw1/a;-><init>()V

    new-instance v13, Lw1/a;

    invoke-direct {v13}, Lw1/a;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v11

    move-object v14, v10

    move-object v10, v6

    move-object v6, v14

    move-object v14, v2

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v11, :cond_1d

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v2, v2, 0x1

    check-cast v16, Landroidx/fragment/app/b$h;

    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/b$h;->g()Z

    move-result v17

    if-eqz v17, :cond_1c

    if-eqz v3, :cond_1c

    if-eqz v4, :cond_1c

    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/b$h;->e()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Le4/j0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Le4/j0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v4}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/c;->c0()Ljava/util/ArrayList;

    move-result-object v6

    const-string v10, "lastIn.fragment.sharedElementSourceNames"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/fragment/app/c;->c0()Ljava/util/ArrayList;

    move-result-object v10

    const-string v15, "firstOut.fragment.sharedElementSourceNames"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/fragment/app/c;->d0()Ljava/util/ArrayList;

    move-result-object v15

    move/from16 v17, v2

    const-string v2, "firstOut.fragment.sharedElementTargetNames"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    move-object/from16 v18, v5

    move-object/from16 v19, v7

    const/4 v5, 0x0

    :goto_5
    const/4 v7, -0x1

    if-ge v5, v2, :cond_9

    move/from16 v20, v2

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-eq v2, v7, :cond_8

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v2, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v20

    goto :goto_5

    :cond_9
    invoke-virtual {v4}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/c;->d0()Ljava/util/ArrayList;

    move-result-object v10

    const-string v2, "lastIn.fragment.sharedElementTargetNames"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_a

    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/c;->E()Lk2/u;

    move-result-object v2

    invoke-virtual {v4}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/fragment/app/c;->B()Lk2/u;

    move-result-object v5

    invoke-static {v2, v5}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_6

    :cond_a
    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/c;->B()Lk2/u;

    move-result-object v2

    invoke-virtual {v4}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/fragment/app/c;->E()Lk2/u;

    move-result-object v5

    invoke-static {v2, v5}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    :goto_6
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk2/u;

    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk2/u;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v15

    move/from16 v20, v7

    move-object/from16 v21, v8

    const/4 v7, 0x0

    :goto_7
    const-string v8, "enteringNames[i]"

    move/from16 v22, v11

    const-string v11, "exitingNames[i]"

    if-ge v7, v15, :cond_b

    move/from16 v23, v15

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/String;

    invoke-interface {v9, v15, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    move/from16 v11, v22

    move/from16 v15, v23

    goto :goto_7

    :cond_b
    const/4 v7, 0x2

    invoke-static {v7}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v15

    move/from16 v23, v7

    const-string v7, "FragmentManager"

    if-eqz v15, :cond_d

    const-string v15, ">>> entering view names <<<"

    invoke-static {v7, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v15

    move-object/from16 v24, v1

    move-object/from16 v25, v14

    const/4 v1, 0x0

    :goto_8
    const-string v14, "Name: "

    if-ge v1, v15, :cond_c

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v26

    add-int/lit8 v1, v1, 0x1

    move/from16 v27, v1

    move-object/from16 v1, v26

    check-cast v1, Ljava/lang/String;

    move/from16 v26, v15

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move/from16 v15, v26

    move/from16 v1, v27

    goto :goto_8

    :cond_c
    const-string v1, ">>> exiting view names <<<"

    invoke-static {v7, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v15, 0x0

    :goto_9
    if-ge v15, v1, :cond_e

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v26

    add-int/lit8 v15, v15, 0x1

    move/from16 v27, v1

    move-object/from16 v1, v26

    check-cast v1, Ljava/lang/String;

    move/from16 v26, v15

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move/from16 v15, v26

    move/from16 v1, v27

    goto :goto_9

    :cond_d
    move-object/from16 v24, v1

    move-object/from16 v25, v14

    :cond_e
    invoke-virtual {v3}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const-string v14, "firstOut.fragment.mView"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v12, v1}, Landroidx/fragment/app/b;->I(Ljava/util/Map;Landroid/view/View;)V

    invoke-virtual {v12, v6}, Lw1/a;->o(Ljava/util/Collection;)Z

    if-eqz v5, :cond_13

    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Executing exit callback for operation "

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    invoke-virtual {v5, v6, v12}, Lk2/u;->a(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_14

    :goto_a
    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v12, v1}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-nez v14, :cond_10

    invoke-virtual {v9, v1}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_10
    invoke-static {v14}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_11

    invoke-virtual {v9, v1}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v14}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v9, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    :goto_b
    if-gez v5, :cond_12

    goto :goto_c

    :cond_12
    move v1, v5

    goto :goto_a

    :cond_13
    invoke-virtual {v12}, Lw1/a;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v9, v1}, Lw1/a;->o(Ljava/util/Collection;)Z

    :cond_14
    :goto_c
    invoke-virtual {v4}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    const-string v5, "lastIn.fragment.mView"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v13, v1}, Landroidx/fragment/app/b;->I(Ljava/util/Map;Landroid/view/View;)V

    invoke-virtual {v13, v10}, Lw1/a;->o(Ljava/util/Collection;)Z

    invoke-virtual {v9}, Lw1/a;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v13, v1}, Lw1/a;->o(Ljava/util/Collection;)Z

    if-eqz v2, :cond_19

    invoke-static/range {v23 .. v23}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_15

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Executing enter callback for operation "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    invoke-virtual {v2, v10, v13}, Lk2/u;->a(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1a

    :goto_d
    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v13, v1}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-nez v5, :cond_16

    invoke-static {v9, v1}, Le4/h0;->b(Lw1/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v9, v1}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_16
    invoke-static {v5}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    invoke-static {v9, v1}, Le4/h0;->b(Lw1/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-static {v5}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v9, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    :goto_e
    if-gez v2, :cond_18

    goto :goto_f

    :cond_18
    move v1, v2

    goto :goto_d

    :cond_19
    invoke-static {v9, v13}, Le4/h0;->d(Lw1/a;Lw1/a;)V

    :cond_1a
    :goto_f
    invoke-virtual {v9}, Lw1/a;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "sharedElementNameMapping.keys"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v12, v1}, Landroidx/fragment/app/b;->J(Lw1/a;Ljava/util/Collection;)V

    invoke-virtual {v9}, Lw1/a;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "sharedElementNameMapping.values"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v13, v1}, Landroidx/fragment/app/b;->J(Lw1/a;Ljava/util/Collection;)V

    invoke-virtual {v9}, Lw1/j;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring shared elements transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v25

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " between "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->clear()V

    move/from16 v2, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v21

    move/from16 v11, v22

    move-object/from16 v1, v24

    const/4 v14, 0x0

    goto/16 :goto_4

    :cond_1b
    move-object/from16 v2, v25

    move-object v14, v2

    :goto_10
    move/from16 v2, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v21

    move/from16 v11, v22

    move-object/from16 v1, v24

    goto/16 :goto_4

    :cond_1c
    move-object/from16 v24, v1

    move/from16 v17, v2

    move-object/from16 v18, v5

    move-object/from16 v19, v7

    move-object/from16 v21, v8

    move/from16 v22, v11

    goto :goto_10

    :cond_1d
    move-object/from16 v24, v1

    move-object/from16 v18, v5

    move-object/from16 v19, v7

    move-object/from16 v21, v8

    if-nez v14, :cond_20

    invoke-interface/range {v24 .. v24}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    return-void

    :cond_1e
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v1, :cond_1f

    move-object/from16 v5, v24

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v2, v2, 0x1

    check-cast v7, Landroidx/fragment/app/b$h;

    invoke-virtual {v7}, Landroidx/fragment/app/b$h;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_21

    move-object/from16 v24, v5

    goto :goto_11

    :cond_1f
    return-void

    :cond_20
    move-object/from16 v5, v24

    :cond_21
    new-instance v1, Landroidx/fragment/app/b$g;

    move-object v2, v5

    move-object v11, v6

    move-object v6, v14

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v21

    move/from16 v14, p2

    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/b$g;-><init>(Ljava/util/List;Landroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;Le4/j0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw1/a;Lw1/a;Z)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v15, 0x0

    :goto_12
    if-ge v15, v3, :cond_22

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v15, v15, 0x1

    check-cast v4, Landroidx/fragment/app/b$h;

    invoke-virtual {v4}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroidx/fragment/app/i$d;->b(Landroidx/fragment/app/i$b;)V

    goto :goto_12

    :cond_22
    :goto_13
    return-void
.end method

.method public final I(Ljava/util/Map;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "child"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/b;->I(Ljava/util/Map;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final J(Lw1/a;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lw1/a;->entrySet()Ljava/util/Set;

    move-result-object p1

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Landroidx/fragment/app/b$i;

    invoke-direct {v0, p2}, Landroidx/fragment/app/b$i;-><init>(Ljava/util/Collection;)V

    invoke-static {p1, v0}, Lkotlin/collections/u;->J(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method

.method public final K(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/fragment/app/i$d;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/i$d;

    invoke-virtual {v0}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/i$d;

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget-object v3, v0, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget v3, v3, Landroidx/fragment/app/c$j;->c:I

    iput v3, v2, Landroidx/fragment/app/c$j;->c:I

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget-object v3, v0, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget v3, v3, Landroidx/fragment/app/c$j;->d:I

    iput v3, v2, Landroidx/fragment/app/c$j;->d:I

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget-object v3, v0, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget v3, v3, Landroidx/fragment/app/c$j;->e:I

    iput v3, v2, Landroidx/fragment/app/c$j;->e:I

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget-object v2, v0, Landroidx/fragment/app/c;->N:Landroidx/fragment/app/c$j;

    iget v2, v2, Landroidx/fragment/app/c$j;->f:I

    iput v2, v1, Landroidx/fragment/app/c$j;->f:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Ljava/util/List;Z)V
    .locals 10
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/fragment/app/i$d;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "operations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    const-string v1, "Collecting Effects"

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "operation.fragment.mView"

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/fragment/app/i$d;

    sget-object v7, Landroidx/fragment/app/i$d$b;->a:Landroidx/fragment/app/i$d$b$a;

    invoke-virtual {v6}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v8

    iget-object v8, v8, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Landroidx/fragment/app/i$d$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/i$d$b;

    move-result-object v7

    sget-object v8, Landroidx/fragment/app/i$d$b;->c:Landroidx/fragment/app/i$d$b;

    if-ne v7, v8, :cond_1

    invoke-virtual {v6}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v6

    if-eq v6, v8, :cond_1

    goto :goto_0

    :cond_2
    move-object v3, v4

    :goto_0
    check-cast v3, Landroidx/fragment/app/i$d;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroidx/fragment/app/i$d;

    sget-object v8, Landroidx/fragment/app/i$d$b;->a:Landroidx/fragment/app/i$d$b$a;

    invoke-virtual {v7}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v9

    iget-object v9, v9, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Landroidx/fragment/app/i$d$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/i$d$b;

    move-result-object v8

    sget-object v9, Landroidx/fragment/app/i$d$b;->c:Landroidx/fragment/app/i$d$b;

    if-eq v8, v9, :cond_3

    invoke-virtual {v7}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v7

    if-ne v7, v9, :cond_3

    move-object v4, v6

    :cond_4
    check-cast v4, Landroidx/fragment/app/i$d;

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Executing operations from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/b;->K(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/i$d;

    new-instance v5, Landroidx/fragment/app/b$b;

    invoke-direct {v5, v2, p2}, Landroidx/fragment/app/b$b;-><init>(Landroidx/fragment/app/i$d;Z)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Landroidx/fragment/app/b$h;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz p2, :cond_6

    if-ne v2, v3, :cond_7

    :goto_2
    move v6, v7

    goto :goto_3

    :cond_6
    if-ne v2, v4, :cond_7

    goto :goto_2

    :cond_7
    :goto_3
    invoke-direct {v5, v2, p2, v6}, Landroidx/fragment/app/b$h;-><init>(Landroidx/fragment/app/i$d;ZZ)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Le4/a;

    invoke-direct {v5, p0, v2}, Le4/a;-><init>(Landroidx/fragment/app/b;Landroidx/fragment/app/i$d;)V

    invoke-virtual {v2, v5}, Landroidx/fragment/app/i$d;->a(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_8
    invoke-virtual {p0, v1, p2, v3, v4}, Landroidx/fragment/app/b;->H(Ljava/util/List;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/i$d;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/b;->F(Ljava/util/List;)V

    return-void
.end method
