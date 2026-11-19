.class final Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UnknownErrorAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhn/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;
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

    move-object v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhn/m;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {p1}, Lhn/m;->o()Ljava/lang/String;

    move-result-object v2

    .line 5
    const-string v3, "code"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/JsonReaderUtilsKt;->nextStringOrNull(Lhn/m;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_0
    const-string v3, "title"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/JsonReaderUtilsKt;->nextStringOrNull(Lhn/m;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p1}, Lhn/m;->Q()V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1}, Lhn/m;->d()V

    .line 11
    new-instance p1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    invoke-direct {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;)V
    .locals 2
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    .line 3
    const-string v0, "originalCode"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;->getOriginalCode()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1, v1}, Lhn/t;->Q(Ljava/lang/String;)Lhn/t;

    .line 5
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;->getTitle()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, Lhn/t;->Q(Ljava/lang/String;)Lhn/t;

    .line 7
    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;)V

    return-void
.end method
