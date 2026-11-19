.class public final Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;",
        ">;"
    }
.end annotation


# instance fields
.field private final intAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lhn/m$b;
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

    const-string v0, "min_dimension_size"

    const-string v1, "max_dimension_size"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhn/m$b;->a([Ljava/lang/String;)Lhn/m$b;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->options:Lhn/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-string v1, "minDimensionSize"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, v2, v0, v1}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->intAdapter:Lhn/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;
    .locals 8
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lhn/m;->b()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v2

    const-string v3, "min_dimension_size"

    const-string v4, "minDimensionSize"

    const-string v5, "max_dimension_size"

    const-string v6, "maxDimensionSize"

    if-eqz v2, :cond_5

    .line 4
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->options:Lhn/m$b;

    invoke-virtual {p1, v2}, Lhn/m;->I(Lhn/m$b;)I

    move-result v2

    const/4 v7, -0x1

    if-eq v2, v7, :cond_4

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->intAdapter:Lhn/h;

    invoke-virtual {v1, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v6, v5, p1}, Ljn/c;->x(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->intAdapter:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v4, v3, p1}, Ljn/c;->x(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    .line 9
    :cond_4
    invoke-virtual {p1}, Lhn/m;->O()V

    .line 10
    invoke-virtual {p1}, Lhn/m;->Q()V

    goto :goto_0

    .line 11
    :cond_5
    invoke-virtual {p1}, Lhn/m;->d()V

    .line 12
    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;

    if-eqz v0, :cond_7

    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v1, :cond_6

    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 15
    invoke-direct {v2, v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;-><init>(II)V

    return-object v2

    .line 16
    :cond_6
    invoke-static {v6, v5, p1}, Ljn/c;->o(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    .line 17
    :cond_7
    invoke-static {v4, v3, p1}, Ljn/c;->o(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;)V
    .locals 2
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    .line 3
    const-string v0, "min_dimension_size"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->intAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;->getMinDimensionSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 5
    const-string v0, "max_dimension_size"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    .line 6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->intAdapter:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;->getMaxDimensionSize()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x71

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
