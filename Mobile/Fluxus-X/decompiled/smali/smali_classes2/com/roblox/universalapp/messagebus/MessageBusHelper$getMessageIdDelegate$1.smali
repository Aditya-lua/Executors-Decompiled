.class final synthetic Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/messagebus/MessageBusHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;

    invoke-direct {v0}, Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;->INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v3, "getMessageId"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBusHelper$getMessageIdDelegate$1;->invoke(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
