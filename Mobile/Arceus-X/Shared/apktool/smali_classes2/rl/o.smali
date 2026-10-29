.class public final synthetic Lrl/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lrl/p;


# direct methods
.method public synthetic constructor <init>(Lrl/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl/o;->a:Lrl/p;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lrl/o;->a:Lrl/p;

    invoke-static {v0, p1}, Lrl/p;->b(Lrl/p;Lorg/json/JSONObject;)V

    return-void
.end method
