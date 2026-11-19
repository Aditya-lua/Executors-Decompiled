.class public final synthetic Lwm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lwm/f;


# direct methods
.method public synthetic constructor <init>(Lwm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm/b;->a:Lwm/f;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lwm/b;->a:Lwm/f;

    invoke-static {v0, p1}, Lwm/f;->c(Lwm/f;Lorg/json/JSONObject;)V

    return-void
.end method
