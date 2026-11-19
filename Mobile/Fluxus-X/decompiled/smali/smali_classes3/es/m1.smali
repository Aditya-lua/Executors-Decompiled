.class public final Les/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Les/i4$a;",
        "",
        "componentName",
        "b",
        "(Les/i4$a;Ljava/lang/String;)Les/i4$a;",
        "",
        "Lqr/x5;",
        "d",
        "(Ljava/util/List;)Ljava/util/List;",
        "ui_release"
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
.method public static synthetic a(Ljava/lang/String;Lqr/i;)Z
    .locals 0

    invoke-static {p0, p1}, Les/m1;->c(Ljava/lang/String;Lqr/i;)Z

    move-result p0

    return p0
.end method

.method public static final b(Les/i4$a;Ljava/lang/String;)Les/i4$a;
    .locals 22
    .param p0    # Les/i4$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Les/i4$a;->getComponents()Ljava/util/List;

    move-result-object v2

    new-instance v3, Les/l1;

    invoke-direct {v3, v0}, Les/l1;-><init>(Ljava/lang/String;)V

    const-class v0, Lqr/i;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lsr/h;->a(Ljava/util/List;Lxu/c;Lkotlin/jvm/functions/Function1;)Lqr/x5;

    move-result-object v0

    check-cast v0, Lqr/i;

    if-nez v0, :cond_2

    return-object v1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Les/i4$a;->getComponents()Ljava/util/List;

    move-result-object v0

    sget-object v2, Les/m1$a;->a:Les/m1$a;

    const-class v3, Lqr/p5;

    invoke-static {v3}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v3

    invoke-static {v0, v3, v2}, Lsr/h;->a(Ljava/util/List;Lxu/c;Lkotlin/jvm/functions/Function1;)Lqr/x5;

    move-result-object v0

    check-cast v0, Lqr/p5;

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    new-instance v9, Les/i4$a$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v9, v0, v2, v3}, Les/i4$a$a;-><init>(Lqr/d;ILjava/lang/String;)V

    const v20, 0x3ff1f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Les/i4$a;->v(Les/i4$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Les/i4$a$d;Les/i4$a$c;Les/i4$a$a;Les/i4$b;ZZLjava/util/Map;Lqr/x5;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Les/i4$a;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Lqr/i;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lqr/i;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final d(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lqr/x5;",
            ">;)",
            "Ljava/util/List<",
            "Lqr/x5;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqr/x5;

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :goto_1
    move-object v1, v3

    goto :goto_2

    :cond_1
    instance-of v2, v1, Lqr/y5;

    if-eqz v2, :cond_3

    check-cast v1, Lqr/y5;

    invoke-interface {v1}, Lqr/y5;->getChildren()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Les/m1;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v1, v2}, Lqr/y5;->s1(Ljava/util/List;)Lqr/y5;

    move-result-object v1

    :cond_3
    :goto_2
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v0
.end method
