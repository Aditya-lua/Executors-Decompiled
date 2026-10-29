.class public final Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;",
        "Lum/w;",
        "moshi",
        "<init>",
        "(Lum/w;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lum/m;",
        "reader",
        "a",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;",
        "Lum/t;",
        "writer",
        "value_",
        "",
        "b",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;)V",
        "Lum/m$b;",
        "Lum/m$b;",
        "options",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;",
        "Lum/h;",
        "dataAdapter",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;",
        "c",
        "metaAdapter",
        "Ljava/lang/reflect/Constructor;",
        "d",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "document_release"
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
.field public final a:Lum/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile d:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
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

    const-string v0, "data"

    const-string v1, "meta"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lum/m$b;->a([Ljava/lang/String;)Lum/m$b;

    move-result-object v2

    const-string v3, "of(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->a:Lum/m$b;

    const-class v2, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1, v2, v3, v0}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object v0

    const-string v2, "adapter(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->b:Lum/h;

    const-class v0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1, v0, v3, v1}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->c:Lum/h;

    return-void
.end method


# virtual methods
.method public a(Lum/m;)Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;
    .locals 9
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lum/m;->b()V

    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Lum/m;->f()Z

    move-result v5

    const/4 v6, -0x2

    const-string v7, "meta"

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->a:Lum/m$b;

    invoke-virtual {p1, v5}, Lum/m;->F(Lum/m$b;)I

    move-result v5

    if-eq v5, v1, :cond_4

    if-eqz v5, :cond_2

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->c:Lum/h;

    invoke-virtual {v4, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v7, v7, p1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1

    :cond_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->b:Lum/h;

    invoke-virtual {v2, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    if-eqz v3, :cond_3

    move v2, v6

    goto :goto_0

    :cond_3
    const-string v0, "data_"

    const-string v1, "data"

    invoke-static {v0, v1, p1}, Lwm/c;->x(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1

    :cond_4
    invoke-virtual {p1}, Lum/m;->M()V

    invoke-virtual {p1}, Lum/m;->P()V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lum/m;->d()V

    if-ne v2, v6, :cond_7

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;

    const-string v1, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.Data"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v4, :cond_6

    invoke-direct {v0, v3, v4}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V

    return-object v0

    :cond_6
    invoke-static {v7, v7, p1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->d:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_8

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v5, Lwm/c;->c:Ljava/lang/Class;

    const-class v6, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    const-class v8, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    filled-new-array {v6, v8, v1, v5}, [Ljava/lang/Class;

    move-result-object v1

    const-class v5, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->d:Ljava/lang/reflect/Constructor;

    const-string v5, "also(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    if-eqz v4, :cond_9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v3, v4, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;

    return-object p1

    :cond_9
    invoke-static {v7, v7, p1}, Lwm/c;->o(Ljava/lang/String;Ljava/lang/String;Lum/m;)Lum/j;

    move-result-object p1

    throw p1
.end method

.method public b(Lum/t;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->b:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->a()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    const-string v0, "meta"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->c:Lum/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->b()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->a(Lum/m;)Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;->b(Lum/t;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "SubmitDocumentRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
