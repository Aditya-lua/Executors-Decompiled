.class public final synthetic Lcom/roblox/universalapp/messagebus/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/ResponseCallback;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/messagebus/MessageBus$3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus$3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus$3;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/b;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run(Lcom/roblox/universalapp/messagebus/Response;)V
    .locals 4

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus$3;

    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/universalapp/messagebus/b;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/universalapp/messagebus/b;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus$3;->a(Lcom/roblox/universalapp/messagebus/MessageBus$3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Response;)V

    return-void
.end method
