.class public final Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BAD_GATEWAY_502:I = 0x1f6

.field private static final CLIENT_ERRORS:Lkotlin/ranges/IntRange;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final CONFLICT_409:I = 0x199

.field public static final INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final NETWORK_ERROR_0:I = 0x0

.field public static final NOT_FOUND_404:I = 0x194

.field public static final PAYLOAD_TOO_LARGE_413:I = 0x19d

.field private static final SERVER_ERRORS:Lkotlin/ranges/IntRange;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TOO_MANY_REQUESTS_429:I = 0x1ad

.field public static final UNAUTHORIZED_401:I = 0x191

.field public static final UNPROCESSABLE_ENTITY_422:I = 0x1a6


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;

    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0x190

    const/16 v2, 0x1f3

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->CLIENT_ERRORS:Lkotlin/ranges/IntRange;

    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0x1f4

    const/16 v2, 0x257

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->SERVER_ERRORS:Lkotlin/ranges/IntRange;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCLIENT_ERRORS()Lkotlin/ranges/IntRange;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->CLIENT_ERRORS:Lkotlin/ranges/IntRange;

    return-object v0
.end method

.method public final getSERVER_ERRORS()Lkotlin/ranges/IntRange;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->SERVER_ERRORS:Lkotlin/ranges/IntRange;

    return-object v0
.end method
