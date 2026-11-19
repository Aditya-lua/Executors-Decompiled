.class public Lcom/roblox/universalapp/messagebus/Response;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public customTelemetryData:Lorg/json/JSONObject;

.field public params:Lorg/json/JSONObject;

.field public telemetryResponseCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/roblox/universalapp/messagebus/Response;->customTelemetryData:Lorg/json/JSONObject;

    const/4 v0, 0x0

    iput v0, p0, Lcom/roblox/universalapp/messagebus/Response;->telemetryResponseCode:I

    return-void
.end method
