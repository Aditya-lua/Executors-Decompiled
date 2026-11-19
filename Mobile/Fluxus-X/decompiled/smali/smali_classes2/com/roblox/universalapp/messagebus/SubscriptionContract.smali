.class public Lcom/roblox/universalapp/messagebus/SubscriptionContract;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final callImmediatelyIfAvailable:Z

.field private final callback:Lcom/roblox/universalapp/messagebus/NewCallback;

.field private final disconnectAfterReceive:Z

.field private final domain:Ljava/lang/String;

.field private final mid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewCallback;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->mid:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->domain:Ljava/lang/String;

    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->disconnectAfterReceive:Z

    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callImmediatelyIfAvailable:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewCallback;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->mid:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    .line 16
    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->domain:Ljava/lang/String;

    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->disconnectAfterReceive:Z

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callImmediatelyIfAvailable:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewCallback;Ljava/lang/String;Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->mid:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    .line 10
    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->domain:Ljava/lang/String;

    .line 11
    iput-boolean p4, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->disconnectAfterReceive:Z

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callImmediatelyIfAvailable:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewCallback;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->mid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    .line 4
    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->domain:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->disconnectAfterReceive:Z

    .line 6
    iput-boolean p5, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callImmediatelyIfAvailable:Z

    return-void
.end method


# virtual methods
.method public final getCallImmediatelyIfAvailable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callImmediatelyIfAvailable:Z

    return v0
.end method

.method public final getCallback()Lcom/roblox/universalapp/messagebus/NewCallback;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    return-object v0
.end method

.method public final getDisconnectAfterReceive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->disconnectAfterReceive:Z

    return v0
.end method

.method public final getDomain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->domain:Ljava/lang/String;

    return-object v0
.end method

.method public final getMid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->mid:Ljava/lang/String;

    return-object v0
.end method
