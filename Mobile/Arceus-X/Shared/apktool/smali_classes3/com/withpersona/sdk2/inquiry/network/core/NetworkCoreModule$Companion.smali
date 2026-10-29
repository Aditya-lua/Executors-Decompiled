.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideMoshiJsonAdapterFactory()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->getAdapter()Lum/h$e;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;->createAdapter()Lum/h$e;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lum/h$e;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
