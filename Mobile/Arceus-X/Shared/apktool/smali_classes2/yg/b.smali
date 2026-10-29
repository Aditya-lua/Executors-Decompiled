.class public final synthetic Lyg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkm/f$h;


# instance fields
.field public final synthetic a:Lcom/roblox/client/appsflyer/a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/appsflyer/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyg/b;->a:Lcom/roblox/client/appsflyer/a;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lyg/b;->a:Lcom/roblox/client/appsflyer/a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/appsflyer/a;->Y(Lorg/json/JSONObject;)V

    return-void
.end method
