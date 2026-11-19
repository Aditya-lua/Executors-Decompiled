.class public final synthetic Lcom/roblox/universalapp/messagebus/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/NewRawCallback;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/messagebus/NewCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/NewCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/a;->a:Lcom/roblox/universalapp/messagebus/NewCallback;

    return-void
.end method


# virtual methods
.method public final run(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/a;->a:Lcom/roblox/universalapp/messagebus/NewCallback;

    invoke-static {v0, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->a(Lcom/roblox/universalapp/messagebus/NewCallback;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
