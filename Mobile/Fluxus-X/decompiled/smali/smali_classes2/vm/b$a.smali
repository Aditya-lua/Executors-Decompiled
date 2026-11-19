.class public Lvm/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm/b;->l(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvm/b;


# direct methods
.method public constructor <init>(Lvm/b;)V
    .locals 0

    iput-object p1, p0, Lvm/b$a;->a:Lvm/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lorg/json/JSONObject;)V
    .locals 7

    iget-object p1, p0, Lvm/b$a;->a:Lvm/b;

    invoke-virtual {p1}, Lvm/b;->k()Z

    move-result p1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "supportsHaptics"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lvm/b$a;->a:Lvm/b;

    invoke-static {p1}, Lvm/b;->a(Lvm/b;)Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const-string v6, "{}"

    const-string v2, "HapticProtocol"

    const-string v3, "SupportsHaptics"

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :catch_0
    const-string p1, "HapticProtocol"

    const-string v0, "Failed to write supportsHaptics in response to SupportsHaptics request"

    invoke-static {p1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
