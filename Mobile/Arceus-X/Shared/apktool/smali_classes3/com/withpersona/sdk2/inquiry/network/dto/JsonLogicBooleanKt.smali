.class public final Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lwr/i;",
        "jsonLogicEngine$delegate",
        "Ljt/h;",
        "getJsonLogicEngine",
        "()Lwr/i;",
        "jsonLogicEngine",
        "network-inquiry_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final jsonLogicEngine$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/b;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/b;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine$delegate:Ljt/h;

    return-void
.end method

.method public static synthetic a()Lwr/i;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine_delegate$lambda$0()Lwr/i;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getJsonLogicEngine()Lwr/i;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->getJsonLogicEngine()Lwr/i;

    move-result-object v0

    return-object v0
.end method

.method private static final getJsonLogicEngine()Lwr/i;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwr/i;

    return-object v0
.end method

.method private static final jsonLogicEngine_delegate$lambda$0()Lwr/i;
    .locals 3

    new-instance v0, Lwr/i$a;

    invoke-direct {v0}, Lwr/i$a;-><init>()V

    sget-object v1, Lwr/m;->a:Lwr/m;

    invoke-virtual {v1}, Lwr/m;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lwr/i$a;->d(Ljava/util/Map;)Lwr/i$a;

    move-result-object v0

    invoke-virtual {v1}, Lwr/m;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwr/i$a;->b(Ljava/util/Map;)Lwr/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lwr/i$a;->e()Lwr/i;

    move-result-object v0

    return-object v0
.end method
