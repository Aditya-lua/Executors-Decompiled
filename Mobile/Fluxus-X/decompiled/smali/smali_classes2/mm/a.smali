.class public final synthetic Lmm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandler;


# instance fields
.field public final synthetic a:Lmm/c;


# direct methods
.method public synthetic constructor <init>(Lmm/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmm/a;->a:Lmm/c;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;
    .locals 1

    iget-object v0, p0, Lmm/a;->a:Lmm/c;

    invoke-static {v0, p1}, Lmm/c;->a(Lmm/c;Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;

    move-result-object p1

    return-object p1
.end method
