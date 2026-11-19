.class public final Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final options:Lhn/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stringAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/w;)V
    .locals 3
    .param p1    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lhn/h;-><init>()V

    const-string v0, "message"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhn/m$b;->a([Ljava/lang/String;)Lhn/m$b;

    move-result-object v1

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->options:Lhn/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v1, v0}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;
    .locals 6
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lhn/m;->b()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v4

    const/4 v5, -0x2

    if-eqz v4, :cond_3

    .line 4
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->options:Lhn/m$b;

    invoke-virtual {p1, v4}, Lhn/m;->I(Lhn/m$b;)I

    move-result v4

    if-eq v4, v1, :cond_2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    invoke-virtual {v2, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_1

    move v2, v5

    goto :goto_0

    .line 6
    :cond_1
    const-string v0, "message"

    invoke-static {v0, v0, p1}, Ljn/c;->x(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    .line 7
    :cond_2
    invoke-virtual {p1}, Lhn/m;->O()V

    .line 8
    invoke-virtual {p1}, Lhn/m;->Q()V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p1}, Lhn/m;->d()V

    if-ne v2, v5, :cond_4

    .line 10
    new-instance p1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    invoke-direct {p1, v3}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 11
    :cond_4
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_5

    .line 12
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v1, Ljn/c;->c:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    filled-new-array {v4, p1, v1}, [Ljava/lang/Class;

    move-result-object p1

    .line 13
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 15
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 16
    filled-new-array {v3, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;)V
    .locals 1
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    .line 3
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter(InternalErrorInfo.NoDiskSpaceErrorInfo)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
