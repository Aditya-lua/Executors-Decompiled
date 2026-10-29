.class public final synthetic Lrm/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/k;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lrm/k;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-static {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->q(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;Lorg/json/JSONObject;)V

    return-void
.end method
