.class public final synthetic Lym/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandler;


# instance fields
.field public final synthetic a:Lym/g;


# direct methods
.method public synthetic constructor <init>(Lym/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym/c;->a:Lym/g;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;
    .locals 1

    iget-object v0, p0, Lym/c;->a:Lym/g;

    invoke-virtual {v0, p1}, Lym/g;->K(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;

    move-result-object p1

    return-object p1
.end method
