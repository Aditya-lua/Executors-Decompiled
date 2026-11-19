.class Lcom/roblox/universalapp/messagebus/MessageBus$Holder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Holder"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;-><init>(Lcom/roblox/universalapp/messagebus/c;)V

    sput-object v0, Lcom/roblox/universalapp/messagebus/MessageBus$Holder;->INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/messagebus/MessageBus$Holder;->INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object v0
.end method
