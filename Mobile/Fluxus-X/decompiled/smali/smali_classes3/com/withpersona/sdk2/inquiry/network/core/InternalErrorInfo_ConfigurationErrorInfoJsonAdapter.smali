.class public final Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;",
        ">;"
    }
.end annotation


# instance fields
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

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->options:Lhn/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v1, v0}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;
    .locals 4
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lhn/m;->b()V

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v1

    const-string v2, "message"

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->options:Lhn/m$b;

    invoke-virtual {p1, v1}, Lhn/m;->I(Lhn/m$b;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    if-eqz v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v2, v2, p1}, Ljn/c;->x(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

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

    .line 10
    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    if-eqz v0, :cond_4

    .line 11
    invoke-direct {v1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 12
    :cond_4
    invoke-static {v2, v2, p1}, Ljn/c;->o(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;)V
    .locals 1
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;
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
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->stringAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;->getMessage()Ljava/lang/String;

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
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_ConfigurationErrorInfoJsonAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter(InternalErrorInfo.ConfigurationErrorInfo)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
