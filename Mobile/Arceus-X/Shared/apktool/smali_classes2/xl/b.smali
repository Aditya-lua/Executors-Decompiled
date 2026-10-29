.class public final synthetic Lxl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lxl/g;


# direct methods
.method public synthetic constructor <init>(Lxl/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/b;->a:Lxl/g;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lxl/b;->a:Lxl/g;

    invoke-static {v0, p1}, Lxl/g;->f(Lxl/g;Lorg/json/JSONObject;)V

    return-void
.end method
