.class public Lcom/roblox/universalapp/messagebus/MessageBus$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;-><init>(Lmm/e;)V

    sput-object v0, Lcom/roblox/universalapp/messagebus/MessageBus$d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/messagebus/MessageBus$d;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object v0
.end method
