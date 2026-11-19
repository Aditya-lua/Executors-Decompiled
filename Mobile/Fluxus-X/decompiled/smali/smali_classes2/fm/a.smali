.class public final synthetic Lfm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandler;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;
    .locals 0

    invoke-static {p1}, Lfm/c;->a(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;

    move-result-object p1

    return-object p1
.end method
