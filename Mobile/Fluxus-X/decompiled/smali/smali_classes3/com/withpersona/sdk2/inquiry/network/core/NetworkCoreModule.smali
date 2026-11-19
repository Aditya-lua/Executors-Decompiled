.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;,
        Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private certificateFingerprint:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private environmentId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final locale:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final redactAppIdentifyingInformation:Z

.field private final styleVariant:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final useServerStyle:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->useServerStyle:Z

    .line 3
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->environmentId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->locale:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->styleVariant:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->redactAppIdentifyingInformation:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->okhttpClient$lambda$0(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCertificateFingerprint$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->certificateFingerprint:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getEnvironmentId$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->environmentId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLocale$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->locale:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getRedactAppIdentifyingInformation$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->redactAppIdentifyingInformation:Z

    return p0
.end method

.method public static final synthetic access$getStyleVariant$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->styleVariant:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Lhn/w;Lmv/a0$a;)Lmv/h0;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->interceptor$lambda$10(Lhn/w;Lmv/a0$a;)Lmv/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lmv/a0$a;)Lmv/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->responseInterceptor$lambda$9(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lmv/a0$a;)Lmv/h0;

    move-result-object p0

    return-object p0
.end method

.method private static final interceptor$lambda$10(Lhn/w;Lmv/a0$a;)Lmv/h0;
    .locals 6

    const-string v0, "application/json"

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    const-string v2, ""

    const/4 v3, 0x0

    :try_start_0
    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v4

    invoke-interface {p1, v4}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v4

    goto :goto_0

    :catch_1
    move-exception v4

    goto :goto_2

    :catch_2
    move-exception v4

    goto/16 :goto_4

    :catch_3
    move-exception v4

    goto/16 :goto_6

    :goto_0
    new-instance v5, Lmv/h0$a;

    invoke-direct {v5}, Lmv/h0$a;-><init>()V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p1

    sget-object v5, Lmv/e0;->f:Lmv/e0;

    invoke-virtual {p1, v5}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v2, v3

    :goto_1
    invoke-virtual {p1, v2}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p1

    sget-object v2, Lmv/i0;->b:Lmv/i0$b;

    invoke-virtual {p0, v1}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object p0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    move-result-object v1

    invoke-virtual {p0, v1}, Lhn/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    invoke-virtual {v1, v0}, Lmv/b0$a;->a(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    invoke-virtual {v2, p0, v0}, Lmv/i0$b;->c(Ljava/lang/String;Lmv/b0;)Lmv/i0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    goto/16 :goto_8

    :goto_2
    new-instance v5, Lmv/h0$a;

    invoke-direct {v5}, Lmv/h0$a;-><init>()V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p1

    sget-object v5, Lmv/e0;->f:Lmv/e0;

    invoke-virtual {p1, v5}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    move-object v2, v3

    :goto_3
    invoke-virtual {p1, v2}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p1

    sget-object v2, Lmv/i0;->b:Lmv/i0$b;

    invoke-virtual {p0, v1}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object p0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    move-result-object v1

    invoke-virtual {p0, v1}, Lhn/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    invoke-virtual {v1, v0}, Lmv/b0$a;->a(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    invoke-virtual {v2, p0, v0}, Lmv/i0$b;->c(Ljava/lang/String;Lmv/b0;)Lmv/i0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    goto/16 :goto_8

    :goto_4
    new-instance v5, Lmv/h0$a;

    invoke-direct {v5}, Lmv/h0$a;-><init>()V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p1

    sget-object v5, Lmv/e0;->f:Lmv/e0;

    invoke-virtual {p1, v5}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_5

    :cond_2
    move-object v2, v3

    :goto_5
    invoke-virtual {p1, v2}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p1

    sget-object v2, Lmv/i0;->b:Lmv/i0$b;

    invoke-virtual {p0, v1}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object p0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    move-result-object v1

    invoke-virtual {p0, v1}, Lhn/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    invoke-virtual {v1, v0}, Lmv/b0$a;->a(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    invoke-virtual {v2, p0, v0}, Lmv/i0$b;->c(Ljava/lang/String;Lmv/b0;)Lmv/i0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    goto :goto_8

    :goto_6
    new-instance v5, Lmv/h0$a;

    invoke-direct {v5}, Lmv/h0$a;-><init>()V

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p1

    sget-object v5, Lmv/e0;->f:Lmv/e0;

    invoke-virtual {p1, v5}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_7

    :cond_3
    move-object v2, v3

    :goto_7
    invoke-virtual {p1, v2}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p1

    sget-object v2, Lmv/i0;->b:Lmv/i0$b;

    invoke-virtual {p0, v1}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object p0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    move-result-object v1

    invoke-virtual {p0, v1}, Lhn/h;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    invoke-virtual {v1, v0}, Lmv/b0$a;->a(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    invoke-virtual {v2, p0, v0}, Lmv/i0$b;->c(Ljava/lang/String;Lmv/b0;)Lmv/i0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    :goto_8
    return-object p0
.end method

.method private static final okhttpClient$lambda$0(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->certificateFingerprint:Ljava/lang/String;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final provideMoshiJsonAdapterFactory()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;->provideMoshiJsonAdapterFactory()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private static final responseInterceptor$lambda$9(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lmv/a0$a;)Lmv/h0;
    .locals 2

    invoke-interface {p2}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-interface {p2, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p2

    invoke-virtual {p2}, Lmv/h0;->o()Lmv/y;

    move-result-object v0

    const-string v1, "Persona-Organization-Id"

    invoke-virtual {v0, v1}, Lmv/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;->setOrganizationId(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Lmv/h0;->o()Lmv/y;

    move-result-object p0

    const-string v0, "Persona-Environment-Id"

    invoke-virtual {p0, v0}, Lmv/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    iput-object p0, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->environmentId:Ljava/lang/String;

    :cond_1
    return-object p2
.end method


# virtual methods
.method public final interceptor(Lhn/w;)Lmv/a0;
    .locals 1
    .param p1    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/e;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/e;-><init>(Lhn/w;)V

    return-object v0
.end method

.method public final keyInflection()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "camel"

    return-object v0
.end method

.method public final moshi(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lhn/w;
    .locals 2
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;)",
            "Lhn/w;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lhn/w$b;

    invoke-direct {v0}, Lhn/w$b;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhn/w$b;->b(Ljava/lang/Object;)Lhn/w$b;

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;->getClazz()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;->getJsonAdapter()Lhn/h;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lhn/w$b;->c(Ljava/lang/reflect/Type;Lhn/h;)Lhn/w$b;

    goto :goto_1

    :cond_1
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhn/h$e;

    invoke-virtual {v0, p2}, Lhn/w$b;->a(Lhn/h$e;)Lhn/w$b;

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lhn/w$b;->d()Lhn/w;

    move-result-object p1

    return-object p1
.end method

.method public final okhttpClient(Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lmo/k;Lmo/b;Lbq/e$a;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/d0;
    .locals 9
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lmo/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lmo/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lbq/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lmo/k;",
            "Lmo/b;",
            "Lbq/e$a;",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ")",
            "Lmv/d0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmv/d0$a;

    invoke-direct {v0}, Lmv/d0$a;-><init>()V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/b;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/c;

    invoke-direct {v2, p0}, Lcom/withpersona/sdk2/inquiry/network/core/c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/network/core/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lmv/d0$a;->k(Lmv/s;)Lmv/d0$a;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;

    move-object v3, p0

    move-object v7, p2

    move-object v4, p3

    move-object v5, p4

    move-object v2, p5

    move-object v8, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v8}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;-><init>(Lmo/b;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Landroid/content/Context;Lmo/k;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Ljava/util/Map;Lbq/e$a;)V

    invoke-virtual {v0, v1}, Lmv/d0$a;->b(Lmv/a0;)Lmv/d0$a;

    move-result-object p2

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1

    invoke-virtual {p2, v0, v1, p3}, Lmv/d0$a;->T(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;

    move-result-object p2

    invoke-virtual {p2, v0, v1, p3}, Lmv/d0$a;->W(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;

    move-result-object p2

    invoke-virtual {p2, v0, v1, p3}, Lmv/d0$a;->f(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lmv/a0;

    invoke-virtual {p2, p3}, Lmv/d0$a;->a(Lmv/a0;)Lmv/d0$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lmv/d0$a;->c()Lmv/d0;

    move-result-object p1

    return-object p1
.end method

.method public final responseInterceptor(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/a0;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/d;

    invoke-direct {v0, p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/d;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V

    return-object v0
.end method

.method public final retrofit(Ljava/lang/String;Lmv/d0;Lhn/w;)Lsw/y;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/d0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lhn/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lsw/y$b;

    invoke-direct {v0}, Lsw/y$b;-><init>()V

    invoke-virtual {v0, p2}, Lsw/y$b;->g(Lmv/d0;)Lsw/y$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lsw/y$b;->c(Ljava/lang/String;)Lsw/y$b;

    move-result-object p1

    invoke-static {p3}, Luw/a;->f(Lhn/w;)Luw/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lsw/y$b;->b(Lsw/h$a;)Lsw/y$b;

    move-result-object p1

    invoke-virtual {p1}, Lsw/y$b;->e()Lsw/y;

    move-result-object p1

    return-object p1
.end method

.method public final useServerStyles()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->useServerStyle:Z

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
