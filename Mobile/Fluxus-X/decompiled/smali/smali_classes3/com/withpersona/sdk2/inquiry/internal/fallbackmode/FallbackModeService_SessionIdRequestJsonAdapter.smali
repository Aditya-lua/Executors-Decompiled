.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0017\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;",
        "Lhn/h;",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;",
        "Lhn/w;",
        "moshi",
        "<init>",
        "(Lhn/w;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhn/m;",
        "reader",
        "a",
        "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;",
        "Lhn/t;",
        "writer",
        "value_",
        "",
        "b",
        "(Lhn/t;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;)V",
        "Lhn/m$b;",
        "Lhn/m$b;",
        "options",
        "Lhn/h;",
        "stringAdapter",
        "c",
        "nullableStringAdapter",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;",
        "d",
        "nullableInquiryFieldMapAdapter",
        "inquiry-internal_release"
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
.field public final a:Lhn/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lhn/h;
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

.field public final c:Lhn/h;
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

.field public final d:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/w;)V
    .locals 10
    .param p1    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lhn/h;-><init>()V

    const-string v8, "fields"

    const-string v9, "theme-set-id"

    const-string v1, "inquiry-template-id"

    const-string v2, "inquiry-template-version-id"

    const-string v3, "inquiry-id"

    const-string v4, "reference-id"

    const-string v5, "account-id"

    const-string v6, "environment"

    const-string v7, "environment-id"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhn/m$b;->a([Ljava/lang/String;)Lhn/m$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->a:Lhn/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-string v1, "inquiryTemplateId"

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object v0

    const-string v1, "adapter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->b:Lhn/h;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-string v3, "inquiryTemplateVersion"

    invoke-virtual {p1, v2, v0, v3}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    const-string v2, "fields"

    const-class v3, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    invoke-virtual {p1, v3, v0, v2}, Lhn/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhn/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->d:Lhn/h;

    return-void
.end method


# virtual methods
.method public a(Lhn/m;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;
    .locals 13
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhn/m;->b()V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v0

    const-string v11, "inquiry-template-id"

    const-string v12, "inquiryTemplateId"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->a:Lhn/m$b;

    invoke-virtual {p1, v0}, Lhn/m;->I(Lhn/m$b;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->d:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->b:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v12, v11, p1}, Ljn/c;->x(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    :pswitch_9
    invoke-virtual {p1}, Lhn/m;->O()V

    invoke-virtual {p1}, Lhn/m;->Q()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lhn/m;->d()V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;

    if-eqz v2, :cond_2

    invoke-direct/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {v12, v11, p1}, Ljn/c;->o(Ljava/lang/String;Ljava/lang/String;Lhn/m;)Lhn/j;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lhn/t;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;)V
    .locals 2
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    const-string v0, "inquiry-template-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->b:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "inquiry-template-version-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "inquiry-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "reference-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "account-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "environment-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "fields"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->d:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->d()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    const-string v0, "theme-set-id"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->c:Lhn/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->a(Lhn/m;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;->b(Lhn/t;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FallbackModeService.SessionIdRequest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
