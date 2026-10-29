.class public Lbm/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbm/t$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm/r;->r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public final synthetic b:Lbm/r;


# direct methods
.method public constructor <init>(Lbm/r;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbm/r$b;->b:Lbm/r;

    iput-object p2, p0, Lbm/r$b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lbm/r$b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v1, p0, Lbm/r$b;->b:Lbm/r;

    invoke-virtual {v1, p1, p2}, Lbm/r;->g(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "Credentials.getCredentialsResponse"

    invoke-virtual {v0, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lbm/r$b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v1, p0, Lbm/r$b;->b:Lbm/r;

    invoke-static {v1, p1, p2}, Lbm/r;->e(Lbm/r;ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "Credentials.getCredentialsResponse"

    invoke-virtual {v0, p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
