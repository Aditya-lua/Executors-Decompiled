.class public final synthetic Lim/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lim/f;


# direct methods
.method public synthetic constructor <init>(Lim/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim/d;->a:Lim/f;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lim/d;->a:Lim/f;

    invoke-static {v0, p1}, Lim/f;->a(Lim/f;Lorg/json/JSONObject;)V

    return-void
.end method
