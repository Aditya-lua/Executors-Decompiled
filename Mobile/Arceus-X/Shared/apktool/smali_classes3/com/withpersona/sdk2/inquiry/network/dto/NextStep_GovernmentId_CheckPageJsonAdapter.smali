.class public final Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;",
        "Lum/w;",
        "moshi",
        "<init>",
        "(Lum/w;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;)V",
        "Lum/m$b;",
        "options",
        "Lum/m$b;",
        "stringAdapter",
        "Lum/h;",
        "nullableStringAdapter",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
        "network-inquiry_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nullableStringAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lum/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stringAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lum/w;)V
    .locals 4
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v0, "navBarTitle"

    const-string v1, "btnSubmit"

    const-string v2, "btnRetake"

    const-string v3, "titleConfirmCapture"

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->options:Lum/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-string v1, "buttonSubmit"

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    const-string v1, "adapter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->stringAdapter:Lum/h;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v2, v0, v3}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->nullableStringAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;
    .locals 20
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lum/m;->b()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move v2, v3

    .line 3
    :goto_0
    invoke-virtual {v1}, Lum/m;->f()Z

    move-result v8

    const/16 v9, -0x9

    const-string v10, "btnSubmit"

    const-string v11, "buttonSubmit"

    const-string v12, "btnRetake"

    const-string v13, "buttonRetake"

    if-eqz v8, :cond_7

    .line 4
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->options:Lum/m$b;

    invoke-virtual {v1, v8}, Lum/m;->F(Lum/m$b;)I

    move-result v8

    if-eq v8, v3, :cond_6

    if-eqz v8, :cond_4

    const/4 v10, 0x1

    if-eq v8, v10, :cond_2

    const/4 v10, 0x2

    if-eq v8, v10, :cond_1

    const/4 v10, 0x3

    if-eq v8, v10, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    move v2, v9

    goto :goto_0

    .line 6
    :cond_1
    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v6, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_2
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->stringAdapter:Lum/h;

    invoke-virtual {v5, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v13, v12, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 9
    :cond_4
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->stringAdapter:Lum/h;

    invoke-virtual {v4, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    goto :goto_0

    .line 10
    :cond_5
    invoke-static {v11, v10, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 11
    :cond_6
    invoke-virtual {v1}, Lum/m;->M()V

    .line 12
    invoke-virtual {v1}, Lum/m;->P()V

    goto :goto_0

    .line 13
    :cond_7
    invoke-virtual {v1}, Lum/m;->d()V

    if-ne v2, v9, :cond_a

    .line 14
    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;

    if-eqz v4, :cond_9

    if-eqz v5, :cond_8

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 15
    :cond_8
    invoke-static {v13, v12, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 16
    :cond_9
    invoke-static {v11, v10, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 17
    :cond_a
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_b

    .line 18
    sget-object v18, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 19
    sget-object v19, Lwm/c;->c:Ljava/lang/Class;

    const-class v14, Ljava/lang/String;

    const-class v15, Ljava/lang/String;

    const-class v16, Ljava/lang/String;

    const-class v17, Ljava/lang/String;

    filled-new-array/range {v14 .. v19}, [Ljava/lang/Class;

    move-result-object v3

    .line 20
    const-class v8, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;

    invoke-virtual {v8, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 21
    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v8, "also(...)"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    if-eqz v4, :cond_d

    if-eqz v5, :cond_c

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    .line 23
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Object;

    move-result-object v1

    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 25
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;

    return-object v1

    :cond_c
    invoke-static {v13, v12, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 26
    :cond_d
    invoke-static {v11, v10, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "btnSubmit"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->stringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;->getButtonSubmit()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "btnRetake"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->stringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;->getButtonRetake()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "titleConfirmCapture"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;->getTitleConfirmCapture()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 9
    const-string v0, "navBarTitle"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;->getNavBarTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CheckPageJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x35

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "NextStep.GovernmentId.CheckPage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
