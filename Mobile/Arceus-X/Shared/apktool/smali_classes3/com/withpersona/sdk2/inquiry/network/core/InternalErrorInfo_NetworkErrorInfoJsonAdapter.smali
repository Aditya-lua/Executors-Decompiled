.class public final Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final booleanAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final intAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableErrorAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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


# direct methods
.method public constructor <init>(Lum/w;)V
    .locals 6
    .param p1    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lum/h;-><init>()V

    const-string v0, "code"

    const-string v1, "message"

    const-string v2, "isRecoverable"

    const-string v3, "responseError"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v4

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->options:Lum/m$b;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v5

    invoke-virtual {p1, v4, v5, v0}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->intAdapter:Lum/h;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-class v4, Ljava/lang/String;

    invoke-virtual {p1, v4, v0, v1}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableStringAdapter:Lum/h;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v2}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->booleanAdapter:Lum/h;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    invoke-virtual {p1, v1, v0, v3}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableErrorAdapter:Lum/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;
    .locals 18
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const-string v10, "code"

    const-string v11, "isRecoverable"

    if-eqz v8, :cond_7

    .line 4
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->options:Lum/m$b;

    invoke-virtual {v1, v8}, Lum/m;->F(Lum/m$b;)I

    move-result v8

    if-eq v8, v3, :cond_6

    if-eqz v8, :cond_4

    const/4 v10, 0x1

    if-eq v8, v10, :cond_3

    const/4 v10, 0x2

    if-eq v8, v10, :cond_1

    const/4 v10, 0x3

    if-eq v8, v10, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableErrorAdapter:Lum/h;

    invoke-virtual {v2, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move v2, v9

    goto :goto_0

    .line 6
    :cond_1
    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->booleanAdapter:Lum/h;

    invoke-virtual {v6, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {v11, v11, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 8
    :cond_3
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {v5, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    .line 9
    :cond_4
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->intAdapter:Lum/h;

    invoke-virtual {v4, v1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v10, v10, v1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 10
    :cond_6
    invoke-virtual {v1}, Lum/m;->M()V

    .line 11
    invoke-virtual {v1}, Lum/m;->P()V

    goto :goto_0

    .line 12
    :cond_7
    invoke-virtual {v1}, Lum/m;->d()V

    if-ne v2, v9, :cond_a

    .line 13
    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v4, :cond_9

    .line 14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eqz v6, :cond_8

    .line 15
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 16
    invoke-direct {v2, v3, v5, v1, v7}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;)V

    return-object v2

    .line 17
    :cond_8
    invoke-static {v11, v11, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 18
    :cond_9
    invoke-static {v10, v10, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 19
    :cond_a
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_b

    .line 20
    const-class v15, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    sget-object v17, Lwm/c;->c:Ljava/lang/Class;

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v13, Ljava/lang/String;

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    move-object/from16 v16, v12

    filled-new-array/range {v12 .. v17}, [Ljava/lang/Class;

    move-result-object v3

    .line 21
    const-class v8, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {v8, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 22
    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    :cond_b
    if-eqz v4, :cond_d

    if-eqz v6, :cond_c

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    .line 24
    filled-new-array/range {v4 .. v9}, [Ljava/lang/Object;

    move-result-object v1

    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 26
    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    return-object v1

    .line 27
    :cond_c
    invoke-static {v11, v11, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1

    .line 28
    :cond_d
    invoke-static {v10, v10, v1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object v1

    throw v1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 3
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->intAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableStringAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 7
    const-string v0, "isRecoverable"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->booleanAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    .line 9
    const-string v0, "responseError"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->nullableErrorAdapter:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

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
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NetworkErrorInfoJsonAdapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x38

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
