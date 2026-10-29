.class public Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;->c:Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    return-void
.end method
